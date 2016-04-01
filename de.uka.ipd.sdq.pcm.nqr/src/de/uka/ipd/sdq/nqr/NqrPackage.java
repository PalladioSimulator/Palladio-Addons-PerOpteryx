/**
 */
package de.uka.ipd.sdq.nqr;

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
 * @see de.uka.ipd.sdq.nqr.NqrFactory
 * @model kind="package"
 * @generated
 */
public interface NqrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nqr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/Nqr/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nqr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NqrPackage eINSTANCE = de.uka.ipd.sdq.nqr.impl.NqrPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.nqr.impl.NqrRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.nqr.impl.NqrRepositoryImpl
	 * @see de.uka.ipd.sdq.nqr.impl.NqrPackageImpl#getNqrRepository()
	 * @generated
	 */
	int NQR_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Nqr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_REPOSITORY__NQR = 0;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.nqr.impl.NqrImpl <em>Nqr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.nqr.impl.NqrImpl
	 * @see de.uka.ipd.sdq.nqr.impl.NqrPackageImpl#getNqr()
	 * @generated
	 */
	int NQR = 1;

	/**
	 * The feature id for the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR__ANNOTATED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR__CRITERION = 1;

	/**
	 * The number of structural features of the '<em>Nqr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nqr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NQR_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.nqr.NqrRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see de.uka.ipd.sdq.nqr.NqrRepository
	 * @generated
	 */
	EClass getNqrRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.nqr.NqrRepository#getNqr <em>Nqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nqr</em>'.
	 * @see de.uka.ipd.sdq.nqr.NqrRepository#getNqr()
	 * @see #getNqrRepository()
	 * @generated
	 */
	EReference getNqrRepository_Nqr();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.nqr.Nqr <em>Nqr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nqr</em>'.
	 * @see de.uka.ipd.sdq.nqr.Nqr
	 * @generated
	 */
	EClass getNqr();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.nqr.Nqr#getAnnotatedElement <em>Annotated Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotated Element</em>'.
	 * @see de.uka.ipd.sdq.nqr.Nqr#getAnnotatedElement()
	 * @see #getNqr()
	 * @generated
	 */
	EReference getNqr_AnnotatedElement();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.nqr.Nqr#getCriterion <em>Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Criterion</em>'.
	 * @see de.uka.ipd.sdq.nqr.Nqr#getCriterion()
	 * @see #getNqr()
	 * @generated
	 */
	EReference getNqr_Criterion();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NqrFactory getNqrFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.nqr.impl.NqrRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.nqr.impl.NqrRepositoryImpl
		 * @see de.uka.ipd.sdq.nqr.impl.NqrPackageImpl#getNqrRepository()
		 * @generated
		 */
		EClass NQR_REPOSITORY = eINSTANCE.getNqrRepository();

		/**
		 * The meta object literal for the '<em><b>Nqr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NQR_REPOSITORY__NQR = eINSTANCE.getNqrRepository_Nqr();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.nqr.impl.NqrImpl <em>Nqr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.nqr.impl.NqrImpl
		 * @see de.uka.ipd.sdq.nqr.impl.NqrPackageImpl#getNqr()
		 * @generated
		 */
		EClass NQR = eINSTANCE.getNqr();

		/**
		 * The meta object literal for the '<em><b>Annotated Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NQR__ANNOTATED_ELEMENT = eINSTANCE.getNqr_AnnotatedElement();

		/**
		 * The meta object literal for the '<em><b>Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NQR__CRITERION = eINSTANCE.getNqr_Criterion();

	}

} //NqrPackage
