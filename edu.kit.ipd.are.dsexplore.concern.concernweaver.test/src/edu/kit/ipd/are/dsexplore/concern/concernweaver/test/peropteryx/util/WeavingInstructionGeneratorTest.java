package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;
import org.modelversioning.emfprofile.Stereotype;
import org.palladiosimulator.mdsdprofiles.api.StereotypeAPI;
import org.palladiosimulator.pcm.repository.Signature;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstructionGenerator;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.manager.TransformationRepositoryManager;

public class WeavingInstructionGeneratorTest extends WeavingTest {

	private final static String STEREOTYPE_ANNOTATION = "Annotation";
	private final static int TOTAL_COUNT_WEAVINGINSTRUCTIONS = 3;
	
	private List<WeavingInstruction> weavingInstructions;
	
	@Test
	public void testGenerateWeavingInstructions() {
		
		givenAnnotatedPCMModelAndConcern();
		whenGeneratingWeavingInstructions();
		thenWeavingInstructionShouldContaintAllInformations();
		
	}

	private void givenAnnotatedPCMModelAndConcern() {
		
		considerOnlyTwoAnnotatedComponents();
		initiliazeTransformationManager();
		
	}

	private void considerOnlyTwoAnnotatedComponents() {
		
		List<EObject> annotatedObjects = new AnnotationFilter(pcmToAdapt.getRepositories()).getTargetAnnotatedElements();
		unapplyAllStereotypesAppliedToSignatures(annotatedObjects);
		
	}
	
	private void initiliazeTransformationManager() {
		
		TransformationRepositoryManager.initialize(transformationRepository);
		
	}

	private void whenGeneratingWeavingInstructions() {
		
		try {
			
			this.weavingInstructions = WeavingInstructionGenerator.getInstanceBy(pcmToAdapt, concern.getConcerns().get(0), concernSolution).getWeavingInstructions();
			
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
		
		this.weavingInstructions.forEach(weavingInstruction -> assertTrue(weavingInstruction.getWeavingLocation() != null));
		
	}

	private void shouldHaveExpectedECCs() {
		
		this.weavingInstructions.forEach(weavingInstruction -> testIfContainsExpectedECC(weavingInstruction));
		
	}
	
	private void testIfContainsExpectedECC(WeavingInstruction weavingInstruction) {
		
		String expectedECCName = ConcernWeavingTestUtil.getDetectionECCOf(concern).getName();
		String actualECCName = weavingInstruction.getECCWithConsumedFeatures().getFirst().getName();
		
		assertTrue(expectedECCName.equals(actualECCName));
		
	}
	
	private void unapplyAllStereotypesAppliedToSignatures(List<EObject> annotatedObjects) {
		
		getSignaturesFrom(annotatedObjects).forEach(each -> StereotypeAPI.unapplyStereotype(each, getStereotype()));
		
	}

	private List<EObject> getSignaturesFrom(List<EObject> annotatedObjects) {
		
		return annotatedObjects.stream().filter(each -> each instanceof Signature).collect(Collectors.toList());
		
	}
	
	private Stereotype getStereotype() {
		
		return ConcernWeavingTestUtil.getProfiles(new ResourceSetImpl()).get(0).getStereotype(STEREOTYPE_ANNOTATION);
		
	}
	
}
