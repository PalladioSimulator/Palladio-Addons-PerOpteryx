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

public class ResourceDemandWriteDataStrategy extends AbstractWriteDataStrategy {

    public ResourceDemandWriteDataStrategy(final IDAOFactory daoFactory,
            final Experiment experiment, final ExperimentRun run) {
        super(daoFactory, experiment, run);
    }

    @Override
    public void writeData(final IMeasureProvider data) {
        final Measure<Double, Duration> measurementTimeMeasure = data.getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
        final Measure<Double, Duration> demandedTimeMeasure = data.getMeasureForMetric(MetricDescriptionConstants.RESOURCE_DEMAND_METRIC);
        final double measurementTime = measurementTimeMeasure.doubleValue(SI.SECOND);
        final double demandedTime = demandedTimeMeasure.doubleValue(SI.SECOND);
        run.addTimeSpanMeasurement((TimeSpanSensor)sensor, measurementTime, demandedTime);
    }
}
