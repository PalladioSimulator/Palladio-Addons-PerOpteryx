/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.*;
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
 * @generated
 */
public class QMLContractFactoryImpl extends EFactoryImpl implements QMLContractFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static QMLContractFactory init() {
		try {
			QMLContractFactory theQMLContractFactory = (QMLContractFactory) EPackage.Registry.INSTANCE
					.getEFactory(QMLContractPackage.eNS_URI);
			if (theQMLContractFactory != null) {
				return theQMLContractFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QMLContractFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case QMLContractPackage.SIMPLE_QML_CONTRACT:
			return createSimpleQMLContract();
		case QMLContractPackage.PERCENTILE:
			return createPercentile();
		case QMLContractPackage.FREQUENCY:
			return createFrequency();
		case QMLContractPackage.RANGE_VALUE:
			return createRangeValue();
		case QMLContractPackage.MEAN:
			return createMean();
		case QMLContractPackage.VARIANCE:
			return createVariance();
		case QMLContractPackage.NUMERIC_LITERAL:
			return createNumericLiteral();
		case QMLContractPackage.ENUM_LITERAL:
			return createEnumLiteral();
		case QMLContractPackage.SET_LITERAL:
			return createSetLiteral();
		case QMLContractPackage.REFINED_QML_CONTRACT:
			return createRefinedQMLContract();
		case QMLContractPackage.VALUE:
			return createValue();
		case QMLContractPackage.OBJECTIVE:
			return createObjective();
		case QMLContractPackage.CONSTRAINT:
			return createConstraint();
		case QMLContractPackage.RESTRICTION:
			return createRestriction();
		case QMLContractPackage.GOAL:
			return createGoal();
		case QMLContractPackage.SCALE_LITERAL:
			return createScaleLiteral();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case QMLContractPackage.ENUM_OPERATOR:
			return createEnumOperatorFromString(eDataType, initialValue);
		case QMLContractPackage.ENUM_RANGE_VALUE_TYPE:
			return createEnumRangeValueTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case QMLContractPackage.ENUM_OPERATOR:
			return convertEnumOperatorToString(eDataType, instanceValue);
		case QMLContractPackage.ENUM_RANGE_VALUE_TYPE:
			return convertEnumRangeValueTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SimpleQMLContract createSimpleQMLContract() {
		SimpleQMLContractImpl simpleQMLContract = new SimpleQMLContractImpl();
		return simpleQMLContract;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Percentile createPercentile() {
		PercentileImpl percentile = new PercentileImpl();
		return percentile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Frequency createFrequency() {
		FrequencyImpl frequency = new FrequencyImpl();
		return frequency;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeValue createRangeValue() {
		RangeValueImpl rangeValue = new RangeValueImpl();
		return rangeValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mean createMean() {
		MeanImpl mean = new MeanImpl();
		return mean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variance createVariance() {
		VarianceImpl variance = new VarianceImpl();
		return variance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericLiteral createNumericLiteral() {
		NumericLiteralImpl numericLiteral = new NumericLiteralImpl();
		return numericLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumLiteral createEnumLiteral() {
		EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SetLiteral createSetLiteral() {
		SetLiteralImpl setLiteral = new SetLiteralImpl();
		return setLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefinedQMLContract createRefinedQMLContract() {
		RefinedQMLContractImpl refinedQMLContract = new RefinedQMLContractImpl();
		return refinedQMLContract;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Objective createObjective() {
		ObjectiveImpl objective = new ObjectiveImpl();
		return objective;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Constraint createConstraint() {
		ConstraintImpl constraint = new ConstraintImpl();
		return constraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Restriction createRestriction() {
		RestrictionImpl restriction = new RestrictionImpl();
		return restriction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public <T extends Number> ScaleLiteral<T> createScaleLiteral() {
		ScaleLiteralImpl<T> scaleLiteral = new ScaleLiteralImpl<T>();
		return scaleLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnumOperator createEnumOperatorFromString(EDataType eDataType, String initialValue) {
		EnumOperator result = EnumOperator.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRangeValueType createEnumRangeValueTypeFromString(EDataType eDataType, String initialValue) {
		EnumRangeValueType result = EnumRangeValueType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnumRangeValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QMLContractPackage getQMLContractPackage() {
		return (QMLContractPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QMLContractPackage getPackage() {
		return QMLContractPackage.eINSTANCE;
	}

} // QMLContractFactoryImpl
