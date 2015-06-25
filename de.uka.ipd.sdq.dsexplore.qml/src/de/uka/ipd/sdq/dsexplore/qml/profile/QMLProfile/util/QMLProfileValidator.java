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
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage
 * @generated
 */
public class QMLProfileValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final QMLProfileValidator INSTANCE = new QMLProfileValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Profile
     * cannot refine itself' of 'Refined QML Profile'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int REFINED_QML_PROFILE__PROFILE_CANNOT_REFINE_ITSELF = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants in a derived class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLProfileValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
    protected boolean validate(final int classifierID, final Object value, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        switch (classifierID)
        {
        case QMLProfilePackage.SIMPLE_QML_PROFILE:
            return this.validateSimpleQMLProfile((SimpleQMLProfile) value, diagnostics, context);
        case QMLProfilePackage.GENERIC_QML_PROFILE:
            return this.validateGenericQMLProfile((GenericQMLProfile) value, diagnostics, context);
        case QMLProfilePackage.REQUIREMENT:
            return this.validateRequirement((Requirement) value, diagnostics, context);
        case QMLProfilePackage.REFINED_QML_PROFILE:
            return this.validateRefinedQMLProfile((RefinedQMLProfile) value, diagnostics, context);
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT:
            return this.validateUsageScenarioRequirement((UsageScenarioRequirement) value, diagnostics, context);
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT:
            return this.validateEntryLevelSystemCallRequirement((EntryLevelSystemCallRequirement) value, diagnostics,
                    context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSimpleQMLProfile(final SimpleQMLProfile simpleQMLProfile, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(simpleQMLProfile, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateGenericQMLProfile(final GenericQMLProfile genericQMLProfile,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(genericQMLProfile, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRequirement(final Requirement requirement, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(requirement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRefinedQMLProfile(final RefinedQMLProfile refinedQMLProfile,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(refinedQMLProfile, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(refinedQMLProfile, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(refinedQMLProfile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateRefinedQMLProfile_profile_cannot_refine_itself(refinedQMLProfile, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the profile_cannot_refine_itself constraint of '<em>Refined QML Profile</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRefinedQMLProfile_profile_cannot_refine_itself(final RefinedQMLProfile refinedQMLProfile,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return refinedQMLProfile.profile_cannot_refine_itself(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateUsageScenarioRequirement(final UsageScenarioRequirement usageScenarioRequirement,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(usageScenarioRequirement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEntryLevelSystemCallRequirement(
            final EntryLevelSystemCallRequirement entryLevelSystemCallRequirement, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(entryLevelSystemCallRequirement, diagnostics, context);
    }

    /**
     * Returns the resource locator that will be used to fetch messages for this validator's
     * diagnostics. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
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
