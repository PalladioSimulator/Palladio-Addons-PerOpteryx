/**
 */
package org.palladiosimulator.qualitymodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.palladiosimulator.qualitymodel.QualityModelFactory;
import org.palladiosimulator.qualitymodel.TransformationRepository;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transformation Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationRepositoryTest extends TestCase {

	/**
	 * The fixture for this Transformation Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformationRepositoryTest.class);
	}

	/**
	 * Constructs a new Transformation Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transformation Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransformationRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transformation Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TransformationRepository getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	protected void setUp() throws Exception {
		setFixture(QualityModelFactory.eINSTANCE.createTransformationRepository());
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

} //TransformationRepositoryTest
