/**
 */
package genericdesigndecision;

import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Choice represents the choice of one value from the domain of a DegreeOfFreedom. The Choice links the DegreeOfFreedom for which it makes the choice. Additionally, it links one element of the domain of the DegreeOfFreedom. This linking is realised in subclasses of Choice, as it may be either metamodel-specific entities or numbers. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.Choice#isActive <em>Active</em>}</li>
 *   <li>{@link genericdesigndecision.Choice#getValue <em>Value</em>}</li>
 *   <li>{@link genericdesigndecision.Choice#getDofInstance <em>Dof Instance</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.GenericdesigndecisionPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject {
	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getChoice_Active()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link genericdesigndecision.Choice#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getChoice_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link genericdesigndecision.Choice#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Dof Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dof Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dof Instance</em>' reference.
	 * @see #setDofInstance(ADegreeOfFreedom)
	 * @see genericdesigndecision.GenericdesigndecisionPackage#getChoice_DofInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ADegreeOfFreedom getDofInstance();

	/**
	 * Sets the value of the '{@link genericdesigndecision.Choice#getDofInstance <em>Dof Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dof Instance</em>' reference.
	 * @see #getDofInstance()
	 * @generated
	 */
	void setDofInstance(ADegreeOfFreedom value);

} // Choice
