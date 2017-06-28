/**
 */
package org.palladiosimulator.qualitymodel.provider;


import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;

import org.palladiosimulator.qualitymodel.MappingEntry;
import org.palladiosimulator.qualitymodel.QualityModelPackage;

/**
 * This is the item provider adapter for a {@link org.palladiosimulator.qualitymodel.MappingEntry} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingEntryItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingEntryItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(QualityModelPackage.Literals.MAPPING_ENTRY__VALUE);
			childrenFeatures.add(QualityModelPackage.Literals.MAPPING_ENTRY__KEY);
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
	 * This returns MappingEntry.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MappingEntry"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText(Object object) {
		String label = ((MappingEntry)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_MappingEntry_type") :
			getString("_UI_MappingEntry_type") + " " + label;
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

		switch (notification.getFeatureID(MappingEntry.class)) {
			case QualityModelPackage.MAPPING_ENTRY__VALUE:
			case QualityModelPackage.MAPPING_ENTRY__KEY:
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
				(QualityModelPackage.Literals.MAPPING_ENTRY__VALUE,
				 QMLContractFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__VALUE,
				 QMLContractFactory.eINSTANCE.createEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__VALUE,
				 QMLContractFactory.eINSTANCE.createSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__VALUE,
				 QMLContractFactory.eINSTANCE.createScaleLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__KEY,
				 QMLContractFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__KEY,
				 QMLContractFactory.eINSTANCE.createEnumLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__KEY,
				 QMLContractFactory.eINSTANCE.createSetLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QualityModelPackage.Literals.MAPPING_ENTRY__KEY,
				 QMLContractFactory.eINSTANCE.createScaleLiteral()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreateChildText(Object owner, Object feature, Object child, Collection selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == QualityModelPackage.Literals.MAPPING_ENTRY__VALUE ||
			childFeature == QualityModelPackage.Literals.MAPPING_ENTRY__KEY;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return QualityModelEditPlugin.INSTANCE;
	}

}
