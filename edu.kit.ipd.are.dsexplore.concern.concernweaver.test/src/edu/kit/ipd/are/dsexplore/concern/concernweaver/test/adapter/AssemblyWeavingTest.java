package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import java.util.LinkedHashSet;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.assembly.AssemblyWeaver;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaver;

public class AssemblyWeavingTest extends WeavingTest {

	@Before
	public void setUp() {

		WeavingStep.setGlobalSettings(WeavingTest.pcmToAdapt, this.getPcmConcernRepository());

	}

	@Test
	public void testAssemblyWeaving() {

		try {

			List<WeavingInstruction> weavingInstructions = this.createTestWeavingInstructions();
			LinkedHashSet<WeavingStep> weavingChain = this.getWeavingChainUnderTest();

			for (WeavingInstruction eachWeavingInstruction : weavingInstructions) {

				WeavingStep.setWeavingStrategy(eachWeavingInstruction.getTransformationStrategy());
				for (WeavingStep eachWeavingStep : weavingChain) {

					eachWeavingStep.weave(eachWeavingInstruction);

				}

			}

		} catch (Exception ex) {

			Assert.fail("Error occured during weaving-process: \n" + ex.getMessage());

		}

		Assert.assertTrue(true);

	}

	private LinkedHashSet<WeavingStep> getWeavingChainUnderTest() {

		LinkedHashSet<WeavingStep> weavingChain = new LinkedHashSet<>();
		weavingChain.add(new RepositoryWeaver());
		weavingChain.add(new AssemblyWeaver());

		return weavingChain;

	}

	@After
	public void tearDown() {

		EMFHelper.saveToXMIFile(WeavingTest.pcmToAdapt.getSystem(), ConcernWeavingTestUtil.RELATIVE_ASSEMBLY_PERSISTING_PATH);
		String location = ConcernWeavingTestUtil.getAbsolutePathOf(WeavingStep.getConcernSolution(), WeavingTest.pcmToAdapt.getRepositories().get(0));
		EMFHelper.saveToXMIFile(WeavingStep.getConcernSolution(), location);

	}

}
