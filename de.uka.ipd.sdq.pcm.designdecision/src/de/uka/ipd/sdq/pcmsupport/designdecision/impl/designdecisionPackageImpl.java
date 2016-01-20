/**
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorPackage;
import de.uka.ipd.sdq.featuremodel.featuremodelPackage;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.universalDoF.UniversalDoFPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.DSEProblem;
import de.uka.ipd.sdq.pcmsupport.designdecision.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.qualitypropertiesPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.impl.qualitypropertiesPackageImpl;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl.specificPackageImpl;
import de.uka.ipd.sdq.pcmsupport.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcmsupport.resourcerepository.impl.resourcerepositoryPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class designdecisionPackageImpl extends EPackageImpl implements designdecisionPackage {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genomeToCandidateModelTransformationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.pcmsupport.designdecision.designdecisionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private designdecisionPackageImpl() {
		super(eNS_URI, designdecisionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link designdecisionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static designdecisionPackage init() {
		if (isInited)
			return (designdecisionPackage) EPackage.Registry.INSTANCE.getEPackage(designdecisionPackage.eNS_URI);

		// Obtain or create and register package
		designdecisionPackageImpl thedesigndecisionPackage = (designdecisionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof designdecisionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new designdecisionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		costPackage.eINSTANCE.eClass();
		featuremodelPackage.eINSTANCE.eClass();
		GenericdesigndecisionPackage.eINSTANCE.eClass();
		ResultdecoratorPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		qualitypropertiesPackageImpl thequalitypropertiesPackage = (qualitypropertiesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(qualitypropertiesPackage.eNS_URI) instanceof qualitypropertiesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(qualitypropertiesPackage.eNS_URI)
						: qualitypropertiesPackage.eINSTANCE);
		resourcerepositoryPackageImpl theresourcerepositoryPackage = (resourcerepositoryPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI) instanceof resourcerepositoryPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(resourcerepositoryPackage.eNS_URI)
						: resourcerepositoryPackage.eINSTANCE);
		specificPackageImpl thespecificPackage = (specificPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(specificPackage.eNS_URI) instanceof specificPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(specificPackage.eNS_URI) : specificPackage.eINSTANCE);

		// Create package meta-data objects
		thedesigndecisionPackage.createPackageContents();
		thequalitypropertiesPackage.createPackageContents();
		theresourcerepositoryPackage.createPackageContents();
		thespecificPackage.createPackageContents();

		// Initialize created meta-data
		thedesigndecisionPackage.initializePackageContents();
		thequalitypropertiesPackage.initializePackageContents();
		theresourcerepositoryPackage.initializePackageContents();
		thespecificPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedesigndecisionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(designdecisionPackage.eNS_URI, thedesigndecisionPackage);
		return thedesigndecisionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDSEProblem() {
		return dseProblemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetamodelDescription() {
		return metamodelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenomeToCandidateModelTransformation() {
		return genomeToCandidateModelTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public designdecisionFactory getdesigndecisionFactory() {
		return (designdecisionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dseProblemEClass = createEClass(DSE_PROBLEM);

		metamodelDescriptionEClass = createEClass(METAMODEL_DESCRIPTION);

		genomeToCandidateModelTransformationEClass = createEClass(GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		qualitypropertiesPackage thequalitypropertiesPackage = (qualitypropertiesPackage) EPackage.Registry.INSTANCE
				.getEPackage(qualitypropertiesPackage.eNS_URI);
		resourcerepositoryPackage theresourcerepositoryPackage = (resourcerepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(resourcerepositoryPackage.eNS_URI);
		specificPackage thespecificPackage = (specificPackage) EPackage.Registry.INSTANCE
				.getEPackage(specificPackage.eNS_URI);
		GenericdesigndecisionPackage theGenericdesigndecisionPackage = (GenericdesigndecisionPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenericdesigndecisionPackage.eNS_URI);
		UniversalDoFPackage theUniversalDoFPackage = (UniversalDoFPackage) EPackage.Registry.INSTANCE
				.getEPackage(UniversalDoFPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(thequalitypropertiesPackage);
		getESubpackages().add(theresourcerepositoryPackage);
		getESubpackages().add(thespecificPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dseProblemEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getADSEProblem());
		metamodelDescriptionEClass.getESuperTypes().add(theUniversalDoFPackage.getAMetamodelDescription());
		genomeToCandidateModelTransformationEClass.getESuperTypes()
				.add(theGenericdesigndecisionPackage.getAGenomeToCandidateModelTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(dseProblemEClass, DSEProblem.class, "DSEProblem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelDescriptionEClass, MetamodelDescription.class, "MetamodelDescription", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(genomeToCandidateModelTransformationEClass, GenomeToCandidateModelTransformation.class,
				"GenomeToCandidateModelTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} // designdecisionPackageImpl
