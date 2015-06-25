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
import org.palladiosimulator.pcm.cost.VariableCost;
import org.palladiosimulator.pcm.cost.costPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.pcm.cost.VariableCost}
 * object. <!-- begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class VariableCostItemProvider extends CostItemProvider
{
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public VariableCostItemProvider(final AdapterFactory adapterFactory)
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

            this.addFixedInitialCostPropertyDescriptor(object);
            this.addFixedOperatingCostPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Fixed Initial Cost feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addFixedInitialCostPropertyDescriptor(final Object object)
    {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_VariableCost_fixedInitialCost_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_VariableCost_fixedInitialCost_feature",
                                "_UI_VariableCost_type"),
                                costPackage.Literals.VARIABLE_COST__FIXED_INITIAL_COST,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Fixed Operating Cost feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addFixedOperatingCostPropertyDescriptor(final Object object)
    {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_VariableCost_fixedOperatingCost_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_VariableCost_fixedOperatingCost_feature",
                                "_UI_VariableCost_type"),
                                costPackage.Literals.VARIABLE_COST__FIXED_OPERATING_COST,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.REAL_VALUE_IMAGE,
                                null,
                                null));
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
        final VariableCost variableCost = (VariableCost) object;
        return this.getString("_UI_VariableCost_type") + " " + variableCost.getInitialCost();
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

        switch (notification.getFeatureID(VariableCost.class))
        {
        case costPackage.VARIABLE_COST__FIXED_INITIAL_COST:
        case costPackage.VARIABLE_COST__FIXED_OPERATING_COST:
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
