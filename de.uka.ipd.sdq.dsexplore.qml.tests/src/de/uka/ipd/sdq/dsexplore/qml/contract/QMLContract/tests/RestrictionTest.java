/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractFactory;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Restriction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestrictionTest extends AspectRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestrictionTest.class);
	}

	/**
	 * Constructs a new Restriction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestrictionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Restriction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Restriction getFixture() {
		return (Restriction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLContractFactory.eINSTANCE.createRestriction());
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

} //RestrictionTest
