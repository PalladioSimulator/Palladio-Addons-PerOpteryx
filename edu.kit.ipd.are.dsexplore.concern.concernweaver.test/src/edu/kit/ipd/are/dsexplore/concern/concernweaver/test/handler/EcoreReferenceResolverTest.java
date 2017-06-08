package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.handler;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;
import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.impl.OperationProvidedRoleImpl;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.util.EcoreReferenceResolver;

public class EcoreReferenceResolverTest extends WeavingTest {

	private Connector connector;
	private List<ProvidedRole> result;
	
	@Test
	public void test() {
		
		givenAnArbitraryAssemblyConnector();
		whenResolvingAllCrossReferencedElementsOfType(ProvidedRole.class);
		thenTheProperElementsShouldBeResolved();
		
	}

	private void givenAnArbitraryAssemblyConnector() {
		
		this.connector = getAnArbitraryAssemblyConnector();
		
	}

	private void whenResolvingAllCrossReferencedElementsOfType(Class<ProvidedRole> type) {
		
		this.result = new EcoreReferenceResolver(this.connector).getCrossReferencedElementsOfType(type);
		
	}

	private void thenTheProperElementsShouldBeResolved() {
		
		assertTrue(this.result.size() == 1);
		assertTrue(this.result.get(0).getClass().equals(OperationProvidedRoleImpl.class));
		
	}
	
	private Connector getAnArbitraryAssemblyConnector() {
		
		return getAllConnectors().filter(each -> each instanceof AssemblyConnector)
								 .findFirst().get();
		
	}

	private Stream<Connector> getAllConnectors() {
		
		return pcmToAdapt.getSystem().getConnectors__ComposedStructure().stream();
		
	}

}
