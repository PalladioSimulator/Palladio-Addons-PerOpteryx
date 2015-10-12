/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do FRepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DoFRepository#getDofs <em>Dofs</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.GenericDoFPackage#getDoFRepository()
 * @model
 * @generated
 */
public interface DoFRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Dofs</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DegreeOfFreedom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dofs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dofs</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.GenericDoFPackage#getDoFRepository_Dofs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DegreeOfFreedom> getDofs();

} // DoFRepository
