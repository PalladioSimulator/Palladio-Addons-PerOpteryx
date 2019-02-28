/**
 */
package placementDescription.impl;

import FeatureCompletionModel.ComplementumVisnetis;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import placementDescription.PlacementDescriptionPackage;
import placementDescription.SelectedCV;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selected CV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link placementDescription.impl.SelectedCVImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link placementDescription.impl.SelectedCVImpl#getComplementumVisnetis <em>Complementum Visnetis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectedCVImpl extends MinimalEObjectImpl.Container implements SelectedCV {
	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComplementumVisnetis() <em>Complementum Visnetis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementumVisnetis()
	 * @generated
	 * @ordered
	 */
	protected ComplementumVisnetis complementumVisnetis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedCVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PlacementDescriptionPackage.Literals.SELECTED_CV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.SELECTED_CV__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementumVisnetis getComplementumVisnetis() {
		if (complementumVisnetis != null && complementumVisnetis.eIsProxy()) {
			InternalEObject oldComplementumVisnetis = (InternalEObject)complementumVisnetis;
			complementumVisnetis = (ComplementumVisnetis)eResolveProxy(oldComplementumVisnetis);
			if (complementumVisnetis != oldComplementumVisnetis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PlacementDescriptionPackage.SELECTED_CV__COMPLEMENTUM_VISNETIS, oldComplementumVisnetis, complementumVisnetis));
			}
		}
		return complementumVisnetis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementumVisnetis basicGetComplementumVisnetis() {
		return complementumVisnetis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplementumVisnetis(ComplementumVisnetis newComplementumVisnetis) {
		ComplementumVisnetis oldComplementumVisnetis = complementumVisnetis;
		complementumVisnetis = newComplementumVisnetis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PlacementDescriptionPackage.SELECTED_CV__COMPLEMENTUM_VISNETIS, oldComplementumVisnetis, complementumVisnetis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PlacementDescriptionPackage.SELECTED_CV__OPTIONAL:
				return isOptional();
			case PlacementDescriptionPackage.SELECTED_CV__COMPLEMENTUM_VISNETIS:
				if (resolve) return getComplementumVisnetis();
				return basicGetComplementumVisnetis();
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
			case PlacementDescriptionPackage.SELECTED_CV__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case PlacementDescriptionPackage.SELECTED_CV__COMPLEMENTUM_VISNETIS:
				setComplementumVisnetis((ComplementumVisnetis)newValue);
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
			case PlacementDescriptionPackage.SELECTED_CV__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case PlacementDescriptionPackage.SELECTED_CV__COMPLEMENTUM_VISNETIS:
				setComplementumVisnetis((ComplementumVisnetis)null);
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
			case PlacementDescriptionPackage.SELECTED_CV__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case PlacementDescriptionPackage.SELECTED_CV__COMPLEMENTUM_VISNETIS:
				return complementumVisnetis != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //SelectedCVImpl
