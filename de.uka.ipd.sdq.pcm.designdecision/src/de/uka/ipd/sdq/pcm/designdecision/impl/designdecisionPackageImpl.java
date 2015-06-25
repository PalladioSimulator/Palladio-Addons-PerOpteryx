/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.impl.gdofPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcm.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcm.designdecision.util.designdecisionValidator;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class designdecisionPackageImpl extends EPackageImpl implements designdecisionPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass discreteRangeChoiceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass degreeOfFreedomInstanceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass choiceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass classChoiceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass continousRangeChoiceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass decisionSpaceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass candidateEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass candidatesEClass = null;

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
     * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private designdecisionPackageImpl() {
        super(eNS_URI, designdecisionFactory.eINSTANCE);
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
     * This method is used to initialize {@link designdecisionPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static designdecisionPackage init() {
        if (isInited) {
            return (designdecisionPackage) EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI);
        }

        // Obtain or create and register package
        final designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new designdecisionPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        costPackage.eINSTANCE.eClass();
        featuremodelPackage.eINSTANCE.eClass();
        ResultdecoratorPackage.eINSTANCE.eClass();
        TypesPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
        final qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(qualitypropertiesPackage.eNS_URI)
                : qualitypropertiesPackage.eINSTANCE);
        final resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(resourcerepositoryPackage.eNS_URI)
                : resourcerepositoryPackage.eINSTANCE);
        final specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

        // Create package meta-data objects
        thedesigndecisionPackage.createPackageContents();
        thegdofPackage.createPackageContents();
        thequalitypropertiesPackage.createPackageContents();
        theresourcerepositoryPackage.createPackageContents();
        thespecificPackage.createPackageContents();

        // Initialize created meta-data
        thedesigndecisionPackage.initializePackageContents();
        thegdofPackage.initializePackageContents();
        thequalitypropertiesPackage.initializePackageContents();
        theresourcerepositoryPackage.initializePackageContents();
        thespecificPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
        (thedesigndecisionPackage,
                new EValidator.Descriptor()
        {
            @Override
            public EValidator getEValidator()
            {
                return designdecisionValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        thedesigndecisionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(designdecisionPackage.eNS_URI, thedesigndecisionPackage);
        return thedesigndecisionPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDiscreteRangeChoice() {
        return this.discreteRangeChoiceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDiscreteRangeChoice_ChosenValue() {
        return (EAttribute) this.discreteRangeChoiceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDegreeOfFreedomInstance() {
        return this.degreeOfFreedomInstanceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedomInstance_PrimaryChanged() {
        return (EReference) this.degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedomInstance_Dof() {
        return (EReference) this.degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDegreeOfFreedomInstance_ChangeableElements() {
        return (EReference) this.degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getChoice() {
        return this.choiceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getChoice_IsActive() {
        return (EAttribute) this.choiceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getChoice_Value() {
        return (EAttribute) this.choiceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getChoice_DegreeOfFreedomInstance() {
        return (EReference) this.choiceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getClassChoice() {
        return this.classChoiceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getClassChoice_ChosenValue() {
        return (EReference) this.classChoiceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getContinousRangeChoice() {
        return this.continousRangeChoiceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getContinousRangeChoice_ChosenValue() {
        return (EAttribute) this.continousRangeChoiceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDecisionSpace() {
        return this.decisionSpaceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDecisionSpace_DegreesOfFreedom() {
        return (EReference) this.decisionSpaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCandidate() {
        return this.candidateEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCandidate_Choices() {
        return (EReference) this.candidateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCandidate_QualityProperty() {
        return (EReference) this.candidateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCandidates() {
        return this.candidatesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCandidates_Candidate() {
        return (EReference) this.candidatesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCandidates_Problem() {
        return (EReference) this.candidatesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public designdecisionFactory getdesigndecisionFactory() {
        return (designdecisionFactory) this.getEFactoryInstance();
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
        this.discreteRangeChoiceEClass = this.createEClass(DISCRETE_RANGE_CHOICE);
        this.createEAttribute(this.discreteRangeChoiceEClass, DISCRETE_RANGE_CHOICE__CHOSEN_VALUE);

        this.choiceEClass = this.createEClass(CHOICE);
        this.createEAttribute(this.choiceEClass, CHOICE__IS_ACTIVE);
        this.createEAttribute(this.choiceEClass, CHOICE__VALUE);
        this.createEReference(this.choiceEClass, CHOICE__DEGREE_OF_FREEDOM_INSTANCE);

        this.degreeOfFreedomInstanceEClass = this.createEClass(DEGREE_OF_FREEDOM_INSTANCE);
        this.createEReference(this.degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED);
        this.createEReference(this.degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__DOF);
        this.createEReference(this.degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS);

        this.classChoiceEClass = this.createEClass(CLASS_CHOICE);
        this.createEReference(this.classChoiceEClass, CLASS_CHOICE__CHOSEN_VALUE);

        this.continousRangeChoiceEClass = this.createEClass(CONTINOUS_RANGE_CHOICE);
        this.createEAttribute(this.continousRangeChoiceEClass, CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE);

        this.decisionSpaceEClass = this.createEClass(DECISION_SPACE);
        this.createEReference(this.decisionSpaceEClass, DECISION_SPACE__DEGREES_OF_FREEDOM);

        this.candidateEClass = this.createEClass(CANDIDATE);
        this.createEReference(this.candidateEClass, CANDIDATE__CHOICES);
        this.createEReference(this.candidateEClass, CANDIDATE__QUALITY_PROPERTY);

        this.candidatesEClass = this.createEClass(CANDIDATES);
        this.createEReference(this.candidatesEClass, CANDIDATES__CANDIDATE);
        this.createEReference(this.candidatesEClass, CANDIDATES__PROBLEM);
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
        final gdofPackage thegdofPackage = (gdofPackage) EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI);
        final qualitypropertiesPackage thequalitypropertiesPackage = (qualitypropertiesPackage) EPackage.Registry.INSTANCE
                .getEPackage(qualitypropertiesPackage.eNS_URI);
        final resourcerepositoryPackage theresourcerepositoryPackage = (resourcerepositoryPackage) EPackage.Registry.INSTANCE
                .getEPackage(resourcerepositoryPackage.eNS_URI);
        final specificPackage thespecificPackage = (specificPackage) EPackage.Registry.INSTANCE
                .getEPackage(specificPackage.eNS_URI);
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);
        final EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE
                .getEPackage(EcorePackage.eNS_URI);
        final featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE
                .getEPackage(featuremodelPackage.eNS_URI);

        // Add subpackages
        this.getESubpackages().add(thegdofPackage);
        this.getESubpackages().add(thequalitypropertiesPackage);
        this.getESubpackages().add(theresourcerepositoryPackage);
        this.getESubpackages().add(thespecificPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.discreteRangeChoiceEClass.getESuperTypes().add(this.getChoice());
        this.degreeOfFreedomInstanceEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
        this.classChoiceEClass.getESuperTypes().add(this.getChoice());
        this.continousRangeChoiceEClass.getESuperTypes().add(this.getChoice());
        this.decisionSpaceEClass.getESuperTypes().add(thefeaturemodelPackage.getNamedElement());
        this.candidateEClass.getESuperTypes().add(theEntityPackage.getNamedElement());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.discreteRangeChoiceEClass, DiscreteRangeChoice.class, "DiscreteRangeChoice", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getDiscreteRangeChoice_ChosenValue(), this.ecorePackage.getEInt(), "chosenValue",
                null, 1, 1,
                DiscreteRangeChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getChoice_IsActive(), this.ecorePackage.getEBoolean(), "isActive", "true", 1, 1,
                Choice.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getChoice_Value(), this.ecorePackage.getEJavaObject(), "value", null, 1, 1,
                Choice.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getChoice_DegreeOfFreedomInstance(), this.getDegreeOfFreedomInstance(), null,
                "degreeOfFreedomInstance", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.degreeOfFreedomInstanceEClass, DegreeOfFreedomInstance.class, "DegreeOfFreedomInstance",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDegreeOfFreedomInstance_PrimaryChanged(), theEcorePackage.getEObject(), null,
                "primaryChanged", null, 1, 1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDegreeOfFreedomInstance_Dof(), thegdofPackage.getDegreeOfFreedom(), null, "dof",
                null, 1, 1,
                DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDegreeOfFreedomInstance_ChangeableElements(), theEcorePackage.getEObject(), null,
                "changeableElements", null, 1, -1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.classChoiceEClass, ClassChoice.class, "ClassChoice", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getClassChoice_ChosenValue(), theEcorePackage.getEObject(), null, "chosenValue", null,
                1, 1,
                ClassChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.continousRangeChoiceEClass, ContinousRangeChoice.class, "ContinousRangeChoice",
                !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getContinousRangeChoice_ChosenValue(), this.ecorePackage.getEDouble(), "chosenValue",
                null, 1, 1,
                ContinousRangeChoice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.decisionSpaceEClass, DecisionSpace.class, "DecisionSpace", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDecisionSpace_DegreesOfFreedom(), this.getDegreeOfFreedomInstance(), null,
                "degreesOfFreedom", null, 1, -1, DecisionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.candidateEClass, Candidate.class, "Candidate", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCandidate_Choices(), this.getChoice(), null, "choices", null, 0, -1,
                Candidate.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getCandidate_QualityProperty(), thequalitypropertiesPackage.getQualityProperty(),
                null,
                "qualityProperty", null, 0, -1, Candidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.candidatesEClass, Candidates.class, "Candidates", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCandidates_Candidate(), this.getCandidate(), null, "candidate", null, 0, -1,
                Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getCandidates_Problem(), this.getDecisionSpace(), null, "problem", null, 1, 1,
                Candidates.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        final EOperation op = this.addEOperation(this.candidatesEClass, this.ecorePackage.getEBoolean(),
                "numberOfChoicesMustEqualNumberOfDecisions", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        final EGenericType g1 = this.createEGenericType(this.ecorePackage.getEMap());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        // Create resource
        this.createResource(eNS_URI);
    }

} // designdecisionPackageImpl
