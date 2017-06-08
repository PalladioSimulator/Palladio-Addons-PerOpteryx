/**
 */
package concernStrategy.tests;

import concernStrategy.IntegerIntervalRange;
import concernStrategy.StrategymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Integer Interval Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegerIntervalRangeTest extends IntervalRangeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntegerIntervalRangeTest.class);
	}

	/**
	 * Constructs a new Integer Interval Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerIntervalRangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Integer Interval Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IntegerIntervalRange getFixture() {
		return (IntegerIntervalRange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(StrategymodelFactory.eINSTANCE.createIntegerIntervalRange());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IntegerIntervalRangeTest
