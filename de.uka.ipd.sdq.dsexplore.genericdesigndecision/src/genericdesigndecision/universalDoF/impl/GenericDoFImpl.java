/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Do F</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.impl.GenericDoFImpl#getGdofID <em>Gdof ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericDoFImpl extends MinimalEObjectImpl.Container implements GenericDoF {
	/**
	 * The default value of the '{@link #getGdofID() <em>Gdof ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdofID()
	 * @generated
	 * @ordered
	 */
	protected static final int GDOF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGdofID() <em>Gdof ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdofID()
	 * @generated
	 * @ordered
	 */
	protected int gdofID = GDOF_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericDoFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversalDoFPackage.Literals.GENERIC_DO_F;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGdofID() {
		return gdofID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdofID(int newGdofID) {
		int oldGdofID = gdofID;
		gdofID = newGdofID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.GENERIC_DO_F__GDOF_ID, oldGdofID, gdofID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversalDoFPackage.GENERIC_DO_F__GDOF_ID:
				return getGdofID();
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
			case UniversalDoFPackage.GENERIC_DO_F__GDOF_ID:
				setGdofID((Integer)newValue);
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
			case UniversalDoFPackage.GENERIC_DO_F__GDOF_ID:
				setGdofID(GDOF_ID_EDEFAULT);
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
			case UniversalDoFPackage.GENERIC_DO_F__GDOF_ID:
				return gdofID != GDOF_ID_EDEFAULT;
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
		result.append(" (gdofID: ");
		result.append(gdofID);
		result.append(')');
		return result.toString();
	}

} //GenericDoFImpl
