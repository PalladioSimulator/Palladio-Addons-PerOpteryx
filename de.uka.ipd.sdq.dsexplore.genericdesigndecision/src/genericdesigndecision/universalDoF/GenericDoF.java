/**
 */
package genericdesigndecision.universalDoF;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Do F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.GenericDoF#getGdofID <em>Gdof ID</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getGenericDoF()
 * @model
 * @generated
 */
public interface GenericDoF extends EObject {
	/**
	 * Returns the value of the '<em><b>Gdof ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdof ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdof ID</em>' attribute.
	 * @see #setGdofID(int)
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getGenericDoF_GdofID()
	 * @model
	 * @generated
	 */
	int getGdofID();

	/**
	 * Sets the value of the '{@link genericdesigndecision.universalDoF.GenericDoF#getGdofID <em>Gdof ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdof ID</em>' attribute.
	 * @see #getGdofID()
	 * @generated
	 */
	void setGdofID(int value);

} // GenericDoF
