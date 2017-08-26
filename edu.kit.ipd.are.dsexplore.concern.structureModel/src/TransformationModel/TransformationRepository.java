/**
 */
package TransformationModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TransformationModel.TransformationRepository#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see TransformationModel.TransformationModelPackage#getTransformationRepository()
 * @model
 * @generated
 */
public interface TransformationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference list.
	 * The list contents are of type {@link TransformationModel.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference list.
	 * @see TransformationModel.TransformationModelPackage#getTransformationRepository_Transformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transformation> getTransformation();

} // TransformationRepository
