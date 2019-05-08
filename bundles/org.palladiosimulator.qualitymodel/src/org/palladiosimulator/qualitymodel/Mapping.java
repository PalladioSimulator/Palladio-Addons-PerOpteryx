/**
 */
package org.palladiosimulator.qualitymodel;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.Mapping#getMappingEntries <em>Mapping Entries</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.Mapping#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Mapping Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.palladiosimulator.qualitymodel.MappingEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Entries</em>' containment reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getMapping_MappingEntries()
	 * @model type="org.palladiosimulator.qualitymodel.MappingEntry" containment="true"
	 * @generated
	 */
	EList getMappingEntries();

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' containment reference.
	 * @see #setIdentity(ValueLiteral)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getMapping_Identity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueLiteral getIdentity();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.Mapping#getIdentity <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' containment reference.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(ValueLiteral value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString(); final StringBuilder builder = new StringBuilder(\"Mapping [\"); builder.append(identity instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) identity).getValues().get(0).getEntityName() : identity.getId()).append(\",(\"); for (final Object object : mappingEntries) builder.append(object.toString()); return builder.append(\")]\").toString();'"
	 * @generated
	 */
	String toString();

} // Mapping
