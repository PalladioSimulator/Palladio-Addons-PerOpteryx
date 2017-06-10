/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.provider;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractFactory;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeScale;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypeFactory;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarationsFactory;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfileFactory;

import de.uka.ipd.sdq.probfunction.ProbfunctionFactory;

import de.uka.ipd.sdq.stoex.StoexFactory;

import de.uka.ipd.sdq.units.UnitsFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.palladiosimulator.pcm.PcmFactory;

import org.palladiosimulator.pcm.allocation.AllocationFactory;

import org.palladiosimulator.pcm.core.CoreFactory;

import org.palladiosimulator.pcm.core.composition.CompositionFactory;

import org.palladiosimulator.pcm.core.entity.EntityFactory;

import org.palladiosimulator.pcm.parameter.ParameterFactory;

import org.palladiosimulator.pcm.qosannotations.QosannotationsFactory;

import org.palladiosimulator.pcm.qosannotations.qos_performance.QosPerformanceFactory;

import org.palladiosimulator.pcm.qosannotations.qos_reliability.QosReliabilityFactory;

import org.palladiosimulator.pcm.reliability.ReliabilityFactory;

import org.palladiosimulator.pcm.repository.RepositoryFactory;

import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentFactory;

import org.palladiosimulator.pcm.resourcetype.ResourcetypeFactory;

import org.palladiosimulator.pcm.seff.SeffFactory;

import org.palladiosimulator.pcm.seff.seff_performance.SeffPerformanceFactory;

import org.palladiosimulator.pcm.seff.seff_reliability.SeffReliabilityFactory;

import org.palladiosimulator.pcm.subsystem.SubsystemFactory;

import org.palladiosimulator.pcm.system.SystemFactory;

import org.palladiosimulator.pcm.usagemodel.UsagemodelFactory;

