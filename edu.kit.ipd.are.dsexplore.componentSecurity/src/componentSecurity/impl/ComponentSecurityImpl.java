/**
 */
package componentSecurity.impl;

import componentSecurity.ComponentSecurity;
import componentSecurity.ComponentSecurityPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Security</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link componentSecurity.impl.ComponentSecurityImpl#getPoCoB <em>Po Co B</em>}</li>
 *   <li>{@link componentSecurity.impl.ComponentSecurityImpl#getTTDV <em>TTDV</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSecurityImpl extends MinimalEObjectImpl.Container implements ComponentSecurity {
	/**
	 * The default value of the '{@link #getPoCoB() <em>Po Co B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoCoB()
	 * @generated
	 * @ordered
	 */
	protected static final double PO_CO_B_EDEFAULT = 0.2;

	/**
	 * The cached value of the '{@link #getPoCoB() <em>Po Co B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoCoB()
	 * @generated
	 * @ordered
	 */
	protected double poCoB = PO_CO_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getTTDV() <em>TTDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTDV()
	 * @generated
	 * @ordered
	 */
	protected static final double TTDV_EDEFAULT = 200.0;

	/**
	 * The cached value of the '{@link #getTTDV() <em>TTDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTTDV()
	 * @generated
	 * @ordered
	 */
	protected double ttdv = TTDV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSecurityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentSecurityPackage.Literals.COMPONENT_SECURITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPoCoB() {
		return poCoB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoCoB(double newPoCoB) {
		double oldPoCoB = poCoB;
		poCoB = newPoCoB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSecurityPackage.COMPONENT_SECURITY__PO_CO_B, oldPoCoB, poCoB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTTDV() {
		return ttdv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTTDV(double newTTDV) {
		double oldTTDV = ttdv;
		ttdv = newTTDV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentSecurityPackage.COMPONENT_SECURITY__TTDV, oldTTDV, ttdv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentSecurityPackage.COMPONENT_SECURITY__PO_CO_B:
				return getPoCoB();
			case ComponentSecurityPackage.COMPONENT_SECURITY__TTDV:
				return getTTDV();
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
			case ComponentSecurityPackage.COMPONENT_SECURITY__PO_CO_B:
				setPoCoB((Double)newValue);
				return;
			case ComponentSecurityPackage.COMPONENT_SECURITY__TTDV:
				setTTDV((Double)newValue);
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
			case ComponentSecurityPackage.COMPONENT_SECURITY__PO_CO_B:
				setPoCoB(PO_CO_B_EDEFAULT);
				return;
			case ComponentSecurityPackage.COMPONENT_SECURITY__TTDV:
				setTTDV(TTDV_EDEFAULT);
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
			case ComponentSecurityPackage.COMPONENT_SECURITY__PO_CO_B:
				return poCoB != PO_CO_B_EDEFAULT;
			case ComponentSecurityPackage.COMPONENT_SECURITY__TTDV:
				return ttdv != TTDV_EDEFAULT;
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
		result.append(" (poCoB: ");
		result.append(poCoB);
		result.append(", TTDV: ");
		result.append(ttdv);
		result.append(')');
		return result.toString();
	}

} //ComponentSecurityImpl
