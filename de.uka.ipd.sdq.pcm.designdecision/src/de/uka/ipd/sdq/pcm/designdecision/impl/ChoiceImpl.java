/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Choice</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl#isActive <em>Is Active</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl#getValue <em>Value</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.ChoiceImpl#getDegreeOfFreedomInstance
 * <em>Degree Of Freedom Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ChoiceImpl extends EObjectImpl implements Choice {
    /**
     * The default value of the '{@link #isActive() <em>Is Active</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected static final boolean IS_ACTIVE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isActive() <em>Is Active</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #isActive()
     * @generated
     * @ordered
     */
    protected boolean isActive = IS_ACTIVE_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final Object VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDegreeOfFreedomInstance()
     * <em>Degree Of Freedom Instance</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getDegreeOfFreedomInstance()
     * @generated
     * @ordered
     */
    protected DegreeOfFreedomInstance degreeOfFreedomInstance;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ChoiceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.CHOICE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean isActive() {
        return this.isActive;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setIsActive(final boolean newIsActive) {
        final boolean oldIsActive = this.isActive;
        this.isActive = newIsActive;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.CHOICE__IS_ACTIVE,
                    oldIsActive, this.isActive));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public abstract Object getValue();

    /**
     * <!-- begin-user-doc -->
     *
     * @throws ClassCastException
     *             if the type is not matching <!-- end-user-doc -->
     * @generated not
     */
    @Override
    public abstract void setValue(Object newValue);

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DegreeOfFreedomInstance getDegreeOfFreedomInstance() {
        if (this.degreeOfFreedomInstance != null && this.degreeOfFreedomInstance.eIsProxy()) {
            final InternalEObject oldDegreeOfFreedomInstance = (InternalEObject) this.degreeOfFreedomInstance;
            this.degreeOfFreedomInstance = (DegreeOfFreedomInstance) this.eResolveProxy(oldDegreeOfFreedomInstance);
            if (this.degreeOfFreedomInstance != oldDegreeOfFreedomInstance) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE, oldDegreeOfFreedomInstance,
                            this.degreeOfFreedomInstance));
                }
            }
        }
        return this.degreeOfFreedomInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public DegreeOfFreedomInstance basicGetDegreeOfFreedomInstance() {
        return this.degreeOfFreedomInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDegreeOfFreedomInstance(final DegreeOfFreedomInstance newDegreeOfFreedomInstance) {
        final DegreeOfFreedomInstance oldDegreeOfFreedomInstance = this.degreeOfFreedomInstance;
        this.degreeOfFreedomInstance = newDegreeOfFreedomInstance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE, oldDegreeOfFreedomInstance,
                    this.degreeOfFreedomInstance));
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
        case designdecisionPackage.CHOICE__IS_ACTIVE:
            return this.isActive();
        case designdecisionPackage.CHOICE__VALUE:
            return this.getValue();
        case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
            if (resolve) {
                return this.getDegreeOfFreedomInstance();
            }
            return this.basicGetDegreeOfFreedomInstance();
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
        case designdecisionPackage.CHOICE__IS_ACTIVE:
            this.setIsActive((Boolean) newValue);
            return;
        case designdecisionPackage.CHOICE__VALUE:
            this.setValue(newValue);
            return;
        case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
            this.setDegreeOfFreedomInstance((DegreeOfFreedomInstance) newValue);
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
        case designdecisionPackage.CHOICE__IS_ACTIVE:
            this.setIsActive(IS_ACTIVE_EDEFAULT);
            return;
        case designdecisionPackage.CHOICE__VALUE:
            this.setValue(VALUE_EDEFAULT);
            return;
        case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
            this.setDegreeOfFreedomInstance((DegreeOfFreedomInstance) null);
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
        case designdecisionPackage.CHOICE__IS_ACTIVE:
            return this.isActive != IS_ACTIVE_EDEFAULT;
        case designdecisionPackage.CHOICE__VALUE:
            return VALUE_EDEFAULT == null ? this.getValue() != null : !VALUE_EDEFAULT.equals(this.getValue());
        case designdecisionPackage.CHOICE__DEGREE_OF_FREEDOM_INSTANCE:
            return this.degreeOfFreedomInstance != null;
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
        result.append(" (isActive: ");
        result.append(this.isActive);
        result.append(')');
        return result.toString();
    }

} // ChoiceImpl
