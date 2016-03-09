/**
 */
package dmlsupport.designdecision;

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
 * @see dmlsupport.designdecision.DesigndecisionFactory
 * @model kind="package"
 * @generated
 */
public interface DesigndecisionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "designdecision";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/dmlsupport/designdecision";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "designdecision";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DesigndecisionPackage eINSTANCE = dmlsupport.designdecision.impl.DesigndecisionPackageImpl.init();

	/**
	 * The meta object id for the '{@link dmlsupport.designdecision.impl.DSEProblemImpl <em>DSE Problem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.designdecision.impl.DSEProblemImpl
	 * @see dmlsupport.designdecision.impl.DesigndecisionPackageImpl#getDSEProblem()
	 * @generated
	 */
	int DSE_PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__PROBLEM = GenericdesigndecisionPackage.ADSE_PROBLEM__PROBLEM;

	/**
	 * The feature id for the '<em><b>Associated Metamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM__ASSOCIATED_METAMODEL = GenericdesigndecisionPackage.ADSE_PROBLEM__ASSOCIATED_METAMODEL;

	/**
	 * The number of structural features of the '<em>DSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_FEATURE_COUNT = GenericdesigndecisionPackage.ADSE_PROBLEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DSE Problem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_PROBLEM_OPERATION_COUNT = GenericdesigndecisionPackage.ADSE_PROBLEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dmlsupport.designdecision.impl.MetamodelDescriptionImpl <em>Metamodel Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dmlsupport.designdecision.impl.MetamodelDescriptionImpl
	 * @see dmlsupport.designdecision.impl.DesigndecisionPackageImpl#getMetamodelDescription()
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
	int METAMODEL_DESCRIPTION__DOFREPOSITORY = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__NAME = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME;

	/**
	 * The feature id for the '<em><b>Genome To Candidate Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION = UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION;

	/**
	 * The number of structural features of the '<em>Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION_FEATURE_COUNT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Evaluate Metamodel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT;

	/**
	 * The operation id for the '<em>Delete SDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION___DELETE_SDO_F__SPECIFICDOF = UniversalDoFPackage.AMETAMODEL_DESCRIPTION___DELETE_SDO_F__SPECIFICDOF;

	/**
	 * The operation id for the '<em>List SDo Fs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION___LIST_SDO_FS = UniversalDoFPackage.AMETAMODEL_DESCRIPTION___LIST_SDO_FS;

	/**
	 * The operation id for the '<em>Get SDo F</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION___GET_SDO_F__STRING = UniversalDoFPackage.AMETAMODEL_DESCRIPTION___GET_SDO_F__STRING;

	/**
	 * The number of operations of the '<em>Metamodel Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_DESCRIPTION_OPERATION_COUNT = UniversalDoFPackage.AMETAMODEL_DESCRIPTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link dmlsupport.designdecision.DSEProblem <em>DSE Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE Problem</em>'.
	 * @see dmlsupport.designdecision.DSEProblem
	 * @generated
	 */
	EClass getDSEProblem();

	/**
	 * Returns the meta object for class '{@link dmlsupport.designdecision.MetamodelDescription <em>Metamodel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel Description</em>'.
	 * @see dmlsupport.designdecision.MetamodelDescription
	 * @generated
	 */
	EClass getMetamodelDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DesigndecisionFactory getDesigndecisionFactory();

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
		 * The meta object literal for the '{@link dmlsupport.designdecision.impl.DSEProblemImpl <em>DSE Problem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.designdecision.impl.DSEProblemImpl
		 * @see dmlsupport.designdecision.impl.DesigndecisionPackageImpl#getDSEProblem()
		 * @generated
		 */
		EClass DSE_PROBLEM = eINSTANCE.getDSEProblem();

		/**
		 * The meta object literal for the '{@link dmlsupport.designdecision.impl.MetamodelDescriptionImpl <em>Metamodel Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dmlsupport.designdecision.impl.MetamodelDescriptionImpl
		 * @see dmlsupport.designdecision.impl.DesigndecisionPackageImpl#getMetamodelDescription()
		 * @generated
		 */
		EClass METAMODEL_DESCRIPTION = eINSTANCE.getMetamodelDescription();

	}

} //DesigndecisionPackage
