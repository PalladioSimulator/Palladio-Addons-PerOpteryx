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

import org.palladiosimulator.qualitymodel.Mapping;
import org.palladiosimulator.qualitymodel.MappingEntry;
import org.palladiosimulator.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.MappingImpl#getMappingEntries <em>Mapping Entries</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.MappingImpl#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends EntityImpl implements Mapping {
	/**
	 * The cached value of the '{@link #getMappingEntries() <em>Mapping Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingEntries()
	 * @generated
	 * @ordered
	 */
	protected EList mappingEntries;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected ValueLiteral identity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMappingEntries() {
		if (mappingEntries == null) {
			mappingEntries = new EObjectContainmentEList(MappingEntry.class, this, QualityModelPackage.MAPPING__MAPPING_ENTRIES);
		}
		return mappingEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueLiteral getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentity(ValueLiteral newIdentity, NotificationChain msgs) {
		ValueLiteral oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QualityModelPackage.MAPPING__IDENTITY, oldIdentity, newIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(ValueLiteral newIdentity) {
		if (newIdentity != identity) {
			NotificationChain msgs = null;
			if (identity != null)
				msgs = ((InternalEObject)identity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QualityModelPackage.MAPPING__IDENTITY, null, msgs);
			if (newIdentity != null)
				msgs = ((InternalEObject)newIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QualityModelPackage.MAPPING__IDENTITY, null, msgs);
			msgs = basicSetIdentity(newIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QualityModelPackage.MAPPING__IDENTITY, newIdentity, newIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString(); final StringBuilder builder = new StringBuilder("Mapping ["); builder.append(identity instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) identity).getValues().get(0).getEntityName() : identity.getId()).append(",("); for (final Object object : mappingEntries) builder.append(object.toString()); return builder.append(")]").toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.MAPPING__MAPPING_ENTRIES:
				return ((InternalEList)getMappingEntries()).basicRemove(otherEnd, msgs);
			case QualityModelPackage.MAPPING__IDENTITY:
				return basicSetIdentity(null, msgs);
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
			case QualityModelPackage.MAPPING__MAPPING_ENTRIES:
				return getMappingEntries();
			case QualityModelPackage.MAPPING__IDENTITY:
				return getIdentity();
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
			case QualityModelPackage.MAPPING__MAPPING_ENTRIES:
				getMappingEntries().clear();
				getMappingEntries().addAll((Collection)newValue);
				return;
			case QualityModelPackage.MAPPING__IDENTITY:
				setIdentity((ValueLiteral)newValue);
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
			case QualityModelPackage.MAPPING__MAPPING_ENTRIES:
				getMappingEntries().clear();
				return;
			case QualityModelPackage.MAPPING__IDENTITY:
				setIdentity((ValueLiteral)null);
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
			case QualityModelPackage.MAPPING__MAPPING_ENTRIES:
				return mappingEntries != null && !mappingEntries.isEmpty();
			case QualityModelPackage.MAPPING__IDENTITY:
				return identity != null;
		}
		return super.eIsSet(featureID);
	}

} //MappingImpl
