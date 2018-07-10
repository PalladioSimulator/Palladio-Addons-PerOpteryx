/**
 */
package featureSolution.impl;

import featureSolution.AdapterInclusion;
import featureSolution.Appearance;
import featureSolution.FeatureSolutionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adapter Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.AdapterInclusionImpl#getAppears <em>Appears</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdapterInclusionImpl extends InclusionMechanismImpl implements AdapterInclusion {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdapterInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.ADAPTER_INCLUSION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureSolutionPackage.ADAPTER_INCLUSION__APPEARS, oldAppears, appears));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureSolutionPackage.ADAPTER_INCLUSION__APPEARS:
				return getAppears();
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
			case FeatureSolutionPackage.ADAPTER_INCLUSION__APPEARS:
				setAppears((Appearance)newValue);
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
			case FeatureSolutionPackage.ADAPTER_INCLUSION__APPEARS:
				setAppears(APPEARS_EDEFAULT);
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
			case FeatureSolutionPackage.ADAPTER_INCLUSION__APPEARS:
				return appears != APPEARS_EDEFAULT;
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

} //AdapterInclusionImpl
