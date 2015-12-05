/**
 */
package genericdesigndecision.genericDoF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AOrdered Integer Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.AOrderedIntegerDegree#getListOfIntegers <em>List Of Integers</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAOrderedIntegerDegree()
 * @model abstract="true"
 * @generated
 */
public interface AOrderedIntegerDegree extends ADiscreteDegree, AOrderedDataTypeDegree {
	/**
	 * Returns the value of the '<em><b>List Of Integers</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Of Integers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Of Integers</em>' attribute list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAOrderedIntegerDegree_ListOfIntegers()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Integer> getListOfIntegers();

} // AOrderedIntegerDegree
