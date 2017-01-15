package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.adapter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.LinkedHashSet;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.palladiosimulator.solver.transformations.EMFHelper;

import edu.kit.ipd.are.dsexplore.concern.assembly.AssemblyWeaving;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingStep;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.repository.RepositoryWeaving;
import edu.kit.ipd.are.dsexplore.concern.util.ConcernWeaverUtil;

public class AssemblyWeavingTest extends WeavingTest {
	
	@Before
	public void setUp() {
		
		WeavingStep.setGlobalSettings(pcmToAdapt, getPcmConcernRepository());
		
	}
	
	@Test
	public void testAssemblyWeaving() {
		
		List<WeavingInstruction> weavingInstructions = createTestWeavingInstructions();
		
		try {
			
			LinkedHashSet<WeavingStep> weavignChain = getWeavingChainUnderTest();
			
			weavingInstructions.forEach(weavingInstruction -> {
				
				WeavingStep.setWeavingStrategy(weavingInstruction.getTransformationStrategy());
				weavignChain.forEach(eachWeavingStep -> eachWeavingStep.weave(weavingInstruction));
				
			});
			
		} catch (Exception ex) {
			
			fail("Error occured during weaving-process: \n" + ex.getMessage());
			
		}
		
		assertTrue(true);
		
	}
	
	private LinkedHashSet<WeavingStep> getWeavingChainUnderTest() {
		
		LinkedHashSet<WeavingStep> weavingChain = new LinkedHashSet<WeavingStep>();
		weavingChain.add(new RepositoryWeaving());
		weavingChain.add(new AssemblyWeaving());
		
		return weavingChain;
		
	}
	
	@After
	public void tearDown() {
		
		EMFHelper.saveToXMIFile(pcmToAdapt.getSystem(), ConcernWeavingTestUtil.RELATIVE_ASSEMBLY_PERSISTING_PATH);
		String location = ConcernWeaverUtil.getAbsolutePathOf(WeavingStep.getPCMConcernRepository(), pcmToAdapt.getRepositories().get(0));
		EMFHelper.saveToXMIFile(WeavingStep.getPCMConcernRepository(), location);
		
	}

}
