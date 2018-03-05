package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.List;
import java.util.stream.Stream;

import org.palladiosimulator.pcm.repository.Repository;

import FeatureCompletionModel.CompletionComponent;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.Choice;
import de.uka.ipd.sdq.pcm.designdecision.ClassChoice;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import edu.kit.ipd.are.dsexplore.concern.manager.FeatureCompletionManager;

public abstract class CompletionDeploymentConstraint implements IDesignSpaceConstraint {

	protected static FeatureCompletionManager concernManager;
	protected static List<Repository> repositories;

	protected DesignDecisionGenotype genotype;

	public static void setConcernManager(FeatureCompletionManager newConcernManager, List<Repository> pcmRepositories) {

		CompletionDeploymentConstraint.concernManager = newConcernManager;
		CompletionDeploymentConstraint.repositories = pcmRepositories;

	}

	protected void setDesignDecisionGenotype(DesignDecisionGenotype genotype) {

		this.genotype = genotype;

	}

	protected CompletionComponent getFCCFrom(ClassChoice classChoice) {

		return (CompletionComponent) classChoice.getDegreeOfFreedomInstance().getPrimaryChanged();

	}

	protected boolean containsFCC(ClassChoice classChoice) {

		return classChoice.getDegreeOfFreedomInstance().getPrimaryChanged() instanceof CompletionComponent;

	}

	protected <T extends ClassDegree> Stream<ClassChoice> getInstancesOfType(Class<T> classToFilter, DesignDecisionGenotype genotype) {

		return this.getInstancesOfType(classToFilter, genotype.stream());

	}

	private <T extends ClassDegree> Stream<ClassChoice> getInstancesOfType(Class<T> classToFilter, Stream<Choice> choices) {

		return choices.filter(eachChoice -> classToFilter.isInstance(eachChoice.getDegreeOfFreedomInstance())).map(eachChoice -> (ClassChoice) eachChoice);

	}

}
