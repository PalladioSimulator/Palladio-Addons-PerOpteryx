package de.uka.ipd.sdq.pcm.cost.helper;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.CostRepository;
import de.uka.ipd.sdq.pcm.cost.ScalarFunction;
import de.uka.ipd.sdq.pcm.cost.VariableProcessingResourceCost;
import de.uka.ipd.sdq.probfunction.math.IProbabilityFunctionFactory;
import de.uka.ipd.sdq.probfunction.math.IRandomGenerator;
import de.uka.ipd.sdq.probfunction.math.impl.ProbabilityFunctionFactoryImpl;
import de.uka.ipd.sdq.simucomframework.SimuComDefaultRandomNumberGenerator;
import de.uka.ipd.sdq.simucomframework.variables.StackContext;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCache;
import de.uka.ipd.sdq.simucomframework.variables.cache.StoExCacheEntry;
import de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe;
import de.uka.ipd.sdq.simucomframework.variables.stoexvisitor.PCMStoExEvaluationVisitor;
import de.uka.ipd.sdq.simucomframework.variables.stoexvisitor.VariableMode;
import de.uka.ipd.sdq.stoex.Expression;

public class CostUtil {
	
	/** Logger for log4j. */
	private static Logger logger = 
		Logger.getLogger("de.uka.ipd.sdq.pcm.cost.helper.CostUtil");
	
	private static final String PROCESSING_RATE_VARIABLE = "procRate.VALUE";
	private static final String NUMBER_OF_CORES_VARIABLE = "numberOfReplicas.VALUE";

	private CostStoExCache stoExCache;

	private IRandomGenerator randomGenerator;
	private IProbabilityFunctionFactory probFunctionFactory;
	
	private static CostUtil singletonInstance = null;
	
	public static CostUtil getInstance(){
		if (singletonInstance == null){
			singletonInstance = new CostUtil();
		}
		return singletonInstance;
	}
	
	private CostUtil(){
		this.randomGenerator = new SimuComDefaultRandomNumberGenerator(null);
		probFunctionFactory = ProbabilityFunctionFactoryImpl.getInstance();
		probFunctionFactory.setRandomGenerator(this.randomGenerator);
		this.stoExCache = new CostStoExCache(probFunctionFactory);
	}

	public double getDoubleFromSpecification(String specification) {
		// TODO Auto-generated method stub
		if (StoExCache.singleton() == null)
		{
			StoExCache.initialiseStoExCache(probFunctionFactory);
		}
		Object rate = StackContext.evaluateStatic(specification);
		// cannot use the following direct access to the solving visitor, as it also requires an initialised StoExCache. 
		//StoExCacheEntry entry =  new StoExCacheEntry(specification,null);
		//Object rate = new PCMStoExEvaluationVisitor(specification,new SimulatedStackframe<Object>(),VariableMode.EXCEPTION_ON_NOT_FOUND)
		//	.doSwitch(entry.getParsedExpression());
		return toDoubleOrZero(rate);
	}

	private static double toDoubleOrZero(Object number) {
		if (Double.class.isInstance(number)){
			return (Double)number;
		} else if (Integer.class.isInstance(number)){
			return ((Integer)number).doubleValue();
		}
		return 0.0;
	}
	
	public double getOperatingCost(
			VariableProcessingResourceCost varCost) {
		double functionValue = solveFunctionExpression(
				varCost,
				varCost.getProcessingRateOperatingFunction());
		double cost = varCost.getFixedOperatingCost() +  functionValue ;
		return cost;
	}


