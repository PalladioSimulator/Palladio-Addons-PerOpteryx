/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.tests;

import de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resource Container Replication Degree With Component Change</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceContainerReplicationDegreeWithComponentChangeTest extends ResourceContainerReplicationDegreeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResourceContainerReplicationDegreeWithComponentChangeTest.class);
	}

	/**
	 * Constructs a new Resource Container Replication Degree With Component Change test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceContainerReplicationDegreeWithComponentChangeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Resource Container Replication Degree With Component Change test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ResourceContainerReplicationDegreeWithComponentChange getFixture() {
		return (ResourceContainerReplicationDegreeWithComponentChange) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(specificFactory.eINSTANCE.createResourceContainerReplicationDegreeWithComponentChange());
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

} //ResourceContainerReplicationDegreeWithComponentChangeTest
