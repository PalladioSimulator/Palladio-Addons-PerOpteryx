/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class genericdesigndecisionFactoryImpl extends EFactoryImpl implements genericdesigndecisionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static genericdesigndecisionFactory init() {
		try {
			genericdesigndecisionFactory thegenericdesigndecisionFactory = (genericdesigndecisionFactory)EPackage.Registry.INSTANCE.getEFactory(genericdesigndecisionPackage.eNS_URI);
			if (thegenericdesigndecisionFactory != null) {
				return thegenericdesigndecisionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new genericdesigndecisionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public genericdesigndecisionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case genericdesigndecisionPackage.DISCRETE_RANGE_CHOICE: return createDiscreteRangeChoice();
			case genericdesigndecisionPackage.CHOICE: return createChoice();
			case genericdesigndecisionPackage.DEGREE_OF_FREEDOM_INSTANCE: return createDegreeOfFreedomInstance();
			case genericdesigndecisionPackage.CLASS_CHOICE: return createClassChoice();
			case genericdesigndecisionPackage.CONTINOUS_RANGE_CHOICE: return createContinousRangeChoice();
			case genericdesigndecisionPackage.DECISION_SPACE: return createDecisionSpace();
			case genericdesigndecisionPackage.CANDIDATE: return createCandidate();
			case genericdesigndecisionPackage.CANDIDATES: return createCandidates();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteRangeChoice createDiscreteRangeChoice() {
		DiscreteRangeChoiceImpl discreteRangeChoice = new DiscreteRangeChoiceImpl();
		return discreteRangeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choice createChoice() {
		ChoiceImpl choice = new ChoiceImpl();
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedomInstance createDegreeOfFreedomInstance() {
		DegreeOfFreedomInstanceImpl degreeOfFreedomInstance = new DegreeOfFreedomInstanceImpl();
		return degreeOfFreedomInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassChoice createClassChoice() {
		ClassChoiceImpl classChoice = new ClassChoiceImpl();
		return classChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousRangeChoice createContinousRangeChoice() {
		ContinousRangeChoiceImpl continousRangeChoice = new ContinousRangeChoiceImpl();
		return continousRangeChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionSpace createDecisionSpace() {
		DecisionSpaceImpl decisionSpace = new DecisionSpaceImpl();
		return decisionSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candidate createCandidate() {
		CandidateImpl candidate = new CandidateImpl();
		return candidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Candidates createCandidates() {
		CandidatesImpl candidates = new CandidatesImpl();
		return candidates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public genericdesigndecisionPackage getgenericdesigndecisionPackage() {
		return (genericdesigndecisionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static genericdesigndecisionPackage getPackage() {
		return genericdesigndecisionPackage.eINSTANCE;
	}

} //genericdesigndecisionFactoryImpl
