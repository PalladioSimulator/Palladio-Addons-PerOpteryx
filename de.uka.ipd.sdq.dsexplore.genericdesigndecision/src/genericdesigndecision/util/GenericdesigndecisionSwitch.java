/**
 */
package genericdesigndecision.util;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import genericdesigndecision.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see genericdesigndecision.GenericdesigndecisionPackage
 * @generated
 */
public class GenericdesigndecisionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GenericdesigndecisionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericdesigndecisionSwitch() {
		if (modelPackage == null) {
			modelPackage = GenericdesigndecisionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GenericdesigndecisionPackage.DISCRETE_RANGE_CHOICE: {
				DiscreteRangeChoice discreteRangeChoice = (DiscreteRangeChoice)theEObject;
				T result = caseDiscreteRangeChoice(discreteRangeChoice);
				if (result == null) result = caseChoice(discreteRangeChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.CHOICE: {
				Choice choice = (Choice)theEObject;
				T result = caseChoice(choice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.CLASS_CHOICE: {
				ClassChoice classChoice = (ClassChoice)theEObject;
				T result = caseClassChoice(classChoice);
				if (result == null) result = caseChoice(classChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.CONTINOUS_RANGE_CHOICE: {
				ContinousRangeChoice continousRangeChoice = (ContinousRangeChoice)theEObject;
				T result = caseContinousRangeChoice(continousRangeChoice);
				if (result == null) result = caseChoice(continousRangeChoice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.DECISION_SPACE: {
				DecisionSpace decisionSpace = (DecisionSpace)theEObject;
				T result = caseDecisionSpace(decisionSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.CANDIDATE: {
				Candidate candidate = (Candidate)theEObject;
				T result = caseCandidate(candidate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.CANDIDATES: {
				Candidates candidates = (Candidates)theEObject;
				T result = caseCandidates(candidates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.ADSE_PROBLEM: {
				ADSEProblem adseProblem = (ADSEProblem)theEObject;
				T result = caseADSEProblem(adseProblem);
				if (result == null) result = caseDSEProblem(adseProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.DSE_PROBLEM: {
				DSEProblem dseProblem = (DSEProblem)theEObject;
				T result = caseDSEProblem(dseProblem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.GENOME_TO_CANDIDATE_MODEL_TRANSFORMATION: {
				GenomeToCandidateModelTransformation genomeToCandidateModelTransformation = (GenomeToCandidateModelTransformation)theEObject;
				T result = caseGenomeToCandidateModelTransformation(genomeToCandidateModelTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GenericdesigndecisionPackage.AGENOME_TO_CANDIDATE_MODEL_TRANSFORMATION: {
				AGenomeToCandidateModelTransformation aGenomeToCandidateModelTransformation = (AGenomeToCandidateModelTransformation)theEObject;
				T result = caseAGenomeToCandidateModelTransformation(aGenomeToCandidateModelTransformation);
				if (result == null) result = caseGenomeToCandidateModelTransformation(aGenomeToCandidateModelTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Range Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Range Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteRangeChoice(DiscreteRangeChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChoice(Choice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Choice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassChoice(ClassChoice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continous Range Choice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionSpace(DecisionSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidate(Candidate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Candidates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Candidates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCandidates(Candidates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADSE Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADSE Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADSEProblem(ADSEProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSE Problem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSE Problem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSEProblem(DSEProblem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Genome To Candidate Model Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Genome To Candidate Model Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenomeToCandidateModelTransformation(GenomeToCandidateModelTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AGenome To Candidate Model Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AGenome To Candidate Model Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAGenomeToCandidateModelTransformation(AGenomeToCandidateModelTransformation object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GenericdesigndecisionSwitch
