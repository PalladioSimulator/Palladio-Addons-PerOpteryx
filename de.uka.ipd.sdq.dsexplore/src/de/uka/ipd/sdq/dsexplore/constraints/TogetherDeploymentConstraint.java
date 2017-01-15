package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.List;

import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import ConcernModel.Association;
import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;

public class TogetherDeploymentConstraint extends TargetEnrichAnnotationConstraint {

	@Override
	public void setAssociation() {
		
		this.association = Association.TOGETHER;
		
	}

	@Override
	protected boolean areCorrectlyAllocated(List<RepositoryComponent> targetAnnotatedComponents, ResourceContainer eccResourceContainer) {
		
		return areAllocatedOnTheSameResourceContainer(targetAnnotatedComponents, eccResourceContainer);
		
	}

	private boolean areAllocatedOnTheSameResourceContainer(List<RepositoryComponent> targetAnnotatedComponents, ResourceContainer eccResourceContainer) {

		return targetAnnotatedComponents.stream().allMatch(eachAnnotatedComponent -> EMFHelper.checkIdentity(getResourceContainerOf(eachAnnotatedComponent), eccResourceContainer));
		
	}
	
}
