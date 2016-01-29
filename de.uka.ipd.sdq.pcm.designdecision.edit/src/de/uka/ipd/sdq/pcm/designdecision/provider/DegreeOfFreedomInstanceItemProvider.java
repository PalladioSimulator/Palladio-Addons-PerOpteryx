/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.palladiosimulator.pcm.core.entity.provider.NamedElementItemProvider;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DegreeOfFreedomInstanceItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedomInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPrimaryChangedPropertyDescriptor(object);
			addDofPropertyDescriptor(object);
			addChangeableElementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Primary Changed feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryChangedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DegreeOfFreedomInstance_primaryChanged_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DegreeOfFreedomInstance_primaryChanged_feature",
						"_UI_DegreeOfFreedomInstance_type"),
				designdecisionPackage.Literals.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Dof feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addDofPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DegreeOfFreedomInstance_dof_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DegreeOfFreedomInstance_dof_feature",
								"_UI_DegreeOfFreedomInstance_type"),
				designdecisionPackage.Literals.DEGREE_OF_FREEDOM_INSTANCE__DOF, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Changeable Elements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeableElementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_DegreeOfFreedomInstance_changeableElements_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_DegreeOfFreedomInstance_changeableElements_feature", "_UI_DegreeOfFreedomInstance_type"),
				designdecisionPackage.Literals.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS, true, false, true, null,
				null, null));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DegreeOfFreedomInstance) object).getEntityName();
		return label == null || label.length() == 0 ? getString("_UI_DegreeOfFreedomInstance_type")
				: getString("_UI_DegreeOfFreedomInstance_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DesignDecisionEditPlugin.INSTANCE;
	}

}
