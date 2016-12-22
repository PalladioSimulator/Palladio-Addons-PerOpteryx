/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Enum Degree</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.EnumDegreeImpl#getEnumeration
 * <em>Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EnumDegreeImpl extends UnorderedDegreeImpl implements EnumDegree {
    /**
     * The cached value of the '{@link #getEnumeration() <em>Enumeration</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEnumeration()
     * @generated
     * @ordered
     */
    protected EEnum enumeration;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EnumDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.ENUM_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getEnumeration() {
        if (this.enumeration != null && this.enumeration.eIsProxy()) {
            final InternalEObject oldEnumeration = (InternalEObject) this.enumeration;
            this.enumeration = (EEnum) this.eResolveProxy(oldEnumeration);
            if (this.enumeration != oldEnumeration) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            specificPackage.ENUM_DEGREE__ENUMERATION, oldEnumeration, this.enumeration));
                }
            }
        }
        return this.enumeration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EEnum basicGetEnumeration() {
        return this.enumeration;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEnumeration(final EEnum newEnumeration) {
        final EEnum oldEnumeration = this.enumeration;
        this.enumeration = newEnumeration;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.ENUM_DEGREE__ENUMERATION,
                    oldEnumeration, this.enumeration));
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
        case specificPackage.ENUM_DEGREE__ENUMERATION:
            if (resolve) {
                return this.getEnumeration();
            }
            return this.basicGetEnumeration();
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
        case specificPackage.ENUM_DEGREE__ENUMERATION:
            this.setEnumeration((EEnum) newValue);
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
        case specificPackage.ENUM_DEGREE__ENUMERATION:
            this.setEnumeration((EEnum) null);
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
        case specificPackage.ENUM_DEGREE__ENUMERATION:
            return this.enumeration != null;
        }
        return super.eIsSet(featureID);
    }

} // EnumDegreeImpl
