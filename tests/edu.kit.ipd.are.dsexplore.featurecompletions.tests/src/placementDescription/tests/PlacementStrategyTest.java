/**
 */
package placementDescription.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import placementDescription.PlacementDescriptionFactory;
import placementDescription.PlacementStrategy;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Placement Strategy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlacementStrategyTest extends TestCase {

	/**
	 * The fixture for this Placement Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementStrategy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlacementStrategyTest.class);
	}

	/**
	 * Constructs a new Placement Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlacementStrategyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Placement Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PlacementStrategy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Placement Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlacementStrategy getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PlacementDescriptionFactory.eINSTANCE.createPlacementStrategy());
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

} //PlacementStrategyTest
