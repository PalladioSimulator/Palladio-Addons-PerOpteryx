/**
 */
package ConcernModel.impl;

import ConcernModel.Annotation;
import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;
import ConcernModel.Association;
import ConcernModel.Concern;
import ConcernModel.ConcernModelFactory;
import ConcernModel.ConcernModelPackage;
import ConcernModel.ConcernRepository;
import ConcernModel.ConcernStrategy;
import ConcernModel.DeploymentConstraint;
import ConcernModel.ElementaryConcernComponent;
import ConcernModel.JoinPoint;

import ConcernModel.util.ConcernModelValidator;

import SolutionModel.SolutionModelPackage;

import SolutionModel.impl.SolutionModelPackageImpl;

import TransformationModel.TransformationModelPackage;

import TransformationModel.impl.TransformationModelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernModelPackageImpl extends EPackageImpl implements ConcernModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementaryConcernComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEnrichEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum joinPointEEnum = null;

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
	 * @see ConcernModel.ConcernModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConcernModelPackageImpl() {
		super(eNS_URI, ConcernModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ConcernModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConcernModelPackage init() {
		if (isInited) return (ConcernModelPackage)EPackage.Registry.INSTANCE.getEPackage(ConcernModelPackage.eNS_URI);

		// Obtain or create and register package
		ConcernModelPackageImpl theConcernModelPackage = (ConcernModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConcernModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConcernModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TransformationModelPackageImpl theTransformationModelPackage = (TransformationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformationModelPackage.eNS_URI) instanceof TransformationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformationModelPackage.eNS_URI) : TransformationModelPackage.eINSTANCE);
		SolutionModelPackageImpl theSolutionModelPackage = (SolutionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SolutionModelPackage.eNS_URI) instanceof SolutionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SolutionModelPackage.eNS_URI) : SolutionModelPackage.eINSTANCE);

		// Create package meta-data objects
		theConcernModelPackage.createPackageContents();
		theTransformationModelPackage.createPackageContents();
		theSolutionModelPackage.createPackageContents();

		// Initialize created meta-data
		theConcernModelPackage.initializePackageContents();
		theTransformationModelPackage.initializePackageContents();
		theSolutionModelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theConcernModelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ConcernModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theConcernModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConcernModelPackage.eNS_URI, theConcernModelPackage);
		return theConcernModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcernRepository() {
		return concernRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcernRepository_Concerns() {
		return (EReference)concernRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcern_Strategies() {
		return (EReference)concernEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcern_Components() {
		return (EReference)concernEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcern_Name() {
		return (EAttribute)concernEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcern_Description() {
		return (EAttribute)concernEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcern_Annotationtarget() {
		return (EReference)concernEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcern_Constraints() {
		return (EReference)concernEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcernStrategy() {
		return concernStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcernStrategy_Name() {
		return (EAttribute)concernStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConcernStrategy_Description() {
		return (EAttribute)concernStrategyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcernStrategy_ConcernSolutions() {
		return (EReference)concernStrategyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementaryConcernComponent() {
		return elementaryConcernComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryConcernComponent_Requires() {
		return (EReference)elementaryConcernComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryConcernComponent_Name() {
		return (EAttribute)elementaryConcernComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementaryConcernComponent_Description() {
		return (EAttribute)elementaryConcernComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementaryConcernComponent_Annotationenrich() {
		return (EReference)elementaryConcernComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Name() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Description() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_MaxAmount() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationTarget() {
		return annotationTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationTarget_JoinPoint() {
		return (EAttribute)annotationTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationTarget_Signatures() {
		return (EReference)annotationTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationEnrich() {
		return annotationEnrichEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentConstraint() {
		return deploymentConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentConstraint_Association() {
		return (EAttribute)deploymentConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentConstraint_Annotations() {
		return (EReference)deploymentConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociation() {
		return associationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoinPoint() {
		return joinPointEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernModelFactory getConcernModelFactory() {
		return (ConcernModelFactory)getEFactoryInstance();
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
		concernRepositoryEClass = createEClass(CONCERN_REPOSITORY);
		createEReference(concernRepositoryEClass, CONCERN_REPOSITORY__CONCERNS);

		concernEClass = createEClass(CONCERN);
		createEReference(concernEClass, CONCERN__STRATEGIES);
		createEReference(concernEClass, CONCERN__COMPONENTS);
		createEAttribute(concernEClass, CONCERN__NAME);
		createEAttribute(concernEClass, CONCERN__DESCRIPTION);
		createEReference(concernEClass, CONCERN__ANNOTATIONTARGET);
		createEReference(concernEClass, CONCERN__CONSTRAINTS);

		concernStrategyEClass = createEClass(CONCERN_STRATEGY);
		createEAttribute(concernStrategyEClass, CONCERN_STRATEGY__NAME);
		createEAttribute(concernStrategyEClass, CONCERN_STRATEGY__DESCRIPTION);
		createEReference(concernStrategyEClass, CONCERN_STRATEGY__CONCERN_SOLUTIONS);

		elementaryConcernComponentEClass = createEClass(ELEMENTARY_CONCERN_COMPONENT);
		createEReference(elementaryConcernComponentEClass, ELEMENTARY_CONCERN_COMPONENT__REQUIRES);
		createEAttribute(elementaryConcernComponentEClass, ELEMENTARY_CONCERN_COMPONENT__NAME);
		createEAttribute(elementaryConcernComponentEClass, ELEMENTARY_CONCERN_COMPONENT__DESCRIPTION);
		createEReference(elementaryConcernComponentEClass, ELEMENTARY_CONCERN_COMPONENT__ANNOTATIONENRICH);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__NAME);
		createEAttribute(annotationEClass, ANNOTATION__DESCRIPTION);
		createEAttribute(annotationEClass, ANNOTATION__MAX_AMOUNT);

		annotationTargetEClass = createEClass(ANNOTATION_TARGET);
		createEAttribute(annotationTargetEClass, ANNOTATION_TARGET__JOIN_POINT);
		createEReference(annotationTargetEClass, ANNOTATION_TARGET__SIGNATURES);

		annotationEnrichEClass = createEClass(ANNOTATION_ENRICH);

		deploymentConstraintEClass = createEClass(DEPLOYMENT_CONSTRAINT);
		createEAttribute(deploymentConstraintEClass, DEPLOYMENT_CONSTRAINT__ASSOCIATION);
		createEReference(deploymentConstraintEClass, DEPLOYMENT_CONSTRAINT__ANNOTATIONS);

		// Create enums
		associationEEnum = createEEnum(ASSOCIATION);
		joinPointEEnum = createEEnum(JOIN_POINT);
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
		SolutionModelPackage theSolutionModelPackage = (SolutionModelPackage)EPackage.Registry.INSTANCE.getEPackage(SolutionModelPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annotationTargetEClass.getESuperTypes().add(this.getAnnotation());
		annotationEnrichEClass.getESuperTypes().add(this.getAnnotation());

		// Initialize classes, features, and operations; add parameters
		initEClass(concernRepositoryEClass, ConcernRepository.class, "ConcernRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcernRepository_Concerns(), this.getConcern(), null, "concerns", null, 0, -1, ConcernRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernEClass, Concern.class, "Concern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcern_Strategies(), this.getConcernStrategy(), null, "strategies", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_Components(), this.getElementaryConcernComponent(), null, "components", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcern_Name(), ecorePackage.getEString(), "name", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcern_Description(), ecorePackage.getEString(), "description", null, 0, 1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_Annotationtarget(), this.getAnnotationTarget(), null, "annotationtarget", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcern_Constraints(), this.getDeploymentConstraint(), null, "constraints", null, 0, -1, Concern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernStrategyEClass, ConcernStrategy.class, "ConcernStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcernStrategy_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConcernStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcernStrategy_Description(), ecorePackage.getEString(), "description", null, 0, 1, ConcernStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcernStrategy_ConcernSolutions(), theSolutionModelPackage.getSolution(), null, "concernSolutions", null, 1, -1, ConcernStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementaryConcernComponentEClass, ElementaryConcernComponent.class, "ElementaryConcernComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementaryConcernComponent_Requires(), this.getElementaryConcernComponent(), null, "requires", null, 0, -1, ElementaryConcernComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryConcernComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, ElementaryConcernComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementaryConcernComponent_Description(), ecorePackage.getEString(), "description", null, 0, 1, ElementaryConcernComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementaryConcernComponent_Annotationenrich(), this.getAnnotationEnrich(), null, "annotationenrich", null, 0, -1, ElementaryConcernComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Description(), ecorePackage.getEString(), "description", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_MaxAmount(), ecorePackage.getEInt(), "maxAmount", "0", 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationTargetEClass, AnnotationTarget.class, "AnnotationTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationTarget_JoinPoint(), this.getJoinPoint(), "joinPoint", "SIGNATURE", 0, 1, AnnotationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationTarget_Signatures(), theRepositoryPackage.getSignature(), null, "signatures", null, 0, -1, AnnotationTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEnrichEClass, AnnotationEnrich.class, "AnnotationEnrich", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deploymentConstraintEClass, DeploymentConstraint.class, "DeploymentConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentConstraint_Association(), this.getAssociation(), "association", "INDIFFERENT", 0, 1, DeploymentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentConstraint_Annotations(), this.getAnnotation(), null, "annotations", null, 1, -1, DeploymentConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(associationEEnum, Association.class, "Association");
		addEEnumLiteral(associationEEnum, Association.INDIFFERENT);
		addEEnumLiteral(associationEEnum, Association.TOGETHER);
		addEEnumLiteral(associationEEnum, Association.ISOLATED);
		addEEnumLiteral(associationEEnum, Association.SEPARATED);

		initEEnum(joinPointEEnum, JoinPoint.class, "JoinPoint");
		addEEnumLiteral(joinPointEEnum, JoinPoint.SIGNATURE);
		addEEnumLiteral(joinPointEEnum, JoinPoint.INTERFACE);
		addEEnumLiteral(joinPointEEnum, JoinPoint.INTERFACE_REQUIRES);
		addEEnumLiteral(joinPointEEnum, JoinPoint.INTERFACE_PROVIDES);
		addEEnumLiteral(joinPointEEnum, JoinPoint.COMPONENT);

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
		  (deploymentConstraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "isolation togetherSeparated"
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
		  (deploymentConstraintEClass, 
		   source, 
		   new String[] {
			 "isolation", "\n\t\tself.association = \'ISOLATED\' implies\n\t\t\tself.annotations->size() = 1",
			 "togetherSeparated", "\n\t\tself.association = \'TOGETHER\' or self.association = \'SEPARATED\' implies\n\t\t\tself.annotations->size() > 1"
		   });
	}

} //ConcernModelPackageImpl
