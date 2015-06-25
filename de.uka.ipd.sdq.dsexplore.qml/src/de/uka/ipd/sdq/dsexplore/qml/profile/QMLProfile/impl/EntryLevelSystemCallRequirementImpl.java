/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entry Level System Call Requirement</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.EntryLevelSystemCallRequirementImpl#getEntryLevelSystemCall
 * <em>Entry Level System Call</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryLevelSystemCallRequirementImpl extends RequirementImpl implements EntryLevelSystemCallRequirement {
    /**
     * The cached value of the '{@link #getEntryLevelSystemCall() <em>Entry Level System Call</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEntryLevelSystemCall()
     * @generated
     * @ordered
     */
    protected EntryLevelSystemCall entryLevelSystemCall;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected EntryLevelSystemCallRequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLProfilePackage.Literals.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EntryLevelSystemCall getEntryLevelSystemCall() {
        if (this.entryLevelSystemCall != null && ((EObject) this.entryLevelSystemCall).eIsProxy())
        {
            final InternalEObject oldEntryLevelSystemCall = (InternalEObject) this.entryLevelSystemCall;
            this.entryLevelSystemCall = (EntryLevelSystemCall) this.eResolveProxy(oldEntryLevelSystemCall);
            if (this.entryLevelSystemCall != oldEntryLevelSystemCall)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL,
                            oldEntryLevelSystemCall, this.entryLevelSystemCall));
                }
            }
        }
        return this.entryLevelSystemCall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EntryLevelSystemCall basicGetEntryLevelSystemCall() {
        return this.entryLevelSystemCall;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEntryLevelSystemCall(final EntryLevelSystemCall newEntryLevelSystemCall)
    {
        final EntryLevelSystemCall oldEntryLevelSystemCall = this.entryLevelSystemCall;
        this.entryLevelSystemCall = newEntryLevelSystemCall;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL,
                    oldEntryLevelSystemCall, this.entryLevelSystemCall));
        }
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
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
            if (resolve) {
                return this.getEntryLevelSystemCall();
            }
            return this.basicGetEntryLevelSystemCall();
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
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
            this.setEntryLevelSystemCall((EntryLevelSystemCall) newValue);
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
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
            this.setEntryLevelSystemCall((EntryLevelSystemCall) null);
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
        case QMLProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT__ENTRY_LEVEL_SYSTEM_CALL:
            return this.entryLevelSystemCall != null;
        }
        return super.eIsSet(featureID);
    }

} // EntryLevelSystemCallRequirementImpl
