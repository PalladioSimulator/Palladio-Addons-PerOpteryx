/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage
 * @generated
 */
public class resourcerepositoryValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final resourcerepositoryValidator INSTANCE = new resourcerepositoryValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.pcm.resourcerepository";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cost And
     * Resource Must Match' of 'Resource Description'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int RESOURCE_DESCRIPTION__COST_AND_RESOURCE_MUST_MATCH = 1;

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
    public resourcerepositoryValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return resourcerepositoryPackage.eINSTANCE;
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
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION_REPOSITORY:
            return this.validateResourceDescriptionRepository((ResourceDescriptionRepository) value, diagnostics,
                    context);
        case resourcerepositoryPackage.RESOURCE_DESCRIPTION:
            return this.validateResourceDescription((ResourceDescription) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResourceDescriptionRepository(
            final ResourceDescriptionRepository resourceDescriptionRepository,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(resourceDescriptionRepository, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResourceDescription(final ResourceDescription resourceDescription,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(resourceDescription, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(resourceDescription, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(resourceDescription, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateResourceDescription_CostAndResourceMustMatch(resourceDescription, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the CostAndResourceMustMatch constraint of '<em>Resource Description</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateResourceDescription_CostAndResourceMustMatch(final ResourceDescription resourceDescription,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return resourceDescription.CostAndResourceMustMatch(diagnostics, context);
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

} // resourcerepositoryValidator
