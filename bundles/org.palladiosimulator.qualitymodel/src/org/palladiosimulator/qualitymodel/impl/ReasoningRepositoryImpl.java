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

import org.palladiosimulator.qualitymodel.QualityModelPackage;
import org.palladiosimulator.qualitymodel.Reasoning;
import org.palladiosimulator.qualitymodel.ReasoningRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reasoning Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.ReasoningRepositoryImpl#getReasonings <em>Reasonings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReasoningRepositoryImpl extends MinimalEObjectImpl.Container implements ReasoningRepository {
	/**
	 * The cached value of the '{@link #getReasonings() <em>Reasonings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonings()
	 * @generated
	 * @ordered
	 */
	protected EList reasonings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasoningRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.REASONING_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReasonings() {
		if (reasonings == null) {
			reasonings = new EObjectContainmentEList(Reasoning.class, this, QualityModelPackage.REASONING_REPOSITORY__REASONINGS);
		}
		return reasonings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.REASONING_REPOSITORY__REASONINGS:
				return ((InternalEList)getReasonings()).basicRemove(otherEnd, msgs);
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
			case QualityModelPackage.REASONING_REPOSITORY__REASONINGS:
				return getReasonings();
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
			case QualityModelPackage.REASONING_REPOSITORY__REASONINGS:
				getReasonings().clear();
				getReasonings().addAll((Collection)newValue);
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
			case QualityModelPackage.REASONING_REPOSITORY__REASONINGS:
				getReasonings().clear();
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
			case QualityModelPackage.REASONING_REPOSITORY__REASONINGS:
				return reasonings != null && !reasonings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReasoningRepositoryImpl
