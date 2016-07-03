/**
 */
package de.uka.ipd.sdq.pcm.designdecision.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>designdecision</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class designdecisionTests extends TestSuite {

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
		TestSuite suite = new designdecisionTests("designdecision Tests");
		suite.addTestSuite(DiscreteRangeChoiceTest.class);
		suite.addTestSuite(DegreeOfFreedomInstanceTest.class);
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
	public designdecisionTests(String name) {
		super(name);
	}

} //designdecisionTests
