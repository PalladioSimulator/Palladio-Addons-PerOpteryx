package de.uka.ipd.sdq.dsexplore.analysis.reliability;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.apache.log4j.Logger;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.runconfig.PCMSolverWorkflowRunConfiguration;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;

/**
 * This class represents the result of a LQN Solver analysis. 
 * 
 * @author anne
 *
 */
public class ReliabilityAnalysisResult implements IAnalysisResult {
	
	protected static Logger logger = Logger
			.getLogger("de.uka.ipd.sdq.dsexplore");
	

	private double pofod;

	/**
	 * Store the reliability result. If the number of exact decimal places has been limited in the
	 * {@link PCMSolverWorkflowRunConfiguration}, the result is rounded to that value by cutting all following places. 
	 * @param reliabilityValue The success probability.
	 * @param lastPCMSolverConfiguration configuration to determine whether to round the result. 
	 */
	public ReliabilityAnalysisResult(double reliabilityValue, PCMSolverWorkflowRunConfiguration lastPCMSolverConfiguration) {
		boolean limitedNumberOfExactDecimalPlaces = lastPCMSolverConfiguration.isNumberOfExactDecimalPlacesEnabled();
		if (limitedNumberOfExactDecimalPlaces) {
			// +1 to not loose any information, because the solver is accurate to at least the given number of places. 
			int numberOfPlaces = lastPCMSolverConfiguration.getNumberOfExactDecimalPlaces() + 1;
			BigDecimal bigD = new BigDecimal(reliabilityValue);
			bigD = bigD.setScale(numberOfPlaces, RoundingMode.FLOOR);
			reliabilityValue = bigD.doubleValue();
		}
		this.pofod = 1 - reliabilityValue;
	}

	/**
	 * {@inheritDoc}
	 * TODO: check correct criterion.
	 */
	@Override
	public double getValueFor(Criterion criterion)  {
		return this.pofod;

	}


	/**
	 * {@inheritDoc}
	 * 
	 * Not applicable to Reliability results. 
	 * @return -1
	 */
	public double getUtilisationOfResource(ResourceContainer container,
			ProcessingResourceSpecification resource) {
		// TODO Implement?
		return -1;
	}

}
