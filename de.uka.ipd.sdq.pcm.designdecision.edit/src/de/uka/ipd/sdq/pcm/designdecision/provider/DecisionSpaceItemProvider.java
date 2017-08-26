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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import de.uka.ipd.sdq.featuremodel.provider.NamedElementItemProvider;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.DecisionSpace} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class DecisionSpaceItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public DecisionSpaceItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
	 * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DecisionSpace.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DecisionSpace"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DecisionSpace) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_DecisionSpace_type") : getString("_UI_DecisionSpace_type") + " " + label;
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

		switch (notification.getFeatureID(DecisionSpace.class)) {
		case designdecisionPackage.DECISION_SPACE__DEGREES_OF_FREEDOM:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
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

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, designdecisionFactory.eINSTANCE.createDegreeOfFreedomInstance()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createClassAsReferenceDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createContinuousRangeDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createDiscreteRangeDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createOrderedIntegerDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createContinuousComponentParamDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createContinuousProcessingRateDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createDiscreteComponentParamDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createDiscreteProcessingRateDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createFeatureGroupDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createNumberOfCoresAsListDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createNumberOfCoresAsRangeDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createOptionalFeatureDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createResourceContainerReplicationDegree()));

		newChildDescriptors
				.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createResourceContainerReplicationDegreeWithComponentChange()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createResourceSelectionDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createSchedulingPolicyDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createStringComponentParamDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createAllocationDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createAssembledComponentDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createCapacityDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createMonitoringDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createATNumberOfReplicaDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createConcernDegree()));

		newChildDescriptors.add(createChildParameter(designdecisionPackage.Literals.DECISION_SPACE__DEGREES_OF_FREEDOM, specificFactory.eINSTANCE.createOptionalAsDegree()));
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
