/**
 */
package org.palladiosimulator.pcm.cost.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.cost.ComponentCost;
import org.palladiosimulator.pcm.cost.costPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.cost.ComponentCost}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class ComponentCostItemProvider extends CostItemProvider
{
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public ComponentCostItemProvider(final AdapterFactory adapterFactory)
    {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object)
    {
        if (this.itemPropertyDescriptors == null)
        {
            super.getPropertyDescriptors(object);

            this.addComponentOperatingCostPropertyDescriptor(object);
            this.addComponentInitialCostPropertyDescriptor(object);
            this.addRepositoryComponentPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Component Operating Cost feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addComponentOperatingCostPropertyDescriptor(final Object object)
    {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ComponentCost_componentOperatingCost_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ComponentCost_componentOperatingCost_feature", "_UI_ComponentCost_type"),
                                costPackage.Literals.COMPONENT_COST__COMPONENT_OPERATING_COST,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Component Initial Cost feature. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addComponentInitialCostPropertyDescriptor(final Object object)
    {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ComponentCost_componentInitialCost_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ComponentCost_componentInitialCost_feature", "_UI_ComponentCost_type"),
                                costPackage.Literals.COMPONENT_COST__COMPONENT_INITIAL_COST,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Repository Component feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addRepositoryComponentPropertyDescriptor(final Object object)
    {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_ComponentCost_repositoryComponent_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_ComponentCost_repositoryComponent_feature", "_UI_ComponentCost_type"),
                                costPackage.Literals.COMPONENT_COST__REPOSITORY_COMPONENT,
                                true,
                                false,
                                true,
                                null,
                                null,
                                null));
    }

    /**
     * This returns ComponentCost.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object)
    {
        return this.overlayImage(object, this.getResourceLocator().getImage("full/obj16/ComponentCost"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object)
    {
        final ComponentCost componentCost = (ComponentCost) object;
        return this.getString("_UI_ComponentCost_type") + " " + componentCost.getTotalCost();
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification)
    {
        this.updateChildren(notification);

        switch (notification.getFeatureID(ComponentCost.class))
        {
        case costPackage.COMPONENT_COST__COMPONENT_OPERATING_COST:
        case costPackage.COMPONENT_COST__COMPONENT_INITIAL_COST:
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
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object)
    {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
