package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.List;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.ElementaryConcernComponent;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;

public abstract class ConcernDeploymentConstraint implements IDesignSpaceConstraint {

	protected static ConcernManager concernManager;
	protected static List<Repository> repositories;
	
	protected DesignDecisionGenotype genotype;
	
	public static void setConcernManager(ConcernManager newConcernManager, List<Repository> pcmRepositories) {
		
		concernManager = newConcernManager;
		repositories = pcmRepositories;
		
	}
	
	protected void setDesignDecisionGenotype(DesignDecisionGenotype genotype) {
		
		this.genotype = genotype;
		
	}
	
	protected ElementaryConcernComponent getECCFrom(ClassChoice classChoice) {
		
		return (ElementaryConcernComponent) classChoice.getDegreeOfFreedomInstance().getPrimaryChanged();
		
	}
	
	protected boolean containsECC(ClassChoice classChoice) {
		
		return classChoice.getDegreeOfFreedomInstance().getPrimaryChanged() instanceof ElementaryConcernComponent;
		
	}
	
	protected <T extends ClassDegree> Stream<ClassChoice> getInstancesOfType(Class<T> classToFilter, DesignDecisionGenotype genotype) {
		
		return getInstancesOfType(classToFilter, genotype.stream());
		
	} 
	
	private <T extends ClassDegree> Stream<ClassChoice> getInstancesOfType(Class<T> classToFilter, Stream<Choice> choices) {
		
		return choices.filter(eachChoice -> classToFilter.isInstance(eachChoice.getDegreeOfFreedomInstance()))
					  .map(eachChoice -> (ClassChoice) eachChoice);
		
	}
		
}
