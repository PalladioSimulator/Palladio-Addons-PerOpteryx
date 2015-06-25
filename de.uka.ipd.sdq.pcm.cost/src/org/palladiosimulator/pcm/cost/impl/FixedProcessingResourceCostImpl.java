/**
 */
package org.palladiosimulator.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.cost.FixedProcessingResourceCost;
import org.palladiosimulator.pcm.cost.costPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Fixed Processing Resource Cost</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.impl.FixedProcessingResourceCostImpl#getFixedOperatingCost
 * <em>Fixed Operating Cost</em>}</li>
 * <li>
 * {@link org.palladiosimulator.pcm.cost.impl.FixedProcessingResourceCostImpl#getFixedInitialCost
 * <em>Fixed Initial Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FixedProcessingResourceCostImpl extends ProcessingResourceCostImpl implements FixedProcessingResourceCost
{
    /**
     * The default value of the '{@link #getFixedOperatingCost() <em>Fixed Operating Cost</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFixedOperatingCost()
     * @generated
     * @ordered
     */
    protected static final double FIXED_OPERATING_COST_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getFixedOperatingCost() <em>Fixed Operating Cost</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFixedOperatingCost()
     * @generated
     * @ordered
     */
    protected double fixedOperatingCost = FIXED_OPERATING_COST_EDEFAULT;

    /**
     * The default value of the '{@link #getFixedInitialCost() <em>Fixed Initial Cost</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFixedInitialCost()
     * @generated
     * @ordered
     */
    protected static final double FIXED_INITIAL_COST_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getFixedInitialCost() <em>Fixed Initial Cost</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFixedInitialCost()
     * @generated
     * @ordered
     */
    protected double fixedInitialCost = FIXED_INITIAL_COST_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected FixedProcessingResourceCostImpl()
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
        return costPackage.Literals.FIXED_PROCESSING_RESOURCE_COST;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getFixedOperatingCost()
    {
        return this.fixedOperatingCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setFixedOperatingCost(final double newFixedOperatingCost)
    {
        final double oldFixedOperatingCost = this.fixedOperatingCost;
        this.fixedOperatingCost = newFixedOperatingCost;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_OPERATING_COST, oldFixedOperatingCost,
                    this.fixedOperatingCost));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public double getFixedInitialCost()
    {
        return this.fixedInitialCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setFixedInitialCost(final double newFixedInitialCost)
    {
        final double oldFixedInitialCost = this.fixedInitialCost;
        this.fixedInitialCost = newFixedInitialCost;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_INITIAL_COST, oldFixedInitialCost,
                    this.fixedInitialCost));
        }
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
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_OPERATING_COST:
            return this.getFixedOperatingCost();
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_INITIAL_COST:
            return this.getFixedInitialCost();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue)
    {
        switch (featureID)
        {
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_OPERATING_COST:
            this.setFixedOperatingCost((Double) newValue);
            return;
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_INITIAL_COST:
            this.setFixedInitialCost((Double) newValue);
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
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_OPERATING_COST:
            this.setFixedOperatingCost(FIXED_OPERATING_COST_EDEFAULT);
            return;
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_INITIAL_COST:
            this.setFixedInitialCost(FIXED_INITIAL_COST_EDEFAULT);
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
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_OPERATING_COST:
            return this.fixedOperatingCost != FIXED_OPERATING_COST_EDEFAULT;
        case costPackage.FIXED_PROCESSING_RESOURCE_COST__FIXED_INITIAL_COST:
            return this.fixedInitialCost != FIXED_INITIAL_COST_EDEFAULT;
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
        result.append(" (fixedOperatingCost: ");
        result.append(this.fixedOperatingCost);
        result.append(", fixedInitialCost: ");
        result.append(this.fixedInitialCost);
        result.append(')');
        return result.toString();
    }

} // FixedProcessingResourceCostImpl
