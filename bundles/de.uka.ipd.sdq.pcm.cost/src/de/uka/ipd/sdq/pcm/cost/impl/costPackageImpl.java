/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import de.uka.ipd.sdq.pcm.cost.ComponentCost;
import de.uka.ipd.sdq.pcm.cost.ComponentCostPerInstance;
import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.FixedLinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.LinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.ProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.ScalarFunction;
import de.uka.ipd.sdq.pcm.cost.VariableCost;
import de.uka.ipd.sdq.pcm.cost.VariableLinkingResourceCost;
import de.uka.ipd.sdq.pcm.cost.VariableProcessingResourceCost;
import de.uka.ipd.sdq.pcm.cost.costFactory;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class costPackageImpl extends EPackageImpl implements costPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass componentCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass costEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fixedLinkingResourceCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass linkingResourceCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass fixedProcessingResourceCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass processingResourceCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass variableCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass variableLinkingResourceCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass variableProcessingResourceCostEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass scalarFunctionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass costRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass componentCostPerInstanceEClass = null;

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
     * @see de.uka.ipd.sdq.pcm.cost.costPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private costPackageImpl() {
        super(eNS_URI, costFactory.eINSTANCE);
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
     * This method is used to initialize {@link costPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static costPackage init() {
        if (isInited) {
            return (costPackage) EPackage.Registry.INSTANCE.getEPackage(costPackage.eNS_URI);
        }

        // Obtain or create and register package
        final costPackageImpl thecostPackage = (costPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof costPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI)
                : new costPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();

        // Create package meta-data objects
        thecostPackage.createPackageContents();

        // Initialize created meta-data
        thecostPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thecostPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(costPackage.eNS_URI, thecostPackage);
        return thecostPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComponentCost() {
        return this.componentCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getComponentCost_ComponentOperatingCost() {
        return (EAttribute) this.componentCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getComponentCost_ComponentInitialCost() {
        return (EAttribute) this.componentCostEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComponentCost_RepositoryComponent() {
        return (EReference) this.componentCostEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCost() {
        return this.costEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCost_AnnotatedElement() {
        return (EReference) this.costEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getCost_TotalCost() {
        return (EAttribute) this.costEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getCost_OperatingCost() {
        return (EAttribute) this.costEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getCost_InitialCost() {
        return (EAttribute) this.costEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFixedLinkingResourceCost() {
        return this.fixedLinkingResourceCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getLinkingResourceCost() {
        return this.linkingResourceCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getLinkingResourceCost_Linkingresource() {
        return (EReference) this.linkingResourceCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFixedProcessingResourceCost() {
        return this.fixedProcessingResourceCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFixedProcessingResourceCost_FixedOperatingCost() {
        return (EAttribute) this.fixedProcessingResourceCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getFixedProcessingResourceCost_FixedInitialCost() {
        return (EAttribute) this.fixedProcessingResourceCostEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getProcessingResourceCost() {
        return this.processingResourceCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getProcessingResourceCost_Processingresourcespecification() {
        return (EReference) this.processingResourceCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getVariableCost() {
        return this.variableCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getVariableCost_FixedInitialCost() {
        return (EAttribute) this.variableCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getVariableCost_FixedOperatingCost() {
        return (EAttribute) this.variableCostEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getVariableLinkingResourceCost() {
        return this.variableLinkingResourceCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getVariableLinkingResourceCost_BandwithInitialFactor() {
        return (EAttribute) this.variableLinkingResourceCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getVariableLinkingResourceCost_BandwidthOperatingFactor() {
        return (EAttribute) this.variableLinkingResourceCostEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getVariableProcessingResourceCost() {
        return this.variableProcessingResourceCostEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getVariableProcessingResourceCost_ProcessingRateInitialFunction() {
        return (EReference) this.variableProcessingResourceCostEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getVariableProcessingResourceCost_ProcessingRateOperatingFunction() {
        return (EReference) this.variableProcessingResourceCostEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getScalarFunction() {
        return this.scalarFunctionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getScalarFunction_Specification() {
        return (EAttribute) this.scalarFunctionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getScalarFunction_Term() {
        return (EReference) this.scalarFunctionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCostRepository() {
        return this.costRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCostRepository_Cost() {
        return (EReference) this.costRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getCostRepository_TimePeriodYears() {
        return (EAttribute) this.costRepositoryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getCostRepository_Interest() {
        return (EAttribute) this.costRepositoryEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getComponentCostPerInstance() {
        return this.componentCostPerInstanceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getComponentCostPerInstance_Allocation() {
        return (EReference) this.componentCostPerInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public costFactory getcostFactory() {
        return (costFactory) this.getEFactoryInstance();
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
        this.componentCostEClass = this.createEClass(COMPONENT_COST);
        this.createEAttribute(this.componentCostEClass, COMPONENT_COST__COMPONENT_OPERATING_COST);
        this.createEAttribute(this.componentCostEClass, COMPONENT_COST__COMPONENT_INITIAL_COST);
        this.createEReference(this.componentCostEClass, COMPONENT_COST__REPOSITORY_COMPONENT);

        this.costEClass = this.createEClass(COST);
        this.createEReference(this.costEClass, COST__ANNOTATED_ELEMENT);
        this.createEAttribute(this.costEClass, COST__TOTAL_COST);
        this.createEAttribute(this.costEClass, COST__OPERATING_COST);
        this.createEAttribute(this.costEClass, COST__INITIAL_COST);

        this.fixedLinkingResourceCostEClass = this.createEClass(FIXED_LINKING_RESOURCE_COST);

        this.linkingResourceCostEClass = this.createEClass(LINKING_RESOURCE_COST);
        this.createEReference(this.linkingResourceCostEClass, LINKING_RESOURCE_COST__LINKINGRESOURCE);

        this.fixedProcessingResourceCostEClass = this.createEClass(FIXED_PROCESSING_RESOURCE_COST);
        this.createEAttribute(this.fixedProcessingResourceCostEClass,
                FIXED_PROCESSING_RESOURCE_COST__FIXED_OPERATING_COST);
        this.createEAttribute(this.fixedProcessingResourceCostEClass,
                FIXED_PROCESSING_RESOURCE_COST__FIXED_INITIAL_COST);

        this.processingResourceCostEClass = this.createEClass(PROCESSING_RESOURCE_COST);
        this.createEReference(this.processingResourceCostEClass,
                PROCESSING_RESOURCE_COST__PROCESSINGRESOURCESPECIFICATION);

        this.variableCostEClass = this.createEClass(VARIABLE_COST);
        this.createEAttribute(this.variableCostEClass, VARIABLE_COST__FIXED_INITIAL_COST);
        this.createEAttribute(this.variableCostEClass, VARIABLE_COST__FIXED_OPERATING_COST);

        this.variableLinkingResourceCostEClass = this.createEClass(VARIABLE_LINKING_RESOURCE_COST);
        this.createEAttribute(this.variableLinkingResourceCostEClass,
                VARIABLE_LINKING_RESOURCE_COST__BANDWITH_INITIAL_FACTOR);
        this.createEAttribute(this.variableLinkingResourceCostEClass,
                VARIABLE_LINKING_RESOURCE_COST__BANDWIDTH_OPERATING_FACTOR);

        this.variableProcessingResourceCostEClass = this.createEClass(VARIABLE_PROCESSING_RESOURCE_COST);
        this.createEReference(this.variableProcessingResourceCostEClass,
                VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_INITIAL_FUNCTION);
        this.createEReference(this.variableProcessingResourceCostEClass,
                VARIABLE_PROCESSING_RESOURCE_COST__PROCESSING_RATE_OPERATING_FUNCTION);

        this.scalarFunctionEClass = this.createEClass(SCALAR_FUNCTION);
        this.createEAttribute(this.scalarFunctionEClass, SCALAR_FUNCTION__SPECIFICATION);
        this.createEReference(this.scalarFunctionEClass, SCALAR_FUNCTION__TERM);

        this.costRepositoryEClass = this.createEClass(COST_REPOSITORY);
        this.createEReference(this.costRepositoryEClass, COST_REPOSITORY__COST);
        this.createEAttribute(this.costRepositoryEClass, COST_REPOSITORY__TIME_PERIOD_YEARS);
        this.createEAttribute(this.costRepositoryEClass, COST_REPOSITORY__INTEREST);

        this.componentCostPerInstanceEClass = this.createEClass(COMPONENT_COST_PER_INSTANCE);
        this.createEReference(this.componentCostPerInstanceEClass, COMPONENT_COST_PER_INSTANCE__ALLOCATION);
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
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
                .getEPackage(EcorePackage.eNS_URI);
        final ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
                .getEPackage(ResourceenvironmentPackage.eNS_URI);
        final StoexPackage theStoexPackage = (StoexPackage) EPackage.Registry.INSTANCE
                .getEPackage(StoexPackage.eNS_URI);
        final AllocationPackage theAllocationPackage = (AllocationPackage) EPackage.Registry.INSTANCE
                .getEPackage(AllocationPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.componentCostEClass.getESuperTypes().add(this.getCost());
        this.fixedLinkingResourceCostEClass.getESuperTypes().add(this.getLinkingResourceCost());
        this.fixedLinkingResourceCostEClass.getESuperTypes().add(this.getCost());
        this.linkingResourceCostEClass.getESuperTypes().add(this.getCost());
        this.fixedProcessingResourceCostEClass.getESuperTypes().add(this.getProcessingResourceCost());
        this.fixedProcessingResourceCostEClass.getESuperTypes().add(this.getCost());
        this.processingResourceCostEClass.getESuperTypes().add(this.getCost());
        this.variableCostEClass.getESuperTypes().add(this.getCost());
        this.variableLinkingResourceCostEClass.getESuperTypes().add(this.getVariableCost());
        this.variableLinkingResourceCostEClass.getESuperTypes().add(this.getLinkingResourceCost());
        this.variableProcessingResourceCostEClass.getESuperTypes().add(this.getVariableCost());
        this.variableProcessingResourceCostEClass.getESuperTypes().add(this.getProcessingResourceCost());
        this.componentCostPerInstanceEClass.getESuperTypes().add(this.getComponentCost());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.componentCostEClass, ComponentCost.class, "ComponentCost", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getComponentCost_ComponentOperatingCost(), this.ecorePackage.getEDouble(),
                "componentOperatingCost",
                null, 1, 1, ComponentCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getComponentCost_ComponentInitialCost(), this.ecorePackage.getEDouble(),
                "componentInitialCost",
                null, 1, 1, ComponentCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getComponentCost_RepositoryComponent(), theRepositoryPackage.getRepositoryComponent(),
                null,
                "repositoryComponent", null, 1, 1, ComponentCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.costEClass, Cost.class, "Cost", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCost_AnnotatedElement(), theEcorePackage.getEObject(), null, "annotatedElement",
                null, 1, 1,
                Cost.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getCost_TotalCost(), this.ecorePackage.getEDouble(), "totalCost", null, 1, 1,
                Cost.class,
                IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getCost_OperatingCost(), this.ecorePackage.getEDouble(), "operatingCost", null, 1, 1,
                Cost.class,
                IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getCost_InitialCost(), this.ecorePackage.getEDouble(), "initialCost", null, 1, 1,
                Cost.class,
                IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.fixedLinkingResourceCostEClass, FixedLinkingResourceCost.class,
                "FixedLinkingResourceCost",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.linkingResourceCostEClass, LinkingResourceCost.class, "LinkingResourceCost", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getLinkingResourceCost_Linkingresource(),
                theResourceenvironmentPackage.getLinkingResource(),
                null, "linkingresource", null, 1, 1, LinkingResourceCost.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.fixedProcessingResourceCostEClass, FixedProcessingResourceCost.class,
                "FixedProcessingResourceCost",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getFixedProcessingResourceCost_FixedOperatingCost(), theEcorePackage.getEDouble(),
                "fixedOperatingCost", null, 1, 1, FixedProcessingResourceCost.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getFixedProcessingResourceCost_FixedInitialCost(), theEcorePackage.getEDouble(),
                "fixedInitialCost", null, 1, 1, FixedProcessingResourceCost.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.processingResourceCostEClass, ProcessingResourceCost.class, "ProcessingResourceCost",
                IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getProcessingResourceCost_Processingresourcespecification(),
                theResourceenvironmentPackage.getProcessingResourceSpecification(), null,
                "processingresourcespecification", null, 1, 1, ProcessingResourceCost.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        this.initEClass(this.variableCostEClass, VariableCost.class, "VariableCost", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getVariableCost_FixedInitialCost(), this.ecorePackage.getEDouble(),
                "fixedInitialCost", null, 1, 1,
                VariableCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getVariableCost_FixedOperatingCost(), this.ecorePackage.getEDouble(),
                "fixedOperatingCost", null, 1,
                1, VariableCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.variableLinkingResourceCostEClass, VariableLinkingResourceCost.class,
                "VariableLinkingResourceCost",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getVariableLinkingResourceCost_BandwithInitialFactor(),
                this.ecorePackage.getEDouble(),
                "bandwithInitialFactor", null, 1, 1, VariableLinkingResourceCost.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getVariableLinkingResourceCost_BandwidthOperatingFactor(),
                this.ecorePackage.getEDouble(),
                "bandwidthOperatingFactor", null, 1, 1, VariableLinkingResourceCost.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.variableProcessingResourceCostEClass, VariableProcessingResourceCost.class,
                "VariableProcessingResourceCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getVariableProcessingResourceCost_ProcessingRateInitialFunction(),
                this.getScalarFunction(),
                null, "processingRateInitialFunction", null, 1, 1, VariableProcessingResourceCost.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        this.initEReference(this.getVariableProcessingResourceCost_ProcessingRateOperatingFunction(),
                this.getScalarFunction(),
                null, "processingRateOperatingFunction", null, 1, 1, VariableProcessingResourceCost.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.scalarFunctionEClass, ScalarFunction.class, "ScalarFunction", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getScalarFunction_Specification(), this.ecorePackage.getEString(), "specification",
                null, 1, 1,
                ScalarFunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getScalarFunction_Term(), theStoexPackage.getTerm(), null, "term", null, 1, 1,
                ScalarFunction.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.costRepositoryEClass, CostRepository.class, "CostRepository", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCostRepository_Cost(), this.getCost(), null, "cost", null, 0, -1,
                CostRepository.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getCostRepository_TimePeriodYears(), this.ecorePackage.getEInt(), "timePeriodYears",
                "0", 1, 1,
                CostRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getCostRepository_Interest(), this.ecorePackage.getEDouble(), "interest", null, 1, 1,
                CostRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.componentCostPerInstanceEClass, ComponentCostPerInstance.class,
                "ComponentCostPerInstance",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getComponentCostPerInstance_Allocation(), theAllocationPackage.getAllocation(), null,
                "allocation", null, 0, 1, ComponentCostPerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        this.createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        final String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        this.addAnnotation(this.getScalarFunction_Term(),
                source,
                new String[]
                        {
            "namespace", ""
                        });
    }

} // costPackageImpl
