/**
 */
package dmlsupport.representation.impl;

import de.uka.ipd.sdq.dsexplore.launch.DSEFileNamesInputTab;
import de.uka.ipd.sdq.dsexplore.launch.DSEOptionsTab;
import dmlsupport.DmlsupportPackage;

import dmlsupport.designdecision.DesigndecisionPackage;

import dmlsupport.designdecision.impl.DesigndecisionPackageImpl;

import dmlsupport.helper.HelperPackage;

import dmlsupport.helper.impl.HelperPackageImpl;

import dmlsupport.impl.DmlsupportPackageImpl;

import dmlsupport.representation.DMLFileNamesInput;
import dmlsupport.representation.DML_DSEOptionsTab;
import dmlsupport.representation.RepresentationFactory;
import dmlsupport.representation.RepresentationPackage;

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
public class RepresentationPackageImpl extends EPackageImpl implements RepresentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmL_DSEOptionsTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmlFileNamesInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseOptionsTabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseFileNamesInputTabEClass = null;

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
	 * @see dmlsupport.representation.RepresentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RepresentationPackageImpl() {
		super(eNS_URI, RepresentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RepresentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RepresentationPackage init() {
		if (isInited) return (RepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI);

		// Obtain or create and register package
		RepresentationPackageImpl theRepresentationPackage = (RepresentationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RepresentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RepresentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenericdesigndecisionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DmlsupportPackageImpl theDmlsupportPackage = (DmlsupportPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI) instanceof DmlsupportPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI) : DmlsupportPackage.eINSTANCE);
		DesigndecisionPackageImpl theDesigndecisionPackage = (DesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI) instanceof DesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI) : DesigndecisionPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);

		// Create package meta-data objects
		theRepresentationPackage.createPackageContents();
		theDmlsupportPackage.createPackageContents();
		theDesigndecisionPackage.createPackageContents();
		theHelperPackage.createPackageContents();

		// Initialize created meta-data
		theRepresentationPackage.initializePackageContents();
		theDmlsupportPackage.initializePackageContents();
		theDesigndecisionPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRepresentationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RepresentationPackage.eNS_URI, theRepresentationPackage);
		return theRepresentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDML_DSEOptionsTab() {
		return dmL_DSEOptionsTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMLFileNamesInput() {
		return dmlFileNamesInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEOptionsTab() {
		return dseOptionsTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEFileNamesInputTab() {
		return dseFileNamesInputTabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepresentationFactory getRepresentationFactory() {
		return (RepresentationFactory)getEFactoryInstance();
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
		dmL_DSEOptionsTabEClass = createEClass(DML_DSE_OPTIONS_TAB);

		dmlFileNamesInputEClass = createEClass(DML_FILE_NAMES_INPUT);

		dseOptionsTabEClass = createEClass(DSE_OPTIONS_TAB);

		dseFileNamesInputTabEClass = createEClass(DSE_FILE_NAMES_INPUT_TAB);
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
		dmL_DSEOptionsTabEClass.getESuperTypes().add(this.getDSEOptionsTab());
		dmlFileNamesInputEClass.getESuperTypes().add(this.getDSEFileNamesInputTab());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmL_DSEOptionsTabEClass, DML_DSEOptionsTab.class, "DML_DSEOptionsTab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmlFileNamesInputEClass, DMLFileNamesInput.class, "DMLFileNamesInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseOptionsTabEClass, DSEOptionsTab.class, "DSEOptionsTab", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseFileNamesInputTabEClass, DSEFileNamesInputTab.class, "DSEFileNamesInputTab", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //RepresentationPackageImpl
