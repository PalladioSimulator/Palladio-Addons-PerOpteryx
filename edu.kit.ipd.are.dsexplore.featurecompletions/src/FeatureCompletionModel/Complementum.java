/**
 */
package FeatureCompletionModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complementum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.Complementum#getReplication <em>Replication</em>}</li>
 *   <li>{@link FeatureCompletionModel.Complementum#getVisnetum <em>Visnetum</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getComplementum()
 * @model
 * @generated
 */
public interface Complementum extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Replication</b></em>' attribute.
	 * The default value is <code>"SINGLE"</code>.
	 * The literals are from the enumeration {@link FeatureCompletionModel.Replication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication</em>' attribute.
	 * @see FeatureCompletionModel.Replication
	 * @see #setReplication(Replication)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getComplementum_Replication()
	 * @model default="SINGLE" required="true"
	 * @generated
	 */
	Replication getReplication();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.Complementum#getReplication <em>Replication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication</em>' attribute.
	 * @see FeatureCompletionModel.Replication
	 * @see #getReplication()
	 * @generated
	 */
	void setReplication(Replication value);

	/**
	 * Returns the value of the '<em><b>Visnetum</b></em>' attribute.
	 * The default value is <code>"SIGNATURE"</code>.
	 * The literals are from the enumeration {@link FeatureCompletionModel.Visnetum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visnetum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visnetum</em>' attribute.
	 * @see FeatureCompletionModel.Visnetum
	 * @see #setVisnetum(Visnetum)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getComplementum_Visnetum()
	 * @model default="SIGNATURE" required="true"
	 * @generated
	 */
	Visnetum getVisnetum();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.Complementum#getVisnetum <em>Visnetum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visnetum</em>' attribute.
	 * @see FeatureCompletionModel.Visnetum
	 * @see #getVisnetum()
	 * @generated
	 */
	void setVisnetum(Visnetum value);

} // Complementum
