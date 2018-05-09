/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.ArchitectureConstraints;
import FeatureCompletionModel.Complementum;
import FeatureCompletionModel.ComplementumVisnetis;
import FeatureCompletionModel.CompletionComponent;
import FeatureCompletionModel.ConstrainableElement;
import FeatureCompletionModel.Constraint;
import FeatureCompletionModel.DescribedElement;
import FeatureCompletionModel.FeatureCompletion;
import FeatureCompletionModel.FeatureCompletionFactory;
import FeatureCompletionModel.FeatureCompletionPackage;
import FeatureCompletionModel.FeatureCompletionRepository;
import FeatureCompletionModel.NamedElement;
import FeatureCompletionModel.PerimeterProviding;
import FeatureCompletionModel.PerimeterRequiring;
import FeatureCompletionModel.Replication;
import FeatureCompletionModel.Visnetum;

import FeatureCompletionModel.util.FeatureCompletionValidator;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import featureObjective.FeatureObjectivePackage;

import featureObjective.impl.FeatureObjectivePackageImpl;

import featureSolution.FeatureSolutionPackage;

import featureSolution.impl.FeatureSolutionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureCompletionPackageImpl extends EPackageImpl implements FeatureCompletionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCompletionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureCompletionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completionComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perimeterProvidingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementumVisnetisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complementumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perimeterRequiringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visnetumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum replicationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintEEnum = null;

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
	 * @see FeatureCompletionModel.FeatureCompletionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeatureCompletionPackageImpl() {
		super(eNS_URI, FeatureCompletionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeatureCompletionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeatureCompletionPackage init() {
		if (isInited) return (FeatureCompletionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI);

		// Obtain or create and register package
		FeatureCompletionPackageImpl theFeatureCompletionPackage = (FeatureCompletionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeatureCompletionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeatureCompletionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FeatureObjectivePackageImpl theFeatureObjectivePackage = (FeatureObjectivePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI) instanceof FeatureObjectivePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI) : FeatureObjectivePackage.eINSTANCE);
		FeatureSolutionPackageImpl theFeatureSolutionPackage = (FeatureSolutionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureSolutionPackage.eNS_URI) instanceof FeatureSolutionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureSolutionPackage.eNS_URI) : FeatureSolutionPackage.eINSTANCE);

		// Create package meta-data objects
		theFeatureCompletionPackage.createPackageContents();
		theFeatureObjectivePackage.createPackageContents();
		theFeatureSolutionPackage.createPackageContents();

		// Initialize created meta-data
		theFeatureCompletionPackage.initializePackageContents();
		theFeatureObjectivePackage.initializePackageContents();
		theFeatureSolutionPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFeatureCompletionPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FeatureCompletionValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFeatureCompletionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeatureCompletionPackage.eNS_URI, theFeatureCompletionPackage);
		return theFeatureCompletionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCompletionRepository() {
		return featureCompletionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCompletionRepository_FeatureCompletions() {
		return (EReference)featureCompletionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureCompletion() {
		return featureCompletionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCompletion_FeatureObjectives() {
		return (EReference)featureCompletionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCompletion_CompletionComponents() {
		return (EReference)featureCompletionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCompletion_Complementa() {
		return (EReference)featureCompletionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureCompletion_ArchitectureConstraints() {
		return (EReference)featureCompletionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompletionComponent() {
		return completionComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletionComponent_RequiredComponents() {
		return (EReference)completionComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletionComponent_PerimeterProviding() {
		return (EReference)completionComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletionComponent_ComponentConstraints() {
		return (EReference)completionComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompletionComponent_PerimeterRequiring() {
		return (EReference)completionComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribedElement_Description() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerimeterProviding() {
		return perimeterProvidingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerimeterProviding_FeatureProviding() {
		return (EReference)perimeterProvidingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementumVisnetis() {
		return complementumVisnetisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementumVisnetis_ComplementaryFeature() {
		return (EReference)complementumVisnetisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplementumVisnetis_RequiresComplementum() {
		return (EReference)complementumVisnetisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplementum() {
		return complementumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementum_Replication() {
		return (EAttribute)complementumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplementum_Visnetum() {
		return (EAttribute)complementumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureConstraints() {
		return architectureConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureConstraints_Constraint() {
		return (EAttribute)architectureConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureConstraints_ArchitectureElements() {
		return (EReference)architectureConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainableElement() {
		return constrainableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerimeterRequiring() {
		return perimeterRequiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerimeterRequiring_Complementum() {
		return (EReference)perimeterRequiringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisnetum() {
		return visnetumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReplication() {
		return replicationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraint() {
		return constraintEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletionFactory getFeatureCompletionFactory() {
		return (FeatureCompletionFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		featureCompletionRepositoryEClass = createEClass(FEATURE_COMPLETION_REPOSITORY);
		createEReference(featureCompletionRepositoryEClass, FEATURE_COMPLETION_REPOSITORY__FEATURE_COMPLETIONS);

		featureCompletionEClass = createEClass(FEATURE_COMPLETION);
		createEReference(featureCompletionEClass, FEATURE_COMPLETION__FEATURE_OBJECTIVES);
		createEReference(featureCompletionEClass, FEATURE_COMPLETION__COMPLETION_COMPONENTS);
		createEReference(featureCompletionEClass, FEATURE_COMPLETION__COMPLEMENTA);
		createEReference(featureCompletionEClass, FEATURE_COMPLETION__ARCHITECTURE_CONSTRAINTS);

		completionComponentEClass = createEClass(COMPLETION_COMPONENT);
		createEReference(completionComponentEClass, COMPLETION_COMPONENT__REQUIRED_COMPONENTS);
		createEReference(completionComponentEClass, COMPLETION_COMPONENT__PERIMETER_PROVIDING);
		createEReference(completionComponentEClass, COMPLETION_COMPONENT__COMPONENT_CONSTRAINTS);
		createEReference(completionComponentEClass, COMPLETION_COMPONENT__PERIMETER_REQUIRING);

		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__DESCRIPTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		perimeterProvidingEClass = createEClass(PERIMETER_PROVIDING);
		createEReference(perimeterProvidingEClass, PERIMETER_PROVIDING__FEATURE_PROVIDING);

		complementumVisnetisEClass = createEClass(COMPLEMENTUM_VISNETIS);
		createEReference(complementumVisnetisEClass, COMPLEMENTUM_VISNETIS__COMPLEMENTARY_FEATURE);
		createEReference(complementumVisnetisEClass, COMPLEMENTUM_VISNETIS__REQUIRES_COMPLEMENTUM);

		complementumEClass = createEClass(COMPLEMENTUM);
		createEAttribute(complementumEClass, COMPLEMENTUM__REPLICATION);
		createEAttribute(complementumEClass, COMPLEMENTUM__VISNETUM);

		architectureConstraintsEClass = createEClass(ARCHITECTURE_CONSTRAINTS);
		createEAttribute(architectureConstraintsEClass, ARCHITECTURE_CONSTRAINTS__CONSTRAINT);
		createEReference(architectureConstraintsEClass, ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS);

		constrainableElementEClass = createEClass(CONSTRAINABLE_ELEMENT);

		perimeterRequiringEClass = createEClass(PERIMETER_REQUIRING);
		createEReference(perimeterRequiringEClass, PERIMETER_REQUIRING__COMPLEMENTUM);

		// Create enums
		visnetumEEnum = createEEnum(VISNETUM);
		replicationEEnum = createEEnum(REPLICATION);
		constraintEEnum = createEEnum(CONSTRAINT);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		FeatureObjectivePackage theFeatureObjectivePackage = (FeatureObjectivePackage)EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI);
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		featureCompletionEClass.getESuperTypes().add(this.getDescribedElement());
		completionComponentEClass.getESuperTypes().add(this.getConstrainableElement());
		describedElementEClass.getESuperTypes().add(this.getNamedElement());
		namedElementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		perimeterProvidingEClass.getESuperTypes().add(this.getNamedElement());
		complementumVisnetisEClass.getESuperTypes().add(this.getComplementum());
		complementumVisnetisEClass.getESuperTypes().add(this.getConstrainableElement());
		complementumEClass.getESuperTypes().add(this.getDescribedElement());
		architectureConstraintsEClass.getESuperTypes().add(this.getDescribedElement());
		constrainableElementEClass.getESuperTypes().add(this.getDescribedElement());
		perimeterRequiringEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(featureCompletionRepositoryEClass, FeatureCompletionRepository.class, "FeatureCompletionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureCompletionRepository_FeatureCompletions(), this.getFeatureCompletion(), null, "featureCompletions", null, 0, -1, FeatureCompletionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureCompletionEClass, FeatureCompletion.class, "FeatureCompletion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureCompletion_FeatureObjectives(), theFeatureObjectivePackage.getFeatureObjective(), null, "featureObjectives", null, 1, 1, FeatureCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCompletion_CompletionComponents(), this.getCompletionComponent(), null, "completionComponents", null, 0, -1, FeatureCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCompletion_Complementa(), this.getComplementum(), null, "complementa", null, 1, -1, FeatureCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureCompletion_ArchitectureConstraints(), this.getArchitectureConstraints(), null, "architectureConstraints", null, 0, -1, FeatureCompletion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(completionComponentEClass, CompletionComponent.class, "CompletionComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompletionComponent_RequiredComponents(), this.getCompletionComponent(), null, "requiredComponents", null, 0, -1, CompletionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompletionComponent_PerimeterProviding(), this.getPerimeterProviding(), null, "perimeterProviding", null, 0, 1, CompletionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompletionComponent_ComponentConstraints(), this.getArchitectureConstraints(), null, "componentConstraints", null, 0, -1, CompletionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompletionComponent_PerimeterRequiring(), this.getPerimeterRequiring(), null, "perimeterRequiring", null, 0, 1, CompletionComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perimeterProvidingEClass, PerimeterProviding.class, "PerimeterProviding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerimeterProviding_FeatureProviding(), theFeatureObjectivePackage.getFeature(), null, "featureProviding", null, 1, -1, PerimeterProviding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementumVisnetisEClass, ComplementumVisnetis.class, "ComplementumVisnetis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplementumVisnetis_ComplementaryFeature(), theFeatureObjectivePackage.getFeature(), null, "complementaryFeature", null, 1, 1, ComplementumVisnetis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplementumVisnetis_RequiresComplementum(), this.getComplementum(), null, "requiresComplementum", null, 0, -1, ComplementumVisnetis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complementumEClass, Complementum.class, "Complementum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplementum_Replication(), this.getReplication(), "replication", "SINGLE", 1, 1, Complementum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplementum_Visnetum(), this.getVisnetum(), "visnetum", "SIGNATURE", 1, 1, Complementum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(architectureConstraintsEClass, ArchitectureConstraints.class, "ArchitectureConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureConstraints_Constraint(), this.getConstraint(), "constraint", "ANY", 1, 1, ArchitectureConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureConstraints_ArchitectureElements(), this.getConstrainableElement(), null, "architectureElements", null, 1, -1, ArchitectureConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constrainableElementEClass, ConstrainableElement.class, "ConstrainableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(perimeterRequiringEClass, PerimeterRequiring.class, "PerimeterRequiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPerimeterRequiring_Complementum(), this.getComplementum(), null, "complementum", null, 0, -1, PerimeterRequiring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visnetumEEnum, Visnetum.class, "Visnetum");
		addEEnumLiteral(visnetumEEnum, Visnetum.SIGNATURE);
		addEEnumLiteral(visnetumEEnum, Visnetum.INTERFACE);
		addEEnumLiteral(visnetumEEnum, Visnetum.INTERFACE_REQUIRES);
		addEEnumLiteral(visnetumEEnum, Visnetum.INTERFACE_PROVIDES);
		addEEnumLiteral(visnetumEEnum, Visnetum.COMPONENT);

		initEEnum(replicationEEnum, Replication.class, "Replication");
		addEEnumLiteral(replicationEEnum, Replication.SINGLE);
		addEEnumLiteral(replicationEEnum, Replication.DOUBLE);
		addEEnumLiteral(replicationEEnum, Replication.ANY);

		initEEnum(constraintEEnum, Constraint.class, "Constraint");
		addEEnumLiteral(constraintEEnum, Constraint.ANY);
		addEEnumLiteral(constraintEEnum, Constraint.TOGETHER);
		addEEnumLiteral(constraintEEnum, Constraint.ISOLATED);
		addEEnumLiteral(constraintEEnum, Constraint.SEPARATED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore",
			 "featureObjective", "featureObjective.ecore#/",
			 "identifier", "../../de.uka.ipd.sdq.identifier/model/identifier.ecore#/",
			 "pcm", "../../../plugin/org.palladiosimulator.pcm/model/pcm.ecore#/"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (featureCompletionEClass, 
		   source, 
		   new String[] {
			 "constraints", "requiredComponentsHaveToBePartOfCompletion"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (featureCompletionEClass, 
		   source, 
		   new String[] {
			 "requiredComponentsHaveToBePartOfCompletion", "\n\t\t\tcompletionComponents.requiredComponents->exists(self.completionComponents)"
		   });
	}

} //FeatureCompletionPackageImpl
