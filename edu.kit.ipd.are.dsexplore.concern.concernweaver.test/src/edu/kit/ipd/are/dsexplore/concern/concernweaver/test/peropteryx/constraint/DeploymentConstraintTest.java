package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.constraint;

import static org.junit.Assert.fail;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.dsexplore.constraints.ConcernDeploymentConstraint;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;

public class DeploymentConstraintTest extends WeavingTest {

	protected DesignDecisionGenotype genotype;
	protected boolean result;
	
	@Before
	public void setUp() {
		
		ConcernDeploymentConstraint.setConcernManager(ConcernManager.getBy(concern.getConcerns().get(0)), pcmToAdapt.getRepositories());
		
	}

	private List<ResourceContainer> getAllResourceContainer() {
		
		return pcmToAdapt.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
		
	}
	
	protected List<AllocationContext> getAllPcmAllocationContexts() {
		
		return pcmToAdapt.getAllocation().getAllocationContexts_Allocation();
		
	}
	
	protected ResourceContainer getFirstResourceContainer() {
		
		return checkPrecondtion(getAllResourceContainer()).get(0);
		
	}
	
	protected ResourceContainer getSecondResourceContainer() {
		
		return checkPrecondtion(getAllResourceContainer()).get(1);
		
	}
	
	private List<ResourceContainer> checkPrecondtion(List<ResourceContainer> allPcmResourceContainer) {

		if (!(allPcmResourceContainer.size() > 1)) {
			
			fail("The PCM model must containt more than one ResourceContainer.");
			
		}
		
		return allPcmResourceContainer;
		
	}

	protected void addECCToEmptyContainer(DesignDecisionGenotype genotype, ElementaryConcernComponent ecc) {
		
		genotype.add(createAllocDegreeClassChoiceWithChosenValue(getSecondResourceContainer(), ecc));
		
	}
	
	protected void addECCToNonEmptyContainer(DesignDecisionGenotype genotype, ElementaryConcernComponent ecc) {
		
		ResourceContainer nonEmptyContainer = (ResourceContainer) ((ClassChoice) genotype.get(0)).getChosenValue();
		genotype.add(createAllocDegreeClassChoiceWithChosenValue(nonEmptyContainer, ecc));
		
	}
	
	protected void addECCToSpecificContainer(DesignDecisionGenotype genotype, ElementaryConcernComponent ecc, ResourceContainer specificResourceContainer) {
		
		genotype.add(createAllocDegreeClassChoiceWithChosenValue(specificResourceContainer, ecc));
		
	}
	
	protected void addDefaultAllocation(DesignDecisionGenotype genotype) {
		
		getAllPcmAllocationContexts().forEach(eachAllocContext -> {
			
			genotype.add(createAllocDegreeClassChoiceWithDefaultValue(eachAllocContext));
			
		});
		
	}
	
	protected void addAllocationContextsAllocatedOnOneContainer(DesignDecisionGenotype genotype) {
		
		ResourceContainer resourceContainer = getFirstResourceContainer();
		
		getAllPcmAllocationContexts().forEach(eachAllocContext -> {
			
			genotype.add(createAllocDegreeClassChoiceWithChosenValue(resourceContainer, eachAllocContext));
			
		});
		
	}
	
	protected ClassChoice createAllocDegreeClassChoiceWithDefaultValue(EObject primaryChange) {
		
		return createAllocDegreeClassChoiceWithChosenValue(((AllocationContext) primaryChange).getResourceContainer_AllocationContext(), primaryChange);
		
	}
	
	protected ClassChoice createAllocDegreeClassChoiceWithChosenValue(ResourceContainer resourceContainer, EObject primaryChange) {
		
		AllocationDegree allocDegree = specificFactory.eINSTANCE.createAllocationDegree();
		allocDegree.setPrimaryChanged(primaryChange);
		allocDegree.getClassDesignOptions().addAll(getAllResourceContainer());
		
		ClassChoice classChoice = designdecisionFactory.eINSTANCE.createClassChoice();
		classChoice.setDegreeOfFreedomInstance(allocDegree);
		classChoice.setChosenValue(resourceContainer);
		
		return classChoice;
		
	}
	
	protected void setGenotype(DesignDecisionGenotype genotype) {
		
		this.genotype = genotype;
		
	}
	
}
