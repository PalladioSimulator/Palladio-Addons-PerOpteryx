/**
 */
package genericdesigndecision.genericDoF.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>genericDoF</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDoFTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new GenericDoFTests("genericDoF Tests");
		suite.addTestSuite(DoFRepositoryTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFTests(String name) {
		super(name);
	}

} //GenericDoFTests
