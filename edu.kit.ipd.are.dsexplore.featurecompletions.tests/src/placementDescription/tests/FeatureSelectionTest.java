/**
 */
package placementDescription.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import placementDescription.FeatureSelection;
import placementDescription.PlacementDescriptionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feature Selection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureSelectionTest extends TestCase {

	/**
	 * The fixture for this Feature Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSelection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeatureSelectionTest.class);
	}

	/**
	 * Constructs a new Feature Selection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureSelectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Feature Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FeatureSelection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Feature Selection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureSelection getFixture() {
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
		setFixture(PlacementDescriptionFactory.eINSTANCE.createFeatureSelection());
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

} //FeatureSelectionTest
