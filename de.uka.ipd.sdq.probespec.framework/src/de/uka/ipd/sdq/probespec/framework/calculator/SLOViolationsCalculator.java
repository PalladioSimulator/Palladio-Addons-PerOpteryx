package de.uka.ipd.sdq.probespec.framework.calculator;
import java.math.BigDecimal;
import java.util.Vector;

import javax.measure.Measure;
import javax.measure.quantity.Duration;
import javax.measure.quantity.Quantity;
import javax.measure.unit.SI;

import de.uka.ipd.sdq.pipesandfilters.framework.CaptureType;
import de.uka.ipd.sdq.pipesandfilters.framework.MeasurementMetric;
import de.uka.ipd.sdq.pipesandfilters.framework.Scale;
import de.uka.ipd.sdq.probespec.framework.ProbeSample;
import de.uka.ipd.sdq.probespec.framework.ProbeSetSample;
import de.uka.ipd.sdq.probespec.framework.ProbeSpecContext;
import de.uka.ipd.sdq.probespec.framework.ProbeType;
import de.uka.ipd.sdq.probespec.framework.exceptions.CalculatorException;

/**
 * Calculates a time span representing the response time. It expects two
 * ProbeSets each containing at least a {@link ProbeType#CURRENT_TIME} probe.
 * 
 * @author Faber, Philipp Merkle
 * @see BinaryCalculator
 * @see Calculator
 */
public class SLOViolationsCalculator extends TimeSpanCalculator {

	private static Vector<MeasurementMetric> concreteMeasurementMetrics;
	private int sloviolations = 0;
	public static final double RESPONSE_TIME_LIMIT = 3.0;

    /**
     * Default Constructor.
     * 
     * @param ctx
     *            the {@link ProbeSpecContext}
     * @param startProbeSetID
     *            ID of the start probe set element from the model
     * @param endProbeSetID
     *            ID of the end probe set element from the model
     */
    public SLOViolationsCalculator(ProbeSpecContext ctx, Integer startProbeSetID, Integer endProbeSetID) {
        super(ctx, startProbeSetID, endProbeSetID);
    }
    
    
    protected Vector<Measure<?, ? extends Quantity>> calculate(
			ProbeSetSample start, ProbeSetSample end)
			throws CalculatorException {
    	// Obtain start time sample
    			ProbeSample<Double, Duration> startTimeSample = obtainCurrentTimeProbeSample(start);
    			if (startTimeSample == null) {
    				throw new CalculatorException(
    						"Could not access start probe sample.");
    			}

    			// Obtain end time sample
    			ProbeSample<Double, Duration> endTimeSample = obtainCurrentTimeProbeSample(end);
    			if (endTimeSample == null) {
    				throw new CalculatorException("Could not access end probe sample.");
    			}

    			// Calculate time span
    			BigDecimal endTime = BigDecimal.valueOf(endTimeSample.getMeasure().doubleValue(
    					startTimeSample.getMeasure().getUnit()));
    			BigDecimal startTime = BigDecimal.valueOf(startTimeSample.getMeasure().doubleValue(
    					startTimeSample.getMeasure().getUnit()));
    			
    			BigDecimal responseTime = endTime.subtract(startTime);
    			// Create result tuple
    			if(responseTime.doubleValue() > SLOViolationsCalculator.RESPONSE_TIME_LIMIT) {
    				
					this.sloviolations++;
    			}
//    			Measure<Double, Duration> timeSpanMeasure = Measure.valueOf(
//    					responseTime.doubleValue(), startTimeSample.getMeasure().getUnit());
    			Measure<Integer, Duration> timeSpanMeasure = Measure.valueOf(this.sloviolations, startTimeSample.getMeasure().getUnit());
    			Measure<Double, Duration> endTimeMeasure = endTimeSample.getMeasure();
    			Vector<Measure<?, ? extends Quantity>> resultTuple = new Vector<Measure<?, ? extends Quantity>>();
    			
    			resultTuple.add(timeSpanMeasure);
    			resultTuple.add(endTimeMeasure);
    			return resultTuple;
    	
    }

	/**
	 * Initializes the metric information for the result of this calculator
	 * type. The method is called by the constructor of the super class.
	 */
	@Override
	protected synchronized Vector<MeasurementMetric> getConcreteMeasurementMetrics() {
		if (concreteMeasurementMetrics == null) {
			concreteMeasurementMetrics = new Vector<MeasurementMetric>();
			// TODO Specifying the unit here could be problematic since it can
			// conflict with the actually measured unit
			MeasurementMetric mm = new MeasurementMetric(
					CaptureType.NATURAL_NUMBER, SI.MILLI(SI.SECOND),
					Scale.ORDINAL);
			mm.setDescription("This measure represents the SLO violations");
			mm.setMonotonic(false);
			mm.setName("SLO Violations");
			mm.setStrongMonotonic(false);
			concreteMeasurementMetrics.add(mm);
		}
		return concreteMeasurementMetrics;
	}

}


