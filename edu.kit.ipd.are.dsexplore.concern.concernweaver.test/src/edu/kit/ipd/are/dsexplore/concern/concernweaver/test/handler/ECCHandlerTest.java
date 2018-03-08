package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.handler;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.junit.Assert;
import org.junit.Test;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

import ConcernModel.ElementaryConcernComponent;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCStructureHandler;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernSolutionManager;

public class ECCHandlerTest extends WeavingTest {

	private final static String OSSEC_DECODER_ID = "_yEx6YK_cEeaFof9L2wGlaQ";

	private ConcernSolutionManager concernRepositoryManager = ConcernSolutionManager.getInstanceBy(WeavingTest.concernSolution);
	private ElementaryConcernComponent ecc;
	private List<RepositoryComponent> result;

	@Test
	public void testGettingStructureOfECC() {

		this.givenDetectionECC();
		this.whenGettingTheComponentStructureOfECC();
		this.thenStructureShouldBeResolvedPoperly();

	}

	@Test
	public void testGettingStructureOfECCAndRequiredECCs() {

		this.givenDetectionECC();
		this.whenGettingTheComponentStructureOfECCAndRequiredECCs();
		this.thenStructureShouldBeResolveAllConcernComponents();

	}

	private void givenDetectionECC() {

		this.ecc = ConcernWeavingTestUtil.getDetectionECCOf(WeavingTest.concern);

	}

	private void whenGettingTheComponentStructureOfECC() {

		this.result = new ECCStructureHandler(this.ecc, this.concernRepositoryManager).getStructureOfECCAccordingTo(this.getIdentityFunction());

	}

	private void whenGettingTheComponentStructureOfECCAndRequiredECCs() {

		this.result = new ECCStructureHandler(this.ecc, this.concernRepositoryManager).getStructureOfECCAndRequiredAccordingTo(this.getIdentityFunction());

	}

	private Function<RepositoryComponent, List<RepositoryComponent>> getIdentityFunction() {

		return component -> Arrays.asList(component);

	}

	private void thenStructureShouldBeResolvedPoperly() {

		Assert.assertTrue(this.result.size() == 1);
		Assert.assertTrue(this.result.get(0).getId().equals(ECCHandlerTest.OSSEC_DECODER_ID));

	}

	private void thenStructureShouldBeResolveAllConcernComponents() {

		WeavingTest.concernSolution.getRepository().getComponents__Repository().forEach(component -> Assert.assertTrue(this.result.contains(component)));

	}

}
