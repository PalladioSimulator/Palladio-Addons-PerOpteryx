/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import de.uka.ipd.sdq.pcm.designdecision.specific.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class specificFactoryImpl extends EFactoryImpl implements specificFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static specificFactory init() {
		try {
			specificFactory thespecificFactory = (specificFactory) EPackage.Registry.INSTANCE.getEFactory(specificPackage.eNS_URI);
			if (thespecificFactory != null) {
				return thespecificFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new specificFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public specificFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case specificPackage.EXCHANGE_COMPONENT_RULE:
			return createExchangeComponentRule();
		case specificPackage.CLASS_AS_REFERENCE_DEGREE:
			return createClassAsReferenceDegree();
		case specificPackage.CONTINUOUS_RANGE_DEGREE:
			return createContinuousRangeDegree();
		case specificPackage.DISCRETE_RANGE_DEGREE:
			return createDiscreteRangeDegree();
		case specificPackage.ORDERED_INTEGER_DEGREE:
			return createOrderedIntegerDegree();
		case specificPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE:
			return createContinuousComponentParamDegree();
		case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE:
			return createContinuousProcessingRateDegree();
		case specificPackage.DISCRETE_COMPONENT_PARAM_DEGREE:
			return createDiscreteComponentParamDegree();
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE:
			return createDiscreteProcessingRateDegree();
		case specificPackage.FEATURE_GROUP_DEGREE:
			return createFeatureGroupDegree();
		case specificPackage.FEATURE_SUBSET:
			return createFeatureSubset();
		case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE:
			return createNumberOfCoresAsListDegree();
		case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE:
			return createNumberOfCoresAsRangeDegree();
		case specificPackage.OPTIONAL_FEATURE_DEGREE:
			return createOptionalFeatureDegree();
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE:
			return createResourceContainerReplicationDegree();
		case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE:
			return createResourceContainerReplicationDegreeWithComponentChange();
		case specificPackage.RESOURCE_SELECTION_DEGREE:
			return createResourceSelectionDegree();
		case specificPackage.SCHEDULING_POLICY_DEGREE:
			return createSchedulingPolicyDegree();
		case specificPackage.STRING_COMPONENT_PARAM_DEGREE:
			return createStringComponentParamDegree();
		case specificPackage.ALLOCATION_DEGREE:
			return createAllocationDegree();
		case specificPackage.ASSEMBLED_COMPONENT_DEGREE:
			return createAssembledComponentDegree();
		case specificPackage.CAPACITY_DEGREE:
			return createCapacityDegree();
		case specificPackage.MONITORING_DEGREE:
			return createMonitoringDegree();
		case specificPackage.AT_NUMBER_OF_REPLICA_DEGREE:
			return createATNumberOfReplicaDegree();
		case specificPackage.CONCERN_DEGREE:
			return createConcernDegree();
		case specificPackage.OPTIONAL_AS_DEGREE:
			return createOptionalAsDegree();
		case specificPackage.FEATURE_ACTIVE_INDICATOR:
			return createFeatureActiveIndicator();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExchangeComponentRule createExchangeComponentRule() {
		ExchangeComponentRuleImpl exchangeComponentRule = new ExchangeComponentRuleImpl();
		return exchangeComponentRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClassAsReferenceDegree createClassAsReferenceDegree() {
		ClassAsReferenceDegreeImpl classAsReferenceDegree = new ClassAsReferenceDegreeImpl();
		return classAsReferenceDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousRangeDegree createContinuousRangeDegree() {
		ContinuousRangeDegreeImpl continuousRangeDegree = new ContinuousRangeDegreeImpl();
		return continuousRangeDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteRangeDegree createDiscreteRangeDegree() {
		DiscreteRangeDegreeImpl discreteRangeDegree = new DiscreteRangeDegreeImpl();
		return discreteRangeDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderedIntegerDegree createOrderedIntegerDegree() {
		OrderedIntegerDegreeImpl orderedIntegerDegree = new OrderedIntegerDegreeImpl();
		return orderedIntegerDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousComponentParamDegree createContinuousComponentParamDegree() {
		ContinuousComponentParamDegreeImpl continuousComponentParamDegree = new ContinuousComponentParamDegreeImpl();
		return continuousComponentParamDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContinuousProcessingRateDegree createContinuousProcessingRateDegree() {
		ContinuousProcessingRateDegreeImpl continuousProcessingRateDegree = new ContinuousProcessingRateDegreeImpl();
		return continuousProcessingRateDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteComponentParamDegree createDiscreteComponentParamDegree() {
		DiscreteComponentParamDegreeImpl discreteComponentParamDegree = new DiscreteComponentParamDegreeImpl();
		return discreteComponentParamDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiscreteProcessingRateDegree createDiscreteProcessingRateDegree() {
		DiscreteProcessingRateDegreeImpl discreteProcessingRateDegree = new DiscreteProcessingRateDegreeImpl();
		return discreteProcessingRateDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureGroupDegree createFeatureGroupDegree() {
		FeatureGroupDegreeImpl featureGroupDegree = new FeatureGroupDegreeImpl();
		return featureGroupDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureSubset createFeatureSubset() {
		FeatureSubsetImpl featureSubset = new FeatureSubsetImpl();
		return featureSubset;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfCoresAsListDegree createNumberOfCoresAsListDegree() {
		NumberOfCoresAsListDegreeImpl numberOfCoresAsListDegree = new NumberOfCoresAsListDegreeImpl();
		return numberOfCoresAsListDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumberOfCoresAsRangeDegree createNumberOfCoresAsRangeDegree() {
		NumberOfCoresAsRangeDegreeImpl numberOfCoresAsRangeDegree = new NumberOfCoresAsRangeDegreeImpl();
		return numberOfCoresAsRangeDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionalFeatureDegree createOptionalFeatureDegree() {
		OptionalFeatureDegreeImpl optionalFeatureDegree = new OptionalFeatureDegreeImpl();
		return optionalFeatureDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainerReplicationDegree createResourceContainerReplicationDegree() {
		ResourceContainerReplicationDegreeImpl resourceContainerReplicationDegree = new ResourceContainerReplicationDegreeImpl();
		return resourceContainerReplicationDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainerReplicationDegreeWithComponentChange createResourceContainerReplicationDegreeWithComponentChange() {
		ResourceContainerReplicationDegreeWithComponentChangeImpl resourceContainerReplicationDegreeWithComponentChange = new ResourceContainerReplicationDegreeWithComponentChangeImpl();
		return resourceContainerReplicationDegreeWithComponentChange;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceSelectionDegree createResourceSelectionDegree() {
		ResourceSelectionDegreeImpl resourceSelectionDegree = new ResourceSelectionDegreeImpl();
		return resourceSelectionDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchedulingPolicyDegree createSchedulingPolicyDegree() {
		SchedulingPolicyDegreeImpl schedulingPolicyDegree = new SchedulingPolicyDegreeImpl();
		return schedulingPolicyDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringComponentParamDegree createStringComponentParamDegree() {
		StringComponentParamDegreeImpl stringComponentParamDegree = new StringComponentParamDegreeImpl();
		return stringComponentParamDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllocationDegree createAllocationDegree() {
		AllocationDegreeImpl allocationDegree = new AllocationDegreeImpl();
		return allocationDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssembledComponentDegree createAssembledComponentDegree() {
		AssembledComponentDegreeImpl assembledComponentDegree = new AssembledComponentDegreeImpl();
		return assembledComponentDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapacityDegree createCapacityDegree() {
		CapacityDegreeImpl capacityDegree = new CapacityDegreeImpl();
		return capacityDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitoringDegree createMonitoringDegree() {
		MonitoringDegreeImpl monitoringDegree = new MonitoringDegreeImpl();
		return monitoringDegree;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATNumberOfReplicaDegree createATNumberOfReplicaDegree() {
		ATNumberOfReplicaDegreeImpl atNumberOfReplicaDegree = new ATNumberOfReplicaDegreeImpl();
		return atNumberOfReplicaDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcernDegree createConcernDegree() {
		ConcernDegreeImpl concernDegree = new ConcernDegreeImpl();
		return concernDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OptionalAsDegree createOptionalAsDegree() {
		OptionalAsDegreeImpl optionalAsDegree = new OptionalAsDegreeImpl();
		return optionalAsDegree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureActiveIndicator createFeatureActiveIndicator() {
		FeatureActiveIndicatorImpl featureActiveIndicator = new FeatureActiveIndicatorImpl();
		return featureActiveIndicator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public specificPackage getspecificPackage() {
		return (specificPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static specificPackage getPackage() {
		return specificPackage.eINSTANCE;
	}

} // specificFactoryImpl
