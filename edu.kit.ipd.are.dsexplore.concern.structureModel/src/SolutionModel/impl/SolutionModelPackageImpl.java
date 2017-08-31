/**
 */
package SolutionModel.impl;

import ConcernModel.ConcernModelPackage;

import ConcernModel.impl.ConcernModelPackageImpl;

import SolutionModel.Solution;
import SolutionModel.SolutionModelFactory;
import SolutionModel.SolutionModelPackage;
import SolutionModel.SolutionRepository;

import TransformationModel.TransformationModelPackage;

import TransformationModel.impl.TransformationModelPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionModelPackageImpl extends EPackageImpl implements SolutionModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionRepositoryEClass = null;

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
	 * @see SolutionModel.SolutionModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SolutionModelPackageImpl() {
		super(eNS_URI, SolutionModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SolutionModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SolutionModelPackage init() {
		if (isInited) return (SolutionModelPackage)EPackage.Registry.INSTANCE.getEPackage(SolutionModelPackage.eNS_URI);

		// Obtain or create and register package
		SolutionModelPackageImpl theSolutionModelPackage = (SolutionModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SolutionModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SolutionModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TransformationModelPackageImpl theTransformationModelPackage = (TransformationModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TransformationModelPackage.eNS_URI) instanceof TransformationModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TransformationModelPackage.eNS_URI) : TransformationModelPackage.eINSTANCE);
		ConcernModelPackageImpl theConcernModelPackage = (ConcernModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConcernModelPackage.eNS_URI) instanceof ConcernModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConcernModelPackage.eNS_URI) : ConcernModelPackage.eINSTANCE);

		// Create package meta-data objects
		theSolutionModelPackage.createPackageContents();
		theTransformationModelPackage.createPackageContents();
		theConcernModelPackage.createPackageContents();

		// Initialize created meta-data
		theSolutionModelPackage.initializePackageContents();
		theTransformationModelPackage.initializePackageContents();
		theConcernModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSolutionModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SolutionModelPackage.eNS_URI, theSolutionModelPackage);
		return theSolutionModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolution_Name() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_Repository() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolution_CostRepository() {
		return (EReference)solutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolutionRepository() {
		return solutionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolutionRepository_Solutions() {
		return (EReference)solutionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionModelFactory getSolutionModelFactory() {
		return (SolutionModelFactory)getEFactoryInstance();
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
		solutionEClass = createEClass(SOLUTION);
		createEAttribute(solutionEClass, SOLUTION__NAME);
		createEReference(solutionEClass, SOLUTION__REPOSITORY);
		createEReference(solutionEClass, SOLUTION__COST_REPOSITORY);

		solutionRepositoryEClass = createEClass(SOLUTION_REPOSITORY);
		createEReference(solutionRepositoryEClass, SOLUTION_REPOSITORY__SOLUTIONS);
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
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolution_Name(), ecorePackage.getEString(), "name", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_Repository(), theRepositoryPackage.getRepository(), null, "repository", null, 1, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolution_CostRepository(), theEcorePackage.getEObject(), null, "costRepository", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionRepositoryEClass, SolutionRepository.class, "SolutionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionRepository_Solutions(), this.getSolution(), null, "solutions", null, 0, -1, SolutionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SolutionModelPackageImpl
