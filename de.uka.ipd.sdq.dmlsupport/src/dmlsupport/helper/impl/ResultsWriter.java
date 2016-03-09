package dmlsupport.helper.impl;

import java.util.Collection;
import java.util.List;

import org.opt4j.core.Criterion;

import de.uka.ipd.sdq.dsexplore.helper.AResultsWriter;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.ITactic;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.TacticsResultCandidate;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import dmlsupport.helper.DMLPhenotype;

public class ResultsWriter extends AResultsWriter {

	public ResultsWriter(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeTacticManagerChoice(TacticsResultCandidate c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void writeTacticCandidateInfo(ITactic heuristic,
			Collection<TacticsResultCandidate> candidatesFromCurrentHeuristic) {
		throw new UnsupportedOperationException();

	}

	@Override
	protected String getDimensionName(Criterion criterion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected StringBuilder prettyPrintHeadlineCSV(Collection<DSEIndividual> individuals, StringBuilder output,
			List<Criterion> criterionsToSave) {
		if (individuals.size() > 0){
			DSEIndividual i = individuals.iterator().next();
			
			output = printObjectives(criterionsToSave, output);
		
			output = determineAndPrintConfidenceIntervalHeadline(output, i.getObjectives(), criterionsToSave);
		
			output.append(Opt4JStarter.getProblem().toString());
			
			output.append("Candidate ID;");
		
			output.append("\n");
		}
		return output; 
	}
	
	private StringBuilder determineAndPrintConfidenceIntervalHeadline(StringBuilder output, DSEObjectives objs, List<Criterion> criterionsToSave) {
		
		for (Criterion criterion : criterionsToSave) {
			ConfidenceInterval c = objs.getConfidenceIntervalForObjective(criterion);
			if (c != null){
				output.append(DSEConstantsContainer.LOWER_BOUND_CONFIDENCE+"("+getDimensionName(criterion)+");"
						+ DSEConstantsContainer.UPPER_BOUND_CONFIDENCE+"("+getDimensionName(criterion)+");"
						+ DSEConstantsContainer.ALPHA+"("+getDimensionName(criterion)+");"); 
			}
		
		}
		return output;
	}

	@Override
	protected StringBuilder prettyPrintResultLineCSV(StringBuilder output, DSEIndividual ind,
			List<Criterion> criterionsToSave, List<Criterion> criteriaWithConfidence) {
		
		// first objectives
		DSEObjectives objs = ind.getObjectives();
		for (Criterion o : criterionsToSave) {
			if (objs != null){
				output.append(formatValue(objs.getValueForCriterion(o)) + ";");
			} else {
				output.append(formatDouble(Double.NaN) + ";");
			}
		}

		for (Criterion o : criteriaWithConfidence) {
			ConfidenceInterval c = objs.getConfidenceIntervalForObjective(o);
			if (c != null){
				output.append(c.getLowerBound() + ";" + c.getUpperBound() + ";" + c.getLevel() + ";"); 
			} else {
				output.append(Double.NaN + ";" + Double.NaN + ";" + Double.NaN + ";");
			}
		}

		//then genes
		DesignDecisionGenotype genes = (DesignDecisionGenotype) ind.getGenotype();
		if (genes.size() == 0){
			logger.error("Encountered empty genotype, filling it with blanks");
			int problemsize = Opt4JStarter.getProblem().getDesignDecisions().size();
			for (int i = 0; i < problemsize; i++) {
				output.append(";");
			}

		} else {
			output.append(genes.toString());
		}

		output.append( ((DMLPhenotype)ind.getPhenotype()).getNumericID()+";" );

		output.append("\n");
		return output;
	}

}
