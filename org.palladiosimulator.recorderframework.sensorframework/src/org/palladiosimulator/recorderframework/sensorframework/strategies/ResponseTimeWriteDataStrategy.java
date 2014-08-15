package org.palladiosimulator.recorderframework.sensorframework.strategies;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;

public class ResponseTimeWriteDataStrategy extends AbstractWriteDataStrategy {

    public ResponseTimeWriteDataStrategy(final IDAOFactory daoFactory,
            final Experiment experiment, final ExperimentRun run) {
        super(daoFactory, experiment, run);
    }

    @Override
    public void writeData(final IMeasureProvider data) {
        final Measure<Double, Duration> eventTimeMeasure = data.getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
        final Measure<Double, Duration> responseTimeMeasure = data.getMeasureForMetric(MetricDescriptionConstants.RESPONSE_TIME_METRIC);
        final double responseTime = responseTimeMeasure.doubleValue(SI.SECOND);
        final double eventTime = eventTimeMeasure.doubleValue(SI.SECOND);
        System.out.println("response time "+data);
        run.addTimeSpanMeasurement((TimeSpanSensor)sensor, eventTime, responseTime);
    }
}
