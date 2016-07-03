/**
 */
package de.uka.ipd.sdq.pcm.designdecision.comparerepository;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffModel <em>Diff Model</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffDescription <em>Diff Description</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.comparerepositoryPackage#getDiff()
 * @model
 * @generated
 */
public interface Diff extends EObject {
	/**
	 * Returns the value of the '<em><b>Diff Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Model</em>' reference.
	 * @see #setDiffModel(EObject)
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.comparerepositoryPackage#getDiff_DiffModel()
	 * @model required="true"
	 * @generated
	 */
	EObject getDiffModel();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffModel <em>Diff Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Model</em>' reference.
	 * @see #getDiffModel()
	 * @generated
	 */
	void setDiffModel(EObject value);

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
	 * @see de.uka.ipd.sdq.pcm.designdecision.comparerepository.comparerepositoryPackage#getDiff_DiffDescription()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	String getDiffDescription();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.comparerepository.Diff#getDiffDescription <em>Diff Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Description</em>' attribute.
	 * @see #getDiffDescription()
	 * @generated
	 */
	void setDiffDescription(String value);

} // Diff
