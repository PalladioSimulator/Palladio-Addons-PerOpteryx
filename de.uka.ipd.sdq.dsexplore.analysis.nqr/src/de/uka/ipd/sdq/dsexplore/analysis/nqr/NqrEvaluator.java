package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.opt4j.core.Criterion;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.graph.DirectedGraph;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrReductionProxy;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.NqrFactory;
import de.uka.ipd.sdq.dsexplore.analysis.nqr.solver.ReasoningProxy;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.jobs.JobFailedException;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.MDSDBlackboard;

public class NqrEvaluator extends AbstractAnalysis implements IAnalysis {

    private static final boolean DEBUG = true;
    private static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.analysis.nqr");

    private static void debugReduction(final NqrReductionProxy reduction) {
        if (!DEBUG) {
            return;
        }
        logger.info("\t" + String.valueOf(reduction));
    }

    private NqrFactory factory;

    private List<NqrProxy> nqrResult;

    public NqrEvaluator() {
        super(new NqrSolverQualityAttributeDeclaration());
    }

    @Override
    public void analyse(final PCMPhenotype pheno, final IProgressMonitor monitor)
            throws CoreException, UserCanceledException, JobFailedException, AnalysisFailedException {

        ((QesFactory) factory).setInstance(pheno.getPCMInstance());
        debugFactory();

        final DirectedGraph<String> components = DirectedGraph.createDirectedComponentGraph(pheno);
        final Map<String, List<NqrProxy>> nqrs = new HashMap<String, List<NqrProxy>>();
        final Map<String, List<ReasoningProxy>> reasonings = new HashMap<String, List<ReasoningProxy>>();
        final Map<String, List<NqrProxy>> results = new HashMap<String, List<NqrProxy>>();

        for (final String id : components.getTopologicalSort()) {
            nqrs.put(id, factory.getNqrList(id));
            reasonings.put(id, factory.getReasoningList(id));
            final NqrReductionProxy reduction = factory.createNqrReductionProxy();

            debugComponent(components, nqrs, reasonings, results, id);


            // Add nqr of the own component
            reduction.addAll(nqrs.get(id));

            // Add all nqr of directly connected components
            for (final String edge : components.edgesFrom(id)) {
                reduction.addAll(results.get(edge));
            }

            // Solve the reasonings of the component
            for (final ReasoningProxy reasoning : reasonings.get(id)) {
                reasoning.reset();
                reduction.add(reasoning.get(reduction.get()));
            }

            debugReduction(reduction);
            results.put(id, reduction.get());
        }

        // Collect all the nqr of the components and reduce them to a list
        final NqrReductionProxy reduction = factory.createNqrReductionProxy();
        for (final List<NqrProxy> result : results.values()) {
            reduction.addAll(result);
        }
        nqrResult = reduction.get();

        debugResults();
        System.out.println();
    }

    private void debugComponent(final DirectedGraph<String> components, final Map<String, List<NqrProxy>> nqrs,
            final Map<String, List<ReasoningProxy>> reasonings, final Map<String, List<NqrProxy>> results,
            final String id) {

        if (!DEBUG) {
            return;
        }

        final StringBuilder builder = new StringBuilder(factory.getComponentName(id));
        builder.append(" : ");
        for (final String edge : components.edgesFrom(id)) {
            builder.append(factory.getComponentName(edge)).append(", ");
        }
        builder.setLength(builder.length() - 2);
        logger.info(builder.toString());

        for (final NqrProxy nqr : nqrs.get(id)) {
            logger.info("\t" + String.valueOf(nqr));
        }
        for (final ReasoningProxy reasoning : reasonings.get(id)) {
            logger.info("\t" + String.valueOf(reasoning));
        }
        for (final String edge : components.edgesFrom(id)) {
            logger.info("\t" + factory.getComponentName(edge));
            for (final NqrProxy nqr : results.get(edge)) {
                logger.info("\t\t" + String.valueOf(nqr));
            }
        }
    }

    private void debugFactory() {
        if (!DEBUG) {
            return;
        }
        logger.warn("###########################################################");
        logger.info(factory);
    }

    private void debugResults() {
        if (!DEBUG) {
            return;
        }
        logger.info("Results:");
        for (final NqrProxy result : nqrResult) {
            logger.info("\t" + String.valueOf(result));
        }
        logger.warn("###########################################################");
    }

    @Override
    public boolean hasObjectivePerUsageScenario() throws CoreException {
        return false;
    }

    @Override
    public void initialise(final DSEWorkflowConfiguration configuration) throws CoreException {
        final ILaunchConfiguration rawConfiguration = configuration.getRawConfiguration();
        // factory = new
        // NqrFactory(rawConfiguration.getAttribute(DSEConstantsContainer.REASONING_SYSTEM_FILE,
        // ""),
        // rawConfiguration.getAttribute(DSEConstantsContainer.REASONING_REDUCTION_FILE, ""),
        // rawConfiguration.getAttribute(DSEConstantsContainer.QML_CONTRACT_FILE, ""));

        factory = new QesFactory(rawConfiguration.getAttribute(DSEConstantsContainer.REASONING_SYSTEM_FILE, ""),
                rawConfiguration.getAttribute(DSEConstantsContainer.REASONING_REDUCTION_FILE, ""),
                rawConfiguration.getAttribute(DSEConstantsContainer.QML_CONTRACT_FILE, ""),
                rawConfiguration.getAttribute(DSEConstantsContainer.QUALITY_EFFECT_SPECIFICATION_FILE, ""));

        ((NqrSolverQualityAttributeDeclaration) qualityAttribute).addAllDimensions(factory.getAllDimensions());
        initialiseCriteria(configuration);
    }

    @Override
    public IAnalysisResult retrieveResultsFor(final PCMPhenotype pheno, final Criterion criterion)
            throws CoreException, AnalysisFailedException {
        return new NqrAnalysisResult(criterionToAspect, ((NqrSolverQualityAttributeDeclaration) qualityAttribute),
                nqrResult, factory);
    }

    @Override
    public void setBlackboard(final MDSDBlackboard blackboard) {
        this.blackboard = blackboard;
    }

}
