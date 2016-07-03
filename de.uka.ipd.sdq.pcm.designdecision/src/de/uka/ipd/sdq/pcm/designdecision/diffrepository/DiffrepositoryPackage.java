/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

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
 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryFactory
 * @model kind="package"
 * @generated
 */
public interface DiffrepositoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diffrepository";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/DiffRepository/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diffrepository";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiffrepositoryPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffrepositoryPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelRepositoryImpl <em>Diff Model Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelRepositoryImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffrepositoryPackageImpl#getDiffModelRepository()
	 * @generated
	 */
	int DIFF_MODEL_REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_REPOSITORY__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Available Diff Models Diff Repository</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diff Model Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_REPOSITORY_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl <em>Diff Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffrepositoryPackageImpl#getDiffModel()
	 * @generated
	 */
	int DIFF_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Diff Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DIFF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Diff Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL__DIFF_DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Diff Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_MODEL_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository <em>Diff Model Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Model Repository</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository
	 * @generated
	 */
	EClass getDiffModelRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository#getAvailableDiffModels_DiffRepository <em>Available Diff Models Diff Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Available Diff Models Diff Repository</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository#getAvailableDiffModels_DiffRepository()
	 * @see #getDiffModelRepository()
	 * @generated
	 */
	EReference getDiffModelRepository_AvailableDiffModels_DiffRepository();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Model</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel
	 * @generated
	 */
	EClass getDiffModel();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffModel <em>Diff Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diff Model</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffModel()
	 * @see #getDiffModel()
	 * @generated
	 */
	EReference getDiffModel_DiffModel();

	/**
	 * Returns the meta object for the attribute '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffDescription <em>Diff Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff Description</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffDescription()
	 * @see #getDiffModel()
	 * @generated
	 */
	EAttribute getDiffModel_DiffDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiffrepositoryFactory getDiffrepositoryFactory();

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
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelRepositoryImpl <em>Diff Model Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelRepositoryImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffrepositoryPackageImpl#getDiffModelRepository()
		 * @generated
		 */
		EClass DIFF_MODEL_REPOSITORY = eINSTANCE.getDiffModelRepository();

		/**
		 * The meta object literal for the '<em><b>Available Diff Models Diff Repository</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MODEL_REPOSITORY__AVAILABLE_DIFF_MODELS_DIFF_REPOSITORY = eINSTANCE
				.getDiffModelRepository_AvailableDiffModels_DiffRepository();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl <em>Diff Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffModelImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.impl.DiffrepositoryPackageImpl#getDiffModel()
		 * @generated
		 */
		EClass DIFF_MODEL = eINSTANCE.getDiffModel();

		/**
		 * The meta object literal for the '<em><b>Diff Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIFF_MODEL__DIFF_MODEL = eINSTANCE.getDiffModel_DiffModel();

		/**
		 * The meta object literal for the '<em><b>Diff Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_MODEL__DIFF_DESCRIPTION = eINSTANCE.getDiffModel_DiffDescription();

	}

} //DiffrepositoryPackage
