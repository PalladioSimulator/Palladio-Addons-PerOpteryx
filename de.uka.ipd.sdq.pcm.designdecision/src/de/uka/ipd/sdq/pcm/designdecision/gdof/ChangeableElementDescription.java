/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof;

import de.uka.ipd.sdq.featuremodel.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Changeable Element Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription#getPcmValueRule <em>Pcm Value Rule</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription#getPcmSelectionRule <em>Pcm Selection Rule</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getChangeableElementDescription()
 * @model
 * @generated
 */
public interface ChangeableElementDescription
		extends NamedElement, genericdesigndecision.genericDoF.ChangeableElementDescription {
	/**
	 * Returns the value of the '<em><b>Pcm Value Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Value Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Value Rule</em>' containment reference.
	 * @see #setPcmValueRule(ValueRule)
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getChangeableElementDescription_PcmValueRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueRule getPcmValueRule();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription#getPcmValueRule <em>Pcm Value Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Value Rule</em>' containment reference.
	 * @see #getPcmValueRule()
	 * @generated
	 */
	void setPcmValueRule(ValueRule value);

	/**
	 * Returns the value of the '<em><b>Pcm Selection Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcm Selection Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcm Selection Rule</em>' containment reference.
	 * @see #setPcmSelectionRule(SelectionRule)
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getChangeableElementDescription_PcmSelectionRule()
	 * @model containment="true"
	 * @generated
	 */
	SelectionRule getPcmSelectionRule();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription#getPcmSelectionRule <em>Pcm Selection Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcm Selection Rule</em>' containment reference.
	 * @see #getPcmSelectionRule()
	 * @generated
	 */
	void setPcmSelectionRule(SelectionRule value);

} // ChangeableElementDescription
