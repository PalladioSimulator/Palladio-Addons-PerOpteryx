/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.tests;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dimension Type Scale</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensionTypeScaleTest extends DimensionTypeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DimensionTypeScaleTest.class);
	}

	/**
	 * Constructs a new Dimension Type Scale test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionTypeScaleTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dimension Type Scale test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DimensionTypeScale<?> getFixture() {
		return (DimensionTypeScale<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DimensiontypesFactory.eINSTANCE.createDimensionTypeScale());
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

} //DimensionTypeScaleTest
