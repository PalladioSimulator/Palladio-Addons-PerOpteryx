/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nqr Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.NqrRepository#getNqrs <em>Nqrs</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getNqrRepository()
 * @model
 * @generated
 */
public interface NqrRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Nqrs</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.Nqr}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nqrs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nqrs</em>' containment reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getNqrRepository_Nqrs()
	 * @model type="org.palladiosimulator.qualitymodel.Nqr" containment="true"
	 * @generated
	 */
	EList getNqrs();

} // NqrRepository
