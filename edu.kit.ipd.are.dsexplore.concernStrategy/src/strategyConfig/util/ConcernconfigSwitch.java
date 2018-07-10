/**
 */
package strategyConfig.util;

import concernStrategy.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import strategyConfig.*;

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
 * @see strategyConfig.ConcernconfigPackage
 * @generated
 */
public class ConcernconfigSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConcernconfigPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernconfigSwitch() {
		if (modelPackage == null) {
			modelPackage = ConcernconfigPackage.eINSTANCE;
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
			case ConcernconfigPackage.CONFIG_NODE: {
				ConfigNode configNode = (ConfigNode)theEObject;
				Object result = caseConfigNode(configNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.ATTRIBUTE_VALUE: {
				AttributeValue attributeValue = (AttributeValue)theEObject;
				Object result = caseAttributeValue(attributeValue);
				if (result == null) result = caseNamedElement(attributeValue);
				if (result == null) result = caseIdentifier(attributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.FEATURE_CONFIG: {
				FeatureConfig featureConfig = (FeatureConfig)theEObject;
				Object result = caseFeatureConfig(featureConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				Object result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.INTEGER_ATTRIBUTE_VALUE: {
				IntegerAttributeValue integerAttributeValue = (IntegerAttributeValue)theEObject;
				Object result = caseIntegerAttributeValue(integerAttributeValue);
				if (result == null) result = caseAttributeValue(integerAttributeValue);
				if (result == null) result = caseNamedElement(integerAttributeValue);
				if (result == null) result = caseIdentifier(integerAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.DOUBLE_ATTRIBUTE_VALUE: {
				DoubleAttributeValue doubleAttributeValue = (DoubleAttributeValue)theEObject;
				Object result = caseDoubleAttributeValue(doubleAttributeValue);
				if (result == null) result = caseAttributeValue(doubleAttributeValue);
				if (result == null) result = caseNamedElement(doubleAttributeValue);
				if (result == null) result = caseIdentifier(doubleAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.STRING_ATTRIBUTE_VALUE: {
				StringAttributeValue stringAttributeValue = (StringAttributeValue)theEObject;
				Object result = caseStringAttributeValue(stringAttributeValue);
				if (result == null) result = caseAttributeValue(stringAttributeValue);
				if (result == null) result = caseNamedElement(stringAttributeValue);
				if (result == null) result = caseIdentifier(stringAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConcernconfigPackage.EXTERNAL_OBJECT_ATTRIBUTE_VALUE: {
				ExternalObjectAttributeValue externalObjectAttributeValue = (ExternalObjectAttributeValue)theEObject;
				Object result = caseExternalObjectAttributeValue(externalObjectAttributeValue);
				if (result == null) result = caseAttributeValue(externalObjectAttributeValue);
				if (result == null) result = caseNamedElement(externalObjectAttributeValue);
				if (result == null) result = caseIdentifier(externalObjectAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfigNode(ConfigNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAttributeValue(AttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseFeatureConfig(FeatureConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseIntegerAttributeValue(IntegerAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDoubleAttributeValue(DoubleAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseStringAttributeValue(StringAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Object Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Object Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseExternalObjectAttributeValue(ExternalObjectAttributeValue object) {
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

} //ConcernconfigSwitch
