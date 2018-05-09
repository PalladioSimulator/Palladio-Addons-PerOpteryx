/**
 */
package featureSolution.util;

import FeatureCompletionModel.DescribedElement;
import FeatureCompletionModel.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import featureSolution.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see featureSolution.FeatureSolutionPackage
 * @generated
 */
public class FeatureSolutionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureSolutionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSolutionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FeatureSolutionPackage.eINSTANCE;
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
	protected FeatureSolutionSwitch<Adapter> modelSwitch =
		new FeatureSolutionSwitch<Adapter>() {
			@Override
			public Adapter caseInclusionMechanism(InclusionMechanism object) {
				return createInclusionMechanismAdapter();
			}
			@Override
			public Adapter caseAdapterInclusion(AdapterInclusion object) {
				return createAdapterInclusionAdapter();
			}
			@Override
			public Adapter caseExtensionInclusion(ExtensionInclusion object) {
				return createExtensionInclusionAdapter();
			}
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
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDescribedElement(DescribedElement object) {
				return createDescribedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link featureSolution.InclusionMechanism <em>Inclusion Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.InclusionMechanism
	 * @generated
	 */
	public Adapter createInclusionMechanismAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link featureSolution.AdapterInclusion <em>Adapter Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.AdapterInclusion
	 * @generated
	 */
	public Adapter createAdapterInclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link featureSolution.ExtensionInclusion <em>Extension Inclusion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.ExtensionInclusion
	 * @generated
	 */
	public Adapter createExtensionInclusionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link featureSolution.PlacementStrategy <em>Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.PlacementStrategy
	 * @generated
	 */
	public Adapter createPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link featureSolution.ExternalCallPlacementStrategy <em>External Call Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.ExternalCallPlacementStrategy
	 * @generated
	 */
	public Adapter createExternalCallPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link featureSolution.InternalActionPlacementStrategy <em>Internal Action Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.InternalActionPlacementStrategy
	 * @generated
	 */
	public Adapter createInternalActionPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link featureSolution.ControlFlowPlacementStrategy <em>Control Flow Placement Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see featureSolution.ControlFlowPlacementStrategy
	 * @generated
	 */
	public Adapter createControlFlowPlacementStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.uka.ipd.sdq.identifier.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.DescribedElement
	 * @generated
	 */
	public Adapter createDescribedElementAdapter() {
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

} //FeatureSolutionAdapterFactory
