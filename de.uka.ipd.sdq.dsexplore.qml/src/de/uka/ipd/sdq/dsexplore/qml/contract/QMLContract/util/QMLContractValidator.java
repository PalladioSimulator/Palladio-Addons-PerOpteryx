/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.DeterministicEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumOperator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumRangeValueType;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.PointEstimator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.StochasticEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance;

/**
 * <!-- begin-user-doc --> The <b>Validator</b> for the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage
 * @generated
 */
public class QMLContractValidator extends EObjectValidator {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final QMLContractValidator INSTANCE = new QMLContractValidator();

    /**
     * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of
     * diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.common.util.Diagnostic#getSource()
     * @see org.eclipse.emf.common.util.Diagnostic#getCode()
     * @generated
     */
    public static final String DIAGNOSTIC_SOURCE = "de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract";

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All
     * DIMENSIO Ns must be from same CONTRACTTYPE' of 'Simple QML Contract'. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int SIMPLE_QML_CONTRACT__ALL_DIMENSIO_NS_MUST_BE_FROM_SAME_CONTRACTTYPE = 1;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only
     * CONSTRAINTS have RESTRICTIONS' of 'Criterion'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int CRITERION__ONLY_CONSTRAINTS_HAVE_RESTRICTIONS = 2;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'FREQUENCY
     * only possible if DIMENSION is ordered' of 'Criterion'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int CRITERION__FREQUENCY_ONLY_POSSIBLE_IF_DIMENSION_IS_ORDERED = 3;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint
     * 'POINTESTIMATOR only for numeric dimensions' of 'Criterion'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int CRITERION__POINTESTIMATOR_ONLY_FOR_NUMERIC_DIMENSIONS = 4;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Only
     * OBJECTIVES have GOALS' of 'Criterion'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int CRITERION__ONLY_OBJECTIVES_HAVE_GOALS = 5;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'FREQUENCY
     * LIMIT must be NUMERIC' of 'Evaluation Aspect'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_NUMERIC = 6;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'FREQUENCY
     * LIMIT must be between 0and 100' of 'Evaluation Aspect'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int EVALUATION_ASPECT__FREQUENCY_LIMIT_MUST_BE_BETWEEN_0AND_100 = 7;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'PERCENTILE
     * between 0and 100' of 'Percentile'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final int PERCENTILE__PERCENTILE_BETWEEN_0AND_100 = 8;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Range of
     * FREQUENCY must have UPPERLIMIT or LOWERLIMIT' of 'Frequency'. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public static final int FREQUENCY__RANGE_OF_FREQUENCY_MUST_HAVE_UPPERLIMIT_OR_LOWERLIMIT = 9;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Contract
     * cannot refine itself' of 'Refined QML Contract'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public static final int REFINED_QML_CONTRACT__CONTRACT_CANNOT_REFINE_ITSELF = 10;

