package org.palladiosimulator.recorderframework.sensorframework.strategies;

import java.util.HashMap;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;
import javax.measure.quantity.Duration;
import javax.measure.unit.SI;

import org.palladiosimulator.edp2.util.MeasuringPointUtility;
import org.palladiosimulator.measurementframework.measureprovider.IMeasureProvider;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;
import org.palladiosimulator.recorderframework.launch.IRecorderConfiguration;
import org.palladiosimulator.recorderframework.sensorframework.SensorFrameworkRecorderConfiguration;
import org.palladiosimulator.recorderframework.sensorframework.SensorHelper;

import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.State;
import de.uka.ipd.sdq.sensorframework.entities.StateSensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;

public class StateOfActiveResourceWriteDataStrategy extends AbstractWriteDataStrategy {

    private final HashMap<String, State> statesCache = new HashMap<String, State>();

    private State idleState;

    private State busyState;

    public StateOfActiveResourceWriteDataStrategy(final IDAOFactory daoFactory,
            final Experiment experiment, final ExperimentRun run) {
        super(daoFactory, experiment, run);
    }

    @Override
    public void initialise(final IRecorderConfiguration recorderConfiguration) {
        final SensorFrameworkRecorderConfiguration sensorFrameworkRecorderConfig = (SensorFrameworkRecorderConfiguration) recorderConfiguration;        
        final String sensorId = sensorFrameworkRecorderConfig.getRecorderAcceptedMetric().getName() + " of "
                +
                MeasuringPointUtility.measuringPointToString(sensorFrameworkRecorderConfig.getMeasuringPoint());
        this.idleState = SensorHelper.createOrReuseState(daoFactory, "Idle");
        this.busyState = SensorHelper.createOrReuseState(daoFactory, "Busy");
        sensor = SensorHelper.createOrReuseStateSensor(daoFactory, experiment,
                sensorId, idleState);
        if (!((StateSensor) sensor).getSensorStates().contains(idleState)) {
            ((StateSensor) sensor).addSensorState(idleState);
        }
        ((StateSensor) sensor).addSensorState(busyState);
    }

    @Override
    public void writeData(final IMeasureProvider data) {
        final Measure<Double, Duration> measurementTimeMeasure = data.getMeasureForMetric(MetricDescriptionConstants.POINT_IN_TIME_METRIC);
        final Measure<Long, Dimensionless> numericStateMeasure = data.getMeasureForMetric(MetricDescriptionConstants.STATE_OF_ACTIVE_RESOURCE_METRIC);
        final double measurementTime = measurementTimeMeasure.doubleValue(SI.SECOND);
        final int numericState = numericStateMeasure.intValue(Dimensionless.UNIT);
        State state = null;
        if (numericState == 0) {
            state = idleState;
        } else {
            final String stateLiteral = "Busy " + Integer.toString(numericState)
                    + " Job(s)";
            if (!statesCache.containsKey(stateLiteral)) {
                final State newState = SensorHelper.createOrReuseState(daoFactory,
                        stateLiteral);
                statesCache.put(stateLiteral, newState);
                if (!((StateSensor) sensor).getSensorStates()
                        .contains(newState)) {
                    ((StateSensor) sensor).addSensorState(newState);
                }
            }
            state = statesCache.get(stateLiteral);
        }
        run.addStateMeasurement((StateSensor)sensor, state, measurementTime);
    }

}
