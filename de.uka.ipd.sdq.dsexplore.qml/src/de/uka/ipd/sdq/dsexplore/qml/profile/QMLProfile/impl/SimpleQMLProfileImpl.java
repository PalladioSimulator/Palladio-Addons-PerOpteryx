/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Simple QML Profile</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.SimpleQMLProfileImpl#getUsageModel
 * <em>Usage Model</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.SimpleQMLProfileImpl#getRequirements
 * <em>Requirements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleQMLProfileImpl extends GenericQMLProfileImpl implements SimpleQMLProfile {
    /**
     * The cached value of the '{@link #getUsageModel() <em>Usage Model</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsageModel()
     * @generated
     * @ordered
     */
    protected UsageModel usageModel;

    /**
     * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRequirements()
     * @generated
     * @ordered
     */
    protected EList<Requirement> requirements;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected SimpleQMLProfileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLProfilePackage.Literals.SIMPLE_QML_PROFILE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UsageModel getUsageModel() {
        if (this.usageModel != null && ((EObject) this.usageModel).eIsProxy())
        {
            final InternalEObject oldUsageModel = (InternalEObject) this.usageModel;
            this.usageModel = (UsageModel) this.eResolveProxy(oldUsageModel);
            if (this.usageModel != oldUsageModel)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL, oldUsageModel, this.usageModel));
                }
            }
        }
        return this.usageModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UsageModel basicGetUsageModel() {
        return this.usageModel;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageModel(final UsageModel newUsageModel)
    {
        final UsageModel oldUsageModel = this.usageModel;
        this.usageModel = newUsageModel;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL,
                    oldUsageModel, this.usageModel));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Requirement> getRequirements() {
        if (this.requirements == null)
        {
            this.requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this,
                    QMLProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS);
        }
        return this.requirements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case QMLProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
            return ((InternalEList<?>) this.getRequirements()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
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
        case QMLProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
            if (resolve) {
                return this.getUsageModel();
            }
            return this.basicGetUsageModel();
        case QMLProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
            return this.getRequirements();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case QMLProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
            this.setUsageModel((UsageModel) newValue);
            return;
        case QMLProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
            this.getRequirements().clear();
            this.getRequirements().addAll((Collection<? extends Requirement>) newValue);
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
        case QMLProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
            this.setUsageModel((UsageModel) null);
            return;
        case QMLProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
            this.getRequirements().clear();
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
        case QMLProfilePackage.SIMPLE_QML_PROFILE__USAGE_MODEL:
            return this.usageModel != null;
        case QMLProfilePackage.SIMPLE_QML_PROFILE__REQUIREMENTS:
            return this.requirements != null && !this.requirements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // SimpleQMLProfileImpl
