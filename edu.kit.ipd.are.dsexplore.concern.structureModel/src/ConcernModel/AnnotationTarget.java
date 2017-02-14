/**
 */
package ConcernModel;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.Signature;

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
 *   <li>{@link ConcernModel.AnnotationTarget#getSignatures <em>Signatures</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Signatures</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signatures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signatures</em>' reference list.
	 * @see ConcernModel.ConcernModelPackage#getAnnotationTarget_Signatures()
	 * @model
	 * @generated
	 */
	EList<Signature> getSignatures();

} // AnnotationTarget
