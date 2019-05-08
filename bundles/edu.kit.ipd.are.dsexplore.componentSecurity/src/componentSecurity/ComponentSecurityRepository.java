/**
 */
package componentSecurity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link componentSecurity.ComponentSecurityRepository#getComponentsecurity <em>Componentsecurity</em>}</li>
 * </ul>
 *
 * @see componentSecurity.ComponentSecurityPackage#getComponentSecurityRepository()
 * @model
 * @generated
 */
public interface ComponentSecurityRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Componentsecurity</b></em>' containment reference list.
	 * The list contents are of type {@link componentSecurity.ComponentSecurity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Componentsecurity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Componentsecurity</em>' containment reference list.
	 * @see componentSecurity.ComponentSecurityPackage#getComponentSecurityRepository_Componentsecurity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentSecurity> getComponentsecurity();

} // ComponentSecurityRepository
