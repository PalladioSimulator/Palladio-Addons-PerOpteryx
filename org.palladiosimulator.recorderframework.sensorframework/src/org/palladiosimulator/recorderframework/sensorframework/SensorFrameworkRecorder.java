package org.palladiosimulator.recorderframework.sensorframework;

import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.EXECUTION_RESULT_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.HOLDING_TIME_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.HOLDING_TIME_METRIC_TUPLE;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.OVERALL_STATE_OF_ACTIVE_RESOURCE_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.POINT_IN_TIME_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.RESOURCE_DEMAND_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.RESOURCE_DEMAND_METRIC_TUPLE;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.RESPONSE_TIME_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.RESPONSE_TIME_METRIC_TUPLE;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.NUMBER_OF_SLO_VIOLATIONS;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.SLO_VIOLATIONS_METRIC_TUPLE;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.STATE_OF_ACTIVE_RESOURCE_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.STATE_OF_ACTIVE_RESOURCE_METRIC_TUPLE;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.STATE_OF_ACTIVE_RESOURCE_OVER_TIME_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.WAITING_TIME_METRIC;
import static org.palladiosimulator.metricspec.constants.MetricDescriptionConstants.WAITING_TIME_METRIC_TUPLE;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.omg.PortableServer.ServantLocatorOperations;
import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.recorderframework.IRawWriteStrategy;
import org.palladiosimulator.recorderframework.Recorder;
import org.palladiosimulator.recorderframework.launch.IRecorderConfiguration;
import org.palladiosimulator.recorderframework.sensorframework.strategies.AbstractWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.ExecutionResultWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.OverallStateWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.PointInTimeWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.ResourceDemandWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.ResponseTimeWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.SLOViolationsWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.StateOfActiveResourceWriteDataStrategy;
import org.palladiosimulator.recorderframework.sensorframework.strategies.WaitingTimeWriteDataStrategy;

import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;

/**
 * Recorder for the SensorFramework.
 * 
 * @author pmerkle, Sebastian Lehrig
 */
public class SensorFrameworkRecorder extends Recorder implements IRawWriteStrategy {

    private static Logger logger = Logger.getLogger(SensorFrameworkRecorder.class.getName());

    private SensorFrameworkRecorderConfiguration recorderConfiguration;

    /**
     * All instances of this class uses the same IDAOFactory. Hence it is sufficient when a single
     * writer flushes the data. Several subsequent flushes would be redundant. This variable is used
     * to coordinate the flush between several instances of this writer. It is false when one
     * instance has written data that has not yet been flushed; true else.
     */
    private static boolean flushed;

    private AbstractWriteDataStrategy writeDataStrategy;

    @Override
    public void initialize(final IRecorderConfiguration myRecorderConfiguration) {
        if (myRecorderConfiguration instanceof SensorFrameworkRecorderConfiguration) {
            this.recorderConfiguration = (SensorFrameworkRecorderConfiguration) myRecorderConfiguration;
        } else {
            throw new IllegalArgumentException("Expected meta data of type "
                    + SensorFrameworkRecorderConfiguration.class.getSimpleName() + " but was "
                    + myRecorderConfiguration.getClass().getSimpleName());
        }

        if (this.recorderConfiguration.isRemoteRun()) {
            throw new UnsupportedOperationException("Remote runs are not implemented yet");
        }

        // TODO Remove hard-coded metric references?

        final IDAOFactory daoFactory = this.recorderConfiguration.getDaoFactory();
        final Experiment experiment = this.recorderConfiguration.getExperiment();
        final ExperimentRun run = this.recorderConfiguration.getExperimentRun();
        final String recorderAcceptedMetric = recorderConfiguration.getRecorderAcceptedMetric().getId();
        if (recorderAcceptedMetric.equals(POINT_IN_TIME_METRIC.getId())) {
            writeDataStrategy = new PointInTimeWriteDataStrategy(daoFactory, experiment, run);
        } else if (recorderAcceptedMetric.equals(RESPONSE_TIME_METRIC.getId())
                || recorderAcceptedMetric.equals(RESPONSE_TIME_METRIC_TUPLE.getId())) {
            writeDataStrategy = new ResponseTimeWriteDataStrategy(daoFactory, experiment, run);
        }
            else if (recorderAcceptedMetric.equals(NUMBER_OF_SLO_VIOLATIONS.getId())
                    || recorderAcceptedMetric.equals(SLO_VIOLATIONS_METRIC_TUPLE.getId())) {
                writeDataStrategy = new SLOViolationsWriteDataStrategy(daoFactory, experiment, run);
        } else if (recorderAcceptedMetric.equals(HOLDING_TIME_METRIC.getId())
                || recorderAcceptedMetric.equals(HOLDING_TIME_METRIC_TUPLE.getId())
                || recorderAcceptedMetric.equals(WAITING_TIME_METRIC.getId())
                || recorderAcceptedMetric.equals(WAITING_TIME_METRIC_TUPLE.getId())) {
            writeDataStrategy = new WaitingTimeWriteDataStrategy(daoFactory, experiment, run); // TODO Are the correct metrics handled here?
        } else if (recorderAcceptedMetric.equals(RESOURCE_DEMAND_METRIC.getId())
                || recorderAcceptedMetric.equals(RESOURCE_DEMAND_METRIC_TUPLE.getId())) {
            writeDataStrategy = new ResourceDemandWriteDataStrategy(daoFactory, experiment, run);
        } else if (recorderAcceptedMetric.equals(STATE_OF_ACTIVE_RESOURCE_METRIC.getId())
                || recorderAcceptedMetric.equals(STATE_OF_ACTIVE_RESOURCE_METRIC_TUPLE.getId())
                || recorderAcceptedMetric.equals(STATE_OF_ACTIVE_RESOURCE_OVER_TIME_METRIC.getId())) {
            writeDataStrategy = new StateOfActiveResourceWriteDataStrategy(daoFactory, experiment, run);
        } else if (recorderAcceptedMetric.equals(OVERALL_STATE_OF_ACTIVE_RESOURCE_METRIC.getId())) {
            writeDataStrategy = new OverallStateWriteDataStrategy(daoFactory, experiment, run);
        } else if (recorderAcceptedMetric.equals(EXECUTION_RESULT_METRIC.getId())) {
            writeDataStrategy = new ExecutionResultWriteDataStrategy(daoFactory, experiment, run);
        } else {
            throw new RuntimeException("Unsupported metric (\"" + recorderConfiguration.getRecorderAcceptedMetric().getName()
                    + "\") requested to SensorFramework recorder");
        }
        writeDataStrategy.initialise(recorderConfiguration);

        flushed = false;
    }

    @Override
    public void writeData(final Measurement data) {
        if (!flushed) {
            writeDataStrategy.writeData(data);
        } else {
            if (logger.isEnabledFor(Level.WARN)) {
                logger.warn("Tried to write data, but the pipe has been flushed already");
            }
        }
    }

    @Override
    public synchronized void flush() {
        if (!flushed) {
            flushed = true;
            if (logger.isDebugEnabled()) {
                logger.debug("Flushing SensorFramework data store");
            }
            recorderConfiguration.getDaoFactory().store();
            // do not execute daoFactory.finalizeAndClose() ! This will flush all lists for
            // file-based lists, e.g. experiments, from memory. This should not be done on any DAO
            // requested via the singleton as the lists are not reloaded on next access.
        }
    }
}
