/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional As Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This Degree of Freedom is representing the existence of an optional feature in the current assembly.
 * The Feature itself will set as "PrimaryChanged".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalAsDegree#isSet <em>Is Set</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getOptionalAsDegree()
 * @model
 * @generated
 */
public interface OptionalAsDegree extends ClassAsReferenceDegree {
	/**
	 * Returns the value of the '<em><b>Is Set</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This bool indicates whether the OptionalFeature can be present or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Set</em>' attribute.
	 * @see #setIsSet(boolean)
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getOptionalAsDegree_IsSet()
	 * @model default="false" unique="false" dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isSet();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalAsDegree#isSet <em>Is Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Set</em>' attribute.
	 * @see #isSet()
	 * @generated
	 */
	void setIsSet(boolean value);

} // OptionalAsDegree
