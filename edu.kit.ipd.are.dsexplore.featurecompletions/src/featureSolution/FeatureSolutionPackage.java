/**
 */
package featureSolution;

import FeatureCompletionModel.FeatureCompletionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see featureSolution.FeatureSolutionFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureSolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featureSolution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/FeatureSolutionModel/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featureSolution";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureSolutionPackage eINSTANCE = featureSolution.impl.FeatureSolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link featureSolution.impl.InclusionMechanismImpl <em>Inclusion Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.InclusionMechanismImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getInclusionMechanism()
	 * @generated
	 */
	int INCLUSION_MECHANISM = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_MECHANISM__ID = FeatureCompletionPackage.DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_MECHANISM__NAME = FeatureCompletionPackage.DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_MECHANISM__DESCRIPTION = FeatureCompletionPackage.DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_MECHANISM__MULTIPLE = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inclusion Mechanism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSION_MECHANISM_FEATURE_COUNT = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.AdapterInclusionImpl <em>Adapter Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.AdapterInclusionImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAdapterInclusion()
	 * @generated
	 */
	int ADAPTER_INCLUSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INCLUSION__ID = INCLUSION_MECHANISM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INCLUSION__NAME = INCLUSION_MECHANISM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INCLUSION__DESCRIPTION = INCLUSION_MECHANISM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INCLUSION__MULTIPLE = INCLUSION_MECHANISM__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Appears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INCLUSION__APPEARS = INCLUSION_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adapter Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_INCLUSION_FEATURE_COUNT = INCLUSION_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.ExtensionInclusionImpl <em>Extension Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.ExtensionInclusionImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getExtensionInclusion()
	 * @generated
	 */
	int EXTENSION_INCLUSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__ID = INCLUSION_MECHANISM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__NAME = INCLUSION_MECHANISM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__DESCRIPTION = INCLUSION_MECHANISM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__MULTIPLE = INCLUSION_MECHANISM__MULTIPLE;

	/**
	 * The number of structural features of the '<em>Extension Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION_FEATURE_COUNT = INCLUSION_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureSolution.Appearance <em>Appearance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.Appearance
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 3;


	/**
	 * Returns the meta object for class '{@link featureSolution.InclusionMechanism <em>Inclusion Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusion Mechanism</em>'.
	 * @see featureSolution.InclusionMechanism
	 * @generated
	 */
	EClass getInclusionMechanism();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.InclusionMechanism#isMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see featureSolution.InclusionMechanism#isMultiple()
	 * @see #getInclusionMechanism()
	 * @generated
	 */
	EAttribute getInclusionMechanism_Multiple();

	/**
	 * Returns the meta object for class '{@link featureSolution.AdapterInclusion <em>Adapter Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter Inclusion</em>'.
	 * @see featureSolution.AdapterInclusion
	 * @generated
	 */
	EClass getAdapterInclusion();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.AdapterInclusion#getAppears <em>Appears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appears</em>'.
	 * @see featureSolution.AdapterInclusion#getAppears()
	 * @see #getAdapterInclusion()
	 * @generated
	 */
	EAttribute getAdapterInclusion_Appears();

	/**
	 * Returns the meta object for class '{@link featureSolution.ExtensionInclusion <em>Extension Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Inclusion</em>'.
	 * @see featureSolution.ExtensionInclusion
	 * @generated
	 */
	EClass getExtensionInclusion();

	/**
	 * Returns the meta object for enum '{@link featureSolution.Appearance <em>Appearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Appearance</em>'.
	 * @see featureSolution.Appearance
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
	FeatureSolutionFactory getFeatureSolutionFactory();

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
		 * The meta object literal for the '{@link featureSolution.impl.InclusionMechanismImpl <em>Inclusion Mechanism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.InclusionMechanismImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getInclusionMechanism()
		 * @generated
		 */
		EClass INCLUSION_MECHANISM = eINSTANCE.getInclusionMechanism();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUSION_MECHANISM__MULTIPLE = eINSTANCE.getInclusionMechanism_Multiple();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.AdapterInclusionImpl <em>Adapter Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.AdapterInclusionImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAdapterInclusion()
		 * @generated
		 */
		EClass ADAPTER_INCLUSION = eINSTANCE.getAdapterInclusion();

		/**
		 * The meta object literal for the '<em><b>Appears</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADAPTER_INCLUSION__APPEARS = eINSTANCE.getAdapterInclusion_Appears();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.ExtensionInclusionImpl <em>Extension Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.ExtensionInclusionImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getExtensionInclusion()
		 * @generated
		 */
		EClass EXTENSION_INCLUSION = eINSTANCE.getExtensionInclusion();

		/**
		 * The meta object literal for the '{@link featureSolution.Appearance <em>Appearance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.Appearance
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAppearance()
		 * @generated
		 */
		EEnum APPEARANCE = eINSTANCE.getAppearance();

	}

} //FeatureSolutionPackage
