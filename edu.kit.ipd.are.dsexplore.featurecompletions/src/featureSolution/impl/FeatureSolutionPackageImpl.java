/**
 */
package featureSolution.impl;

import FeatureCompletionModel.FeatureCompletionPackage;

import FeatureCompletionModel.impl.FeatureCompletionPackageImpl;

import featureObjective.FeatureObjectivePackage;

import featureObjective.impl.FeatureObjectivePackageImpl;

import featureSolution.AdapterInclusion;
import featureSolution.Appearance;
import featureSolution.BehaviourInclusion;
import featureSolution.FeatureSolutionFactory;
import featureSolution.FeatureSolutionPackage;
import featureSolution.InclusionMechanism;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import placementDescription.PlacementDescriptionPackage;

import placementDescription.impl.PlacementDescriptionPackageImpl;

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
	private EClass behaviourInclusionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum appearanceEEnum = null;

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
		PlacementDescriptionPackageImpl thePlacementDescriptionPackage = (PlacementDescriptionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PlacementDescriptionPackage.eNS_URI) instanceof PlacementDescriptionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PlacementDescriptionPackage.eNS_URI) : PlacementDescriptionPackage.eINSTANCE);

		// Create package meta-data objects
		theFeatureSolutionPackage.createPackageContents();
		theFeatureCompletionPackage.createPackageContents();
		theFeatureObjectivePackage.createPackageContents();
		thePlacementDescriptionPackage.createPackageContents();

		// Initialize created meta-data
		theFeatureSolutionPackage.initializePackageContents();
		theFeatureCompletionPackage.initializePackageContents();
		theFeatureObjectivePackage.initializePackageContents();
		thePlacementDescriptionPackage.initializePackageContents();

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
	public EClass getBehaviourInclusion() {
		return behaviourInclusionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourInclusion_PointCut() {
		return (EReference)behaviourInclusionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourInclusion_Advice() {
		return (EReference)behaviourInclusionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourInclusion_Imports() {
		return (EReference)behaviourInclusionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviourInclusion_FeatureCompletion() {
		return (EReference)behaviourInclusionEClass.getEStructuralFeatures().get(3);
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

		behaviourInclusionEClass = createEClass(BEHAVIOUR_INCLUSION);
		createEReference(behaviourInclusionEClass, BEHAVIOUR_INCLUSION__POINT_CUT);
		createEReference(behaviourInclusionEClass, BEHAVIOUR_INCLUSION__ADVICE);
		createEReference(behaviourInclusionEClass, BEHAVIOUR_INCLUSION__IMPORTS);
		createEReference(behaviourInclusionEClass, BEHAVIOUR_INCLUSION__FEATURE_COMPLETION);

		// Create enums
		appearanceEEnum = createEEnum(APPEARANCE);
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
		PlacementDescriptionPackage thePlacementDescriptionPackage = (PlacementDescriptionPackage)EPackage.Registry.INSTANCE.getEPackage(PlacementDescriptionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inclusionMechanismEClass.getESuperTypes().add(theFeatureCompletionPackage.getDescribedElement());
		adapterInclusionEClass.getESuperTypes().add(this.getInclusionMechanism());
		behaviourInclusionEClass.getESuperTypes().add(this.getInclusionMechanism());

		// Initialize classes and features; add operations and parameters
		initEClass(inclusionMechanismEClass, InclusionMechanism.class, "InclusionMechanism", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInclusionMechanism_Multiple(), theEcorePackage.getEBoolean(), "multiple", "false", 0, 1, InclusionMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adapterInclusionEClass, AdapterInclusion.class, "AdapterInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdapterInclusion_Appears(), this.getAppearance(), "appears", "BEFORE", 1, 1, AdapterInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviourInclusionEClass, BehaviourInclusion.class, "BehaviourInclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviourInclusion_PointCut(), thePlacementDescriptionPackage.getPointCut(), null, "pointCut", null, 0, -1, BehaviourInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourInclusion_Advice(), thePlacementDescriptionPackage.getAdvice(), null, "advice", null, 0, -1, BehaviourInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourInclusion_Imports(), thePlacementDescriptionPackage.getImport(), null, "imports", null, 0, -1, BehaviourInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviourInclusion_FeatureCompletion(), thePlacementDescriptionPackage.getFeatureSelection(), null, "featureCompletion", null, 1, 1, BehaviourInclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(appearanceEEnum, Appearance.class, "Appearance");
		addEEnumLiteral(appearanceEEnum, Appearance.BEFORE);
		addEEnumLiteral(appearanceEEnum, Appearance.AFTER);
		addEEnumLiteral(appearanceEEnum, Appearance.AROUND);

		// Create resource
		createResource(eNS_URI);
	}

} //FeatureSolutionPackageImpl
