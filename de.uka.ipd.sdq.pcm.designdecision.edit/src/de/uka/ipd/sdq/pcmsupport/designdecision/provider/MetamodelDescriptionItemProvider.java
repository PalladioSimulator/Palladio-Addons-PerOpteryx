/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.provider;

import de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionFactory;

import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import genericdesigndecision.universalDoF.provider.AMetamodelDescriptionItemProvider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelDescriptionItemProvider extends AMetamodelDescriptionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelDescriptionItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns MetamodelDescription.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MetamodelDescription"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Metamodel labelValue = ((MetamodelDescription) object).getName();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ? getString("_UI_MetamodelDescription_type")
				: getString("_UI_MetamodelDescription_type") + " " + label;
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

		newChildDescriptors.add(createChildParameter(
				UniversalDoFPackage.Literals.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION,
				designdecisionFactory.eINSTANCE.createMetamodelDescription()));

		newChildDescriptors.add(createChildParameter(
				UniversalDoFPackage.Literals.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION,
				designdecisionFactory.eINSTANCE.createGenomeToCandidateModelTransformation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DesignDecisionEditPlugin.INSTANCE;
	}

}
