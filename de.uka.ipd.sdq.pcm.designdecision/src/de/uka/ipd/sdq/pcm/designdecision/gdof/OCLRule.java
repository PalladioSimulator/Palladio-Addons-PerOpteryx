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
 * A representation of the model object '<em><b>OCL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule#getPcmHelperDefinition <em>Pcm Helper Definition</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getOCLRule()
 * @model
 * @generated
 */
public interface OCLRule extends genericdesigndecision.genericDoF.OCLRule {
	/**
	 * Returns the value of the '<em><b>Pcm Helper Definition</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Helper Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Helper Definition</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getOCLRule_PcmHelperDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<HelperOCLDefinition> getPcmHelperDefinition();

} // OCLRule
