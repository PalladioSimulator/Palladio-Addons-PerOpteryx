/**
 */
package de.uka.ipd.sdq.pcm.designdecision.tests;

import de.uka.ipd.sdq.pcm.designdecision.Candidate;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Candidate</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CandidateTest extends TestCase {

	/**
	 * The fixture for this Candidate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Candidate fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CandidateTest.class);
	}

	/**
	 * Constructs a new Candidate test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CandidateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Candidate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Candidate fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Candidate test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Candidate getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(designdecisionFactory.eINSTANCE.createCandidate());
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

} //CandidateTest
