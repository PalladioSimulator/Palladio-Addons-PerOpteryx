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
import org.palladiosimulator.qualitymodel.Transformation;
import org.palladiosimulator.qualitymodel.TransformationRepository;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.impl.TransformationRepositoryImpl#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationRepositoryImpl extends MinimalEObjectImpl.Container implements TransformationRepository {
	/**
	 * The cached value of the '{@link #getTransformations() <em>Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList transformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return QualityModelPackage.Literals.TRANSFORMATION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransformations() {
		if (transformations == null) {
			transformations = new EObjectContainmentEList(Transformation.class, this, QualityModelPackage.TRANSFORMATION_REPOSITORY__TRANSFORMATIONS);
		}
		return transformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QualityModelPackage.TRANSFORMATION_REPOSITORY__TRANSFORMATIONS:
				return ((InternalEList)getTransformations()).basicRemove(otherEnd, msgs);
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
			case QualityModelPackage.TRANSFORMATION_REPOSITORY__TRANSFORMATIONS:
				return getTransformations();
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
			case QualityModelPackage.TRANSFORMATION_REPOSITORY__TRANSFORMATIONS:
				getTransformations().clear();
				getTransformations().addAll((Collection)newValue);
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
			case QualityModelPackage.TRANSFORMATION_REPOSITORY__TRANSFORMATIONS:
				getTransformations().clear();
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
			case QualityModelPackage.TRANSFORMATION_REPOSITORY__TRANSFORMATIONS:
				return transformations != null && !transformations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransformationRepositoryImpl
