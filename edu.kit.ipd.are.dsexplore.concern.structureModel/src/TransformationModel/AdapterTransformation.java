/**
 */
package TransformationModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adapter Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TransformationModel.AdapterTransformation#getAppear <em>Appear</em>}</li>
 * </ul>
 *
 * @see TransformationModel.TransformationModelPackage#getAdapterTransformation()
 * @model
 * @generated
 */
public interface AdapterTransformation extends Transformation {
	/**
	 * Returns the value of the '<em><b>Appear</b></em>' attribute.
	 * The default value is <code>"BEFORE"</code>.
	 * The literals are from the enumeration {@link TransformationModel.Appearance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Appear</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appear</em>' attribute.
	 * @see TransformationModel.Appearance
	 * @see #setAppear(Appearance)
	 * @see TransformationModel.TransformationModelPackage#getAdapterTransformation_Appear()
	 * @model default="BEFORE"
	 * @generated
	 */
	Appearance getAppear();

	/**
	 * Sets the value of the '{@link TransformationModel.AdapterTransformation#getAppear <em>Appear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appear</em>' attribute.
	 * @see TransformationModel.Appearance
	 * @see #getAppear()
	 * @generated
	 */
	void setAppear(Appearance value);

} // AdapterTransformation
