/**
 */
package FeatureCompletionModel.util;

import FeatureCompletionModel.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionPackage
 * @generated
 */
public class FeatureCompletionValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FeatureCompletionValidator INSTANCE = new FeatureCompletionValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "FeatureCompletionModel";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

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
	public FeatureCompletionValidator() {
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
	  return FeatureCompletionPackage.eINSTANCE;
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
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY:
				return validateFeatureCompletionRepository((FeatureCompletionRepository)value, diagnostics, context);
			case FeatureCompletionPackage.FEATURE_COMPLETION:
				return validateFeatureCompletion((FeatureCompletion)value, diagnostics, context);
			case FeatureCompletionPackage.COMPLETION_COMPONENT:
				return validateCompletionComponent((CompletionComponent)value, diagnostics, context);
			case FeatureCompletionPackage.DESCRIBED_ELEMENT:
				return validateDescribedElement((DescribedElement)value, diagnostics, context);
			case FeatureCompletionPackage.NAMED_ELEMENT:
				return validateNamedElement((NamedElement)value, diagnostics, context);
			case FeatureCompletionPackage.PERIMETER_PROVIDING:
				return validatePerimeterProviding((PerimeterProviding)value, diagnostics, context);
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS:
				return validateComplementumVisnetis((ComplementumVisnetis)value, diagnostics, context);
			case FeatureCompletionPackage.COMPLEMENTUM:
				return validateComplementum((Complementum)value, diagnostics, context);
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS:
				return validateArchitectureConstraints((ArchitectureConstraints)value, diagnostics, context);
			case FeatureCompletionPackage.CONSTRAINABLE_ELEMENT:
				return validateConstrainableElement((ConstrainableElement)value, diagnostics, context);
			case FeatureCompletionPackage.PERIMETER_REQUIRING:
				return validatePerimeterRequiring((PerimeterRequiring)value, diagnostics, context);
			case FeatureCompletionPackage.VISNETUM:
				return validateVisnetum((Visnetum)value, diagnostics, context);
			case FeatureCompletionPackage.REPLICATION:
				return validateReplication((Replication)value, diagnostics, context);
			case FeatureCompletionPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCompletionRepository(FeatureCompletionRepository featureCompletionRepository, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureCompletionRepository, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCompletion(FeatureCompletion featureCompletion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureCompletion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureCompletion, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureCompletion_requiredComponentsHaveToBePartOfCompletion(featureCompletion, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the requiredComponentsHaveToBePartOfCompletion constraint of '<em>Feature Completion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEATURE_COMPLETION__REQUIRED_COMPONENTS_HAVE_TO_BE_PART_OF_COMPLETION__EEXPRESSION = "\n" +
		"\t\t\tcompletionComponents.requiredComponents->exists(self.completionComponents)";

	/**
	 * Validates the requiredComponentsHaveToBePartOfCompletion constraint of '<em>Feature Completion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureCompletion_requiredComponentsHaveToBePartOfCompletion(FeatureCompletion featureCompletion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(FeatureCompletionPackage.Literals.FEATURE_COMPLETION,
				 featureCompletion,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "requiredComponentsHaveToBePartOfCompletion",
				 FEATURE_COMPLETION__REQUIRED_COMPONENTS_HAVE_TO_BE_PART_OF_COMPLETION__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompletionComponent(CompletionComponent completionComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(completionComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescribedElement(DescribedElement describedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(describedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamedElement(NamedElement namedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(namedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerimeterProviding(PerimeterProviding perimeterProviding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perimeterProviding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplementumVisnetis(ComplementumVisnetis complementumVisnetis, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complementumVisnetis, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplementum(Complementum complementum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complementum, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArchitectureConstraints(ArchitectureConstraints architectureConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(architectureConstraints, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstrainableElement(ConstrainableElement constrainableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constrainableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerimeterRequiring(PerimeterRequiring perimeterRequiring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perimeterRequiring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisnetum(Visnetum visnetum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplication(Replication replication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //FeatureCompletionValidator
