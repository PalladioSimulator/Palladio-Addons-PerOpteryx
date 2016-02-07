/**
 */
package genericdesigndecision.impl;

import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Choice;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.SpecificDoF;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.opt4j.core.Phenotype;
import org.palladiosimulator.pcm.core.entity.Entity;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADSE Problem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.impl.ADSEProblemImpl#getProblem <em>Problem</em>}</li>
 *   <li>{@link genericdesigndecision.impl.ADSEProblemImpl#getAssociatedMetamodel <em>Associated Metamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ADSEProblemImpl<P extends Phenotype> extends MinimalEObjectImpl.Container implements ADSEProblem<P> {
	/**
	 * The cached value of the '{@link #getProblem() <em>Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblem()
	 * @generated
	 * @ordered
	 */
	protected DecisionSpace problem;

	/**
	 * The cached value of the '{@link #getAssociatedMetamodel() <em>Associated Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedMetamodel()
	 * @generated
	 * @ordered
	 */
	protected AMetamodelDescription associatedMetamodel;
	
	protected ResourceSetPartition emfPartition = null;

	protected List<DesignDecisionGenotype> initialGenotypeList = null;

    protected DSEWorkflowConfiguration dseConfig = null;

    protected DesignDecisionGenotype initialGenotype = null;
    
    protected final boolean newProblem;
    
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ADSEProblemImpl() {
		super();
		newProblem = false;
		associatedMetamodel = null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ADSEProblemImpl(final DSEWorkflowConfiguration dseConfig, ResourceSetPartition emfPartition) {
		super();
		this.dseConfig = dseConfig;
		this.emfPartition = emfPartition;
		newProblem = dseConfig.isNewProblem();
	}

	protected DecisionSpace loadProblem() {
		final String filename = this.dseConfig.getDesignDecisionFileName();
		DecisionSpace problem = null;
        try {
			problem = this.loadProblem(filename);
		} catch (CoreException e) {
			e.printStackTrace();
			problem = null;
		}
		return problem;
	}
	
	public Class<? extends DSEEvaluator> getDSEEvaluator() {
		return this.associatedMetamodel.getDSEEvaluator();
	}
	
	@Override
	public List<DesignDecisionGenotype> loadGenotypesFromEMF(String filename) {
		return this.getAssociatedMetamodel().loadGenotypesFromEMF(filename, this);
	}
	
	@Override
	public List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype){
		return this.getAssociatedMetamodel().translateDesignDecisionGenotype(DDGenotype, this.problem);
	}
	
	@Override
	public DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype){
		return this.getAssociatedMetamodel().translateFinalBinaryGenotype(FBGenotype, this.problem);
	}
	
	protected abstract DecisionSpace loadProblem(final String filename) throws CoreException;
	
	/**
	 * Initialises the degrees of freedoms and at the same time determines the initial genotype.
	 */
	protected void initialiseProblem() {
		this.problem = GenericdesigndecisionFactory.eINSTANCE.createDecisionSpace();
		final List<ADegreeOfFreedom> dds = this.problem.getDofInstances();
		
		this.initialGenotypeList = new ArrayList<DesignDecisionGenotype>();

		if (dseConfig.isUseGenericDoF()) {
			ArrayList<GenericDoF> list = new ArrayList<GenericDoF>(dseConfig.getSelectedGenericDoFs());
			dseConfig.getSelectedSpecificDoFs().clear();
			for (GenericDoF g : list) {
				for(SpecificDoF sdof : this.associatedMetamodel.getCorrespondingDoFs(g)) {
					dseConfig.addSpecificDoF(sdof);
				}
			}
		}
		
		DesignDecisionGenotype initialCandidate = determineDegreesAndInitialGenotype(dds);
		
		//TODO: Check if the initial genotype is actually a valid genotype?
		//(this may not be the case if the degrees of freedom have been reduced for the optimisation?)

		this.initialGenotypeList.add(initialCandidate);
	}
	
	/**
	 * fills given list of degrees, determines and returns the initial genotype
	 * @param dds degrees of freedom that are used to build the genotype; fills up during method call
	 */
	protected abstract DesignDecisionGenotype determineDegreesAndInitialGenotype(List<ADegreeOfFreedom> dds);
	
	protected abstract List<DesignDecisionGenotype> determineInitialGenotype(final DecisionSpace problem);
	
	protected void throwUnknownDegreeException(final ADegreeOfFreedom dd) {
        throw new RuntimeException("Unknown degree of freedom "+dd.toString()+".");
    }
	
	@Override
	public void saveProblem() {

		final String filename = this.dseConfig.getDesignDecisionFileName();

		//		resourceSet.getPackageRegistry().put
		//		(designdecisionPackage.eNS_URI,
		//		 designdecisionPackage.eINSTANCE);

		de.uka.ipd.sdq.dsexplore.helper.EMFHelper.saveToXMIFile(this.problem, filename);
	}
	
	@Override
	public String getDecisionString(final Choice choice) {
		return this.associatedMetamodel.getDecisionString(choice);
	}
	
	@Override
	public ADegreeOfFreedom getDesignDecision(final int index) {
		return this.problem.getDofInstances().get(index);
	}

	@Override
	public List<ADegreeOfFreedom> getDesignDecisions() {
		return this.problem.getDofInstances();
	}

	/**
	 * Returns the degree of freedom of the type (or subtype) that has the given
	 * entity as the changeableEntity.
	 * @param entity
	 * @param degreeClass
	 * @return The matching DegreeOfFreedom runtime object from this problem.
	 */
	protected ADegreeOfFreedom getDoFInstance(final Entity entity,
			final Class<? extends ADegreeOfFreedom> degreeClass) {
		final List<ADegreeOfFreedom> degrees = this.problem.getDofInstances();
		for (final ADegreeOfFreedom DegreeOfFreedom : degrees) {

			if (degreeClass.isInstance(DegreeOfFreedom)
					&& DegreeOfFreedom.getPrimaryChanged().equals(entity)) {
				return DegreeOfFreedom;
			}
		}
		return null;
	}

	@Override
	public DesignDecisionGenotype getGenotypeOfInitialInstance() {
		return this.initialGenotype;
	}

	public List<DesignDecisionGenotype> getInitialGenotypeList() {
		return this.initialGenotypeList;
	}
	
	@Override
	public void setInitialPopulation(final List<DesignDecisionGenotype> population) throws CoreException {
		this.initialGenotypeList = population;
		Opt4JStarter.getDSECreator().setNumberOfNotEvaluatedPredefinedOnes(population.size());
	}
	
	@Override
    public String toString(){

        String result = "";

        final List<ADegreeOfFreedom> decisions = this.problem.getDofInstances();
        for (final ADegreeOfFreedom designDecision : decisions) {
            result += designDecision.getDegreeDescription()+";";
        }
        return result;
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericdesigndecisionPackage.Literals.ADSE_PROBLEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpace getProblem() {
		if (problem != null && problem.eIsProxy()) {
			InternalEObject oldProblem = (InternalEObject)problem;
			problem = (DecisionSpace)eResolveProxy(oldProblem);
			if (problem != oldProblem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM, oldProblem, problem));
			}
		}
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpace basicGetProblem() {
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProblem(DecisionSpace newProblem) {
		DecisionSpace oldProblem = problem;
		problem = newProblem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM, oldProblem, problem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMetamodelDescription getAssociatedMetamodel() {
		if (associatedMetamodel != null && associatedMetamodel.eIsProxy()) {
			InternalEObject oldAssociatedMetamodel = (InternalEObject)associatedMetamodel;
			associatedMetamodel = (AMetamodelDescription)eResolveProxy(oldAssociatedMetamodel);
			if (associatedMetamodel != oldAssociatedMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL, oldAssociatedMetamodel, associatedMetamodel));
			}
		}
		return associatedMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMetamodelDescription basicGetAssociatedMetamodel() {
		return associatedMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedMetamodel(AMetamodelDescription newAssociatedMetamodel) {
		AMetamodelDescription oldAssociatedMetamodel = associatedMetamodel;
		associatedMetamodel = newAssociatedMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL, oldAssociatedMetamodel, associatedMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM:
				if (resolve) return getProblem();
				return basicGetProblem();
			case GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL:
				if (resolve) return getAssociatedMetamodel();
				return basicGetAssociatedMetamodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM:
				setProblem((DecisionSpace)newValue);
				return;
			case GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL:
				setAssociatedMetamodel((AMetamodelDescription)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM:
				setProblem((DecisionSpace)null);
				return;
			case GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL:
				setAssociatedMetamodel((AMetamodelDescription)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM:
				return problem != null;
			case GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL:
				return associatedMetamodel != null;
		}
		return super.eIsSet(featureID);
	}
	
} //ADSEProblemImpl