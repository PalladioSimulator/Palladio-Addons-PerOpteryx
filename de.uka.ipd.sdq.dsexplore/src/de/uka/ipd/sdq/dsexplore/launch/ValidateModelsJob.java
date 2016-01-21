package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.palladiosimulator.analyzer.completions.CompletionsPackage;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.allocation.AllocationPackage;
import org.palladiosimulator.pcm.core.CorePackage;
import org.palladiosimulator.pcm.parameter.ParameterPackage;
import org.palladiosimulator.pcm.qosannotations.qos_reliability.QosReliabilityPackage;
import org.palladiosimulator.pcm.reliability.ReliabilityPackage;
import org.palladiosimulator.pcm.repository.RepositoryPackage;
import org.palladiosimulator.pcm.resourceenvironment.ResourceenvironmentPackage;
import org.palladiosimulator.pcm.resourcetype.ResourcetypePackage;
import org.palladiosimulator.pcm.seff.SeffPackage;
import org.palladiosimulator.pcm.seff.seff_reliability.SeffReliabilityPackage;
import org.palladiosimulator.pcm.system.SystemPackage;
import org.palladiosimulator.pcm.usagemodel.UsagemodelPackage;

import de.uka.ipd.sdq.identifier.IdentifierPackage;
import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;
import de.uka.ipd.sdq.stoex.StoexPackage;
import de.uka.ipd.sdq.units.UnitsPackage;
import de.uka.ipd.sdq.workflow.jobs.IJob;
import de.uka.ipd.sdq.workflow.jobs.SequentialBlackboardInteractingJob;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;
import de.uka.ipd.sdq.workflow.mdsd.emf.CheckEMFConstraintsJob;
import de.uka.ipd.sdq.workflow.mdsd.oaw.PerformOAWCheckValidation;
import de.uka.ipd.sdq.workflow.mdsd.validation.ModelValidationJob;
import de.uka.ipd.sdq.workflow.mdsd.validation.ShowValidationErrorsJob;
import de.uka.ipd.sdq.errorhandling.SeverityEnum;

// FIXME this class currently only works for PCM models; any other model will fail!
public class ValidateModelsJob extends SequentialBlackboardInteractingJob<MDSDBlackboard> implements IJob {

	// taken from ValidatePCMModelsJob
	private static final String PCM_CHECK_FILENAME = "pcm";
	
	public ValidateModelsJob(DSEWorkflowConfiguration configuration) {
		super(false);
		EPackage[] pcmPackages = new EPackage[] {
                // Packages needed by QVT Transformations {{
                EcorePackage.eINSTANCE,
                IdentifierPackage.eINSTANCE,
                UnitsPackage.eINSTANCE,
                ProbfunctionPackage.eINSTANCE,
                PcmPackage.eINSTANCE,
                // }}
                SeffPackage.eINSTANCE, RepositoryPackage.eINSTANCE, ParameterPackage.eINSTANCE,
                UsagemodelPackage.eINSTANCE, SystemPackage.eINSTANCE, ResourcetypePackage.eINSTANCE,
                ResourceenvironmentPackage.eINSTANCE, AllocationPackage.eINSTANCE, StoexPackage.eINSTANCE,
                CorePackage.eINSTANCE, CompletionsPackage.eINSTANCE, ReliabilityPackage.eINSTANCE,
                QosReliabilityPackage.eINSTANCE, SeffReliabilityPackage.eINSTANCE };
		
		this.setName("Checking PCM model constraints");
		this.addJob(new PerformOAWCheckValidation(
				LoadModelIntoBlackboardJob.MODEL_PARTITION_ID, 
				PCM_CHECK_FILENAME, 
				pcmPackages));
		this.addJob(new CheckEMFConstraintsJob(SeverityEnum.WARNING, LoadModelIntoBlackboardJob.MODEL_PARTITION_ID));
		this.addJob(new ShowValidationErrorsJob(configuration, this.toArray(new ModelValidationJob[]{})));
	}
}
