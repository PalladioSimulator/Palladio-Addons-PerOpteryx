/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.FeatureCompletionRepository;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.FeatureCompletionRepositoryImpl#getFeatureCompletions <em>Feature Completions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureCompletionRepositoryImpl extends MinimalEObjectImpl.Container implements FeatureCompletionRepository {
	/**
	 * The cached value of the '{@link #getFeatureCompletions() <em>Feature Completions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCompletions()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureCompletion> featureCompletions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureCompletionRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.FEATURE_COMPLETION_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureCompletion> getFeatureCompletions() {
		if (featureCompletions == null) {
			featureCompletions = new EObjectContainmentEList<FeatureCompletion>(FeatureCompletion.class, this, FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS);
		}
		return featureCompletions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS:
				return ((InternalEList<?>)getFeatureCompletions()).basicRemove(otherEnd, msgs);
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
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS:
				return getFeatureCompletions();
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
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS:
				getFeatureCompletions().clear();
				getFeatureCompletions().addAll((Collection<? extends FeatureCompletion>)newValue);
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
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS:
				getFeatureCompletions().clear();
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
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS:
				return featureCompletions != null && !featureCompletions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureCompletionRepositoryImpl
