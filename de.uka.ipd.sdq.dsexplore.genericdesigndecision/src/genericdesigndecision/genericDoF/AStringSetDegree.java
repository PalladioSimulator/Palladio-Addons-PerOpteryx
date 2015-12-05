/**
 */
package genericdesigndecision.genericDoF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AString Set Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.AStringSetDegree#getStringValues <em>String Values</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAStringSetDegree()
 * @model abstract="true"
 * @generated
 */
public interface AStringSetDegree extends AUnorderedDegree {
	/**
	 * Returns the value of the '<em><b>String Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Values</em>' attribute list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAStringSetDegree_StringValues()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getStringValues();

} // AStringSetDegree
