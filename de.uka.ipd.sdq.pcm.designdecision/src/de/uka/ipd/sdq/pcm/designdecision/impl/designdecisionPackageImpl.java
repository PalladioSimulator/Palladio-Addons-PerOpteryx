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
import de.uka.ipd.sdq.pcm.designdecision.BoolChoice;
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
 * @generated
 */
public class designdecisionPackageImpl extends EPackageImpl implements designdecisionPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discreteRangeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degreeOfFreedomInstanceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass choiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classChoiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continousRangeChoiceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass candidatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolChoiceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link designdecisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static designdecisionPackage init() {
		if (isInited)
			return (designdecisionPackage) EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI);

		// Obtain or create and register package
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof designdecisionPackageImpl
				? EPackage.Registry.INSTANCE.get(eNS_URI) : new designdecisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();
		ResultdecoratorPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		gdofPackageImpl thegdofPackage = (gdofPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) instanceof gdofPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI) : gdofPackage.eINSTANCE);
		qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI)
						: qualitypropertiesPackage.eINSTANCE);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
						: resourcerepositoryPackage.eINSTANCE);
		specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl
				? EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

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
		EValidator.Registry.INSTANCE.put(thedesigndecisionPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
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
	 * @generated
	 */
	@Override
	public EClass getDiscreteRangeChoice() {
		return discreteRangeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscreteRangeChoice_ChosenValue() {
		return (EAttribute) discreteRangeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegreeOfFreedomInstance() {
		return degreeOfFreedomInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeOfFreedomInstance_PrimaryChanged() {
		return (EReference) degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeOfFreedomInstance_Dof() {
		return (EReference) degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeOfFreedomInstance_ChangeableElements() {
		return (EReference) degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDegreeOfFreedomInstance_DecoratorModel() {
		return (EReference) degreeOfFreedomInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChoice() {
		return choiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_IsActive() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getChoice_Value() {
		return (EAttribute) choiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChoice_DegreeOfFreedomInstance() {
		return (EReference) choiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClassChoice() {
		return classChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClassChoice_ChosenValue() {
		return (EReference) classChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinousRangeChoice() {
		return continousRangeChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContinousRangeChoice_ChosenValue() {
		return (EAttribute) continousRangeChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionSpace() {
		return decisionSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDecisionSpace_DegreesOfFreedom() {
		return (EReference) decisionSpaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCandidate() {
		return candidateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidate_Choices() {
		return (EReference) candidateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidate_QualityProperty() {
		return (EReference) candidateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCandidates() {
		return candidatesEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidates_Candidate() {
		return (EReference) candidatesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCandidates_Problem() {
		return (EReference) candidatesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolChoice() {
		return boolChoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolChoice_ChosenValue() {
		return (EAttribute) boolChoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public designdecisionFactory getdesigndecisionFactory() {
		return (designdecisionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		discreteRangeChoiceEClass = createEClass(DISCRETE_RANGE_CHOICE);
		createEAttribute(discreteRangeChoiceEClass, DISCRETE_RANGE_CHOICE__CHOSEN_VALUE);

		choiceEClass = createEClass(CHOICE);
		createEAttribute(choiceEClass, CHOICE__IS_ACTIVE);
		createEAttribute(choiceEClass, CHOICE__VALUE);
		createEReference(choiceEClass, CHOICE__DEGREE_OF_FREEDOM_INSTANCE);

		degreeOfFreedomInstanceEClass = createEClass(DEGREE_OF_FREEDOM_INSTANCE);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__DOF);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS);
		createEReference(degreeOfFreedomInstanceEClass, DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL);

		classChoiceEClass = createEClass(CLASS_CHOICE);
		createEReference(classChoiceEClass, CLASS_CHOICE__CHOSEN_VALUE);

		continousRangeChoiceEClass = createEClass(CONTINOUS_RANGE_CHOICE);
		createEAttribute(continousRangeChoiceEClass, CONTINOUS_RANGE_CHOICE__CHOSEN_VALUE);

		decisionSpaceEClass = createEClass(DECISION_SPACE);
		createEReference(decisionSpaceEClass, DECISION_SPACE__DEGREES_OF_FREEDOM);

		candidateEClass = createEClass(CANDIDATE);
		createEReference(candidateEClass, CANDIDATE__CHOICES);
		createEReference(candidateEClass, CANDIDATE__QUALITY_PROPERTY);

		candidatesEClass = createEClass(CANDIDATES);
		createEReference(candidatesEClass, CANDIDATES__CANDIDATE);
		createEReference(candidatesEClass, CANDIDATES__PROBLEM);

		boolChoiceEClass = createEClass(BOOL_CHOICE);
		createEAttribute(boolChoiceEClass, BOOL_CHOICE__CHOSEN_VALUE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
		gdofPackage thegdofPackage = (gdofPackage) EPackage.Registry.INSTANCE.getEPackage(gdofPackage.eNS_URI);
		qualitypropertiesPackage thequalitypropertiesPackage = (qualitypropertiesPackage) EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI);
		resourcerepositoryPackage theresourcerepositoryPackage = (resourcerepositoryPackage) EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI);
		specificPackage thespecificPackage = (specificPackage) EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		featuremodelPackage thefeaturemodelPackage = (featuremodelPackage) EPackage.Registry.INSTANCE.getEPackage(featuremodelPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thegdofPackage);
		getESubpackages().add(thequalitypropertiesPackage);
		getESubpackages().add(theresourcerepositoryPackage);
		getESubpackages().add(thespecificPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		discreteRangeChoiceEClass.getESuperTypes().add(this.getChoice());
		degreeOfFreedomInstanceEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		classChoiceEClass.getESuperTypes().add(this.getChoice());
		continousRangeChoiceEClass.getESuperTypes().add(this.getChoice());
		decisionSpaceEClass.getESuperTypes().add(thefeaturemodelPackage.getNamedElement());
		candidateEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		boolChoiceEClass.getESuperTypes().add(this.getChoice());

		// Initialize classes and features; add operations and parameters
		initEClass(discreteRangeChoiceEClass, DiscreteRangeChoice.class, "DiscreteRangeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscreteRangeChoice_ChosenValue(), ecorePackage.getEInt(), "chosenValue", null, 1, 1, DiscreteRangeChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(choiceEClass, Choice.class, "Choice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChoice_IsActive(), ecorePackage.getEBoolean(), "isActive", "true", 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, !IS_ORDERED);
		initEAttribute(getChoice_Value(), ecorePackage.getEJavaObject(), "value", null, 1, 1, Choice.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED,
				!IS_ORDERED);
		initEReference(getChoice_DegreeOfFreedomInstance(), this.getDegreeOfFreedomInstance(), null, "degreeOfFreedomInstance", null, 1, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(degreeOfFreedomInstanceEClass, DegreeOfFreedomInstance.class, "DegreeOfFreedomInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDegreeOfFreedomInstance_PrimaryChanged(), theEcorePackage.getEObject(), null, "primaryChanged", null, 1, 1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDegreeOfFreedomInstance_Dof(), thegdofPackage.getDegreeOfFreedom(), null, "dof", null, 1, 1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDegreeOfFreedomInstance_ChangeableElements(), theEcorePackage.getEObject(), null, "changeableElements", null, 1, -1, DegreeOfFreedomInstance.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDegreeOfFreedomInstance_DecoratorModel(), theEcorePackage.getEObject(), null, "decoratorModel", null, 0, -1, DegreeOfFreedomInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(degreeOfFreedomInstanceEClass, theEcorePackage.getEBoolean(), "decoratorModelTypeMustMatchRequiredDecorator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classChoiceEClass, ClassChoice.class, "ClassChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassChoice_ChosenValue(), theEcorePackage.getEObject(), null, "chosenValue", null, 1, 1, ClassChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(continousRangeChoiceEClass, ContinousRangeChoice.class, "ContinousRangeChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinousRangeChoice_ChosenValue(), ecorePackage.getEDouble(), "chosenValue", null, 1, 1, ContinousRangeChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(decisionSpaceEClass, DecisionSpace.class, "DecisionSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionSpace_DegreesOfFreedom(), this.getDegreeOfFreedomInstance(), null, "degreesOfFreedom", null, 1, -1, DecisionSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(candidateEClass, Candidate.class, "Candidate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidate_Choices(), this.getChoice(), null, "choices", null, 0, -1, Candidate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCandidate_QualityProperty(), thequalitypropertiesPackage.getQualityProperty(), null, "qualityProperty", null, 0, -1, Candidate.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(candidatesEClass, Candidates.class, "Candidates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCandidates_Candidate(), this.getCandidate(), null, "candidate", null, 0, -1, Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCandidates_Problem(), this.getDecisionSpace(), null, "problem", null, 1, 1, Candidates.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(candidatesEClass, ecorePackage.getEBoolean(), "numberOfChoicesMustEqualNumberOfDecisions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(boolChoiceEClass, BoolChoice.class, "BoolChoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolChoice_ChosenValue(), theTypesPackage.getBoolean(), "chosenValue", "false", 1, 1, BoolChoice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // designdecisionPackageImpl
