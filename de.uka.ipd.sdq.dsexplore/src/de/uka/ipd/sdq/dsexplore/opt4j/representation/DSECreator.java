package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import java.util.List;

import org.opt4j.core.Phenotype;
import org.opt4j.core.problem.Creator;

import com.google.inject.Inject;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

/**
 * The {@link DSECreator} is responsible for randomly creating genotypes 
 * in the solution space. It can query the {@link DSEProblem} for the 
 * available design space.
 *  
 * @author Ferdinand
 *
 */
public class DSECreator implements Creator<DesignDecisionGenotype> {

	private ADSEProblem<Phenotype> problem;
	
	private int numberOfNotEvaluatedPredefinedOnes;

	@Inject
	public DSECreator(){
		//XXX like this you can only set the problem once. Maybe dont save the reference. 
		this.problem = Opt4JStarter.getProblem();
		this.numberOfNotEvaluatedPredefinedOnes = this.problem.getInitialGenotypeList().size();
	}
	

	@Override
	public DesignDecisionGenotype create() {
		
		if (this.numberOfNotEvaluatedPredefinedOnes > 0){
			DesignDecisionGenotype genome = this.problem.getInitialGenotypeList().get(this.problem.getInitialGenotypeList().size()-this.numberOfNotEvaluatedPredefinedOnes);
			numberOfNotEvaluatedPredefinedOnes --;
			return genome;

		}
		
		DesignDecisionGenotype genotype = new DesignDecisionGenotype();
		
		List<ADegreeOfFreedom> degrees = problem.getDesignDecisions();
		for (ADegreeOfFreedom DegreeOfFreedomInstance : degrees) {
			genotype.add(createRandomChoice(DegreeOfFreedomInstance));
		}
		
		return genotype;
	}

	public Choice createRandomChoice(ADegreeOfFreedom degree) {
		return degree.createRandomChoice();
	}
	
	public void setNumberOfNotEvaluatedPredefinedOnes(
			int numberOfNotEvaluatedPredefinedOnes) {
		this.numberOfNotEvaluatedPredefinedOnes = numberOfNotEvaluatedPredefinedOnes;
	}
	
	public int getNumberOfNotEvaluatedPredefinedOnes(){
		return this.numberOfNotEvaluatedPredefinedOnes;
	}
}
