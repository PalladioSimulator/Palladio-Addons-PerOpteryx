/**
 */
package TransformationModel.impl;

import ConcernModel.ConcernModelPackage;

import ConcernModel.impl.ConcernModelPackageImpl;

import SolutionModel.SolutionModelPackage;

import SolutionModel.impl.SolutionModelPackageImpl;

import TransformationModel.AdapterTransformation;
import TransformationModel.Appearance;
import TransformationModel.ExtensionTransformation;
import TransformationModel.Transformation;
import TransformationModel.TransformationModelFactory;
import TransformationModel.TransformationModelPackage;
import TransformationModel.TransformationRepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationModelPackageImpl extends EPackageImpl implements TransformationModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appearanceEEnum = null;

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
	 * @see TransformationModel.TransformationModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TransformationModelPackageImpl() {
		super(eNS_URI, TransformationModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TransformationModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TransformationModelPackage init() {
		if (isInited) return (TransformationModelPackage)EPackage.Registry.INSTANCE.getEPackage(TransformationModelPackage.eNS_URI);

		// Obtain or create and register package
		TransformationModelPackageImpl theTransformationModelPackage = (TransformationModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TransformationModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TransformationModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SolutionModelPackageImpl theSolutionModelPackage = (SolutionModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SolutionModelPackage.eNS_URI) instanceof SolutionModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SolutionModelPackage.eNS_URI) : SolutionModelPackage.eINSTANCE);
		ConcernModelPackageImpl theConcernModelPackage = (ConcernModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConcernModelPackage.eNS_URI) instanceof ConcernModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConcernModelPackage.eNS_URI) : ConcernModelPackage.eINSTANCE);

		// Create package meta-data objects
		theTransformationModelPackage.createPackageContents();
		theSolutionModelPackage.createPackageContents();
		theConcernModelPackage.createPackageContents();

		// Initialize created meta-data
		theTransformationModelPackage.initializePackageContents();
		theSolutionModelPackage.initializePackageContents();
		theConcernModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTransformationModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TransformationModelPackage.eNS_URI, theTransformationModelPackage);
		return theTransformationModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Threshold() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Multiple() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Injectable() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Target() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Name() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformationRepository() {
		return transformationRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformationRepository_Transformation() {
		return (EReference)transformationRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionTransformation() {
		return extensionTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapterTransformation() {
		return adapterTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdapterTransformation_Appear() {
		return (EAttribute)adapterTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppearance() {
		return appearanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationModelFactory getTransformationModelFactory() {
		return (TransformationModelFactory)getEFactoryInstance();
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
		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__THRESHOLD);
		createEAttribute(transformationEClass, TRANSFORMATION__MULTIPLE);
		createEReference(transformationEClass, TRANSFORMATION__INJECTABLE);
		createEReference(transformationEClass, TRANSFORMATION__TARGET);
		createEAttribute(transformationEClass, TRANSFORMATION__NAME);

		transformationRepositoryEClass = createEClass(TRANSFORMATION_REPOSITORY);
		createEReference(transformationRepositoryEClass, TRANSFORMATION_REPOSITORY__TRANSFORMATION);

		extensionTransformationEClass = createEClass(EXTENSION_TRANSFORMATION);

		adapterTransformationEClass = createEClass(ADAPTER_TRANSFORMATION);
		createEAttribute(adapterTransformationEClass, ADAPTER_TRANSFORMATION__APPEAR);

		// Create enums
		appearanceEEnum = createEEnum(APPEARANCE);
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
		ConcernModelPackage theConcernModelPackage = (ConcernModelPackage)EPackage.Registry.INSTANCE.getEPackage(ConcernModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		extensionTransformationEClass.getESuperTypes().add(this.getTransformation());
		adapterTransformationEClass.getESuperTypes().add(this.getTransformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Threshold(), ecorePackage.getEInt(), "threshold", "0", 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Multiple(), ecorePackage.getEBoolean(), "multiple", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Injectable(), theConcernModelPackage.getAnnotationEnrich(), null, "injectable", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_Target(), theConcernModelPackage.getAnnotationTarget(), null, "target", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationRepositoryEClass, TransformationRepository.class, "TransformationRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformationRepository_Transformation(), this.getTransformation(), null, "transformation", null, 0, -1, TransformationRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionTransformationEClass, ExtensionTransformation.class, "ExtensionTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(adapterTransformationEClass, AdapterTransformation.class, "AdapterTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdapterTransformation_Appear(), this.getAppearance(), "appear", "BEFORE", 0, 1, AdapterTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(appearanceEEnum, Appearance.class, "Appearance");
		addEEnumLiteral(appearanceEEnum, Appearance.BEFORE);
		addEEnumLiteral(appearanceEEnum, Appearance.AFTER);
		addEEnumLiteral(appearanceEEnum, Appearance.AROUND);

		// Create resource
		createResource(eNS_URI);
	}

} //TransformationModelPackageImpl
