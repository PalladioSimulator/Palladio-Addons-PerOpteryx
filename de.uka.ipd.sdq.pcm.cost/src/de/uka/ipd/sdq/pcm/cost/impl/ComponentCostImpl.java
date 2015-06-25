/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.costPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Component Cost</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.ComponentCostImpl#getComponentOperatingCost <em>Component
 * Operating Cost</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.ComponentCostImpl#getComponentInitialCost <em>Component
 * Initial Cost</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.ComponentCostImpl#getRepositoryComponent <em>Repository
 * Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentCostImpl extends CostImpl implements ComponentCost {
    /**
     * The default value of the '{@link #getComponentOperatingCost()
     * <em>Component Operating Cost</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComponentOperatingCost()
     * @generated
     * @ordered
     */
    protected static final double COMPONENT_OPERATING_COST_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getComponentOperatingCost()
     * <em>Component Operating Cost</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComponentOperatingCost()
     * @generated
     * @ordered
     */
    protected double componentOperatingCost = COMPONENT_OPERATING_COST_EDEFAULT;

    /**
     * The default value of the '{@link #getComponentInitialCost() <em>Component Initial Cost</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComponentInitialCost()
     * @generated
     * @ordered
     */
    protected static final double COMPONENT_INITIAL_COST_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getComponentInitialCost() <em>Component Initial Cost</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getComponentInitialCost()
     * @generated
     * @ordered
     */
    protected double componentInitialCost = COMPONENT_INITIAL_COST_EDEFAULT;

    /**
     * The cached value of the '{@link #getRepositoryComponent() <em>Repository Component</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRepositoryComponent()
     * @generated
     * @ordered
     */
    protected RepositoryComponent repositoryComponent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ComponentCostImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return costPackage.Literals.COMPONENT_COST;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getComponentOperatingCost() {
        return this.componentOperatingCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setComponentOperatingCost(final double newComponentOperatingCost) {
        final double oldComponentOperatingCost = this.componentOperatingCost;
        this.componentOperatingCost = newComponentOperatingCost;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.COMPONENT_COST__COMPONENT_OPERATING_COST,
                    oldComponentOperatingCost, this.componentOperatingCost));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public double getComponentInitialCost() {
        return this.componentInitialCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setComponentInitialCost(final double newComponentInitialCost) {
        final double oldComponentInitialCost = this.componentInitialCost;
        this.componentInitialCost = newComponentInitialCost;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.COMPONENT_COST__COMPONENT_INITIAL_COST,
                    oldComponentInitialCost, this.componentInitialCost));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public RepositoryComponent getRepositoryComponent() {
        if (this.repositoryComponent != null && ((EObject) this.repositoryComponent).eIsProxy())
        {
            final InternalEObject oldRepositoryComponent = (InternalEObject) this.repositoryComponent;
            this.repositoryComponent = (RepositoryComponent) this.eResolveProxy(oldRepositoryComponent);
            if (this.repositoryComponent != oldRepositoryComponent)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            costPackage.COMPONENT_COST__REPOSITORY_COMPONENT, oldRepositoryComponent,
                            this.repositoryComponent));
                }
            }
        }
        return this.repositoryComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public RepositoryComponent basicGetRepositoryComponent() {
        return this.repositoryComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRepositoryComponent(final RepositoryComponent newRepositoryComponent) {
        final RepositoryComponent oldRepositoryComponent = this.repositoryComponent;
        this.repositoryComponent = newRepositoryComponent;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.COMPONENT_COST__REPOSITORY_COMPONENT,
                    oldRepositoryComponent, this.repositoryComponent));
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
        case costPackage.COMPONENT_COST__COMPONENT_OPERATING_COST:
            return this.getComponentOperatingCost();
        case costPackage.COMPONENT_COST__COMPONENT_INITIAL_COST:
            return this.getComponentInitialCost();
        case costPackage.COMPONENT_COST__REPOSITORY_COMPONENT:
            if (resolve) {
                return this.getRepositoryComponent();
            }
            return this.basicGetRepositoryComponent();
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
        case costPackage.COMPONENT_COST__COMPONENT_OPERATING_COST:
            this.setComponentOperatingCost((Double) newValue);
            return;
        case costPackage.COMPONENT_COST__COMPONENT_INITIAL_COST:
            this.setComponentInitialCost((Double) newValue);
            return;
        case costPackage.COMPONENT_COST__REPOSITORY_COMPONENT:
            this.setRepositoryComponent((RepositoryComponent) newValue);
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
        case costPackage.COMPONENT_COST__COMPONENT_OPERATING_COST:
            this.setComponentOperatingCost(COMPONENT_OPERATING_COST_EDEFAULT);
            return;
        case costPackage.COMPONENT_COST__COMPONENT_INITIAL_COST:
            this.setComponentInitialCost(COMPONENT_INITIAL_COST_EDEFAULT);
            return;
        case costPackage.COMPONENT_COST__REPOSITORY_COMPONENT:
            this.setRepositoryComponent((RepositoryComponent) null);
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
        case costPackage.COMPONENT_COST__COMPONENT_OPERATING_COST:
            return this.componentOperatingCost != COMPONENT_OPERATING_COST_EDEFAULT;
        case costPackage.COMPONENT_COST__COMPONENT_INITIAL_COST:
            return this.componentInitialCost != COMPONENT_INITIAL_COST_EDEFAULT;
        case costPackage.COMPONENT_COST__REPOSITORY_COMPONENT:
            return this.repositoryComponent != null;
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
        result.append(" (componentOperatingCost: ");
        result.append(this.componentOperatingCost);
        result.append(", componentInitialCost: ");
        result.append(this.componentInitialCost);
        result.append(')');
        return result.toString();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getOperatingCost() {
        return this.getComponentOperatingCost();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getInitialCost() {
        return this.getComponentInitialCost();
    }

    /**
     * @generated not
     */
    @Override
    public EObject basicGetAnnotatedElement() {
        return this.getRepositoryComponent();
    }

} // ComponentCostImpl
