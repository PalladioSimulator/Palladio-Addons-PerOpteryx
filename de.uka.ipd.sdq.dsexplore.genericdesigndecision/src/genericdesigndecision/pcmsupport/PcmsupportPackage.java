/**
 */
package genericdesigndecision.pcmsupport;

import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see genericdesigndecision.pcmsupport.PcmsupportFactory
 * @model kind="package"
 * @generated
 */
public interface PcmsupportPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcmsupport";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/GenericDesignDecision/PCMSupport/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcmsupport";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcmsupportPackage eINSTANCE = genericdesigndecision.pcmsupport.impl.PcmsupportPackageImpl.init();

	/**
	 * The meta object id for the '{@link genericdesigndecision.pcmsupport.impl.PCMMetamodelDescriptionImpl <em>PCM Metamodel Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.pcmsupport.impl.PCMMetamodelDescriptionImpl
	 * @see genericdesigndecision.pcmsupport.impl.PcmsupportPackageImpl#getPCMMetamodelDescription()
	 * @generated
	 */
	int PCM_METAMODEL_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Dofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION__DOFREPOSITORY = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY;

	/**
	 * The feature id for the '<em><b>Gdof to dof</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION__GDOF_TO_DOF = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GDOF_TO_DOF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION__NAME = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME;

	/**
	 * The number of structural features of the '<em>PCM Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION_FEATURE_COUNT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Metamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT;

	/**
	 * The operation id for the '<em>Get Corresponding Do F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION___GET_CORRESPONDING_DO_F__GENERICDOF = UniversalDoFPackage.AMETAMODEL_DESCRIPTION___GET_CORRESPONDING_DO_F__GENERICDOF;

	/**
	 * The number of operations of the '<em>PCM Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCM_METAMODEL_DESCRIPTION_OPERATION_COUNT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link genericdesigndecision.pcmsupport.impl.PCMDSEProblemImpl <em>PCMDSE Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see genericdesigndecision.pcmsupport.impl.PCMDSEProblemImpl
	 * @see genericdesigndecision.pcmsupport.impl.PcmsupportPackageImpl#getPCMDSEProblem()
	 * @generated
	 */
	int PCMDSE_PROBLEM = 1;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMDSE_PROBLEM__PROBLEM = GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM;

	/**
	 * The feature id for the '<em><b>Emf Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMDSE_PROBLEM__EMF_INSTANCE = GenericdesigndecisionPackage.ADSE_PROBLEM__EMF_INSTANCE;

	/**
	 * The feature id for the '<em><b>Associated Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMDSE_PROBLEM__ASSOCIATED_METAMODEL = GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL;

	/**
	 * The number of structural features of the '<em>PCMDSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMDSE_PROBLEM_FEATURE_COUNT = GenericdesigndecisionPackage.ADSE_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCMDSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCMDSE_PROBLEM_OPERATION_COUNT = GenericdesigndecisionPackage.ADSE_PROBLEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link genericdesigndecision.pcmsupport.PCMMetamodelDescription <em>PCM Metamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCM Metamodel Description</em>'.
	 * @see genericdesigndecision.pcmsupport.PCMMetamodelDescription
	 * @generated
	 */
	EClass getPCMMetamodelDescription();

	/**
	 * Returns the meta object for class '{@link genericdesigndecision.pcmsupport.PCMDSEProblem <em>PCMDSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCMDSE Problem</em>'.
	 * @see genericdesigndecision.pcmsupport.PCMDSEProblem
	 * @generated
	 */
	EClass getPCMDSEProblem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcmsupportFactory getPcmsupportFactory();

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
		 * The meta object literal for the '{@link genericdesigndecision.pcmsupport.impl.PCMMetamodelDescriptionImpl <em>PCM Metamodel Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.pcmsupport.impl.PCMMetamodelDescriptionImpl
		 * @see genericdesigndecision.pcmsupport.impl.PcmsupportPackageImpl#getPCMMetamodelDescription()
		 * @generated
		 */
		EClass PCM_METAMODEL_DESCRIPTION = eINSTANCE.getPCMMetamodelDescription();

		/**
		 * The meta object literal for the '{@link genericdesigndecision.pcmsupport.impl.PCMDSEProblemImpl <em>PCMDSE Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see genericdesigndecision.pcmsupport.impl.PCMDSEProblemImpl
		 * @see genericdesigndecision.pcmsupport.impl.PcmsupportPackageImpl#getPCMDSEProblem()
		 * @generated
		 */
		EClass PCMDSE_PROBLEM = eINSTANCE.getPCMDSEProblem();

	}

} //PcmsupportPackage
