/**
 */
package featureSolution.tests;

import featureSolution.ControlFlowPlacementStrategy;
import featureSolution.FeatureSolutionFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Control Flow Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlFlowPlacementStrategyTest extends PlacementStrategyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ControlFlowPlacementStrategyTest.class);
	}

	/**
	 * Constructs a new Control Flow Placement Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowPlacementStrategyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Control Flow Placement Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ControlFlowPlacementStrategy getFixture() {
		return (ControlFlowPlacementStrategy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FeatureSolutionFactory.eINSTANCE.createControlFlowPlacementStrategy());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ControlFlowPlacementStrategyTest
