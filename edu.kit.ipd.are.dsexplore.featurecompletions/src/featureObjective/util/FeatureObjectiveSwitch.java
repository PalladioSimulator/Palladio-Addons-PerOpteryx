/**
 */
package featureObjective.util;

import FeatureCompletionModel.DescribedElement;
import FeatureCompletionModel.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import featureObjective.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see featureObjective.FeatureObjectivePackage
 * @generated
 */
public class FeatureObjectiveSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureObjectivePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjectiveSwitch() {
		if (modelPackage == null) {
			modelPackage = FeatureObjectivePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FeatureObjectivePackage.FEATURE_OBJECTIVE: {
				FeatureObjective featureObjective = (FeatureObjective)theEObject;
				Object result = caseFeatureObjective(featureObjective);
				if (result == null) result = caseDescribedElement(featureObjective);
				if (result == null) result = caseNamedElement(featureObjective);
				if (result == null) result = caseIdentifier(featureObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				Object result = caseFeature(feature);
				if (result == null) result = caseNamedElement(feature);
				if (result == null) result = caseIdentifier(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				Object result = caseAttribute(attribute);
				if (result == null) result = caseNamedElement(attribute);
				if (result == null) result = caseIdentifier(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.INTERVAL_RANGE: {
				IntervalRange intervalRange = (IntervalRange)theEObject;
				Object result = caseIntervalRange(intervalRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.CHILD_RELATION: {
				ChildRelation childRelation = (ChildRelation)theEObject;
				Object result = caseChildRelation(childRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.SIMPLE: {
				Simple simple = (Simple)theEObject;
				Object result = caseSimple(simple);
				if (result == null) result = caseChildRelation(simple);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.FEATURE_GROUP: {
				FeatureGroup featureGroup = (FeatureGroup)theEObject;
				Object result = caseFeatureGroup(featureGroup);
				if (result == null) result = caseChildRelation(featureGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				Object result = caseConstraint(constraint);
				if (result == null) result = caseNamedElement(constraint);
				if (result == null) result = caseIdentifier(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.REQUIRED_CONSTRAINT: {
				RequiredConstraint requiredConstraint = (RequiredConstraint)theEObject;
				Object result = caseRequiredConstraint(requiredConstraint);
				if (result == null) result = caseConstraint(requiredConstraint);
				if (result == null) result = caseNamedElement(requiredConstraint);
				if (result == null) result = caseIdentifier(requiredConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.PROHIBITS_CONSTRAINT: {
				ProhibitsConstraint prohibitsConstraint = (ProhibitsConstraint)theEObject;
				Object result = caseProhibitsConstraint(prohibitsConstraint);
				if (result == null) result = caseConstraint(prohibitsConstraint);
				if (result == null) result = caseNamedElement(prohibitsConstraint);
				if (result == null) result = caseIdentifier(prohibitsConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.INTEGER_INTERVAL_RANGE: {
				IntegerIntervalRange integerIntervalRange = (IntegerIntervalRange)theEObject;
				Object result = caseIntegerIntervalRange(integerIntervalRange);
				if (result == null) result = caseIntervalRange(integerIntervalRange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.INTEGER_ATTRIBUTE: {
				IntegerAttribute integerAttribute = (IntegerAttribute)theEObject;
				Object result = caseIntegerAttribute(integerAttribute);
				if (result == null) result = caseAttribute(integerAttribute);
				if (result == null) result = caseNamedElement(integerAttribute);
				if (result == null) result = caseIdentifier(integerAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.DOUBLE_ATTRIBUTE: {
				DoubleAttribute doubleAttribute = (DoubleAttribute)theEObject;
				Object result = caseDoubleAttribute(doubleAttribute);
				if (result == null) result = caseAttribute(doubleAttribute);
				if (result == null) result = caseNamedElement(doubleAttribute);
				if (result == null) result = caseIdentifier(doubleAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.STRING_ATTRIBUTE: {
				StringAttribute stringAttribute = (StringAttribute)theEObject;
				Object result = caseStringAttribute(stringAttribute);
				if (result == null) result = caseAttribute(stringAttribute);
				if (result == null) result = caseNamedElement(stringAttribute);
				if (result == null) result = caseIdentifier(stringAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureObjectivePackage.EXTERNAL_OBJECT_ATTRIBUTE: {
				ExternalObjectAttribute externalObjectAttribute = (ExternalObjectAttribute)theEObject;
				Object result = caseExternalObjectAttribute(externalObjectAttribute);
				if (result == null) result = caseAttribute(externalObjectAttribute);
				if (result == null) result = caseNamedElement(externalObjectAttribute);
				if (result == null) result = caseIdentifier(externalObjectAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureObjective(FeatureObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntervalRange(IntervalRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Child Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Child Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseChildRelation(ChildRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseSimple(Simple object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureGroup(FeatureGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Required Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Required Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRequiredConstraint(RequiredConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prohibits Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prohibits Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseProhibitsConstraint(ProhibitsConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Interval Range</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Interval Range</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerIntervalRange(IntegerIntervalRange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerAttribute(IntegerAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoubleAttribute(DoubleAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringAttribute(StringAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Object Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Object Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalObjectAttribute(ExternalObjectAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDescribedElement(DescribedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //FeatureObjectiveSwitch
