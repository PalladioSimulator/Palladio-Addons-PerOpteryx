/**
 */
package org.palladiosimulator.qualitymodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.qualitymodel.NqrRepository;
import org.palladiosimulator.qualitymodel.QualityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nqr Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NqrRepositoryTest extends TestCase {

	/**
	 * The fixture for this Nqr Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NqrRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NqrRepositoryTest.class);
	}

	/**
	 * Constructs a new Nqr Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NqrRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Nqr Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NqrRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Nqr Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NqrRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(QualityModelFactory.eINSTANCE.createNqrRepository());
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

} //NqrRepositoryTest
