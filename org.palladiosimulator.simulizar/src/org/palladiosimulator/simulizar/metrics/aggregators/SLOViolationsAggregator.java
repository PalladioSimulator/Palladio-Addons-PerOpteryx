package org.palladiosimulator.simulizar.metrics.aggregators;

import javax.measure.Measure;
import javax.measure.quantity.Dimensionless;

import org.palladiosimulator.measurementframework.Measurement;
import org.palladiosimulator.measurementframework.listener.IMeasurementSourceListener;
import org.palladiosimulator.metricspec.constants.MetricDescriptionConstants;

public class SLOViolationsAggregator implements IMeasurementSourceListener {

	@Override
	public void newMeasurementAvailable(Measurement measurement) {
		final Measure<Long, Dimensionless> sloViolationMeasure = measurement
				.getMeasureForMetric(MetricDescriptionConstants.NUMBER_OF_SLO_VIOLATIONS);

	}

	@Override
	public void preUnregister() {
		// TODO Auto-generated method stub

	}

}
