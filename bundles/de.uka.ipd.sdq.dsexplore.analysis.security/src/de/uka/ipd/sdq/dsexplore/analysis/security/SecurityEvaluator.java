package de.uka.ipd.sdq.dsexplore.analysis.security;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.opt4j.core.Criterion;
import org.palladiosimulator.pcm.allocation.Allocation;
import org.palladiosimulator.pcm.allocation.AllocationContext;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.core.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class SecurityEvaluator extends AbstractAnalysis implements IAnalysis {

    /** Logger for log4j. */
    private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.security");

    private final Map<Long, SecurityAnalysisResult> previousSecurityResults = new HashMap<Long, SecurityAnalysisResult>();

    public SecurityEvaluator() {
        super(new SecuritySolverQualityAttributeDeclaration());
    }

    @Override
    public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor)
            throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {
        final PCMInstance pcm = pheno.getPCMInstance();

        final Allocation allocation = pcm.getAllocation();

        boolean webserverAloneOrWithParser = true;
        AllocationContext allocationContextOfWebserver = null;

        for (final AllocationContext allocationContext : allocation.getAllocationContexts_Allocation()) {
            if (allocationContext.getEntityName().contains("BoxUpload")) {
                allocationContextOfWebserver = allocationContext;
            }
        }

        final ResourceContainer dmzServerCandidate = allocationContextOfWebserver
                .getResourceContainer_AllocationContext();

        for (final AllocationContext allocationContext : allocation.getAllocationContexts_Allocation()) {
            if (allocationContext != allocationContextOfWebserver
                    && allocationContext.getResourceContainer_AllocationContext() == dmzServerCandidate
                    && !allocationContext.getEntityName().contains("Parser")) {
                webserverAloneOrWithParser = false;
                break;
            }
        }

        final int securityValue = webserverAloneOrWithParser ? 1 : 0;

        this.previousSecurityResults.put(pheno.getNumericID(), new SecurityAnalysisResult(securityValue, pcm,
                this.criterionToAspect, (SecuritySolverQualityAttributeDeclaration) this.qualityAttribute));
    }

    @Override
    public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {

        initialiseCriteria(configuration);
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
