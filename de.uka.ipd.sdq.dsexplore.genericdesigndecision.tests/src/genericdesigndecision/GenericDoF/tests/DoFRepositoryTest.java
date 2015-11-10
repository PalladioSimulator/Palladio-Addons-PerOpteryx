/**
 */
package genericdesigndecision.GenericDoF.tests;

import genericdesigndecision.GenericDoF.DoFRepository;
import genericdesigndecision.GenericDoF.GenericDoFFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Do FRepository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DoFRepositoryTest extends TestCase {

	/**
	 * The fixture for this Do FRepository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoFRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DoFRepositoryTest.class);
	}

	/**
	 * Constructs a new Do FRepository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoFRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Do FRepository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DoFRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Do FRepository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoFRepository getFixture() {
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
		setFixture(GenericDoFFactory.eINSTANCE.createDoFRepository());
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

} //DoFRepositoryTest
