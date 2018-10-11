/**
 */
package placementDescription.impl;

import FeatureCompletionModel.PlacementPolicy;

import featureSolution.Appearance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

import placementDescription.Advice;
import placementDescription.PlacementDescriptionPackage;
import placementDescription.PointCut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placementDescription.impl.AdviceImpl#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link placementDescription.impl.AdviceImpl#getAppears <em>Appears</em>}</li>
 *   <li>{@link placementDescription.impl.AdviceImpl#getPlacementPolicy <em>Placement Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdviceImpl extends NamedElementImpl implements Advice {
	/**
	 * The cached value of the '{@link #getPointCut() <em>Point Cut</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointCut()
	 * @generated
	 * @ordered
	 */
	protected PointCut pointCut;

	/**
	 * The default value of the '{@link #getAppears() <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppears()
	 * @generated
	 * @ordered
	 */
	protected static final Appearance APPEARS_EDEFAULT = Appearance.BEFORE;

	/**
	 * The cached value of the '{@link #getAppears() <em>Appears</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppears()
	 * @generated
	 * @ordered
	 */
	protected Appearance appears = APPEARS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlacementPolicy() <em>Placement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final PlacementPolicy PLACEMENT_POLICY_EDEFAULT = PlacementPolicy.MANDATORY;

	/**
	 * The cached value of the '{@link #getPlacementPolicy() <em>Placement Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementPolicy()
	 * @generated
	 * @ordered
	 */
	protected PlacementPolicy placementPolicy = PLACEMENT_POLICY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacementDescriptionPackage.Literals.ADVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut getPointCut() {
		if (pointCut != null && pointCut.eIsProxy()) {
			InternalEObject oldPointCut = (InternalEObject)pointCut;
			pointCut = (PointCut)eResolveProxy(oldPointCut);
			if (pointCut != oldPointCut) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacementDescriptionPackage.ADVICE__POINT_CUT, oldPointCut, pointCut));
			}
		}
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut basicGetPointCut() {
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointCut(PointCut newPointCut) {
		PointCut oldPointCut = pointCut;
		pointCut = newPointCut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.ADVICE__POINT_CUT, oldPointCut, pointCut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance getAppears() {
		return appears;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppears(Appearance newAppears) {
		Appearance oldAppears = appears;
		appears = newAppears == null ? APPEARS_EDEFAULT : newAppears;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.ADVICE__APPEARS, oldAppears, appears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementPolicy getPlacementPolicy() {
		return placementPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementPolicy(PlacementPolicy newPlacementPolicy) {
		PlacementPolicy oldPlacementPolicy = placementPolicy;
		placementPolicy = newPlacementPolicy == null ? PLACEMENT_POLICY_EDEFAULT : newPlacementPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.ADVICE__PLACEMENT_POLICY, oldPlacementPolicy, placementPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlacementDescriptionPackage.ADVICE__POINT_CUT:
				if (resolve) return getPointCut();
				return basicGetPointCut();
			case PlacementDescriptionPackage.ADVICE__APPEARS:
				return getAppears();
			case PlacementDescriptionPackage.ADVICE__PLACEMENT_POLICY:
				return getPlacementPolicy();
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
			case PlacementDescriptionPackage.ADVICE__POINT_CUT:
				setPointCut((PointCut)newValue);
				return;
			case PlacementDescriptionPackage.ADVICE__APPEARS:
				setAppears((Appearance)newValue);
				return;
			case PlacementDescriptionPackage.ADVICE__PLACEMENT_POLICY:
				setPlacementPolicy((PlacementPolicy)newValue);
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
			case PlacementDescriptionPackage.ADVICE__POINT_CUT:
				setPointCut((PointCut)null);
				return;
			case PlacementDescriptionPackage.ADVICE__APPEARS:
				setAppears(APPEARS_EDEFAULT);
				return;
			case PlacementDescriptionPackage.ADVICE__PLACEMENT_POLICY:
				setPlacementPolicy(PLACEMENT_POLICY_EDEFAULT);
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
			case PlacementDescriptionPackage.ADVICE__POINT_CUT:
				return pointCut != null;
			case PlacementDescriptionPackage.ADVICE__APPEARS:
				return appears != APPEARS_EDEFAULT;
			case PlacementDescriptionPackage.ADVICE__PLACEMENT_POLICY:
				return placementPolicy != PLACEMENT_POLICY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (appears: ");
		result.append(appears);
		result.append(", placementPolicy: ");
		result.append(placementPolicy);
		result.append(')');
		return result.toString();
	}

} //AdviceImpl
