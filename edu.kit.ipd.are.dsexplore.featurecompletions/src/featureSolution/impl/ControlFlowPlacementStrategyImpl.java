/**
 */
package featureSolution.impl;

import featureSolution.ControlFlowPlacementStrategy;
import featureSolution.FeatureSolutionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.seff.AbstractLoopAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.ControlFlowPlacementStrategyImpl#getMatchingControlFlow <em>Matching Control Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlFlowPlacementStrategyImpl extends PlacementStrategyImpl implements ControlFlowPlacementStrategy {
	/**
	 * The cached value of the '{@link #getMatchingControlFlow() <em>Matching Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingControlFlow()
	 * @generated
	 * @ordered
	 */
	protected AbstractLoopAction matchingControlFlow;

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
		return FeatureSolutionPackage.Literals.CONTROL_FLOW_PLACEMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLoopAction getMatchingControlFlow() {
		if (matchingControlFlow != null && ((EObject)matchingControlFlow).eIsProxy()) {
			InternalEObject oldMatchingControlFlow = (InternalEObject)matchingControlFlow;
			matchingControlFlow = (AbstractLoopAction)eResolveProxy(oldMatchingControlFlow);
			if (matchingControlFlow != oldMatchingControlFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW, oldMatchingControlFlow, matchingControlFlow));
			}
		}
		return matchingControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLoopAction basicGetMatchingControlFlow() {
		return matchingControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingControlFlow(AbstractLoopAction newMatchingControlFlow) {
		AbstractLoopAction oldMatchingControlFlow = matchingControlFlow;
		matchingControlFlow = newMatchingControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW, oldMatchingControlFlow, matchingControlFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				if (resolve) return getMatchingControlFlow();
				return basicGetMatchingControlFlow();
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
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				setMatchingControlFlow((AbstractLoopAction)newValue);
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
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				setMatchingControlFlow((AbstractLoopAction)null);
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
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW:
				return matchingControlFlow != null;
		}
		return super.eIsSet(featureID);
	}

} //ControlFlowPlacementStrategyImpl
