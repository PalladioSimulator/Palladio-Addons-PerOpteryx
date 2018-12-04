/**
 */
package org.palladiosimulator.qualitymodel.util;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import org.palladiosimulator.qualitymodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage
 * @generated
 */
public class QualityModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QualityModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QualityModelPackage.eINSTANCE;
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
	protected QualityModelSwitch modelSwitch =
		new QualityModelSwitch() {
			public Object caseNqr(Nqr object) {
				return createNqrAdapter();
			}
			public Object caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			public Object caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			public Object caseReasoning(Reasoning object) {
				return createReasoningAdapter();
			}
			public Object caseReduction(Reduction object) {
				return createReductionAdapter();
			}
			public Object caseQuantityReduction(QuantityReduction object) {
				return createQuantityReductionAdapter();
			}
			public Object caseStatisticReduction(StatisticReduction object) {
				return createStatisticReductionAdapter();
			}
			public Object caseMappingRepository(MappingRepository object) {
				return createMappingRepositoryAdapter();
			}
			public Object caseMappingEntry(MappingEntry object) {
				return createMappingEntryAdapter();
			}
			public Object caseTransformationRepository(TransformationRepository object) {
				return createTransformationRepositoryAdapter();
			}
			public Object caseReasoningRepository(ReasoningRepository object) {
				return createReasoningRepositoryAdapter();
			}
			public Object caseNqrRepository(NqrRepository object) {
				return createNqrRepositoryAdapter();
			}
			public Object caseReasoningComponent(ReasoningComponent object) {
				return createReasoningComponentAdapter();
			}
			public Object caseReasoningSystem(ReasoningSystem object) {
				return createReasoningSystemAdapter();
			}
			public Object caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseEntity(Entity object) {
				return createEntityAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.Nqr <em>Nqr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.Nqr
	 * @generated
	 */
	public Adapter createNqrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.Reasoning <em>Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.Reasoning
	 * @generated
	 */
	public Adapter createReasoningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.Reduction <em>Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.Reduction
	 * @generated
	 */
	public Adapter createReductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.QuantityReduction <em>Quantity Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.QuantityReduction
	 * @generated
	 */
	public Adapter createQuantityReductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.StatisticReduction <em>Statistic Reduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.StatisticReduction
	 * @generated
	 */
	public Adapter createStatisticReductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.MappingRepository <em>Mapping Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.MappingRepository
	 * @generated
	 */
	public Adapter createMappingRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.MappingEntry
	 * @generated
	 */
	public Adapter createMappingEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.TransformationRepository <em>Transformation Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.TransformationRepository
	 * @generated
	 */
	public Adapter createTransformationRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.ReasoningRepository <em>Reasoning Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.ReasoningRepository
	 * @generated
	 */
	public Adapter createReasoningRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.NqrRepository <em>Nqr Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.NqrRepository
	 * @generated
	 */
	public Adapter createNqrRepositoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.ReasoningComponent <em>Reasoning Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.ReasoningComponent
	 * @generated
	 */
	public Adapter createReasoningComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.qualitymodel.ReasoningSystem <em>Reasoning System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.qualitymodel.ReasoningSystem
	 * @generated
	 */
	public Adapter createReasoningSystemAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.palladiosimulator.pcm.core.entity.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
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

} //QualityModelAdapterFactory
