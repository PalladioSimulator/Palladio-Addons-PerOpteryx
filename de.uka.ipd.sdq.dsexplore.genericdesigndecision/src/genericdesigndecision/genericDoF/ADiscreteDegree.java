/**
 */
package genericdesigndecision.genericDoF;

import genericdesigndecision.Choice;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADiscrete Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getADiscreteDegree()
 * @model abstract="true"
 * @generated
 */
public interface ADiscreteDegree extends ADataTypeDegree {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Choice createRandomChoice();

} // ADiscreteDegree
