/**
 */
package ConcernModel.tests;

import ConcernModel.ConcernModelFactory;
import ConcernModel.ConcernStrategy;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Concern Strategy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConcernStrategyTest extends TestCase {

	/**
	 * The fixture for this Concern Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernStrategy fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConcernStrategyTest.class);
	}

	/**
	 * Constructs a new Concern Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcernStrategyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Concern Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConcernStrategy fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Concern Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcernStrategy getFixture() {
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
		setFixture(ConcernModelFactory.eINSTANCE.createConcernStrategy());
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

} //ConcernStrategyTest
