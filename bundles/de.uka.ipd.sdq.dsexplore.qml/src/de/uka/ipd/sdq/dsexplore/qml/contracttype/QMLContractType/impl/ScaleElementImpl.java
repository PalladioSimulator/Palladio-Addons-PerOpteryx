/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EScaleOfMeasure;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.ScaleElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scale Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.ScaleElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.ScaleElementImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScaleElementImpl<T extends Number> extends ElementImpl implements ScaleElement<T> {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected T value;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final EScaleOfMeasure SCALE_EDEFAULT = EScaleOfMeasure.ORDINAL;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected EScaleOfMeasure scale = SCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScaleElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractTypePackage.Literals.SCALE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(T newValue) {
		T oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.SCALE_ELEMENT__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EScaleOfMeasure getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScale(EScaleOfMeasure newScale) {
		EScaleOfMeasure oldScale = scale;
		scale = newScale == null ? SCALE_EDEFAULT : newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.SCALE_ELEMENT__SCALE, oldScale,
					scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case QMLContractTypePackage.SCALE_ELEMENT__VALUE:
			return getValue();
		case QMLContractTypePackage.SCALE_ELEMENT__SCALE:
			return getScale();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case QMLContractTypePackage.SCALE_ELEMENT__VALUE:
			setValue((T) newValue);
			return;
		case QMLContractTypePackage.SCALE_ELEMENT__SCALE:
			setScale((EScaleOfMeasure) newValue);
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
		case QMLContractTypePackage.SCALE_ELEMENT__VALUE:
			setValue((T) null);
			return;
		case QMLContractTypePackage.SCALE_ELEMENT__SCALE:
			setScale(SCALE_EDEFAULT);
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
		case QMLContractTypePackage.SCALE_ELEMENT__VALUE:
			return value != null;
		case QMLContractTypePackage.SCALE_ELEMENT__SCALE:
			return scale != SCALE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(", scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //ScaleElementImpl
