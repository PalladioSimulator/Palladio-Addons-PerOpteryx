/**
 */
package genericdesigndecision.genericDoF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCL Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.OCLRule#getMainOclQuery <em>Main Ocl Query</em>}</li>
 *   <li>{@link genericdesigndecision.genericDoF.OCLRule#getHelperDefinition <em>Helper Definition</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getOCLRule()
 * @model
 * @generated
 */
public interface OCLRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Main Ocl Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Ocl Query</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Ocl Query</em>' attribute.
	 * @see #setMainOclQuery(String)
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getOCLRule_MainOclQuery()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMainOclQuery();

	/**
	 * Sets the value of the '{@link genericdesigndecision.genericDoF.OCLRule#getMainOclQuery <em>Main Ocl Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Ocl Query</em>' attribute.
	 * @see #getMainOclQuery()
	 * @generated
	 */
	void setMainOclQuery(String value);

	/**
	 * Returns the value of the '<em><b>Helper Definition</b></em>' containment reference list.
	 * The list contents are of type {@link genericdesigndecision.genericDoF.HelperOCLDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper Definition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper Definition</em>' containment reference list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getOCLRule_HelperDefinition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<HelperOCLDefinition> getHelperDefinition();

} // OCLRule
