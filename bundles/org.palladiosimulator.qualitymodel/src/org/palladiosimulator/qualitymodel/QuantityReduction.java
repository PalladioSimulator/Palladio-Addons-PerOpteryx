/**
 */
package org.palladiosimulator.qualitymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantity Reduction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.QuantityReduction#getMapping <em>Mapping</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getQuantityReduction()
 * @model
 * @generated
 */
public interface QuantityReduction extends Reduction {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(Mapping)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getQuantityReduction_Mapping()
	 * @model required="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.QuantityReduction#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

} // QuantityReduction
