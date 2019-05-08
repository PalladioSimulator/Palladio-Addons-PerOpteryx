/**
 */
package org.palladiosimulator.qualitymodel;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nqr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.palladiosimulator.qualitymodel.Nqr#getValue <em>Value</em>}</li>
 *   <li>{@link org.palladiosimulator.qualitymodel.Nqr#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getNqr()
 * @model
 * @generated
 */
public interface Nqr extends EObject, Entity {
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
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getNqr_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueLiteral getValue();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.Nqr#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueLiteral value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see org.palladiosimulator.qualitymodel.QualityModelPackage#getNqr_Dimension()
	 * @model required="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link org.palladiosimulator.qualitymodel.Nqr#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (eIsProxy()) return super.toString(); return \"Nqr (\" + dimension.getEntityName() + \" = \" + (value instanceof de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral ? ((de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral) value).getValues().get(0).getEntityName() : value.getId()) + \")\";'"
	 * @generated
	 */
	String toString();

} // Nqr
