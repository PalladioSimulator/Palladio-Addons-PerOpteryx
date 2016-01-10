/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.GenericdesigndecisionPackage;

import genericdesigndecision.genericDoF.GenericDoFPackage;

import genericdesigndecision.genericDoF.impl.GenericDoFPackageImpl;

import genericdesigndecision.impl.GenericdesigndecisionPackageImpl;
import genericdesigndecision.qualityproperties.QualitypropertiesPackage;

import genericdesigndecision.qualityproperties.impl.QualitypropertiesPackageImpl;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GDoFRepository;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoF;
import genericdesigndecision.universalDoF.UniversalDoFFactory;
import genericdesigndecision.universalDoF.UniversalDoFPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversalDoFPackageImpl extends EPackageImpl implements UniversalDoFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gDoFRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDoFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aMetamodelDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalDoFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metamodelEEnum = null;

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
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniversalDoFPackageImpl() {
		super(eNS_URI, UniversalDoFFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UniversalDoFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UniversalDoFPackage init() {
		if (isInited) return (UniversalDoFPackage)EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI);

		// Obtain or create and register package
		UniversalDoFPackageImpl theUniversalDoFPackage = (UniversalDoFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UniversalDoFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UniversalDoFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenericdesigndecisionPackageImpl theGenericdesigndecisionPackage = (GenericdesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI) instanceof GenericdesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI) : GenericdesigndecisionPackage.eINSTANCE);
		GenericDoFPackageImpl theGenericDoFPackage = (GenericDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) instanceof GenericDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) : GenericDoFPackage.eINSTANCE);
		QualitypropertiesPackageImpl theQualitypropertiesPackage = (QualitypropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) instanceof QualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) : QualitypropertiesPackage.eINSTANCE);

		// Create package meta-data objects
		theUniversalDoFPackage.createPackageContents();
		theGenericdesigndecisionPackage.createPackageContents();
		theGenericDoFPackage.createPackageContents();
		theQualitypropertiesPackage.createPackageContents();

		// Initialize created meta-data
		theUniversalDoFPackage.initializePackageContents();
		theGenericdesigndecisionPackage.initializePackageContents();
		theGenericDoFPackage.initializePackageContents();
		theQualitypropertiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUniversalDoFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UniversalDoFPackage.eNS_URI, theUniversalDoFPackage);
		return theUniversalDoFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGDoFRepository() {
		return gDoFRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGDoFRepository_Gdofs() {
		return (EReference)gDoFRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGDoFRepository__AddGDoF__String() {
		return gDoFRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGDoFRepository__DeleteGDoF__GenericDoF() {
		return gDoFRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGDoFRepository__GetGDoF__String() {
		return gDoFRepositoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericDoF() {
		return genericDoFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDoF_Name() {
		return (EAttribute)genericDoFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMetamodelDescription() {
		return aMetamodelDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMetamodelDescription_Dofrepository() {
		return (EReference)aMetamodelDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAMetamodelDescription_Name() {
		return (EAttribute)aMetamodelDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMetamodelDescription_GenomeToCandidateTransformation() {
		return (EReference)aMetamodelDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAMetamodelDescription__EvaluateMetamodel__EObject() {
		return aMetamodelDescriptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversalDoF() {
		return universalDoFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversalDoF_Gdofrepository() {
		return (EReference)universalDoFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversalDoF_SupportedMetamodels() {
		return (EReference)universalDoFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversalDoF_PreparedDoFs() {
		return (EReference)universalDoFEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversalDoF_Target() {
		return (EReference)universalDoFEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__EvaluateMetamodel__EObject() {
		return universalDoFEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__ListGDoFs() {
		return universalDoFEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__NewGDoF__String() {
		return universalDoFEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__DeleteGDoF__GenericDoF() {
		return universalDoFEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__GetGDoF__String() {
		return universalDoFEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetamodel() {
		return metamodelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDoFFactory getUniversalDoFFactory() {
		return (UniversalDoFFactory)getEFactoryInstance();
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
		gDoFRepositoryEClass = createEClass(GDO_FREPOSITORY);
		createEReference(gDoFRepositoryEClass, GDO_FREPOSITORY__GDOFS);
		createEOperation(gDoFRepositoryEClass, GDO_FREPOSITORY___ADD_GDO_F__STRING);
		createEOperation(gDoFRepositoryEClass, GDO_FREPOSITORY___DELETE_GDO_F__GENERICDOF);
		createEOperation(gDoFRepositoryEClass, GDO_FREPOSITORY___GET_GDO_F__STRING);

		genericDoFEClass = createEClass(GENERIC_DO_F);
		createEAttribute(genericDoFEClass, GENERIC_DO_F__NAME);

		aMetamodelDescriptionEClass = createEClass(AMETAMODEL_DESCRIPTION);
		createEReference(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION__DOFREPOSITORY);
		createEAttribute(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION__NAME);
		createEReference(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION);
		createEOperation(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT);

		universalDoFEClass = createEClass(UNIVERSAL_DO_F);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__GDOFREPOSITORY);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__SUPPORTED_METAMODELS);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__PREPARED_DO_FS);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__TARGET);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___EVALUATE_METAMODEL__EOBJECT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___LIST_GDO_FS);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___NEW_GDO_F__STRING);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___DELETE_GDO_F__GENERICDOF);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___GET_GDO_F__STRING);

		// Create enums
		metamodelEEnum = createEEnum(METAMODEL);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		GenericdesigndecisionPackage theGenericdesigndecisionPackage = (GenericdesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI);
		GenericDoFPackage theGenericDoFPackage = (GenericDoFPackage)EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aMetamodelDescriptionEClass.getESuperTypes().add(theGenericdesigndecisionPackage.getAGenomeToCandidateModelTransformation());

		// Initialize classes, features, and operations; add parameters
		initEClass(gDoFRepositoryEClass, GDoFRepository.class, "GDoFRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGDoFRepository_Gdofs(), this.getGenericDoF(), null, "gdofs", null, 0, -1, GDoFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGDoFRepository__AddGDoF__String(), ecorePackage.getEBoolean(), "addGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "gdofName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGDoFRepository__DeleteGDoF__GenericDoF(), ecorePackage.getEBoolean(), "deleteGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenericDoF(), "gdof", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGDoFRepository__GetGDoF__String(), this.getGenericDoF(), "getGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "gdofName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genericDoFEClass, GenericDoF.class, "GenericDoF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericDoF_Name(), ecorePackage.getEString(), "name", null, 0, 1, GenericDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aMetamodelDescriptionEClass, AMetamodelDescription.class, "AMetamodelDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAMetamodelDescription_Dofrepository(), theGenericDoFPackage.getDoFRepository(), null, "dofrepository", null, 0, 1, AMetamodelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAMetamodelDescription_Name(), this.getMetamodel(), "name", null, 0, 1, AMetamodelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMetamodelDescription_GenomeToCandidateTransformation(), theGenericdesigndecisionPackage.getGenomeToCandidateModelTransformation(), null, "genomeToCandidateTransformation", null, 1, 1, AMetamodelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAMetamodelDescription__EvaluateMetamodel__EObject(), this.getMetamodel(), "evaluateMetamodel", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(universalDoFEClass, UniversalDoF.class, "UniversalDoF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversalDoF_Gdofrepository(), this.getGDoFRepository(), null, "gdofrepository", null, 1, 1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalDoF_SupportedMetamodels(), this.getAMetamodelDescription(), null, "supportedMetamodels", null, 0, -1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalDoF_PreparedDoFs(), theGenericDoFPackage.getADegreeOfFreedom(), null, "preparedDoFs", null, 0, 1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalDoF_Target(), theGenericdesigndecisionPackage.getADSEProblem(), null, "target", null, 1, 1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUniversalDoF__EvaluateMetamodel__EObject(), this.getMetamodel(), "evaluateMetamodel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUniversalDoF__ListGDoFs(), this.getGenericDoF(), "listGDoFs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__NewGDoF__String(), ecorePackage.getEBoolean(), "newGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "gdofName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__DeleteGDoF__GenericDoF(), ecorePackage.getEBoolean(), "deleteGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenericDoF(), "gdof", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__GetGDoF__String(), this.getGenericDoF(), "getGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "gdofName", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(metamodelEEnum, Metamodel.class, "Metamodel");
		addEEnumLiteral(metamodelEEnum, Metamodel.PCM);
	}

} //UniversalDoFPackageImpl
