/**
 */
package de.uka.ipd.sdq.dsexplore.qml.units;

import de.uka.ipd.sdq.identifier.Identifier;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.units.UnitRepository#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.units.UnitsPackage#getUnitRepository()
 * @model
 * @generated
 */
public interface UnitRepository extends Identifier {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.units.Unit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.units.UnitsPackage#getUnitRepository_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

} // UnitRepository
