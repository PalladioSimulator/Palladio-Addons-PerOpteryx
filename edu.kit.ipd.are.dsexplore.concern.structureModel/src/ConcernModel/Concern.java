/**
 */
package ConcernModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.Concern#getStrategies <em>Strategies</em>}</li>
 *   <li>{@link ConcernModel.Concern#getComponents <em>Components</em>}</li>
 *   <li>{@link ConcernModel.Concern#getName <em>Name</em>}</li>
 *   <li>{@link ConcernModel.Concern#getDescription <em>Description</em>}</li>
 *   <li>{@link ConcernModel.Concern#getAnnotationtarget <em>Annotationtarget</em>}</li>
 *   <li>{@link ConcernModel.Concern#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see ConcernModel.ConcernModelPackage#getConcern()
 * @model
 * @generated
 */
public interface Concern extends EObject {
	/**
	 * Returns the value of the '<em><b>Strategies</b></em>' containment reference list.
	 * The list contents are of type {@link ConcernModel.ConcernStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strategies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategies</em>' containment reference list.
	 * @see ConcernModel.ConcernModelPackage#getConcern_Strategies()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcernStrategy> getStrategies();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link ConcernModel.ElementaryConcernComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see ConcernModel.ConcernModelPackage#getConcern_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementaryConcernComponent> getComponents();

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
	 * @see ConcernModel.ConcernModelPackage#getConcern_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConcernModel.Concern#getName <em>Name</em>}' attribute.
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
	 * @see ConcernModel.ConcernModelPackage#getConcern_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ConcernModel.Concern#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotationtarget</b></em>' containment reference list.
	 * The list contents are of type {@link ConcernModel.AnnotationTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotationtarget</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotationtarget</em>' containment reference list.
	 * @see ConcernModel.ConcernModelPackage#getConcern_Annotationtarget()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationTarget> getAnnotationtarget();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link ConcernModel.DeploymentConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see ConcernModel.ConcernModelPackage#getConcern_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentConstraint> getConstraints();

} // Concern