/**
 * This is the item provider adapter for a {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeScale} object.
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
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_DimensionTypeScale_scale_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_DimensionTypeScale_scale_feature", "_UI_DimensionTypeScale_type"),
				QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
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
			childrenFeatures.add(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS);
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
		String label = ((DimensionTypeScale<?>) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_DimensionTypeScale_type")
				: getString("_UI_DimensionTypeScale_type") + " " + label;
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
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case QMLContractTypePackage.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS:
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

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createDimensionTypeSet()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createRelationSemantics()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createElement()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createOrder()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createDimensionTypeEnum()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createUnit()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createDimensionTypeNumeric()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createNumericRange()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createQMLContractType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createUnitRepository()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createDimensionTypeRepository()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createDimension()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createDimensionTypeScale()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractTypeFactory.eINSTANCE.createScaleElement()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLProfileFactory.eINSTANCE.createSimpleQMLProfile()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLProfileFactory.eINSTANCE.createRefinedQMLProfile()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLProfileFactory.eINSTANCE.createUsageScenarioRequirement()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLProfileFactory.eINSTANCE.createEntryLevelSystemCallRequirement()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLDeclarationsFactory.eINSTANCE.createQMLDeclarations()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createSimpleQMLContract()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createPercentile()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createFrequency()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createRangeValue()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createMean()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createVariance()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createNumericLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createEnumLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createSetLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createRefinedQMLContract()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createValue()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createObjective()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createConstraint()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createRestriction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createGoal()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QMLContractFactory.eINSTANCE.createScaleLiteral()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, PcmFactory.eINSTANCE.createDummyClass()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CoreFactory.eINSTANCE.createPCMRandomVariable()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				EntityFactory.eINSTANCE.createResourceProvidedRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				EntityFactory.eINSTANCE.createResourceInterfaceRequiringEntity()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				EntityFactory.eINSTANCE.createResourceRequiredRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				EntityFactory.eINSTANCE.createResourceInterfaceProvidingEntity()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				EntityFactory.eINSTANCE.createResourceInterfaceProvidingRequiringEntity()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createResourceRequiredDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createEventChannel()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createEventChannelSourceConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createEventChannelSinkConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createProvidedDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createRequiredDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createAssemblyConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createAssemblyEventConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createSourceDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createSinkDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createAssemblyInfrastructureConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createProvidedInfrastructureDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createRequiredInfrastructureDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createRequiredResourceDelegationConnector()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				CompositionFactory.eINSTANCE.createAssemblyContext()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createUsageScenario()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createUserData()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createUsageModel()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createEntryLevelSystemCall()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createScenarioBehaviour()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createBranchTransition()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, UsagemodelFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, UsagemodelFactory.eINSTANCE.createStop()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createStart()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createOpenWorkload()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createDelay()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UsagemodelFactory.eINSTANCE.createClosedWorkload()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createPassiveResource()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createBasicComponent()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createRepository()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createRequiredCharacterisation()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createEventGroup()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createEventType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createExceptionType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createInfrastructureSignature()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createInfrastructureInterface()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createInfrastructureRequiredRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createOperationSignature()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createOperationInterface()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createOperationRequiredRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createSourceRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createSinkRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createOperationProvidedRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createInfrastructureProvidedRole()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createCompleteComponentType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createProvidesComponentType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createCompositeComponent()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createCollectionDataType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createCompositeDataType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				RepositoryFactory.eINSTANCE.createInnerDeclaration()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourcetypeFactory.eINSTANCE.createResourceSignature()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourcetypeFactory.eINSTANCE.createProcessingResourceType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourcetypeFactory.eINSTANCE.createResourceRepository()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourcetypeFactory.eINSTANCE.createSchedulingPolicy()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourcetypeFactory.eINSTANCE.createCommunicationLinkResourceType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourcetypeFactory.eINSTANCE.createResourceInterface()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ParameterFactory.eINSTANCE.createVariableUsage()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ParameterFactory.eINSTANCE.createVariableCharacterisation()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ParameterFactory.eINSTANCE.createCharacterisedVariable()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ReliabilityFactory.eINSTANCE.createHardwareInducedFailureType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ReliabilityFactory.eINSTANCE.createSoftwareInducedFailureType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ReliabilityFactory.eINSTANCE.createInternalFailureOccurrenceDescription()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ReliabilityFactory.eINSTANCE.createNetworkInducedFailureType()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ReliabilityFactory.eINSTANCE.createExternalFailureOccurrenceDescription()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ReliabilityFactory.eINSTANCE.createResourceTimeoutFailureType()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, SeffFactory.eINSTANCE.createStopAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createResourceDemandingBehaviour()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createBranchAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createStartAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createResourceDemandingSEFF()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createResourceDemandingInternalBehaviour()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createReleaseAction()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, SeffFactory.eINSTANCE.createLoopAction()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, SeffFactory.eINSTANCE.createForkAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createForkedBehaviour()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createSynchronisationPoint()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createExternalCallAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createCallReturnAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createProbabilisticBranchTransition()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createAcquireAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createCollectionIteratorAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createGuardedBranchTransition()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createSetVariableAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createInternalCallAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createEmitEventAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffFactory.eINSTANCE.createInternalAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffPerformanceFactory.eINSTANCE.createInfrastructureCall()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffPerformanceFactory.eINSTANCE.createResourceCall()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffPerformanceFactory.eINSTANCE.createParametricResourceDemand()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffReliabilityFactory.eINSTANCE.createRecoveryActionBehaviour()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SeffReliabilityFactory.eINSTANCE.createRecoveryAction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QosannotationsFactory.eINSTANCE.createQoSAnnotations()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QosPerformanceFactory.eINSTANCE.createSystemSpecifiedExecutionTime()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QosPerformanceFactory.eINSTANCE.createComponentSpecifiedExecutionTime()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				QosReliabilityFactory.eINSTANCE.createSpecifiedReliabilityAnnotation()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, SystemFactory.eINSTANCE.createSystem()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourceenvironmentFactory.eINSTANCE.createResourceEnvironment()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourceenvironmentFactory.eINSTANCE.createLinkingResource()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourceenvironmentFactory.eINSTANCE.createResourceContainer()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourceenvironmentFactory.eINSTANCE.createProcessingResourceSpecification()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourceenvironmentFactory.eINSTANCE.createCommunicationLinkResourceSpecification()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ResourceenvironmentFactory.eINSTANCE.createHDDProcessingResourceSpecification()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				AllocationFactory.eINSTANCE.createAllocationContext()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				AllocationFactory.eINSTANCE.createAllocation()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				SubsystemFactory.eINSTANCE.createSubSystem()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createBoxedPDF()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createContinuousSample()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createProbabilityMassFunction()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createSample()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createSamplePDF()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createComplex()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createExponentialDistribution()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createNormalDistribution()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createLognormalDistribution()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createGammaDistribution()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createIntSample()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createBoolSample()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createDoubleSample()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				ProbfunctionFactory.eINSTANCE.createStringSample()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createVariableReference()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createNamespaceReference()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, StoexFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createTermExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createProductExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createProbabilityFunctionLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createParenthesis()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createIntLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createDoubleLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createCompareExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createBoolLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createStringLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createPowerExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createBooleanOperatorExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createNotExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createNegativeExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createFunctionLiteral()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createIfElseExpression()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				StoexFactory.eINSTANCE.createRandomVariable()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, UnitsFactory.eINSTANCE.createBaseUnit()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UnitsFactory.eINSTANCE.createUnitRepository()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UnitsFactory.eINSTANCE.createUnitMultiplication()));

		newChildDescriptors.add(
				createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS, UnitsFactory.eINSTANCE.createUnitPower()));

		newChildDescriptors.add(createChildParameter(QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS,
				UnitsFactory.eINSTANCE.createUnitDivision()));
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

		boolean qualify = childFeature == QMLContractTypePackage.Literals.DIMENSION_TYPE__RELATION_SEMANTICS
				|| childFeature == QMLContractTypePackage.Literals.DIMENSION_TYPE_SCALE__SCALE_ELEMENTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
