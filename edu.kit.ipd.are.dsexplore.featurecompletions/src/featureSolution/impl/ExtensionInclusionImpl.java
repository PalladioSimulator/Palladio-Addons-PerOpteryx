/**
 */
package featureSolution.impl;

import featureSolution.Appearance;
import featureSolution.ExtensionInclusion;
import featureSolution.FeatureSolutionPackage;
import featureSolution.PlacementStrategy;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.ExtensionInclusionImpl#getAppears <em>Appears</em>}</li>
 *   <li>{@link featureSolution.impl.ExtensionInclusionImpl#getPlacementStrategy <em>Placement Strategy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionInclusionImpl extends InclusionMechanismImpl implements ExtensionInclusion {
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
	 * The cached value of the '{@link #getPlacementStrategy() <em>Placement Strategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlacementStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<PlacementStrategy> placementStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.EXTENSION_INCLUSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.EXTENSION_INCLUSION__APPEARS, oldAppears, appears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlacementStrategy> getPlacementStrategy() {
		if (placementStrategy == null) {
			placementStrategy = new EObjectContainmentEList<PlacementStrategy>(PlacementStrategy.class, this, FeatureSolutionPackage.EXTENSION_INCLUSION__PLACEMENT_STRATEGY);
		}
		return placementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.EXTENSION_INCLUSION__PLACEMENT_STRATEGY:
				return ((InternalEList<?>)getPlacementStrategy()).basicRemove(otherEnd, msgs);
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__APPEARS:
				return getAppears();
			case FeatureSolutionPackage.EXTENSION_INCLUSION__PLACEMENT_STRATEGY:
				return getPlacementStrategy();
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__APPEARS:
				setAppears((Appearance)newValue);
				return;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__PLACEMENT_STRATEGY:
				getPlacementStrategy().clear();
				getPlacementStrategy().addAll((Collection<? extends PlacementStrategy>)newValue);
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__APPEARS:
				setAppears(APPEARS_EDEFAULT);
				return;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__PLACEMENT_STRATEGY:
				getPlacementStrategy().clear();
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__APPEARS:
				return appears != APPEARS_EDEFAULT;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__PLACEMENT_STRATEGY:
				return placementStrategy != null && !placementStrategy.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ExtensionInclusionImpl
