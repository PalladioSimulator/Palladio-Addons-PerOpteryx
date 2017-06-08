/**
 */
package ConcernModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elementary Concern Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.ElementaryConcernComponent#getRequires <em>Requires</em>}</li>
 *   <li>{@link ConcernModel.ElementaryConcernComponent#getName <em>Name</em>}</li>
 *   <li>{@link ConcernModel.ElementaryConcernComponent#getDescription <em>Description</em>}</li>
 *   <li>{@link ConcernModel.ElementaryConcernComponent#getAnnotationenrich <em>Annotationenrich</em>}</li>
 * </ul>
 *
 * @see ConcernModel.ConcernModelPackage#getElementaryConcernComponent()
 * @model
 * @generated
 */
public interface ElementaryConcernComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Requires</b></em>' reference list.
	 * The list contents are of type {@link ConcernModel.ElementaryConcernComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' reference list.
	 * @see ConcernModel.ConcernModelPackage#getElementaryConcernComponent_Requires()
	 * @model
	 * @generated
	 */
	EList<ElementaryConcernComponent> getRequires();

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
	 * @see ConcernModel.ConcernModelPackage#getElementaryConcernComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ConcernModel.ElementaryConcernComponent#getName <em>Name</em>}' attribute.
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
	 * @see ConcernModel.ConcernModelPackage#getElementaryConcernComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ConcernModel.ElementaryConcernComponent#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Annotationenrich</b></em>' containment reference list.
	 * The list contents are of type {@link ConcernModel.AnnotationEnrich}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotationenrich</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotationenrich</em>' containment reference list.
	 * @see ConcernModel.ConcernModelPackage#getElementaryConcernComponent_Annotationenrich()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnnotationEnrich> getAnnotationenrich();

} // ElementaryConcernComponent
