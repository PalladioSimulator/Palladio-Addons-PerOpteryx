/**
 */
package dmlsupport.designdecision.impl;

import dmlsupport.DmlsupportPackage;

import dmlsupport.designdecision.DSEProblem;
import dmlsupport.designdecision.DesigndecisionFactory;
import dmlsupport.designdecision.DesigndecisionPackage;
import dmlsupport.designdecision.MetamodelDescription;

import dmlsupport.helper.HelperPackage;

import dmlsupport.helper.impl.HelperPackageImpl;

import dmlsupport.impl.DmlsupportPackageImpl;

import dmlsupport.representation.RepresentationPackage;

import dmlsupport.representation.impl.RepresentationPackageImpl;

import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.universalDoF.UniversalDoFPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DesigndecisionPackageImpl extends EPackageImpl implements DesigndecisionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseProblemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelDescriptionEClass = null;

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
	 * @see dmlsupport.designdecision.DesigndecisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DesigndecisionPackageImpl() {
		super(eNS_URI, DesigndecisionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DesigndecisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DesigndecisionPackage init() {
		if (isInited) return (DesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI);

		// Obtain or create and register package
		DesigndecisionPackageImpl theDesigndecisionPackage = (DesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DesigndecisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenericdesigndecisionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DmlsupportPackageImpl theDmlsupportPackage = (DmlsupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI) instanceof DmlsupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI) : DmlsupportPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		RepresentationPackageImpl theRepresentationPackage = (RepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI) instanceof RepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI) : RepresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theDesigndecisionPackage.createPackageContents();
		theDmlsupportPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theDesigndecisionPackage.initializePackageContents();
		theDmlsupportPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theRepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDesigndecisionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DesigndecisionPackage.eNS_URI, theDesigndecisionPackage);
		return theDesigndecisionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEProblem() {
		return dseProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetamodelDescription() {
		return metamodelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesigndecisionFactory getDesigndecisionFactory() {
		return (DesigndecisionFactory)getEFactoryInstance();
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
		dseProblemEClass = createEClass(DSE_PROBLEM);

		metamodelDescriptionEClass = createEClass(METAMODEL_DESCRIPTION);
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
		HelperPackage theHelperPackage = (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);
		UniversalDoFPackage theUniversalDoFPackage = (UniversalDoFPackage)EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theGenericdesigndecisionPackage.getADSEProblem());
		EGenericType g2 = createEGenericType(theHelperPackage.getDMLPhenotype());
		g1.getETypeArguments().add(g2);
		dseProblemEClass.getEGenericSuperTypes().add(g1);
		metamodelDescriptionEClass.getESuperTypes().add(theUniversalDoFPackage.getAMetamodelDescription());

		// Initialize classes, features, and operations; add parameters
		initEClass(dseProblemEClass, DSEProblem.class, "DSEProblem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelDescriptionEClass, MetamodelDescription.class, "MetamodelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //DesigndecisionPackageImpl
