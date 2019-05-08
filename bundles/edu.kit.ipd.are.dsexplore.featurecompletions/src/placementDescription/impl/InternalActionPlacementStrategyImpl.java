/**
 */
package placementDescription.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

import placementDescription.InternalActionPlacementStrategy;
import placementDescription.PlacementDescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Action Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placementDescription.impl.InternalActionPlacementStrategyImpl#getForAllInternalActionsIn <em>For All Internal Actions In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalActionPlacementStrategyImpl extends PlacementStrategyImpl implements InternalActionPlacementStrategy {
	/**
	 * The cached value of the '{@link #getForAllInternalActionsIn() <em>For All Internal Actions In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForAllInternalActionsIn()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent forAllInternalActionsIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalActionPlacementStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacementDescriptionPackage.Literals.INTERNAL_ACTION_PLACEMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getForAllInternalActionsIn() {
		if (forAllInternalActionsIn != null && ((EObject)forAllInternalActionsIn).eIsProxy()) {
			InternalEObject oldForAllInternalActionsIn = (InternalEObject)forAllInternalActionsIn;
			forAllInternalActionsIn = (RepositoryComponent)eResolveProxy(oldForAllInternalActionsIn);
			if (forAllInternalActionsIn != oldForAllInternalActionsIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN, oldForAllInternalActionsIn, forAllInternalActionsIn));
			}
		}
		return forAllInternalActionsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetForAllInternalActionsIn() {
		return forAllInternalActionsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForAllInternalActionsIn(RepositoryComponent newForAllInternalActionsIn) {
		RepositoryComponent oldForAllInternalActionsIn = forAllInternalActionsIn;
		forAllInternalActionsIn = newForAllInternalActionsIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN, oldForAllInternalActionsIn, forAllInternalActionsIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN:
				if (resolve) return getForAllInternalActionsIn();
				return basicGetForAllInternalActionsIn();
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
			case PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN:
				setForAllInternalActionsIn((RepositoryComponent)newValue);
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
			case PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN:
				setForAllInternalActionsIn((RepositoryComponent)null);
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
			case PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN:
				return forAllInternalActionsIn != null;
		}
		return super.eIsSet(featureID);
	}

} //InternalActionPlacementStrategyImpl
