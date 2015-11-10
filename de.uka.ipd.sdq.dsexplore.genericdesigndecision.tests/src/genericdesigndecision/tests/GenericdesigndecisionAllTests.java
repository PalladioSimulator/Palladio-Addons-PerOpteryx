/**
 */
package genericdesigndecision.tests;

import genericdesigndecision.UniversalDoF.tests.UniversalDoFTests;

import genericdesigndecision.qualityproperties.tests.QualitypropertiesTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Genericdesigndecision</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericdesigndecisionAllTests extends TestSuite {

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
		TestSuite suite = new GenericdesigndecisionAllTests("Genericdesigndecision Tests");
		suite.addTest(GenericdesigndecisionTests.suite());
		suite.addTest(UniversalDoFTests.suite());
		suite.addTest(QualitypropertiesTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericdesigndecisionAllTests(String name) {
		super(name);
	}

} //GenericdesigndecisionAllTests
