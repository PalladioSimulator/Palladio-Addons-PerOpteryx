/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions.tests;

import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionRepository;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.DimensionsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dimension Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionRepositoryTest extends TestCase {

	/**
	 * The fixture for this Dimension Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DimensionRepositoryTest.class);
	}

	/**
	 * Constructs a new Dimension Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dimension Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DimensionRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dimension Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionRepository getFixture() {
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
		setFixture(DimensionsFactory.eINSTANCE.createDimensionRepository());
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

} //DimensionRepositoryTest
