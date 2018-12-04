/**
 */
package featureObjective.impl;

import FeatureCompletionModel.impl.NamedElementImpl;

import featureObjective.Feature;
import featureObjective.FeatureGroup;
import featureObjective.FeatureObjectivePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.impl.FeatureImpl#getFeaturegroup <em>Featuregroup</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends NamedElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getFeaturegroup() <em>Featuregroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeaturegroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureGroup featuregroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureObjectivePackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup getFeaturegroup() {
		if (featuregroup != null && featuregroup.eIsProxy()) {
			InternalEObject oldFeaturegroup = (InternalEObject)featuregroup;
			featuregroup = (FeatureGroup)eResolveProxy(oldFeaturegroup);
			if (featuregroup != oldFeaturegroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureObjectivePackage.FEATURE__FEATUREGROUP, oldFeaturegroup, featuregroup));
			}
		}
		return featuregroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup basicGetFeaturegroup() {
		return featuregroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeaturegroup(FeatureGroup newFeaturegroup) {
		FeatureGroup oldFeaturegroup = featuregroup;
		featuregroup = newFeaturegroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureObjectivePackage.FEATURE__FEATUREGROUP, oldFeaturegroup, featuregroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				if (resolve) return getFeaturegroup();
				return basicGetFeaturegroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				setFeaturegroup((FeatureGroup)newValue);
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
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				setFeaturegroup((FeatureGroup)null);
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
			case FeatureObjectivePackage.FEATURE__FEATUREGROUP:
				return featuregroup != null;
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
