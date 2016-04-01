/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.EnumRangeValueType;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.ValueLiteral;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.RangeValueImpl#getRangeLimitLiteral <em>Range Limit Literal</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contract.impl.RangeValueImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RangeValueImpl extends IdentifierImpl implements RangeValue {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final EnumRangeValueType TYPE_EDEFAULT = EnumRangeValueType.INCLUSIVE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractPackage.Literals.RANGE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueLiteral getRangeLimitLiteral() {
		return (ValueLiteral)eDynamicGet(QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL, QMLContractPackage.Literals.RANGE_VALUE__RANGE_LIMIT_LITERAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRangeLimitLiteral(ValueLiteral newRangeLimitLiteral, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRangeLimitLiteral, QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRangeLimitLiteral(ValueLiteral newRangeLimitLiteral) {
		eDynamicSet(QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL, QMLContractPackage.Literals.RANGE_VALUE__RANGE_LIMIT_LITERAL, newRangeLimitLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRangeValueType getType() {
		return (EnumRangeValueType)eDynamicGet(QMLContractPackage.RANGE_VALUE__TYPE, QMLContractPackage.Literals.RANGE_VALUE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EnumRangeValueType newType) {
		eDynamicSet(QMLContractPackage.RANGE_VALUE__TYPE, QMLContractPackage.Literals.RANGE_VALUE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
				return basicSetRangeLimitLiteral(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
				return getRangeLimitLiteral();
			case QMLContractPackage.RANGE_VALUE__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
				setRangeLimitLiteral((ValueLiteral)newValue);
				return;
			case QMLContractPackage.RANGE_VALUE__TYPE:
				setType((EnumRangeValueType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
				setRangeLimitLiteral((ValueLiteral)null);
				return;
			case QMLContractPackage.RANGE_VALUE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QMLContractPackage.RANGE_VALUE__RANGE_LIMIT_LITERAL:
				return getRangeLimitLiteral() != null;
			case QMLContractPackage.RANGE_VALUE__TYPE:
				return getType() != TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RangeValueImpl
