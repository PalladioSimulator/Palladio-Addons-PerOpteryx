package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.solver.transformations.EMFHelper;

import SolutionModel.Solution;
import SolutionModel.SolutionModelFactory;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaver;

public class RepositoryWeavingTest extends WeavingTest {

	@Before
	public void setUp() {
		Solution sol = SolutionModelFactory.eINSTANCE.createSolution();
		sol.setRepository(this.getPcmConcernRepository());

		WeavingStep.setGlobalSettings(WeavingTest.pcmToAdapt, sol);

	}

	@Test
	public void testRepositoryWeaving() {

		try {

			List<WeavingInstruction> weavingInstructions = this.createTestWeavingInstructions();
			for (WeavingInstruction eachWeavingInstruction : weavingInstructions) {

				WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
				new RepositoryWeaver().weave(eachWeavingInstruction);

			}

		} catch (Exception ex) {

			Assert.fail("Error occured during weaving-process: \n" + ex.getMessage());

		}

		Assert.assertTrue(true);

	}

	@After
	public void tearDown() {

		EMFHelper.saveToXMIFile(WeavingStep.getConcernSolution(), ConcernWeavingTestUtil.RELATIVE_CONCERN_REPOSITORY_PERSISTING_PATH);

	}

}
