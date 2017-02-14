/**
 */
package ConcernModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.ConcernRepository#getConcerns <em>Concerns</em>}</li>
 * </ul>
 *
 * @see ConcernModel.ConcernModelPackage#getConcernRepository()
 * @model
 * @generated
 */
public interface ConcernRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link ConcernModel.Concern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see ConcernModel.ConcernModelPackage#getConcernRepository_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concern> getConcerns();

} // ConcernRepository
