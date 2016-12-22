/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class gdofPackageImpl extends EPackageImpl implements gdofPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass changeableElementDescriptionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass valueRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass oclRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass helperOCLDefinitionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass staticContextRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass selectionRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass doFRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass instanceSelectionRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass staticSelectionRuleEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass degreeOfFreedomEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass decoratorModelDescriptionEClass = null;

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
     * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private gdofPackageImpl() {
        super(eNS_URI, gdofFactory.eINSTANCE);
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
     * This method is used to initialize {@link gdofPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to
     * obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static gdofPackage init() {
        if (isInited) {
            return (gdofPackage) EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI);
        }

        // Obtain or create and register package
        final gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof gdofPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new gdofPackageImpl());

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
        final qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI)
                        : qualitypropertiesPackage.eINSTANCE);
        final resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
                        : resourcerepositoryPackage.eINSTANCE);
        final specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl
                        ? EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

        // Create package meta-data objects
        thegdofPackage.createPackageContents();
        thedesigndecisionPackage.createPackageContents();
        thequalitypropertiesPackage.createPackageContents();
        theresourcerepositoryPackage.createPackageContents();
        thespecificPackage.createPackageContents();

        // Initialize created meta-data
        thegdofPackage.initializePackageContents();
        thedesigndecisionPackage.initializePackageContents();
        thequalitypropertiesPackage.initializePackageContents();
        theresourcerepositoryPackage.initializePackageContents();
        thespecificPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thegdofPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(gdofPackage.eNS_URI, thegdofPackage);
        return thegdofPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getChangeableElementDescription() {
        return this.changeableElementDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getChangeableElementDescription_Changeable() {
        return (EReference) this.changeableElementDescriptionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getChangeableElementDescription_ValueRule() {
        return (EReference) this.changeableElementDescriptionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getChangeableElementDescription_SelectionRule() {
        return (EReference) this.changeableElementDescriptionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getValueRule() {
        return this.valueRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOCLRule() {
        return this.oclRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getOCLRule_MainOclQuery() {
        return (EAttribute) this.oclRuleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOCLRule_HelperDefinition() {
        return (EReference) this.oclRuleEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getHelperOCLDefinition() {
        return this.helperOCLDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStaticContextRule() {
        return this.staticContextRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getStaticContextRule_ContextClass() {
        return (EReference) this.staticContextRuleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSelectionRule() {
        return this.selectionRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDoFRepository() {
        return this.doFRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDoFRepository_Dofs() {
        return (EReference) this.doFRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getInstanceSelectionRule() {
        return this.instanceSelectionRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getInstanceSelectionRule_ContextInstance() {
        return (EReference) this.instanceSelectionRuleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStaticSelectionRule() {
        return this.staticSelectionRuleEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDegreeOfFreedom() {
        return this.degreeOfFreedomEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedom_AddedElements() {
        return (EReference) this.degreeOfFreedomEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedom_ChangeableElementDescriptions() {
        return (EReference) this.degreeOfFreedomEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedom_InteractionConstraints() {
        return (EReference) this.degreeOfFreedomEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedom_PrimaryChangeable() {
        return (EReference) this.degreeOfFreedomEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedom_RequiredDecoratorModel() {
        return (EReference) this.degreeOfFreedomEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDecoratorModelDescription() {
        return this.decoratorModelDescriptionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public gdofFactory getgdofFactory() {
        return (gdofFactory) this.getEFactoryInstance();
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
        this.changeableElementDescriptionEClass = this.createEClass(CHANGEABLE_ELEMENT_DESCRIPTION);
        this.createEReference(this.changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE);
        this.createEReference(this.changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE);
        this.createEReference(this.changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE);

        this.valueRuleEClass = this.createEClass(VALUE_RULE);

        this.oclRuleEClass = this.createEClass(OCL_RULE);
        this.createEAttribute(this.oclRuleEClass, OCL_RULE__MAIN_OCL_QUERY);
        this.createEReference(this.oclRuleEClass, OCL_RULE__HELPER_DEFINITION);

        this.helperOCLDefinitionEClass = this.createEClass(HELPER_OCL_DEFINITION);

        this.staticContextRuleEClass = this.createEClass(STATIC_CONTEXT_RULE);
        this.createEReference(this.staticContextRuleEClass, STATIC_CONTEXT_RULE__CONTEXT_CLASS);

        this.selectionRuleEClass = this.createEClass(SELECTION_RULE);

        this.doFRepositoryEClass = this.createEClass(DO_FREPOSITORY);
        this.createEReference(this.doFRepositoryEClass, DO_FREPOSITORY__DOFS);

        this.instanceSelectionRuleEClass = this.createEClass(INSTANCE_SELECTION_RULE);
        this.createEReference(this.instanceSelectionRuleEClass, INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE);

        this.staticSelectionRuleEClass = this.createEClass(STATIC_SELECTION_RULE);

        this.degreeOfFreedomEClass = this.createEClass(DEGREE_OF_FREEDOM);
        this.createEReference(this.degreeOfFreedomEClass, DEGREE_OF_FREEDOM__ADDED_ELEMENTS);
        this.createEReference(this.degreeOfFreedomEClass, DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS);
        this.createEReference(this.degreeOfFreedomEClass, DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS);
        this.createEReference(this.degreeOfFreedomEClass, DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE);
        this.createEReference(this.degreeOfFreedomEClass, DEGREE_OF_FREEDOM__REQUIRED_DECORATOR_MODEL);

        this.decoratorModelDescriptionEClass = this.createEClass(DECORATOR_MODEL_DESCRIPTION);
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
        final featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE
                .getEPackage(featuremodelPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
                .getEPackage(EcorePackage.eNS_URI);
        final TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE
                .getEPackage(TypesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.changeableElementDescriptionEClass.getESuperTypes().add(thefeaturemodelPackage.getNamedElement());
        this.valueRuleEClass.getESuperTypes().add(this.getOCLRule());
        this.helperOCLDefinitionEClass.getESuperTypes().add(this.getOCLRule());
        this.helperOCLDefinitionEClass.getESuperTypes().add(this.getStaticContextRule());
        this.selectionRuleEClass.getESuperTypes().add(this.getOCLRule());
        this.instanceSelectionRuleEClass.getESuperTypes().add(this.getSelectionRule());
        this.staticSelectionRuleEClass.getESuperTypes().add(this.getSelectionRule());
        this.staticSelectionRuleEClass.getESuperTypes().add(this.getStaticContextRule());
        this.degreeOfFreedomEClass.getESuperTypes().add(thefeaturemodelPackage.getNamedElement());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.changeableElementDescriptionEClass, ChangeableElementDescription.class,
                "ChangeableElementDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getChangeableElementDescription_Changeable(), theEcorePackage.getEStructuralFeature(),
                null, "changeable", null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getChangeableElementDescription_ValueRule(), this.getValueRule(), null, "valueRule",
                null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getChangeableElementDescription_SelectionRule(), this.getSelectionRule(), null,
                "selectionRule", null, 0, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.valueRuleEClass, ValueRule.class, "ValueRule", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.oclRuleEClass, OCLRule.class, "OCLRule", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getOCLRule_MainOclQuery(), theTypesPackage.getString(), "mainOclQuery", null, 1, 1,
                OCLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getOCLRule_HelperDefinition(), this.getHelperOCLDefinition(), null, "helperDefinition",
                null, 0, -1, OCLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.helperOCLDefinitionEClass, HelperOCLDefinition.class, "HelperOCLDefinition", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.staticContextRuleEClass, StaticContextRule.class, "StaticContextRule", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getStaticContextRule_ContextClass(), theEcorePackage.getEClass(), null, "contextClass",
                null, 0, 1, StaticContextRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.selectionRuleEClass, SelectionRule.class, "SelectionRule", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.doFRepositoryEClass, DoFRepository.class, "DoFRepository", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDoFRepository_Dofs(), this.getDegreeOfFreedom(), null, "dofs", null, 0, -1,
                DoFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.instanceSelectionRuleEClass, InstanceSelectionRule.class, "InstanceSelectionRule",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getInstanceSelectionRule_ContextInstance(), this.getChangeableElementDescription(),
                null, "contextInstance", null, 0, 1, InstanceSelectionRule.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.staticSelectionRuleEClass, StaticSelectionRule.class, "StaticSelectionRule", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.degreeOfFreedomEClass, DegreeOfFreedom.class, "DegreeOfFreedom", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDegreeOfFreedom_AddedElements(), theEcorePackage.getEClass(), null, "addedElements",
                null, 0, -1, DegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDegreeOfFreedom_ChangeableElementDescriptions(),
                this.getChangeableElementDescription(), null, "changeableElementDescriptions", null, 1, -1,
                DegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        this.initEReference(this.getDegreeOfFreedom_InteractionConstraints(), theEcorePackage.getEOperation(), null,
                "interactionConstraints", null, 0, -1, DegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDegreeOfFreedom_PrimaryChangeable(), this.getChangeableElementDescription(), null,
                "primaryChangeable", null, 1, 1, DegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDegreeOfFreedom_RequiredDecoratorModel(), this.getDecoratorModelDescription(), null,
                "requiredDecoratorModel", null, 0, -1, DegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        this.initEClass(this.decoratorModelDescriptionEClass, DecoratorModelDescription.class,
                "DecoratorModelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create annotations
        // null
        this.createNullAnnotations();
    }

    /**
     * Initializes the annotations for <b>null</b>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected void createNullAnnotations() {
        final String source = null;
        this.addAnnotation(this.degreeOfFreedomEClass, source,
                new String[] { "documentation", "TODO Daniel requiredDecoratorModel erl\u00e4utern" });
    }

} // gdofPackageImpl
