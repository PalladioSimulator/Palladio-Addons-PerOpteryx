package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

public class EcoreReferenceResolver {

	private final EObject eObject;
	
	public EcoreReferenceResolver(EObject eObject) {
		
		this.eObject = eObject;
		
	}
	
	
	public <T> List<T> getCrossReferencedElementsOfType(Class<T> type) {
		
		return getAllCrossReferences().filter(each -> type.isInstance(each))
									  .map(each -> type.cast(each))
									  .collect(Collectors.toList());
		
	}
	
	private Stream<EObject> getAllCrossReferences() {
		
		return this.eObject.eCrossReferences().stream();
		
	}
	
	public <T> List<T> getAllContainedElementsOfType(Class<T> type) {
		
		List<T> foundReferences = new ArrayList<T>();
		TreeIterator<EObject> iterator = this.eObject.eAllContents();
		while (iterator.hasNext()) {
			
			EObject current = iterator.next();
			if (type.isInstance(current)) {
				
				foundReferences.add(type.cast(current));
				
			}
			
		}
		
		return foundReferences;
		
	}
	
}
