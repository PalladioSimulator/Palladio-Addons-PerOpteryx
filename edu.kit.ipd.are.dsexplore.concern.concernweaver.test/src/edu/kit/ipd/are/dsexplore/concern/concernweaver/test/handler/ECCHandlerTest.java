package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.handler;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.junit.Test;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public class ECCHandlerTest extends WeavingTest {
	
	private final static String OSSEC_DECODER_ID = "_yEx6YK_cEeaFof9L2wGlaQ";
	
	private ConcernSolutionManager concernRepositoryManager = ConcernSolutionManager.getInstanceBy(concernSolution);
	private ElementaryConcernComponent ecc;
	private List<RepositoryComponent> result;

	@Test
	public void testGettingStructureOfECC() {
				
		givenDetectionECC();
		whenGettingTheComponentStructureOfECC();
		thenStructureShouldBeResolvedPoperly();
		
	}
	
	@Test
	public void testGettingStructureOfECCAndRequiredECCs() {
				
		givenDetectionECC();
		whenGettingTheComponentStructureOfECCAndRequiredECCs();
		thenStructureShouldBeResolveAllConcernComponents();
		
	}

	private void givenDetectionECC() {
		
		this.ecc = ConcernWeavingTestUtil.getDetectionECCOf(concern);
		
	}

	private void whenGettingTheComponentStructureOfECC() {
		
		this.result = new ECCStructureHandler(this.ecc, this.concernRepositoryManager).getStructureOfECCAccordingTo(getIdentityFunction());
		
	}
	
	private void whenGettingTheComponentStructureOfECCAndRequiredECCs() {
		
		this.result = new ECCStructureHandler(this.ecc, this.concernRepositoryManager).getStructureOfECCAndRequiredAccordingTo(getIdentityFunction());
		
	}
	
	private Function<RepositoryComponent, List<RepositoryComponent>> getIdentityFunction() {
		
		return component -> Arrays.asList(component);
		
	}

	private void thenStructureShouldBeResolvedPoperly() {
		
		assertTrue(this.result.size() == 1);
		assertTrue(this.result.get(0).getId().equals(OSSEC_DECODER_ID));
		
	}
	
	private void thenStructureShouldBeResolveAllConcernComponents() {
		
		concernSolution.getComponents__Repository().forEach(component -> assertTrue(this.result.contains(component)));
		
	}
	
}
