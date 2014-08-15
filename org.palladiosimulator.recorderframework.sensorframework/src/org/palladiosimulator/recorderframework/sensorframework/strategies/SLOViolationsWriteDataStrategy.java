package org.palladiosimulator.recorderframework.sensorframework.strategies;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;
import javax.measure.quantity.Dimensionless;

import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;

public class SLOViolationsWriteDataStrategy extends AbstractWriteDataStrategy {

    public SLOViolationsWriteDataStrategy(final IDAOFactory daoFactory,
            final Experiment experiment, final ExperimentRun run) {
        super(daoFactory, experiment, run);
    }

    @Override
    public void writeData(final IMeasureProvider data) {
        final Measure<Double, Duration> eventTimeMeasure = data.getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
        final Measure<Long, Dimensionless> sloViolationsMeasure = data.getMeasureForMetric(MetricDescriptionConstants.NUMBER_OF_SLO_VIOLATIONS);
        final long sloViolations = sloViolationsMeasure.longValue(Dimensionless.UNIT);
        System.out.println("slo violations "+data);
        final double eventTime = eventTimeMeasure.doubleValue(SI.SECOND);
        run.addTimeSpanMeasurement((TimeSpanSensor)sensor, eventTime, sloViolations);
    }
}
