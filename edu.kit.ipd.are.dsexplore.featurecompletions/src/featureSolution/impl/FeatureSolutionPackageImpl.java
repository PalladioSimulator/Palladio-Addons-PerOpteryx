/**
 */
package featureSolution.impl;

import FeatureCompletionModel.FeatureCompletionPackage;

import FeatureCompletionModel.impl.FeatureCompletionPackageImpl;
import featureObjective.FeatureObjectivePackage;

import featureObjective.impl.FeatureObjectivePackageImpl;

import featureSolution.AdapterInclusion;
import featureSolution.Advice;
import featureSolution.Appearance;
import featureSolution.ControlFlow;
import featureSolution.ControlFlowPlacementStrategy;
import featureSolution.ExtensionInclusion;
import featureSolution.ExternalCallPlacementStrategy;
import featureSolution.FeatureSelection;
import featureSolution.FeatureSolutionFactory;
import featureSolution.FeatureSolutionPackage;
import featureSolution.Import;
import featureSolution.InclusionMechanism;

import featureSolution.InternalActionPlacementStrategy;
import featureSolution.PlacementPolicy;
import featureSolution.PlacementStrategy;
import featureSolution.PointCut;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureSolutionPackageImpl extends EPackageImpl implements FeatureSolutionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusionMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adapterInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionInclusionEClass = null;

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
	private EEnum appearanceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placementPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlFlowEEnum = null;

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
	 * @see featureSolution.FeatureSolutionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FeatureSolutionPackageImpl() {
		super(eNS_URI, FeatureSolutionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FeatureSolutionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FeatureSolutionPackage init() {
		if (isInited) return (FeatureSolutionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureSolutionPackage.eNS_URI);

		// Obtain or create and register package
		FeatureSolutionPackageImpl theFeatureSolutionPackage = (FeatureSolutionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FeatureSolutionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FeatureSolutionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		PcmPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		FeatureCompletionPackageImpl theFeatureCompletionPackage = (FeatureCompletionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI) instanceof FeatureCompletionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI) : FeatureCompletionPackage.eINSTANCE);
		FeatureObjectivePackageImpl theFeatureObjectivePackage = (FeatureObjectivePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI) instanceof FeatureObjectivePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeatureObjectivePackage.eNS_URI) : FeatureObjectivePackage.eINSTANCE);

		// Create package meta-data objects
		theFeatureSolutionPackage.createPackageContents();
		theFeatureCompletionPackage.createPackageContents();
		theFeatureObjectivePackage.createPackageContents();

		// Initialize created meta-data
		theFeatureSolutionPackage.initializePackageContents();
		theFeatureCompletionPackage.initializePackageContents();
		theFeatureObjectivePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFeatureSolutionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FeatureSolutionPackage.eNS_URI, theFeatureSolutionPackage);
		return theFeatureSolutionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusionMechanism() {
		return inclusionMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInclusionMechanism_Multiple() {
		return (EAttribute)inclusionMechanismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdapterInclusion() {
		return adapterInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdapterInclusion_Appears() {
		return (EAttribute)adapterInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionInclusion() {
		return extensionInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionInclusion_PointCut() {
		return (EReference)extensionInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionInclusion_Advice() {
		return (EReference)extensionInclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionInclusion_Imports() {
		return (EReference)extensionInclusionEClass.getEStructuralFeatures().get(2);
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
	public EReference getAdvice_Completion() {
		return (EReference)adviceEClass.getEStructuralFeatures().get(2);
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
	public EReference getFeatureSelection_Features() {
		return (EReference)featureSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAppearance() {
		return appearanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlacementPolicy() {
		return placementPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlFlow() {
		return controlFlowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSolutionFactory getFeatureSolutionFactory() {
		return (FeatureSolutionFactory)getEFactoryInstance();
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
		inclusionMechanismEClass = createEClass(INCLUSION_MECHANISM);
		createEAttribute(inclusionMechanismEClass, INCLUSION_MECHANISM__MULTIPLE);

		adapterInclusionEClass = createEClass(ADAPTER_INCLUSION);
		createEAttribute(adapterInclusionEClass, ADAPTER_INCLUSION__APPEARS);

		extensionInclusionEClass = createEClass(EXTENSION_INCLUSION);
		createEReference(extensionInclusionEClass, EXTENSION_INCLUSION__POINT_CUT);
		createEReference(extensionInclusionEClass, EXTENSION_INCLUSION__ADVICE);
		createEReference(extensionInclusionEClass, EXTENSION_INCLUSION__IMPORTS);

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
		createEReference(adviceEClass, ADVICE__COMPLETION);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__IMPORT_URI);

		featureSelectionEClass = createEClass(FEATURE_SELECTION);
		createEReference(featureSelectionEClass, FEATURE_SELECTION__COMPLETION);
		createEReference(featureSelectionEClass, FEATURE_SELECTION__FEATURES);

		// Create enums
		appearanceEEnum = createEEnum(APPEARANCE);
		placementPolicyEEnum = createEEnum(PLACEMENT_POLICY);
		controlFlowEEnum = createEEnum(CONTROL_FLOW);
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
		FeatureCompletionPackage theFeatureCompletionPackage = (FeatureCompletionPackage)EPackage.Registry.INSTANCE.getEPackage(FeatureCompletionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage)EPackage.Registry.INSTANCE.getEPackage(RepositoryPackage.eNS_URI);
		EntityPackage theEntityPackage = (EntityPackage)EPackage.Registry.INSTANCE.getEPackage(EntityPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inclusionMechanismEClass.getESuperTypes().add(theFeatureCompletionPackage.getDescribedElement());
		adapterInclusionEClass.getESuperTypes().add(this.getInclusionMechanism());
		extensionInclusionEClass.getESuperTypes().add(this.getInclusionMechanism());
		externalCallPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		internalActionPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		controlFlowPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		adviceEClass.getESuperTypes().add(theEntityPackage.getNamedElement());
		featureSelectionEClass.getESuperTypes().add(theEntityPackage.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(inclusionMechanismEClass, InclusionMechanism.class, "InclusionMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclusionMechanism_Multiple(), theEcorePackage.getEBoolean(), "multiple", "false", 0, 1, InclusionMechanism.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapterInclusionEClass, AdapterInclusion.class, "AdapterInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdapterInclusion_Appears(), this.getAppearance(), "appears", "BEFORE", 1, 1, AdapterInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionInclusionEClass, ExtensionInclusion.class, "ExtensionInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionInclusion_PointCut(), this.getPointCut(), null, "pointCut", null, 0, -1, ExtensionInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionInclusion_Advice(), this.getAdvice(), null, "advice", null, 0, -1, ExtensionInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionInclusion_Imports(), this.getImport(), null, "imports", null, 0, -1, ExtensionInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		initEAttribute(getAdvice_Appears(), this.getAppearance(), "appears", "BEFORE", 1, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdvice_Completion(), this.getFeatureSelection(), null, "Completion", null, 0, 1, Advice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureSelectionEClass, FeatureSelection.class, "FeatureSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureSelection_Completion(), theFeatureCompletionPackage.getFeatureCompletion(), null, "Completion", null, 1, 1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureSelection_Features(), theFeatureCompletionPackage.getComplementumVisnetis(), null, "Features", null, 1, -1, FeatureSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(appearanceEEnum, Appearance.class, "Appearance");
		addEEnumLiteral(appearanceEEnum, Appearance.BEFORE);
		addEEnumLiteral(appearanceEEnum, Appearance.AFTER);
		addEEnumLiteral(appearanceEEnum, Appearance.AROUND);

		initEEnum(placementPolicyEEnum, PlacementPolicy.class, "PlacementPolicy");
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.MANDATORY);
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.OBLIGATORY);
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.PROHIBITED);

		initEEnum(controlFlowEEnum, ControlFlow.class, "ControlFlow");
		addEEnumLiteral(controlFlowEEnum, ControlFlow.LOOP);
		addEEnumLiteral(controlFlowEEnum, ControlFlow.BRANCH);

		// Create resource
		createResource(eNS_URI);
	}

} //FeatureSolutionPackageImpl
