/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.ClassChoiceImpl#getChosenValue
 * <em>Chosen Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassChoiceImpl extends ChoiceImpl implements ClassChoice {

    /**
     * The cached value of the '{@link #getChosenValue() <em>Chosen Value</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getChosenValue()
     * @generated
     * @ordered
     */
    protected EObject chosenValue;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ClassChoiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.CLASS_CHOICE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject getChosenValue() {
        if (this.chosenValue != null && this.chosenValue.eIsProxy()) {
            final InternalEObject oldChosenValue = (InternalEObject) this.chosenValue;
            this.chosenValue = this.eResolveProxy(oldChosenValue);
            if (this.chosenValue != oldChosenValue) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE, oldChosenValue, this.chosenValue));
                }
            }
        }
        return this.chosenValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EObject basicGetChosenValue() {
        return this.chosenValue;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setChosenValue(final EObject newChosenValue) {
        final EObject oldChosenValue = this.chosenValue;
        this.chosenValue = newChosenValue;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE,
                    oldChosenValue, this.chosenValue));
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
        case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
            if (resolve) {
                return this.getChosenValue();
            }
            return this.basicGetChosenValue();
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
        case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
            this.setChosenValue((EObject) newValue);
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
        case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
            this.setChosenValue((EObject) null);
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
        case designdecisionPackage.CLASS_CHOICE__CHOSEN_VALUE:
            return this.chosenValue != null;
        }
        return super.eIsSet(featureID);
    }

    @Override
    public Object getValue() {
        return this.getChosenValue();
    }

    @Override
    public void setValue(final Object newValue) {
        if (newValue instanceof EObject) {
            this.setChosenValue((EObject) newValue);
        } else {
            throw new IllegalArgumentException("Cannot cast " + newValue.getClass().getName() + " to EObject");
        }

    }

} // ClassChoiceImpl
