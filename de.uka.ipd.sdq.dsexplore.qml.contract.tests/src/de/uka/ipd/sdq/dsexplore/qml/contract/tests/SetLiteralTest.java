/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractFactory;
import de.uka.ipd.sdq.dsexplore.qml.contract.SetLiteral;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Set Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SetLiteralTest extends ValueLiteralTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SetLiteralTest.class);
	}

	/**
	 * Constructs a new Set Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Set Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SetLiteral getFixture() {
		return (SetLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLContractFactory.eINSTANCE.createSetLiteral());
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

} //SetLiteralTest
