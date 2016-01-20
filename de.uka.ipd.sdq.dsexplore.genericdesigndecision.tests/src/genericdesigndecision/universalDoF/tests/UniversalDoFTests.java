/**
 */
package genericdesigndecision.universalDoF.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>universalDoF</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversalDoFTests extends TestSuite {

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
		TestSuite suite = new UniversalDoFTests("universalDoF Tests");
		suite.addTestSuite(GDoFRepositoryTest.class);
		suite.addTestSuite(UniversalDoFTest.class);
		suite.addTestSuite(GenericDoFTest.class);
		suite.addTestSuite(SpecificDoFTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversalDoFTests(String name) {
		super(name);
	}

} //UniversalDoFTests
