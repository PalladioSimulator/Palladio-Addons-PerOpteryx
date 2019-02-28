/**
 */
package placementDescription.impl;

import FeatureCompletionModel.FeatureCompletionPackage;

import FeatureCompletionModel.impl.FeatureCompletionPackageImpl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import featureObjective.FeatureObjectivePackage;

import featureObjective.impl.FeatureObjectivePackageImpl;

import featureSolution.FeatureSolutionPackage;

import featureSolution.impl.FeatureSolutionPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.core.entity.EntityPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

import placementDescription.Advice;
import placementDescription.ControlFlowPlacementStrategy;
import placementDescription.ExternalCallPlacementStrategy;
import placementDescription.FeatureList;
import placementDescription.FeatureSelection;
import placementDescription.Import;
import placementDescription.InternalActionPlacementStrategy;
import placementDescription.PlacementDescriptionFactory;
import placementDescription.PlacementDescriptionPackage;
import placementDescription.PlacementStrategy;
import placementDescription.PointCut;
import placementDescription.SelectedCV;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacementDescriptionPackageImpl extends EPackageImpl implements PlacementDescriptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalCallPlacementStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalActionPlacementStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowPlacementStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointCutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectedCVEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see placementDescription.PlacementDescriptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PlacementDescriptionPackageImpl() {
		super(eNS_URI, PlacementDescriptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PlacementDescriptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PlacementDescriptionPackage init() {
		if (isInited) return (PlacementDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(PlacementDescriptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPlacementDescriptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PlacementDescriptionPackageImpl thePlacementDescriptionPackage = registeredPlacementDescriptionPackage instanceof PlacementDescriptionPackageImpl ? (PlacementDescriptionPackageImpl)registeredPlacementDescriptionPackage : new PlacementDescriptionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI);
		FeatureCompletionPackageImpl theFeatureCompletionPackage = (FeatureCompletionPackageImpl)(registeredPackage instanceof FeatureCompletionPackageImpl ? registeredPackage : FeatureCompletionPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI);
		FeatureObjectivePackageImpl theFeatureObjectivePackage = (FeatureObjectivePackageImpl)(registeredPackage instanceof FeatureObjectivePackageImpl ? registeredPackage : FeatureObjectivePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FeatureSolutionPackage.eNS_URI);
		FeatureSolutionPackageImpl theFeatureSolutionPackage = (FeatureSolutionPackageImpl)(registeredPackage instanceof FeatureSolutionPackageImpl ? registeredPackage : FeatureSolutionPackage.eINSTANCE);

		// Create package meta-data objects
		thePlacementDescriptionPackage.createPackageContents();
		theFeatureCompletionPackage.createPackageContents();
		theFeatureObjectivePackage.createPackageContents();
		theFeatureSolutionPackage.createPackageContents();

		// Initialize created meta-data
		thePlacementDescriptionPackage.initializePackageContents();
		theFeatureCompletionPackage.initializePackageContents();
		theFeatureObjectivePackage.initializePackageContents();
		theFeatureSolutionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePlacementDescriptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PlacementDescriptionPackage.eNS_URI, thePlacementDescriptionPackage);
		return thePlacementDescriptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlacementStrategy() {
		return placementStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalCallPlacementStrategy() {
		return externalCallPlacementStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalCallPlacementStrategy_MatchingSignature() {
		return (EReference)externalCallPlacementStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalActionPlacementStrategy() {
		return internalActionPlacementStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalActionPlacementStrategy_ForAllInternalActionsIn() {
		return (EReference)internalActionPlacementStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlowPlacementStrategy() {
		return controlFlowPlacementStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlFlowPlacementStrategy_ForAllControlFlowsIn() {
		return (EReference)controlFlowPlacementStrategyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointCut() {
		return pointCutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointCut_PlacementStrategy() {
		return (EReference)pointCutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPointCut_Name() {
		return (EAttribute)pointCutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvice() {
		return adviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvice_PointCut() {
		return (EReference)adviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvice_Appears() {
		return (EAttribute)adviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvice_PlacementPolicy() {
		return (EAttribute)adviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportURI() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureSelection() {
		return featureSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSelection_Completion() {
		return (EReference)featureSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureSelection_FeatureLists() {
		return (EReference)featureSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureList() {
		return featureListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureList_Features() {
		return (EReference)featureListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectedCV() {
		return selectedCVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectedCV_Optional() {
		return (EAttribute)selectedCVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectedCV_ComplementumVisnetis() {
		return (EReference)selectedCVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementDescriptionFactory getPlacementDescriptionFactory() {
		return (PlacementDescriptionFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		placementStrategyEClass = createEClass(PLACEMENT_STRATEGY);

		externalCallPlacementStrategyEClass = createEClass(EXTERNAL_CALL_PLACEMENT_STRATEGY);
		createEReference(externalCallPlacementStrategyEClass, EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE);

		internalActionPlacementStrategyEClass = createEClass(INTERNAL_ACTION_PLACEMENT_STRATEGY);
		createEReference(internalActionPlacementStrategyEClass, INTERNAL_ACTION_PLACEMENT_STRATEGY__FOR_ALL_INTERNAL_ACTIONS_IN);

		controlFlowPlacementStrategyEClass = createEClass(CONTROL_FLOW_PLACEMENT_STRATEGY);
		createEReference(controlFlowPlacementStrategyEClass, CONTROL_FLOW_PLACEMENT_STRATEGY__FOR_ALL_CONTROL_FLOWS_IN);

		pointCutEClass = createEClass(POINT_CUT);
		createEReference(pointCutEClass, POINT_CUT__PLACEMENT_STRATEGY);
		createEAttribute(pointCutEClass, POINT_CUT__NAME);

		adviceEClass = createEClass(ADVICE);
		createEReference(adviceEClass, ADVICE__POINT_CUT);
		createEAttribute(adviceEClass, ADVICE__APPEARS);
		createEAttribute(adviceEClass, ADVICE__PLACEMENT_POLICY);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		featureSelectionEClass = createEClass(FEATURE_SELECTION);
		createEReference(featureSelectionEClass, FEATURE_SELECTION__COMPLETION);
		createEReference(featureSelectionEClass, FEATURE_SELECTION__FEATURE_LISTS);

		featureListEClass = createEClass(FEATURE_LIST);
		createEReference(featureListEClass, FEATURE_LIST__FEATURES);

		selectedCVEClass = createEClass(SELECTED_CV);
		createEAttribute(selectedCVEClass, SELECTED_CV__OPTIONAL);
		createEReference(selectedCVEClass, SELECTED_CV__COMPLEMENTUM_VISNETIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);
		FeatureSolutionPackage theFeatureSolutionPackage = (FeatureSolutionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureSolutionPackage.eNS_URI);
		FeatureCompletionPackage theFeatureCompletionPackage = (FeatureCompletionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		externalCallPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		internalActionPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		controlFlowPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		adviceEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		featureSelectionEClass.getESuperTypes().add(theEntityPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(placementStrategyEClass, PlacementStrategy.class, "PlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalCallPlacementStrategyEClass, ExternalCallPlacementStrategy.class, "ExternalCallPlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCallPlacementStrategy_MatchingSignature(), theRepositoryPackage.getSignature(), null, "matchingSignature", null, 0, 1, ExternalCallPlacementStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalActionPlacementStrategyEClass, InternalActionPlacementStrategy.class, "InternalActionPlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalActionPlacementStrategy_ForAllInternalActionsIn(), theRepositoryPackage.getRepositoryComponent(), null, "forAllInternalActionsIn", null, 0, 1, InternalActionPlacementStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowPlacementStrategyEClass, ControlFlowPlacementStrategy.class, "ControlFlowPlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlowPlacementStrategy_ForAllControlFlowsIn(), theRepositoryPackage.getRepositoryComponent(), null, "forAllControlFlowsIn", null, 0, 1, ControlFlowPlacementStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointCutEClass, PointCut.class, "PointCut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointCut_PlacementStrategy(), this.getPlacementStrategy(), null, "placementStrategy", null, 0, 1, PointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPointCut_Name(), ecorePackage.getEString(), "name", null, 0, 1, PointCut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adviceEClass, Advice.class, "Advice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvice_PointCut(), this.getPointCut(), null, "pointCut", null, 0, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvice_Appears(), theFeatureSolutionPackage.getAppearance(), "appears", "BEFORE", 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvice_PlacementPolicy(), theFeatureCompletionPackage.getPlacementPolicy(), "placementPolicy", "MANDATORY", 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSelectionEClass, FeatureSelection.class, "FeatureSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSelection_Completion(), theFeatureCompletionPackage.getFeatureCompletion(), null, "Completion", null, 1, 1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSelection_FeatureLists(), this.getFeatureList(), null, "featureLists", null, 1, -1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureListEClass, FeatureList.class, "FeatureList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureList_Features(), this.getSelectedCV(), null, "features", null, 1, -1, FeatureList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectedCVEClass, SelectedCV.class, "SelectedCV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSelectedCV_Optional(), ecorePackage.getEBoolean(), "optional", "false", 1, 1, SelectedCV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectedCV_ComplementumVisnetis(), theFeatureCompletionPackage.getComplementumVisnetis(), null, "complementumVisnetis", null, 1, 1, SelectedCV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PlacementDescriptionPackageImpl
