/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.impl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.GenericDoFPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.impl.GenericDoFPackageImpl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.AMetamodelDescription;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.GDoFRepository;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.GenericDoF;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.MetamodelDescription;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoF;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFFactory;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.QualitypropertiesPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.qualityproperties.impl.QualitypropertiesPackageImpl;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecisionPackage;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl.genericdesigndecisionPackageImpl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass genericDoFToDegreeOfFreedomMapEClass = null;

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
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#eNS_URI
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
		genericdesigndecisionPackageImpl thegenericdesigndecisionPackage = (genericdesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(genericdesigndecisionPackage.eNS_URI) instanceof genericdesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(genericdesigndecisionPackage.eNS_URI) : genericdesigndecisionPackage.eINSTANCE);
		GenericDoFPackageImpl theGenericDoFPackage = (GenericDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) instanceof GenericDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI) : GenericDoFPackage.eINSTANCE);
		QualitypropertiesPackageImpl theQualitypropertiesPackage = (QualitypropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) instanceof QualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) : QualitypropertiesPackage.eINSTANCE);

		// Create package meta-data objects
		theUniversalDoFPackage.createPackageContents();
		thegenericdesigndecisionPackage.createPackageContents();
		theGenericDoFPackage.createPackageContents();
		theQualitypropertiesPackage.createPackageContents();

		// Initialize created meta-data
		theUniversalDoFPackage.initializePackageContents();
		thegenericdesigndecisionPackage.initializePackageContents();
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
	public EClass getGenericDoFToDegreeOfFreedomMap() {
		return genericDoFToDegreeOfFreedomMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDoFToDegreeOfFreedomMap_Value() {
		return (EReference)genericDoFToDegreeOfFreedomMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericDoFToDegreeOfFreedomMap_Key() {
		return (EReference)genericDoFToDegreeOfFreedomMapEClass.getEStructuralFeatures().get(1);
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
	public EOperation getGDoFRepository__ListGDoFs() {
		return gDoFRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGDoFRepository__NewGDoF__int() {
		return gDoFRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGDoFRepository__DeleteGDoF__int() {
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
	public EReference getGenericDoF_Metamodel() {
		return (EReference)genericDoFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericDoF_GdofID() {
		return (EAttribute)genericDoFEClass.getEStructuralFeatures().get(1);
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
	public EReference getAMetamodelDescription_Gdof_to_dof() {
		return (EReference)aMetamodelDescriptionEClass.getEStructuralFeatures().get(1);
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
	public EOperation getAMetamodelDescription__ReturnCorrespondingDoF__GenericDoF() {
		return aMetamodelDescriptionEClass.getEOperations().get(1);
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
	public EOperation getUniversalDoF__EvaluateMetamodel__EObject() {
		return universalDoFEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__PrepareGDoF__int() {
		return universalDoFEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__ListGDoFs() {
		return universalDoFEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__ListPreparedDoFs() {
		return universalDoFEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__RemovePreparedDoF__int() {
		return universalDoFEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__PrepareDoF__int() {
		return universalDoFEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__NewGDoF__int() {
		return universalDoFEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__DeleteGDoF__int() {
		return universalDoFEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUniversalDoF__ConstrainDoF__int() {
		return universalDoFEClass.getEOperations().get(8);
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
		genericDoFToDegreeOfFreedomMapEClass = createEClass(GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP);
		createEReference(genericDoFToDegreeOfFreedomMapEClass, GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP__VALUE);
		createEReference(genericDoFToDegreeOfFreedomMapEClass, GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP__KEY);

		metamodelDescriptionEClass = createEClass(METAMODEL_DESCRIPTION);

		gDoFRepositoryEClass = createEClass(GDO_FREPOSITORY);
		createEReference(gDoFRepositoryEClass, GDO_FREPOSITORY__GDOFS);
		createEOperation(gDoFRepositoryEClass, GDO_FREPOSITORY___LIST_GDO_FS);
		createEOperation(gDoFRepositoryEClass, GDO_FREPOSITORY___NEW_GDO_F__INT);
		createEOperation(gDoFRepositoryEClass, GDO_FREPOSITORY___DELETE_GDO_F__INT);

		genericDoFEClass = createEClass(GENERIC_DO_F);
		createEReference(genericDoFEClass, GENERIC_DO_F__METAMODEL);
		createEAttribute(genericDoFEClass, GENERIC_DO_F__GDOF_ID);

		aMetamodelDescriptionEClass = createEClass(AMETAMODEL_DESCRIPTION);
		createEReference(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION__DOFREPOSITORY);
		createEReference(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION__GDOF_TO_DOF);
		createEOperation(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT);
		createEOperation(aMetamodelDescriptionEClass, AMETAMODEL_DESCRIPTION___RETURN_CORRESPONDING_DO_F__GENERICDOF);

		universalDoFEClass = createEClass(UNIVERSAL_DO_F);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__GDOFREPOSITORY);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__SUPPORTED_METAMODELS);
		createEReference(universalDoFEClass, UNIVERSAL_DO_F__PREPARED_DO_FS);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___EVALUATE_METAMODEL__EOBJECT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___PREPARE_GDO_F__INT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___LIST_GDO_FS);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___LIST_PREPARED_DO_FS);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___REMOVE_PREPARED_DO_F__INT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___PREPARE_DO_F__INT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___NEW_GDO_F__INT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___DELETE_GDO_F__INT);
		createEOperation(universalDoFEClass, UNIVERSAL_DO_F___CONSTRAIN_DO_F__INT);
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
		GenericDoFPackage theGenericDoFPackage = (GenericDoFPackage)EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		metamodelDescriptionEClass.getESuperTypes().add(this.getAMetamodelDescription());

		// Initialize classes, features, and operations; add parameters
		initEClass(genericDoFToDegreeOfFreedomMapEClass, Map.Entry.class, "GenericDoFToDegreeOfFreedomMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericDoFToDegreeOfFreedomMap_Value(), theGenericDoFPackage.getDegreeOfFreedom(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericDoFToDegreeOfFreedomMap_Key(), this.getGenericDoF(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metamodelDescriptionEClass, MetamodelDescription.class, "MetamodelDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gDoFRepositoryEClass, GDoFRepository.class, "GDoFRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGDoFRepository_Gdofs(), this.getGenericDoF(), null, "gdofs", null, 0, -1, GDoFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGDoFRepository__ListGDoFs(), this.getGenericDoF(), "listGDoFs", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getGDoFRepository__NewGDoF__int(), theEcorePackage.getEInt(), "newGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "gdofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGDoFRepository__DeleteGDoF__int(), theEcorePackage.getEBoolean(), "deleteGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "gdofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(genericDoFEClass, GenericDoF.class, "GenericDoF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericDoF_Metamodel(), this.getMetamodelDescription(), null, "metamodel", null, 0, 1, GenericDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericDoF_GdofID(), theEcorePackage.getEInt(), "gdofID", null, 0, 1, GenericDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aMetamodelDescriptionEClass, AMetamodelDescription.class, "AMetamodelDescription", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAMetamodelDescription_Dofrepository(), theGenericDoFPackage.getDoFRepository(), null, "dofrepository", null, 0, 1, AMetamodelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAMetamodelDescription_Gdof_to_dof(), this.getGenericDoFToDegreeOfFreedomMap(), null, "gdof_to_dof", null, 1, -1, AMetamodelDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAMetamodelDescription__EvaluateMetamodel__EObject(), this.getMetamodelDescription(), "evaluateMetamodel", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAMetamodelDescription__ReturnCorrespondingDoF__GenericDoF(), theGenericDoFPackage.getDegreeOfFreedom(), "returnCorrespondingDoF", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGenericDoF(), "gdof", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(universalDoFEClass, UniversalDoF.class, "UniversalDoF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversalDoF_Gdofrepository(), this.getGDoFRepository(), null, "gdofrepository", null, 1, 1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalDoF_SupportedMetamodels(), this.getMetamodelDescription(), null, "supportedMetamodels", null, 0, -1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversalDoF_PreparedDoFs(), theGenericDoFPackage.getDegreeOfFreedom(), null, "preparedDoFs", null, 0, 1, UniversalDoF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUniversalDoF__EvaluateMetamodel__EObject(), this.getMetamodelDescription(), "evaluateMetamodel", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEObject(), "model", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__PrepareGDoF__int(), theEcorePackage.getEInt(), "prepareGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "gdofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUniversalDoF__ListGDoFs(), this.getGenericDoF(), "listGDoFs", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUniversalDoF__ListPreparedDoFs(), theGenericDoFPackage.getDegreeOfFreedom(), "listPreparedDoFs", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__RemovePreparedDoF__int(), theEcorePackage.getEBoolean(), "removePreparedDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "dofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__PrepareDoF__int(), theEcorePackage.getEInt(), "prepareDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "dofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__NewGDoF__int(), theEcorePackage.getEInt(), "newGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "gdofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__DeleteGDoF__int(), theEcorePackage.getEBoolean(), "deleteGDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "gdofID", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUniversalDoF__ConstrainDoF__int(), theEcorePackage.getEBoolean(), "constrainDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "dofID", 0, 1, IS_UNIQUE, IS_ORDERED);
	}

} //UniversalDoFPackageImpl
