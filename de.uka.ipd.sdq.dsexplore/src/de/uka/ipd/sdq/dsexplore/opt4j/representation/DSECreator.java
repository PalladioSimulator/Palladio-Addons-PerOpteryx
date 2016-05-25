package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.MatchResource;
import org.eclipse.emf.compare.impl.ComparisonImpl;
import org.eclipse.emf.compare.internal.spec.ComparisonSpec;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ecore.delegate.OCLSettingDelegate.Changeable;
import org.opt4j.core.problem.Creator;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.allocation.AllocationFactory;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyContextImpl;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.impl.RepositoryImpl;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourceenvironment.impl.ResourceContainerImpl;
import org.palladiosimulator.pcm.system.impl.SystemImpl;
import org.palladiosimulator.solver.models.PCMInstance;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.helper.FixGDOFReferenceSwitch;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;

/**
 * The {@link DSECreator} is responsible for randomly creating genotypes 
 * in the solution space. It can query the {@link DSEProblem} for the 
 * available design space.
 *  
 * @author Anne
 *
 */
public class DSECreator implements Creator<DesignDecisionGenotype> {

	private DSEProblem problem;
	private Random random;
	
	
	private int numberOfNotEvaluatedPredefinedOnes;

	@Inject
	public DSECreator(){
		//XXX like this you can only set the problem once. Maybe dont save the reference. 
		this.problem = Opt4JStarter.getProblem();
		this.random = new Random();
		this.numberOfNotEvaluatedPredefinedOnes = this.problem.getInitialGenotypeList().size();
	}
	

	@Override
	public DesignDecisionGenotype create() {
		
		if (this.numberOfNotEvaluatedPredefinedOnes > 0){
			DesignDecisionGenotype genome = this.problem.getInitialGenotypeList().get(this.problem.getInitialGenotypeList().size()-this.numberOfNotEvaluatedPredefinedOnes);
			numberOfNotEvaluatedPredefinedOnes --;
			return genome;

		}
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		
		List<DegreeOfFreedomInstance> degrees = problem.getDesignDecisions();
		for (DegreeOfFreedomInstance DegreeOfFreedomInstance : degrees) {
			genotype.add(createRandomChoice(DegreeOfFreedomInstance));
		}
		
		return genotype;
	}


	private int createIntegerValue(DiscreteDegree discDegree) {

		if (discDegree instanceof DiscreteRangeDegree){
			DiscreteRangeDegree dicRangeDegree = (DiscreteRangeDegree)discDegree;
			int range = dicRangeDegree.getTo() - dicRangeDegree.getFrom();
			if (!dicRangeDegree.isLowerBoundIncluded()) range--;
			if (!dicRangeDegree.isUpperBoundIncluded()) range--;
			//random.nextInt creates a random value between 0 <= x < param. I want one 0 <= x <= range. Thus, I add  1  
			int value = dicRangeDegree.getFrom() + this.random.nextInt(range+1);
			return value;
		} else if (discDegree instanceof OrderedIntegerDegree){
			OrderedIntegerDegree orderedIntegerDegree = (OrderedIntegerDegree) discDegree;
			int randomIndex = this.random.nextInt(orderedIntegerDegree.getListOfIntegers().size());
			return orderedIntegerDegree.getListOfIntegers().get(randomIndex);
		} else throw new RuntimeException("Unknown degree "+discDegree.getClass().getName());

	}


	private double createDoubleValue(ContinuousRangeDegree contDegree) {
		double lowerMargin = 0;
		if (contDegree.isLowerBoundIncluded()){
			lowerMargin = Double.MIN_VALUE;
		}
		double upperMargin = 0;
		if (contDegree.isUpperBoundIncluded()){
			upperMargin = Double.MIN_VALUE;
		}
		double factor = contDegree.getTo() - upperMargin - contDegree.getFrom() - lowerMargin;


		return contDegree.getFrom() + lowerMargin + this.random.nextDouble()*factor;

	}



