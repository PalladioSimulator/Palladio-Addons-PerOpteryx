/**
 */
package de.uka.ipd.sdq.nqr;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nqr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.nqr.Nqr#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.nqr.Nqr#getCriterion <em>Criterion</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr()
 * @model
 * @generated
 */
public interface Nqr extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(RepositoryComponent)
	 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr_AnnotatedElement()
	 * @model required="true"
	 * @generated
	 */
	RepositoryComponent getAnnotatedElement();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.nqr.Nqr#getAnnotatedElement <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(RepositoryComponent value);

	/**
	 * Returns the value of the '<em><b>Criterion</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Criterion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criterion</em>' containment reference list.
	 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr_Criterion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Criterion> getCriterion();

} // Nqr
