/**
 */
package featureObjective.util;

import featureObjective.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see featureObjective.FeatureObjectivePackage
 * @generated
 */
public class FeatureObjectiveValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FeatureObjectiveValidator INSTANCE = new FeatureObjectiveValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "featureObjective";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'XO Ror OR Implies Children Are Mandatory' of 'Feature Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE_GROUP__XO_ROR_OR_IMPLIES_CHILDREN_ARE_MANDATORY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'ALL Implies Cardinalities To Be Minus One' of 'Feature Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE_GROUP__ALL_IMPLIES_CARDINALITIES_TO_BE_MINUS_ONE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'OR Implies Cardinalities Min To Be One And Max To Be Minus One' of 'Feature Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE_GROUP__OR_IMPLIES_CARDINALITIES_MIN_TO_BE_ONE_AND_MAX_TO_BE_MINUS_ONE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'XOR Implies Cardinalities To Be One' of 'Feature Group'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FEATURE_GROUP__XOR_IMPLIES_CARDINALITIES_TO_BE_ONE = 4;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 4;

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
	public FeatureObjectiveValidator() {
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
	  return FeatureObjectivePackage.eINSTANCE;
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
			case FeatureObjectivePackage.FEATURE_OBJECTIVE:
				return validateFeatureObjective((FeatureObjective)value, diagnostics, context);
			case FeatureObjectivePackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case FeatureObjectivePackage.FEATURE_GROUP:
				return validateFeatureGroup((FeatureGroup)value, diagnostics, context);
			case FeatureObjectivePackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case FeatureObjectivePackage.REQUIRED_CONSTRAINT:
				return validateRequiredConstraint((RequiredConstraint)value, diagnostics, context);
			case FeatureObjectivePackage.PROHIBITS_CONSTRAINT:
				return validateProhibitsConstraint((ProhibitsConstraint)value, diagnostics, context);
			case FeatureObjectivePackage.ATTRIBUTE_TYPES:
				return validateAttributeTypes((AttributeTypes)value, diagnostics, context);
			case FeatureObjectivePackage.LOGICAL_OPERATION:
				return validateLogicalOperation((LogicalOperation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureObjective(FeatureObjective featureObjective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(featureObjective, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(feature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroup(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(featureGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureGroup_XORorORImpliesChildrenAreMandatory(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureGroup_ALLImpliesCardinalitiesToBeMinusOne(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureGroup_ORImpliesCardinalitiesMinToBeOneAndMaxToBeMinusOne(featureGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeatureGroup_XORImpliesCardinalitiesToBeOne(featureGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the XORorORImpliesChildrenAreMandatory constraint of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroup_XORorORImpliesChildrenAreMandatory(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featureGroup.XORorORImpliesChildrenAreMandatory(diagnostics, context);
	}

	/**
	 * Validates the ALLImpliesCardinalitiesToBeMinusOne constraint of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroup_ALLImpliesCardinalitiesToBeMinusOne(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featureGroup.ALLImpliesCardinalitiesToBeMinusOne(diagnostics, context);
	}

	/**
	 * Validates the ORImpliesCardinalitiesMinToBeOneAndMaxToBeMinusOne constraint of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroup_ORImpliesCardinalitiesMinToBeOneAndMaxToBeMinusOne(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featureGroup.ORImpliesCardinalitiesMinToBeOneAndMaxToBeMinusOne(diagnostics, context);
	}

	/**
	 * Validates the XORImpliesCardinalitiesToBeOne constraint of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeatureGroup_XORImpliesCardinalitiesToBeOne(FeatureGroup featureGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return featureGroup.XORImpliesCardinalitiesToBeOne(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequiredConstraint(RequiredConstraint requiredConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requiredConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProhibitsConstraint(ProhibitsConstraint prohibitsConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prohibitsConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeTypes(AttributeTypes attributeTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogicalOperation(LogicalOperation logicalOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //FeatureObjectiveValidator
