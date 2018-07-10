/**
 */
package concernStrategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.StringAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getStringAttribute()
 * @model
 * @generated
 */
public interface StringAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see concernStrategy.StrategymodelPackage#getStringAttribute_DefaultValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link concernStrategy.StringAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

} // StringAttribute
