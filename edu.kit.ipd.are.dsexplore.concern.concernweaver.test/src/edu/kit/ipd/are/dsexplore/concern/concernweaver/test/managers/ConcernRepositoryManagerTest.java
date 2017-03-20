package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.managers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.repository.RepositoryFactory;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;

public class ConcernRepositoryManagerTest extends WeavingTest {

	private final static String ECC_DECODER_NAME = "OSSECDecoder";
	
	private ConcernRepositoryManager concernRepositoryManager;
	
	@Before
	public void setUp() {

        this.concernRepositoryManager = ConcernRepositoryManager.getBy(concernSolution);
        
	}
	
	@Test
	public void testGetExistingAdapterComponent_PositiveCase() {
		
		this.concernRepositoryManager.createAndAddAdapter("Adapter");
		
		Optional<RepositoryComponent> result = concernRepositoryManager.getComponentByUnique("Adapter");
		
		assertTrue(result.isPresent());
		assertTrue(result.get().getEntityName().equals("Adapter"));
		
	}
	
	@Test
	public void testGetExistingAdapterComponent_NegativeCase() {
		
		Optional<RepositoryComponent> result = this.concernRepositoryManager.getComponentByUnique(DUMMY_NAME);
		
		assertTrue(result.isPresent() == false);
		
	}
	
	@Test
	public void testGetEquivalentConsumedFeatures() {
		
		RepositoryComponent ecc = null;
		try {
			
			ecc = ConcernRepositoryManager.getBy(getPcmConcernRepository()).getComponentByUnique(ECC_DECODER_NAME).orElseThrow(() -> new Exception());
			
		} catch (Exception e) {
			
			fail("Elementary Concern Component does not exist.");
			
		}
		
		List<ProvidedRole> expectedConsumedFeatures = ecc.getProvidedRoles_InterfaceProvidingEntity();//.stream().map(each -> (OperationProvidedRole) each).collect(Collectors.toList());
		List<ProvidedRole> actualConsumedFeatures = this.concernRepositoryManager.getEquivalentConsumedFeaturesFromRepository(expectedConsumedFeatures);
		
		assertEquals(expectedConsumedFeatures, actualConsumedFeatures);
		
	}
	
	@Test
	public void testGetElementaryConcernComponent_PositiveCase() {
		
		String expectedName = "";
		String actualName = "";
		try {
			
			RepositoryComponent ecc = this.concernRepositoryManager.getComponentByUnique(ECC_DECODER_NAME).get();
			expectedName = ecc.getEntityName();
			List<ProvidedRole> consumedFeatures = ecc.getProvidedRoles_InterfaceProvidingEntity();
			actualName = this.concernRepositoryManager.getElementaryConcernComponentOf(consumedFeatures).get().getEntityName();
			
		} catch (NoSuchElementException e) {
			
			fail("Elementary Concern Component does not exist.");
			
		}
		
		assertEquals(expectedName, actualName);
		
	}
	
	@Test
	public void testGetElementaryConcernComponent_NegativeCase() {
		
		OperationProvidedRole providedRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		providedRole.setProvidedInterface__OperationProvidedRole(RepositoryFactory.eINSTANCE.createOperationInterface());
		
		Optional<RepositoryComponent> ecc = this.concernRepositoryManager.getElementaryConcernComponentOf(Arrays.asList(providedRole));
		
		assertTrue(ecc.isPresent() == false);
		
	}
	
	@Test
	public void testGetConnectedRoles_PositiveCase() {
		
		AssemblyConnector assemblyConnector = getAssemblyConnectorUnderTest();
		
		OperationProvidedRole expectedProvidedRole = assemblyConnector.getProvidedRole_AssemblyConnector();
		OperationRequiredRole expectedRequiredRole = assemblyConnector.getRequiredRole_AssemblyConnector();
		RepositoryComponent providedComponent = assemblyConnector.getProvidingAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		RepositoryComponent requiredComponent = assemblyConnector.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext();
		
		Optional<Pair<OperationProvidedRole, OperationRequiredRole>> result = this.concernRepositoryManager.getConnectedRolesOf(providedComponent, requiredComponent);		
		
		assertTrue(result.isPresent());
		
		OperationProvidedRole actualProvidedRole = result.get().getFirst();
		OperationRequiredRole actualRequiredRole = result.get().getSecond();
		
		assertEquals(expectedProvidedRole, actualProvidedRole);
		assertEquals(expectedRequiredRole, actualRequiredRole);
		
	}
	
	@Test
	public void testGetConnectedRoles_NegativeCase() {

		RepositoryComponent providedComponent = createTestProvidedComponent();
		RepositoryComponent requiredComponent = createTestRequiredComponent();
	
		Optional<Pair<OperationProvidedRole, OperationRequiredRole>> result = this.concernRepositoryManager.getConnectedRolesOf(providedComponent, requiredComponent);		
		
		assertTrue(result.isPresent() == false);
		
	}

	private RepositoryComponent createTestProvidedComponent() {
		
		OperationInterface testInterface = RepositoryFactory.eINSTANCE.createOperationInterface();
		OperationProvidedRole testRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		testRole.setProvidedInterface__OperationProvidedRole(testInterface);
		
		RepositoryComponent testComponent = RepositoryFactory.eINSTANCE.createBasicComponent();
		testComponent.getProvidedRoles_InterfaceProvidingEntity().add(testRole);

		return testComponent;
		
	}
	
	private RepositoryComponent createTestRequiredComponent() {
		
		OperationInterface testInterface = RepositoryFactory.eINSTANCE.createOperationInterface();
		OperationRequiredRole testRole = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		testRole.setRequiredInterface__OperationRequiredRole(testInterface);
		
		RepositoryComponent testComponent = RepositoryFactory.eINSTANCE.createBasicComponent();
		testComponent.getRequiredRoles_InterfaceRequiringEntity().add(testRole);

		return testComponent;
		
	}

	private AssemblyConnector getAssemblyConnectorUnderTest() {
		
		return (AssemblyConnector) pcmToAdapt.getSystem().getConnectors__ComposedStructure().stream().filter(each -> each instanceof AssemblyConnector)
																				 					 .findFirst().get();
		
	}

}
