/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discrete Processing Rate Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiscreteProcessingRateDegreeTest extends DiscreteRangeDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DiscreteProcessingRateDegreeTest.class);
	}

	/**
	 * Constructs a new Discrete Processing Rate Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscreteProcessingRateDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Discrete Processing Rate Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DiscreteProcessingRateDegree getFixture() {
		return (DiscreteProcessingRateDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createDiscreteProcessingRateDegree());
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

} //DiscreteProcessingRateDegreeTest
