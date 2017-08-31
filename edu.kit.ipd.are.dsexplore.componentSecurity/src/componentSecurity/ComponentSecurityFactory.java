/**
 */
package componentSecurity;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentSecurity.ComponentSecurityPackage
 * @generated
 */
public interface ComponentSecurityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentSecurityFactory eINSTANCE = componentSecurity.impl.ComponentSecurityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Security</em>'.
	 * @generated
	 */
	ComponentSecurity createComponentSecurity();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	ComponentSecurityRepository createComponentSecurityRepository();

	/**
	 * Returns a new object of class '<em>Security Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Target</em>'.
	 * @generated
	 */
	SecurityTarget createSecurityTarget();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentSecurityPackage getComponentSecurityPackage();

} //ComponentSecurityFactory
