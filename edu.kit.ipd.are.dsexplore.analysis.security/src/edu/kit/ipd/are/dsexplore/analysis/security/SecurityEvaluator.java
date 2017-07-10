package edu.kit.ipd.are.dsexplore.analysis.security;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import edu.kit.ipd.are.dsexplore.analysis.security.model.Attacker;
import edu.kit.ipd.are.dsexplore.analysis.security.model.Component;
import edu.kit.ipd.are.dsexplore.analysis.security.model.Scenario;

public class SecurityEvaluator extends AbstractAnalysis implements IAnalysis {

	/** Logger for log4j. */
	private static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	private final Map<Long, SecurityAnalysisResult> previousSecurityResults = new HashMap<Long, SecurityAnalysisResult>();

	public SecurityEvaluator() {
		super(new SecuritySolverQualityAttributeDeclaration());
	}

	@Override
	public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor)
			throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
		logger.debug("hi from analyse()");
		final PCMInstance pcm = pheno.getPCMInstance();

		final Allocation allocation = pcm.getAllocation();

		final int securityValue = (int) calcMTTSF_Scen1();
		logger.debug(securityValue);

		this.previousSecurityResults.put(pheno.getNumericID(), new SecurityAnalysisResult(securityValue, pcm,
				this.criterionToAspect, (SecuritySolverQualityAttributeDeclaration) this.qualityAttribute));
	}

	private static double calcMTTSF_Scen1() {
		int[][] theta = new int[6][6];
		theta[0][2] = 1;
		theta[1][3] = 1;
		theta[2][3] = 1;
		theta[3][4] = 2;
		theta[4][5] = 2;

		Component[] components = new Component[5];
		components[0] = new Component.Builder().TTDV(200).PoCoB(0.2).build();
		components[1] = new Component(250, 0.3);
		components[2] = new Component(125, 0.4);
		components[3] = new Component(150, 0.2);
		components[4] = new Component(300, 0.2);

		Attacker a = new Attacker(0.01, 100, 200);
		Scenario s = new Scenario(theta, components);
		return s.calcMTTSF(2, a);
	}

	@Override
	public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {
		logger.debug("hi from initialise()");
		this.initialiseCriteria(configuration);
	}

	@Override
	public boolean hasStatisticResultsFor() throws CoreException {
		return false;
	}

	@Override
	public IAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion)
			throws CoreException, AnalysisFailedException {
		// It is always the cost value, i.e. objective and constraint always have to refer to the
		// SimpleValue (-> no statistical requirements atm)
		// If more possible aspects are added, the criterion needs to be examined here

		return this.previousSecurityResults.get(pheno.getNumericID());
	}

	@Override
	public boolean hasObjectivePerUsageScenario() throws CoreException {
		return false;
	}

	@Override
	public void setBlackboard(final MDSDBlackboard blackboard) {
		this.blackboard = blackboard;
	}

}
