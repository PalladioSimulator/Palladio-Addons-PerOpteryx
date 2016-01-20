/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage;
import genericdesigndecision.Candidates;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage
 * @generated
 */
public class designdecisionValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final designdecisionValidator INSTANCE = new designdecisionValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.pcmsupport.designdecision";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Number Of
     * Choices Must Equal Number Of Decisions' of 'Candidates'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int CANDIDATES__NUMBER_OF_CHOICES_MUST_EQUAL_NUMBER_OF_DECISIONS = 1;

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
    public designdecisionValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return designdecisionPackage.eINSTANCE;
    }

    /**
     * Validates the numberOfChoicesMustEqualNumberOfDecisions constraint of '<em>Candidates</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCandidates_numberOfChoicesMustEqualNumberOfDecisions(final Candidates candidates,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return candidates.numberOfChoicesMustEqualNumberOfDecisions(diagnostics, context);
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

} // designdecisionValidator
