/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryFactory;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.util.resourcerepositoryValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class resourcerepositoryPackageImpl extends EPackageImpl implements resourcerepositoryPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceDescriptionRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass resourceDescriptionEClass = null;

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
     * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private resourcerepositoryPackageImpl() {
        super(eNS_URI, resourcerepositoryFactory.eINSTANCE);
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
     * This method is used to initialize {@link resourcerepositoryPackage#eINSTANCE} when that field
     * is accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static resourcerepositoryPackage init() {
        if (isInited) {
            return (resourcerepositoryPackage) EPackage.Registry.INSTANCE
                    .getEPackage(resourcerepositoryPackage.eNS_URI);
        }

        // Obtain or create and register package
        final resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof resourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new resourcerepositoryPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        costPackage.eINSTANCE.eClass();
        featuremodelPackage.eINSTANCE.eClass();
        ResultdecoratorPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(designdecisionPackage.eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(designdecisionPackage.eNS_URI)
                : designdecisionPackage.eINSTANCE);
        final gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
        final qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(qualitypropertiesPackage.eNS_URI)
                : qualitypropertiesPackage.eINSTANCE);
        final specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

        // Create package meta-data objects
        theresourcerepositoryPackage.createPackageContents();
        thedesigndecisionPackage.createPackageContents();
        thegdofPackage.createPackageContents();
        thequalitypropertiesPackage.createPackageContents();
        thespecificPackage.createPackageContents();

        // Initialize created meta-data
        theresourcerepositoryPackage.initializePackageContents();
        thedesigndecisionPackage.initializePackageContents();
        thegdofPackage.initializePackageContents();
        thequalitypropertiesPackage.initializePackageContents();
        thespecificPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
        (theresourcerepositoryPackage,
                new EValidator.Descriptor()
        {
            @Override
            public EValidator getEValidator()
            {
                return resourcerepositoryValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theresourcerepositoryPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(resourcerepositoryPackage.eNS_URI, theresourcerepositoryPackage);
        return theresourcerepositoryPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceDescriptionRepository() {
        return this.resourceDescriptionRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceDescriptionRepository_AvailableProcessingResources_ResourceRepository() {
        return (EReference) this.resourceDescriptionRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getResourceDescription() {
        return this.resourceDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceDescription_FixedProcessingResourceCost_ResourceDescription() {
        return (EReference) this.resourceDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getResourceDescription_ProcessingResourceSpecification_ResourceDescription() {
        return (EReference) this.resourceDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getResourceDescription_ResourcesCanBeUsedIndividually() {
        return (EAttribute) this.resourceDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public resourcerepositoryFactory getresourcerepositoryFactory() {
        return (resourcerepositoryFactory) this.getEFactoryInstance();
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
        this.resourceDescriptionRepositoryEClass = this.createEClass(RESOURCE_DESCRIPTION_REPOSITORY);
        this.createEReference(this.resourceDescriptionRepositoryEClass,
                RESOURCE_DESCRIPTION_REPOSITORY__AVAILABLE_PROCESSING_RESOURCES_RESOURCE_REPOSITORY);

        this.resourceDescriptionEClass = this.createEClass(RESOURCE_DESCRIPTION);
        this.createEReference(this.resourceDescriptionEClass,
                RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION);
        this.createEReference(this.resourceDescriptionEClass,
                RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION);
        this.createEAttribute(this.resourceDescriptionEClass, RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY);
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
        final costPackage thecostPackage = (costPackage) EPackage.Registry.INSTANCE.getEPackage(costPackage.eNS_URI);
        final ResourceenvironmentPackage theResourceenvironmentPackage = (ResourceenvironmentPackage) EPackage.Registry.INSTANCE
                .getEPackage(ResourceenvironmentPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.resourceDescriptionRepositoryEClass, ResourceDescriptionRepository.class,
                "ResourceDescriptionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceDescriptionRepository_AvailableProcessingResources_ResourceRepository(),
                this.getResourceDescription(), null, "availableProcessingResources_ResourceRepository", null, 0, -1,
                ResourceDescriptionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.resourceDescriptionEClass, ResourceDescription.class, "ResourceDescription", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getResourceDescription_FixedProcessingResourceCost_ResourceDescription(),
                thecostPackage.getFixedProcessingResourceCost(), null,
                "fixedProcessingResourceCost_ResourceDescription", null, 1, 1, ResourceDescription.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getResourceDescription_ProcessingResourceSpecification_ResourceDescription(),
                theResourceenvironmentPackage.getResourceContainer(), null,
                "processingResourceSpecification_ResourceDescription", null, 1, 1, ResourceDescription.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getResourceDescription_ResourcesCanBeUsedIndividually(), this.ecorePackage.getEInt(),
                "ResourcesCanBeUsedIndividually", null, 1, 1, ResourceDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        final EOperation op = this.addEOperation(this.resourceDescriptionEClass, this.ecorePackage.getEBoolean(),
                "CostAndResourceMustMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        final EGenericType g1 = this.createEGenericType(this.ecorePackage.getEMap());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);
    }

} // resourcerepositoryPackageImpl
