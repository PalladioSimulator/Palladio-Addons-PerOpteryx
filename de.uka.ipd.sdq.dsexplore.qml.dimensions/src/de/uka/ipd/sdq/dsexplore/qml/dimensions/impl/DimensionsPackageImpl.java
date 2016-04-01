/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsFactory;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;

import de.uka.ipd.sdq.dsexplore.qml.units.UnitsPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionsPackageImpl extends EPackageImpl implements DimensionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionRepositoryEClass = null;

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
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DimensionsPackageImpl() {
		super(eNS_URI, DimensionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DimensionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DimensionsPackage init() {
		if (isInited) return (DimensionsPackage)EPackage.Registry.INSTANCE.getEPackage(DimensionsPackage.eNS_URI);

		// Obtain or create and register package
		DimensionsPackageImpl theDimensionsPackage = (DimensionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DimensionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DimensionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DimensiontypesPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDimensionsPackage.createPackageContents();

		// Initialize created meta-data
		theDimensionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDimensionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DimensionsPackage.eNS_URI, theDimensionsPackage);
		return theDimensionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Type() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimension_Unit() {
		return (EReference)dimensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionRepository() {
		return dimensionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionRepository_Dimensions() {
		return (EReference)dimensionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsFactory getDimensionsFactory() {
		return (DimensionsFactory)getEFactoryInstance();
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
		dimensionEClass = createEClass(DIMENSION);
		createEReference(dimensionEClass, DIMENSION__TYPE);
		createEReference(dimensionEClass, DIMENSION__UNIT);

		dimensionRepositoryEClass = createEClass(DIMENSION_REPOSITORY);
		createEReference(dimensionRepositoryEClass, DIMENSION_REPOSITORY__DIMENSIONS);
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
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		NamedelementPackage theNamedelementPackage = (NamedelementPackage)EPackage.Registry.INSTANCE.getEPackage(NamedelementPackage.eNS_URI);
		DimensiontypesPackage theDimensiontypesPackage = (DimensiontypesPackage)EPackage.Registry.INSTANCE.getEPackage(DimensiontypesPackage.eNS_URI);
		UnitsPackage theUnitsPackage = (UnitsPackage)EPackage.Registry.INSTANCE.getEPackage(UnitsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dimensionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dimensionEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		dimensionRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());

		// Initialize classes and features; add operations and parameters
		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimension_Type(), theDimensiontypesPackage.getDimensionType(), null, "type", null, 1, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDimension_Unit(), theUnitsPackage.getUnit(), null, "unit", null, 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionRepositoryEClass, DimensionRepository.class, "DimensionRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionRepository_Dimensions(), this.getDimension(), null, "dimensions", null, 0, -1, DimensionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DimensionsPackageImpl
