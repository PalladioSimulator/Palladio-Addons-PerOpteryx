/**
 */
package org.palladiosimulator.qualitymodel.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.qualitymodel.Nqr;
import org.palladiosimulator.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nqr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.NqrImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.NqrImpl#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NqrImpl extends EntityImpl implements Nqr {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected ValueLiteral value;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected Dimension dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NqrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.NQR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueLiteral getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(ValueLiteral newValue, NotificationChain msgs) {
		ValueLiteral oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityModelPackage.NQR__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(ValueLiteral newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityModelPackage.NQR__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityModelPackage.NQR__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.NQR__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension getDimension() {
		if (dimension != null && dimension.eIsProxy()) {
			InternalEObject oldDimension = (InternalEObject)dimension;
			dimension = (Dimension)eResolveProxy(oldDimension);
			if (dimension != oldDimension) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QualityModelPackage.NQR__DIMENSION, oldDimension, dimension));
			}
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension basicGetDimension() {
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimension(Dimension newDimension) {
		Dimension oldDimension = dimension;
		dimension = newDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.NQR__DIMENSION, oldDimension, dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString(); return "Nqr (" + dimension.getEntityName() + " = " + (value instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) value).getValues().get(0).getEntityName() : value.getId()) + ")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.NQR__VALUE:
				return basicSetValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QualityModelPackage.NQR__VALUE:
				return getValue();
			case QualityModelPackage.NQR__DIMENSION:
				if (resolve) return getDimension();
				return basicGetDimension();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QualityModelPackage.NQR__VALUE:
				setValue((ValueLiteral)newValue);
				return;
			case QualityModelPackage.NQR__DIMENSION:
				setDimension((Dimension)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case QualityModelPackage.NQR__VALUE:
				setValue((ValueLiteral)null);
				return;
			case QualityModelPackage.NQR__DIMENSION:
				setDimension((Dimension)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case QualityModelPackage.NQR__VALUE:
				return value != null;
			case QualityModelPackage.NQR__DIMENSION:
				return dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //NqrImpl
