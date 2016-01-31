package de.uka.ipd.sdq.dsexplore.launch;

import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.emf.CheckEMFConstraintsJob;
import de.uka.ipd.sdq.workflow.mdsd.oaw.PerformOAWCheckValidation;
import de.uka.ipd.sdq.workflow.mdsd.validation.ModelValidationJob;
import de.uka.ipd.sdq.workflow.mdsd.validation.ShowValidationErrorsJob;
import de.uka.ipd.sdq.errorhandling.SeverityEnum;

public class ValidateModelsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> {
	
	public ValidateModelsJob(DSEWorkflowConfiguration configuration) {
		super(false);
		this.setName("Checking model constraints");
		this.addJob(new PerformOAWCheckValidation(
				LoadModelIntoBlackboardJob.MODEL_PARTITION_ID, 
				configuration.getCheckFilename(), configuration.getEpackages()));
		this.addJob(new CheckEMFConstraintsJob(SeverityEnum.WARNING, LoadModelIntoBlackboardJob.MODEL_PARTITION_ID));
		this.addJob(new ShowValidationErrorsJob(configuration, this.toArray(new ModelValidationJob[]{})));
	}
}
