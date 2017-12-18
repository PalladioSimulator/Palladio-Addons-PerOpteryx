/**
 */
package FeatureCompletionModel.util;

import FeatureCompletionModel.*;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see FeatureCompletionModel.FeatureCompletionPackage
 * @generated
 */
public class FeatureCompletionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureCompletionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FeatureCompletionPackage.eINSTANCE;
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
	protected FeatureCompletionSwitch modelSwitch =
		new FeatureCompletionSwitch() {
			public Object caseFeatureCompletionRepository(FeatureCompletionRepository object) {
				return createFeatureCompletionRepositoryAdapter();
			}
			public Object caseFeatureCompletion(FeatureCompletion object) {
				return createFeatureCompletionAdapter();
			}
			public Object caseCompletionComponent(CompletionComponent object) {
				return createCompletionComponentAdapter();
			}
			public Object caseDescribedElement(DescribedElement object) {
				return createDescribedElementAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object casePerimeterProviding(PerimeterProviding object) {
				return createPerimeterProvidingAdapter();
			}
			public Object caseComplementumVisnetis(ComplementumVisnetis object) {
				return createComplementumVisnetisAdapter();
			}
			public Object caseComplementum(Complementum object) {
				return createComplementumAdapter();
			}
			public Object caseArchitectureConstraints(ArchitectureConstraints object) {
				return createArchitectureConstraintsAdapter();
			}
			public Object caseConstrainableElement(ConstrainableElement object) {
				return createConstrainableElementAdapter();
			}
			public Object casePerimeterRequiring(PerimeterRequiring object) {
				return createPerimeterRequiringAdapter();
			}
			public Object caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.FeatureCompletionRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.FeatureCompletionRepository
	 * @generated
	 */
	public Adapter createFeatureCompletionRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.FeatureCompletion <em>Feature Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.FeatureCompletion
	 * @generated
	 */
	public Adapter createFeatureCompletionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.CompletionComponent <em>Completion Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.CompletionComponent
	 * @generated
	 */
	public Adapter createCompletionComponentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.PerimeterProviding <em>Perimeter Providing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.PerimeterProviding
	 * @generated
	 */
	public Adapter createPerimeterProvidingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.ComplementumVisnetis <em>Complementum Visnetis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.ComplementumVisnetis
	 * @generated
	 */
	public Adapter createComplementumVisnetisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.Complementum <em>Complementum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.Complementum
	 * @generated
	 */
	public Adapter createComplementumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.ArchitectureConstraints <em>Architecture Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.ArchitectureConstraints
	 * @generated
	 */
	public Adapter createArchitectureConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.ConstrainableElement <em>Constrainable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.ConstrainableElement
	 * @generated
	 */
	public Adapter createConstrainableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link FeatureCompletionModel.PerimeterRequiring <em>Perimeter Requiring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see FeatureCompletionModel.PerimeterRequiring
	 * @generated
	 */
	public Adapter createPerimeterRequiringAdapter() {
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

} //FeatureCompletionAdapterFactory
