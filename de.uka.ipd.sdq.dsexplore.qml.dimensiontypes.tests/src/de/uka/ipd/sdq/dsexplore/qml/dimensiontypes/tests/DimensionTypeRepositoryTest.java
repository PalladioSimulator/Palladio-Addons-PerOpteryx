/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.tests;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dimension Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionTypeRepositoryTest extends TestCase {

	/**
	 * The fixture for this Dimension Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DimensionTypeRepositoryTest.class);
	}

	/**
	 * Constructs a new Dimension Type Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dimension Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DimensionTypeRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dimension Type Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeRepository getFixture() {
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
		setFixture(DimensiontypesFactory.eINSTANCE.createDimensionTypeRepository());
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

} //DimensionTypeRepositoryTest
