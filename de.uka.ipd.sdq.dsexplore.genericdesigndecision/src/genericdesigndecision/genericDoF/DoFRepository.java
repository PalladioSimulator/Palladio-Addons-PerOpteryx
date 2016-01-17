/**
 */
package genericdesigndecision.genericDoF;

import genericdesigndecision.universalDoF.SpecificDoF;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Do FRepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.DoFRepository#getSdofs <em>Sdofs</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getDoFRepository()
 * @model
 * @generated
 */
public interface DoFRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Sdofs</b></em>' containment reference list.
	 * The list contents are of type {@link genericdesigndecision.universalDoF.SpecificDoF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sdofs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sdofs</em>' containment reference list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getDoFRepository_Sdofs()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SpecificDoF> getSdofs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean deleteSDoF(SpecificDoF sdof);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SpecificDoF getSDoF(String name);

	boolean newSDoF(String name, Class<? extends ADegreeOfFreedom> degree);

} // DoFRepository
