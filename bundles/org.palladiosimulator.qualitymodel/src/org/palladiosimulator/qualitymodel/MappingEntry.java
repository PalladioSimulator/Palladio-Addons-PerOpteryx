/**
 */
package org.palladiosimulator.qualitymodel;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.MappingEntry#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.MappingEntry#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getMappingEntry()
 * @model
 * @generated
 */
public interface MappingEntry extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueLiteral)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getMappingEntry_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueLiteral getValue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.MappingEntry#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueLiteral value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference list.
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getMappingEntry_Key()
	 * @model type="de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral" containment="true" required="true"
	 * @generated
	 */
	EList getKey();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString(); final StringBuilder builder = new StringBuilder(key.size() * 3); String prefix = \"\"; for (final Object object : key) { builder.append(prefix); prefix = \",\"; builder.append(object instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) object).getValues().get(0).getEntityName() : ((ValueLiteral) object).getId()); } return builder.append(\"=\").append( (value instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) value).getValues().get(0).getEntityName() : value.getId())) .toString();'"
	 * @generated
	 */
	String toString();

} // MappingEntry
