package de.uka.ipd.sdq.dsexplore.analysis.simulizar;
import org.palladiosimulator.simulizar.launcher.jobs.LoadPCMModelsIntoBlackboardInterpreterJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadPMSModelIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.LoadSDMModelsIntoBlackboardJob;
import org.palladiosimulator.simulizar.launcher.jobs.PCMStartInterpretationJob;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.IBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SimuLizarModelInterpreterRootCompositeJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IBlackboardInteractingJob<MDSDBlackboard> { 

	/**
     * Constructor
     * 
     * @param configuration
     *            the SimuCom workflow configuration.
     */
    public  SimuLizarModelInterpreterRootCompositeJob(final SimuComWorkflowConfiguration configuration) {
        super(false);

        this.addJob(new LoadPCMModelsIntoBlackboardInterpreterJob(configuration));

        this.addJob(new LoadPMSModelIntoBlackboardJob(configuration));

        this.addJob(new LoadSDMModelsIntoBlackboardJob(configuration));

      this.addJob(new PCMStartInterpretationJob(configuration));

    }
    

}
