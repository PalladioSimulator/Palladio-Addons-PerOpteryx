/**
 */
package genericdesigndecision.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>genericdesigndecision</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericdesigndecisionTests extends TestSuite {

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
		TestSuite suite = new GenericdesigndecisionTests("genericdesigndecision Tests");
		suite.addTestSuite(DiscreteRangeChoiceTest.class);
		suite.addTestSuite(ClassChoiceTest.class);
		suite.addTestSuite(ContinousRangeChoiceTest.class);
		suite.addTestSuite(CandidatesTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericdesigndecisionTests(String name) {
		super(name);
	}

} //GenericdesigndecisionTests
