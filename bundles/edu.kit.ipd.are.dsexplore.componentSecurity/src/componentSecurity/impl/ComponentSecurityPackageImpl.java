/**
 */
package componentSecurity.impl;

import componentSecurity.ComponentSecurity;
import componentSecurity.ComponentSecurityFactory;
import componentSecurity.ComponentSecurityPackage;

import componentSecurity.ComponentSecurityRepository;
import componentSecurity.SecurityTarget;
import org.eclipse.emf.ecore.EAttribute;
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
public class ComponentSecurityPackageImpl extends EPackageImpl implements ComponentSecurityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSecurityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSecurityRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityTargetEClass = null;

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
	 * @see componentSecurity.ComponentSecurityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentSecurityPackageImpl() {
		super(eNS_URI, ComponentSecurityFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentSecurityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentSecurityPackage init() {
		if (isInited) return (ComponentSecurityPackage)EPackage.Registry.INSTANCE.getEPackage(ComponentSecurityPackage.eNS_URI);

		// Obtain or create and register package
		ComponentSecurityPackageImpl theComponentSecurityPackage = (ComponentSecurityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComponentSecurityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComponentSecurityPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComponentSecurityPackage.createPackageContents();

		// Initialize created meta-data
		theComponentSecurityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentSecurityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentSecurityPackage.eNS_URI, theComponentSecurityPackage);
		return theComponentSecurityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSecurity() {
		return componentSecurityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSecurity_PoCoB() {
		return (EAttribute)componentSecurityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentSecurity_TTDV() {
		return (EAttribute)componentSecurityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSecurityRepository() {
		return componentSecurityRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSecurityRepository_Componentsecurity() {
		return (EReference)componentSecurityRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityTarget() {
		return securityTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSecurityFactory getComponentSecurityFactory() {
		return (ComponentSecurityFactory)getEFactoryInstance();
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
		componentSecurityEClass = createEClass(COMPONENT_SECURITY);
		createEAttribute(componentSecurityEClass, COMPONENT_SECURITY__PO_CO_B);
		createEAttribute(componentSecurityEClass, COMPONENT_SECURITY__TTDV);

		componentSecurityRepositoryEClass = createEClass(COMPONENT_SECURITY_REPOSITORY);
		createEReference(componentSecurityRepositoryEClass, COMPONENT_SECURITY_REPOSITORY__COMPONENTSECURITY);

		securityTargetEClass = createEClass(SECURITY_TARGET);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(componentSecurityEClass, ComponentSecurity.class, "ComponentSecurity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentSecurity_PoCoB(), ecorePackage.getEDouble(), "poCoB", "0.2", 0, 1, ComponentSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentSecurity_TTDV(), ecorePackage.getEDouble(), "TTDV", "200.0", 0, 1, ComponentSecurity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSecurityRepositoryEClass, ComponentSecurityRepository.class, "ComponentSecurityRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSecurityRepository_Componentsecurity(), this.getComponentSecurity(), null, "componentsecurity", null, 0, -1, ComponentSecurityRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(securityTargetEClass, SecurityTarget.class, "SecurityTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentSecurityPackageImpl
