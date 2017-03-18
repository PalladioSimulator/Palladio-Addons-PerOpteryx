package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.Concern;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstructionGenerator;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;

public class WeavingInstructionGeneratorTest extends WeavingTest {

	private final static int TOTAL_COUNT_WEAVINGINSTRUCTIONS = 2;
	
	private PCMInstance pcmInstance;
	private Concern idsConcern;
	private Repository ossec;
	private List<WeavingInstruction> weavingInstructions;
	
	@Test
	public void testGenerateWeavingInstructions() {
		
		givenAnnotatedPCMModelAndConcern();
		whenGeneratingWeavingInstructions();
		thenWeavingInstructionShouldContaintAllInformations();
		
	}

	private void givenAnnotatedPCMModelAndConcern() {
		
		this.pcmInstance = pcmToAdapt;
		this.idsConcern = concern.getConcerns().get(0);
		this.ossec = concernSolution;
		
	}

	private void whenGeneratingWeavingInstructions() {
		
		try {
			
			this.weavingInstructions = WeavingInstructionGenerator.getInstanceBy(this.pcmInstance, this.idsConcern, this.ossec).getWeavingInstructions();
			
		} catch (ConcernWeavingException ex) {
			
			fail(String.format("Generating weaving instructions failed. The reason was: %s", ex.getMessage()));
			
		}
		
	}

	private void thenWeavingInstructionShouldContaintAllInformations() {
		
		shouldHaveExpectedCount();
		shouldHaveExpectedWeavingLocations();
		shouldHaveExpectedECCs();
		
	}

	private void shouldHaveExpectedCount() {
		
		assertEquals(this.weavingInstructions.size(), TOTAL_COUNT_WEAVINGINSTRUCTIONS);
		
	}
	
	private void shouldHaveExpectedWeavingLocations() {
		
		this.weavingInstructions.forEach(weavingInstruction -> testIfWeavingLocationIsPresent(Optional.of(weavingInstruction.getWeavingLocation())));
		
	}

	private void shouldHaveExpectedECCs() {
		
		this.weavingInstructions.forEach(weavingInstruction -> testIfContainsExpectedECC(weavingInstruction));
		
	}

	private void testIfWeavingLocationIsPresent(Optional<WeavingLocation> weavingLocation) {
		
		assertTrue(weavingLocation.isPresent());
		
	}
	
	private void testIfContainsExpectedECC(WeavingInstruction weavingInstruction) {
		
		String expectedECCName = ConcernWeavingTestUtil.getDetectionECCOf(concern).getName();
		String actualECCName = weavingInstruction.getECCWithConsumedFeatures().getFirst().getName();
		
		assertTrue(expectedECCName.equals(actualECCName));
		
	}
	
}
