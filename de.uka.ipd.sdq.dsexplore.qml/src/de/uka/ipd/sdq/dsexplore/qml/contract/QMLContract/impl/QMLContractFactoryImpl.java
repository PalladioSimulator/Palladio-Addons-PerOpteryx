/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumOperator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumRangeValueType;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractFactory;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class QMLContractFactoryImpl extends EFactoryImpl implements QMLContractFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static QMLContractFactory init() {
        try
        {
            final QMLContractFactory theQMLContractFactory = (QMLContractFactory) EPackage.Registry.INSTANCE
                    .getEFactory(QMLContractPackage.eNS_URI);
            if (theQMLContractFactory != null)
            {
                return theQMLContractFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new QMLContractFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLContractFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID())
        {
        case QMLContractPackage.SIMPLE_QML_CONTRACT:
            return this.createSimpleQMLContract();
        case QMLContractPackage.PERCENTILE:
            return this.createPercentile();
        case QMLContractPackage.FREQUENCY:
            return this.createFrequency();
        case QMLContractPackage.RANGE_VALUE:
            return this.createRangeValue();
        case QMLContractPackage.MEAN:
            return this.createMean();
        case QMLContractPackage.VARIANCE:
            return this.createVariance();
        case QMLContractPackage.NUMERIC_LITERAL:
            return this.createNumericLiteral();
        case QMLContractPackage.ENUM_LITERAL:
            return this.createEnumLiteral();
        case QMLContractPackage.SET_LITERAL:
            return this.createSetLiteral();
        case QMLContractPackage.REFINED_QML_CONTRACT:
            return this.createRefinedQMLContract();
        case QMLContractPackage.VALUE:
            return this.createValue();
        case QMLContractPackage.OBJECTIVE:
            return this.createObjective();
        case QMLContractPackage.CONSTRAINT:
            return this.createConstraint();
        case QMLContractPackage.RESTRICTION:
            return this.createRestriction();
        case QMLContractPackage.GOAL:
            return this.createGoal();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object createFromString(final EDataType eDataType, final String initialValue) {
        switch (eDataType.getClassifierID())
        {
        case QMLContractPackage.ENUM_OPERATOR:
            return this.createEnumOperatorFromString(eDataType, initialValue);
        case QMLContractPackage.ENUM_RANGE_VALUE_TYPE:
            return this.createEnumRangeValueTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String convertToString(final EDataType eDataType, final Object instanceValue) {
        switch (eDataType.getClassifierID())
        {
        case QMLContractPackage.ENUM_OPERATOR:
            return this.convertEnumOperatorToString(eDataType, instanceValue);
        case QMLContractPackage.ENUM_RANGE_VALUE_TYPE:
            return this.convertEnumRangeValueTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SimpleQMLContract createSimpleQMLContract() {
        final SimpleQMLContractImpl simpleQMLContract = new SimpleQMLContractImpl();
        return simpleQMLContract;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Percentile createPercentile() {
        final PercentileImpl percentile = new PercentileImpl();
        return percentile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Frequency createFrequency() {
        final FrequencyImpl frequency = new FrequencyImpl();
        return frequency;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RangeValue createRangeValue() {
        final RangeValueImpl rangeValue = new RangeValueImpl();
        return rangeValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Mean createMean() {
        final MeanImpl mean = new MeanImpl();
        return mean;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Variance createVariance() {
        final VarianceImpl variance = new VarianceImpl();
        return variance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumericLiteral createNumericLiteral() {
        final NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
        return numericLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EnumLiteral createEnumLiteral() {
        final EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
        return enumLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SetLiteral createSetLiteral() {
        final SetLiteralImpl setLiteral = new SetLiteralImpl();
        return setLiteral;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RefinedQMLContract createRefinedQMLContract() {
        final RefinedQMLContractImpl refinedQMLContract = new RefinedQMLContractImpl();
        return refinedQMLContract;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Value createValue() {
        final ValueImpl value = new ValueImpl();
        return value;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Objective createObjective() {
        final ObjectiveImpl objective = new ObjectiveImpl();
        return objective;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Constraint createConstraint() {
        final ConstraintImpl constraint = new ConstraintImpl();
        return constraint;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Restriction createRestriction() {
        final RestrictionImpl restriction = new RestrictionImpl();
        return restriction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Goal createGoal() {
        final GoalImpl goal = new GoalImpl();
        return goal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EnumOperator createEnumOperatorFromString(final EDataType eDataType, final String initialValue) {
        final EnumOperator result = EnumOperator.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertEnumOperatorToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EnumRangeValueType createEnumRangeValueTypeFromString(final EDataType eDataType, final String initialValue) {
        final EnumRangeValueType result = EnumRangeValueType.get(initialValue);
        if (result == null) {
            throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
                    + eDataType.getName() + "'");
        }
        return result;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public String convertEnumRangeValueTypeToString(final EDataType eDataType, final Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QMLContractPackage getQMLContractPackage() {
        return (QMLContractPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static QMLContractPackage getPackage() {
        return QMLContractPackage.eINSTANCE;
    }

} // QMLContractFactoryImpl
