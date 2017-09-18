/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.SolutionIndicator;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solution Indicator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolutionIndicatorTest extends IndicatorDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolutionIndicatorTest.class);
	}

	/**
	 * Constructs a new Solution Indicator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionIndicatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Solution Indicator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SolutionIndicator getFixture() {
		return (SolutionIndicator) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createSolutionIndicator());
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

} //SolutionIndicatorTest
