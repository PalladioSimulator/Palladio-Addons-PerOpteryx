package org.palladiosimulator.simulizar.metrics.aggregators;

import java.util.Vector;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

import de.uka.ipd.sdq.probespec.framework.calculator.Calculator;
import de.uka.ipd.sdq.probespec.framework.calculator.ICalculatorListener;

public class SLOViolationsCollector implements ICalculatorListener  {

	
	public SLOViolationsCollector(final Calculator sloViolationsCalculator) {
		sloViolationsCalculator.addCalculatorListener(this);
	}
	@Override
	public void calculated(Vector<Measure<?, ? extends Quantity>> resultTuple) {
		
	}

}