	private double solveFunctionExpression(
			VariableProcessingResourceCost varCost,
			ScalarFunction scalarFunction) {
		if (scalarFunction == null || scalarFunction.getSpecification() == ""){
			return 0.0;
		}
		double processingRate = getProcessingRate(varCost);
		int numberOfCores = getNumberOfReplicas(varCost);
		String specification = scalarFunction.getSpecification();
		SimulatedStackframe<Object> stackframe = new SimulatedStackframe<Object>();
		stackframe.addValue(PROCESSING_RATE_VARIABLE, processingRate);
		stackframe.addValue(NUMBER_OF_CORES_VARIABLE, numberOfCores);
		
		try {
			//Term parsedExpression = scalarFunction.getTerm();
			//ExpressionInferTypeVisitor typeInferer = StoExCache.singleton().getEntry(specification).getTypeInferer();
			//typeInferer.getTypeAnnotation().put(arg0, arg1)

			StoExCacheEntry stoExEntry = this.stoExCache.getEntry(specification);
			Expression parsedExpression = stoExEntry.getParsedExpression();

			PCMStoExEvaluationVisitor visitor = new PCMStoExEvaluationVisitor(stoExEntry,stackframe,VariableMode.RETURN_DEFAULT_ON_NOT_FOUND,probFunctionFactory);
			Object number = visitor.doSwitch(parsedExpression);
			return toDoubleOrZero(number);
		} catch (RuntimeException e){
			logger.warn("Error when evaluating processing rate cost function: "+e.getMessage());
			e.printStackTrace();
			return 0;
		}
	}


	public double getInitialCost(
			VariableProcessingResourceCost varCost) {
		double functionValue = solveFunctionExpression(
				varCost,
				varCost.getProcessingRateInitialFunction());
		double cost = varCost.getFixedInitialCost() +  functionValue ;
		return cost;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	private double getProcessingRate(VariableProcessingResourceCost varCost) {
		//TODO: what about longs and shorts and stuff here? 
		if ( varCost.getProcessingresourcespecification() != null 
				&& varCost.getProcessingresourcespecification().getProcessingRate_ProcessingResourceSpecification() != null 
				&& varCost.getProcessingresourcespecification().getProcessingRate_ProcessingResourceSpecification().getSpecification() != null) {
			return getDoubleFromSpecification(varCost.getProcessingresourcespecification().getProcessingRate_ProcessingResourceSpecification().getSpecification());
		} 
		return 0;
	}
	
	private int getNumberOfReplicas(VariableProcessingResourceCost varCost){
		if (varCost.getProcessingresourcespecification() != null){
			return varCost.getProcessingresourcespecification().getNumberOfReplicas();
		}
		return 0;
	}
	
	public void resetCache(){
		this.stoExCache = new CostStoExCache(probFunctionFactory);
	}

	public static double getTotalCost(Cost cost) {
		
		CostRepository costRepository = getCostRepository(cost);
		int numberOfYears = 0;
		double interest = 1.0;
		if (costRepository != null) {
			interest = costRepository.getInterest();
			numberOfYears = costRepository.getTimePeriodYears();
		}
		double operatingCost = cost.getOperatingCost();
		double initialCost = cost.getInitialCost();
		
		return getTotalCost(initialCost, operatingCost, interest, numberOfYears);
		
	}

	public static double getTotalCost(double initialCost, double operatingCost, 
			double interest, int numberOfYears) {
		double operatingCostWithInterest = 0;
		
		if (interest < 0 ){
			logger.error("Negative interest rate not supported by cost evaluator");
			return Double.NaN;
		}
		
		if (numberOfYears == 0){
			if (interest == 0 ){
				if (operatingCost > 0){
					logger.warn("Interest rate of 0, no time period, and positive operating cost lead to infinite costs over time: Setting total cost to infinity.");
					return Double.POSITIVE_INFINITY;
				} else {
					// No operating cost defined either. 
					operatingCostWithInterest = 0; 
				}
			} else {
				operatingCostWithInterest = operatingCost/interest;
			}
		} else {
			if (interest == 0){
				operatingCostWithInterest = operatingCost * numberOfYears;

			} else {
				// Ordinary annuity formula from http://en.wikipedia.org/wiki/Annuity_%28finance_theory%29 for the principal P (or present value).
				operatingCostWithInterest = operatingCost *  ((1 -  Math.pow(1 + interest, -1*numberOfYears)) / interest);
			}
		}
		return initialCost + operatingCostWithInterest;
	}

	private static CostRepository getCostRepository(EObject object) {
		
		EObject container = object.eContainer();
		
		if (container == null) {
			return null;
		} else if (container instanceof CostRepository){
			return (CostRepository) container;
		} else {
			return getCostRepository(container);
		}

	}
	
}

class CostStoExCache extends StoExCache {
	
	protected CostStoExCache(IProbabilityFunctionFactory factory){
		super(factory);
	}
	
}
