/**
 */
package placementDescription.tests;

import junit.textui.TestRunner;

import placementDescription.ExternalCallPlacementStrategy;
import placementDescription.PlacementDescriptionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>External Call Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalCallPlacementStrategyTest extends PlacementStrategyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExternalCallPlacementStrategyTest.class);
	}

	/**
	 * Constructs a new External Call Placement Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCallPlacementStrategyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this External Call Placement Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExternalCallPlacementStrategy getFixture() {
		return (ExternalCallPlacementStrategy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlacementDescriptionFactory.eINSTANCE.createExternalCallPlacementStrategy());
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

} //ExternalCallPlacementStrategyTest
