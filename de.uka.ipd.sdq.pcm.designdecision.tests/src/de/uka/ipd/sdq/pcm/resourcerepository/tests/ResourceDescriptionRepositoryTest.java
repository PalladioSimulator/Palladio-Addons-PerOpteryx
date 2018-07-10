/**
 */
package de.uka.ipd.sdq.pcm.resourcerepository.tests;

import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescriptionRepository;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Description Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceDescriptionRepositoryTest extends TestCase {

	/**
	 * The fixture for this Resource Description Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptionRepository fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceDescriptionRepositoryTest.class);
	}

	/**
	 * Constructs a new Resource Description Repository test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDescriptionRepositoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resource Description Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ResourceDescriptionRepository fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resource Description Repository test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptionRepository getFixture() {
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
		setFixture(resourcerepositoryFactory.eINSTANCE.createResourceDescriptionRepository());
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

} //ResourceDescriptionRepositoryTest
