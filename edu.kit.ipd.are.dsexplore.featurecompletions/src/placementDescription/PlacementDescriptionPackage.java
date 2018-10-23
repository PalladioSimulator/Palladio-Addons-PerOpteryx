/**
 */
package placementDescription;

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
 * @see placementDescription.PlacementDescriptionFactory
 * @model kind="package"
 * @generated
 */
public interface PlacementDescriptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "placementDescription";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://are.ipd.kit.edu/PlacementDescriptionModel/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "placementDescription";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlacementDescriptionPackage eINSTANCE = placementDescription.impl.PlacementDescriptionPackageImpl.init();

	/**
	 * The meta object id for the '{@link placementDescription.impl.PlacementStrategyImpl <em>Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.PlacementStrategyImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getPlacementStrategy()
	 * @generated
	 */
	int PLACEMENT_STRATEGY = 0;

	/**
	 * The number of structural features of the '<em>Placement Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMENT_STRATEGY_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link placementDescription.impl.ExternalCallPlacementStrategyImpl <em>External Call Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.ExternalCallPlacementStrategyImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getExternalCallPlacementStrategy()
	 * @generated
	 */
	int EXTERNAL_CALL_PLACEMENT_STRATEGY = 1;

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
	 * The meta object id for the '{@link placementDescription.impl.InternalActionPlacementStrategyImpl <em>Internal Action Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.InternalActionPlacementStrategyImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getInternalActionPlacementStrategy()
	 * @generated
	 */
	int INTERNAL_ACTION_PLACEMENT_STRATEGY = 2;

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
	 * The meta object id for the '{@link placementDescription.impl.ControlFlowPlacementStrategyImpl <em>Control Flow Placement Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.ControlFlowPlacementStrategyImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getControlFlowPlacementStrategy()
	 * @generated
	 */
	int CONTROL_FLOW_PLACEMENT_STRATEGY = 3;

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
	 * The meta object id for the '{@link placementDescription.impl.PointCutImpl <em>Point Cut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.PointCutImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getPointCut()
	 * @generated
	 */
	int POINT_CUT = 4;

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
	 * The meta object id for the '{@link placementDescription.impl.AdviceImpl <em>Advice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.AdviceImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getAdvice()
	 * @generated
	 */
	int ADVICE = 5;

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
	 * The meta object id for the '{@link placementDescription.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.ImportImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 6;

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
	 * The meta object id for the '{@link placementDescription.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.FeatureSelectionImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getFeatureSelection()
	 * @generated
	 */
	int FEATURE_SELECTION = 7;

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
	 * The meta object id for the '{@link placementDescription.impl.FeatureListImpl <em>Feature List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.FeatureListImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getFeatureList()
	 * @generated
	 */
	int FEATURE_LIST = 8;

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
	 * The meta object id for the '{@link placementDescription.impl.SelectedCVImpl <em>Selected CV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see placementDescription.impl.SelectedCVImpl
	 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getSelectedCV()
	 * @generated
	 */
	int SELECTED_CV = 9;

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
	 * Returns the meta object for class '{@link placementDescription.PlacementStrategy <em>Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placement Strategy</em>'.
	 * @see placementDescription.PlacementStrategy
	 * @generated
	 */
	EClass getPlacementStrategy();

	/**
	 * Returns the meta object for class '{@link placementDescription.ExternalCallPlacementStrategy <em>External Call Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Call Placement Strategy</em>'.
	 * @see placementDescription.ExternalCallPlacementStrategy
	 * @generated
	 */
	EClass getExternalCallPlacementStrategy();

	/**
	 * Returns the meta object for the reference '{@link placementDescription.ExternalCallPlacementStrategy#getMatchingSignature <em>Matching Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Matching Signature</em>'.
	 * @see placementDescription.ExternalCallPlacementStrategy#getMatchingSignature()
	 * @see #getExternalCallPlacementStrategy()
	 * @generated
	 */
	EReference getExternalCallPlacementStrategy_MatchingSignature();

	/**
	 * Returns the meta object for class '{@link placementDescription.InternalActionPlacementStrategy <em>Internal Action Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Action Placement Strategy</em>'.
	 * @see placementDescription.InternalActionPlacementStrategy
	 * @generated
	 */
	EClass getInternalActionPlacementStrategy();

	/**
	 * Returns the meta object for the reference '{@link placementDescription.InternalActionPlacementStrategy#getForAllInternalActionsIn <em>For All Internal Actions In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For All Internal Actions In</em>'.
	 * @see placementDescription.InternalActionPlacementStrategy#getForAllInternalActionsIn()
	 * @see #getInternalActionPlacementStrategy()
	 * @generated
	 */
	EReference getInternalActionPlacementStrategy_ForAllInternalActionsIn();

	/**
	 * Returns the meta object for class '{@link placementDescription.ControlFlowPlacementStrategy <em>Control Flow Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Placement Strategy</em>'.
	 * @see placementDescription.ControlFlowPlacementStrategy
	 * @generated
	 */
	EClass getControlFlowPlacementStrategy();

	/**
	 * Returns the meta object for the reference '{@link placementDescription.ControlFlowPlacementStrategy#getForAllControlFlowsIn <em>For All Control Flows In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>For All Control Flows In</em>'.
	 * @see placementDescription.ControlFlowPlacementStrategy#getForAllControlFlowsIn()
	 * @see #getControlFlowPlacementStrategy()
	 * @generated
	 */
	EReference getControlFlowPlacementStrategy_ForAllControlFlowsIn();

	/**
	 * Returns the meta object for class '{@link placementDescription.PointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Cut</em>'.
	 * @see placementDescription.PointCut
	 * @generated
	 */
	EClass getPointCut();

	/**
	 * Returns the meta object for the containment reference '{@link placementDescription.PointCut#getPlacementStrategy <em>Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placement Strategy</em>'.
	 * @see placementDescription.PointCut#getPlacementStrategy()
	 * @see #getPointCut()
	 * @generated
	 */
	EReference getPointCut_PlacementStrategy();

	/**
	 * Returns the meta object for the attribute '{@link placementDescription.PointCut#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see placementDescription.PointCut#getName()
	 * @see #getPointCut()
	 * @generated
	 */
	EAttribute getPointCut_Name();

	/**
	 * Returns the meta object for class '{@link placementDescription.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advice</em>'.
	 * @see placementDescription.Advice
	 * @generated
	 */
	EClass getAdvice();

	/**
	 * Returns the meta object for the reference '{@link placementDescription.Advice#getPointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Point Cut</em>'.
	 * @see placementDescription.Advice#getPointCut()
	 * @see #getAdvice()
	 * @generated
	 */
	EReference getAdvice_PointCut();

	/**
	 * Returns the meta object for the attribute '{@link placementDescription.Advice#getAppears <em>Appears</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appears</em>'.
	 * @see placementDescription.Advice#getAppears()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_Appears();

	/**
	 * Returns the meta object for the attribute '{@link placementDescription.Advice#getPlacementPolicy <em>Placement Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placement Policy</em>'.
	 * @see placementDescription.Advice#getPlacementPolicy()
	 * @see #getAdvice()
	 * @generated
	 */
	EAttribute getAdvice_PlacementPolicy();

	/**
	 * Returns the meta object for class '{@link placementDescription.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see placementDescription.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link placementDescription.Import#getImportURI <em>Import URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import URI</em>'.
	 * @see placementDescription.Import#getImportURI()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportURI();

	/**
	 * Returns the meta object for class '{@link placementDescription.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Selection</em>'.
	 * @see placementDescription.FeatureSelection
	 * @generated
	 */
	EClass getFeatureSelection();

	/**
	 * Returns the meta object for the reference '{@link placementDescription.FeatureSelection#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Completion</em>'.
	 * @see placementDescription.FeatureSelection#getCompletion()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_Completion();

	/**
	 * Returns the meta object for the containment reference list '{@link placementDescription.FeatureSelection#getFeatureLists <em>Feature Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Lists</em>'.
	 * @see placementDescription.FeatureSelection#getFeatureLists()
	 * @see #getFeatureSelection()
	 * @generated
	 */
	EReference getFeatureSelection_FeatureLists();

	/**
	 * Returns the meta object for class '{@link placementDescription.FeatureList <em>Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature List</em>'.
	 * @see placementDescription.FeatureList
	 * @generated
	 */
	EClass getFeatureList();

	/**
	 * Returns the meta object for the containment reference list '{@link placementDescription.FeatureList#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see placementDescription.FeatureList#getFeatures()
	 * @see #getFeatureList()
	 * @generated
	 */
	EReference getFeatureList_Features();

	/**
	 * Returns the meta object for class '{@link placementDescription.SelectedCV <em>Selected CV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selected CV</em>'.
	 * @see placementDescription.SelectedCV
	 * @generated
	 */
	EClass getSelectedCV();

	/**
	 * Returns the meta object for the attribute '{@link placementDescription.SelectedCV#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see placementDescription.SelectedCV#isOptional()
	 * @see #getSelectedCV()
	 * @generated
	 */
	EAttribute getSelectedCV_Optional();

	/**
	 * Returns the meta object for the reference '{@link placementDescription.SelectedCV#getComplementumVisnetis <em>Complementum Visnetis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Complementum Visnetis</em>'.
	 * @see placementDescription.SelectedCV#getComplementumVisnetis()
	 * @see #getSelectedCV()
	 * @generated
	 */
	EReference getSelectedCV_ComplementumVisnetis();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlacementDescriptionFactory getPlacementDescriptionFactory();

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
		 * The meta object literal for the '{@link placementDescription.impl.PlacementStrategyImpl <em>Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.PlacementStrategyImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getPlacementStrategy()
		 * @generated
		 */
		EClass PLACEMENT_STRATEGY = eINSTANCE.getPlacementStrategy();

		/**
		 * The meta object literal for the '{@link placementDescription.impl.ExternalCallPlacementStrategyImpl <em>External Call Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.ExternalCallPlacementStrategyImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getExternalCallPlacementStrategy()
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
		 * The meta object literal for the '{@link placementDescription.impl.InternalActionPlacementStrategyImpl <em>Internal Action Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.InternalActionPlacementStrategyImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getInternalActionPlacementStrategy()
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
		 * The meta object literal for the '{@link placementDescription.impl.ControlFlowPlacementStrategyImpl <em>Control Flow Placement Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.ControlFlowPlacementStrategyImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getControlFlowPlacementStrategy()
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
		 * The meta object literal for the '{@link placementDescription.impl.PointCutImpl <em>Point Cut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.PointCutImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getPointCut()
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
		 * The meta object literal for the '{@link placementDescription.impl.AdviceImpl <em>Advice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.AdviceImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getAdvice()
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
		 * The meta object literal for the '{@link placementDescription.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.ImportImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getImport()
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
		 * The meta object literal for the '{@link placementDescription.impl.FeatureSelectionImpl <em>Feature Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.FeatureSelectionImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getFeatureSelection()
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
		 * The meta object literal for the '{@link placementDescription.impl.FeatureListImpl <em>Feature List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.FeatureListImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getFeatureList()
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
		 * The meta object literal for the '{@link placementDescription.impl.SelectedCVImpl <em>Selected CV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see placementDescription.impl.SelectedCVImpl
		 * @see placementDescription.impl.PlacementDescriptionPackageImpl#getSelectedCV()
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

	}

} //PlacementDescriptionPackage
