/**
 */
package dmlsupport.helper;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dmlsupport.helper.HelperPackage
 * @generated
 */
public interface HelperFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelperFactory eINSTANCE = dmlsupport.helper.impl.HelperFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DML Phenotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DML Phenotype</em>'.
	 * @generated
	 */
	DMLPhenotype createDMLPhenotype(String genotypeID, long numericId);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HelperPackage getHelperPackage();

} //HelperFactory
