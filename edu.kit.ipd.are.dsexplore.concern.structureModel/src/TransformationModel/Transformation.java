/**
 */
package TransformationModel;

import ConcernModel.AnnotationEnrich;
import ConcernModel.AnnotationTarget;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TransformationModel.Transformation#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link TransformationModel.Transformation#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link TransformationModel.Transformation#getInjectable <em>Injectable</em>}</li>
 *   <li>{@link TransformationModel.Transformation#getTarget <em>Target</em>}</li>
 *   <li>{@link TransformationModel.Transformation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see TransformationModel.TransformationModelPackage#getTransformation()
 * @model abstract="true"
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(int)
	 * @see TransformationModel.TransformationModelPackage#getTransformation_Threshold()
	 * @model default="0"
	 * @generated
	 */
	int getThreshold();

	/**
	 * Sets the value of the '{@link TransformationModel.Transformation#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple</em>' attribute.
	 * @see #setMultiple(boolean)
	 * @see TransformationModel.TransformationModelPackage#getTransformation_Multiple()
	 * @model
	 * @generated
	 */
	boolean isMultiple();

	/**
	 * Sets the value of the '{@link TransformationModel.Transformation#isMultiple <em>Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple</em>' attribute.
	 * @see #isMultiple()
	 * @generated
	 */
	void setMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Injectable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Injectable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Injectable</em>' reference.
	 * @see #setInjectable(AnnotationEnrich)
	 * @see TransformationModel.TransformationModelPackage#getTransformation_Injectable()
	 * @model required="true"
	 * @generated
	 */
	AnnotationEnrich getInjectable();

	/**
	 * Sets the value of the '{@link TransformationModel.Transformation#getInjectable <em>Injectable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Injectable</em>' reference.
	 * @see #getInjectable()
	 * @generated
	 */
	void setInjectable(AnnotationEnrich value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AnnotationTarget)
	 * @see TransformationModel.TransformationModelPackage#getTransformation_Target()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTarget getTarget();

	/**
	 * Sets the value of the '{@link TransformationModel.Transformation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AnnotationTarget value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TransformationModel.TransformationModelPackage#getTransformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TransformationModel.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transformation
