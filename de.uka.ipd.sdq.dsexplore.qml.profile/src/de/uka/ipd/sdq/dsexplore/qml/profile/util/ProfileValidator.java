/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.util;

import de.uka.ipd.sdq.dsexplore.qml.profile.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage
 * @generated
 */
public class ProfileValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ProfileValidator INSTANCE = new ProfileValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.dsexplore.qml.profile";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Profile cannot refine itself' of 'Refined QML Profile'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFINED_QML_PROFILE__PROFILE_CANNOT_REFINE_ITSELF = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ProfilePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ProfilePackage.SIMPLE_QML_PROFILE:
				return validateSimpleQMLProfile((SimpleQMLProfile)value, diagnostics, context);
			case ProfilePackage.GENERIC_QML_PROFILE:
				return validateGenericQMLProfile((GenericQMLProfile)value, diagnostics, context);
			case ProfilePackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case ProfilePackage.REFINED_QML_PROFILE:
				return validateRefinedQMLProfile((RefinedQMLProfile)value, diagnostics, context);
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT:
				return validateUsageScenarioRequirement((UsageScenarioRequirement)value, diagnostics, context);
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT:
				return validateEntryLevelSystemCallRequirement((EntryLevelSystemCallRequirement)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleQMLProfile(SimpleQMLProfile simpleQMLProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)simpleQMLProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericQMLProfile(GenericQMLProfile genericQMLProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)genericQMLProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)requirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinedQMLProfile(RefinedQMLProfile refinedQMLProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)refinedQMLProfile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefinedQMLProfile_profile_cannot_refine_itself(refinedQMLProfile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the profile_cannot_refine_itself constraint of '<em>Refined QML Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinedQMLProfile_profile_cannot_refine_itself(RefinedQMLProfile refinedQMLProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refinedQMLProfile.profile_cannot_refine_itself(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageScenarioRequirement(UsageScenarioRequirement usageScenarioRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)usageScenarioRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCallRequirement(EntryLevelSystemCallRequirement entryLevelSystemCallRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)entryLevelSystemCallRequirement, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ProfileValidator
