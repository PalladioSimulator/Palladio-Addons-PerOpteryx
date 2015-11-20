/**
 */
package genericdesigndecision.genericDoF.tests;

import genericdesigndecision.genericDoF.DegreeOfFreedom;
import genericdesigndecision.genericDoF.GenericDoFFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Degree Of Freedom</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DegreeOfFreedomTest extends TestCase {

	/**
	 * The fixture for this Degree Of Freedom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeOfFreedom fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DegreeOfFreedomTest.class);
	}

	/**
	 * Constructs a new Degree Of Freedom test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedomTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Degree Of Freedom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DegreeOfFreedom fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Degree Of Freedom test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeOfFreedom getFixture() {
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
		setFixture(GenericDoFFactory.eINSTANCE.createDegreeOfFreedom());
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

} //DegreeOfFreedomTest
