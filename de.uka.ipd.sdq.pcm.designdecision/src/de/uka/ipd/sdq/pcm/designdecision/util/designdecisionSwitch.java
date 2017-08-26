/**
 */
package de.uka.ipd.sdq.pcm.designdecision.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.*;
import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.Candidates;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.ContinousRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.DiscreteRangeChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance hierarchy. It supports the
 * call {@link #doSwitch(EObject) doSwitch(object)} to invoke the <code>caseXXX</code> method for
 * each class of the model, starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage
 * @generated
 */
public class designdecisionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected static designdecisionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public designdecisionSwitch() {
		if (modelPackage == null) {
			modelPackage = designdecisionPackage.eINSTANCE;
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
		case designdecisionPackage.DISCRETE_RANGE_CHOICE: {
			DiscreteRangeChoice discreteRangeChoice = (DiscreteRangeChoice) theEObject;
			T result = caseDiscreteRangeChoice(discreteRangeChoice);
			if (result == null)
				result = caseChoice(discreteRangeChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.CHOICE: {
			Choice choice = (Choice) theEObject;
			T result = caseChoice(choice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE: {
			DegreeOfFreedomInstance degreeOfFreedomInstance = (DegreeOfFreedomInstance) theEObject;
			T result = caseDegreeOfFreedomInstance(degreeOfFreedomInstance);
			if (result == null)
				result = caseNamedElement(degreeOfFreedomInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.CLASS_CHOICE: {
			ClassChoice classChoice = (ClassChoice) theEObject;
			T result = caseClassChoice(classChoice);
			if (result == null)
				result = caseChoice(classChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.CONTINOUS_RANGE_CHOICE: {
			ContinousRangeChoice continousRangeChoice = (ContinousRangeChoice) theEObject;
			T result = caseContinousRangeChoice(continousRangeChoice);
			if (result == null)
				result = caseChoice(continousRangeChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.DECISION_SPACE: {
			DecisionSpace decisionSpace = (DecisionSpace) theEObject;
			T result = caseDecisionSpace(decisionSpace);
			if (result == null)
				result = casefeaturemodel_NamedElement(decisionSpace);
			if (result == null)
				result = caseIdentifier(decisionSpace);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.CANDIDATE: {
			Candidate candidate = (Candidate) theEObject;
			T result = caseCandidate(candidate);
			if (result == null)
				result = caseNamedElement(candidate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.CANDIDATES: {
			Candidates candidates = (Candidates) theEObject;
			T result = caseCandidates(candidates);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case designdecisionPackage.BOOL_CHOICE: {
			BoolChoice boolChoice = (BoolChoice) theEObject;
			T result = caseBoolChoice(boolChoice);
			if (result == null)
				result = caseChoice(boolChoice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Range Choice</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Range Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteRangeChoice(DiscreteRangeChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degree Of Freedom Instance</em>'.
	 * <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degree Of Freedom Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreeOfFreedomInstance(DegreeOfFreedomInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Choice</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassChoice(ClassChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continous Range Choice</em>'.
	 * <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continous Range Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinousRangeChoice(ContinousRangeChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Space</em>'.
	 * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSpace(DecisionSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidate(Candidate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidates</em>'. <!--
	 * begin-user-doc --> This implementation returns null; returning a non-null result will
	 * terminate the switch. <!-- end-user-doc -->
	 *
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidates(Candidates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bool Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bool Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolChoice(BoolChoice object) {
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
	public T casefeaturemodel_NamedElement(de.uka.ipd.sdq.featuremodel.NamedElement object) {
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

} // designdecisionSwitch
