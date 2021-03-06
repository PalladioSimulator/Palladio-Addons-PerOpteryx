/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import de.uka.ipd.sdq.featuremodel.NamedElement;
import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage
 * @generated
 */
public class gdofSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static gdofPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public gdofSwitch() {
		if (modelPackage == null) {
			modelPackage = gdofPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION: {
			ChangeableElementDescription changeableElementDescription = (ChangeableElementDescription) theEObject;
			T result = caseChangeableElementDescription(changeableElementDescription);
			if (result == null)
				result = caseNamedElement(changeableElementDescription);
			if (result == null)
				result = caseIdentifier(changeableElementDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.VALUE_RULE: {
			ValueRule valueRule = (ValueRule) theEObject;
			T result = caseValueRule(valueRule);
			if (result == null)
				result = caseOCLRule(valueRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.OCL_RULE: {
			OCLRule oclRule = (OCLRule) theEObject;
			T result = caseOCLRule(oclRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.HELPER_OCL_DEFINITION: {
			HelperOCLDefinition helperOCLDefinition = (HelperOCLDefinition) theEObject;
			T result = caseHelperOCLDefinition(helperOCLDefinition);
			if (result == null)
				result = caseOCLRule(helperOCLDefinition);
			if (result == null)
				result = caseStaticContextRule(helperOCLDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.STATIC_CONTEXT_RULE: {
			StaticContextRule staticContextRule = (StaticContextRule) theEObject;
			T result = caseStaticContextRule(staticContextRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.SELECTION_RULE: {
			SelectionRule selectionRule = (SelectionRule) theEObject;
			T result = caseSelectionRule(selectionRule);
			if (result == null)
				result = caseOCLRule(selectionRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.DO_FREPOSITORY: {
			DoFRepository doFRepository = (DoFRepository) theEObject;
			T result = caseDoFRepository(doFRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.INSTANCE_SELECTION_RULE: {
			InstanceSelectionRule instanceSelectionRule = (InstanceSelectionRule) theEObject;
			T result = caseInstanceSelectionRule(instanceSelectionRule);
			if (result == null)
				result = caseSelectionRule(instanceSelectionRule);
			if (result == null)
				result = caseOCLRule(instanceSelectionRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.STATIC_SELECTION_RULE: {
			StaticSelectionRule staticSelectionRule = (StaticSelectionRule) theEObject;
			T result = caseStaticSelectionRule(staticSelectionRule);
			if (result == null)
				result = caseSelectionRule(staticSelectionRule);
			if (result == null)
				result = caseStaticContextRule(staticSelectionRule);
			if (result == null)
				result = caseOCLRule(staticSelectionRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.DEGREE_OF_FREEDOM: {
			DegreeOfFreedom degreeOfFreedom = (DegreeOfFreedom) theEObject;
			T result = caseDegreeOfFreedom(degreeOfFreedom);
			if (result == null)
				result = caseNamedElement(degreeOfFreedom);
			if (result == null)
				result = caseIdentifier(degreeOfFreedom);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case gdofPackage.DECORATOR_MODEL_DESCRIPTION: {
			DecoratorModelDescription decoratorModelDescription = (DecoratorModelDescription) theEObject;
			T result = caseDecoratorModelDescription(decoratorModelDescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Changeable Element Description</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Changeable Element Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeableElementDescription(ChangeableElementDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Rule</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRule(ValueRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OCL Rule</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OCL Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOCLRule(OCLRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper OCL Definition</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper OCL Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperOCLDefinition(HelperOCLDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Context Rule</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Context Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticContextRule(StaticContextRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selection Rule</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectionRule(SelectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do FRepository</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do FRepository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoFRepository(DoFRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Selection Rule</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Selection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceSelectionRule(InstanceSelectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Selection Rule</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Selection Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticSelectionRule(StaticSelectionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree Of Freedom</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree Of Freedom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreeOfFreedom(DegreeOfFreedom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decorator Model Description</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decorator Model Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecoratorModelDescription(DecoratorModelDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch, but this is the last case anyway. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} // gdofSwitch
