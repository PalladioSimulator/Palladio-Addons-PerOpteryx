package de.uka.ipd.sdq.dsexplore.analysis.simucom;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.PassiveResourceResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.pcm.seff.ExternalCallAction;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.codegen.simudatavisualisation.datatypes.TimeSeries;
import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.AnalysisFailedException;
import de.uka.ipd.sdq.dsexplore.analysis.IPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IStatisticAnalysisResult;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.sensorframework.entities.Sensor;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

abstract public class SimuComAnalysisResult extends AbstractPerformanceAnalysisResult
        implements IStatisticAnalysisResult, IPerformanceAnalysisResult {

    protected double meanValue;

    protected double medianValue;

    protected double throughput;

    protected double maxUtilization;

    protected double stdDeviation;

    protected ConfidenceInterval confidenceInterval;

    protected double alpha = 0.95;

    protected long observations = 0;

    /**
     * You must not use the usage scenario to navigate in the PCM, as the model may not be longer
     * valid for this result after the constructor call.
     */
    protected String pcmEntityIdentifier;

    /**
     * Contains: resource utilisations Should also contain: Passive resources.
     */
    protected ResultDecoratorRepository results;

    protected Map<Criterion, EvaluationAspectWithContext> objectiveToAspects;

    protected SimuComQualityAttributeDeclaration qualityAttributeInfo;

    /**
     * Identifier for subsets of data elements that belong to a single time series element.
     *
     * Copied from de.uka.ipd.sdq.sensorframework.visualisation.rvisualisation.reports.RReport, will
     * copy instead of import to not get a dependency on an R dependent plugin.
     *
     * @see TimeSeries
     * @author groenda
     */
    protected enum TimeseriesData {
        /** The timespan value of the time series data point. */
        TIMESPAN,
        /** The eventtime value of the time series data point. */
        EVENTTIME,
        /** Both, the timespan and eventtime, of the time series data point. */
        BOTH
    }

    protected static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore");

    protected SimuComAnalysisResult(final PCMInstance pcm) {
        super(pcm);
    }

    // Implemented individually in subclasses:
    // - abstract protected double calculateUnivariateStatistic(TimeseriesData timespan,
    // UnivariateStatistic stat);
    // - abstract protected double calculateThroughput() throws AnalysisFailedException;

    protected double calculateMaxUtil(final String resourceType) {
        double maxUtil = 0.0;
        for (final UtilisationResult utilResult : this.results.getUtilisationResults_ResultDecoratorRepository()) {
            if (utilResult.getEntityName().contains(resourceType) && maxUtil < utilResult.getResourceUtilisation()) {
                maxUtil = utilResult.getResourceUtilisation();
            }
        }
        return maxUtil;
    }

    protected ResultDecoratorRepository retrieveResults(final PCMInstance pcmInstance) throws AnalysisFailedException {

        final ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();
        // FIXME : Not implemented for EDP2 yet -> commented for testing
        // The following three functions can be commented in as soon as they are implemented in
        // SimuComAnalysisEDP2Result.
        // retrieveResourceUtilisation(pcmInstance, repo);
        // retrieveServiceResults(pcmInstance, repo);
        // retrievePassiveResourceUtil(repo, pcmInstance);

        return repo;
    }

    // Persistency framework dependent part of the next method
    abstract protected void retrieveServiceResultsFinish(PCMInstance pcmInstance, ResultDecoratorRepository repo,
            HashMap<String, ExternalCallAction> idToExternalCallMap,
            Map<String, AssemblyContextContext> idToAssemblyContextMap, List<String> completionComponentIdsToIgnore);

    // Extracted from retrievePassiveResourceUtil
    abstract protected Map<String, PassiveResourceResult> retrievePassiveResourceUtilFinish(
            Map<String, PassiveResourceResult> idsToPassiveResourceResult);

    /**
     * This implementation does not properly check the passed criterion...
     */
    @Override
    public double getValueFor(final Criterion criterion) {

        if (EcoreUtil.equals(getDimensionForCriterion(criterion), this.qualityAttributeInfo.getResponseTime())) {
            return this.meanValue;
        } else if (EcoreUtil.equals(getDimensionForCriterion(criterion), this.qualityAttributeInfo.getThroughput())) {
            return this.throughput;
        } else if (EcoreUtil.equals(getDimensionForCriterion(criterion),
                this.qualityAttributeInfo.getMaxUtilization())) {
            return this.maxUtilization;
        }

        logger.warn("Unknown aspect for simu com result, adding NaN.");
        return Double.NaN;
    }

    private Dimension getDimensionForCriterion(final Criterion criterion) {
        final EvaluationAspectWithContext aspect = this.objectiveToAspects.get(criterion);
        if (aspect != null) {
            return aspect.getDimension();
        } else {
            return null;
        }
    }

    @Override
    public double getMeanValue() {
        return meanValue;
    }

    @Override
    public double getStandardDeviation() {
        return stdDeviation;
    }

    public double getVariance() throws AnalysisFailedException {
        final double std = this.getStandardDeviation();
        return std * std;
    }

    @Override
    public double getCoefficientOfVariance() {
        final double std = this.getStandardDeviation();
        final double mean = this.getMeanValue();
        return std / mean;
    }

    /**
     * Retrieves the confidence interval for the Criterion.
     */
    @Override
    public ConfidenceInterval getConfidenceInterval(Criterion criterion) {
        // Only the criterion that represents the mean value of this result has a confidence
        // interval
        if (EcoreUtil.equals(getDimensionForCriterion(criterion), this.qualityAttributeInfo.getResponseTime())) {
            return this.confidenceInterval;
        } else {
            return null;
        }
    }

    @Override
    public double getMedianValue() {
        return medianValue;
    }

    /**
     * Get the utilisation of the passed resource
     */
    abstract protected void getUtilisationOfResource(ActiveResourceUtilisationResult resultToFill, Entity container,
            ResourceType resourceType) throws AnalysisFailedException;

    @Override
    public long getNumberOfObservations() {
        return this.observations;
    }

    @Override
    public ResultDecoratorRepository getResults() {
        return this.results;
    }

}

