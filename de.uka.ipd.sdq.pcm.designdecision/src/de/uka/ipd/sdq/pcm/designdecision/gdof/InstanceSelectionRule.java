/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule#getPcmContextInstance <em>Pcm Context Instance</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getInstanceSelectionRule()
 * @model
 * @generated
 */
public interface InstanceSelectionRule extends SelectionRule, genericdesigndecision.genericDoF.InstanceSelectionRule {
	/**
	 * Returns the value of the '<em><b>Pcm Context Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Context Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Context Instance</em>' reference.
	 * @see #setPcmContextInstance(ChangeableElementDescription)
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getInstanceSelectionRule_PcmContextInstance()
	 * @model ordered="false"
	 * @generated
	 */
	ChangeableElementDescription getPcmContextInstance();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule#getPcmContextInstance <em>Pcm Context Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Context Instance</em>' reference.
	 * @see #getPcmContextInstance()
	 * @generated
	 */
	void setPcmContextInstance(ChangeableElementDescription value);

} // InstanceSelectionRule
