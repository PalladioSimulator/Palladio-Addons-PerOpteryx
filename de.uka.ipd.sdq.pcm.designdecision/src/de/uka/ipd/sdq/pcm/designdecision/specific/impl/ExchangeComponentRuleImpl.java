/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Exchange Component Rule</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl#getRepositoryComponent
 * <em>Repository Component</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl#getAllocationContext
 * <em>Allocation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExchangeComponentRuleImpl extends EObjectImpl implements ExchangeComponentRule {
    /**
     * The cached value of the '{@link #getRepositoryComponent() <em>Repository Component</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRepositoryComponent()
     * @generated
     * @ordered
     */
    protected EList<RepositoryComponent> repositoryComponent;

    /**
     * The cached value of the '{@link #getAllocationContext() <em>Allocation Context</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAllocationContext()
     * @generated
     * @ordered
     */
    protected AllocationContext allocationContext;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ExchangeComponentRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.EXCHANGE_COMPONENT_RULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<RepositoryComponent> getRepositoryComponent() {
        if (this.repositoryComponent == null) {
            this.repositoryComponent = new EObjectResolvingEList<RepositoryComponent>(RepositoryComponent.class, this,
                    specificPackage.EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT);
        }
        return this.repositoryComponent;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AllocationContext getAllocationContext() {
        if (this.allocationContext != null && ((EObject) this.allocationContext).eIsProxy()) {
            final InternalEObject oldAllocationContext = (InternalEObject) this.allocationContext;
            this.allocationContext = (AllocationContext) this.eResolveProxy(oldAllocationContext);
            if (this.allocationContext != oldAllocationContext) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            specificPackage.EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT, oldAllocationContext,
                            this.allocationContext));
                }
            }
        }
        return this.allocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public AllocationContext basicGetAllocationContext() {
        return this.allocationContext;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setAllocationContext(final AllocationContext newAllocationContext) {
        final AllocationContext oldAllocationContext = this.allocationContext;
        this.allocationContext = newAllocationContext;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    specificPackage.EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT, oldAllocationContext,
                    this.allocationContext));
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
        case specificPackage.EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT:
            return this.getRepositoryComponent();
        case specificPackage.EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT:
            if (resolve) {
                return this.getAllocationContext();
            }
            return this.basicGetAllocationContext();
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
        switch (featureID) {
        case specificPackage.EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT:
            this.getRepositoryComponent().clear();
            this.getRepositoryComponent().addAll((Collection<? extends RepositoryComponent>) newValue);
            return;
        case specificPackage.EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT:
            this.setAllocationContext((AllocationContext) newValue);
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
        case specificPackage.EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT:
            this.getRepositoryComponent().clear();
            return;
        case specificPackage.EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT:
            this.setAllocationContext((AllocationContext) null);
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
        case specificPackage.EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT:
            return this.repositoryComponent != null && !this.repositoryComponent.isEmpty();
        case specificPackage.EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT:
            return this.allocationContext != null;
        }
        return super.eIsSet(featureID);
    }

} // ExchangeComponentRuleImpl
