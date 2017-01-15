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
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernRepositoryManager;

public class ECCHandlerTest extends WeavingTest {
	
	private final static String OSSEC_DECODER_ID = "_lDUZwFWIEea0XO9AU2xvGg";
	
	private ConcernRepositoryManager concernRepositoryManager = ConcernRepositoryManager.getBy(concernRepository);
	private ElementaryConcernComponent ecc;
	private List<RepositoryComponent> result;

	@Test
	public void testGettingStructureOfECC() {
				
		givenECC();
		whenGettingTheComponentStructureOfECC();
		thenStructureShouldBeResolvedPoperly();
		
	}
	
	@Test
	public void testGettingStructureOfECCAndRequiredECCs() {
				
		givenECCWithRequiredECCs();
		whenGettingTheComponentStructureOfECCAndRequiredECCs();
		thenStructureShouldBeResolveAllConcernComponents();
		
	}

	private void givenECC() {
		
		this.ecc = ConcernWeavingTestUtil.getDetectionECCOf(concern);
		
	}
	
	private void givenECCWithRequiredECCs() {
		
		this.ecc = ConcernWeavingTestUtil.getResponseECCOf(concern);
		
	}

	private void whenGettingTheComponentStructureOfECC() {
		
		this.result = new ECCStructureHandler(this.ecc, this.concernRepositoryManager).getStructureWithInECCAccordingTo(getIdentityFunction());
		
	}
	
	private void whenGettingTheComponentStructureOfECCAndRequiredECCs() {
		
		this.result = new ECCStructureHandler(this.ecc, this.concernRepositoryManager).getStructureWithInECCAndRequiredAccordingTo(getIdentityFunction());
		
	}
	
	private Function<RepositoryComponent, List<RepositoryComponent>> getIdentityFunction() {
		
		return component -> Arrays.asList(component);
		
	}

	private void thenStructureShouldBeResolvedPoperly() {
		
		assertTrue(this.result.size() == 1);
		assertTrue(this.result.get(0).getId().equals(OSSEC_DECODER_ID));
		
	}
	
	private void thenStructureShouldBeResolveAllConcernComponents() {
		
		concernRepository.getComponents__Repository().forEach(component -> assertTrue(this.result.contains(component)));
		
	}
	
}
