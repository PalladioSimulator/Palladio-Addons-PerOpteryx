/**
 */
package ConcernModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.AnnotationTarget#getJoinPoint <em>Join Point</em>}</li>
 * </ul>
 *
 * @see ConcernModel.ConcernModelPackage#getAnnotationTarget()
 * @model
 * @generated
 */
public interface AnnotationTarget extends Annotation {
	/**
	 * Returns the value of the '<em><b>Join Point</b></em>' attribute.
	 * The default value is <code>"SIGNATURE"</code>.
	 * The literals are from the enumeration {@link ConcernModel.JoinPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Point</em>' attribute.
	 * @see ConcernModel.JoinPoint
	 * @see #setJoinPoint(JoinPoint)
	 * @see ConcernModel.ConcernModelPackage#getAnnotationTarget_JoinPoint()
	 * @model default="SIGNATURE"
	 * @generated
	 */
	JoinPoint getJoinPoint();

	/**
	 * Sets the value of the '{@link ConcernModel.AnnotationTarget#getJoinPoint <em>Join Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Point</em>' attribute.
	 * @see ConcernModel.JoinPoint
	 * @see #getJoinPoint()
	 * @generated
	 */
	void setJoinPoint(JoinPoint value);

} // AnnotationTarget
