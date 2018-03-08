/**
 */
package TransformationModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see TransformationModel.TransformationModelFactory
 * @model kind="package"
 * @generated
 */
public interface TransformationModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TransformationModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/TransformationModel/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TransformationModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TransformationModelPackage eINSTANCE = TransformationModel.impl.TransformationModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link TransformationModel.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformationModel.impl.TransformationImpl
	 * @see TransformationModel.impl.TransformationModelPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__THRESHOLD = 0;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__MULTIPLE = 1;

	/**
	 * The feature id for the '<em><b>Injectable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INJECTABLE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TransformationModel.impl.TransformationRepositoryImpl <em>Transformation Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformationModel.impl.TransformationRepositoryImpl
	 * @see TransformationModel.impl.TransformationModelPackageImpl#getTransformationRepository()
	 * @generated
	 */
	int TRANSFORMATION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_REPOSITORY__TRANSFORMATION = 0;

	/**
	 * The number of structural features of the '<em>Transformation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_REPOSITORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transformation Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TransformationModel.impl.ExtensionTransformationImpl <em>Extension Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformationModel.impl.ExtensionTransformationImpl
	 * @see TransformationModel.impl.TransformationModelPackageImpl#getExtensionTransformation()
	 * @generated
	 */
	int EXTENSION_TRANSFORMATION = 2;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION__THRESHOLD = TRANSFORMATION__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION__MULTIPLE = TRANSFORMATION__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Injectable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION__INJECTABLE = TRANSFORMATION__INJECTABLE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION__TARGET = TRANSFORMATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The number of structural features of the '<em>Extension Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Extension Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TransformationModel.impl.AdapterTransformationImpl <em>Adapter Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformationModel.impl.AdapterTransformationImpl
	 * @see TransformationModel.impl.TransformationModelPackageImpl#getAdapterTransformation()
	 * @generated
	 */
	int ADAPTER_TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION__THRESHOLD = TRANSFORMATION__THRESHOLD;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION__MULTIPLE = TRANSFORMATION__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Injectable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION__INJECTABLE = TRANSFORMATION__INJECTABLE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION__TARGET = TRANSFORMATION__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

	/**
	 * The feature id for the '<em><b>Appear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION__APPEAR = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adapter Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Adapter Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_TRANSFORMATION_OPERATION_COUNT = TRANSFORMATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TransformationModel.Appearance <em>Appearance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TransformationModel.Appearance
	 * @see TransformationModel.impl.TransformationModelPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 4;


	/**
	 * Returns the meta object for class '{@link TransformationModel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see TransformationModel.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute '{@link TransformationModel.Transformation#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see TransformationModel.Transformation#getThreshold()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link TransformationModel.Transformation#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see TransformationModel.Transformation#isMultiple()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Multiple();

	/**
	 * Returns the meta object for the reference '{@link TransformationModel.Transformation#getInjectable <em>Injectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Injectable</em>'.
	 * @see TransformationModel.Transformation#getInjectable()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Injectable();

	/**
	 * Returns the meta object for the reference '{@link TransformationModel.Transformation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see TransformationModel.Transformation#getTarget()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Target();

	/**
	 * Returns the meta object for the attribute '{@link TransformationModel.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TransformationModel.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for class '{@link TransformationModel.TransformationRepository <em>Transformation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation Repository</em>'.
	 * @see TransformationModel.TransformationRepository
	 * @generated
	 */
	EClass getTransformationRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link TransformationModel.TransformationRepository#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transformation</em>'.
	 * @see TransformationModel.TransformationRepository#getTransformation()
	 * @see #getTransformationRepository()
	 * @generated
	 */
	EReference getTransformationRepository_Transformation();

	/**
	 * Returns the meta object for class '{@link TransformationModel.ExtensionTransformation <em>Extension Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Transformation</em>'.
	 * @see TransformationModel.ExtensionTransformation
	 * @generated
	 */
	EClass getExtensionTransformation();

	/**
	 * Returns the meta object for class '{@link TransformationModel.AdapterTransformation <em>Adapter Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Transformation</em>'.
	 * @see TransformationModel.AdapterTransformation
	 * @generated
	 */
	EClass getAdapterTransformation();

	/**
	 * Returns the meta object for the attribute '{@link TransformationModel.AdapterTransformation#getAppear <em>Appear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appear</em>'.
	 * @see TransformationModel.AdapterTransformation#getAppear()
	 * @see #getAdapterTransformation()
	 * @generated
	 */
	EAttribute getAdapterTransformation_Appear();

	/**
	 * Returns the meta object for enum '{@link TransformationModel.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appearance</em>'.
	 * @see TransformationModel.Appearance
	 * @generated
	 */
	EEnum getAppearance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TransformationModelFactory getTransformationModelFactory();

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
		 * The meta object literal for the '{@link TransformationModel.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformationModel.impl.TransformationImpl
		 * @see TransformationModel.impl.TransformationModelPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__THRESHOLD = eINSTANCE.getTransformation_Threshold();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__MULTIPLE = eINSTANCE.getTransformation_Multiple();

		/**
		 * The meta object literal for the '<em><b>Injectable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INJECTABLE = eINSTANCE.getTransformation_Injectable();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET = eINSTANCE.getTransformation_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '{@link TransformationModel.impl.TransformationRepositoryImpl <em>Transformation Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformationModel.impl.TransformationRepositoryImpl
		 * @see TransformationModel.impl.TransformationModelPackageImpl#getTransformationRepository()
		 * @generated
		 */
		EClass TRANSFORMATION_REPOSITORY = eINSTANCE.getTransformationRepository();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_REPOSITORY__TRANSFORMATION = eINSTANCE.getTransformationRepository_Transformation();

		/**
		 * The meta object literal for the '{@link TransformationModel.impl.ExtensionTransformationImpl <em>Extension Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformationModel.impl.ExtensionTransformationImpl
		 * @see TransformationModel.impl.TransformationModelPackageImpl#getExtensionTransformation()
		 * @generated
		 */
		EClass EXTENSION_TRANSFORMATION = eINSTANCE.getExtensionTransformation();

		/**
		 * The meta object literal for the '{@link TransformationModel.impl.AdapterTransformationImpl <em>Adapter Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformationModel.impl.AdapterTransformationImpl
		 * @see TransformationModel.impl.TransformationModelPackageImpl#getAdapterTransformation()
		 * @generated
		 */
		EClass ADAPTER_TRANSFORMATION = eINSTANCE.getAdapterTransformation();

		/**
		 * The meta object literal for the '<em><b>Appear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER_TRANSFORMATION__APPEAR = eINSTANCE.getAdapterTransformation_Appear();

		/**
		 * The meta object literal for the '{@link TransformationModel.Appearance <em>Appearance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TransformationModel.Appearance
		 * @see TransformationModel.impl.TransformationModelPackageImpl#getAppearance()
		 * @generated
		 */
		EEnum APPEARANCE = eINSTANCE.getAppearance();

	}

} //TransformationModelPackage
