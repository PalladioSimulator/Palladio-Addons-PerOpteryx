/**
 */
package placementDescription.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.repository.Signature;

import placementDescription.ExternalCallPlacementStrategy;
import placementDescription.PlacementDescriptionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Call Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placementDescription.impl.ExternalCallPlacementStrategyImpl#getMatchingSignature <em>Matching Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalCallPlacementStrategyImpl extends PlacementStrategyImpl implements ExternalCallPlacementStrategy {
	/**
	 * The cached value of the '{@link #getMatchingSignature() <em>Matching Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchingSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature matchingSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalCallPlacementStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacementDescriptionPackage.Literals.EXTERNAL_CALL_PLACEMENT_STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature getMatchingSignature() {
		if (matchingSignature != null && ((EObject)matchingSignature).eIsProxy()) {
			InternalEObject oldMatchingSignature = (InternalEObject)matchingSignature;
			matchingSignature = (Signature)eResolveProxy(oldMatchingSignature);
			if (matchingSignature != oldMatchingSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE, oldMatchingSignature, matchingSignature));
			}
		}
		return matchingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetMatchingSignature() {
		return matchingSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchingSignature(Signature newMatchingSignature) {
		Signature oldMatchingSignature = matchingSignature;
		matchingSignature = newMatchingSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE, oldMatchingSignature, matchingSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE:
				if (resolve) return getMatchingSignature();
				return basicGetMatchingSignature();
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
			case PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE:
				setMatchingSignature((Signature)newValue);
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
			case PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE:
				setMatchingSignature((Signature)null);
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
			case PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE:
				return matchingSignature != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalCallPlacementStrategyImpl
