/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.impl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypeFactory;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsPackage;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage;

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
public class QMLContractTypePackageImpl extends EPackageImpl implements QMLContractTypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qmlContractTypeEClass = null;

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
	 * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractTypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QMLContractTypePackageImpl() {
		super(eNS_URI, QMLContractTypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link QMLContractTypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QMLContractTypePackage init() {
		if (isInited) return (QMLContractTypePackage)EPackage.Registry.INSTANCE.getEPackage(QMLContractTypePackage.eNS_URI);

		// Obtain or create and register package
		QMLContractTypePackageImpl theQMLContractTypePackage = (QMLContractTypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QMLContractTypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QMLContractTypePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DimensionsPackage.eINSTANCE.eClass();
		QMLDeclarationsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQMLContractTypePackage.createPackageContents();

		// Initialize created meta-data
		theQMLContractTypePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQMLContractTypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QMLContractTypePackage.eNS_URI, theQMLContractTypePackage);
		return theQMLContractTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQMLContractType() {
		return qmlContractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQMLContractType_Dimensions() {
		return (EReference)qmlContractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractTypeFactory getQMLContractTypeFactory() {
		return (QMLContractTypeFactory)getEFactoryInstance();
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
		qmlContractTypeEClass = createEClass(QML_CONTRACT_TYPE);
		createEReference(qmlContractTypeEClass, QML_CONTRACT_TYPE__DIMENSIONS);
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
		QMLDeclarationsPackage theQMLDeclarationsPackage = (QMLDeclarationsPackage)EPackage.Registry.INSTANCE.getEPackage(QMLDeclarationsPackage.eNS_URI);
		DimensionsPackage theDimensionsPackage = (DimensionsPackage)EPackage.Registry.INSTANCE.getEPackage(DimensionsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qmlContractTypeEClass.getESuperTypes().add(theQMLDeclarationsPackage.getQMLDeclaration());

		// Initialize classes and features; add operations and parameters
		initEClass(qmlContractTypeEClass, QMLContractType.class, "QMLContractType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQMLContractType_Dimensions(), theDimensionsPackage.getDimension(), null, "dimensions", null, 0, -1, QMLContractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //QMLContractTypePackageImpl
