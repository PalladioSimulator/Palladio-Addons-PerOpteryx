package edu.kit.ipd.are.dsexplore.concern.concernweaver.test.peropteryx.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.WeavingTest;
import edu.kit.ipd.are.dsexplore.concern.emfprofilefilter.AnnotationFilter;

public class AnnotationFilterTest extends WeavingTest {

	private final static String TARGET_ANNOTATION_NAME = "Observee";
	private final static int EXPECTED_COUNT = 2;
	
	private AnnotationFilter annotationFilter;
	private int countOfFilteredTargetAnnotations;


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
		
		this.countOfFilteredTargetAnnotations = annotationFilter.getTargetAnnotatedComponentsWith(TARGET_ANNOTATION_NAME).size();
		
	}
	
	private void thenTheCountOfFilteredAnnotationsShouldMatch() {
		
		assertEquals(EXPECTED_COUNT, this.countOfFilteredTargetAnnotations);
		
	}

}
