/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.designdecision.*;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class designdecisionFactoryImpl extends EFactoryImpl implements designdecisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static designdecisionFactory init() {
		try {
			designdecisionFactory thedesigndecisionFactory = (designdecisionFactory) EPackage.Registry.INSTANCE
					.getEFactory(designdecisionPackage.eNS_URI);
			if (thedesigndecisionFactory != null) {
				return thedesigndecisionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new designdecisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case designdecisionPackage.DISCRETE_RANGE_CHOICE:
			return createDiscreteRangeChoice();
		case designdecisionPackage.CHOICE:
			return createChoice();
		case designdecisionPackage.CLASS_CHOICE:
			return createClassChoice();
		case designdecisionPackage.CONTINOUS_RANGE_CHOICE:
			return createContinousRangeChoice();
		case designdecisionPackage.DECISION_SPACE:
			return createDecisionSpace();
		case designdecisionPackage.CANDIDATE:
			return createCandidate();
		case designdecisionPackage.CANDIDATES:
			return createCandidates();
		case designdecisionPackage.PCMDSE_PROBLEM:
			return createPCMDSEProblem();
		case designdecisionPackage.PCM_METAMODEL_DESCRIPTION:
			return createPCMMetamodelDescription();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteRangeChoice createDiscreteRangeChoice() {
		DiscreteRangeChoiceImpl discreteRangeChoice = new DiscreteRangeChoiceImpl();
		return discreteRangeChoice;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassChoice createClassChoice() {
		ClassChoiceImpl classChoice = new ClassChoiceImpl();
		return classChoice;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinousRangeChoice createContinousRangeChoice() {
		ContinousRangeChoiceImpl continousRangeChoice = new ContinousRangeChoiceImpl();
		return continousRangeChoice;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionSpace createDecisionSpace() {
		DecisionSpaceImpl decisionSpace = new DecisionSpaceImpl();
		return decisionSpace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Candidate createCandidate() {
		CandidateImpl candidate = new CandidateImpl();
		return candidate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Candidates createCandidates() {
		CandidatesImpl candidates = new CandidatesImpl();
		return candidates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PCMMetamodelDescription createPCMMetamodelDescription() {
		PCMMetamodelDescriptionImpl pcmMetamodelDescription = new PCMMetamodelDescriptionImpl();
		return pcmMetamodelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public designdecisionPackage getdesigndecisionPackage() {
		return (designdecisionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static designdecisionPackage getPackage() {
		return designdecisionPackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public PCMDSEProblem createPCMDSEProblem() {
		return null;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PCMDSEProblem createPCMDSEProblem(DSEWorkflowConfiguration dseConfig, EModelElement model) throws CoreException {
		return new PCMDSEProblemImpl(dseConfig, model, designdecisionFactory.eINSTANCE.createPCMMetamodelDescription());
	}

} // designdecisionFactoryImpl
