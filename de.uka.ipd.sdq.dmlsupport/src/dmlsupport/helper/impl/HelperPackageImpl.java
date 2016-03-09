/**
 */
package dmlsupport.helper.impl;

import dmlsupport.DmlsupportPackage;

import dmlsupport.designdecision.DesigndecisionPackage;

import dmlsupport.designdecision.impl.DesigndecisionPackageImpl;

import dmlsupport.helper.DMLPhenotype;
import dmlsupport.helper.HelperFactory;
import dmlsupport.helper.HelperPackage;

import dmlsupport.impl.DmlsupportPackageImpl;

import dmlsupport.representation.RepresentationPackage;

import dmlsupport.representation.impl.RepresentationPackageImpl;

import genericdesigndecision.GenericdesigndecisionPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelperPackageImpl extends EPackageImpl implements HelperPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmlPhenotypeEClass = null;

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
	 * @see dmlsupport.helper.HelperPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HelperPackageImpl() {
		super(eNS_URI, HelperFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HelperPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HelperPackage init() {
		if (isInited) return (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);

		// Obtain or create and register package
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new HelperPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenericdesigndecisionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DmlsupportPackageImpl theDmlsupportPackage = (DmlsupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI) instanceof DmlsupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI) : DmlsupportPackage.eINSTANCE);
		DesigndecisionPackageImpl theDesigndecisionPackage = (DesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI) instanceof DesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI) : DesigndecisionPackage.eINSTANCE);
		RepresentationPackageImpl theRepresentationPackage = (RepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI) instanceof RepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI) : RepresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theHelperPackage.createPackageContents();
		theDmlsupportPackage.createPackageContents();
		theDesigndecisionPackage.createPackageContents();
		theRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theHelperPackage.initializePackageContents();
		theDmlsupportPackage.initializePackageContents();
		theDesigndecisionPackage.initializePackageContents();
		theRepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHelperPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HelperPackage.eNS_URI, theHelperPackage);
		return theHelperPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMLPhenotype() {
		return dmlPhenotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperFactory getHelperFactory() {
		return (HelperFactory)getEFactoryInstance();
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
		dmlPhenotypeEClass = createEClass(DML_PHENOTYPE);
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
		GenericdesigndecisionPackage theGenericdesigndecisionPackage = (GenericdesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dmlPhenotypeEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getPhenotype());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmlPhenotypeEClass, DMLPhenotype.class, "DMLPhenotype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //HelperPackageImpl
