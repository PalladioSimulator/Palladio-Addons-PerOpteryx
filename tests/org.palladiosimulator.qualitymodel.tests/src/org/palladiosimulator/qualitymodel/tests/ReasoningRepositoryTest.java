/**
 */
package org.palladiosimulator.qualitymodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.qualitymodel.QualityModelFactory;
import org.palladiosimulator.qualitymodel.ReasoningRepository;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reasoning Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReasoningRepositoryTest extends TestCase {

	/**
	 * The fixture for this Reasoning Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReasoningRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReasoningRepositoryTest.class);
	}

	/**
	 * Constructs a new Reasoning Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasoningRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reasoning Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ReasoningRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reasoning Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReasoningRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(QualityModelFactory.eINSTANCE.createReasoningRepository());
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

} //ReasoningRepositoryTest
