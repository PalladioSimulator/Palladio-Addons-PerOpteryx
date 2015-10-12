/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.Choice;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.ChoiceImpl#getDegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoiceImpl extends MinimalEObjectImpl.Container implements Choice {
	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Object VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Object value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDegreeOfFreedomInstance() <em>Degree Of Freedom Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegreeOfFreedomInstance()
	 * @generated
	 * @ordered
	 */
	protected DegreeOfFreedomInstance degreeOfFreedomInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return genericdesigndecisionPackage.Literals.CHOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, genericdesigndecisionPackage.CHOICE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Object newValue) {
		Object oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, genericdesigndecisionPackage.CHOICE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedomInstance getDegreeOfFreedomInstance() {
		if (degreeOfFreedomInstance != null && degreeOfFreedomInstance.eIsProxy()) {
			InternalEObject oldDegreeOfFreedomInstance = (InternalEObject)degreeOfFreedomInstance;
			degreeOfFreedomInstance = (DegreeOfFreedomInstance)eResolveProxy(oldDegreeOfFreedomInstance);
			if (degreeOfFreedomInstance != oldDegreeOfFreedomInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, genericdesigndecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE, oldDegreeOfFreedomInstance, degreeOfFreedomInstance));
			}
		}
		return degreeOfFreedomInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedomInstance basicGetDegreeOfFreedomInstance() {
		return degreeOfFreedomInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegreeOfFreedomInstance(DegreeOfFreedomInstance newDegreeOfFreedomInstance) {
		DegreeOfFreedomInstance oldDegreeOfFreedomInstance = degreeOfFreedomInstance;
		degreeOfFreedomInstance = newDegreeOfFreedomInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, genericdesigndecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE, oldDegreeOfFreedomInstance, degreeOfFreedomInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case genericdesigndecisionPackage.CHOICE__IS_ACTIVE:
				return isIsActive();
			case genericdesigndecisionPackage.CHOICE__VALUE:
				return getValue();
			case genericdesigndecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
				if (resolve) return getDegreeOfFreedomInstance();
				return basicGetDegreeOfFreedomInstance();
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
			case genericdesigndecisionPackage.CHOICE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case genericdesigndecisionPackage.CHOICE__VALUE:
				setValue(newValue);
				return;
			case genericdesigndecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
				setDegreeOfFreedomInstance((DegreeOfFreedomInstance)newValue);
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
			case genericdesigndecisionPackage.CHOICE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case genericdesigndecisionPackage.CHOICE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case genericdesigndecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
				setDegreeOfFreedomInstance((DegreeOfFreedomInstance)null);
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
			case genericdesigndecisionPackage.CHOICE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case genericdesigndecisionPackage.CHOICE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case genericdesigndecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
				return degreeOfFreedomInstance != null;
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //ChoiceImpl
