/**
 */
package dmlsupport.impl;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;
import dmlsupport.DMLWorkflowConfiguration;
import dmlsupport.DMLWorkflowConfigurationBuilder;
import dmlsupport.DmlsupportFactory;
import dmlsupport.DmlsupportPackage;

import dmlsupport.designdecision.DesigndecisionPackage;

import dmlsupport.designdecision.impl.DesigndecisionPackageImpl;

import dmlsupport.helper.HelperPackage;

import dmlsupport.helper.impl.HelperPackageImpl;

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
public class DmlsupportPackageImpl extends EPackageImpl implements DmlsupportPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmlWorkflowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmlWorkflowConfigurationBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseWorkflowConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractWorkflowConfigurationBuilderEClass = null;

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
	 * @see dmlsupport.DmlsupportPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DmlsupportPackageImpl() {
		super(eNS_URI, DmlsupportFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DmlsupportPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DmlsupportPackage init() {
		if (isInited) return (DmlsupportPackage)EPackage.Registry.INSTANCE.getEPackage(DmlsupportPackage.eNS_URI);

		// Obtain or create and register package
		DmlsupportPackageImpl theDmlsupportPackage = (DmlsupportPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmlsupportPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmlsupportPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenericdesigndecisionPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DesigndecisionPackageImpl theDesigndecisionPackage = (DesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI) instanceof DesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI) : DesigndecisionPackage.eINSTANCE);
		HelperPackageImpl theHelperPackage = (HelperPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) instanceof HelperPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI) : HelperPackage.eINSTANCE);
		RepresentationPackageImpl theRepresentationPackage = (RepresentationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI) instanceof RepresentationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI) : RepresentationPackage.eINSTANCE);

		// Create package meta-data objects
		theDmlsupportPackage.createPackageContents();
		theDesigndecisionPackage.createPackageContents();
		theHelperPackage.createPackageContents();
		theRepresentationPackage.createPackageContents();

		// Initialize created meta-data
		theDmlsupportPackage.initializePackageContents();
		theDesigndecisionPackage.initializePackageContents();
		theHelperPackage.initializePackageContents();
		theRepresentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDmlsupportPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DmlsupportPackage.eNS_URI, theDmlsupportPackage);
		return theDmlsupportPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMLWorkflowConfiguration() {
		return dmlWorkflowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDMLWorkflowConfigurationBuilder() {
		return dmlWorkflowConfigurationBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSEWorkflowConfiguration() {
		return dseWorkflowConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractWorkflowConfigurationBuilder() {
		return abstractWorkflowConfigurationBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DmlsupportFactory getDmlsupportFactory() {
		return (DmlsupportFactory)getEFactoryInstance();
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
		dmlWorkflowConfigurationEClass = createEClass(DML_WORKFLOW_CONFIGURATION);

		dmlWorkflowConfigurationBuilderEClass = createEClass(DML_WORKFLOW_CONFIGURATION_BUILDER);

		dseWorkflowConfigurationEClass = createEClass(DSE_WORKFLOW_CONFIGURATION);

		abstractWorkflowConfigurationBuilderEClass = createEClass(ABSTRACT_WORKFLOW_CONFIGURATION_BUILDER);
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
		DesigndecisionPackage theDesigndecisionPackage = (DesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(DesigndecisionPackage.eNS_URI);
		HelperPackage theHelperPackage = (HelperPackage)EPackage.Registry.INSTANCE.getEPackage(HelperPackage.eNS_URI);
		RepresentationPackage theRepresentationPackage = (RepresentationPackage)EPackage.Registry.INSTANCE.getEPackage(RepresentationPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theDesigndecisionPackage);
		getESubpackages().add(theHelperPackage);
		getESubpackages().add(theRepresentationPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dmlWorkflowConfigurationEClass.getESuperTypes().add(this.getDSEWorkflowConfiguration());
		dmlWorkflowConfigurationBuilderEClass.getESuperTypes().add(this.getAbstractWorkflowConfigurationBuilder());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmlWorkflowConfigurationEClass, DMLWorkflowConfiguration.class, "DMLWorkflowConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dmlWorkflowConfigurationBuilderEClass, DMLWorkflowConfigurationBuilder.class, "DMLWorkflowConfigurationBuilder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseWorkflowConfigurationEClass, DSEWorkflowConfiguration.class, "DSEWorkflowConfiguration", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractWorkflowConfigurationBuilderEClass, AbstractWorkflowConfigurationBuilder.class, "AbstractWorkflowConfigurationBuilder", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DmlsupportPackageImpl
