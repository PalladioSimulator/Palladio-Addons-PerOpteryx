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
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Usage Scenario Requirement</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.UsageScenarioRequirementImpl#getUsageScenario
 * <em>Usage Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageScenarioRequirementImpl extends RequirementImpl implements UsageScenarioRequirement {
    /**
     * The cached value of the '{@link #getUsageScenario() <em>Usage Scenario</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsageScenario()
     * @generated
     * @ordered
     */
    protected UsageScenario usageScenario;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UsageScenarioRequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLProfilePackage.Literals.USAGE_SCENARIO_REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UsageScenario getUsageScenario() {
        if (this.usageScenario != null && ((EObject) this.usageScenario).eIsProxy())
        {
            final InternalEObject oldUsageScenario = (InternalEObject) this.usageScenario;
            this.usageScenario = (UsageScenario) this.eResolveProxy(oldUsageScenario);
            if (this.usageScenario != oldUsageScenario)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, oldUsageScenario,
                            this.usageScenario));
                }
            }
        }
        return this.usageScenario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UsageScenario basicGetUsageScenario() {
        return this.usageScenario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setUsageScenario(final UsageScenario newUsageScenario)
    {
        final UsageScenario oldUsageScenario = this.usageScenario;
        this.usageScenario = newUsageScenario;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO, oldUsageScenario, this.usageScenario));
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
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
            if (resolve) {
                return this.getUsageScenario();
            }
            return this.basicGetUsageScenario();
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
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
            this.setUsageScenario((UsageScenario) newValue);
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
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
            this.setUsageScenario((UsageScenario) null);
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
        case QMLProfilePackage.USAGE_SCENARIO_REQUIREMENT__USAGE_SCENARIO:
            return this.usageScenario != null;
        }
        return super.eIsSet(featureID);
    }

} // UsageScenarioRequirementImpl
