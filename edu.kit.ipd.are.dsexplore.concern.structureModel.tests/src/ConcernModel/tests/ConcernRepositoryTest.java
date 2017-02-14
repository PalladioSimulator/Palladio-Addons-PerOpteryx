/**
 */
package ConcernModel.tests;

import ConcernModel.ConcernModelFactory;
import ConcernModel.ConcernRepository;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concern Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernRepositoryTest extends TestCase {

	/**
	 * The fixture for this Concern Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConcernRepositoryTest.class);
	}

	/**
	 * Constructs a new Concern Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Concern Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConcernRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Concern Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernRepository getFixture() {
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
		setFixture(ConcernModelFactory.eINSTANCE.createConcernRepository());
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

} //ConcernRepositoryTest
