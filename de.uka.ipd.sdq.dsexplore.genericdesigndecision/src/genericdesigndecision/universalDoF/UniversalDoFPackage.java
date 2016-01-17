/**
 */
package genericdesigndecision.universalDoF;

import genericdesigndecision.GenericdesigndecisionPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see genericdesigndecision.universalDoF.UniversalDoFFactory
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
	String eNAME = "universalDoF";

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
	String eNS_PREFIX = "universalDoF";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversalDoFPackage eINSTANCE = genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericdesigndecision.universalDoF.impl.GDoFRepositoryImpl <em>GDo FRepository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.universalDoF.impl.GDoFRepositoryImpl
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getGDoFRepository()
	 * @generated
	 */
	int GDO_FREPOSITORY = 0;

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
	 * The operation id for the '<em>New GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY___NEW_GDO_F__STRING = 0;

	/**
	 * The operation id for the '<em>Delete GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY___DELETE_GDO_F__GENERICDOF = 1;

	/**
	 * The operation id for the '<em>Get GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY___GET_GDO_F__STRING = 2;

	/**
	 * The number of operations of the '<em>GDo FRepository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GDO_FREPOSITORY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl <em>AMetamodel Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getAMetamodelDescription()
	 * @generated
	 */
	int AMETAMODEL_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Dofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION__DOFREPOSITORY = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION__NAME = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Genome To Candidate Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AMetamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION_FEATURE_COUNT = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Evaluate Metamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete SDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION___DELETE_SDO_F__SPECIFICDOF = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>List SDo Fs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION___LIST_SDO_FS = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get SDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION___GET_SDO_F__STRING = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>AMetamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETAMODEL_DESCRIPTION_OPERATION_COUNT = GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link genericdesigndecision.universalDoF.impl.UniversalDoFImpl <em>Universal Do F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFImpl
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getUniversalDoF()
	 * @generated
	 */
	int UNIVERSAL_DO_F = 2;

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
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F__TARGET = 2;

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
	int UNIVERSAL_DO_F___EVALUATE_METAMODEL__EOBJECT = 0;

	/**
	 * The operation id for the '<em>New GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___NEW_GDO_F__STRING = 1;

	/**
	 * The operation id for the '<em>Delete GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___DELETE_GDO_F__GENERICDOF = 2;

	/**
	 * The operation id for the '<em>List GDo Fs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___LIST_GDO_FS = 3;

	/**
	 * The operation id for the '<em>Get GDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F___GET_GDO_F__STRING = 4;

	/**
	 * The number of operations of the '<em>Universal Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSAL_DO_F_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link genericdesigndecision.universalDoF.impl.GenericDoFImpl <em>Generic Do F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.universalDoF.impl.GenericDoFImpl
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getGenericDoF()
	 * @generated
	 */
	int GENERIC_DO_F = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F__NAME = 0;

	/**
	 * The number of structural features of the '<em>Generic Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F___EQUALS__GENERICDOF = 0;

	/**
	 * The number of operations of the '<em>Generic Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DO_F_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.universalDoF.impl.SpecificDoFImpl <em>Specific Do F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.universalDoF.impl.SpecificDoFImpl
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getSpecificDoF()
	 * @generated
	 */
	int SPECIFIC_DO_F = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DO_F__NAME = 0;

	/**
	 * The number of structural features of the '<em>Specific Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DO_F_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DO_F___EQUALS__SPECIFICDOF = 0;

	/**
	 * The number of operations of the '<em>Specific Do F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DO_F_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link genericdesigndecision.universalDoF.Metamodel <em>Metamodel</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.universalDoF.Metamodel
	 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 5;


	/**
	 * Returns the meta object for class '{@link genericdesigndecision.universalDoF.GDoFRepository <em>GDo FRepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GDo FRepository</em>'.
	 * @see genericdesigndecision.universalDoF.GDoFRepository
	 * @generated
	 */
	EClass getGDoFRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link genericdesigndecision.universalDoF.GDoFRepository#getGdofs <em>Gdofs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gdofs</em>'.
	 * @see genericdesigndecision.universalDoF.GDoFRepository#getGdofs()
	 * @see #getGDoFRepository()
	 * @generated
	 */
	EReference getGDoFRepository_Gdofs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.GDoFRepository#newGDoF(java.lang.String) <em>New GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.GDoFRepository#newGDoF(java.lang.String)
	 * @generated
	 */
	EOperation getGDoFRepository__NewGDoF__String();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.GDoFRepository#deleteGDoF(genericdesigndecision.universalDoF.GenericDoF) <em>Delete GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete GDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.GDoFRepository#deleteGDoF(genericdesigndecision.universalDoF.GenericDoF)
	 * @generated
	 */
	EOperation getGDoFRepository__DeleteGDoF__GenericDoF();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.GDoFRepository#getGDoF(java.lang.String) <em>Get GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.GDoFRepository#getGDoF(java.lang.String)
	 * @generated
	 */
	EOperation getGDoFRepository__GetGDoF__String();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.universalDoF.AMetamodelDescription <em>AMetamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMetamodel Description</em>'.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription
	 * @generated
	 */
	EClass getAMetamodelDescription();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.universalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dofrepository</em>'.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#getDofrepository()
	 * @see #getAMetamodelDescription()
	 * @generated
	 */
	EReference getAMetamodelDescription_Dofrepository();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.universalDoF.AMetamodelDescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#getName()
	 * @see #getAMetamodelDescription()
	 * @generated
	 */
	EAttribute getAMetamodelDescription_Name();

	/**
	 * Returns the meta object for the containment reference '{@link genericdesigndecision.universalDoF.AMetamodelDescription#getGenomeToCandidateTransformation <em>Genome To Candidate Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Genome To Candidate Transformation</em>'.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#getGenomeToCandidateTransformation()
	 * @see #getAMetamodelDescription()
	 * @generated
	 */
	EReference getAMetamodelDescription_GenomeToCandidateTransformation();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.AMetamodelDescription#evaluateMetamodel(org.eclipse.emf.ecore.EObject) <em>Evaluate Metamodel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate Metamodel</em>' operation.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#evaluateMetamodel(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getAMetamodelDescription__EvaluateMetamodel__EObject();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.AMetamodelDescription#deleteSDoF(genericdesigndecision.universalDoF.SpecificDoF) <em>Delete SDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete SDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#deleteSDoF(genericdesigndecision.universalDoF.SpecificDoF)
	 * @generated
	 */
	EOperation getAMetamodelDescription__DeleteSDoF__SpecificDoF();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.AMetamodelDescription#listSDoFs() <em>List SDo Fs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List SDo Fs</em>' operation.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#listSDoFs()
	 * @generated
	 */
	EOperation getAMetamodelDescription__ListSDoFs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.AMetamodelDescription#getSDoF(java.lang.String) <em>Get SDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get SDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.AMetamodelDescription#getSDoF(java.lang.String)
	 * @generated
	 */
	EOperation getAMetamodelDescription__GetSDoF__String();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.universalDoF.UniversalDoF <em>Universal Do F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universal Do F</em>'.
	 * @see genericdesigndecision.universalDoF.UniversalDoF
	 * @generated
	 */
	EClass getUniversalDoF();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.universalDoF.UniversalDoF#getGdofrepository <em>Gdofrepository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gdofrepository</em>'.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#getGdofrepository()
	 * @see #getUniversalDoF()
	 * @generated
	 */
	EReference getUniversalDoF_Gdofrepository();

	/**
	 * Returns the meta object for the reference list '{@link genericdesigndecision.universalDoF.UniversalDoF#getSupportedMetamodels <em>Supported Metamodels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported Metamodels</em>'.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#getSupportedMetamodels()
	 * @see #getUniversalDoF()
	 * @generated
	 */
	EReference getUniversalDoF_SupportedMetamodels();

	/**
	 * Returns the meta object for the reference '{@link genericdesigndecision.universalDoF.UniversalDoF#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#getTarget()
	 * @see #getUniversalDoF()
	 * @generated
	 */
	EReference getUniversalDoF_Target();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.UniversalDoF#evaluateMetamodel(org.eclipse.emf.ecore.EObject) <em>Evaluate Metamodel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Evaluate Metamodel</em>' operation.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#evaluateMetamodel(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getUniversalDoF__EvaluateMetamodel__EObject();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.UniversalDoF#newGDoF(java.lang.String) <em>New GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>New GDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#newGDoF(java.lang.String)
	 * @generated
	 */
	EOperation getUniversalDoF__NewGDoF__String();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.UniversalDoF#deleteGDoF(genericdesigndecision.universalDoF.GenericDoF) <em>Delete GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete GDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#deleteGDoF(genericdesigndecision.universalDoF.GenericDoF)
	 * @generated
	 */
	EOperation getUniversalDoF__DeleteGDoF__GenericDoF();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.UniversalDoF#listGDoFs() <em>List GDo Fs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>List GDo Fs</em>' operation.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#listGDoFs()
	 * @generated
	 */
	EOperation getUniversalDoF__ListGDoFs();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.UniversalDoF#getGDoF(java.lang.String) <em>Get GDo F</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get GDo F</em>' operation.
	 * @see genericdesigndecision.universalDoF.UniversalDoF#getGDoF(java.lang.String)
	 * @generated
	 */
	EOperation getUniversalDoF__GetGDoF__String();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.universalDoF.GenericDoF <em>Generic Do F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Do F</em>'.
	 * @see genericdesigndecision.universalDoF.GenericDoF
	 * @generated
	 */
	EClass getGenericDoF();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.universalDoF.GenericDoF#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericdesigndecision.universalDoF.GenericDoF#getName()
	 * @see #getGenericDoF()
	 * @generated
	 */
	EAttribute getGenericDoF_Name();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.GenericDoF#equals(genericdesigndecision.universalDoF.GenericDoF) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see genericdesigndecision.universalDoF.GenericDoF#equals(genericdesigndecision.universalDoF.GenericDoF)
	 * @generated
	 */
	EOperation getGenericDoF__Equals__GenericDoF();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.universalDoF.SpecificDoF <em>Specific Do F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Do F</em>'.
	 * @see genericdesigndecision.universalDoF.SpecificDoF
	 * @generated
	 */
	EClass getSpecificDoF();

	/**
	 * Returns the meta object for the attribute '{@link genericdesigndecision.universalDoF.SpecificDoF#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see genericdesigndecision.universalDoF.SpecificDoF#getName()
	 * @see #getSpecificDoF()
	 * @generated
	 */
	EAttribute getSpecificDoF_Name();

	/**
	 * Returns the meta object for the '{@link genericdesigndecision.universalDoF.SpecificDoF#equals(genericdesigndecision.universalDoF.SpecificDoF) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see genericdesigndecision.universalDoF.SpecificDoF#equals(genericdesigndecision.universalDoF.SpecificDoF)
	 * @generated
	 */
	EOperation getSpecificDoF__Equals__SpecificDoF();

	/**
	 * Returns the meta object for enum '{@link genericdesigndecision.universalDoF.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metamodel</em>'.
	 * @see genericdesigndecision.universalDoF.Metamodel
	 * @generated
	 */
	EEnum getMetamodel();

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
		 * The meta object literal for the '{@link genericdesigndecision.universalDoF.impl.GDoFRepositoryImpl <em>GDo FRepository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.universalDoF.impl.GDoFRepositoryImpl
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getGDoFRepository()
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
		 * The meta object literal for the '<em><b>New GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GDO_FREPOSITORY___NEW_GDO_F__STRING = eINSTANCE.getGDoFRepository__NewGDoF__String();

		/**
		 * The meta object literal for the '<em><b>Delete GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GDO_FREPOSITORY___DELETE_GDO_F__GENERICDOF = eINSTANCE.getGDoFRepository__DeleteGDoF__GenericDoF();

		/**
		 * The meta object literal for the '<em><b>Get GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GDO_FREPOSITORY___GET_GDO_F__STRING = eINSTANCE.getGDoFRepository__GetGDoF__String();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl <em>AMetamodel Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getAMetamodelDescription()
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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AMETAMODEL_DESCRIPTION__NAME = eINSTANCE.getAMetamodelDescription_Name();

		/**
		 * The meta object literal for the '<em><b>Genome To Candidate Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION = eINSTANCE.getAMetamodelDescription_GenomeToCandidateTransformation();

		/**
		 * The meta object literal for the '<em><b>Evaluate Metamodel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = eINSTANCE.getAMetamodelDescription__EvaluateMetamodel__EObject();

		/**
		 * The meta object literal for the '<em><b>Delete SDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMETAMODEL_DESCRIPTION___DELETE_SDO_F__SPECIFICDOF = eINSTANCE.getAMetamodelDescription__DeleteSDoF__SpecificDoF();

		/**
		 * The meta object literal for the '<em><b>List SDo Fs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMETAMODEL_DESCRIPTION___LIST_SDO_FS = eINSTANCE.getAMetamodelDescription__ListSDoFs();

		/**
		 * The meta object literal for the '<em><b>Get SDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AMETAMODEL_DESCRIPTION___GET_SDO_F__STRING = eINSTANCE.getAMetamodelDescription__GetSDoF__String();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.universalDoF.impl.UniversalDoFImpl <em>Universal Do F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFImpl
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getUniversalDoF()
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
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSAL_DO_F__TARGET = eINSTANCE.getUniversalDoF_Target();

		/**
		 * The meta object literal for the '<em><b>Evaluate Metamodel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___EVALUATE_METAMODEL__EOBJECT = eINSTANCE.getUniversalDoF__EvaluateMetamodel__EObject();

		/**
		 * The meta object literal for the '<em><b>New GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___NEW_GDO_F__STRING = eINSTANCE.getUniversalDoF__NewGDoF__String();

		/**
		 * The meta object literal for the '<em><b>Delete GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___DELETE_GDO_F__GENERICDOF = eINSTANCE.getUniversalDoF__DeleteGDoF__GenericDoF();

		/**
		 * The meta object literal for the '<em><b>List GDo Fs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___LIST_GDO_FS = eINSTANCE.getUniversalDoF__ListGDoFs();

		/**
		 * The meta object literal for the '<em><b>Get GDo F</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UNIVERSAL_DO_F___GET_GDO_F__STRING = eINSTANCE.getUniversalDoF__GetGDoF__String();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.universalDoF.impl.GenericDoFImpl <em>Generic Do F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.universalDoF.impl.GenericDoFImpl
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getGenericDoF()
		 * @generated
		 */
		EClass GENERIC_DO_F = eINSTANCE.getGenericDoF();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_DO_F__NAME = eINSTANCE.getGenericDoF_Name();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GENERIC_DO_F___EQUALS__GENERICDOF = eINSTANCE.getGenericDoF__Equals__GenericDoF();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.universalDoF.impl.SpecificDoFImpl <em>Specific Do F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.universalDoF.impl.SpecificDoFImpl
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getSpecificDoF()
		 * @generated
		 */
		EClass SPECIFIC_DO_F = eINSTANCE.getSpecificDoF();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFIC_DO_F__NAME = eINSTANCE.getSpecificDoF_Name();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SPECIFIC_DO_F___EQUALS__SPECIFICDOF = eINSTANCE.getSpecificDoF__Equals__SpecificDoF();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.universalDoF.Metamodel <em>Metamodel</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.universalDoF.Metamodel
		 * @see genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl#getMetamodel()
		 * @generated
		 */
		EEnum METAMODEL = eINSTANCE.getMetamodel();

	}

} //UniversalDoFPackage
