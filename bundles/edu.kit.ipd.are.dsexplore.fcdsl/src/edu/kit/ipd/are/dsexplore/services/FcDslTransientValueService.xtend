package edu.kit.ipd.are.dsexplore.services/**
 * 
 */
 


import org.eclipse.xtext.parsetree.reconstr.impl.DefaultTransientValueService
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EStructuralFeature
import featureSolution.FeatureSolutionPackage

/**
 * @author Maximilian Eckert (maximilian.eckert@student.kit.edu, maxieckert@web.de)
 * 
 *
 */
class FcDslTransientValueService extends DefaultTransientValueService {
	

	override public boolean isTransient(EObject owner, EStructuralFeature feature, int index) {
		System.out.println("------------------ FcDslTransientValueService called ------------------------------")
//		if (feature.name.equals("id")) {
//			return true
//		}
		return super.isTransient(owner, feature, index);
//		return false
	}
}
