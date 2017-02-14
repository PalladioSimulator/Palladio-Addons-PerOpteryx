/**
 */
package concernStrategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.IntegerAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getIntegerAttribute()
 * @model
 * @generated
 */
public interface IntegerAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(int)
	 * @see concernStrategy.StrategymodelPackage#getIntegerAttribute_DefaultValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getDefaultValue();

	/**
	 * Sets the value of the '{@link concernStrategy.IntegerAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(int value);

} // IntegerAttribute
