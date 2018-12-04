/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.Transformation#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.Transformation#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(Mapping)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getTransformation_Mapping()
	 * @model required="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.Transformation#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getTransformation_Input()
	 * @model type="de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension" required="true"
	 *        extendedMetaData="name='input' namespace=''"
	 * @generated
	 */
	EList getInput();

} // Transformation
