/**
 */
package featureSolution;

import FeatureCompletionModel.FeatureCompletionPackage;

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
	 * The meta object id for the '{@link featureSolution.impl.SolutionRepositoryImpl <em>Solution Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.SolutionRepositoryImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSolutionRepository()
	 * @generated
	 */
	int SOLUTION_REPOSITORY = 0;

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
	 * The meta object id for the '{@link featureSolution.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.SolutionImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__ID = FeatureCompletionPackage.DESCRIBED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__NAME = FeatureCompletionPackage.DESCRIBED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = FeatureCompletionPackage.DESCRIBED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Inclusion Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__INCLUSION_INSTRUCTIONS = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Solution Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__SOLUTION_COMPONENTS = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = FeatureCompletionPackage.DESCRIBED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featureSolution.impl.InclusionMechanismImpl <em>Inclusion Mechanism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.InclusionMechanismImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getInclusionMechanism()
	 * @generated
	 */
	int INCLUSION_MECHANISM = 2;

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
	int ADAPTER_INCLUSION = 3;

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
	int EXTENSION_INCLUSION = 4;

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
	 * The meta object id for the '{@link featureSolution.impl.SolutionComponentImpl <em>Solution Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.SolutionComponentImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSolutionComponent()
	 * @generated
	 */
	int SOLUTION_COMPONENT = 5;

	/**
	 * The feature id for the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_COMPONENT__REALIZES = 0;

	/**
	 * The number of structural features of the '<em>Solution Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_COMPONENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link featureSolution.Appearance <em>Appearance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.Appearance
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 6;


	/**
	 * Returns the meta object for class '{@link featureSolution.SolutionRepository <em>Solution Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Repository</em>'.
	 * @see featureSolution.SolutionRepository
	 * @generated
	 */
	EClass getSolutionRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.SolutionRepository#getSolutions <em>Solutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Solutions</em>'.
	 * @see featureSolution.SolutionRepository#getSolutions()
	 * @see #getSolutionRepository()
	 * @generated
	 */
	EReference getSolutionRepository_Solutions();

	/**
	 * Returns the meta object for class '{@link featureSolution.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see featureSolution.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for the containment reference '{@link featureSolution.Solution#getInclusionInstructions <em>Inclusion Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inclusion Instructions</em>'.
	 * @see featureSolution.Solution#getInclusionInstructions()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_InclusionInstructions();

	/**
	 * Returns the meta object for the reference list '{@link featureSolution.Solution#getSolutionComponents <em>Solution Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Solution Components</em>'.
	 * @see featureSolution.Solution#getSolutionComponents()
	 * @see #getSolution()
	 * @generated
	 */
	EReference getSolution_SolutionComponents();

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
	 * Returns the meta object for class '{@link featureSolution.SolutionComponent <em>Solution Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Component</em>'.
	 * @see featureSolution.SolutionComponent
	 * @generated
	 */
	EClass getSolutionComponent();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.SolutionComponent#getRealizes <em>Realizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realizes</em>'.
	 * @see featureSolution.SolutionComponent#getRealizes()
	 * @see #getSolutionComponent()
	 * @generated
	 */
	EReference getSolutionComponent_Realizes();

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
		 * The meta object literal for the '{@link featureSolution.impl.SolutionRepositoryImpl <em>Solution Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.SolutionRepositoryImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSolutionRepository()
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

		/**
		 * The meta object literal for the '{@link featureSolution.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.SolutionImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '<em><b>Inclusion Instructions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__INCLUSION_INSTRUCTIONS = eINSTANCE.getSolution_InclusionInstructions();

		/**
		 * The meta object literal for the '<em><b>Solution Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION__SOLUTION_COMPONENTS = eINSTANCE.getSolution_SolutionComponents();

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
		 * The meta object literal for the '{@link featureSolution.impl.SolutionComponentImpl <em>Solution Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.SolutionComponentImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSolutionComponent()
		 * @generated
		 */
		EClass SOLUTION_COMPONENT = eINSTANCE.getSolutionComponent();

		/**
		 * The meta object literal for the '<em><b>Realizes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_COMPONENT__REALIZES = eINSTANCE.getSolutionComponent_Realizes();

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
