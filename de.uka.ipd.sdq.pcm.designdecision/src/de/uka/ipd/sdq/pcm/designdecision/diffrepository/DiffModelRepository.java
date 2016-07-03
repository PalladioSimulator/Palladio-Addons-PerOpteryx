/**
 */
package de.uka.ipd.sdq.pcm.designdecision.diffrepository;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Model Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModelRepository#getAvailableDiffModels_DiffRepository <em>Available Diff Models Diff Repository</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage#getDiffModelRepository()
 * @model
 * @generated
 */
public interface DiffModelRepository extends EObject, NamedElement {
	/**
	 * Returns the value of the '<em><b>Available Diff Models Diff Repository</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Diff Models Diff Repository</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Diff Models Diff Repository</em>' containment reference list.
	 * @see de.uka.ipd.sdq.pcm.designdecision.diffrepository.DiffrepositoryPackage#getDiffModelRepository_AvailableDiffModels_DiffRepository()
	 * @model containment="true"
	 * @generated
	 */
	EList<DiffModel> getAvailableDiffModels_DiffRepository();

} // DiffModelRepository
