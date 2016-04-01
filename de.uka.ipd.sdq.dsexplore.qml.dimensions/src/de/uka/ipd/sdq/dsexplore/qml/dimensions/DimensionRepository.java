/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage#getDimensionRepository()
 * @model
 * @generated
 */
public interface DimensionRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsPackage#getDimensionRepository_Dimensions()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Dimension> getDimensions();

} // DimensionRepository
