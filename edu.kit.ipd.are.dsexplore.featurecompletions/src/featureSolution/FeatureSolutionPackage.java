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
	 * The feature id for the '<em><b>Point Cut</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__POINT_CUT = INCLUSION_MECHANISM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Advice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__ADVICE = INCLUSION_MECHANISM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION__IMPORTS = INCLUSION_MECHANISM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Extension Inclusion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_INCLUSION_FEATURE_COUNT = INCLUSION_MECHANISM_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Entity Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT__ENTITY_NAME = EntityPackage.NAMED_ELEMENT__ENTITY_NAME;

	/**
	 * The feature id for the '<em><b>Placement Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT__PLACEMENT_STRATEGY = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Point Cut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_CUT_FEATURE_COUNT = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Completion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVICE__COMPLETION = EntityPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__REPOSITORY = 1;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link featureSolution.Appearance <em>Appearance</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.Appearance
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getAppearance()
	 * @generated
	 */
	int APPEARANCE = 10;


	/**
	 * The meta object id for the '{@link featureSolution.PlacementPolicy <em>Placement Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.PlacementPolicy
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getPlacementPolicy()
	 * @generated
	 */
	int PLACEMENT_POLICY = 11;


	/**
	 * The meta object id for the '{@link featureSolution.ControlFlow <em>Control Flow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureSolution.ControlFlow
	 * @see featureSolution.impl.FeatureSolutionPackageImpl#getControlFlow()
	 * @generated
	 */
	int CONTROL_FLOW = 12;


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
	 * Returns the meta object for the containment reference list '{@link featureSolution.ExtensionInclusion#getPointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point Cut</em>'.
	 * @see featureSolution.ExtensionInclusion#getPointCut()
	 * @see #getExtensionInclusion()
	 * @generated
	 */
	EReference getExtensionInclusion_PointCut();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.ExtensionInclusion#getAdvice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advice</em>'.
	 * @see featureSolution.ExtensionInclusion#getAdvice()
	 * @see #getExtensionInclusion()
	 * @generated
	 */
	EReference getExtensionInclusion_Advice();

	/**
	 * Returns the meta object for the containment reference list '{@link featureSolution.ExtensionInclusion#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see featureSolution.ExtensionInclusion#getImports()
	 * @see #getExtensionInclusion()
	 * @generated
	 */
	EReference getExtensionInclusion_Imports();

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
	 * Returns the meta object for the reference '{@link featureSolution.Advice#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Completion</em>'.
	 * @see featureSolution.Advice#getCompletion()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_Completion();

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
	 * Returns the meta object for the reference '{@link featureSolution.Import#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repository</em>'.
	 * @see featureSolution.Import#getRepository()
	 * @see #getImport()
	 * @generated
	 */
	EReference getImport_Repository();

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
	 * Returns the meta object for enum '{@link featureSolution.PlacementPolicy <em>Placement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Placement Policy</em>'.
	 * @see featureSolution.PlacementPolicy
	 * @generated
	 */
	EEnum getPlacementPolicy();

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
		 * The meta object literal for the '{@link featureSolution.impl.ExtensionInclusionImpl <em>Extension Inclusion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.impl.ExtensionInclusionImpl
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getExtensionInclusion()
		 * @generated
		 */
		EClass EXTENSION_INCLUSION = eINSTANCE.getExtensionInclusion();

		/**
		 * The meta object literal for the '<em><b>Point Cut</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_INCLUSION__POINT_CUT = eINSTANCE.getExtensionInclusion_PointCut();

		/**
		 * The meta object literal for the '<em><b>Advice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_INCLUSION__ADVICE = eINSTANCE.getExtensionInclusion_Advice();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENSION_INCLUSION__IMPORTS = eINSTANCE.getExtensionInclusion_Imports();

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
		 * The meta object literal for the '<em><b>Completion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADVICE__COMPLETION = eINSTANCE.getAdvice_Completion();

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
		 * The meta object literal for the '<em><b>Repository</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT__REPOSITORY = eINSTANCE.getImport_Repository();

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
		 * The meta object literal for the '{@link featureSolution.PlacementPolicy <em>Placement Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureSolution.PlacementPolicy
		 * @see featureSolution.impl.FeatureSolutionPackageImpl#getPlacementPolicy()
		 * @generated
		 */
		EEnum PLACEMENT_POLICY = eINSTANCE.getPlacementPolicy();

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
