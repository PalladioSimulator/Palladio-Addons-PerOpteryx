/**
 */
package genericdesigndecision.universalDoF;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see genericdesigndecision.universalDoF.UniversalDoFPackage
 * @generated
 */
public interface UniversalDoFFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversalDoFFactory eINSTANCE = genericdesigndecision.universalDoF.impl.UniversalDoFFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GDo FRepository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GDo FRepository</em>'.
	 * @generated
	 */
	GDoFRepository createGDoFRepository();

	/**
	 * Returns a new object of class '<em>Generic Do F</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Do F</em>'.
	 * @generated
	 */
	GenericDoF createGenericDoF();

	/**
	 * Returns a new object of class '<em>Universal Do F</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universal Do F</em>'.
	 * @generated
	 */
	UniversalDoF createUniversalDoF();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniversalDoFPackage getUniversalDoFPackage();

} //UniversalDoFFactory
