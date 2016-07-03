/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffModel <em>Diff Model</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffDescription <em>Diff Description</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage#getDiffModel()
 * @model
 * @generated
 */
public interface DiffModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff Model</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Model</em>' reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage#getDiffModel_DiffModel()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getDiffModel();

	/**
	 * Returns the value of the '<em><b>Diff Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Description</em>' attribute.
	 * @see #setDiffDescription(String)
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage#getDiffModel_DiffDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	String getDiffDescription();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel#getDiffDescription <em>Diff Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Description</em>' attribute.
	 * @see #getDiffDescription()
	 * @generated
	 */
	void setDiffDescription(String value);

} // DiffModel
