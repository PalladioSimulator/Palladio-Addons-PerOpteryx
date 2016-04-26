/**
 */
package de.uka.ipd.sdq.pcm.designdecision.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage
 * @generated
 */
public class designdecisionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final designdecisionValidator INSTANCE = new designdecisionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.pcm.designdecision";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of Choices Must Equal Number Of Decisions' of 'Candidates'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final int CANDIDATES__NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return designdecisionPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case designdecisionPackage.DISCRETE_RANGE_CHOICE:
			return validateDiscreteRangeChoice((DiscreteRangeChoice) value, diagnostics, context);
		case designdecisionPackage.CHOICE:
			return validateChoice((Choice) value, diagnostics, context);
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE:
			return validateDegreeOfFreedomInstance((DegreeOfFreedomInstance) value, diagnostics, context);
		case designdecisionPackage.CLASS_CHOICE:
			return validateClassChoice((ClassChoice) value, diagnostics, context);
		case designdecisionPackage.CONTINOUS_RANGE_CHOICE:
			return validateContinousRangeChoice((ContinousRangeChoice) value, diagnostics, context);
		case designdecisionPackage.DECISION_SPACE:
			return validateDecisionSpace((DecisionSpace) value, diagnostics, context);
		case designdecisionPackage.CANDIDATE:
			return validateCandidate((Candidate) value, diagnostics, context);
		case designdecisionPackage.CANDIDATES:
			return validateCandidates((Candidates) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiscreteRangeChoice(DiscreteRangeChoice discreteRangeChoice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(discreteRangeChoice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDegreeOfFreedomInstance(DegreeOfFreedomInstance degreeOfFreedomInstance,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(degreeOfFreedomInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChoice(Choice choice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(choice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassChoice(ClassChoice classChoice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classChoice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinousRangeChoice(ContinousRangeChoice continousRangeChoice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(continousRangeChoice, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionSpace(DecisionSpace decisionSpace, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(decisionSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidate(Candidate candidate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(candidate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidates(Candidates candidates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(candidates, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(candidates, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCandidates_numberOfChoicesMustEqualNumberOfDecisions(candidates, diagnostics, context);
		return result;
	}

	/**
	 * Validates the numberOfChoicesMustEqualNumberOfDecisions constraint of '<em>Candidates</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCandidates_numberOfChoicesMustEqualNumberOfDecisions(Candidates candidates,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return candidates.numberOfChoicesMustEqualNumberOfDecisions(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} // designdecisionValidator
