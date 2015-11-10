/**
 */
package genericdesigndecision.qualityproperties;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Quality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.qualityproperties.IntegerQualityProperty#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getIntegerQualityProperty()
 * @model
 * @generated
 */
public interface IntegerQualityProperty extends NumericQualityProperty {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see genericdesigndecision.qualityproperties.QualitypropertiesPackage#getIntegerQualityProperty_Value()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link genericdesigndecision.qualityproperties.IntegerQualityProperty#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerQualityProperty
