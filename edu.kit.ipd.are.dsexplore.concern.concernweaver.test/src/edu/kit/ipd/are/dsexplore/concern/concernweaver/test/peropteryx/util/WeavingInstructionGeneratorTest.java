package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
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

		this.givenAnnotatedPCMModelAndConcern();
		this.whenGeneratingWeavingInstructions();
		this.thenWeavingInstructionShouldContaintAllInformations();

	}

	private void givenAnnotatedPCMModelAndConcern() {

		this.considerOnlyTwoAnnotatedComponents();
		this.initiliazeTransformationManager();

	}

	private void considerOnlyTwoAnnotatedComponents() {

		List<EObject> annotatedObjects = new AnnotationFilter(WeavingTest.pcmToAdapt.getRepositories()).getTargetAnnotatedElements();
		this.unapplyAllStereotypesAppliedToSignatures(annotatedObjects);

	}

	private void initiliazeTransformationManager() {

		TransformationRepositoryManager.initialize(WeavingTest.transformationRepository);

	}

	private void whenGeneratingWeavingInstructions() {

		try {

			this.weavingInstructions = WeavingInstructionGenerator.getInstanceBy(WeavingTest.pcmToAdapt, WeavingTest.concern.getConcerns().get(0), WeavingTest.concernSolution)
					.getWeavingInstructions(null, null);

		} catch (ConcernWeavingException ex) {

			Assert.fail(String.format("Generating weaving instructions failed. The reason was: %s", ex.getMessage()));

		}

	}

	private void thenWeavingInstructionShouldContaintAllInformations() {

		this.shouldHaveExpectedCount();
		this.shouldHaveExpectedWeavingLocations();
		this.shouldHaveExpectedECCs();

	}

	private void shouldHaveExpectedCount() {

		Assert.assertEquals(this.weavingInstructions.size(), WeavingInstructionGeneratorTest.TOTAL_COUNT_WEAVINGINSTRUCTIONS);

	}

	private void shouldHaveExpectedWeavingLocations() {

		this.weavingInstructions.forEach(weavingInstruction -> Assert.assertTrue(weavingInstruction.getWeavingLocation() != null));

	}

	private void shouldHaveExpectedECCs() {

		this.weavingInstructions.forEach(weavingInstruction -> this.testIfContainsExpectedECC(weavingInstruction));

	}

	private void testIfContainsExpectedECC(WeavingInstruction weavingInstruction) {

		String expectedECCName = ConcernWeavingTestUtil.getDetectionECCOf(WeavingTest.concern).getName();
		String actualECCName = weavingInstruction.getECCWithConsumedFeatures().getFirst().getName();

		Assert.assertTrue(expectedECCName.equals(actualECCName));

	}

	private void unapplyAllStereotypesAppliedToSignatures(List<EObject> annotatedObjects) {

		this.getSignaturesFrom(annotatedObjects).forEach(each -> StereotypeAPI.unapplyStereotype(each, this.getStereotype()));

	}

	private List<EObject> getSignaturesFrom(List<EObject> annotatedObjects) {

		return annotatedObjects.stream().filter(each -> each instanceof Signature).collect(Collectors.toList());

	}

	private Stereotype getStereotype() {

		return ConcernWeavingTestUtil.getProfiles(new ResourceSetImpl()).get(0).getStereotype(WeavingInstructionGeneratorTest.STEREOTYPE_ANNOTATION);

	}

}
