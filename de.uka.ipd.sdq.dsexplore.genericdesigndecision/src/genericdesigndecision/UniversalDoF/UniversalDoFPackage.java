/**
 */
package genericdesigndecision.UniversalDoF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see genericdesigndecision.UniversalDoF.UniversalDoFFactory
 * @model kind="package"
 * @generated
 */
public interface UniversalDoFPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UniversalDoF";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/GenericDesignDecision/UniversalDoF/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UniversalDoF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversalDoFPackage eINSTANCE = genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericdesigndecision.UniversalDoF.impl.GenericDoFToDegreeOfFreedomMapImpl <em>Generic Do FTo Degree Of Freedom Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.UniversalDoF.impl.GenericDoFToDegreeOfFreedomMapImpl
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getGenericDoFToDegreeOfFreedomMap()
	 * @generated
	 */
	int GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP__KEY = 1;

	/**
	 * The number of structural features of the '<em>Generic Do FTo Degree Of Freedom Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generic Do FTo Degree Of Freedom Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.UniversalDoF.impl.AMetamodelDescriptionImpl <em>AMetamodel Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.UniversalDoF.impl.AMetamodelDescriptionImpl
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getAMetamodelDescription()
	 * @generated
	 */
	int AMETAMODEL_DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Dofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION__DOFREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Gdof to dof</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION__GDOF_TO_DOF = 1;

	/**
	 * The number of structural features of the '<em>AMetamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Evaluate Metamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Return Corresponding Do F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION___RETURN_CORRESPONDING_DO_F__GENERICDOF = 1;

	/**
	 * The number of operations of the '<em>AMetamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link genericdesigndecision.UniversalDoF.impl.MetamodelDescriptionImpl <em>Metamodel Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.UniversalDoF.impl.MetamodelDescriptionImpl
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getMetamodelDescription()
	 * @generated
	 */
	int METAMODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Dofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__DOFREPOSITORY = AMETAMODEL_DESCRIPTION__DOFREPOSITORY;

	/**
	 * The feature id for the '<em><b>Gdof to dof</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__GDOF_TO_DOF = AMETAMODEL_DESCRIPTION__GDOF_TO_DOF;

	/**
	 * The number of structural features of the '<em>Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION_FEATURE_COUNT = AMETAMODEL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Metamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT;

	/**
	 * The operation id for the '<em>Return Corresponding Do F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION___RETURN_CORRESPONDING_DO_F__GENERICDOF = AMETAMODEL_DESCRIPTION___RETURN_CORRESPONDING_DO_F__GENERICDOF;

	/**
	 * The number of operations of the '<em>Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION_OPERATION_COUNT = AMETAMODEL_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.UniversalDoF.impl.GDoFRepositoryImpl <em>GDo FRepository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.UniversalDoF.impl.GDoFRepositoryImpl
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getGDoFRepository()
	 * @generated
	 */
	int GDO_FREPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Gdofs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY__GDOFS = 0;

	/**
	 * The number of structural features of the '<em>GDo FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>List GDo Fs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY___LIST_GDO_FS = 0;

	/**
	 * The operation id for the '<em>New GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY___NEW_GDO_F__INT = 1;

	/**
	 * The operation id for the '<em>Delete GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY___DELETE_GDO_F__INT = 2;

	/**
	 * The number of operations of the '<em>GDo FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link genericdesigndecision.UniversalDoF.impl.GenericDoFImpl <em>Generic Do F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.UniversalDoF.impl.GenericDoFImpl
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getGenericDoF()
	 * @generated
	 */
	int GENERIC_DO_F = 3;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F__METAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Gdof ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F__GDOF_ID = 1;

	/**
	 * The number of structural features of the '<em>Generic Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generic Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.UniversalDoF.impl.UniversalDoFImpl <em>Universal Do F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFImpl
	 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getUniversalDoF()
	 * @generated
	 */
	int UNIVERSAL_DO_F = 5;

	/**
	 * The feature id for the '<em><b>Gdofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F__GDOFREPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Supported Metamodels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F__SUPPORTED_METAMODELS = 1;

	/**
	 * The feature id for the '<em><b>Prepared Do Fs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F__PREPARED_DO_FS = 2;

	/**
	 * The number of structural features of the '<em>Universal Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Evaluate Metamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___EVALUATE_METAMODEL__EMODELELEMENT = 0;

	/**
	 * The operation id for the '<em>Prepare GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___PREPARE_GDO_F__INT = 1;

	/**
	 * The operation id for the '<em>List GDo Fs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___LIST_GDO_FS = 2;

	/**
	 * The operation id for the '<em>List Prepared Do Fs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___LIST_PREPARED_DO_FS = 3;

	/**
	 * The operation id for the '<em>Remove Prepared Do F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___REMOVE_PREPARED_DO_F__INT = 4;

	/**
	 * The operation id for the '<em>Prepare Do F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___PREPARE_DO_F__INT = 5;

	/**
	 * The operation id for the '<em>New GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___NEW_GDO_F__INT = 6;

	/**
	 * The operation id for the '<em>Delete GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___DELETE_GDO_F__INT = 7;

	/**
	 * The operation id for the '<em>Constrain Do F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___CONSTRAIN_DO_F__INT = 8;

	/**
	 * The number of operations of the '<em>Universal Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F_OPERATION_COUNT = 9;


	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Generic Do FTo Degree Of Freedom Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Do FTo Degree Of Freedom Map</em>'.
	 * @see java.util.Map.Entry
	 * @model features="value key" 
	 *        valueType="genericdesigndecision.GenericDoF.DegreeOfFreedom"
	 *        keyType="genericdesigndecision.UniversalDoF.GenericDoF"
	 * @generated
	 */
	EClass getGenericDoFToDegreeOfFreedomMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getGenericDoFToDegreeOfFreedomMap()
	 * @generated
	 */
	EReference getGenericDoFToDegreeOfFreedomMap_Value();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getGenericDoFToDegreeOfFreedomMap()
	 * @generated
	 */
	EReference getGenericDoFToDegreeOfFreedomMap_Key();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.UniversalDoF.MetamodelDescription <em>Metamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Description</em>'.
	 * @see genericdesigndecision.UniversalDoF.MetamodelDescription
	 * @generated
	 */
	EClass getMetamodelDescription();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.UniversalDoF.GDoFRepository <em>GDo FRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GDo FRepository</em>'.
	 * @see genericdesigndecision.UniversalDoF.GDoFRepository
	 * @generated
	 */
	EClass getGDoFRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.UniversalDoF.GDoFRepository#getGdofs <em>Gdofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gdofs</em>'.
	 * @see genericdesigndecision.UniversalDoF.GDoFRepository#getGdofs()
	 * @see #getGDoFRepository()
	 * @generated
	 */
	EReference getGDoFRepository_Gdofs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.GDoFRepository#listGDoFs() <em>List GDo Fs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List GDo Fs</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.GDoFRepository#listGDoFs()
	 * @generated
	 */
	EOperation getGDoFRepository__ListGDoFs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.GDoFRepository#newGDoF(int) <em>New GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GDo F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.GDoFRepository#newGDoF(int)
	 * @generated
	 */
	EOperation getGDoFRepository__NewGDoF__int();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.GDoFRepository#deleteGDoF(int) <em>Delete GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete GDo F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.GDoFRepository#deleteGDoF(int)
	 * @generated
	 */
	EOperation getGDoFRepository__DeleteGDoF__int();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.UniversalDoF.GenericDoF <em>Generic Do F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Do F</em>'.
	 * @see genericdesigndecision.UniversalDoF.GenericDoF
	 * @generated
	 */
	EClass getGenericDoF();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.UniversalDoF.GenericDoF#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metamodel</em>'.
	 * @see genericdesigndecision.UniversalDoF.GenericDoF#getMetamodel()
	 * @see #getGenericDoF()
	 * @generated
	 */
	EReference getGenericDoF_Metamodel();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.UniversalDoF.GenericDoF#getGdofID <em>Gdof ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gdof ID</em>'.
	 * @see genericdesigndecision.UniversalDoF.GenericDoF#getGdofID()
	 * @see #getGenericDoF()
	 * @generated
	 */
	EAttribute getGenericDoF_GdofID();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.UniversalDoF.AMetamodelDescription <em>AMetamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMetamodel Description</em>'.
	 * @see genericdesigndecision.UniversalDoF.AMetamodelDescription
	 * @generated
	 */
	EClass getAMetamodelDescription();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dofrepository</em>'.
	 * @see genericdesigndecision.UniversalDoF.AMetamodelDescription#getDofrepository()
	 * @see #getAMetamodelDescription()
	 * @generated
	 */
	EReference getAMetamodelDescription_Dofrepository();

	/**
	 * Returns the meta object for the map '{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#getGdof_to_dof <em>Gdof to dof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Gdof to dof</em>'.
	 * @see genericdesigndecision.UniversalDoF.AMetamodelDescription#getGdof_to_dof()
	 * @see #getAMetamodelDescription()
	 * @generated
	 */
	EReference getAMetamodelDescription_Gdof_to_dof();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#evaluateMetamodel(org.eclipse.emf.ecore.EObject) <em>Evaluate Metamodel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate Metamodel</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.AMetamodelDescription#evaluateMetamodel(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAMetamodelDescription__EvaluateMetamodel__EObject();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#returnCorrespondingDoF(genericdesigndecision.UniversalDoF.GenericDoF) <em>Return Corresponding Do F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Return Corresponding Do F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.AMetamodelDescription#returnCorrespondingDoF(genericdesigndecision.UniversalDoF.GenericDoF)
	 * @generated
	 */
	EOperation getAMetamodelDescription__ReturnCorrespondingDoF__GenericDoF();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.UniversalDoF.UniversalDoF <em>Universal Do F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Do F</em>'.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF
	 * @generated
	 */
	EClass getUniversalDoF();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.UniversalDoF.UniversalDoF#getGdofrepository <em>Gdofrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gdofrepository</em>'.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#getGdofrepository()
	 * @see #getUniversalDoF()
	 * @generated
	 */
	EReference getUniversalDoF_Gdofrepository();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.UniversalDoF.UniversalDoF#getSupportedMetamodels <em>Supported Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Metamodels</em>'.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#getSupportedMetamodels()
	 * @see #getUniversalDoF()
	 * @generated
	 */
	EReference getUniversalDoF_SupportedMetamodels();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.UniversalDoF.UniversalDoF#getPreparedDoFs <em>Prepared Do Fs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prepared Do Fs</em>'.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#getPreparedDoFs()
	 * @see #getUniversalDoF()
	 * @generated
	 */
	EReference getUniversalDoF_PreparedDoFs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#evaluateMetamodel(org.eclipse.emf.ecore.EModelElement) <em>Evaluate Metamodel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate Metamodel</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#evaluateMetamodel(org.eclipse.emf.ecore.EModelElement)
	 * @generated
	 */
	EOperation getUniversalDoF__EvaluateMetamodel__EModelElement();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#prepareGDoF(int) <em>Prepare GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare GDo F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#prepareGDoF(int)
	 * @generated
	 */
	EOperation getUniversalDoF__PrepareGDoF__int();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#listGDoFs() <em>List GDo Fs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List GDo Fs</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#listGDoFs()
	 * @generated
	 */
	EOperation getUniversalDoF__ListGDoFs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#listPreparedDoFs() <em>List Prepared Do Fs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List Prepared Do Fs</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#listPreparedDoFs()
	 * @generated
	 */
	EOperation getUniversalDoF__ListPreparedDoFs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#removePreparedDoF(int) <em>Remove Prepared Do F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Prepared Do F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#removePreparedDoF(int)
	 * @generated
	 */
	EOperation getUniversalDoF__RemovePreparedDoF__int();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#prepareDoF(int) <em>Prepare Do F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Prepare Do F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#prepareDoF(int)
	 * @generated
	 */
	EOperation getUniversalDoF__PrepareDoF__int();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#newGDoF(int) <em>New GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GDo F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#newGDoF(int)
	 * @generated
	 */
	EOperation getUniversalDoF__NewGDoF__int();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#deleteGDoF(int) <em>Delete GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete GDo F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#deleteGDoF(int)
	 * @generated
	 */
	EOperation getUniversalDoF__DeleteGDoF__int();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.UniversalDoF.UniversalDoF#constrainDoF(int) <em>Constrain Do F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Constrain Do F</em>' operation.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoF#constrainDoF(int)
	 * @generated
	 */
	EOperation getUniversalDoF__ConstrainDoF__int();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversalDoFFactory getUniversalDoFFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link genericdesigndecision.UniversalDoF.impl.GenericDoFToDegreeOfFreedomMapImpl <em>Generic Do FTo Degree Of Freedom Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.UniversalDoF.impl.GenericDoFToDegreeOfFreedomMapImpl
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getGenericDoFToDegreeOfFreedomMap()
		 * @generated
		 */
		EClass GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP = eINSTANCE.getGenericDoFToDegreeOfFreedomMap();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP__VALUE = eINSTANCE.getGenericDoFToDegreeOfFreedomMap_Value();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_DO_FTO_DEGREE_OF_FREEDOM_MAP__KEY = eINSTANCE.getGenericDoFToDegreeOfFreedomMap_Key();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.UniversalDoF.impl.MetamodelDescriptionImpl <em>Metamodel Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.UniversalDoF.impl.MetamodelDescriptionImpl
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getMetamodelDescription()
		 * @generated
		 */
		EClass METAMODEL_DESCRIPTION = eINSTANCE.getMetamodelDescription();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.UniversalDoF.impl.GDoFRepositoryImpl <em>GDo FRepository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.UniversalDoF.impl.GDoFRepositoryImpl
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getGDoFRepository()
		 * @generated
		 */
		EClass GDO_FREPOSITORY = eINSTANCE.getGDoFRepository();

		/**
		 * The meta object literal for the '<em><b>Gdofs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GDO_FREPOSITORY__GDOFS = eINSTANCE.getGDoFRepository_Gdofs();

		/**
		 * The meta object literal for the '<em><b>List GDo Fs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GDO_FREPOSITORY___LIST_GDO_FS = eINSTANCE.getGDoFRepository__ListGDoFs();

		/**
		 * The meta object literal for the '<em><b>New GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GDO_FREPOSITORY___NEW_GDO_F__INT = eINSTANCE.getGDoFRepository__NewGDoF__int();

		/**
		 * The meta object literal for the '<em><b>Delete GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GDO_FREPOSITORY___DELETE_GDO_F__INT = eINSTANCE.getGDoFRepository__DeleteGDoF__int();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.UniversalDoF.impl.GenericDoFImpl <em>Generic Do F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.UniversalDoF.impl.GenericDoFImpl
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getGenericDoF()
		 * @generated
		 */
		EClass GENERIC_DO_F = eINSTANCE.getGenericDoF();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_DO_F__METAMODEL = eINSTANCE.getGenericDoF_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Gdof ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DO_F__GDOF_ID = eINSTANCE.getGenericDoF_GdofID();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.UniversalDoF.impl.AMetamodelDescriptionImpl <em>AMetamodel Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.UniversalDoF.impl.AMetamodelDescriptionImpl
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getAMetamodelDescription()
		 * @generated
		 */
		EClass AMETAMODEL_DESCRIPTION = eINSTANCE.getAMetamodelDescription();

		/**
		 * The meta object literal for the '<em><b>Dofrepository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMETAMODEL_DESCRIPTION__DOFREPOSITORY = eINSTANCE.getAMetamodelDescription_Dofrepository();

		/**
		 * The meta object literal for the '<em><b>Gdof to dof</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMETAMODEL_DESCRIPTION__GDOF_TO_DOF = eINSTANCE.getAMetamodelDescription_Gdof_to_dof();

		/**
		 * The meta object literal for the '<em><b>Evaluate Metamodel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = eINSTANCE.getAMetamodelDescription__EvaluateMetamodel__EObject();

		/**
		 * The meta object literal for the '<em><b>Return Corresponding Do F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMETAMODEL_DESCRIPTION___RETURN_CORRESPONDING_DO_F__GENERICDOF = eINSTANCE.getAMetamodelDescription__ReturnCorrespondingDoF__GenericDoF();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.UniversalDoF.impl.UniversalDoFImpl <em>Universal Do F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFImpl
		 * @see genericdesigndecision.UniversalDoF.impl.UniversalDoFPackageImpl#getUniversalDoF()
		 * @generated
		 */
		EClass UNIVERSAL_DO_F = eINSTANCE.getUniversalDoF();

		/**
		 * The meta object literal for the '<em><b>Gdofrepository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSAL_DO_F__GDOFREPOSITORY = eINSTANCE.getUniversalDoF_Gdofrepository();

		/**
		 * The meta object literal for the '<em><b>Supported Metamodels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSAL_DO_F__SUPPORTED_METAMODELS = eINSTANCE.getUniversalDoF_SupportedMetamodels();

		/**
		 * The meta object literal for the '<em><b>Prepared Do Fs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSAL_DO_F__PREPARED_DO_FS = eINSTANCE.getUniversalDoF_PreparedDoFs();

		/**
		 * The meta object literal for the '<em><b>Evaluate Metamodel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___EVALUATE_METAMODEL__EMODELELEMENT = eINSTANCE.getUniversalDoF__EvaluateMetamodel__EModelElement();

		/**
		 * The meta object literal for the '<em><b>Prepare GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___PREPARE_GDO_F__INT = eINSTANCE.getUniversalDoF__PrepareGDoF__int();

		/**
		 * The meta object literal for the '<em><b>List GDo Fs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___LIST_GDO_FS = eINSTANCE.getUniversalDoF__ListGDoFs();

		/**
		 * The meta object literal for the '<em><b>List Prepared Do Fs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___LIST_PREPARED_DO_FS = eINSTANCE.getUniversalDoF__ListPreparedDoFs();

		/**
		 * The meta object literal for the '<em><b>Remove Prepared Do F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___REMOVE_PREPARED_DO_F__INT = eINSTANCE.getUniversalDoF__RemovePreparedDoF__int();

		/**
		 * The meta object literal for the '<em><b>Prepare Do F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___PREPARE_DO_F__INT = eINSTANCE.getUniversalDoF__PrepareDoF__int();

		/**
		 * The meta object literal for the '<em><b>New GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___NEW_GDO_F__INT = eINSTANCE.getUniversalDoF__NewGDoF__int();

		/**
		 * The meta object literal for the '<em><b>Delete GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___DELETE_GDO_F__INT = eINSTANCE.getUniversalDoF__DeleteGDoF__int();

		/**
		 * The meta object literal for the '<em><b>Constrain Do F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___CONSTRAIN_DO_F__INT = eINSTANCE.getUniversalDoF__ConstrainDoF__int();

	}

} //UniversalDoFPackage
