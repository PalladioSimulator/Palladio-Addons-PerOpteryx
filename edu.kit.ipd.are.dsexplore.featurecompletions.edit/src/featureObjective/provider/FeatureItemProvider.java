/**
 */
package featureObjective.provider;


import FeatureCompletionModel.provider.FeatureCompletionsEditPlugin;
import FeatureCompletionModel.provider.NamedElementItemProvider;

import featureObjective.Feature;
import featureObjective.FeatureObjectiveFactory;
import featureObjective.FeatureObjectivePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link featureObjective.Feature} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSimpleMandatoryPropertyDescriptor(object);
			addSimpleOptionalPropertyDescriptor(object);
			addFeaturegroupPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Simple Mandatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimpleMandatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_simpleMandatory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_simpleMandatory_feature", "_UI_Feature_type"),
				 FeatureObjectivePackage.Literals.FEATURE__SIMPLE_MANDATORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Simple Optional feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimpleOptionalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_simpleOptional_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_simpleOptional_feature", "_UI_Feature_type"),
				 FeatureObjectivePackage.Literals.FEATURE__SIMPLE_OPTIONAL,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Featuregroup feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturegroupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Feature_featuregroup_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Feature_featuregroup_feature", "_UI_Feature_type"),
				 FeatureObjectivePackage.Literals.FEATURE__FEATUREGROUP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FeatureObjectivePackage.Literals.FEATURE__ATTRIBUTES);
			childrenFeatures.add(FeatureObjectivePackage.Literals.FEATURE__CHILDRELATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Feature.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Feature"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((Feature)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Feature_type") :
			getString("_UI_Feature_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Feature.class)) {
			case FeatureObjectivePackage.FEATURE__ATTRIBUTES:
			case FeatureObjectivePackage.FEATURE__CHILDRELATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void collectNewChildDescriptors(Collection newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FeatureObjectivePackage.Literals.FEATURE__ATTRIBUTES,
				 FeatureObjectiveFactory.eINSTANCE.createIntegerAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureObjectivePackage.Literals.FEATURE__ATTRIBUTES,
				 FeatureObjectiveFactory.eINSTANCE.createDoubleAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureObjectivePackage.Literals.FEATURE__ATTRIBUTES,
				 FeatureObjectiveFactory.eINSTANCE.createStringAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureObjectivePackage.Literals.FEATURE__ATTRIBUTES,
				 FeatureObjectiveFactory.eINSTANCE.createExternalObjectAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureObjectivePackage.Literals.FEATURE__CHILDRELATION,
				 FeatureObjectiveFactory.eINSTANCE.createSimple()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureObjectivePackage.Literals.FEATURE__CHILDRELATION,
				 FeatureObjectiveFactory.eINSTANCE.createFeatureGroup()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return FeatureCompletionsEditPlugin.INSTANCE;
	}

}
