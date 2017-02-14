/**
 */
package ConcernModel.util;

import ConcernModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ConcernModel.ConcernModelPackage
 * @generated
 */
public class ConcernModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcernModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConcernModelPackage.eINSTANCE;
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
	protected ConcernModelSwitch<Adapter> modelSwitch =
		new ConcernModelSwitch<Adapter>() {
			@Override
			public Adapter caseConcernRepository(ConcernRepository object) {
				return createConcernRepositoryAdapter();
			}
			@Override
			public Adapter caseConcern(Concern object) {
				return createConcernAdapter();
			}
			@Override
			public Adapter caseConcernStrategy(ConcernStrategy object) {
				return createConcernStrategyAdapter();
			}
			@Override
			public Adapter caseElementaryConcernComponent(ElementaryConcernComponent object) {
				return createElementaryConcernComponentAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationTarget(AnnotationTarget object) {
				return createAnnotationTargetAdapter();
			}
			@Override
			public Adapter caseAnnotationEnrich(AnnotationEnrich object) {
				return createAnnotationEnrichAdapter();
			}
			@Override
			public Adapter caseDeploymentConstraint(DeploymentConstraint object) {
				return createDeploymentConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link ConcernModel.ConcernRepository <em>Concern Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.ConcernRepository
	 * @generated
	 */
	public Adapter createConcernRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.Concern
	 * @generated
	 */
	public Adapter createConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.ConcernStrategy <em>Concern Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.ConcernStrategy
	 * @generated
	 */
	public Adapter createConcernStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.ElementaryConcernComponent <em>Elementary Concern Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.ElementaryConcernComponent
	 * @generated
	 */
	public Adapter createElementaryConcernComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.AnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.AnnotationTarget
	 * @generated
	 */
	public Adapter createAnnotationTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.AnnotationEnrich <em>Annotation Enrich</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.AnnotationEnrich
	 * @generated
	 */
	public Adapter createAnnotationEnrichAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ConcernModel.DeploymentConstraint <em>Deployment Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ConcernModel.DeploymentConstraint
	 * @generated
	 */
	public Adapter createDeploymentConstraintAdapter() {
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

} //ConcernModelAdapterFactory
