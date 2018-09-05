/**
 */
package featureSolution;

import FeatureCompletionModel.FeatureCompletionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The meta object id for the '{@link featureSolution.impl.BehaviourInclusionImpl <em>Behaviour Inclusion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.BehaviourInclusionImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getBehaviourInclusion()
	 * @generated
	 */
	int BEHAVIOUR_INCLUSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__ID = INCLUSION_MECHANISM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__NAME = INCLUSION_MECHANISM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__DESCRIPTION = INCLUSION_MECHANISM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__MULTIPLE = INCLUSION_MECHANISM__MULTIPLE;

	/**
	 * The feature id for the '<em><b>Point Cut</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__POINT_CUT = INCLUSION_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__ADVICE = INCLUSION_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__IMPORTS = INCLUSION_MECHANISM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Feature Completion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION__FEATURE_COMPLETION = INCLUSION_MECHANISM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Behaviour Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_INCLUSION_FEATURE_COUNT = INCLUSION_MECHANISM_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link featureSolution.impl.PlacementStrategyImpl <em>Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.PlacementStrategyImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getPlacementStrategy()
	 * @generated
	 */
	int PLACEMENT_STRATEGY = 3;

	/**
	 * The number of structural features of the '<em>Placement Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureSolution.impl.ExternalCallPlacementStrategyImpl <em>External Call Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.ExternalCallPlacementStrategyImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getExternalCallPlacementStrategy()
	 * @generated
	 */
	int EXTERNAL_CALL_PLACEMENT_STRATEGY = 4;

	/**
	 * The feature id for the '<em><b>Matching Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE = PLACEMENT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Call Placement Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CALL_PLACEMENT_STRATEGY_FEATURE_COUNT = PLACEMENT_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.InternalActionPlacementStrategyImpl <em>Internal Action Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.InternalActionPlacementStrategyImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getInternalActionPlacementStrategy()
	 * @generated
	 */
	int INTERNAL_ACTION_PLACEMENT_STRATEGY = 5;

	/**
	 * The feature id for the '<em><b>For All Internal Actions In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN = PLACEMENT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Action Placement Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACTION_PLACEMENT_STRATEGY_FEATURE_COUNT = PLACEMENT_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.ControlFlowPlacementStrategyImpl <em>Control Flow Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.ControlFlowPlacementStrategyImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getControlFlowPlacementStrategy()
	 * @generated
	 */
	int CONTROL_FLOW_PLACEMENT_STRATEGY = 6;

	/**
	 * The feature id for the '<em><b>For All Control Flows In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN = PLACEMENT_STRATEGY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Control Flow Placement Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_PLACEMENT_STRATEGY_FEATURE_COUNT = PLACEMENT_STRATEGY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.PointCutImpl <em>Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.PointCutImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getPointCut()
	 * @generated
	 */
	int POINT_CUT = 7;

	/**
	 * The feature id for the '<em><b>Placement Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT__PLACEMENT_STRATEGY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link featureSolution.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.AdviceImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 8;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Point Cut</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__POINT_CUT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Appears</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__APPEARS = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placement Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__PLACEMENT_POLICY = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Advice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link featureSolution.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.ImportImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 9;

	/**
	 * The feature id for the '<em><b>Import URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORT_URI = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.FeatureSelectionImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getFeatureSelection()
	 * @generated
	 */
	int FEATURE_SELECTION = 10;

	/**
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__COMPLETION = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION__FEATURE_LISTS = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SELECTION_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link featureSolution.impl.FeatureListImpl <em>Feature List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.FeatureListImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getFeatureList()
	 * @generated
	 */
	int FEATURE_LIST = 11;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST__FEATURES = 0;

	/**
	 * The number of structural features of the '<em>Feature List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link featureSolution.impl.SelectedCVImpl <em>Selected CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.impl.SelectedCVImpl
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSelectedCV()
	 * @generated
	 */
	int SELECTED_CV = 12;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_CV__OPTIONAL = 0;

	/**
	 * The feature id for the '<em><b>Complementum Visnetis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_CV__COMPLEMENTUM_VISNETIS = 1;

	/**
	 * The number of structural features of the '<em>Selected CV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTED_CV_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link featureSolution.Appearance <em>Appearance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.Appearance
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 13;

	/**
	 * The meta object id for the '{@link featureSolution.ControlFlow <em>Control Flow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.ControlFlow
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 14;


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
	 * Returns the meta object for class '{@link featureSolution.BehaviourInclusion <em>Behaviour Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour Inclusion</em>'.
	 * @see featureSolution.BehaviourInclusion
	 * @generated
	 */
	EClass getBehaviourInclusion();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.BehaviourInclusion#getPointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point Cut</em>'.
	 * @see featureSolution.BehaviourInclusion#getPointCut()
	 * @see #getBehaviourInclusion()
	 * @generated
	 */
	EReference getBehaviourInclusion_PointCut();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.BehaviourInclusion#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advice</em>'.
	 * @see featureSolution.BehaviourInclusion#getAdvice()
	 * @see #getBehaviourInclusion()
	 * @generated
	 */
	EReference getBehaviourInclusion_Advice();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.BehaviourInclusion#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see featureSolution.BehaviourInclusion#getImports()
	 * @see #getBehaviourInclusion()
	 * @generated
	 */
	EReference getBehaviourInclusion_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link featureSolution.BehaviourInclusion#getFeatureCompletion <em>Feature Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Completion</em>'.
	 * @see featureSolution.BehaviourInclusion#getFeatureCompletion()
	 * @see #getBehaviourInclusion()
	 * @generated
	 */
	EReference getBehaviourInclusion_FeatureCompletion();

	/**
	 * Returns the meta object for class '{@link featureSolution.PlacementStrategy <em>Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement Strategy</em>'.
	 * @see featureSolution.PlacementStrategy
	 * @generated
	 */
	EClass getPlacementStrategy();

	/**
	 * Returns the meta object for class '{@link featureSolution.ExternalCallPlacementStrategy <em>External Call Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call Placement Strategy</em>'.
	 * @see featureSolution.ExternalCallPlacementStrategy
	 * @generated
	 */
	EClass getExternalCallPlacementStrategy();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.ExternalCallPlacementStrategy#getMatchingSignature <em>Matching Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matching Signature</em>'.
	 * @see featureSolution.ExternalCallPlacementStrategy#getMatchingSignature()
	 * @see #getExternalCallPlacementStrategy()
	 * @generated
	 */
	EReference getExternalCallPlacementStrategy_MatchingSignature();

	/**
	 * Returns the meta object for class '{@link featureSolution.InternalActionPlacementStrategy <em>Internal Action Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action Placement Strategy</em>'.
	 * @see featureSolution.InternalActionPlacementStrategy
	 * @generated
	 */
	EClass getInternalActionPlacementStrategy();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.InternalActionPlacementStrategy#getForAllInternalActionsIn <em>For All Internal Actions In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For All Internal Actions In</em>'.
	 * @see featureSolution.InternalActionPlacementStrategy#getForAllInternalActionsIn()
	 * @see #getInternalActionPlacementStrategy()
	 * @generated
	 */
	EReference getInternalActionPlacementStrategy_ForAllInternalActionsIn();

	/**
	 * Returns the meta object for class '{@link featureSolution.ControlFlowPlacementStrategy <em>Control Flow Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Placement Strategy</em>'.
	 * @see featureSolution.ControlFlowPlacementStrategy
	 * @generated
	 */
	EClass getControlFlowPlacementStrategy();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.ControlFlowPlacementStrategy#getForAllControlFlowsIn <em>For All Control Flows In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For All Control Flows In</em>'.
	 * @see featureSolution.ControlFlowPlacementStrategy#getForAllControlFlowsIn()
	 * @see #getControlFlowPlacementStrategy()
	 * @generated
	 */
	EReference getControlFlowPlacementStrategy_ForAllControlFlowsIn();

	/**
	 * Returns the meta object for class '{@link featureSolution.PointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut</em>'.
	 * @see featureSolution.PointCut
	 * @generated
	 */
	EClass getPointCut();

	/**
	 * Returns the meta object for the containment reference '{@link featureSolution.PointCut#getPlacementStrategy <em>Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placement Strategy</em>'.
	 * @see featureSolution.PointCut#getPlacementStrategy()
	 * @see #getPointCut()
	 * @generated
	 */
	EReference getPointCut_PlacementStrategy();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.PointCut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureSolution.PointCut#getName()
	 * @see #getPointCut()
	 * @generated
	 */
	EAttribute getPointCut_Name();

	/**
	 * Returns the meta object for class '{@link featureSolution.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see featureSolution.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.Advice#getPointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Cut</em>'.
	 * @see featureSolution.Advice#getPointCut()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_PointCut();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.Advice#getAppears <em>Appears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appears</em>'.
	 * @see featureSolution.Advice#getAppears()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_Appears();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.Advice#getPlacementPolicy <em>Placement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement Policy</em>'.
	 * @see featureSolution.Advice#getPlacementPolicy()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_PlacementPolicy();

	/**
	 * Returns the meta object for class '{@link featureSolution.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see featureSolution.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see featureSolution.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link featureSolution.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Selection</em>'.
	 * @see featureSolution.FeatureSelection
	 * @generated
	 */
	EClass getFeatureSelection();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.FeatureSelection#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Completion</em>'.
	 * @see featureSolution.FeatureSelection#getCompletion()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_Completion();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.FeatureSelection#getFeatureLists <em>Feature Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Lists</em>'.
	 * @see featureSolution.FeatureSelection#getFeatureLists()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_FeatureLists();

	/**
	 * Returns the meta object for class '{@link featureSolution.FeatureList <em>Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature List</em>'.
	 * @see featureSolution.FeatureList
	 * @generated
	 */
	EClass getFeatureList();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.FeatureList#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see featureSolution.FeatureList#getFeatures()
	 * @see #getFeatureList()
	 * @generated
	 */
	EReference getFeatureList_Features();

	/**
	 * Returns the meta object for class '{@link featureSolution.SelectedCV <em>Selected CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected CV</em>'.
	 * @see featureSolution.SelectedCV
	 * @generated
	 */
	EClass getSelectedCV();

	/**
	 * Returns the meta object for the attribute '{@link featureSolution.SelectedCV#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see featureSolution.SelectedCV#isOptional()
	 * @see #getSelectedCV()
	 * @generated
	 */
	EAttribute getSelectedCV_Optional();

	/**
	 * Returns the meta object for the reference '{@link featureSolution.SelectedCV#getComplementumVisnetis <em>Complementum Visnetis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complementum Visnetis</em>'.
	 * @see featureSolution.SelectedCV#getComplementumVisnetis()
	 * @see #getSelectedCV()
	 * @generated
	 */
	EReference getSelectedCV_ComplementumVisnetis();

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
	 * Returns the meta object for enum '{@link featureSolution.ControlFlow <em>Control Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Control Flow</em>'.
	 * @see featureSolution.ControlFlow
	 * @generated
	 */
	EEnum getControlFlow();

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
		 * The meta object literal for the '{@link featureSolution.impl.BehaviourInclusionImpl <em>Behaviour Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.BehaviourInclusionImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getBehaviourInclusion()
		 * @generated
		 */
		EClass BEHAVIOUR_INCLUSION = eINSTANCE.getBehaviourInclusion();

		/**
		 * The meta object literal for the '<em><b>Point Cut</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_INCLUSION__POINT_CUT = eINSTANCE.getBehaviourInclusion_PointCut();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_INCLUSION__ADVICE = eINSTANCE.getBehaviourInclusion_Advice();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_INCLUSION__IMPORTS = eINSTANCE.getBehaviourInclusion_Imports();

		/**
		 * The meta object literal for the '<em><b>Feature Completion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR_INCLUSION__FEATURE_COMPLETION = eINSTANCE.getBehaviourInclusion_FeatureCompletion();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.PlacementStrategyImpl <em>Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.PlacementStrategyImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getPlacementStrategy()
		 * @generated
		 */
		EClass PLACEMENT_STRATEGY = eINSTANCE.getPlacementStrategy();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.ExternalCallPlacementStrategyImpl <em>External Call Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.ExternalCallPlacementStrategyImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getExternalCallPlacementStrategy()
		 * @generated
		 */
		EClass EXTERNAL_CALL_PLACEMENT_STRATEGY = eINSTANCE.getExternalCallPlacementStrategy();

		/**
		 * The meta object literal for the '<em><b>Matching Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE = eINSTANCE.getExternalCallPlacementStrategy_MatchingSignature();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.InternalActionPlacementStrategyImpl <em>Internal Action Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.InternalActionPlacementStrategyImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getInternalActionPlacementStrategy()
		 * @generated
		 */
		EClass INTERNAL_ACTION_PLACEMENT_STRATEGY = eINSTANCE.getInternalActionPlacementStrategy();

		/**
		 * The meta object literal for the '<em><b>For All Internal Actions In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN = eINSTANCE.getInternalActionPlacementStrategy_ForAllInternalActionsIn();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.ControlFlowPlacementStrategyImpl <em>Control Flow Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.ControlFlowPlacementStrategyImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getControlFlowPlacementStrategy()
		 * @generated
		 */
		EClass CONTROL_FLOW_PLACEMENT_STRATEGY = eINSTANCE.getControlFlowPlacementStrategy();

		/**
		 * The meta object literal for the '<em><b>For All Control Flows In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN = eINSTANCE.getControlFlowPlacementStrategy_ForAllControlFlowsIn();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.PointCutImpl <em>Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.PointCutImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getPointCut()
		 * @generated
		 */
		EClass POINT_CUT = eINSTANCE.getPointCut();

		/**
		 * The meta object literal for the '<em><b>Placement Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_CUT__PLACEMENT_STRATEGY = eINSTANCE.getPointCut_PlacementStrategy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT_CUT__NAME = eINSTANCE.getPointCut_Name();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.AdviceImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAdvice()
		 * @generated
		 */
		EClass ADVICE = eINSTANCE.getAdvice();

		/**
		 * The meta object literal for the '<em><b>Point Cut</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__POINT_CUT = eINSTANCE.getAdvice_PointCut();

		/**
		 * The meta object literal for the '<em><b>Appears</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__APPEARS = eINSTANCE.getAdvice_Appears();

		/**
		 * The meta object literal for the '<em><b>Placement Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVICE__PLACEMENT_POLICY = eINSTANCE.getAdvice_PlacementPolicy();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.ImportImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.FeatureSelectionImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getFeatureSelection()
		 * @generated
		 */
		EClass FEATURE_SELECTION = eINSTANCE.getFeatureSelection();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SELECTION__COMPLETION = eINSTANCE.getFeatureSelection_Completion();

		/**
		 * The meta object literal for the '<em><b>Feature Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SELECTION__FEATURE_LISTS = eINSTANCE.getFeatureSelection_FeatureLists();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.FeatureListImpl <em>Feature List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.FeatureListImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getFeatureList()
		 * @generated
		 */
		EClass FEATURE_LIST = eINSTANCE.getFeatureList();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_LIST__FEATURES = eINSTANCE.getFeatureList_Features();

		/**
		 * The meta object literal for the '{@link featureSolution.impl.SelectedCVImpl <em>Selected CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.SelectedCVImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getSelectedCV()
		 * @generated
		 */
		EClass SELECTED_CV = eINSTANCE.getSelectedCV();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECTED_CV__OPTIONAL = eINSTANCE.getSelectedCV_Optional();

		/**
		 * The meta object literal for the '<em><b>Complementum Visnetis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECTED_CV__COMPLEMENTUM_VISNETIS = eINSTANCE.getSelectedCV_ComplementumVisnetis();

		/**
		 * The meta object literal for the '{@link featureSolution.Appearance <em>Appearance</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.Appearance
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAppearance()
		 * @generated
		 */
		EEnum APPEARANCE = eINSTANCE.getAppearance();

		/**
		 * The meta object literal for the '{@link featureSolution.ControlFlow <em>Control Flow</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.ControlFlow
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getControlFlow()
		 * @generated
		 */
		EEnum CONTROL_FLOW = eINSTANCE.getControlFlow();

	}

} //FeatureSolutionPackage
