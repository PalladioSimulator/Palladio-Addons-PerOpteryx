/**
 */
package de.uka.ipd.sdq.dsexplore.qml.units.tests;

import de.uka.ipd.sdq.dsexplore.qml.units.Unit;
import de.uka.ipd.sdq.dsexplore.qml.units.UnitsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnitTest extends TestCase {

	/**
	 * The fixture for this Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unit fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnitTest.class);
	}

	/**
	 * Constructs a new Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Unit fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Unit getFixture() {
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
		setFixture(UnitsFactory.eINSTANCE.createUnit());
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

} //UnitTest
