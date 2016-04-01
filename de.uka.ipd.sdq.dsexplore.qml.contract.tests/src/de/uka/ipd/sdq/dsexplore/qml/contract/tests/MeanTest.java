/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mean</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeanTest extends PointEstimatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MeanTest.class);
	}

	/**
	 * Constructs a new Mean test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeanTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mean test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mean getFixture() {
		return (Mean)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLContractFactory.eINSTANCE.createMean());
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

} //MeanTest
