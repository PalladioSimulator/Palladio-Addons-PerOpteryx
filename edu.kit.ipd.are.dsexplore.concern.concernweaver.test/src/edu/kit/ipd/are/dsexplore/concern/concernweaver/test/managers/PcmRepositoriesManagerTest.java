package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.managers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.pcm.repository.BasicComponent;
import org.palladiosimulator.pcm.repository.OperationProvidedRole;
import org.palladiosimulator.pcm.repository.OperationRequiredRole;
import org.palladiosimulator.pcm.repository.RepositoryFactory;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmRepositoriesManager;

public class PcmRepositoriesManagerTest extends WeavingTest {

	private final static String BASICOMPONENT_MEDIA_ACCESS_ID = "_9eK7YHDrEeSqnN80MQ2uGw";
	
	private PcmRepositoriesManager pcmRepositoriesManager;
	
	@Before
	public void setUp() {

        this.pcmRepositoriesManager = PcmRepositoriesManager.getBy(pcmToAdapt.getRepositories());
        
	}
	
	@Test
	public void testPcmRepositoriesManager_ResolveComponentByRequiredRole_PositiveCase() {
		
		BasicComponent expectedComponent = getTestComponent();
		OperationRequiredRole requiredRole = (OperationRequiredRole) expectedComponent.getRequiredRoles_InterfaceRequiringEntity().get(0);
		
		Optional<BasicComponent> actualComponent = this.pcmRepositoriesManager.getComponentWith(requiredRole);
		if(!actualComponent.isPresent()) {
			
			fail("Didn't find the correct BasicComponent.");
			
		}
		
		assertEquals(expectedComponent, actualComponent.get());
		
	}
	
	@Test
	public void testPcmRepositoriesManager_ResolveComponentByRequiredRole_NegativeCase() {
		
		OperationRequiredRole requiredRole = RepositoryFactory.eINSTANCE.createOperationRequiredRole();
		
		Optional<BasicComponent> result = this.pcmRepositoriesManager.getComponentWith(requiredRole);
		
		assertTrue(result.isPresent() == false);
		
	}
	
	@Test
	public void testPcmRepositoriesManager_ResolveComponentByProvidedRole_PositiveCase() {
		
		BasicComponent expectedComponent = getTestComponent();
		OperationProvidedRole providedRole = (OperationProvidedRole) expectedComponent.getProvidedRoles_InterfaceProvidingEntity().get(0);
		
		Optional<BasicComponent> actualComponent = this.pcmRepositoriesManager.getComponentWith(providedRole);
		if(!actualComponent.isPresent()) {
			
			fail("Didn't find the correct BasicComponent.");
			
		}
		
		assertEquals(expectedComponent, actualComponent.get());
		
	}
	
	@Test
	public void testPcmRepositoriesManager_ResolveComponentByProvidedRole_NegativeCase() {
		
		OperationProvidedRole providedRole = RepositoryFactory.eINSTANCE.createOperationProvidedRole();
		
		Optional<BasicComponent> result = this.pcmRepositoriesManager.getComponentWith(providedRole);
		
		assertTrue(result.isPresent() == false);
		
	}
	
	private BasicComponent getTestComponent() {
		
		return (BasicComponent) pcmToAdapt.getRepositories().get(0).getComponents__Repository().stream().filter(eachComponent -> eachComponent.getId().equals(BASICOMPONENT_MEDIA_ACCESS_ID))
																					   					.findFirst().get();
		
	}

}
