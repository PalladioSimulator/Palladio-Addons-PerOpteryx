/**
 */
package org.palladiosimulator.pcm.cost.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.cost.LinkingResourceCost;
import org.palladiosimulator.pcm.cost.costPackage;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Linking Resource Cost</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.cost.impl.LinkingResourceCostImpl#getLinkingresource <em>
 * Linkingresource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LinkingResourceCostImpl extends CostImpl implements LinkingResourceCost
{
    /**
     * The cached value of the '{@link #getLinkingresource() <em>Linkingresource</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLinkingresource()
     * @generated
     * @ordered
     */
    protected LinkingResource linkingresource;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected LinkingResourceCostImpl()
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
        return costPackage.Literals.LINKING_RESOURCE_COST;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public LinkingResource getLinkingresource()
    {
        if (this.linkingresource != null && ((EObject) this.linkingresource).eIsProxy())
        {
            final InternalEObject oldLinkingresource = (InternalEObject) this.linkingresource;
            this.linkingresource = (LinkingResource) this.eResolveProxy(oldLinkingresource);
            if (this.linkingresource != oldLinkingresource)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE, oldLinkingresource,
                            this.linkingresource));
                }
            }
        }
        return this.linkingresource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public LinkingResource basicGetLinkingresource()
    {
        return this.linkingresource;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLinkingresource(final LinkingResource newLinkingresource)
    {
        final LinkingResource oldLinkingresource = this.linkingresource;
        this.linkingresource = newLinkingresource;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE,
                    oldLinkingresource, this.linkingresource));
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
        case costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE:
            if (resolve) {
                return this.getLinkingresource();
            }
            return this.basicGetLinkingresource();
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
        case costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE:
            this.setLinkingresource((LinkingResource) newValue);
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
        case costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE:
            this.setLinkingresource((LinkingResource) null);
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
        case costPackage.LINKING_RESOURCE_COST__LINKINGRESOURCE:
            return this.linkingresource != null;
        }
        return super.eIsSet(featureID);
    }

} // LinkingResourceCostImpl
