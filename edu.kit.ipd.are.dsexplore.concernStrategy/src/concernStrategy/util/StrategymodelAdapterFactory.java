/**
 */
package concernStrategy.util;

import concernStrategy.*;

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
 * @see concernStrategy.StrategymodelPackage
 * @generated
 */
public class StrategymodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StrategymodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategymodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StrategymodelPackage.eINSTANCE;
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
	protected StrategymodelSwitch modelSwitch =
		new StrategymodelSwitch() {
			public Object caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			public Object caseIntervalRange(IntervalRange object) {
				return createIntervalRangeAdapter();
			}
			public Object caseChildRelation(ChildRelation object) {
				return createChildRelationAdapter();
			}
			public Object caseSimple(Simple object) {
				return createSimpleAdapter();
			}
			public Object caseFeatureGroup(FeatureGroup object) {
				return createFeatureGroupAdapter();
			}
			public Object caseFeatureDiagram(FeatureDiagram object) {
				return createFeatureDiagramAdapter();
			}
			public Object caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			public Object caseRequiredConstraint(RequiredConstraint object) {
				return createRequiredConstraintAdapter();
			}
			public Object caseProhibitsConstraint(ProhibitsConstraint object) {
				return createProhibitsConstraintAdapter();
			}
			public Object caseIntegerIntervalRange(IntegerIntervalRange object) {
				return createIntegerIntervalRangeAdapter();
			}
			public Object caseContinousIntervalRange(ContinousIntervalRange object) {
				return createContinousIntervalRangeAdapter();
			}
			public Object caseIntegerAttribute(IntegerAttribute object) {
				return createIntegerAttributeAdapter();
			}
			public Object caseDoubleAttribute(DoubleAttribute object) {
				return createDoubleAttributeAdapter();
			}
			public Object caseStringAttribute(StringAttribute object) {
				return createStringAttributeAdapter();
			}
			public Object caseExternalObjectAttribute(ExternalObjectAttribute object) {
				return createExternalObjectAttributeAdapter();
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
	 * Creates a new adapter for an object of class '{@link concernStrategy.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.IntervalRange <em>Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.IntervalRange
	 * @generated
	 */
	public Adapter createIntervalRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.ChildRelation <em>Child Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.ChildRelation
	 * @generated
	 */
	public Adapter createChildRelationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.Simple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.Simple
	 * @generated
	 */
	public Adapter createSimpleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.FeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.FeatureGroup
	 * @generated
	 */
	public Adapter createFeatureGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.FeatureDiagram
	 * @generated
	 */
	public Adapter createFeatureDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.RequiredConstraint <em>Required Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.RequiredConstraint
	 * @generated
	 */
	public Adapter createRequiredConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.ProhibitsConstraint <em>Prohibits Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.ProhibitsConstraint
	 * @generated
	 */
	public Adapter createProhibitsConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.IntegerIntervalRange <em>Integer Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.IntegerIntervalRange
	 * @generated
	 */
	public Adapter createIntegerIntervalRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.ContinousIntervalRange <em>Continous Interval Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.ContinousIntervalRange
	 * @generated
	 */
	public Adapter createContinousIntervalRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.IntegerAttribute <em>Integer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.IntegerAttribute
	 * @generated
	 */
	public Adapter createIntegerAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.DoubleAttribute <em>Double Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.DoubleAttribute
	 * @generated
	 */
	public Adapter createDoubleAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.StringAttribute <em>String Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.StringAttribute
	 * @generated
	 */
	public Adapter createStringAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link concernStrategy.ExternalObjectAttribute <em>External Object Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see concernStrategy.ExternalObjectAttribute
	 * @generated
	 */
	public Adapter createExternalObjectAttributeAdapter() {
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

} //StrategymodelAdapterFactory
