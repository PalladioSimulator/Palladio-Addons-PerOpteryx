/**
 */
package placementDescription.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.RepositoryComponent;

import placementDescription.ControlFlowPlacementStrategy;
import placementDescription.PlacementDescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placementDescription.impl.ControlFlowPlacementStrategyImpl#getForAllControlFlowsIn <em>For All Control Flows In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowPlacementStrategyImpl extends PlacementStrategyImpl implements ControlFlowPlacementStrategy {
	/**
	 * The cached value of the '{@link #getForAllControlFlowsIn() <em>For All Control Flows In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForAllControlFlowsIn()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent forAllControlFlowsIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowPlacementStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacementDescriptionPackage.Literals.CONTROL_FLOW_PLACEMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getForAllControlFlowsIn() {
		if (forAllControlFlowsIn != null && ((EObject)forAllControlFlowsIn).eIsProxy()) {
			InternalEObject oldForAllControlFlowsIn = (InternalEObject)forAllControlFlowsIn;
			forAllControlFlowsIn = (RepositoryComponent)eResolveProxy(oldForAllControlFlowsIn);
			if (forAllControlFlowsIn != oldForAllControlFlowsIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN, oldForAllControlFlowsIn, forAllControlFlowsIn));
			}
		}
		return forAllControlFlowsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetForAllControlFlowsIn() {
		return forAllControlFlowsIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForAllControlFlowsIn(RepositoryComponent newForAllControlFlowsIn) {
		RepositoryComponent oldForAllControlFlowsIn = forAllControlFlowsIn;
		forAllControlFlowsIn = newForAllControlFlowsIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN, oldForAllControlFlowsIn, forAllControlFlowsIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN:
				if (resolve) return getForAllControlFlowsIn();
				return basicGetForAllControlFlowsIn();
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
			case PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN:
				setForAllControlFlowsIn((RepositoryComponent)newValue);
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
			case PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN:
				setForAllControlFlowsIn((RepositoryComponent)null);
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
			case PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN:
				return forAllControlFlowsIn != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlFlowPlacementStrategyImpl
