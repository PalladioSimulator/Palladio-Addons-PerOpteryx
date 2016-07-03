/**
 */
package de.uka.ipd.sdq.pcm.designdecision.comparerepository;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.comparerepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface comparerepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comparerepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/CompareRepository/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comparerepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	comparerepositoryPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.comparerepositoryPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.DiffImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.comparerepositoryPackageImpl#getDiff()
	 * @generated
	 */
	int DIFF = 0;

	/**
	 * The feature id for the '<em><b>Diff Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__DIFF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Diff Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__DIFF_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff
	 * @generated
	 */
	EClass getDiff();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diff Model</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffModel()
	 * @see #getDiff()
	 * @generated
	 */
	EReference getDiff_DiffModel();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffDescription <em>Diff Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffDescription()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_DiffDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	comparerepositoryFactory getcomparerepositoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.DiffImpl <em>Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.DiffImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.impl.comparerepositoryPackageImpl#getDiff()
		 * @generated
		 */
		EClass DIFF = eINSTANCE.getDiff();

		/**
		 * The meta object literal for the '<em><b>Diff Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF__DIFF_MODEL = eINSTANCE.getDiff_DiffModel();

		/**
		 * The meta object literal for the '<em><b>Diff Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__DIFF_DESCRIPTION = eINSTANCE.getDiff_DiffDescription();

	}

} //comparerepositoryPackage
