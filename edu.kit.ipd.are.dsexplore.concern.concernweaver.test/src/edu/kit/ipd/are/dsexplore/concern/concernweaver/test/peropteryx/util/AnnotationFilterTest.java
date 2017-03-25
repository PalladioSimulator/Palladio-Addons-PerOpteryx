package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;

public class AnnotationFilterTest extends WeavingTest {

	private final static int EXPECTED_COUNT = 4;
	
	private AnnotationFilter annotationFilter;
	private int result;


	@Test
	public void testFilterAllAnnotatedComponents() {
		
		givenAnAnnotatedPCMModel();
		whenTargetAnnotationsAreFiltered();
		thenTheCountOfFilteredAnnotationsShouldMatch();
		
	}

	private void givenAnAnnotatedPCMModel() {
		
		this.annotationFilter = new AnnotationFilter(pcmToAdapt.getRepositories());
		
	}
	
	private void whenTargetAnnotationsAreFiltered() {
		
		this.result = annotationFilter.getTargetAnnotatedElements().size();
		
	}
	
	private void thenTheCountOfFilteredAnnotationsShouldMatch() {
		
		assertEquals(EXPECTED_COUNT, this.result);
		
	}

}
