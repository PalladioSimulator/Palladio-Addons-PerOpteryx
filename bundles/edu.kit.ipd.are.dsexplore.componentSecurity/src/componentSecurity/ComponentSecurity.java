/**
 */
package componentSecurity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Security</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentSecurity.ComponentSecurity#getPoCoB <em>Po Co B</em>}</li>
 *   <li>{@link componentSecurity.ComponentSecurity#getTTDV <em>TTDV</em>}</li>
 * </ul>
 *
 * @see componentSecurity.ComponentSecurityPackage#getComponentSecurity()
 * @model
 * @generated
 */
public interface ComponentSecurity extends EObject {
	/**
	 * Returns the value of the '<em><b>Po Co B</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Po Co B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Po Co B</em>' attribute.
	 * @see #setPoCoB(double)
	 * @see componentSecurity.ComponentSecurityPackage#getComponentSecurity_PoCoB()
	 * @model default="0.2"
	 * @generated
	 */
	double getPoCoB();

	/**
	 * Sets the value of the '{@link componentSecurity.ComponentSecurity#getPoCoB <em>Po Co B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Po Co B</em>' attribute.
	 * @see #getPoCoB()
	 * @generated
	 */
	void setPoCoB(double value);

	/**
	 * Returns the value of the '<em><b>TTDV</b></em>' attribute.
	 * The default value is <code>"200.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TTDV</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TTDV</em>' attribute.
	 * @see #setTTDV(double)
	 * @see componentSecurity.ComponentSecurityPackage#getComponentSecurity_TTDV()
	 * @model default="200.0"
	 * @generated
	 */
	double getTTDV();

	/**
	 * Sets the value of the '{@link componentSecurity.ComponentSecurity#getTTDV <em>TTDV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TTDV</em>' attribute.
	 * @see #getTTDV()
	 * @generated
	 */
	void setTTDV(double value);

} // ComponentSecurity
