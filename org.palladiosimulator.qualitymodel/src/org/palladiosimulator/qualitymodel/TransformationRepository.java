/**
 */
package org.palladiosimulator.qualitymodel;

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
 *   <li>{@link org.palladiosimulator.qualitymodel.TransformationRepository#getTransformations <em>Transformations</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getTransformationRepository()
 * @model
 * @generated
 */
public interface TransformationRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformations</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.Transformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformations</em>' containment reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getTransformationRepository_Transformations()
	 * @model type="org.palladiosimulator.qualitymodel.Transformation" containment="true"
	 * @generated
	 */
	EList getTransformations();

} // TransformationRepository
