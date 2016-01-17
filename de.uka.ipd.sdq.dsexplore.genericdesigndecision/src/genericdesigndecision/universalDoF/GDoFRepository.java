/**
 */
package genericdesigndecision.universalDoF;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDo FRepository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.GDoFRepository#getGdofs <em>Gdofs</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getGDoFRepository()
 * @model
 * @generated
 */
public interface GDoFRepository extends EObject {

	/**
	 * Returns the value of the '<em><b>Gdofs</b></em>' containment reference list.
	 * The list contents are of type {@link genericdesigndecision.universalDoF.GenericDoF}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdofs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdofs</em>' containment reference list.
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getGDoFRepository_Gdofs()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericDoF> getGdofs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean newGDoF(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean deleteGDoF(GenericDoF gdof);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GenericDoF getGDoF(String name);


} // GDoFRepository
