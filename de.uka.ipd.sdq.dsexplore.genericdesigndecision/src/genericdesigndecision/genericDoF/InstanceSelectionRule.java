/**
 */
package genericdesigndecision.genericDoF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Selection Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.InstanceSelectionRule#getContextInstance <em>Context Instance</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getInstanceSelectionRule()
 * @model
 * @generated
 */
public interface InstanceSelectionRule extends SelectionRule {
	/**
	 * Returns the value of the '<em><b>Context Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Instance</em>' reference.
	 * @see #setContextInstance(ChangeableElementDescription)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getInstanceSelectionRule_ContextInstance()
	 * @model ordered="false"
	 * @generated
	 */
	ChangeableElementDescription getContextInstance();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.InstanceSelectionRule#getContextInstance <em>Context Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Instance</em>' reference.
	 * @see #getContextInstance()
	 * @generated
	 */
	void setContextInstance(ChangeableElementDescription value);

} // InstanceSelectionRule
