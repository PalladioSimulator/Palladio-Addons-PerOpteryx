/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.NumericLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumericLiteralTest extends ValueLiteralTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumericLiteralTest.class);
	}

	/**
	 * Constructs a new Numeric Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Numeric Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumericLiteral getFixture() {
		return (NumericLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLContractFactory.eINSTANCE.createNumericLiteral());
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

} //NumericLiteralTest
