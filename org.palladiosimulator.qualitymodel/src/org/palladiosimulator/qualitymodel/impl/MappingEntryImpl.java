/**
 */
package org.palladiosimulator.qualitymodel.impl;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;

import org.palladiosimulator.qualitymodel.MappingEntry;
import org.palladiosimulator.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.MappingEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.MappingEntryImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingEntryImpl extends EntityImpl implements MappingEntry {
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
	 * The cached value of the '{@link #getKey() <em>Key</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected EList key;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.MAPPING_ENTRY;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityModelPackage.MAPPING_ENTRY__VALUE, oldValue, newValue);
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
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityModelPackage.MAPPING_ENTRY__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityModelPackage.MAPPING_ENTRY__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.MAPPING_ENTRY__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getKey() {
		if (key == null) {
			key = new EObjectContainmentEList(ValueLiteral.class, this, QualityModelPackage.MAPPING_ENTRY__KEY);
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString(); final StringBuilder builder = new StringBuilder(key.size() * 3); String prefix = ""; for (final Object object : key) { builder.append(prefix); prefix = ","; builder.append(object instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) object).getValues().get(0).getEntityName() : ((ValueLiteral) object).getId()); } return builder.append("=").append( (value instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) value).getValues().get(0).getEntityName() : value.getId())) .toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.MAPPING_ENTRY__VALUE:
				return basicSetValue(null, msgs);
			case QualityModelPackage.MAPPING_ENTRY__KEY:
				return ((InternalEList)getKey()).basicRemove(otherEnd, msgs);
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
			case QualityModelPackage.MAPPING_ENTRY__VALUE:
				return getValue();
			case QualityModelPackage.MAPPING_ENTRY__KEY:
				return getKey();
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
			case QualityModelPackage.MAPPING_ENTRY__VALUE:
				setValue((ValueLiteral)newValue);
				return;
			case QualityModelPackage.MAPPING_ENTRY__KEY:
				getKey().clear();
				getKey().addAll((Collection)newValue);
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
			case QualityModelPackage.MAPPING_ENTRY__VALUE:
				setValue((ValueLiteral)null);
				return;
			case QualityModelPackage.MAPPING_ENTRY__KEY:
				getKey().clear();
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
			case QualityModelPackage.MAPPING_ENTRY__VALUE:
				return value != null;
			case QualityModelPackage.MAPPING_ENTRY__KEY:
				return key != null && !key.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingEntryImpl
