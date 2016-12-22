/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;

import de.uka.ipd.sdq.pcm.cost.ComponentCostPerInstance;
import de.uka.ipd.sdq.pcm.cost.costPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Component Cost Per Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.ComponentCostPerInstanceImpl#getAllocation <em>Allocation
 * </em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentCostPerInstanceImpl extends ComponentCostImpl implements ComponentCostPerInstance {
    /**
     * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAllocation()
     * @generated
     * @ordered
     */
    protected Allocation allocation;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComponentCostPerInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return costPackage.Literals.COMPONENT_COST_PER_INSTANCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Allocation getAllocation() {
        if (this.allocation != null && ((EObject) this.allocation).eIsProxy())
        {
            final InternalEObject oldAllocation = (InternalEObject) this.allocation;
            this.allocation = (Allocation) this.eResolveProxy(oldAllocation);
            if (this.allocation != oldAllocation)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            costPackage.COMPONENT_COST_PER_INSTANCE__ALLOCATION, oldAllocation, this.allocation));
                }
            }
        }
        return this.allocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Allocation basicGetAllocation() {
        return this.allocation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAllocation(final Allocation newAllocation) {
        final Allocation oldAllocation = this.allocation;
        this.allocation = newAllocation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.COMPONENT_COST_PER_INSTANCE__ALLOCATION,
                    oldAllocation, this.allocation));
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
        case costPackage.COMPONENT_COST_PER_INSTANCE__ALLOCATION:
            if (resolve) {
                return this.getAllocation();
            }
            return this.basicGetAllocation();
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
        case costPackage.COMPONENT_COST_PER_INSTANCE__ALLOCATION:
            this.setAllocation((Allocation) newValue);
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
        case costPackage.COMPONENT_COST_PER_INSTANCE__ALLOCATION:
            this.setAllocation((Allocation) null);
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
        case costPackage.COMPONENT_COST_PER_INSTANCE__ALLOCATION:
            return this.allocation != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getOperatingCost() {
        // the operating costs are the componentOperatingCost times the number of instances of the
        // component.
        return this.getNumberOfInstances() * this.getComponentOperatingCost();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getInitialCost() {
        // the initial costs are the componentOperatingCost times the number of instances of the
        // component.
        return this.getNumberOfInstances() * this.getComponentInitialCost();
    }

    private int getNumberOfInstances() {
        int numberOfInstances = 0;
        if (this.getAllocation() != null) {
            final List<AllocationContext> allocationContexts = this.getAllocation().getAllocationContexts_Allocation();
            for (final AllocationContext allocationContext : allocationContexts) {
                if (allocationContext.getAssemblyContext_AllocationContext()
                        .getEncapsulatedComponent__AssemblyContext().getId()
                        .equals(this.getRepositoryComponent().getId())) {
                    numberOfInstances++;
                }
            }
        } else {
            numberOfInstances = 1;
        }
        return numberOfInstances;
    }

} // ComponentCostPerInstanceImpl
