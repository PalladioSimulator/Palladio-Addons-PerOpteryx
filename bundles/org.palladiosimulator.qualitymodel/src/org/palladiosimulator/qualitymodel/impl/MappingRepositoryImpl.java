/**
 */
package org.palladiosimulator.qualitymodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.palladiosimulator.qualitymodel.Mapping;
import org.palladiosimulator.qualitymodel.MappingRepository;
import org.palladiosimulator.qualitymodel.QualityModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.MappingRepositoryImpl#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingRepositoryImpl extends MinimalEObjectImpl.Container implements MappingRepository {
	/**
	 * The cached value of the '{@link #getMappings() <em>Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappings()
	 * @generated
	 * @ordered
	 */
	protected EList mappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.MAPPING_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getMappings() {
		if (mappings == null) {
			mappings = new EObjectContainmentEList(Mapping.class, this, QualityModelPackage.MAPPING_REPOSITORY__MAPPINGS);
		}
		return mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.MAPPING_REPOSITORY__MAPPINGS:
				return ((InternalEList)getMappings()).basicRemove(otherEnd, msgs);
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
			case QualityModelPackage.MAPPING_REPOSITORY__MAPPINGS:
				return getMappings();
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
			case QualityModelPackage.MAPPING_REPOSITORY__MAPPINGS:
				getMappings().clear();
				getMappings().addAll((Collection)newValue);
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
			case QualityModelPackage.MAPPING_REPOSITORY__MAPPINGS:
				getMappings().clear();
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
			case QualityModelPackage.MAPPING_REPOSITORY__MAPPINGS:
				return mappings != null && !mappings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappingRepositoryImpl
