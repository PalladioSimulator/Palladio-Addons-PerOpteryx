/**
 */
package placementDescription.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import placementDescription.PlacementDescriptionFactory;
import placementDescription.PointCut;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointCutTest extends TestCase {

	/**
	 * The fixture for this Point Cut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointCut fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PointCutTest.class);
	}

	/**
	 * Constructs a new Point Cut test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointCutTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Point Cut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PointCut fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Point Cut test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointCut getFixture() {
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
		setFixture(PlacementDescriptionFactory.eINSTANCE.createPointCut());
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

} //PointCutTest
