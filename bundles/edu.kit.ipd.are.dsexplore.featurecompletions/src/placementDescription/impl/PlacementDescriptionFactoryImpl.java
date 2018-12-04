/**
 */
package placementDescription.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import placementDescription.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacementDescriptionFactoryImpl extends EFactoryImpl implements PlacementDescriptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlacementDescriptionFactory init() {
		try {
			PlacementDescriptionFactory thePlacementDescriptionFactory = (PlacementDescriptionFactory)EPackage.Registry.INSTANCE.getEFactory(PlacementDescriptionPackage.eNS_URI);
			if (thePlacementDescriptionFactory != null) {
				return thePlacementDescriptionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PlacementDescriptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementDescriptionFactoryImpl() {
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
			case PlacementDescriptionPackage.PLACEMENT_STRATEGY: return createPlacementStrategy();
			case PlacementDescriptionPackage.EXTERNAL_CALL_PLACEMENT_STRATEGY: return createExternalCallPlacementStrategy();
			case PlacementDescriptionPackage.INTERNAL_ACTION_PLACEMENT_STRATEGY: return createInternalActionPlacementStrategy();
			case PlacementDescriptionPackage.CONTROL_FLOW_PLACEMENT_STRATEGY: return createControlFlowPlacementStrategy();
			case PlacementDescriptionPackage.POINT_CUT: return createPointCut();
			case PlacementDescriptionPackage.ADVICE: return createAdvice();
			case PlacementDescriptionPackage.IMPORT: return createImport();
			case PlacementDescriptionPackage.FEATURE_SELECTION: return createFeatureSelection();
			case PlacementDescriptionPackage.FEATURE_LIST: return createFeatureList();
			case PlacementDescriptionPackage.SELECTED_CV: return createSelectedCV();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
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
	public PlacementDescriptionPackage getPlacementDescriptionPackage() {
		return (PlacementDescriptionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PlacementDescriptionPackage getPackage() {
		return PlacementDescriptionPackage.eINSTANCE;
	}

} //PlacementDescriptionFactoryImpl
