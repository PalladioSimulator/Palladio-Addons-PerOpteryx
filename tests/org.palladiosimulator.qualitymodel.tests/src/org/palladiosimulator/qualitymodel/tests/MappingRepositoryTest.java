/**
 */
package org.palladiosimulator.qualitymodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.qualitymodel.MappingRepository;
import org.palladiosimulator.qualitymodel.QualityModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mapping Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MappingRepositoryTest extends TestCase {

	/**
	 * The fixture for this Mapping Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MappingRepositoryTest.class);
	}

	/**
	 * Constructs a new Mapping Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mapping Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MappingRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mapping Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MappingRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(QualityModelFactory.eINSTANCE.createMappingRepository());
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

} //MappingRepositoryTest
