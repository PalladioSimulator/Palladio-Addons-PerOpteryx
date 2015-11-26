/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do FRepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository#getPcmDofs <em>Pcm Dofs</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDoFRepository()
 * @model
 * @generated
 */
public interface DoFRepository extends genericdesigndecision.genericDoF.DoFRepository {
	/**
	 * Returns the value of the '<em><b>Pcm Dofs</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Dofs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Dofs</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDoFRepository_PcmDofs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DegreeOfFreedom> getPcmDofs();

} // DoFRepository
