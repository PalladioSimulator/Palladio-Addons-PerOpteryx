package de.uka.ipd.sdq.pipesandfilters.framework.recorder.sensorframework.strategies;



import javax.measure.Measure;

import javax.measure.quantity.Duration;
import javax.measure.unit.SI;
import de.uka.ipd.sdq.pipesandfilters.framework.PipeData;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;

import de.uka.ipd.sdq.sensorframework.entities.TimeSpanSensor;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;

public class SLOViolationsWriteDataStrategy extends AbstractWriteDataStrategy {

	public SLOViolationsWriteDataStrategy(IDAOFactory daoFactory,
			Experiment experiment, ExperimentRun run) {
		super(daoFactory, experiment, run);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void writeData(PipeData data) {
		Measure<Integer, Duration> SLOViolationsMeasure = (Measure<Integer, Duration>) data
				.getTupleElement(0);
		Measure<Double, Duration> eventTimeMeasure = (Measure<Double, Duration>) data
			.getTupleElement(1);
		int sloviolations = SLOViolationsMeasure.intValue(SI.SECOND);
		double eventTime = eventTimeMeasure.doubleValue(SI.SECOND);
		run.addTimeSpanMeasurement((TimeSpanSensor)sensor, eventTime, sloviolations);	
	}
}
