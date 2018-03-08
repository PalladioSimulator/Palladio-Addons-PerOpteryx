package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.ConcernWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;

public class ServiceEffectSpecificationWeavingTest extends WeavingTest {

	@Test
	public void testRepositoryWeaving() {

		try {

			List<WeavingInstruction> weavingInstructions = this.createTestWeavingInstructions();
			ConcernWeaver.getBy(WeavingTest.pcmToAdapt, WeavingTest.concernSolution).start(weavingInstructions);

		} catch (Exception ex) {

			Assert.fail("Error occured during weaving-process: \n" + ex.getMessage());

		}

		Assert.assertTrue(true);

	}

	@After
	public void tearDown() {

		this.persistPcmConcernRepository();
		this.persistEachRepository();

	}

	private void persistPcmConcernRepository() {

		EMFHelper.saveToXMIFile(WeavingStep.getConcernSolution(), ConcernWeavingTestUtil.getAbsoluteResultFolderPathOf(WeavingStep.getConcernSolution().getRepository()));

	}

	private void persistEachRepository() {

		WeavingTest.pcmToAdapt.getRepositories().forEach(eachRepository -> WeavingTest.pcmToAdapt.saveToXMIFile(eachRepository, this.getPersistingPathOf(eachRepository)));

	}

	private String getPersistingPathOf(Repository repository) {

		return ConcernWeavingTestUtil.RELATIVE_REPOSITORY_PERSISTING_PATH.replace("$", repository.getEntityName());

	}

}
