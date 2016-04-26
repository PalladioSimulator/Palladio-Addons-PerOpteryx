/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

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
 *
 * @generated
 */
public class specificFactoryImpl extends EFactoryImpl implements specificFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static specificFactory init() {
        try {
            final specificFactory thespecificFactory = (specificFactory) EPackage.Registry.INSTANCE
                    .getEFactory(specificPackage.eNS_URI);
            if (thespecificFactory != null) {
                return thespecificFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new specificFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public specificFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case specificPackage.EXCHANGE_COMPONENT_RULE:
            return this.createExchangeComponentRule();
        case specificPackage.CLASS_AS_REFERENCE_DEGREE:
            return this.createClassAsReferenceDegree();
        case specificPackage.CONTINUOUS_RANGE_DEGREE:
            return this.createContinuousRangeDegree();
        case specificPackage.DISCRETE_RANGE_DEGREE:
            return this.createDiscreteRangeDegree();
        case specificPackage.ORDERED_INTEGER_DEGREE:
            return this.createOrderedIntegerDegree();
        case specificPackage.CONTINUOUS_COMPONENT_PARAM_DEGREE:
            return this.createContinuousComponentParamDegree();
        case specificPackage.CONTINUOUS_PROCESSING_RATE_DEGREE:
            return this.createContinuousProcessingRateDegree();
        case specificPackage.DISCRETE_COMPONENT_PARAM_DEGREE:
            return this.createDiscreteComponentParamDegree();
        case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE:
            return this.createDiscreteProcessingRateDegree();
        case specificPackage.FEATURE_GROUP_DEGREE:
            return this.createFeatureGroupDegree();
        case specificPackage.FEATURE_SUBSET:
            return this.createFeatureSubset();
        case specificPackage.NUMBER_OF_CORES_AS_LIST_DEGREE:
            return this.createNumberOfCoresAsListDegree();
        case specificPackage.NUMBER_OF_CORES_AS_RANGE_DEGREE:
            return this.createNumberOfCoresAsRangeDegree();
        case specificPackage.OPTIONAL_FEATURE_DEGREE:
            return this.createOptionalFeatureDegree();
        case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE:
            return this.createResourceContainerReplicationDegree();
        case specificPackage.RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE:
            return this.createResourceContainerReplicationDegreeWithComponentChange();
        case specificPackage.RESOURCE_SELECTION_DEGREE:
            return this.createResourceSelectionDegree();
        case specificPackage.SCHEDULING_POLICY_DEGREE:
            return this.createSchedulingPolicyDegree();
        case specificPackage.STRING_COMPONENT_PARAM_DEGREE:
            return this.createStringComponentParamDegree();
        case specificPackage.ALLOCATION_DEGREE:
            return this.createAllocationDegree();
        case specificPackage.ASSEMBLED_COMPONENT_DEGREE:
            return this.createAssembledComponentDegree();
        case specificPackage.CAPACITY_DEGREE:
            return this.createCapacityDegree();
        case specificPackage.MONITORING_DEGREE:
            return this.createMonitoringDegree();
        case specificPackage.AT_NUMBER_OF_REPLICA_DEGREE:
            return this.createATNumberOfReplicaDegree();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ExchangeComponentRule createExchangeComponentRule() {
        final ExchangeComponentRuleImpl exchangeComponentRule = new ExchangeComponentRuleImpl();
        return exchangeComponentRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ClassAsReferenceDegree createClassAsReferenceDegree() {
        final ClassAsReferenceDegreeImpl classAsReferenceDegree = new ClassAsReferenceDegreeImpl();
        return classAsReferenceDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ContinuousRangeDegree createContinuousRangeDegree() {
        final ContinuousRangeDegreeImpl continuousRangeDegree = new ContinuousRangeDegreeImpl();
        return continuousRangeDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DiscreteRangeDegree createDiscreteRangeDegree() {
        final DiscreteRangeDegreeImpl discreteRangeDegree = new DiscreteRangeDegreeImpl();
        return discreteRangeDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OrderedIntegerDegree createOrderedIntegerDegree() {
        final OrderedIntegerDegreeImpl orderedIntegerDegree = new OrderedIntegerDegreeImpl();
        return orderedIntegerDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ContinuousComponentParamDegree createContinuousComponentParamDegree() {
        final ContinuousComponentParamDegreeImpl continuousComponentParamDegree = new ContinuousComponentParamDegreeImpl();
        return continuousComponentParamDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ContinuousProcessingRateDegree createContinuousProcessingRateDegree() {
        final ContinuousProcessingRateDegreeImpl continuousProcessingRateDegree = new ContinuousProcessingRateDegreeImpl();
        return continuousProcessingRateDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DiscreteComponentParamDegree createDiscreteComponentParamDegree() {
        final DiscreteComponentParamDegreeImpl discreteComponentParamDegree = new DiscreteComponentParamDegreeImpl();
        return discreteComponentParamDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DiscreteProcessingRateDegree createDiscreteProcessingRateDegree() {
        final DiscreteProcessingRateDegreeImpl discreteProcessingRateDegree = new DiscreteProcessingRateDegreeImpl();
        return discreteProcessingRateDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FeatureGroupDegree createFeatureGroupDegree() {
        final FeatureGroupDegreeImpl featureGroupDegree = new FeatureGroupDegreeImpl();
        return featureGroupDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public FeatureSubset createFeatureSubset() {
        final FeatureSubsetImpl featureSubset = new FeatureSubsetImpl();
        return featureSubset;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumberOfCoresAsListDegree createNumberOfCoresAsListDegree() {
        final NumberOfCoresAsListDegreeImpl numberOfCoresAsListDegree = new NumberOfCoresAsListDegreeImpl();
        return numberOfCoresAsListDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NumberOfCoresAsRangeDegree createNumberOfCoresAsRangeDegree() {
        final NumberOfCoresAsRangeDegreeImpl numberOfCoresAsRangeDegree = new NumberOfCoresAsRangeDegreeImpl();
        return numberOfCoresAsRangeDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OptionalFeatureDegree createOptionalFeatureDegree() {
        final OptionalFeatureDegreeImpl optionalFeatureDegree = new OptionalFeatureDegreeImpl();
        return optionalFeatureDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceContainerReplicationDegree createResourceContainerReplicationDegree() {
        final ResourceContainerReplicationDegreeImpl resourceContainerReplicationDegree = new ResourceContainerReplicationDegreeImpl();
        return resourceContainerReplicationDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceContainerReplicationDegreeWithComponentChange createResourceContainerReplicationDegreeWithComponentChange() {
        final ResourceContainerReplicationDegreeWithComponentChangeImpl resourceContainerReplicationDegreeWithComponentChange = new ResourceContainerReplicationDegreeWithComponentChangeImpl();
        return resourceContainerReplicationDegreeWithComponentChange;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ResourceSelectionDegree createResourceSelectionDegree() {
        final ResourceSelectionDegreeImpl resourceSelectionDegree = new ResourceSelectionDegreeImpl();
        return resourceSelectionDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SchedulingPolicyDegree createSchedulingPolicyDegree() {
        final SchedulingPolicyDegreeImpl schedulingPolicyDegree = new SchedulingPolicyDegreeImpl();
        return schedulingPolicyDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StringComponentParamDegree createStringComponentParamDegree() {
        final StringComponentParamDegreeImpl stringComponentParamDegree = new StringComponentParamDegreeImpl();
        return stringComponentParamDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AllocationDegree createAllocationDegree() {
        final AllocationDegreeImpl allocationDegree = new AllocationDegreeImpl();
        return allocationDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public AssembledComponentDegree createAssembledComponentDegree() {
        final AssembledComponentDegreeImpl assembledComponentDegree = new AssembledComponentDegreeImpl();
        return assembledComponentDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CapacityDegree createCapacityDegree() {
        final CapacityDegreeImpl capacityDegree = new CapacityDegreeImpl();
        return capacityDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MonitoringDegree createMonitoringDegree() {
        final MonitoringDegreeImpl monitoringDegree = new MonitoringDegreeImpl();
        return monitoringDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ATNumberOfReplicaDegree createATNumberOfReplicaDegree() {
        final ATNumberOfReplicaDegreeImpl atNumberOfReplicaDegree = new ATNumberOfReplicaDegreeImpl();
        return atNumberOfReplicaDegree;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public specificPackage getspecificPackage() {
        return (specificPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static specificPackage getPackage() {
        return specificPackage.eINSTANCE;
    }

} // specificFactoryImpl