	public Choice createRandomChoice(DegreeOfFreedomInstance degree) {
		designdecisionFactory factory = designdecisionFactoryImpl.init();
		
		Choice choice;
		if (degree instanceof DiscreteDegree) {
			DiscreteRangeChoice discChoice = factory.createDiscreteRangeChoice();
			discChoice.setChosenValue(createIntegerValue((DiscreteDegree) degree));
			choice = discChoice;
		} else if (degree instanceof ContinuousRangeDegree) {
			ContinousRangeChoice contChoice = factory.createContinousRangeChoice();
			contChoice.setChosenValue(createDoubleValue((ContinuousRangeDegree) degree));
			choice = contChoice;
		} else if (degree instanceof ClassDegree) {
			ClassChoice enumChoice = factory.createClassChoice();
			enumChoice.setChosenValue(createRandomEntity((ClassDegree) degree));
			choice = enumChoice;
		} else if (degree.getDof() != null) {
			Object chosenValue = createRandomValue(degree);
			if (chosenValue instanceof EObject) {
				ClassChoice classChoice = factory.createClassChoice();
				classChoice.setChosenValue((EObject)chosenValue);
				choice = classChoice;
			} else if (chosenValue instanceof Double) {
				ContinousRangeChoice continuousNumberChoice = factory.createContinousRangeChoice();
				continuousNumberChoice.setChosenValue(((Double) chosenValue).doubleValue());
				choice = continuousNumberChoice;
			} else if (chosenValue instanceof Integer) {
				DiscreteRangeChoice integerNumberChoice = factory.createDiscreteRangeChoice();
				integerNumberChoice.setChosenValue(((Integer) chosenValue).intValue());
				choice = integerNumberChoice;
			} else {
				throw new RuntimeException("Cannot handle choice returned by GDoF transformation " + chosenValue.getClass().getName());
			}
		} else {
			throw new RuntimeException("Unknown degree " + degree.getClass().getName());
		}
		choice.setDegreeOfFreedomInstance(degree);
		return choice;
	}


	@SuppressWarnings("restriction")
	private Object createRandomValue(DegreeOfFreedomInstance degree) {

		org.eclipse.emf.compare.Comparison com = null;
		for(EObject obj :degree.getDecoratorModel()) {
			if (obj instanceof ComparisonImpl) {
				com = (ComparisonSpec) obj;
			}
		}
		
		
    	if (com != null) {
	    	mergeModels(degree, com);
    	}
		
		Collection<Object> possibleValues = GenomeToCandidateModelTransformation.valueRuleForCollection(
				degree.getDof().getPrimaryChangeable(),
			degree.getPrimaryChanged(), 
				GenomeToCandidateModelTransformation.getPCMRootElements(Opt4JStarter.getProblem().getInitialInstance()));
		
		if (possibleValues instanceof Collection<?>) {
			possibleValues = checkForNewObject(possibleValues);
		}
		
		
		List<Object> list;
		if (possibleValues instanceof List)
		  list = (List<Object>)possibleValues;
		else
		  list = new ArrayList<Object>(possibleValues);
		
		int index = this.random.nextInt(list.size());
		
		
		
		return list.get(index);
	}


	private void mergeModels(DegreeOfFreedomInstance degree, org.eclipse.emf.compare.Comparison com) {
		//org.eclipse.emf.compare.Comparison com = (ComparisonSpec) diffMerge.get("left");
		EObject prim = degree.getPrimaryChanged();
		EObject repo = null;
		EObject sys = null;
		if (prim instanceof AssemblyContextImpl) {
			AssemblyContext ac = (AssemblyContext)prim;
			repo = ac.getEncapsulatedComponent__AssemblyContext().getRepository__RepositoryComponent();
			sys = ac.getParentStructure__AssemblyContext();
		}
		
		sys = problem.getInitialInstance().getSystem();
		
		EList<MatchResource> matches = com.getMatchedResources();
		EList<Match> match = com.getMatches();
		for (Match m : match) {
			//set system of instance to merge to actual system
			if (m.getLeft() instanceof SystemImpl) {
				m.setRight(sys);
			}
			
			
			if (m.getRight() == null) {
				if (m.getLeft() instanceof RepositoryImpl) {
					m.setRight(repo);
				}
			}
		}
		
		for (int i = 0; i < matches.size(); i++) {
			EObject left = match.get(i).getLeft();
			EObject right = match.get(i).getRight();
			matches.get(i).setLeft(match.get(i).getLeft().eResource());
			if (right != null) matches.get(i).setRight(match.get(i).getRight().eResource());
		}
		
		Iterator<Diff> diff = com.getDifferences().iterator();
		while (diff.hasNext()) {
			diff.next().copyLeftToRight();
		}
		
		for (Match m: com.getMatches()) {
			if (m.getRight() instanceof SystemImpl){
				
				
			} else if (m.getRight() instanceof RepositoryImpl) {
				
			}
		}
		
		//remove decorator to prevent ID Failure
//	    	dofi.getDecoratorModel().remove(com);
		//:::::
	}

