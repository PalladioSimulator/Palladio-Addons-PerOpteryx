package de.uka.ipd.sdq.pcm.pcm2taskmodel.jobs;

import org.eclipse.debug.core.ILaunch;
import org.palladiosimulator.analyzer.accuracy.jobs.TransformPCMForAccuracyInfluenceAnalysisJob;
import org.palladiosimulator.analyzer.workflow.jobs.EventsTransformationJob;
import org.palladiosimulator.analyzer.workflow.jobs.LoadMiddlewareConfigurationIntoBlackboardJob;
import org.palladiosimulator.analyzer.workflow.jobs.LoadPCMModelsIntoBlackboardJob;
import org.palladiosimulator.analyzer.workflow.jobs.StoreAllPCMModelsJob;
import org.palladiosimulator.analyzer.workflow.jobs.ValidatePCMModelsJob;

import de.uka.ipd.sdq.pcm.pcm2taskmodel.runconfig.PCM2TaskModelWorkflowRunConfiguration;
import de.uka.ipd.sdq.workflow.jobs.ICompositeJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class PCM2TaskModelJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements ICompositeJob {

	public PCM2TaskModelJob(PCM2TaskModelWorkflowRunConfiguration config, ILaunch launch) {
		super();

		// 1. Load PCM Models into memory
		// This now also creates a plug-in in the workspace and stores temporary
		// data there:
		this.addJob(new LoadPCMModelsIntoBlackboardJob(config));
		//this.addJob(new LoadMiddlewareConfigurationIntoBlackboardJob(config));

		// 2. Validate PCM Models
		this.addJob(new ValidatePCMModelsJob(config));

		// -- Stage Model modification
		// 3. Modification for AccuracyInfluenceAnalysis
		if (config.isAccuracyInfluenceAnalysisEnabled()) {
			this.add(new TransformPCMForAccuracyInfluenceAnalysisJob(config));
		}

		// 4. Transform Event Model Elements
		this.add(new EventsTransformationJob(config));

		// -- Stage analysis
		// 8. Store resulting model(s)
		this.add(new StoreAllPCMModelsJob(config));

		// 3. Run Analysis on Loaded Models
		this.add(new RunDSolverJob(config));
		
		// 4. Run Transformation on Loaded Models
		this.add(new RunPCM2TaskModelJob(config));
	}

}
