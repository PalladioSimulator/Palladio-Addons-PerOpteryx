/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.GenericQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage
 * @generated
 */
public class QMLProfileValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final QMLProfileValidator INSTANCE = new QMLProfileValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Profile cannot refine itself' of 'Refined QML Profile'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFINED_QML_PROFILE__PROFILE_CANNOT_REFINE_ITSELF = 1;

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
	public QMLProfileValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return QMLProfilePackage.eINSTANCE;
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
		case QMLProfilePackage.SIMPLE_QML_PROFILE:
			return validateSimpleQMLProfile((SimpleQMLProfile) value, diagnostics, context);
		case QMLProfilePackage.GENERIC_QML_PROFILE:
			return validateGenericQMLProfile((GenericQMLProfile) value, diagnostics, context);
		case QMLProfilePackage.REQUIREMENT:
			return validateRequirement((Requirement) value, diagnostics, context);
		case QMLProfilePackage.REFINED_QML_PROFILE:
			return validateRefinedQMLProfile((RefinedQMLProfile) value, diagnostics, context);
		case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT:
			return validateUsageScenarioRequirement((UsageScenarioRequirement) value, diagnostics, context);
		case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT:
			return validateEntryLevelSystemCallRequirement((EntryLevelSystemCallRequirement) value, diagnostics,
					context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleQMLProfile(SimpleQMLProfile simpleQMLProfile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleQMLProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericQMLProfile(GenericQMLProfile genericQMLProfile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericQMLProfile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinedQMLProfile(RefinedQMLProfile refinedQMLProfile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refinedQMLProfile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(refinedQMLProfile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRefinedQMLProfile_profile_cannot_refine_itself(refinedQMLProfile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the profile_cannot_refine_itself constraint of '<em>Refined QML Profile</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public boolean validateRefinedQMLProfile_profile_cannot_refine_itself(RefinedQMLProfile refinedQMLProfile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refinedQMLProfile.profile_cannot_refine_itself(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsageScenarioRequirement(UsageScenarioRequirement usageScenarioRequirement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usageScenarioRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntryLevelSystemCallRequirement(
			EntryLevelSystemCallRequirement entryLevelSystemCallRequirement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(entryLevelSystemCallRequirement, diagnostics, context);
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

} // QMLProfileValidator
