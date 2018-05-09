/**
 */
package featureSolution.impl;

import FeatureCompletionModel.FeatureCompletionPackage;

import FeatureCompletionModel.impl.FeatureCompletionPackageImpl;
import featureObjective.FeatureObjectivePackage;

import featureObjective.impl.FeatureObjectivePackageImpl;

import featureSolution.AdapterInclusion;
import featureSolution.Appearance;
import featureSolution.ControlFlowPlacementStrategy;
import featureSolution.ExtensionInclusion;
import featureSolution.ExternalCallPlacementStrategy;
import featureSolution.FeatureSolutionFactory;
import featureSolution.FeatureSolutionPackage;
import featureSolution.InclusionMechanism;

import featureSolution.InternalActionPlacementStrategy;
import featureSolution.PlacementPolicy;
import featureSolution.PlacementStrategy;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.seff.SeffPackage;

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
	private EEnum appearanceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placementPolicyEEnum = null;

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
	public EAttribute getExtensionInclusion_Appears() {
		return (EAttribute)extensionInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionInclusion_PlacementStrategy() {
		return (EReference)extensionInclusionEClass.getEStructuralFeatures().get(1);
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
	public EReference getInternalActionPlacementStrategy_MatchingInternalAction() {
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
	public EReference getControlFlowPlacementStrategy_MatchingControlFlow() {
		return (EReference)controlFlowPlacementStrategyEClass.getEStructuralFeatures().get(0);
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
		createEAttribute(extensionInclusionEClass, EXTENSION_INCLUSION__APPEARS);
		createEReference(extensionInclusionEClass, EXTENSION_INCLUSION__PLACEMENT_STRATEGY);

		placementStrategyEClass = createEClass(PLACEMENT_STRATEGY);

		externalCallPlacementStrategyEClass = createEClass(EXTERNAL_CALL_PLACEMENT_STRATEGY);
		createEReference(externalCallPlacementStrategyEClass, EXTERNAL_CALL_PLACEMENT_STRATEGY__MATCHING_SIGNATURE);

		internalActionPlacementStrategyEClass = createEClass(INTERNAL_ACTION_PLACEMENT_STRATEGY);
		createEReference(internalActionPlacementStrategyEClass, INTERNAL_ACTION_PLACEMENT_STRATEGY__MATCHING_INTERNAL_ACTION);

		controlFlowPlacementStrategyEClass = createEClass(CONTROL_FLOW_PLACEMENT_STRATEGY);
		createEReference(controlFlowPlacementStrategyEClass, CONTROL_FLOW_PLACEMENT_STRATEGY__MATCHING_CONTROL_FLOW);

		// Create enums
		appearanceEEnum = createEEnum(APPEARANCE);
		placementPolicyEEnum = createEEnum(PLACEMENT_POLICY);
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
		SeffPackage theSeffPackage = (SeffPackage)EPackage.Registry.INSTANCE.getEPackage(SeffPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inclusionMechanismEClass.getESuperTypes().add(theFeatureCompletionPackage.getDescribedElement());
		adapterInclusionEClass.getESuperTypes().add(this.getInclusionMechanism());
		extensionInclusionEClass.getESuperTypes().add(this.getInclusionMechanism());
		externalCallPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		internalActionPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());
		controlFlowPlacementStrategyEClass.getESuperTypes().add(this.getPlacementStrategy());

		// Initialize classes and features; add operations and parameters
		initEClass(inclusionMechanismEClass, InclusionMechanism.class, "InclusionMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclusionMechanism_Multiple(), theEcorePackage.getEBoolean(), "multiple", null, 0, 1, InclusionMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapterInclusionEClass, AdapterInclusion.class, "AdapterInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdapterInclusion_Appears(), this.getAppearance(), "appears", "BEFORE", 1, 1, AdapterInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionInclusionEClass, ExtensionInclusion.class, "ExtensionInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionInclusion_Appears(), this.getAppearance(), "appears", "BEFORE", 1, 1, ExtensionInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtensionInclusion_PlacementStrategy(), this.getPlacementStrategy(), null, "placementStrategy", null, 0, -1, ExtensionInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placementStrategyEClass, PlacementStrategy.class, "PlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalCallPlacementStrategyEClass, ExternalCallPlacementStrategy.class, "ExternalCallPlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalCallPlacementStrategy_MatchingSignature(), theRepositoryPackage.getSignature(), null, "matchingSignature", null, 0, 1, ExternalCallPlacementStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalActionPlacementStrategyEClass, InternalActionPlacementStrategy.class, "InternalActionPlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInternalActionPlacementStrategy_MatchingInternalAction(), theSeffPackage.getInternalAction(), null, "matchingInternalAction", null, 0, 1, InternalActionPlacementStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlFlowPlacementStrategyEClass, ControlFlowPlacementStrategy.class, "ControlFlowPlacementStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlFlowPlacementStrategy_MatchingControlFlow(), theSeffPackage.getAbstractLoopAction(), null, "matchingControlFlow", null, 0, 1, ControlFlowPlacementStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(appearanceEEnum, Appearance.class, "Appearance");
		addEEnumLiteral(appearanceEEnum, Appearance.BEFORE);
		addEEnumLiteral(appearanceEEnum, Appearance.AFTER);
		addEEnumLiteral(appearanceEEnum, Appearance.AROUND);

		initEEnum(placementPolicyEEnum, PlacementPolicy.class, "PlacementPolicy");
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.MANDATORY);
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.OBLIGATORY);
		addEEnumLiteral(placementPolicyEEnum, PlacementPolicy.PROHIBITED);

		// Create resource
		createResource(eNS_URI);
	}

} //FeatureSolutionPackageImpl
