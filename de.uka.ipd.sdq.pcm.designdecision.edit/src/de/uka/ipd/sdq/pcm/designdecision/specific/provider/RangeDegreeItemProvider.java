/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * This is the item provider adapter for a
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree} object. <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RangeDegreeItemProvider
        extends OrderedDataTypeDegreeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public RangeDegreeItemProvider(final AdapterFactory adapterFactory) {
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

            this.addUpperBoundIncludedPropertyDescriptor(object);
            this.addLowerBoundIncludedPropertyDescriptor(object);
            this.addNumberOfStepsPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Upper Bound Included feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addUpperBoundIncludedPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_RangeDegree_upperBoundIncluded_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_RangeDegree_upperBoundIncluded_feature",
                                "_UI_RangeDegree_type"),
                                specificPackage.Literals.RANGE_DEGREE__UPPER_BOUND_INCLUDED,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Lower Bound Included feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addLowerBoundIncludedPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_RangeDegree_lowerBoundIncluded_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_RangeDegree_lowerBoundIncluded_feature",
                                "_UI_RangeDegree_type"),
                                specificPackage.Literals.RANGE_DEGREE__LOWER_BOUND_INCLUDED,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
                                null,
                                null));
    }

    /**
     * This adds a property descriptor for the Number Of Steps feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addNumberOfStepsPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add
                (this.createItemPropertyDescriptor
                (((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(),
                        this.getResourceLocator(),
                        this.getString("_UI_RangeDegree_numberOfSteps_feature"),
                        this.getString("_UI_PropertyDescriptor_description",
                                "_UI_RangeDegree_numberOfSteps_feature",
                                "_UI_RangeDegree_type"),
                                specificPackage.Literals.RANGE_DEGREE__NUMBER_OF_STEPS,
                                true,
                                false,
                                false,
                                ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
    public String getText(final Object object) {
        final String label = ((RangeDegree) object).getEntityName();
        return label == null || label.length() == 0 ?
                this.getString("_UI_RangeDegree_type") :
                this.getString("_UI_RangeDegree_type") + " " + label;
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

        switch (notification.getFeatureID(RangeDegree.class))
        {
        case specificPackage.RANGE_DEGREE__UPPER_BOUND_INCLUDED:
        case specificPackage.RANGE_DEGREE__LOWER_BOUND_INCLUDED:
        case specificPackage.RANGE_DEGREE__NUMBER_OF_STEPS:
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
