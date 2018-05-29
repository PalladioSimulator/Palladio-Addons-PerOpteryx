/**
 */
package featureSolution.impl;

import featureSolution.FeatureSolutionPackage;
import featureSolution.PlacementStrategy;
import featureSolution.PointCut;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.PointCutImpl#getPlacementStrategy <em>Placement Strategy</em>}</li>
 *   <li>{@link featureSolution.impl.PointCutImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointCutImpl extends MinimalEObjectImpl.Container implements PointCut {
	/**
	 * The cached value of the '{@link #getPlacementStrategy() <em>Placement Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementStrategy()
	 * @generated
	 * @ordered
	 */
	protected PlacementStrategy placementStrategy;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointCutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.POINT_CUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementStrategy getPlacementStrategy() {
		return placementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlacementStrategy(PlacementStrategy newPlacementStrategy, NotificationChain msgs) {
		PlacementStrategy oldPlacementStrategy = placementStrategy;
		placementStrategy = newPlacementStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY, oldPlacementStrategy, newPlacementStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlacementStrategy(PlacementStrategy newPlacementStrategy) {
		if (newPlacementStrategy != placementStrategy) {
			NotificationChain msgs = null;
			if (placementStrategy != null)
				msgs = ((InternalEObject)placementStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY, null, msgs);
			if (newPlacementStrategy != null)
				msgs = ((InternalEObject)newPlacementStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY, null, msgs);
			msgs = basicSetPlacementStrategy(newPlacementStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY, newPlacementStrategy, newPlacementStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.POINT_CUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY:
				return basicSetPlacementStrategy(null, msgs);
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
			case FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY:
				return getPlacementStrategy();
			case FeatureSolutionPackage.POINT_CUT__NAME:
				return getName();
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
			case FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY:
				setPlacementStrategy((PlacementStrategy)newValue);
				return;
			case FeatureSolutionPackage.POINT_CUT__NAME:
				setName((String)newValue);
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
			case FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY:
				setPlacementStrategy((PlacementStrategy)null);
				return;
			case FeatureSolutionPackage.POINT_CUT__NAME:
				setName(NAME_EDEFAULT);
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
			case FeatureSolutionPackage.POINT_CUT__PLACEMENT_STRATEGY:
				return placementStrategy != null;
			case FeatureSolutionPackage.POINT_CUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PointCutImpl
