/**
 */
package featureSolution.provider;


import featureSolution.BehaviourInclusion;
import featureSolution.FeatureSolutionPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import placementDescription.PlacementDescriptionFactory;

/**
 * This is the item provider adapter for a {@link featureSolution.BehaviourInclusion} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourInclusionItemProvider extends InclusionMechanismItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourInclusionItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__POINT_CUT);
			childrenFeatures.add(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__ADVICE);
			childrenFeatures.add(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__IMPORTS);
			childrenFeatures.add(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION);
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
	 * This returns BehaviourInclusion.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BehaviourInclusion"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BehaviourInclusion)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BehaviourInclusion_type") :
			getString("_UI_BehaviourInclusion_type") + " " + label;
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

		switch (notification.getFeatureID(BehaviourInclusion.class)) {
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__POINT_CUT:
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__ADVICE:
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__IMPORTS:
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION:
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
				(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__POINT_CUT,
				 PlacementDescriptionFactory.eINSTANCE.createPointCut()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__ADVICE,
				 PlacementDescriptionFactory.eINSTANCE.createAdvice()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__IMPORTS,
				 PlacementDescriptionFactory.eINSTANCE.createImport()));

		newChildDescriptors.add
			(createChildParameter
				(FeatureSolutionPackage.Literals.BEHAVIOUR_INCLUSION__FEATURE_COMPLETION,
				 PlacementDescriptionFactory.eINSTANCE.createFeatureSelection()));
	}

}
