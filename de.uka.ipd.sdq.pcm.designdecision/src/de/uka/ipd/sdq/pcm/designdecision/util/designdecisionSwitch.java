/**
 */
package de.uka.ipd.sdq.pcm.designdecision.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.identifier.Identifier;
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
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage
 * @generated
 */
public class designdecisionSwitch<T> extends Switch<T> {
    /**
     * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static designdecisionPackage modelPackage;

    /**
     * Creates an instance of the switch. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public designdecisionSwitch() {
        if (modelPackage == null)
        {
            modelPackage = designdecisionPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(final EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result;
     * it yields that result. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(final int classifierID, final EObject theEObject) {
        switch (classifierID)
        {
        case designdecisionPackage.DISCRETE_RANGE_CHOICE: {
            final DiscreteRangeChoice discreteRangeChoice = (DiscreteRangeChoice) theEObject;
            T result = this.caseDiscreteRangeChoice(discreteRangeChoice);
            if (result == null) {
                result = this.caseChoice(discreteRangeChoice);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.CHOICE: {
            final Choice choice = (Choice) theEObject;
            T result = this.caseChoice(choice);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE: {
            final DegreeOfFreedomInstance degreeOfFreedomInstance = (DegreeOfFreedomInstance) theEObject;
            T result = this.caseDegreeOfFreedomInstance(degreeOfFreedomInstance);
            if (result == null) {
                result = this.caseNamedElement(degreeOfFreedomInstance);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.CLASS_CHOICE: {
            final ClassChoice classChoice = (ClassChoice) theEObject;
            T result = this.caseClassChoice(classChoice);
            if (result == null) {
                result = this.caseChoice(classChoice);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.CONTINOUS_RANGE_CHOICE: {
            final ContinousRangeChoice continousRangeChoice = (ContinousRangeChoice) theEObject;
            T result = this.caseContinousRangeChoice(continousRangeChoice);
            if (result == null) {
                result = this.caseChoice(continousRangeChoice);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.DECISION_SPACE: {
            final DecisionSpace decisionSpace = (DecisionSpace) theEObject;
            T result = this.caseDecisionSpace(decisionSpace);
            if (result == null) {
                result = this.casefeaturemodel_NamedElement(decisionSpace);
            }
            if (result == null) {
                result = this.caseIdentifier(decisionSpace);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.CANDIDATE: {
            final Candidate candidate = (Candidate) theEObject;
            T result = this.caseCandidate(candidate);
            if (result == null) {
                result = this.caseNamedElement(candidate);
            }
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        case designdecisionPackage.CANDIDATES: {
            final Candidates candidates = (Candidates) theEObject;
            T result = this.caseCandidates(candidates);
            if (result == null) {
                result = this.defaultCase(theEObject);
            }
            return result;
        }
        default:
            return this.defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Discrete Range Choice</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Discrete Range Choice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDiscreteRangeChoice(final DiscreteRangeChoice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Degree Of Freedom Instance</em>'. <!-- begin-user-doc --> This implementation returns
     * null; returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Degree Of Freedom Instance</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDegreeOfFreedomInstance(final DegreeOfFreedomInstance object) {
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
    public T caseChoice(final Choice object) {
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
    public T caseClassChoice(final ClassChoice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '
     * <em>Continous Range Choice</em>'. <!-- begin-user-doc --> This implementation returns null;
     * returning a non-null result will terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '
     *         <em>Continous Range Choice</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseContinousRangeChoice(final ContinousRangeChoice object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decision Space</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decision Space</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecisionSpace(final DecisionSpace object) {
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
    public T caseCandidate(final Candidate object) {
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
    public T caseCandidates(final Candidates object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(final NamedElement object) {
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
    public T caseIdentifier(final Identifier object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc --> This implementation returns null; returning a non-null result will
     * terminate the switch. <!-- end-user-doc -->
     *
     * @param object
     *            the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casefeaturemodel_NamedElement(final de.uka.ipd.sdq.featuremodel.NamedElement object) {
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
    public T defaultCase(final EObject object) {
        return null;
    }

} // designdecisionSwitch
