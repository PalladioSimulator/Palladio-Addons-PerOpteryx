/**
 */
package placementDescription.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.NamedElement;

import placementDescription.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see placementDescription.PlacementDescriptionPackage
 * @generated
 */
public class PlacementDescriptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PlacementDescriptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementDescriptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PlacementDescriptionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementDescriptionSwitch<Adapter> modelSwitch =
		new PlacementDescriptionSwitch<Adapter>() {
			@Override
			public Adapter casePlacementStrategy(PlacementStrategy object) {
				return createPlacementStrategyAdapter();
			}
			@Override
			public Adapter caseExternalCallPlacementStrategy(ExternalCallPlacementStrategy object) {
				return createExternalCallPlacementStrategyAdapter();
			}
			@Override
			public Adapter caseInternalActionPlacementStrategy(InternalActionPlacementStrategy object) {
				return createInternalActionPlacementStrategyAdapter();
			}
			@Override
			public Adapter caseControlFlowPlacementStrategy(ControlFlowPlacementStrategy object) {
				return createControlFlowPlacementStrategyAdapter();
			}
			@Override
			public Adapter casePointCut(PointCut object) {
				return createPointCutAdapter();
			}
			@Override
			public Adapter caseAdvice(Advice object) {
				return createAdviceAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseFeatureSelection(FeatureSelection object) {
				return createFeatureSelectionAdapter();
			}
			@Override
			public Adapter caseFeatureList(FeatureList object) {
				return createFeatureListAdapter();
			}
			@Override
			public Adapter caseSelectedCV(SelectedCV object) {
				return createSelectedCVAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.PlacementStrategy <em>Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.PlacementStrategy
	 * @generated
	 */
	public Adapter createPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.ExternalCallPlacementStrategy <em>External Call Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.ExternalCallPlacementStrategy
	 * @generated
	 */
	public Adapter createExternalCallPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.InternalActionPlacementStrategy <em>Internal Action Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.InternalActionPlacementStrategy
	 * @generated
	 */
	public Adapter createInternalActionPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.ControlFlowPlacementStrategy <em>Control Flow Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.ControlFlowPlacementStrategy
	 * @generated
	 */
	public Adapter createControlFlowPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.PointCut <em>Point Cut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.PointCut
	 * @generated
	 */
	public Adapter createPointCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.Advice <em>Advice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.Advice
	 * @generated
	 */
	public Adapter createAdviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.FeatureSelection <em>Feature Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.FeatureSelection
	 * @generated
	 */
	public Adapter createFeatureSelectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.FeatureList <em>Feature List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.FeatureList
	 * @generated
	 */
	public Adapter createFeatureListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link placementDescription.SelectedCV <em>Selected CV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see placementDescription.SelectedCV
	 * @generated
	 */
	public Adapter createSelectedCVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PlacementDescriptionAdapterFactory
