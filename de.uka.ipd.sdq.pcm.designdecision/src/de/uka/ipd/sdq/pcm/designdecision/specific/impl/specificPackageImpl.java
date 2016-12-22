/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.ATNumberOfReplicaDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassAsReferenceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassWithCopyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.EnumDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset;
import de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedDataTypeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.OrderedIntegerDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.RangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.StringSetDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class specificPackageImpl extends EPackageImpl implements specificPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass exchangeComponentRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass classAsReferenceDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass classDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass classWithCopyDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass continuousRangeDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass rangeDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dataTypeDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass discreteDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass discreteRangeDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass enumDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass unorderedDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass orderedDataTypeDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass orderedIntegerDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stringSetDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass unorderedPrimitiveDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass continuousComponentParamDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass continuousProcessingRateDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass processingRateDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass processingResourceDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass discreteComponentParamDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass discreteProcessingRateDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass featureConfigDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass featureGroupDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass featureSubsetEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numberOfCoresAsListDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numberOfCoresDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numberOfCoresAsRangeDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass optionalFeatureDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceContainerReplicationDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceContainerReplicationDegreeWithComponentChangeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceSelectionDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass schedulingPolicyDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stringComponentParamDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass allocationDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass assembledComponentDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass capacityDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass monitoringDegreeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass atNumberOfReplicaDegreeEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private specificPackageImpl() {
        super(eNS_URI, specificFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link specificPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static specificPackage init() {
        if (isInited) {
            return (specificPackage) EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI);
        }

        // Obtain or create and register package
        final specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof specificPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new specificPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        costPackage.eINSTANCE.eClass();
        featuremodelPackage.eINSTANCE.eClass();
        ResultdecoratorPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI)
                        : designdecisionPackage.eINSTANCE);
        final gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
        final qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI)
                        : qualitypropertiesPackage.eINSTANCE);
        final resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
                        : resourcerepositoryPackage.eINSTANCE);

        // Create package meta-data objects
        thespecificPackage.createPackageContents();
        thedesigndecisionPackage.createPackageContents();
        thegdofPackage.createPackageContents();
        thequalitypropertiesPackage.createPackageContents();
        theresourcerepositoryPackage.createPackageContents();

        // Initialize created meta-data
        thespecificPackage.initializePackageContents();
        thedesigndecisionPackage.initializePackageContents();
        thegdofPackage.initializePackageContents();
        thequalitypropertiesPackage.initializePackageContents();
        theresourcerepositoryPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thespecificPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(specificPackage.eNS_URI, thespecificPackage);
        return thespecificPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getExchangeComponentRule() {
        return this.exchangeComponentRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExchangeComponentRule_RepositoryComponent() {
        return (EReference) this.exchangeComponentRuleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getExchangeComponentRule_AllocationContext() {
        return (EReference) this.exchangeComponentRuleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getClassAsReferenceDegree() {
        return this.classAsReferenceDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getClassDegree() {
        return this.classDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getClassDegree_ClassDesignOptions() {
        return (EReference) this.classDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getClassWithCopyDegree() {
        return this.classWithCopyDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getContinuousRangeDegree() {
        return this.continuousRangeDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getContinuousRangeDegree_To() {
        return (EAttribute) this.continuousRangeDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getContinuousRangeDegree_From() {
        return (EAttribute) this.continuousRangeDegreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRangeDegree() {
        return this.rangeDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRangeDegree_UpperBoundIncluded() {
        return (EAttribute) this.rangeDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRangeDegree_LowerBoundIncluded() {
        return (EAttribute) this.rangeDegreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRangeDegree_NumberOfSteps() {
        return (EAttribute) this.rangeDegreeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDataTypeDegree() {
        return this.dataTypeDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDiscreteDegree() {
        return this.discreteDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDiscreteRangeDegree() {
        return this.discreteRangeDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDiscreteRangeDegree_To() {
        return (EAttribute) this.discreteRangeDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDiscreteRangeDegree_From() {
        return (EAttribute) this.discreteRangeDegreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEnumDegree() {
        return this.enumDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEnumDegree_Enumeration() {
        return (EReference) this.enumDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getUnorderedDegree() {
        return this.unorderedDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOrderedDataTypeDegree() {
        return this.orderedDataTypeDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOrderedIntegerDegree() {
        return this.orderedIntegerDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOrderedIntegerDegree_ListOfIntegers() {
        return (EAttribute) this.orderedIntegerDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStringSetDegree() {
        return this.stringSetDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getStringSetDegree_StringValues() {
        return (EAttribute) this.stringSetDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getUnorderedPrimitiveDegree() {
        return this.unorderedPrimitiveDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getContinuousComponentParamDegree() {
        return this.continuousComponentParamDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getContinuousProcessingRateDegree() {
        return this.continuousProcessingRateDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getProcessingRateDegree() {
        return this.processingRateDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getProcessingResourceDegree() {
        return this.processingResourceDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getProcessingResourceDegree_Processingresourcetype() {
        return (EReference) this.processingResourceDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDiscreteComponentParamDegree() {
        return this.discreteComponentParamDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDiscreteProcessingRateDegree() {
        return this.discreteProcessingRateDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFeatureConfigDegree() {
        return this.featureConfigDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFeatureGroupDegree() {
        return this.featureGroupDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFeatureGroupDegree_Featuregroup() {
        return (EReference) this.featureGroupDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFeatureGroupDegree_DomainOfFeatureConfigCombinations() {
        return (EReference) this.featureGroupDegreeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFeatureSubset() {
        return this.featureSubsetEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFeatureSubset_Feature() {
        return (EReference) this.featureSubsetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumberOfCoresAsListDegree() {
        return this.numberOfCoresAsListDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumberOfCoresDegree() {
        return this.numberOfCoresDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumberOfCoresAsRangeDegree() {
        return this.numberOfCoresAsRangeDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOptionalFeatureDegree() {
        return this.optionalFeatureDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOptionalFeatureDegree_Simple() {
        return (EReference) this.optionalFeatureDegreeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceContainerReplicationDegree() {
        return this.resourceContainerReplicationDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceContainerReplicationDegreeWithComponentChange() {
        return this.resourceContainerReplicationDegreeWithComponentChangeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule() {
        return (EReference) this.resourceContainerReplicationDegreeWithComponentChangeEClass.getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceSelectionDegree() {
        return this.resourceSelectionDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSchedulingPolicyDegree() {
        return this.schedulingPolicyDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStringComponentParamDegree() {
        return this.stringComponentParamDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAllocationDegree() {
        return this.allocationDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAssembledComponentDegree() {
        return this.assembledComponentDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCapacityDegree() {
        return this.capacityDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMonitoringDegree() {
        return this.monitoringDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getATNumberOfReplicaDegree() {
        return this.atNumberOfReplicaDegreeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public specificFactory getspecificFactory() {
        return (specificFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.exchangeComponentRuleEClass = this.createEClass(EXCHANGE_COMPONENT_RULE);
        this.createEReference(this.exchangeComponentRuleEClass, EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT);
        this.createEReference(this.exchangeComponentRuleEClass, EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT);

        this.classAsReferenceDegreeEClass = this.createEClass(CLASS_AS_REFERENCE_DEGREE);

        this.classDegreeEClass = this.createEClass(CLASS_DEGREE);
        this.createEReference(this.classDegreeEClass, CLASS_DEGREE__CLASS_DESIGN_OPTIONS);

        this.classWithCopyDegreeEClass = this.createEClass(CLASS_WITH_COPY_DEGREE);

        this.continuousRangeDegreeEClass = this.createEClass(CONTINUOUS_RANGE_DEGREE);
        this.createEAttribute(this.continuousRangeDegreeEClass, CONTINUOUS_RANGE_DEGREE__TO);
        this.createEAttribute(this.continuousRangeDegreeEClass, CONTINUOUS_RANGE_DEGREE__FROM);

        this.rangeDegreeEClass = this.createEClass(RANGE_DEGREE);
        this.createEAttribute(this.rangeDegreeEClass, RANGE_DEGREE__UPPER_BOUND_INCLUDED);
        this.createEAttribute(this.rangeDegreeEClass, RANGE_DEGREE__LOWER_BOUND_INCLUDED);
        this.createEAttribute(this.rangeDegreeEClass, RANGE_DEGREE__NUMBER_OF_STEPS);

        this.dataTypeDegreeEClass = this.createEClass(DATA_TYPE_DEGREE);

        this.discreteDegreeEClass = this.createEClass(DISCRETE_DEGREE);

        this.discreteRangeDegreeEClass = this.createEClass(DISCRETE_RANGE_DEGREE);
        this.createEAttribute(this.discreteRangeDegreeEClass, DISCRETE_RANGE_DEGREE__TO);
        this.createEAttribute(this.discreteRangeDegreeEClass, DISCRETE_RANGE_DEGREE__FROM);

        this.enumDegreeEClass = this.createEClass(ENUM_DEGREE);
        this.createEReference(this.enumDegreeEClass, ENUM_DEGREE__ENUMERATION);

        this.unorderedDegreeEClass = this.createEClass(UNORDERED_DEGREE);

        this.orderedDataTypeDegreeEClass = this.createEClass(ORDERED_DATA_TYPE_DEGREE);

        this.orderedIntegerDegreeEClass = this.createEClass(ORDERED_INTEGER_DEGREE);
        this.createEAttribute(this.orderedIntegerDegreeEClass, ORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS);

        this.stringSetDegreeEClass = this.createEClass(STRING_SET_DEGREE);
        this.createEAttribute(this.stringSetDegreeEClass, STRING_SET_DEGREE__STRING_VALUES);

        this.unorderedPrimitiveDegreeEClass = this.createEClass(UNORDERED_PRIMITIVE_DEGREE);

        this.continuousComponentParamDegreeEClass = this.createEClass(CONTINUOUS_COMPONENT_PARAM_DEGREE);

        this.continuousProcessingRateDegreeEClass = this.createEClass(CONTINUOUS_PROCESSING_RATE_DEGREE);

        this.processingRateDegreeEClass = this.createEClass(PROCESSING_RATE_DEGREE);

        this.processingResourceDegreeEClass = this.createEClass(PROCESSING_RESOURCE_DEGREE);
        this.createEReference(this.processingResourceDegreeEClass, PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE);

        this.discreteComponentParamDegreeEClass = this.createEClass(DISCRETE_COMPONENT_PARAM_DEGREE);

        this.discreteProcessingRateDegreeEClass = this.createEClass(DISCRETE_PROCESSING_RATE_DEGREE);

        this.featureConfigDegreeEClass = this.createEClass(FEATURE_CONFIG_DEGREE);

        this.featureGroupDegreeEClass = this.createEClass(FEATURE_GROUP_DEGREE);
        this.createEReference(this.featureGroupDegreeEClass, FEATURE_GROUP_DEGREE__FEATUREGROUP);
        this.createEReference(this.featureGroupDegreeEClass,
                FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS);

        this.featureSubsetEClass = this.createEClass(FEATURE_SUBSET);
        this.createEReference(this.featureSubsetEClass, FEATURE_SUBSET__FEATURE);

        this.numberOfCoresAsListDegreeEClass = this.createEClass(NUMBER_OF_CORES_AS_LIST_DEGREE);

        this.numberOfCoresDegreeEClass = this.createEClass(NUMBER_OF_CORES_DEGREE);

        this.numberOfCoresAsRangeDegreeEClass = this.createEClass(NUMBER_OF_CORES_AS_RANGE_DEGREE);

        this.optionalFeatureDegreeEClass = this.createEClass(OPTIONAL_FEATURE_DEGREE);
        this.createEReference(this.optionalFeatureDegreeEClass, OPTIONAL_FEATURE_DEGREE__SIMPLE);

        this.resourceContainerReplicationDegreeEClass = this.createEClass(RESOURCE_CONTAINER_REPLICATION_DEGREE);

        this.resourceContainerReplicationDegreeWithComponentChangeEClass = this
                .createEClass(RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE);
        this.createEReference(this.resourceContainerReplicationDegreeWithComponentChangeEClass,
                RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE);

        this.resourceSelectionDegreeEClass = this.createEClass(RESOURCE_SELECTION_DEGREE);

        this.schedulingPolicyDegreeEClass = this.createEClass(SCHEDULING_POLICY_DEGREE);

        this.stringComponentParamDegreeEClass = this.createEClass(STRING_COMPONENT_PARAM_DEGREE);

        this.allocationDegreeEClass = this.createEClass(ALLOCATION_DEGREE);

        this.assembledComponentDegreeEClass = this.createEClass(ASSEMBLED_COMPONENT_DEGREE);

        this.capacityDegreeEClass = this.createEClass(CAPACITY_DEGREE);

        this.monitoringDegreeEClass = this.createEClass(MONITORING_DEGREE);

        this.atNumberOfReplicaDegreeEClass = this.createEClass(AT_NUMBER_OF_REPLICA_DEGREE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
                .getEPackage(RepositoryPackage.eNS_URI);
        final AllocationPackage theAllocationPackage = (AllocationPackage) EPackage.Registry.INSTANCE
                .getEPackage(AllocationPackage.eNS_URI);
        final designdecisionPackage thedesigndecisionPackage = (designdecisionPackage) EPackage.Registry.INSTANCE
                .getEPackage(designdecisionPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
                .getEPackage(EcorePackage.eNS_URI);
        final TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE
                .getEPackage(TypesPackage.eNS_URI);
        final ResourcetypePackage theResourcetypePackage = (ResourcetypePackage) EPackage.Registry.INSTANCE
                .getEPackage(ResourcetypePackage.eNS_URI);
        final featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE
                .getEPackage(featuremodelPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.classAsReferenceDegreeEClass.getESuperTypes().add(this.getClassDegree());
        this.classDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
        this.classWithCopyDegreeEClass.getESuperTypes().add(this.getClassDegree());
        this.continuousRangeDegreeEClass.getESuperTypes().add(this.getRangeDegree());
        this.rangeDegreeEClass.getESuperTypes().add(this.getOrderedDataTypeDegree());
        this.dataTypeDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
        this.discreteDegreeEClass.getESuperTypes().add(this.getDataTypeDegree());
        this.discreteRangeDegreeEClass.getESuperTypes().add(this.getRangeDegree());
        this.discreteRangeDegreeEClass.getESuperTypes().add(this.getDiscreteDegree());
        this.enumDegreeEClass.getESuperTypes().add(this.getUnorderedDegree());
        this.unorderedDegreeEClass.getESuperTypes().add(this.getDataTypeDegree());
        this.orderedDataTypeDegreeEClass.getESuperTypes().add(this.getDataTypeDegree());
        this.orderedIntegerDegreeEClass.getESuperTypes().add(this.getDiscreteDegree());
        this.orderedIntegerDegreeEClass.getESuperTypes().add(this.getOrderedDataTypeDegree());
        this.stringSetDegreeEClass.getESuperTypes().add(this.getUnorderedDegree());
        this.unorderedPrimitiveDegreeEClass.getESuperTypes().add(this.getUnorderedDegree());
        this.continuousComponentParamDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
        this.continuousProcessingRateDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
        this.continuousProcessingRateDegreeEClass.getESuperTypes().add(this.getProcessingRateDegree());
        this.processingRateDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
        this.processingResourceDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
        this.discreteComponentParamDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
        this.discreteProcessingRateDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
        this.discreteProcessingRateDegreeEClass.getESuperTypes().add(this.getProcessingRateDegree());
        this.featureConfigDegreeEClass.getESuperTypes().add(thedesigndecisionPackage.getDegreeOfFreedomInstance());
        this.featureGroupDegreeEClass.getESuperTypes().add(this.getFeatureConfigDegree());
        this.numberOfCoresAsListDegreeEClass.getESuperTypes().add(this.getNumberOfCoresDegree());
        this.numberOfCoresAsListDegreeEClass.getESuperTypes().add(this.getOrderedIntegerDegree());
        this.numberOfCoresDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
        this.numberOfCoresAsRangeDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
        this.numberOfCoresAsRangeDegreeEClass.getESuperTypes().add(this.getNumberOfCoresDegree());
        this.optionalFeatureDegreeEClass.getESuperTypes().add(this.getFeatureConfigDegree());
        this.resourceContainerReplicationDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
        this.resourceContainerReplicationDegreeWithComponentChangeEClass.getESuperTypes()
                .add(this.getResourceContainerReplicationDegree());
        this.resourceSelectionDegreeEClass.getESuperTypes().add(this.getClassWithCopyDegree());
        this.resourceSelectionDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
        this.schedulingPolicyDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
        this.schedulingPolicyDegreeEClass.getESuperTypes().add(this.getProcessingResourceDegree());
        this.stringComponentParamDegreeEClass.getESuperTypes().add(this.getStringSetDegree());
        this.allocationDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
        this.assembledComponentDegreeEClass.getESuperTypes().add(this.getClassAsReferenceDegree());
        this.capacityDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());
        this.monitoringDegreeEClass.getESuperTypes().add(this.getContinuousRangeDegree());
        this.atNumberOfReplicaDegreeEClass.getESuperTypes().add(this.getDiscreteRangeDegree());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.exchangeComponentRuleEClass, ExchangeComponentRule.class, "ExchangeComponentRule",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getExchangeComponentRule_RepositoryComponent(),
                theRepositoryPackage.getRepositoryComponent(), null, "repositoryComponent", null, 1, -1,
                ExchangeComponentRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getExchangeComponentRule_AllocationContext(),
                theAllocationPackage.getAllocationContext(), null, "allocationContext", null, 0, 1,
                ExchangeComponentRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.classAsReferenceDegreeEClass, ClassAsReferenceDegree.class, "ClassAsReferenceDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.classDegreeEClass, ClassDegree.class, "ClassDegree", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getClassDegree_ClassDesignOptions(), theEcorePackage.getEObject(), null,
                "classDesignOptions", null, 1, -1, ClassDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.classWithCopyDegreeEClass, ClassWithCopyDegree.class, "ClassWithCopyDegree", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.continuousRangeDegreeEClass, ContinuousRangeDegree.class, "ContinuousRangeDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getContinuousRangeDegree_To(), this.ecorePackage.getEDouble(), "to", null, 1, 1,
                ContinuousRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getContinuousRangeDegree_From(), this.ecorePackage.getEDouble(), "from", null, 1, 1,
                ContinuousRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.rangeDegreeEClass, RangeDegree.class, "RangeDegree", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRangeDegree_UpperBoundIncluded(), this.ecorePackage.getEBoolean(),
                "upperBoundIncluded", "true", 1, 1, RangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getRangeDegree_LowerBoundIncluded(), this.ecorePackage.getEBoolean(),
                "lowerBoundIncluded", "true", 1, 1, RangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getRangeDegree_NumberOfSteps(), this.ecorePackage.getEInt(), "numberOfSteps", null, 0,
                1, RangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.dataTypeDegreeEClass, DataTypeDegree.class, "DataTypeDegree", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.discreteDegreeEClass, DiscreteDegree.class, "DiscreteDegree", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.discreteRangeDegreeEClass, DiscreteRangeDegree.class, "DiscreteRangeDegree", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDiscreteRangeDegree_To(), this.ecorePackage.getEInt(), "to", null, 1, 1,
                DiscreteRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDiscreteRangeDegree_From(), this.ecorePackage.getEInt(), "from", null, 1, 1,
                DiscreteRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.enumDegreeEClass, EnumDegree.class, "EnumDegree", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEnumDegree_Enumeration(), theEcorePackage.getEEnum(), null, "enumeration", null, 0,
                1, EnumDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unorderedDegreeEClass, UnorderedDegree.class, "UnorderedDegree", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.orderedDataTypeDegreeEClass, OrderedDataTypeDegree.class, "OrderedDataTypeDegree",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.orderedIntegerDegreeEClass, OrderedIntegerDegree.class, "OrderedIntegerDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getOrderedIntegerDegree_ListOfIntegers(), this.ecorePackage.getEInt(),
                "listOfIntegers", null, 1, -1, OrderedIntegerDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.stringSetDegreeEClass, StringSetDegree.class, "StringSetDegree", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getStringSetDegree_StringValues(), theTypesPackage.getString(), "stringValues", null,
                1, -1, StringSetDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unorderedPrimitiveDegreeEClass, UnorderedPrimitiveDegree.class, "UnorderedPrimitiveDegree",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.continuousComponentParamDegreeEClass, ContinuousComponentParamDegree.class,
                "ContinuousComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.continuousProcessingRateDegreeEClass, ContinuousProcessingRateDegree.class,
                "ContinuousProcessingRateDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.processingRateDegreeEClass, ProcessingRateDegree.class, "ProcessingRateDegree",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.processingResourceDegreeEClass, ProcessingResourceDegree.class, "ProcessingResourceDegree",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProcessingResourceDegree_Processingresourcetype(),
                theResourcetypePackage.getProcessingResourceType(), null, "processingresourcetype", null, 1, 1,
                ProcessingResourceDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.discreteComponentParamDegreeEClass, DiscreteComponentParamDegree.class,
                "DiscreteComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.discreteProcessingRateDegreeEClass, DiscreteProcessingRateDegree.class,
                "DiscreteProcessingRateDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.featureConfigDegreeEClass, FeatureConfigDegree.class, "FeatureConfigDegree", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.featureGroupDegreeEClass, FeatureGroupDegree.class, "FeatureGroupDegree", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFeatureGroupDegree_Featuregroup(), thefeaturemodelPackage.getFeatureGroup(), null,
                "featuregroup", null, 1, 1, FeatureGroupDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getFeatureGroupDegree_DomainOfFeatureConfigCombinations(), this.getFeatureSubset(),
                null, "domainOfFeatureConfigCombinations", null, 1, -1, FeatureGroupDegree.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        this.initEClass(this.featureSubsetEClass, FeatureSubset.class, "FeatureSubset", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFeatureSubset_Feature(), thefeaturemodelPackage.getFeature(), null, "feature", null,
                0, -1, FeatureSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.numberOfCoresAsListDegreeEClass, NumberOfCoresAsListDegree.class,
                "NumberOfCoresAsListDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.numberOfCoresDegreeEClass, NumberOfCoresDegree.class, "NumberOfCoresDegree", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.numberOfCoresAsRangeDegreeEClass, NumberOfCoresAsRangeDegree.class,
                "NumberOfCoresAsRangeDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.optionalFeatureDegreeEClass, OptionalFeatureDegree.class, "OptionalFeatureDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOptionalFeatureDegree_Simple(), thefeaturemodelPackage.getSimple(), null, "simple",
                null, 1, 1, OptionalFeatureDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.resourceContainerReplicationDegreeEClass, ResourceContainerReplicationDegree.class,
                "ResourceContainerReplicationDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.resourceContainerReplicationDegreeWithComponentChangeEClass,
                ResourceContainerReplicationDegreeWithComponentChange.class,
                "ResourceContainerReplicationDegreeWithComponentChange", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule(),
                this.getExchangeComponentRule(), null, "exchangeComponentRule", null, 0, -1,
                ResourceContainerReplicationDegreeWithComponentChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.resourceSelectionDegreeEClass, ResourceSelectionDegree.class, "ResourceSelectionDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.schedulingPolicyDegreeEClass, SchedulingPolicyDegree.class, "SchedulingPolicyDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.stringComponentParamDegreeEClass, StringComponentParamDegree.class,
                "StringComponentParamDegree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.allocationDegreeEClass, AllocationDegree.class, "AllocationDegree", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.assembledComponentDegreeEClass, AssembledComponentDegree.class, "AssembledComponentDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.capacityDegreeEClass, CapacityDegree.class, "CapacityDegree", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.monitoringDegreeEClass, MonitoringDegree.class, "MonitoringDegree", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.atNumberOfReplicaDegreeEClass, ATNumberOfReplicaDegree.class, "ATNumberOfReplicaDegree",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    }

} // specificPackageImpl
