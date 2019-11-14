package de.uka.ipd.sdq.dsexplore.analysis.simulizar;

import org.palladiosimulator.simulizar.launcher.jobs.EvaluateResultsJob;
import org.palladiosimulator.simulizar.launcher.jobs.PCMStartInterpretationJob;
import org.palladiosimulator.simulizar.runconfig.SimuLizarWorkflowConfiguration;

import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

/**
 * Composite job loading pcm and Monitor Repository model, as well as all sdm
 * models and usage evolution model and starting pcm interpretation.
 *
 */
public class CustomPCMInterpreterRootCompositeJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IBlackboardInteractingJob<MDSDBlackboard> {

	/**
	 * Constructor
	 *
	 * @param configuration
	 *            the SimuCom workflow configuration.
	 */
	public CustomPCMInterpreterRootCompositeJob(final SimuLizarWorkflowConfiguration configuration) {
		super(false);

		// Always begin with an empty Blackboard;
		// this.setBlackboard(new MDSDBlackboard());

		this.addJob(new CustomLoadSimuLizarModelsIntoBlackboardJob(configuration));

		this.addJob(new PCMStartInterpretationJob(configuration));

		if (configuration.getServiceLevelObjectivesFile() != null && !(configuration.getServiceLevelObjectivesFile().equals(""))) {
			this.addJob(new EvaluateResultsJob(configuration));
		}

	}
}