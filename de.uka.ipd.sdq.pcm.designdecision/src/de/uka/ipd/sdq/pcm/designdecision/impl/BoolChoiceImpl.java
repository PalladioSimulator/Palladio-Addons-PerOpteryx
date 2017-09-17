/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Bool
 * Choice</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.BoolChoiceImpl#isChosenValue <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoolChoiceImpl extends ChoiceImpl implements BoolChoice {
	/**
	 * The default value of the '{@link #isChosenValue() <em>Chosen Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isChosenValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHOSEN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isChosenValue() <em>Chosen Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isChosenValue()
	 * @generated
	 * @ordered
	 */
	protected boolean chosenValue = CHOSEN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BoolChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.BOOL_CHOICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isChosenValue() {
		return chosenValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChosenValue(boolean newChosenValue) {
		boolean oldChosenValue = chosenValue;
		chosenValue = newChosenValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.BOOL_CHOICE__CHOSEN_VALUE, oldChosenValue, chosenValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.BOOL_CHOICE__CHOSEN_VALUE:
			return isChosenValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.BOOL_CHOICE__CHOSEN_VALUE:
			setChosenValue((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case designdecisionPackage.BOOL_CHOICE__CHOSEN_VALUE:
			setChosenValue(CHOSEN_VALUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case designdecisionPackage.BOOL_CHOICE__CHOSEN_VALUE:
			return chosenValue != CHOSEN_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (chosenValue: ");
		result.append(chosenValue);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object getValue() {
		return new Boolean(this.isChosenValue());
	}

	@Override
	public void setValue(final Object newValue) {
		if (newValue instanceof Boolean) {
			this.setChosenValue(((Boolean) newValue).booleanValue());
		} else {
			throw new IllegalArgumentException("Cannot cast " + newValue.getClass().getName() + " to Boolean to get the bool value.");
		}
	}
} // BoolChoiceImpl
