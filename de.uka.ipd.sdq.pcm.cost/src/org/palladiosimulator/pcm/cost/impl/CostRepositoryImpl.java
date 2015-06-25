/**
 */
package org.palladiosimulator.pcm.cost.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.cost.Cost;
import org.palladiosimulator.pcm.cost.CostRepository;
import org.palladiosimulator.pcm.cost.costPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cost Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.cost.impl.CostRepositoryImpl#getCost <em>Cost</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.cost.impl.CostRepositoryImpl#getTimePeriodYears <em>Time
 * Period Years</em>}</li>
 * <li>{@link org.palladiosimulator.pcm.cost.impl.CostRepositoryImpl#getInterest <em>Interest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CostRepositoryImpl extends EObjectImpl implements CostRepository
{
    /**
     * The cached value of the '{@link #getCost() <em>Cost</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCost()
     * @generated
     * @ordered
     */
    protected EList<Cost> cost;

    /**
     * The default value of the '{@link #getTimePeriodYears() <em>Time Period Years</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTimePeriodYears()
     * @generated
     * @ordered
     */
    protected static final int TIME_PERIOD_YEARS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getTimePeriodYears() <em>Time Period Years</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTimePeriodYears()
     * @generated
     * @ordered
     */
    protected int timePeriodYears = TIME_PERIOD_YEARS_EDEFAULT;

    /**
     * The default value of the '{@link #getInterest() <em>Interest</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInterest()
     * @generated
     * @ordered
     */
    protected static final double INTEREST_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getInterest() <em>Interest</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInterest()
     * @generated
     * @ordered
     */
    protected double interest = INTEREST_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected CostRepositoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass()
    {
        return costPackage.Literals.COST_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EList<Cost> getCost()
    {
        if (this.cost == null)
        {
            this.cost = new EObjectContainmentEList<Cost>(Cost.class, this, costPackage.COST_REPOSITORY__COST);
        }
        return this.cost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public int getTimePeriodYears()
    {
        return this.timePeriodYears;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTimePeriodYears(final int newTimePeriodYears)
    {
        final int oldTimePeriodYears = this.timePeriodYears;
        this.timePeriodYears = newTimePeriodYears;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, costPackage.COST_REPOSITORY__TIME_PERIOD_YEARS,
                    oldTimePeriodYears, this.timePeriodYears));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getInterest()
    {
        return this.interest;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setInterest(final double newInterest)
    {
        final double oldInterest = this.interest;
        this.interest = newInterest;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, costPackage.COST_REPOSITORY__INTEREST,
                    oldInterest,
                    this.interest));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs)
    {
        switch (featureID)
        {
        case costPackage.COST_REPOSITORY__COST:
            return ((InternalEList<?>) this.getCost()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType)
    {
        switch (featureID)
        {
        case costPackage.COST_REPOSITORY__COST:
            return this.getCost();
        case costPackage.COST_REPOSITORY__TIME_PERIOD_YEARS:
            return this.getTimePeriodYears();
        case costPackage.COST_REPOSITORY__INTEREST:
            return this.getInterest();
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
    public void eSet(final int featureID, final Object newValue)
    {
        switch (featureID)
        {
        case costPackage.COST_REPOSITORY__COST:
            this.getCost().clear();
            this.getCost().addAll((Collection<? extends Cost>) newValue);
            return;
        case costPackage.COST_REPOSITORY__TIME_PERIOD_YEARS:
            this.setTimePeriodYears((Integer) newValue);
            return;
        case costPackage.COST_REPOSITORY__INTEREST:
            this.setInterest((Double) newValue);
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
    public void eUnset(final int featureID)
    {
        switch (featureID)
        {
        case costPackage.COST_REPOSITORY__COST:
            this.getCost().clear();
            return;
        case costPackage.COST_REPOSITORY__TIME_PERIOD_YEARS:
            this.setTimePeriodYears(TIME_PERIOD_YEARS_EDEFAULT);
            return;
        case costPackage.COST_REPOSITORY__INTEREST:
            this.setInterest(INTEREST_EDEFAULT);
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
    public boolean eIsSet(final int featureID)
    {
        switch (featureID)
        {
        case costPackage.COST_REPOSITORY__COST:
            return this.cost != null && !this.cost.isEmpty();
        case costPackage.COST_REPOSITORY__TIME_PERIOD_YEARS:
            return this.timePeriodYears != TIME_PERIOD_YEARS_EDEFAULT;
        case costPackage.COST_REPOSITORY__INTEREST:
            return this.interest != INTEREST_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString()
    {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (timePeriodYears: ");
        result.append(this.timePeriodYears);
        result.append(", interest: ");
        result.append(this.interest);
        result.append(')');
        return result.toString();
    }

} // CostRepositoryImpl
