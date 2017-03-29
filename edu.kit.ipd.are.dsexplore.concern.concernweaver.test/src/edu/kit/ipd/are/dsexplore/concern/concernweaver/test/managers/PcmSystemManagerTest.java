package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.managers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.composition.CompositionFactory;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.RepositoryFactory;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.manager.PcmSystemManager;

public class PcmSystemManagerTest extends WeavingTest {

	private PcmSystemManager pcmSystemManager;
	
	@Before
	public void setUp() {

        this.pcmSystemManager = PcmSystemManager.getBy(pcmToAdapt.getSystem());
        
	}
	
	@Test
	public void testExistingConnectorName_PositiveCase() {
		
		List<Connector> existingConnectors = pcmToAdapt.getSystem().getConnectors__ComposedStructure();
		
		existingConnectors.forEach(eachExistingConnector -> assertTrue(this.pcmSystemManager.existConnector(eachExistingConnector)));
		
	}
	
	@Test
	public void testExistingConnectorName_NegativeCase() {

		AssemblyConnector nonExistingConnector = CompositionFactory.eINSTANCE.createAssemblyConnector();
		nonExistingConnector.setProvidedRole_AssemblyConnector(RepositoryFactory.eINSTANCE.createOperationProvidedRole());
		nonExistingConnector.setRequiredRole_AssemblyConnector(RepositoryFactory.eINSTANCE.createOperationRequiredRole());
		
		assertTrue(this.pcmSystemManager.existConnector(nonExistingConnector) == false);
		
	}
	
	@After
	public void tearDown() {
		
		getAddedAssemblyContext().ifPresent(assemblyContext -> pcmToAdapt.getSystem().getAssemblyContexts__ComposedStructure().remove(assemblyContext));
		
	}
	
	private Optional<AssemblyContext> getAddedAssemblyContext() {
		
		return pcmToAdapt.getSystem().getAssemblyContexts__ComposedStructure().stream().filter(each -> each.getEntityName().equals(DUMMY_NAME))
																					   .findFirst();
		
	}

}
