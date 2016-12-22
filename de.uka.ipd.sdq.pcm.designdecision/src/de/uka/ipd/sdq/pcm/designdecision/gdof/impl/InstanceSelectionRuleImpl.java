/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance Selection Rule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.InstanceSelectionRuleImpl#getContextInstance
 * <em>Context Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceSelectionRuleImpl extends SelectionRuleImpl implements InstanceSelectionRule {
    /**
     * The cached value of the '{@link #getContextInstance() <em>Context Instance</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getContextInstance()
     * @generated
     * @ordered
     */
    protected ChangeableElementDescription contextInstance;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected InstanceSelectionRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return gdofPackage.Literals.INSTANCE_SELECTION_RULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ChangeableElementDescription getContextInstance() {
        if (this.contextInstance != null && this.contextInstance.eIsProxy()) {
            final InternalEObject oldContextInstance = (InternalEObject) this.contextInstance;
            this.contextInstance = (ChangeableElementDescription) this.eResolveProxy(oldContextInstance);
            if (this.contextInstance != oldContextInstance) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE, oldContextInstance,
                            this.contextInstance));
                }
            }
        }
        return this.contextInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ChangeableElementDescription basicGetContextInstance() {
        return this.contextInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setContextInstance(final ChangeableElementDescription newContextInstance) {
        final ChangeableElementDescription oldContextInstance = this.contextInstance;
        this.contextInstance = newContextInstance;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE, oldContextInstance, this.contextInstance));
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
        case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
            if (resolve) {
                return this.getContextInstance();
            }
            return this.basicGetContextInstance();
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
        case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
            this.setContextInstance((ChangeableElementDescription) newValue);
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
        case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
            this.setContextInstance((ChangeableElementDescription) null);
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
        case gdofPackage.INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE:
            return this.contextInstance != null;
        }
        return super.eIsSet(featureID);
    }

} // InstanceSelectionRuleImpl
