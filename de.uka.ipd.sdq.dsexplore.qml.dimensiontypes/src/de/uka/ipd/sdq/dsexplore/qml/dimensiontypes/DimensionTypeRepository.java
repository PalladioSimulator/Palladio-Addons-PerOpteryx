/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Type Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository#getDimensionTypes <em>Dimension Types</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeRepository()
 * @model
 * @generated
 */
public interface DimensionTypeRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Dimension Types</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Types</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeRepository_DimensionTypes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DimensionType> getDimensionTypes();

} // DimensionTypeRepository
