/**
 */
package SolutionModel;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.Repository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SolutionModel.Solution#getName <em>Name</em>}</li>
 *   <li>{@link SolutionModel.Solution#getRepository <em>Repository</em>}</li>
 *   <li>{@link SolutionModel.Solution#getCostRepository <em>Cost Repository</em>}</li>
 * </ul>
 *
 * @see SolutionModel.SolutionModelPackage#getSolution()
 * @model
 * @generated
 */
public interface Solution extends EObject {
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
	 * @see SolutionModel.SolutionModelPackage#getSolution_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link SolutionModel.Solution#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' reference.
	 * @see #setRepository(Repository)
	 * @see SolutionModel.SolutionModelPackage#getSolution_Repository()
	 * @model required="true"
	 * @generated
	 */
	Repository getRepository();

	/**
	 * Sets the value of the '{@link SolutionModel.Solution#getRepository <em>Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(Repository value);

	/**
	 * Returns the value of the '<em><b>Cost Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Repository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Repository</em>' reference.
	 * @see #setCostRepository(EObject)
	 * @see SolutionModel.SolutionModelPackage#getSolution_CostRepository()
	 * @model
	 * @generated
	 */
	EObject getCostRepository();

	/**
	 * Sets the value of the '{@link SolutionModel.Solution#getCostRepository <em>Cost Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost Repository</em>' reference.
	 * @see #getCostRepository()
	 * @generated
	 */
	void setCostRepository(EObject value);

} // Solution
