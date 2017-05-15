package de.uka.ipd.sdq.dsexplore.constraints;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.palladiosimulator.pcm.repository.Repository;

import ConcernModel.Concern;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.pcm.designdecision.specific.ConcernDegree;
import edu.kit.ipd.are.dsexplore.concern.manager.ConcernManager;

public class DesignSpaceConstraintManager {

	private static Set<IDesignSpaceConstraint> constraints = new HashSet<IDesignSpaceConstraint>();
	private static List<Repository> pcmRepositories;
	private static DesignSpaceConstraintManager instance = null;
	
	public static void initialize(List<Repository> pcmRepositories) {
		
		addConstraints();
		setInstance();
		setPcmRepositories(pcmRepositories);
		
	}

	private static void setInstance() {
		
		instance = new DesignSpaceConstraintManager();
		
	}
	
	private static void setPcmRepositories(List<Repository> newPcmRepositories) {
		
		pcmRepositories = newPcmRepositories;
		
	}

	private static void addConstraints() {
		
		constraints.add(new TogetherDeploymentConstraint());
		constraints.add(new SeparatedDeploymentConstraint());
		constraints.add(new IsolatedDeploymentConstraint());
		
	}
	
	public static DesignSpaceConstraintManager getInstanceBy(Concern concern) throws NullPointerException {
		
		checkInitialization();
		
		ConcernDeploymentConstraint.setConcernManager(ConcernManager.getInstanceBy(concern), pcmRepositories);
		
		return instance;
		
	}
	
	public static Optional<DesignSpaceConstraintManager> getInstanceBy(DesignDecisionGenotype genotype) throws NullPointerException {
		
		checkInitialization();
		
		Optional<Concern> concern = getConcernFrom(genotype);
		if (!concern.isPresent()) {
			
			return Optional.empty();
			
		}
		
		ConcernDeploymentConstraint.setConcernManager(ConcernManager.getInstanceBy(concern.get()), pcmRepositories);
		
		return Optional.of(instance);
		
	}

	private static void checkInitialization() throws NullPointerException {
		
		if (instance == null) {
			
			throw new NullPointerException("The DesignSpaceConstraintManager has not been initialized.");
			
		}
		
	}
	
	private static Optional<Concern> getConcernFrom(DesignDecisionGenotype genotype) {
		
		return genotype.stream().filter(eachChoice -> eachChoice.getDegreeOfFreedomInstance() instanceof ConcernDegree)
								.map(choice -> (Concern) (choice.getDegreeOfFreedomInstance().getPrimaryChanged()))
								.findFirst();
		
	}
	
	private DesignSpaceConstraintManager() {
		
	}
	
	public boolean violatesNoConstraint(DesignDecisionGenotype genotype) {
		
		return constraints.stream().allMatch(eachConstraint -> eachConstraint.isValid(genotype));
		
	}
	
	//Maybe later
//	public void validateAndRepairIfPossible(DesignDecisionGenotype genotype) {
//		
//		constraints.forEach(constraint -> {
//			
//			if (!constraint.isValid(genotype)) {
//				
//				if (constraint instanceof IReparationStrategy) {
//					
//					((IReparationStrategy) constraint).repair(genotype);
//					
//				}
//				
//			}
//			
//		});
//		
//	}
	
}