    /**
     * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'All ASPECTS
     * of CONSTRAINTS have RESTRICTIONS' of 'Constraint'. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    public static final int CONSTRAINT__ALL_ASPECTS_OF_CONSTRAINTS_HAVE_RESTRICTIONS = 11;

    /**
     * A constant with a fixed name that can be used as the base value for additional hand written
     * constants. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 11;

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
    public QMLContractValidator() {
        super();
    }

    /**
     * Returns the package of this validator switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EPackage getEPackage() {
        return QMLContractPackage.eINSTANCE;
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
        case QMLContractPackage.SIMPLE_QML_CONTRACT:
            return this.validateSimpleQMLContract((SimpleQMLContract) value, diagnostics, context);
        case QMLContractPackage.CRITERION:
            return this.validateCriterion((Criterion) value, diagnostics, context);
        case QMLContractPackage.EVALUATION_ASPECT:
            return this.validateEvaluationAspect((EvaluationAspect) value, diagnostics, context);
        case QMLContractPackage.ASPECT_REQUIREMENT:
            return this.validateAspectRequirement((AspectRequirement) value, diagnostics, context);
        case QMLContractPackage.VALUE_LITERAL:
            return this.validateValueLiteral((ValueLiteral) value, diagnostics, context);
        case QMLContractPackage.PERCENTILE:
            return this.validatePercentile((Percentile) value, diagnostics, context);
        case QMLContractPackage.POINT_ESTIMATOR:
            return this.validatePointEstimator((PointEstimator) value, diagnostics, context);
        case QMLContractPackage.STOCHASTIC_EVALUATION_ASPECT:
            return this.validateStochasticEvaluationAspect((StochasticEvaluationAspect) value, diagnostics, context);
        case QMLContractPackage.FREQUENCY:
            return this.validateFrequency((Frequency) value, diagnostics, context);
        case QMLContractPackage.RANGE_VALUE:
            return this.validateRangeValue((RangeValue) value, diagnostics, context);
        case QMLContractPackage.MEAN:
            return this.validateMean((Mean) value, diagnostics, context);
        case QMLContractPackage.VARIANCE:
            return this.validateVariance((Variance) value, diagnostics, context);
        case QMLContractPackage.NUMERIC_LITERAL:
            return this.validateNumericLiteral((NumericLiteral) value, diagnostics, context);
        case QMLContractPackage.ENUM_LITERAL:
            return this.validateEnumLiteral((EnumLiteral) value, diagnostics, context);
        case QMLContractPackage.SET_LITERAL:
            return this.validateSetLiteral((SetLiteral) value, diagnostics, context);
        case QMLContractPackage.REFINED_QML_CONTRACT:
            return this.validateRefinedQMLContract((RefinedQMLContract) value, diagnostics, context);
        case QMLContractPackage.VALUE:
            return this.validateValue((Value) value, diagnostics, context);
        case QMLContractPackage.DETERMINISTIC_EVALUATION_ASPECT:
            return this.validateDeterministicEvaluationAspect((DeterministicEvaluationAspect) value, diagnostics,
                    context);
        case QMLContractPackage.OBJECTIVE:
            return this.validateObjective((Objective) value, diagnostics, context);
        case QMLContractPackage.CONSTRAINT:
            return this.validateConstraint((Constraint) value, diagnostics, context);
        case QMLContractPackage.RESTRICTION:
            return this.validateRestriction((Restriction) value, diagnostics, context);
        case QMLContractPackage.GOAL:
            return this.validateGoal((Goal) value, diagnostics, context);
        case QMLContractPackage.GENERIC_QML_CONTRACT:
            return this.validateGenericQMLContract((GenericQMLContract) value, diagnostics, context);
        case QMLContractPackage.ENUM_OPERATOR:
            return this.validateEnumOperator((EnumOperator) value, diagnostics, context);
        case QMLContractPackage.ENUM_RANGE_VALUE_TYPE:
            return this.validateEnumRangeValueType((EnumRangeValueType) value, diagnostics, context);
        default:
            return true;
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSimpleQMLContract(final SimpleQMLContract simpleQMLContract,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(simpleQMLContract, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(simpleQMLContract, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(simpleQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateSimpleQMLContract_all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(simpleQMLContract,
                    diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the all_DIMENSIONs_must_be_from_same_CONTRACTTYPE constraint of '
     * <em>Simple QML Contract</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSimpleQMLContract_all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(
            final SimpleQMLContract simpleQMLContract, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return simpleQMLContract.all_DIMENSIONs_must_be_from_same_CONTRACTTYPE(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCriterion(final Criterion criterion, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(criterion, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(criterion, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(criterion, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this
                    .validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(criterion, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_Only_OBJECTIVES_have_GOALS(criterion, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the Only_CONSTRAINTS_have_RESTRICTIONS constraint of '<em>Criterion</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(final Criterion criterion,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return criterion.Only_CONSTRAINTS_have_RESTRICTIONS(diagnostics, context);
    }

    /**
     * Validates the FREQUENCY_only_possible_if_DIMENSION_is_ordered constraint of '
     * <em>Criterion</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(final Criterion criterion,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return criterion.FREQUENCY_only_possible_if_DIMENSION_is_ordered(diagnostics, context);
    }

    /**
     * Validates the POINTESTIMATOR_only_for_numeric_dimensions constraint of '<em>Criterion</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(final Criterion criterion,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return criterion.POINTESTIMATOR_only_for_numeric_dimensions(diagnostics, context);
    }

    /**
     * Validates the Only_OBJECTIVES_have_GOALS constraint of '<em>Criterion</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateCriterion_Only_OBJECTIVES_have_GOALS(final Criterion criterion,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return criterion.Only_OBJECTIVES_have_GOALS(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEvaluationAspect(final EvaluationAspect evaluationAspect, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(evaluationAspect, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(evaluationAspect, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(evaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(evaluationAspect, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(evaluationAspect,
                    diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the FREQUENCY_LIMIT_must_be_NUMERIC constraint of '<em>Evaluation Aspect</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(final EvaluationAspect evaluationAspect,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return evaluationAspect.FREQUENCY_LIMIT_must_be_NUMERIC(diagnostics, context);
    }

    /**
     * Validates the FREQUENCY_LIMIT_must_be_between_0_and_100 constraint of '
     * <em>Evaluation Aspect</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(
            final EvaluationAspect evaluationAspect, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return evaluationAspect.FREQUENCY_LIMIT_must_be_between_0_and_100(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateAspectRequirement(final AspectRequirement aspectRequirement,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(aspectRequirement, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateValueLiteral(final ValueLiteral valueLiteral, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(valueLiteral, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePercentile(final Percentile percentile, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(percentile, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(percentile, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(percentile, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(percentile, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validatePercentile_PERCENTILE_between_0_and_100(percentile, diagnostics, context);
        }
        return result;
    }

    /**
     * Validates the PERCENTILE_between_0_and_100 constraint of '<em>Percentile</em>'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePercentile_PERCENTILE_between_0_and_100(final Percentile percentile,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return percentile.PERCENTILE_between_0_and_100(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validatePointEstimator(final PointEstimator pointEstimator, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(pointEstimator, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(pointEstimator, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(pointEstimator, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(pointEstimator, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(pointEstimator,
                    diagnostics,
                    context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateStochasticEvaluationAspect(final StochasticEvaluationAspect stochasticEvaluationAspect,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(stochasticEvaluationAspect, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(stochasticEvaluationAspect, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(stochasticEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(stochasticEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(stochasticEvaluationAspect, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(stochasticEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(stochasticEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(stochasticEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(stochasticEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(stochasticEvaluationAspect,
                    diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(
                    stochasticEvaluationAspect,
                    diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateFrequency(final Frequency frequency, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(frequency, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(frequency, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(frequency, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(frequency, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateFrequency_range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(frequency,
                    diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT constraint of '
     * <em>Frequency</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateFrequency_range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(final Frequency frequency,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return frequency.range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRangeValue(final RangeValue rangeValue, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(rangeValue, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateMean(final Mean mean, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(mean, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(mean, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(mean, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(mean, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateVariance(final Variance variance, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(variance, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(variance, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(variance, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(variance, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateNumericLiteral(final NumericLiteral numericLiteral, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(numericLiteral, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEnumLiteral(final EnumLiteral enumLiteral, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(enumLiteral, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateSetLiteral(final SetLiteral setLiteral, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(setLiteral, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRefinedQMLContract(final RefinedQMLContract refinedQMLContract,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(refinedQMLContract, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(refinedQMLContract, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(refinedQMLContract, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateRefinedQMLContract_contract_cannot_refine_itself(refinedQMLContract, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the contract_cannot_refine_itself constraint of '<em>Refined QML Contract</em>'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRefinedQMLContract_contract_cannot_refine_itself(
            final RefinedQMLContract refinedQMLContract,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return refinedQMLContract.contract_cannot_refine_itself(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateValue(final Value value, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(value, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(value, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(value, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(value, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateDeterministicEvaluationAspect(
            final DeterministicEvaluationAspect deterministicEvaluationAspect,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(deterministicEvaluationAspect, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(deterministicEvaluationAspect, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(deterministicEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(deterministicEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(deterministicEvaluationAspect, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(deterministicEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(deterministicEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(deterministicEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(deterministicEvaluationAspect, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_NUMERIC(deterministicEvaluationAspect,
                    diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateEvaluationAspect_FREQUENCY_LIMIT_must_be_between_0_and_100(
                    deterministicEvaluationAspect,
                    diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateObjective(final Objective objective, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(objective, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(objective, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(objective, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this
                    .validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(objective, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_Only_OBJECTIVES_have_GOALS(objective, diagnostics, context);
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateConstraint(final Constraint constraint, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (!this.validate_NoCircularContainment(constraint, diagnostics, context)) {
            return false;
        }
        boolean result = this.validate_EveryMultiplicityConforms(constraint, diagnostics, context);
        if (result || diagnostics != null) {
            result &= this.validate_EveryDataValueConforms(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryReferenceIsContained(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryBidirectionalReferenceIsPaired(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryProxyResolves(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_UniqueID(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryKeyUnique(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validate_EveryMapEntryUnique(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_Only_CONSTRAINTS_have_RESTRICTIONS(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_FREQUENCY_only_possible_if_DIMENSION_is_ordered(constraint, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_POINTESTIMATOR_only_for_numeric_dimensions(constraint, diagnostics,
                    context);
        }
        if (result || diagnostics != null) {
            result &= this.validateCriterion_Only_OBJECTIVES_have_GOALS(constraint, diagnostics, context);
        }
        if (result || diagnostics != null) {
            result &= this.validateConstraint_All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS(constraint, diagnostics,
                    context);
        }
        return result;
    }

    /**
     * Validates the All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS constraint of '<em>Constraint</em>
     * '. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateConstraint_All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS(final Constraint constraint,
            final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return constraint.All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS(diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateRestriction(final Restriction restriction, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(restriction, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateGoal(final Goal goal, final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(goal, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateGenericQMLContract(final GenericQMLContract genericQMLContract,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return this.validate_EveryDefaultConstraint(genericQMLContract, diagnostics, context);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEnumOperator(final EnumOperator enumOperator, final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean validateEnumRangeValueType(final EnumRangeValueType enumRangeValueType,
            final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        return true;
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

} // QMLContractValidator
