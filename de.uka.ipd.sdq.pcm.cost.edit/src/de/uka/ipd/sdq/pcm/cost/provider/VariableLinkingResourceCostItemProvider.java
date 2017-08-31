/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costPackage;

/**
 * This is the item provider adapter for a
 * {@link de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost} object. <!-- begin-user-doc --> <!--
 * end-user-doc -->
 *
 * @generated
 */
public class VariableLinkingResourceCostItemProvider
        extends VariableCostItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public VariableLinkingResourceCostItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            this.addLinkingresourcePropertyDescriptor(object);
            this.addBandwithInitialFactorPropertyDescriptor(object);
            this.addBandwidthOperatingFactorPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Bandwith Initial Factor feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addBandwithInitialFactorPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_VariableLinkingResourceCost_bandwithInitialFactor_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_VariableLinkingResourceCost_bandwithInitialFactor_feature",
                                "_UI_VariableLinkingResourceCost_type"),
                                costPackage.Literals.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Bandwidth Operating Factor feature. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addBandwidthOperatingFactorPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_VariableLinkingResourceCost_bandwidthOperatingFactor_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_VariableLinkingResourceCost_bandwidthOperatingFactor_feature",
                                "_UI_VariableLinkingResourceCost_type"),
                                costPackage.Literals.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Linkingresource feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addLinkingresourcePropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_LinkingResourceCost_linkingresource_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_LinkingResourceCost_linkingresource_feature",
                                "_UI_LinkingResourceCost_type"),
                                costPackage.Literals.LINKING_RESOURCE_COST__LINKINGRESOURCE,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This returns VariableLinkingResourceCost.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/VariableLinkingResourceCost"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final VariableLinkingResourceCost variableLinkingResourceCost = (VariableLinkingResourceCost) object;
        return this.getString("_UI_VariableLinkingResourceCost_type") + " "
        + variableLinkingResourceCost.getInitialCost();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(VariableLinkingResourceCost.class))
        {
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR:
        case costPackage.VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
