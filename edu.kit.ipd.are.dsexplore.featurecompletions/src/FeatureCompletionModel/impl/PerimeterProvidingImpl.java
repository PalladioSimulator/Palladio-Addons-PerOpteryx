/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.PerimeterProviding;

import featureObjective.Feature;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perimeter Providing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.PerimeterProvidingImpl#getFeatureProviding <em>Feature Providing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerimeterProvidingImpl extends NamedElementImpl implements PerimeterProviding {
	/**
	 * The cached value of the '{@link #getFeatureProviding() <em>Feature Providing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureProviding()
	 * @generated
	 * @ordered
	 */
	protected EList featureProviding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerimeterProvidingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.PERIMETER_PROVIDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFeatureProviding() {
		if (featureProviding == null) {
			featureProviding = new EObjectResolvingEList(Feature.class, this, FeatureCompletionPackage.PERIMETER_PROVIDING__FEATURE_PROVIDING);
		}
		return featureProviding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureCompletionPackage.PERIMETER_PROVIDING__FEATURE_PROVIDING:
				return getFeatureProviding();
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
			case FeatureCompletionPackage.PERIMETER_PROVIDING__FEATURE_PROVIDING:
				getFeatureProviding().clear();
				getFeatureProviding().addAll((Collection)newValue);
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
			case FeatureCompletionPackage.PERIMETER_PROVIDING__FEATURE_PROVIDING:
				getFeatureProviding().clear();
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
			case FeatureCompletionPackage.PERIMETER_PROVIDING__FEATURE_PROVIDING:
				return featureProviding != null && !featureProviding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PerimeterProvidingImpl