	/**
	 * TODO adapt for more elements
	 * 
	 * This method creates a new object or an interval from a set of elements or numbers which was defined in ocl
	 * The key word to indicate a new object is "Class::[ObjecName]"
	 * The key work to indicate a interval is "interval" 
	 * @param possibleValues the set returned from the ocl query
	 * @return the collection with the new created objects if there was a object set, the input parameter otherwise
	 */
	private Collection<Object> checkForNewObject(Collection<Object> possibleValues) {
		Collection<Object> newPossibleValues = new ArrayList<>();
		
		for (Object list : possibleValues) {
			if (list instanceof Collection<?>) {
				Collection<?> newObjectValues = new ArrayList<>();
				newObjectValues = (Collection<?>) list;
				for (Object o : newObjectValues) {
					if (o.toString().startsWith("Class::")) {
						String className = o.toString().replace("Class::", "");
						if (className.equals("AllocationContext")) {
							AllocationContext newAC = AllocationFactory.eINSTANCE.createAllocationContext();
							for (Object value : newObjectValues) {
								if (value instanceof AssemblyContextImpl) {
									newAC.setAssemblyContext_AllocationContext((AssemblyContext)value);
								} else if (value instanceof String && !value.equals(o)) {
									if (!value.equals("")) {
										newAC.setId((String)value);
									} else {
										String newId = new BigInteger(110, random).toString(25);
								    	newId = '_'+newId;
								    	newAC.setId(newId);
									}
									
								} else if (value instanceof ResourceContainerImpl) {
									newAC.setResourceContainer_AllocationContext((ResourceContainer)value);
								}
							}
							newAC.setEntityName("Allocation_"+newAC.getAssemblyContext_AllocationContext().getEntityName().toString());
							newPossibleValues.add(newAC);
						}
					} 
				}
			} else if (list.toString().startsWith("interval")) {
				double min = 0;
				double max = 0;
				double steps = 0;
				for (Object val : possibleValues) {
					if (val.toString().startsWith("minValue")) {
						min = Double.parseDouble((val.toString().replace("minValue:", "")));
					} else if (val.toString().startsWith("maxValue")) {
						max = Double.parseDouble((val.toString().replace("maxValue:", "")));
					} else if (val.toString().startsWith("steps")) {
						steps = Double.parseDouble((val.toString().replace("steps:", "")));
					}
				}
				double value = min;
				while(value <= max) {
					value = Math.ceil(value);
					int intValue = (int)value;
					newPossibleValues.add(intValue);
					value += steps;
				}
				break;
			}
		}
		if (newPossibleValues.isEmpty()) return possibleValues;
		return newPossibleValues;
		
	}


	private EObject createRandomEntity(ClassDegree enumDegree) {
		List<EObject> domain = enumDegree.getClassDesignOptions();
		int index = this.random.nextInt(domain.size()); 
		return domain.get(index);

	}
	
	public void setNumberOfNotEvaluatedPredefinedOnes(
			int numberOfNotEvaluatedPredefinedOnes) {
		this.numberOfNotEvaluatedPredefinedOnes = numberOfNotEvaluatedPredefinedOnes;
	}
	
	public int getNumberOfNotEvaluatedPredefinedOnes(){
		return this.numberOfNotEvaluatedPredefinedOnes;
	}
}
