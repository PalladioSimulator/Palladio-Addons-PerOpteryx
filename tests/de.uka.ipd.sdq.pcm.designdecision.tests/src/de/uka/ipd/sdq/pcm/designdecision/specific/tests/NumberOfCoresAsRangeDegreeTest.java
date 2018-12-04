/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Of Cores As Range Degree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberOfCoresAsRangeDegreeTest extends DiscreteRangeDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberOfCoresAsRangeDegreeTest.class);
	}

	/**
	 * Constructs a new Number Of Cores As Range Degree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberOfCoresAsRangeDegreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Of Cores As Range Degree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberOfCoresAsRangeDegree getFixture() {
		return (NumberOfCoresAsRangeDegree) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createNumberOfCoresAsRangeDegree());
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

} //NumberOfCoresAsRangeDegreeTest
