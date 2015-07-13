/**
 */
package de.uka.ipd.sdq.nqr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.nqr.NqrRepository#getNqr <em>Nqr</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqrRepository()
 * @model
 * @generated
 */
public interface NqrRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Nqr</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.nqr.Nqr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nqr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nqr</em>' containment reference list.
	 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqrRepository_Nqr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nqr> getNqr();

} // NqrRepository
