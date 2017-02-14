/**
 */
package concernStrategy.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>concernStrategy</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategymodelTests extends TestSuite {

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
		TestSuite suite = new StrategymodelTests("concernStrategy Tests");
		suite.addTestSuite(FeatureTest.class);
		suite.addTestSuite(SimpleTest.class);
		suite.addTestSuite(FeatureGroupTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategymodelTests(String name) {
		super(name);
	}

} //StrategymodelTests
