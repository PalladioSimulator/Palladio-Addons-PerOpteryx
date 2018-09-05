/**
 */
package featureSolution.impl;

import featureSolution.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureSolutionFactoryImpl extends EFactoryImpl implements FeatureSolutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureSolutionFactory init() {
		try {
			FeatureSolutionFactory theFeatureSolutionFactory = (FeatureSolutionFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureSolutionPackage.eNS_URI);
			if (theFeatureSolutionFactory != null) {
				return theFeatureSolutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureSolutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSolutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FeatureSolutionPackage.ADAPTER_INCLUSION: return createAdapterInclusion();
			case FeatureSolutionPackage.BEHAVIOUR_INCLUSION: return createBehaviourInclusion();
			case FeatureSolutionPackage.PLACEMENT_STRATEGY: return createPlacementStrategy();
			case FeatureSolutionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY: return createExternalCallPlacementStrategy();
			case FeatureSolutionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY: return createInternalActionPlacementStrategy();
			case FeatureSolutionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY: return createControlFlowPlacementStrategy();
			case FeatureSolutionPackage.POINT_CUT: return createPointCut();
			case FeatureSolutionPackage.ADVICE: return createAdvice();
			case FeatureSolutionPackage.IMPORT: return createImport();
			case FeatureSolutionPackage.FEATURE_SELECTION: return createFeatureSelection();
			case FeatureSolutionPackage.FEATURE_LIST: return createFeatureList();
			case FeatureSolutionPackage.SELECTED_CV: return createSelectedCV();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureSolutionPackage.APPEARANCE:
				return createAppearanceFromString(eDataType, initialValue);
			case FeatureSolutionPackage.CONTROL_FLOW:
				return createControlFlowFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureSolutionPackage.APPEARANCE:
				return convertAppearanceToString(eDataType, instanceValue);
			case FeatureSolutionPackage.CONTROL_FLOW:
				return convertControlFlowToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdapterInclusion createAdapterInclusion() {
		AdapterInclusionImpl adapterInclusion = new AdapterInclusionImpl();
		return adapterInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourInclusion createBehaviourInclusion() {
		BehaviourInclusionImpl behaviourInclusion = new BehaviourInclusionImpl();
		return behaviourInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementStrategy createPlacementStrategy() {
		PlacementStrategyImpl placementStrategy = new PlacementStrategyImpl();
		return placementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCallPlacementStrategy createExternalCallPlacementStrategy() {
		ExternalCallPlacementStrategyImpl externalCallPlacementStrategy = new ExternalCallPlacementStrategyImpl();
		return externalCallPlacementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalActionPlacementStrategy createInternalActionPlacementStrategy() {
		InternalActionPlacementStrategyImpl internalActionPlacementStrategy = new InternalActionPlacementStrategyImpl();
		return internalActionPlacementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowPlacementStrategy createControlFlowPlacementStrategy() {
		ControlFlowPlacementStrategyImpl controlFlowPlacementStrategy = new ControlFlowPlacementStrategyImpl();
		return controlFlowPlacementStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCut createPointCut() {
		PointCutImpl pointCut = new PointCutImpl();
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advice createAdvice() {
		AdviceImpl advice = new AdviceImpl();
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSelection createFeatureSelection() {
		FeatureSelectionImpl featureSelection = new FeatureSelectionImpl();
		return featureSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureList createFeatureList() {
		FeatureListImpl featureList = new FeatureListImpl();
		return featureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedCV createSelectedCV() {
		SelectedCVImpl selectedCV = new SelectedCVImpl();
		return selectedCV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appearance createAppearanceFromString(EDataType eDataType, String initialValue) {
		Appearance result = Appearance.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAppearanceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow createControlFlowFromString(EDataType eDataType, String initialValue) {
		ControlFlow result = ControlFlow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertControlFlowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSolutionPackage getFeatureSolutionPackage() {
		return (FeatureSolutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureSolutionPackage getPackage() {
		return FeatureSolutionPackage.eINSTANCE;
	}

} //FeatureSolutionFactoryImpl
