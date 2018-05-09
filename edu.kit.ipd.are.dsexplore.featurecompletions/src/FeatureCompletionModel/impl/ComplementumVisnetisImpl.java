/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.FeatureCompletionPackage;

import featureObjective.Feature;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementum Visnetis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.ComplementumVisnetisImpl#getComplementaryFeature <em>Complementary Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementumVisnetisImpl extends ComplementumImpl implements ComplementumVisnetis {
	/**
	 * The cached value of the '{@link #getComplementaryFeature() <em>Complementary Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementaryFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature complementaryFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementumVisnetisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.COMPLEMENTUM_VISNETIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getComplementaryFeature() {
		if (complementaryFeature != null && complementaryFeature.eIsProxy()) {
			InternalEObject oldComplementaryFeature = (InternalEObject)complementaryFeature;
			complementaryFeature = (Feature)eResolveProxy(oldComplementaryFeature);
			if (complementaryFeature != oldComplementaryFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureCompletionPackage.COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE, oldComplementaryFeature, complementaryFeature));
			}
		}
		return complementaryFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetComplementaryFeature() {
		return complementaryFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementaryFeature(Feature newComplementaryFeature) {
		Feature oldComplementaryFeature = complementaryFeature;
		complementaryFeature = newComplementaryFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE, oldComplementaryFeature, complementaryFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE:
				if (resolve) return getComplementaryFeature();
				return basicGetComplementaryFeature();
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
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE:
				setComplementaryFeature((Feature)newValue);
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
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE:
				setComplementaryFeature((Feature)null);
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
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE:
				return complementaryFeature != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplementumVisnetisImpl
