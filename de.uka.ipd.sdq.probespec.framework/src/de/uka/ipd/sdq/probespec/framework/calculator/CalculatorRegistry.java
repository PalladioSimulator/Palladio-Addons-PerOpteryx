package de.uka.ipd.sdq.probespec.framework.calculator;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author Philipp Merkle
 *
 */
public class CalculatorRegistry {

	
	
	private final Map<String,Calculator> calculators;
	private final Map<String,Calculator> responseTimecalculators;
	private final Map<String,Calculator> sloViolationcalculators;
	
	

	
	
	/**
	 * Default constructor.
	 */
	public CalculatorRegistry() {
		calculators = new HashMap<String, Calculator>();
		responseTimecalculators = new HashMap<String, Calculator>();
		sloViolationcalculators = new HashMap<String, Calculator>();
	}
	
	public Map<String,Calculator> getCalculators() {
		return calculators;
	}
	
	public Map<String,Calculator> getResponseTimeCalculators() {
		return responseTimecalculators;
	}
	
	public Map<String,Calculator> getsloViolationsCalculators() {
		return sloViolationcalculators;
	}
	public Calculator registerResponseTimeCalculator(String calculatorId, Calculator calculator) {
		responseTimecalculators.put(calculatorId, calculator);
		return calculator;
		
	}
	
	public Calculator registerSloviolationsCalculator(String calculatorId, Calculator calculator) {
		sloViolationcalculators.put(calculatorId, calculator);
		return calculator;
		
	}
	
	

	public Calculator registerCalculator(String calculatorId, Calculator calculator) {

		calculators.put(calculatorId, calculator);
		return calculator;
	}
	
	public void unregisterCalculator(String calculatorId) {
		// TODO Implementation
	}

	public Calculator getCalculatorForId(String calculatorId) {
		if(calculators.containsKey(calculatorId)) {
			return calculators.get(calculatorId);
		} else {
			return null;
		}
		
	}
}
