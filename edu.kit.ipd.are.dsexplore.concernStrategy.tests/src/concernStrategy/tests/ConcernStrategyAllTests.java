/**
 */
package concernStrategy.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ConcernStrategy</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernStrategyAllTests extends TestSuite {

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
		TestSuite suite = new ConcernStrategyAllTests("ConcernStrategy Tests");
		suite.addTest(StrategymodelTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernStrategyAllTests(String name) {
		super(name);
	}

} //ConcernStrategyAllTests
