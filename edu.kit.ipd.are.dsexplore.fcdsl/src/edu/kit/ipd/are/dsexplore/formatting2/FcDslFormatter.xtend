/*
 * generated by Xtext 2.13.0
 */
package edu.kit.ipd.are.dsexplore.formatting2

import com.google.inject.Inject
import edu.kit.ipd.are.dsexplore.services.FcDslGrammarAccess
import featureSolution.Advice
import featureSolution.BehaviourInclusion
import featureSolution.Import
import featureSolution.PointCut
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class FcDslFormatter extends AbstractFormatter2 {
	
	@Inject extension FcDslGrammarAccess

	def dispatch void format(BehaviourInclusion behaviourInclusion, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Import _import : behaviourInclusion.getImports()) {
			_import.format;
		}
		for (PointCut pointCut : behaviourInclusion.getPointCut()) {
			pointCut.format;
		}
		for (Advice advice : behaviourInclusion.getAdvice()) {
			advice.format;
		}
	}

	def dispatch void format(PointCut pointCut, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		pointCut.getPlacementStrategy.format;
	}
	
	// TODO: implement for 
}
