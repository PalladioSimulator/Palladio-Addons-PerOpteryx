/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discrete Range Choice</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl#getChosenValue
 * <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteRangeChoiceImpl extends ChoiceImpl implements DiscreteRangeChoice {
    /**
     * The default value of the '{@link #getChosenValue() <em>Chosen Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getChosenValue()
     * @generated
     * @ordered
     */
    protected static final int CHOSEN_VALUE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getChosenValue() <em>Chosen Value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getChosenValue()
     * @generated
     * @ordered
     */
    protected int chosenValue = CHOSEN_VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DiscreteRangeChoiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.DISCRETE_RANGE_CHOICE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public int getChosenValue() {
        return this.chosenValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setChosenValue(final int newChosenValue) {
        final int oldChosenValue = this.chosenValue;
        this.chosenValue = newChosenValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE, oldChosenValue, this.chosenValue));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
            return this.getChosenValue();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
            this.setChosenValue((Integer) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
            this.setChosenValue(CHOSEN_VALUE_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
            return this.chosenValue != CHOSEN_VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (chosenValue: ");
        result.append(this.chosenValue);
        result.append(')');
        return result.toString();
    }

    @Override
    public Object getValue() {
        return new Integer(this.getChosenValue());
    }

    @Override
    public void setValue(final Object newValue) {
        if (newValue instanceof Number) {
            this.setChosenValue(((Number) newValue).intValue());
        } else {
            throw new IllegalArgumentException(
                    "Cannot cast " + newValue.getClass().getName() + " to Number to get the integer value.");
        }

    }

} // DiscreteRangeChoiceImpl
