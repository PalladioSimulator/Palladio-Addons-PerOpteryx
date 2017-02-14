/**
 */
package concernStrategy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.DoubleAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getDoubleAttribute()
 * @model
 * @generated
 */
public interface DoubleAttribute extends Attribute {
	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(double)
	 * @see concernStrategy.StrategymodelPackage#getDoubleAttribute_DefaultValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getDefaultValue();

	/**
	 * Sets the value of the '{@link concernStrategy.DoubleAttribute#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(double value);

} // DoubleAttribute
