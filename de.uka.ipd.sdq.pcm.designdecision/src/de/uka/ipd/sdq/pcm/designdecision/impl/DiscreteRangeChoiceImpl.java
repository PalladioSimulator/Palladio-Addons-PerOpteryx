/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discrete Range Choice</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DiscreteRangeChoiceImpl#getChosenValue <em>
 * Chosen Value</em>}</li>
 * </ul>
 * </p>
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
     * @generated not
     */
    @Override
    public int getChosenValue() {
        return ((Integer) this.getValue()).intValue();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public void setChosenValue(final int newChosenValue) {
        this.setValue(new Integer(newChosenValue));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
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
        switch (featureID)
        {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE__CHOSEN_VALUE:
            return this.getChosenValue() != CHOSEN_VALUE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // DiscreteRangeChoiceImpl
