/**
 */
package featureSolution.tests;

import featureSolution.FeatureSolutionFactory;
import featureSolution.SelectedCV;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selected CV</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectedCVTest extends TestCase {

	/**
	 * The fixture for this Selected CV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedCV fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectedCVTest.class);
	}

	/**
	 * Constructs a new Selected CV test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedCVTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Selected CV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SelectedCV fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Selected CV test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectedCV getFixture() {
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
		setFixture(FeatureSolutionFactory.eINSTANCE.createSelectedCV());
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

} //SelectedCVTest
