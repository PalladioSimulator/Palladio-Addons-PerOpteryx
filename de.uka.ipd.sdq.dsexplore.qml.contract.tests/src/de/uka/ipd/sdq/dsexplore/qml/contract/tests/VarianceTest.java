/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractFactory;
import de.uka.ipd.sdq.dsexplore.qml.contract.Variance;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VarianceTest extends PointEstimatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VarianceTest.class);
	}

	/**
	 * Constructs a new Variance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarianceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Variance getFixture() {
		return (Variance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLContractFactory.eINSTANCE.createVariance());
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

} //VarianceTest
