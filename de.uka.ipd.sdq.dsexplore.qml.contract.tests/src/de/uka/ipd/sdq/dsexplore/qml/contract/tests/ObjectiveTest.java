/**
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.tests;

import de.uka.ipd.sdq.dsexplore.qml.contract.Objective;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContractFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Objective</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectiveTest extends CriterionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectiveTest.class);
	}

	/**
	 * Constructs a new Objective test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Objective test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Objective getFixture() {
		return (Objective)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QMLContractFactory.eINSTANCE.createObjective());
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

} //ObjectiveTest
