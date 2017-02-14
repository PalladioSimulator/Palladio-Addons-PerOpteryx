/**
 */
package SolutionModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see SolutionModel.SolutionModelFactory
 * @model kind="package"
 * @generated
 */
public interface SolutionModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SolutionModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/SolutionModel/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Solution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SolutionModelPackage eINSTANCE = SolutionModel.impl.SolutionModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SolutionModel.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SolutionModel.impl.SolutionImpl
	 * @see SolutionModel.impl.SolutionModelPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SolutionModel.impl.SolutionRepositoryImpl <em>Solution Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SolutionModel.impl.SolutionRepositoryImpl
	 * @see SolutionModel.impl.SolutionModelPackageImpl#getSolutionRepository()
	 * @generated
	 */
	int SOLUTION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Solutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_REPOSITORY__SOLUTIONS = 0;

	/**
	 * The number of structural features of the '<em>Solution Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Solution Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_REPOSITORY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link SolutionModel.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see SolutionModel.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the attribute '{@link SolutionModel.Solution#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see SolutionModel.Solution#getName()
	 * @see #getSolution()
	 * @generated
	 */
	EAttribute getSolution_Name();

	/**
	 * Returns the meta object for the reference '{@link SolutionModel.Solution#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see SolutionModel.Solution#getRepository()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_Repository();

	/**
	 * Returns the meta object for class '{@link SolutionModel.SolutionRepository <em>Solution Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Repository</em>'.
	 * @see SolutionModel.SolutionRepository
	 * @generated
	 */
	EClass getSolutionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link SolutionModel.SolutionRepository#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see SolutionModel.SolutionRepository#getSolutions()
	 * @see #getSolutionRepository()
	 * @generated
	 */
	EReference getSolutionRepository_Solutions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SolutionModelFactory getSolutionModelFactory();

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
		 * The meta object literal for the '{@link SolutionModel.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SolutionModel.impl.SolutionImpl
		 * @see SolutionModel.impl.SolutionModelPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION__NAME = eINSTANCE.getSolution_Name();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__REPOSITORY = eINSTANCE.getSolution_Repository();

		/**
		 * The meta object literal for the '{@link SolutionModel.impl.SolutionRepositoryImpl <em>Solution Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SolutionModel.impl.SolutionRepositoryImpl
		 * @see SolutionModel.impl.SolutionModelPackageImpl#getSolutionRepository()
		 * @generated
		 */
		EClass SOLUTION_REPOSITORY = eINSTANCE.getSolutionRepository();

		/**
		 * The meta object literal for the '<em><b>Solutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_REPOSITORY__SOLUTIONS = eINSTANCE.getSolutionRepository_Solutions();

	}

} //SolutionModelPackage
