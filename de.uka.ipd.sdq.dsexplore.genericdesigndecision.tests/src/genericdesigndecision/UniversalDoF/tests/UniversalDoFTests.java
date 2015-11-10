/**
 */
package genericdesigndecision.UniversalDoF.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>UniversalDoF</b></em>' package.
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
		TestSuite suite = new UniversalDoFTests("UniversalDoF Tests");
		suite.addTestSuite(MetamodelDescriptionTest.class);
		suite.addTestSuite(GDoFRepositoryTest.class);
		suite.addTestSuite(UniversalDoFTest.class);
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
