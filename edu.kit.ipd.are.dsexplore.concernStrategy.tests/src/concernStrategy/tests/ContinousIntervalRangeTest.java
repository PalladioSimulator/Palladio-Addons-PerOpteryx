/**
 */
package concernStrategy.tests;

import concernStrategy.ContinousIntervalRange;
import concernStrategy.StrategymodelFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Continous Interval Range</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContinousIntervalRangeTest extends IntervalRangeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContinousIntervalRangeTest.class);
	}

	/**
	 * Constructs a new Continous Interval Range test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinousIntervalRangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Continous Interval Range test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ContinousIntervalRange getFixture() {
		return (ContinousIntervalRange)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(StrategymodelFactory.eINSTANCE.createContinousIntervalRange());
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

} //ContinousIntervalRangeTest
