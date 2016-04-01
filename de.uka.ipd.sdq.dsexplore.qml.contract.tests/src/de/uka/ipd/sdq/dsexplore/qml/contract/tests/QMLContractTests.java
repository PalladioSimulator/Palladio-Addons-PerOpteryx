/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>contract</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QMLContractTests extends TestSuite {

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
		TestSuite suite = new QMLContractTests("contract Tests");
		suite.addTestSuite(SimpleQMLContractTest.class);
		suite.addTestSuite(PercentileTest.class);
		suite.addTestSuite(FrequencyTest.class);
		suite.addTestSuite(MeanTest.class);
		suite.addTestSuite(VarianceTest.class);
		suite.addTestSuite(RefinedQMLContractTest.class);
		suite.addTestSuite(ValueTest.class);
		suite.addTestSuite(ObjectiveTest.class);
		suite.addTestSuite(ConstraintTest.class);
		suite.addTestSuite(ScaleLiteralTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMLContractTests(String name) {
		super(name);
	}

} //QMLContractTests
