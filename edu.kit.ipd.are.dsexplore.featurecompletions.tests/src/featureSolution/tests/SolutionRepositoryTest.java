/**
 */
package featureSolution.tests;

import featureSolution.FeatureSolutionFactory;
import featureSolution.SolutionRepository;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionRepositoryTest extends TestCase {

	/**
	 * The fixture for this Solution Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolutionRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionRepositoryTest.class);
	}

	/**
	 * Constructs a new Solution Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Solution Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SolutionRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Solution Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SolutionRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(FeatureSolutionFactory.eINSTANCE.createSolutionRepository());
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

} //SolutionRepositoryTest
