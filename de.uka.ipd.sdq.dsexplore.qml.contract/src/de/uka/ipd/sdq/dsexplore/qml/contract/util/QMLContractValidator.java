/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.util;

import de.uka.ipd.sdq.dsexplore.qml.contract.*;

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
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage
 * @generated
 */
public class QMLContractValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QMLContractValidator INSTANCE = new QMLContractValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.dsexplore.qml.contract";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All DIMENSIO Ns must be from same CONTRACTTYPE' of 'Simple QML Contract'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SIMPLE_QML_CONTRACT__ALL_DIMENSIO_NS_MUST_BE_FROM_SAME_CONTRACTTYPE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only CONSTRAINTS have RESTRICTIONS' of 'Criterion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION__ONLY_CONSTRAINTS_HAVE_RESTRICTIONS = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'FREQUENCY only possible if DIMENSION is ordered' of 'Criterion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION__FREQUENCY_ONLY_POSSIBLE_IF_DIMENSION_IS_ORDERED = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'POINTESTIMATOR only for numeric dimensions' of 'Criterion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION__POINTESTIMATOR_ONLY_FOR_NUMERIC_DIMENSIONS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only OBJECTIVES have GOALS' of 'Criterion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CRITERION__ONLY_OBJECTIVES_HAVE_GOALS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'FREQUENCY LIMIT must be NUMERIC' of 'Evaluation Aspect'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_NUMERIC = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'FREQUENCY LIMIT must be between 0and 100' of 'Evaluation Aspect'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100 = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'PERCENTILE between 0and 100' of 'Percentile'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PERCENTILE__PERCENTILE_BETWEEN_0AND_100 = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Range of FREQUENCY must have UPPERLIMIT or LOWERLIMIT' of 'Frequency'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FREQUENCY__RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contract cannot refine itself' of 'Refined QML Contract'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFINED_QML_CONTRACT__CONTRACT_CANNOT_REFINE_ITSELF = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All ASPECTS of CONSTRAINTS have RESTRICTIONS' of 'Constraint'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSTRAINT__ALL_ASPECTS_OF_CONSTRAINTS_HAVE_RESTRICTIONS = 11;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

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
	public QMLContractValidator() {
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
	  return QMLContractPackage.eINSTANCE;
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
			case QMLContractPackage.SIMPLE_QML_CONTRACT:
				return validateSimpleQMLContract((SimpleQMLContract)value, diagnostics, context);
			case QMLContractPackage.CRITERION:
				return validateCriterion((Criterion)value, diagnostics, context);
			case QMLContractPackage.EVALUATION_ASPECT:
				return validateEvaluationAspect((EvaluationAspect)value, diagnostics, context);
			case QMLContractPackage.ASPECT_REQUIREMENT:
				return validateAspectRequirement((AspectRequirement)value, diagnostics, context);
			case QMLContractPackage.VALUE_LITERAL:
				return validateValueLiteral((ValueLiteral)value, diagnostics, context);
			case QMLContractPackage.PERCENTILE:
				return validatePercentile((Percentile)value, diagnostics, context);
			case QMLContractPackage.POINT_ESTIMATOR:
				return validatePointEstimator((PointEstimator)value, diagnostics, context);
			case QMLContractPackage.STOCHASTIC_EVALUATION_ASPECT:
				return validateStochasticEvaluationAspect((StochasticEvaluationAspect)value, diagnostics, context);
			case QMLContractPackage.FREQUENCY:
				return validateFrequency((Frequency)value, diagnostics, context);
			case QMLContractPackage.RANGE_VALUE:
				return validateRangeValue((RangeValue)value, diagnostics, context);
			case QMLContractPackage.MEAN:
				return validateMean((Mean)value, diagnostics, context);
			case QMLContractPackage.VARIANCE:
				return validateVariance((Variance)value, diagnostics, context);
			case QMLContractPackage.NUMERIC_LITERAL:
				return validateNumericLiteral((NumericLiteral)value, diagnostics, context);
			case QMLContractPackage.ENUM_LITERAL:
				return validateEnumLiteral((EnumLiteral)value, diagnostics, context);
			case QMLContractPackage.SET_LITERAL:
				return validateSetLiteral((SetLiteral)value, diagnostics, context);
			case QMLContractPackage.REFINED_QML_CONTRACT:
				return validateRefinedQMLContract((RefinedQMLContract)value, diagnostics, context);
			case QMLContractPackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case QMLContractPackage.DETERMINISTIC_EVALUATION_ASPECT:
				return validateDeterministicEvaluationAspect((DeterministicEvaluationAspect)value, diagnostics, context);
			case QMLContractPackage.OBJECTIVE:
				return validateObjective((Objective)value, diagnostics, context);
			case QMLContractPackage.CONSTRAINT:
				return validateConstraint((Constraint)value, diagnostics, context);
			case QMLContractPackage.RESTRICTION:
				return validateRestriction((Restriction)value, diagnostics, context);
			case QMLContractPackage.GOAL:
				return validateGoal((Goal)value, diagnostics, context);
			case QMLContractPackage.GENERIC_QML_CONTRACT:
				return validateGenericQMLContract((GenericQMLContract)value, diagnostics, context);
			case QMLContractPackage.SCALE_LITERAL:
				return validateScaleLiteral((ScaleLiteral<?>)value, diagnostics, context);
			case QMLContractPackage.ENUM_OPERATOR:
				return validateEnumOperator((EnumOperator)value, diagnostics, context);
			case QMLContractPackage.ENUM_RANGE_VALUE_TYPE:
				return validateEnumRangeValueType((EnumRangeValueType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleQMLContract(SimpleQMLContract simpleQMLContract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)simpleQMLContract, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)simpleQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validateSimpleQMLContract_all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(simpleQMLContract, diagnostics, context);
		return result;
	}

	/**
	 * Validates the all_DIMENSIONs_must_be_from_same_CONTRACTTYPE constraint of '<em>Simple QML Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleQMLContract_all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(SimpleQMLContract simpleQMLContract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return simpleQMLContract.all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)criterion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(criterion, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_Only_OBJECTIVES_have_GOALS(criterion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Only_CONSTRAINTS_have_RESTRICTIONS constraint of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterion.Only_CONSTRAINTS_have_RESTRICTIONS(diagnostics, context);
	}

	/**
	 * Validates the FREQUENCY_only_possible_if_DIMENSION_is_ordered constraint of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterion.FREQUENCY_only_possible_if_DIMENSION_is_ordered(diagnostics, context);
	}

	/**
	 * Validates the POINTESTIMATOR_only_for_numeric_dimensions constraint of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterion.POINTESTIMATOR_only_for_numeric_dimensions(diagnostics, context);
	}

	/**
	 * Validates the Only_OBJECTIVES_have_GOALS constraint of '<em>Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCriterion_Only_OBJECTIVES_have_GOALS(Criterion criterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return criterion.Only_OBJECTIVES_have_GOALS(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationAspect(EvaluationAspect evaluationAspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)evaluationAspect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(evaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(evaluationAspect, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FREQUENCY_LIMIT_must_be_NUMERIC constraint of '<em>Evaluation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(EvaluationAspect evaluationAspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return evaluationAspect.FREQUENCY_LIMIT_must_be_NUMERIC(diagnostics, context);
	}

	/**
	 * Validates the FREQUENCY_LIMIT_must_be_between_0_and_100 constraint of '<em>Evaluation Aspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(EvaluationAspect evaluationAspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return evaluationAspect.FREQUENCY_LIMIT_must_be_between_0_and_100(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAspectRequirement(AspectRequirement aspectRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)aspectRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueLiteral(ValueLiteral valueLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)valueLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentile(Percentile percentile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)percentile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(percentile, diagnostics, context);
		if (result || diagnostics != null) result &= validatePercentile_PERCENTILE_between_0_and_100(percentile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PERCENTILE_between_0_and_100 constraint of '<em>Percentile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePercentile_PERCENTILE_between_0_and_100(Percentile percentile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return percentile.PERCENTILE_between_0_and_100(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePointEstimator(PointEstimator pointEstimator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)pointEstimator, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(pointEstimator, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(pointEstimator, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStochasticEvaluationAspect(StochasticEvaluationAspect stochasticEvaluationAspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)stochasticEvaluationAspect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(stochasticEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(stochasticEvaluationAspect, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequency(Frequency frequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)frequency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(frequency, diagnostics, context);
		if (result || diagnostics != null) result &= validateFrequency_range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(frequency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT constraint of '<em>Frequency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequency_range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(Frequency frequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return frequency.range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRangeValue(RangeValue rangeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)rangeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMean(Mean mean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)mean, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(mean, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(mean, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariance(Variance variance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)variance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(variance, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(variance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumericLiteral(NumericLiteral numericLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)numericLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumLiteral(EnumLiteral enumLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)enumLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetLiteral(SetLiteral setLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)setLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinedQMLContract(RefinedQMLContract refinedQMLContract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)refinedQMLContract, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)refinedQMLContract, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefinedQMLContract_contract_cannot_refine_itself(refinedQMLContract, diagnostics, context);
		return result;
	}

	/**
	 * Validates the contract_cannot_refine_itself constraint of '<em>Refined QML Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefinedQMLContract_contract_cannot_refine_itself(RefinedQMLContract refinedQMLContract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return refinedQMLContract.contract_cannot_refine_itself(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)value, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)value, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(value, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(value, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeterministicEvaluationAspect(DeterministicEvaluationAspect deterministicEvaluationAspect, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)deterministicEvaluationAspect, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(deterministicEvaluationAspect, diagnostics, context);
		if (result || diagnostics != null) result &= validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(deterministicEvaluationAspect, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjective(Objective objective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)objective, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)objective, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(objective, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_Only_OBJECTIVES_have_GOALS(objective, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)constraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateCriterion_Only_OBJECTIVES_have_GOALS(constraint, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstraint_All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS(constraint, diagnostics, context);
		return result;
	}

	/**
	 * Validates the All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS constraint of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraint_All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS(Constraint constraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return constraint.All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRestriction(Restriction restriction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)restriction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoal(Goal goal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)goal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericQMLContract(GenericQMLContract genericQMLContract, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint((EObject)genericQMLContract, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScaleLiteral(ScaleLiteral<?> scaleLiteral, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scaleLiteral, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumOperator(EnumOperator enumOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumRangeValueType(EnumRangeValueType enumRangeValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //QMLContractValidator
