/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalAsDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional As Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalAsDegreeImpl#isSet <em>Is Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalAsDegreeImpl extends ClassAsReferenceDegreeImpl implements OptionalAsDegree {
	/**
	 * The default value of the '{@link #isSet() <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSet() <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSet()
	 * @generated
	 * @ordered
	 */
	protected boolean isSet = IS_SET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalAsDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.OPTIONAL_AS_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSet() {
		return isSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsSet(boolean newIsSet) {
		boolean oldIsSet = isSet;
		isSet = newIsSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.OPTIONAL_AS_DEGREE__IS_SET, oldIsSet, isSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.OPTIONAL_AS_DEGREE__IS_SET:
			return isSet();
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
		case specificPackage.OPTIONAL_AS_DEGREE__IS_SET:
			setIsSet((Boolean) newValue);
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
		case specificPackage.OPTIONAL_AS_DEGREE__IS_SET:
			setIsSet(IS_SET_EDEFAULT);
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
		case specificPackage.OPTIONAL_AS_DEGREE__IS_SET:
			return isSet != IS_SET_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isSet: ");
		result.append(isSet);
		result.append(')');
		return result.toString();
	}

} //OptionalAsDegreeImpl
