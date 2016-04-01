/**
 */
package de.uka.ipd.sdq.nqr.tests;

import de.uka.ipd.sdq.nqr.Nqr;
import de.uka.ipd.sdq.nqr.NqrFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nqr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NqrTest extends TestCase {

	/**
	 * The fixture for this Nqr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nqr fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NqrTest.class);
	}

	/**
	 * Constructs a new Nqr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NqrTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nqr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Nqr fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nqr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nqr getFixture() {
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
		setFixture(NqrFactory.eINSTANCE.createNqr());
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

} //NqrTest
