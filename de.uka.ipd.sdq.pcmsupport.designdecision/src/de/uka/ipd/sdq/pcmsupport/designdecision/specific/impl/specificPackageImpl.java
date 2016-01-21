/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcmsupport.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcmsupport.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class specificPackageImpl extends EPackageImpl implements specificPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeComponentRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedPrimitiveDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousComponentParamDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuousProcessingRateDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingRateDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingResourceDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteComponentParamDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteProcessingRateDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureConfigDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureGroupDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSubsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfCoresAsListDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfCoresDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberOfCoresAsRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionalFeatureDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerReplicationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceContainerReplicationDegreeWithComponentChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceSelectionDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulingPolicyDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringComponentParamDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assembledComponentDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringDegreeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private specificPackageImpl() {
		super(eNS_URI, specificFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link specificPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static specificPackage init() {
		if (isInited)
			return (specificPackage) EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI);

		// Obtain or create and register package
		specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof specificPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new specificPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();
		GenericdesigndecisionPackage.eINSTANCE.eClass();
		ResultdecoratorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI)
						: designdecisionPackage.eINSTANCE);
		qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI)
						: qualitypropertiesPackage.eINSTANCE);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
						: resourcerepositoryPackage.eINSTANCE);

		// Create package meta-data objects
		thespecificPackage.createPackageContents();
		thedesigndecisionPackage.createPackageContents();
		thequalitypropertiesPackage.createPackageContents();
		theresourcerepositoryPackage.createPackageContents();

		// Initialize created meta-data
		thespecificPackage.initializePackageContents();
		thedesigndecisionPackage.initializePackageContents();
		thequalitypropertiesPackage.initializePackageContents();
		theresourcerepositoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thespecificPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(specificPackage.eNS_URI, thespecificPackage);
		return thespecificPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExchangeComponentRule() {
		return exchangeComponentRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExchangeComponentRule_RepositoryComponent() {
		return (EReference) exchangeComponentRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExchangeComponentRule_AllocationContext() {
		return (EReference) exchangeComponentRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnorderedPrimitiveDegree() {
		return unorderedPrimitiveDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousComponentParamDegree() {
		return continuousComponentParamDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuousProcessingRateDegree() {
		return continuousProcessingRateDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingRateDegree() {
		return processingRateDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingResourceDegree() {
		return processingResourceDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingResourceDegree_Processingresourcetype() {
		return (EReference) processingResourceDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteComponentParamDegree() {
		return discreteComponentParamDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscreteProcessingRateDegree() {
		return discreteProcessingRateDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureConfigDegree() {
		return featureConfigDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureGroupDegree() {
		return featureGroupDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupDegree_Featuregroup() {
		return (EReference) featureGroupDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureGroupDegree_DomainOfFeatureConfigCombinations() {
		return (EReference) featureGroupDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureSubset() {
		return featureSubsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureSubset_Feature() {
		return (EReference) featureSubsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfCoresAsListDegree() {
		return numberOfCoresAsListDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfCoresDegree() {
		return numberOfCoresDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumberOfCoresAsRangeDegree() {
		return numberOfCoresAsRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOptionalFeatureDegree() {
		return optionalFeatureDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOptionalFeatureDegree_Simple() {
		return (EReference) optionalFeatureDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceContainerReplicationDegree() {
		return resourceContainerReplicationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceContainerReplicationDegreeWithComponentChange() {
		return resourceContainerReplicationDegreeWithComponentChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule() {
		return (EReference) resourceContainerReplicationDegreeWithComponentChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceSelectionDegree() {
		return resourceSelectionDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchedulingPolicyDegree() {
		return schedulingPolicyDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringComponentParamDegree() {
		return stringComponentParamDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationDegree() {
		return allocationDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssembledComponentDegree() {
		return assembledComponentDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapacityDegree() {
		return capacityDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringDegree() {
		return monitoringDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public specificFactory getspecificFactory() {
		return (specificFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		exchangeComponentRuleEClass = createEClass(EXCHANGE_COMPONENT_RULE);
		createEReference(exchangeComponentRuleEClass, EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT);
		createEReference(exchangeComponentRuleEClass, EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT);

		unorderedPrimitiveDegreeEClass = createEClass(UNORDERED_PRIMITIVE_DEGREE);

		continuousComponentParamDegreeEClass = createEClass(CONTINUOUS_COMPONENT_PARAM_DEGREE);

		continuousProcessingRateDegreeEClass = createEClass(CONTINUOUS_PROCESSING_RATE_DEGREE);

		processingRateDegreeEClass = createEClass(PROCESSING_RATE_DEGREE);

		processingResourceDegreeEClass = createEClass(PROCESSING_RESOURCE_DEGREE);
		createEReference(processingResourceDegreeEClass, PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE);

		discreteComponentParamDegreeEClass = createEClass(DISCRETE_COMPONENT_PARAM_DEGREE);

		discreteProcessingRateDegreeEClass = createEClass(DISCRETE_PROCESSING_RATE_DEGREE);

		featureConfigDegreeEClass = createEClass(FEATURE_CONFIG_DEGREE);

		featureGroupDegreeEClass = createEClass(FEATURE_GROUP_DEGREE);
		createEReference(featureGroupDegreeEClass, FEATURE_GROUP_DEGREE__FEATUREGROUP);
		createEReference(featureGroupDegreeEClass, FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS);

		featureSubsetEClass = createEClass(FEATURE_SUBSET);
		createEReference(featureSubsetEClass, FEATURE_SUBSET__FEATURE);

		numberOfCoresAsListDegreeEClass = createEClass(NUMBER_OF_CORES_AS_LIST_DEGREE);

		numberOfCoresDegreeEClass = createEClass(NUMBER_OF_CORES_DEGREE);

		numberOfCoresAsRangeDegreeEClass = createEClass(NUMBER_OF_CORES_AS_RANGE_DEGREE);

		optionalFeatureDegreeEClass = createEClass(OPTIONAL_FEATURE_DEGREE);
		createEReference(optionalFeatureDegreeEClass, OPTIONAL_FEATURE_DEGREE__SIMPLE);

		resourceContainerReplicationDegreeEClass = createEClass(RESOURCE_CONTAINER_REPLICATION_DEGREE);

		resourceContainerReplicationDegreeWithComponentChangeEClass = createEClass(
				RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE);
		createEReference(resourceContainerReplicationDegreeWithComponentChangeEClass,
				RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE);

		resourceSelectionDegreeEClass = createEClass(RESOURCE_SELECTION_DEGREE);

		schedulingPolicyDegreeEClass = createEClass(SCHEDULING_POLICY_DEGREE);

		stringComponentParamDegreeEClass = createEClass(STRING_COMPONENT_PARAM_DEGREE);

		allocationDegreeEClass = createEClass(ALLOCATION_DEGREE);

		assembledComponentDegreeEClass = createEClass(ASSEMBLED_COMPONENT_DEGREE);

		capacityDegreeEClass = createEClass(CAPACITY_DEGREE);

		monitoringDegreeEClass = createEClass(MONITORING_DEGREE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);
		AllocationPackage theAllocationPackage = (AllocationPackage) EPackage.Registry.INSTANCE
				.getEPackage(AllocationPackage.eNS_URI);
		GenericDoFPackage theGenericDoFPackage = (GenericDoFPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenericDoFPackage.eNS_URI);
		ResourcetypePackage theResourcetypePackage = (ResourcetypePackage) EPackage.Registry.INSTANCE
				.getEPackage(ResourcetypePackage.eNS_URI);
		featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE
				.getEPackage(featuremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unorderedPrimitiveDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAUnorderedDegree());
		continuousComponentParamDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAContinuousRangeDegree());
		continuousProcessingRateDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAContinuousRangeDegree());
		continuousProcessingRateDegreeEClass.getESuperTypes().add(this.getProcessingRateDegree());
		processingRateDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		processingResourceDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADegreeOfFreedom());
		discreteComponentParamDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADiscreteRangeDegree());
		discreteProcessingRateDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADiscreteRangeDegree());
		discreteProcessingRateDegreeEClass.getESuperTypes().add(this.getProcessingRateDegree());
		featureConfigDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADegreeOfFreedom());
		featureGroupDegreeEClass.getESuperTypes().add(this.getFeatureConfigDegree());
		numberOfCoresAsListDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAOrderedIntegerDegree());
		numberOfCoresAsListDegreeEClass.getESuperTypes().add(this.getNumberOfCoresDegree());
		numberOfCoresDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		numberOfCoresAsRangeDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADiscreteRangeDegree());
		numberOfCoresAsRangeDegreeEClass.getESuperTypes().add(this.getNumberOfCoresDegree());
		optionalFeatureDegreeEClass.getESuperTypes().add(this.getFeatureConfigDegree());
		resourceContainerReplicationDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADiscreteRangeDegree());
		resourceContainerReplicationDegreeWithComponentChangeEClass.getESuperTypes()
				.add(this.getResourceContainerReplicationDegree());
		resourceSelectionDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAClassWithCopyDegree());
		resourceSelectionDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		schedulingPolicyDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAClassAsReferenceDegree());
		schedulingPolicyDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
		stringComponentParamDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAStringSetDegree());
		allocationDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAClassAsReferenceDegree());
		assembledComponentDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAClassAsReferenceDegree());
		capacityDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getADiscreteRangeDegree());
		monitoringDegreeEClass.getESuperTypes().add(theGenericDoFPackage.getAContinuousRangeDegree());

		// Initialize classes and features; add operations and parameters
		initEClass(exchangeComponentRuleEClass, ExchangeComponentRule.class, "ExchangeComponentRule", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExchangeComponentRule_RepositoryComponent(), theRepositoryPackage.getRepositoryComponent(),
				null, "repositoryComponent", null, 1, -1, ExchangeComponentRule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExchangeComponentRule_AllocationContext(), theAllocationPackage.getAllocationContext(), null,
				"allocationContext", null, 0, 1, ExchangeComponentRule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unorderedPrimitiveDegreeEClass, UnorderedPrimitiveDegree.class, "UnorderedPrimitiveDegree",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousComponentParamDegreeEClass, ContinuousComponentParamDegree.class,
				"ContinuousComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuousProcessingRateDegreeEClass, ContinuousProcessingRateDegree.class,
				"ContinuousProcessingRateDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingRateDegreeEClass, ProcessingRateDegree.class, "ProcessingRateDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(processingResourceDegreeEClass, ProcessingResourceDegree.class, "ProcessingResourceDegree",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessingResourceDegree_Processingresourcetype(),
				theResourcetypePackage.getProcessingResourceType(), null, "processingresourcetype", null, 1, 1,
				ProcessingResourceDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(discreteComponentParamDegreeEClass, DiscreteComponentParamDegree.class,
				"DiscreteComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discreteProcessingRateDegreeEClass, DiscreteProcessingRateDegree.class,
				"DiscreteProcessingRateDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureConfigDegreeEClass, FeatureConfigDegree.class, "FeatureConfigDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(featureGroupDegreeEClass, FeatureGroupDegree.class, "FeatureGroupDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureGroupDegree_Featuregroup(), thefeaturemodelPackage.getFeatureGroup(), null,
				"featuregroup", null, 1, 1, FeatureGroupDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFeatureGroupDegree_DomainOfFeatureConfigCombinations(), this.getFeatureSubset(), null,
				"domainOfFeatureConfigCombinations", null, 1, -1, FeatureGroupDegree.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(featureSubsetEClass, FeatureSubset.class, "FeatureSubset", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSubset_Feature(), thefeaturemodelPackage.getFeature(), null, "feature", null, 0, -1,
				FeatureSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(numberOfCoresAsListDegreeEClass, NumberOfCoresAsListDegree.class, "NumberOfCoresAsListDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfCoresDegreeEClass, NumberOfCoresDegree.class, "NumberOfCoresDegree", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(numberOfCoresAsRangeDegreeEClass, NumberOfCoresAsRangeDegree.class, "NumberOfCoresAsRangeDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(optionalFeatureDegreeEClass, OptionalFeatureDegree.class, "OptionalFeatureDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionalFeatureDegree_Simple(), thefeaturemodelPackage.getSimple(), null, "simple", null, 1,
				1, OptionalFeatureDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceContainerReplicationDegreeEClass, ResourceContainerReplicationDegree.class,
				"ResourceContainerReplicationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceContainerReplicationDegreeWithComponentChangeEClass,
				ResourceContainerReplicationDegreeWithComponentChange.class,
				"ResourceContainerReplicationDegreeWithComponentChange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule(),
				this.getExchangeComponentRule(), null, "exchangeComponentRule", null, 0, -1,
				ResourceContainerReplicationDegreeWithComponentChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resourceSelectionDegreeEClass, ResourceSelectionDegree.class, "ResourceSelectionDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schedulingPolicyDegreeEClass, SchedulingPolicyDegree.class, "SchedulingPolicyDegree", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringComponentParamDegreeEClass, StringComponentParamDegree.class, "StringComponentParamDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocationDegreeEClass, AllocationDegree.class, "AllocationDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(assembledComponentDegreeEClass, AssembledComponentDegree.class, "AssembledComponentDegree",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capacityDegreeEClass, CapacityDegree.class, "CapacityDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(monitoringDegreeEClass, MonitoringDegree.class, "MonitoringDegree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //specificPackageImpl
