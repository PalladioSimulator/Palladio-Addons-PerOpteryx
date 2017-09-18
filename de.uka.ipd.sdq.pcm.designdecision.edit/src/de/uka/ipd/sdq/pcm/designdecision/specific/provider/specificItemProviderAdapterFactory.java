/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.uka.ipd.sdq.pcm.designdecision.specific.util.specificAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class specificItemProviderAdapterFactory extends specificAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public specificItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ExchangeComponentRuleItemProvider exchangeComponentRuleItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExchangeComponentRuleAdapter() {
		if (exchangeComponentRuleItemProvider == null) {
			exchangeComponentRuleItemProvider = new ExchangeComponentRuleItemProvider(this);
		}

		return exchangeComponentRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ClassAsReferenceDegreeItemProvider classAsReferenceDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createClassAsReferenceDegreeAdapter() {
		if (classAsReferenceDegreeItemProvider == null) {
			classAsReferenceDegreeItemProvider = new ClassAsReferenceDegreeItemProvider(this);
		}

		return classAsReferenceDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ContinuousRangeDegreeItemProvider continuousRangeDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContinuousRangeDegreeAdapter() {
		if (continuousRangeDegreeItemProvider == null) {
			continuousRangeDegreeItemProvider = new ContinuousRangeDegreeItemProvider(this);
		}

		return continuousRangeDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DiscreteRangeDegreeItemProvider discreteRangeDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDiscreteRangeDegreeAdapter() {
		if (discreteRangeDegreeItemProvider == null) {
			discreteRangeDegreeItemProvider = new DiscreteRangeDegreeItemProvider(this);
		}

		return discreteRangeDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected OrderedIntegerDegreeItemProvider orderedIntegerDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOrderedIntegerDegreeAdapter() {
		if (orderedIntegerDegreeItemProvider == null) {
			orderedIntegerDegreeItemProvider = new OrderedIntegerDegreeItemProvider(this);
		}

		return orderedIntegerDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousComponentParamDegreeItemProvider continuousComponentParamDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createContinuousComponentParamDegreeAdapter() {
		if (continuousComponentParamDegreeItemProvider == null) {
			continuousComponentParamDegreeItemProvider = new ContinuousComponentParamDegreeItemProvider(this);
		}

		return continuousComponentParamDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousProcessingRateDegreeItemProvider continuousProcessingRateDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createContinuousProcessingRateDegreeAdapter() {
		if (continuousProcessingRateDegreeItemProvider == null) {
			continuousProcessingRateDegreeItemProvider = new ContinuousProcessingRateDegreeItemProvider(this);
		}

		return continuousProcessingRateDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteComponentParamDegreeItemProvider discreteComponentParamDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDiscreteComponentParamDegreeAdapter() {
		if (discreteComponentParamDegreeItemProvider == null) {
			discreteComponentParamDegreeItemProvider = new DiscreteComponentParamDegreeItemProvider(this);
		}

		return discreteComponentParamDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscreteProcessingRateDegreeItemProvider discreteProcessingRateDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createDiscreteProcessingRateDegreeAdapter() {
		if (discreteProcessingRateDegreeItemProvider == null) {
			discreteProcessingRateDegreeItemProvider = new DiscreteProcessingRateDegreeItemProvider(this);
		}

		return discreteProcessingRateDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FeatureGroupDegreeItemProvider featureGroupDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureGroupDegreeAdapter() {
		if (featureGroupDegreeItemProvider == null) {
			featureGroupDegreeItemProvider = new FeatureGroupDegreeItemProvider(this);
		}

		return featureGroupDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected FeatureSubsetItemProvider featureSubsetItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureSubsetAdapter() {
		if (featureSubsetItemProvider == null) {
			featureSubsetItemProvider = new FeatureSubsetItemProvider(this);
		}

		return featureSubsetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected NumberOfCoresAsListDegreeItemProvider numberOfCoresAsListDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createNumberOfCoresAsListDegreeAdapter() {
		if (numberOfCoresAsListDegreeItemProvider == null) {
			numberOfCoresAsListDegreeItemProvider = new NumberOfCoresAsListDegreeItemProvider(this);
		}

		return numberOfCoresAsListDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected NumberOfCoresAsRangeDegreeItemProvider numberOfCoresAsRangeDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createNumberOfCoresAsRangeDegreeAdapter() {
		if (numberOfCoresAsRangeDegreeItemProvider == null) {
			numberOfCoresAsRangeDegreeItemProvider = new NumberOfCoresAsRangeDegreeItemProvider(this);
		}

		return numberOfCoresAsRangeDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected OptionalFeatureDegreeItemProvider optionalFeatureDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionalFeatureDegreeAdapter() {
		if (optionalFeatureDegreeItemProvider == null) {
			optionalFeatureDegreeItemProvider = new OptionalFeatureDegreeItemProvider(this);
		}

		return optionalFeatureDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerReplicationDegreeItemProvider resourceContainerReplicationDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createResourceContainerReplicationDegreeAdapter() {
		if (resourceContainerReplicationDegreeItemProvider == null) {
			resourceContainerReplicationDegreeItemProvider = new ResourceContainerReplicationDegreeItemProvider(this);
		}

		return resourceContainerReplicationDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange} instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerReplicationDegreeWithComponentChangeItemProvider resourceContainerReplicationDegreeWithComponentChangeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceContainerReplicationDegreeWithComponentChangeAdapter() {
		if (resourceContainerReplicationDegreeWithComponentChangeItemProvider == null) {
			resourceContainerReplicationDegreeWithComponentChangeItemProvider = new ResourceContainerReplicationDegreeWithComponentChangeItemProvider(this);
		}

		return resourceContainerReplicationDegreeWithComponentChangeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ResourceSelectionDegreeItemProvider resourceSelectionDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createResourceSelectionDegreeAdapter() {
		if (resourceSelectionDegreeItemProvider == null) {
			resourceSelectionDegreeItemProvider = new ResourceSelectionDegreeItemProvider(this);
		}

		return resourceSelectionDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SchedulingPolicyDegreeItemProvider schedulingPolicyDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createSchedulingPolicyDegreeAdapter() {
		if (schedulingPolicyDegreeItemProvider == null) {
			schedulingPolicyDegreeItemProvider = new SchedulingPolicyDegreeItemProvider(this);
		}

		return schedulingPolicyDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected StringComponentParamDegreeItemProvider stringComponentParamDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createStringComponentParamDegreeAdapter() {
		if (stringComponentParamDegreeItemProvider == null) {
			stringComponentParamDegreeItemProvider = new StringComponentParamDegreeItemProvider(this);
		}

		return stringComponentParamDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AllocationDegreeItemProvider allocationDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllocationDegreeAdapter() {
		if (allocationDegreeItemProvider == null) {
			allocationDegreeItemProvider = new AllocationDegreeItemProvider(this);
		}

		return allocationDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected AssembledComponentDegreeItemProvider assembledComponentDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createAssembledComponentDegreeAdapter() {
		if (assembledComponentDegreeItemProvider == null) {
			assembledComponentDegreeItemProvider = new AssembledComponentDegreeItemProvider(this);
		}

		return assembledComponentDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CapacityDegreeItemProvider capacityDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapacityDegreeAdapter() {
		if (capacityDegreeItemProvider == null) {
			capacityDegreeItemProvider = new CapacityDegreeItemProvider(this);
		}

		return capacityDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected MonitoringDegreeItemProvider monitoringDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMonitoringDegreeAdapter() {
		if (monitoringDegreeItemProvider == null) {
			monitoringDegreeItemProvider = new MonitoringDegreeItemProvider(this);
		}

		return monitoringDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ATNumberOfReplicaDegreeItemProvider atNumberOfReplicaDegreeItemProvider;

	/**
	 * This creates an adapter for a
	 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createATNumberOfReplicaDegreeAdapter() {
		if (atNumberOfReplicaDegreeItemProvider == null) {
			atNumberOfReplicaDegreeItemProvider = new ATNumberOfReplicaDegreeItemProvider(this);
		}

		return atNumberOfReplicaDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernDegreeItemProvider concernDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConcernDegreeAdapter() {
		if (concernDegreeItemProvider == null) {
			concernDegreeItemProvider = new ConcernDegreeItemProvider(this);
		}

		return concernDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalAsDegree} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalAsDegreeItemProvider optionalAsDegreeItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalAsDegree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionalAsDegreeAdapter() {
		if (optionalAsDegreeItemProvider == null) {
			optionalAsDegreeItemProvider = new OptionalAsDegreeItemProvider(this);
		}

		return optionalAsDegreeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureActiveIndicator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureActiveIndicatorItemProvider featureActiveIndicatorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureActiveIndicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureActiveIndicatorAdapter() {
		if (featureActiveIndicatorItemProvider == null) {
			featureActiveIndicatorItemProvider = new FeatureActiveIndicatorItemProvider(this);
		}

		return featureActiveIndicatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.uka.ipd.sdq.pcm.designdecision.specific.SolutionIndicator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionIndicatorItemProvider solutionIndicatorItemProvider;

	/**
	 * This creates an adapter for a {@link de.uka.ipd.sdq.pcm.designdecision.specific.SolutionIndicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolutionIndicatorAdapter() {
		if (solutionIndicatorItemProvider == null) {
			solutionIndicatorItemProvider = new SolutionIndicatorItemProvider(this);
		}

		return solutionIndicatorItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (exchangeComponentRuleItemProvider != null)
			exchangeComponentRuleItemProvider.dispose();
		if (classAsReferenceDegreeItemProvider != null)
			classAsReferenceDegreeItemProvider.dispose();
		if (continuousRangeDegreeItemProvider != null)
			continuousRangeDegreeItemProvider.dispose();
		if (discreteRangeDegreeItemProvider != null)
			discreteRangeDegreeItemProvider.dispose();
		if (orderedIntegerDegreeItemProvider != null)
			orderedIntegerDegreeItemProvider.dispose();
		if (continuousComponentParamDegreeItemProvider != null)
			continuousComponentParamDegreeItemProvider.dispose();
		if (continuousProcessingRateDegreeItemProvider != null)
			continuousProcessingRateDegreeItemProvider.dispose();
		if (discreteComponentParamDegreeItemProvider != null)
			discreteComponentParamDegreeItemProvider.dispose();
		if (discreteProcessingRateDegreeItemProvider != null)
			discreteProcessingRateDegreeItemProvider.dispose();
		if (featureGroupDegreeItemProvider != null)
			featureGroupDegreeItemProvider.dispose();
		if (featureSubsetItemProvider != null)
			featureSubsetItemProvider.dispose();
		if (numberOfCoresAsListDegreeItemProvider != null)
			numberOfCoresAsListDegreeItemProvider.dispose();
		if (numberOfCoresAsRangeDegreeItemProvider != null)
			numberOfCoresAsRangeDegreeItemProvider.dispose();
		if (optionalFeatureDegreeItemProvider != null)
			optionalFeatureDegreeItemProvider.dispose();
		if (resourceContainerReplicationDegreeItemProvider != null)
			resourceContainerReplicationDegreeItemProvider.dispose();
		if (resourceContainerReplicationDegreeWithComponentChangeItemProvider != null)
			resourceContainerReplicationDegreeWithComponentChangeItemProvider.dispose();
		if (resourceSelectionDegreeItemProvider != null)
			resourceSelectionDegreeItemProvider.dispose();
		if (schedulingPolicyDegreeItemProvider != null)
			schedulingPolicyDegreeItemProvider.dispose();
		if (stringComponentParamDegreeItemProvider != null)
			stringComponentParamDegreeItemProvider.dispose();
		if (allocationDegreeItemProvider != null)
			allocationDegreeItemProvider.dispose();
		if (assembledComponentDegreeItemProvider != null)
			assembledComponentDegreeItemProvider.dispose();
		if (capacityDegreeItemProvider != null)
			capacityDegreeItemProvider.dispose();
		if (monitoringDegreeItemProvider != null)
			monitoringDegreeItemProvider.dispose();
		if (atNumberOfReplicaDegreeItemProvider != null)
			atNumberOfReplicaDegreeItemProvider.dispose();
		if (concernDegreeItemProvider != null)
			concernDegreeItemProvider.dispose();
		if (optionalAsDegreeItemProvider != null)
			optionalAsDegreeItemProvider.dispose();
		if (featureActiveIndicatorItemProvider != null)
			featureActiveIndicatorItemProvider.dispose();
		if (solutionIndicatorItemProvider != null)
			solutionIndicatorItemProvider.dispose();
	}

}
