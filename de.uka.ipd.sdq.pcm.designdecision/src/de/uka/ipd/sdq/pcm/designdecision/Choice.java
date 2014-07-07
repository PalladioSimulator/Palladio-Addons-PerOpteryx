/**
 */
package de.uka.ipd.sdq.pcm.designdecision;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Choice represents the choice of one value from the domain of a DegreeOfFreedom. The Choice links the DegreeOfFreedom for which it makes the choice. Additionally, it links one element of the domain of the DegreeOfFreedom. This linking is realised in subclasses of Choice, as it may be either PCM Entities or numbers. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Choice#isActive <em>Is Active</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Choice#getValue <em>Value</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.Choice#getDegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getChoice_IsActive()
	 * @model default="true" required="true" ordered="false"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.Choice#isActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setIsActive(boolean value);

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
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getChoice_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getValue();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.Choice#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Object value);

	/**
	 * Returns the value of the '<em><b>Degree Of Freedom Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree Of Freedom Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree Of Freedom Instance</em>' reference.
	 * @see #setDegreeOfFreedomInstance(DegreeOfFreedomInstance)
	 * @see de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage#getChoice_DegreeOfFreedomInstance()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DegreeOfFreedomInstance getDegreeOfFreedomInstance();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.Choice#getDegreeOfFreedomInstance <em>Degree Of Freedom Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree Of Freedom Instance</em>' reference.
	 * @see #getDegreeOfFreedomInstance()
	 * @generated
	 */
	void setDegreeOfFreedomInstance(DegreeOfFreedomInstance value);

} // Choice