class ExternalCallActionWithSensors {

    private final ExternalCallAction externalCallAction;
    private final AssemblyContextContext assemblyContext;
    private final List<Sensor> sensors;

    public ExternalCallActionWithSensors(final ExternalCallAction e, final AssemblyContextContext myAssemblyContext) {
        this.externalCallAction = e;
        this.assemblyContext = myAssemblyContext;
        this.sensors = new LinkedList<Sensor>();
    }

    public ExternalCallAction getExternalCall() {
        return this.externalCallAction;
    }

    public AssemblyContextContext getAssemblyContext() {
        return this.assemblyContext;
    }

    public void addSensor(final Sensor s) {
        this.sensors.add(s);
    }

    public List<Sensor> getSensors() {
        return this.sensors;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ExternalCallActionWithSensors) {
            final ExternalCallActionWithSensors other = (ExternalCallActionWithSensors) o;
            return other.getAssemblyContext().equals(this.assemblyContext)
                    && other.getExternalCall().equals(this.externalCallAction);
        } else {
            return false;
        }

    }
}

class AssemblyContextContext {

    private final AssemblyContext assemblyContext;
    private AssemblyContextContext parentAssemblyContext;

    public AssemblyContextContext(final AssemblyContext thisContext) {
        this.assemblyContext = thisContext;
    }

    /**
     * return composed id <this.id><parent.id><grandparent.id>...
     *
     * @return
     */
    public String getComposedId() {
        String parentID = "";
        if (this.hasParent()) {
            parentID = this.getParentAssemblyContext().getComposedId();
        }
        return this.assemblyContext.getId() + parentID;
    }

    public boolean hasParent() {
        return this.parentAssemblyContext != null;
    }

    /**
     * @return the assemblyContext
     */
    public AssemblyContext getAssemblyContext() {
        return assemblyContext;
    }

    /**
     * @return the parentAssemblyContext
     */
    public AssemblyContextContext getParentAssemblyContext() {
        return parentAssemblyContext;
    }

    public void setParent(final AssemblyContextContext assemblyContextContext) {
        this.parentAssemblyContext = assemblyContextContext;
    }

}
