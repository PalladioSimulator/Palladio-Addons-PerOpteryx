/**
 */
package org.palladiosimulator.qualitymodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.qualitymodel.QualityModelFactory;
import org.palladiosimulator.qualitymodel.Reasoning;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReasoningTest extends TestCase {

	/**
	 * The fixture for this Reasoning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reasoning fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReasoningTest.class);
	}

	/**
	 * Constructs a new Reasoning test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reasoning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reasoning fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reasoning test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Reasoning getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(QualityModelFactory.eINSTANCE.createReasoning());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ReasoningTest
