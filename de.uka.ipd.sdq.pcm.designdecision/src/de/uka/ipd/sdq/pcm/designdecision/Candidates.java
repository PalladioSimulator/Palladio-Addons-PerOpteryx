/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Candidates is the root element for specifying a set of solutions of the optimisation (or also any other candidate architecture). It contains one Candidate for each found solution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmCandidate <em>Pcm Candidate</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmProblem <em>Pcm Problem</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getCandidates()
 * @model
 * @generated
 */
public interface Candidates extends genericdesigndecision.Candidates {
	/**
	 * Returns the value of the '<em><b>Pcm Candidate</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.Candidate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Candidate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Candidate</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getCandidates_PcmCandidate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Candidate> getPcmCandidate();

	/**
	 * Returns the value of the '<em><b>Pcm Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Problem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Problem</em>' reference.
	 * @see #setPcmProblem(DecisionSpace)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getCandidates_PcmProblem()
	 * @model ordered="false"
	 * @generated
	 */
	DecisionSpace getPcmProblem();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.Candidates#getPcmProblem <em>Pcm Problem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Problem</em>' reference.
	 * @see #getPcmProblem()
	 * @generated
	 */
	void setPcmProblem(DecisionSpace value);

} // Candidates
