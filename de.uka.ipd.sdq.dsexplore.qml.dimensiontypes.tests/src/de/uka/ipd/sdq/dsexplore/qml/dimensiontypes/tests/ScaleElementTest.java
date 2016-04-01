/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.tests;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesFactory;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Scale Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScaleElementTest extends ElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScaleElementTest.class);
	}

	/**
	 * Constructs a new Scale Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Scale Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScaleElement<?> getFixture() {
		return (ScaleElement<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DimensiontypesFactory.eINSTANCE.createScaleElement());
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

} //ScaleElementTest
