package edu.kit.ipd.are.dsexplore.concern.util;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.palladiosimulator.pcm.repository.Repository;

public class ConcernWeaverUtil {
	
	public static String getAbsolutePathOf(Repository repository, Repository referenceRepository) {
		
		String absolutePath = getAbsolutePathOf(referenceRepository);
		return String.format("%1s\\%2s.%3s", new File(absolutePath).getParent(), repository.getEntityName(), FilenameUtils.getExtension(absolutePath));
		
	}
	
	public static String getAbsolutePathOf(EObject object) {
		
		return getAbsolutePathOf(object.eResource());
		
	}
	
	private static String getAbsolutePathOf(Resource resource) {
		
		return new File(resource.getURI().path()).toString();
		
	}
	
	public static String getDefaultInstanceNameWith(String name) {
		
		return String.format("%sInstance", name);
		
	}
	
}
