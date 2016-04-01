/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.provider;


import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesFactory;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;

import java.util.Collection;
import java.util.List;

import namedelement.NamedelementFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionTypeScaleItemProvider extends DimensionTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeScaleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addScalePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Scale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DimensionTypeScale_scale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DimensionTypeScale_scale_feature", "_UI_DimensionTypeScale_type"),
				 DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DimensionTypeScale.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DimensionTypeScale"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DimensionTypeScale<?>)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_DimensionTypeScale_type") :
			getString("_UI_DimensionTypeScale_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DimensionTypeScale.class)) {
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DimensiontypesPackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
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
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createDimensionTypeSet()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createRelationSemantics()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createElement()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createDimensionTypeEnum()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createDimensionTypeNumeric()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createNumericRange()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createDimensionTypeRepository()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createDimensionTypeScale()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 DimensiontypesFactory.eINSTANCE.createScaleElement()));

		newChildDescriptors.add
			(createChildParameter
				(DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				 NamedelementFactory.eINSTANCE.createNamedElement()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == DimensiontypesPackage.Literals.DIMENSION_TYPE__RELATION_SEMANTICS ||
			childFeature == DimensiontypesPackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
