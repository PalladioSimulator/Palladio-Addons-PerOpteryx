/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeScale;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EScaleOfMeasure;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type Scale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeScaleImpl#getScaleElements <em>Scale Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeScaleImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionTypeScaleImpl<T extends Number> extends DimensionTypeImpl implements DimensionTypeScale<T> {
	/**
	 * The cached value of the '{@link #getScaleElements() <em>Scale Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleElements()
	 * @generated
	 * @ordered
	 */
	protected EList<T> scaleElements;

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
	protected DimensionTypeScaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<T> getScaleElements() {
		if (scaleElements == null) {
			scaleElements = new EObjectContainmentEList<T>(EObject.class, this, QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS);
		}
		return scaleElements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
			return ((InternalEList<?>) getScaleElements()).basicRemove(otherEnd, msgs);
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
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
			return getScaleElements();
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE:
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
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
			getScaleElements().clear();
			getScaleElements().addAll((Collection<? extends T>) newValue);
			return;
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE:
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
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
			getScaleElements().clear();
			return;
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE:
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
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
			return scaleElements != null && !scaleElements.isEmpty();
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE:
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
		result.append(" (scale: ");
		result.append(scale);
		result.append(')');
		return result.toString();
	}

} //DimensionTypeScaleImpl
