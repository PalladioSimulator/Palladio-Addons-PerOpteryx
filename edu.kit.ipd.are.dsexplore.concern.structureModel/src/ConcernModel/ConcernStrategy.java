/**
 */
package ConcernModel;

import SolutionModel.Solution;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.ConcernStrategy#getName <em>Name</em>}</li>
 *   <li>{@link ConcernModel.ConcernStrategy#getDescription <em>Description</em>}</li>
 *   <li>{@link ConcernModel.ConcernStrategy#getConcernSolutions <em>Concern Solutions</em>}</li>
 * </ul>
 *
 * @see ConcernModel.ConcernModelPackage#getConcernStrategy()
 * @model
 * @generated
 */
public interface ConcernStrategy extends EObject {
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
	 * @see ConcernModel.ConcernModelPackage#getConcernStrategy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConcernModel.ConcernStrategy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ConcernModel.ConcernModelPackage#getConcernStrategy_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ConcernModel.ConcernStrategy#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Concern Solutions</b></em>' reference list.
	 * The list contents are of type {@link SolutionModel.Solution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern Solutions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern Solutions</em>' reference list.
	 * @see ConcernModel.ConcernModelPackage#getConcernStrategy_ConcernSolutions()
	 * @model required="true"
	 * @generated
	 */
	EList<Solution> getConcernSolutions();

} // ConcernStrategy
