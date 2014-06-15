package org.palladiosimulator.simulizar.utils;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.simulizar.pms.MeasurementSpecification;

import de.uka.ipd.sdq.probespec.framework.ISampleBlackboard;
import de.uka.ipd.sdq.probespec.framework.ProbeSample;
import de.uka.ipd.sdq.probespec.framework.ProbeSetSample;
import de.uka.ipd.sdq.probespec.framework.ProbeSpecContext;
import de.uka.ipd.sdq.probespec.framework.ProbeType;
import de.uka.ipd.sdq.probespec.framework.calculator.Calculator;
import de.uka.ipd.sdq.probespec.framework.calculator.CalculatorRegistry;
import de.uka.ipd.sdq.probespec.framework.calculator.ICalculatorFactory;
import de.uka.ipd.sdq.probespec.framework.calculator.ResponseTimeCalculator;
import de.uka.ipd.sdq.probespec.framework.calculator.SLOViolationsCalculator;
import de.uka.ipd.sdq.probespec.framework.probes.IProbeStrategy;
import de.uka.ipd.sdq.probespec.framework.utils.ProbeSpecUtils;
import de.uka.ipd.sdq.simucomframework.SimuComSimProcess;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * Util for the Probe Specification Framework.
 * 
 * @author Joachim Meyer
 * 
 */
public class PCMInterpreterProbeSpecUtil {
    protected static final Logger logger = Logger.getLogger(PCMInterpreterProbeSpecUtil.class.getName());

    final ProbeSpecContext probeSpecContext;
    final ISampleBlackboard blackboard;

    private final SimuComModel simuComModel;

    /**
     * Constructor
     * 
     * @param modelHelper
     *            the model helper.
     */
    public PCMInterpreterProbeSpecUtil(final SimuComModel simuComModel) {
        super();
        this.simuComModel = simuComModel;
        this.probeSpecContext = simuComModel.getProbeSpecContext();
        this.blackboard = this.probeSpecContext.getSampleBlackboard();
    }

    /**
     * Creates a response time calculator in the probe specification framework.
     * 
     * @param startProbeId
     *            id of the start probe.
     * @param stopProbeId
     *            id of the stop probe.
     * @param measurementId
     *            id of this measurement.
     * @param calculatorName
     *            name of the response time calculator
     * @param measurementSpecification
     *            the corresponding measurement specification from the pms model.
     * @param pcmElement
     *            the pcm element to be measured.
     * @param simuComModel
     *            the SimuCom model.
     * @return the created calculator, null if calculator already exists.
     */
    public Calculator createResponseTimeCalculator(final String startProbeId, final String stopProbeId,
            final String measurementId, final String calculatorName,
            final MeasurementSpecification measurementSpecification, final EObject pcmElement,
            final SimuComModel simuComModel) {

        ResponseTimeCalculator responseTimeCalculator = null;
        final CalculatorRegistry calculatorRegistry = this.probeSpecContext.getCalculatorRegistry();
        // only register each calculator once
         //if ( calculatorRegistry.checkresponseTimeCalculator(measurementId,"ResponseTime") == null) {
        if (!calculatorRegistry.getResponseTimeCalculators().containsKey(measurementId)) {
            final ICalculatorFactory calculatorFactory = this.probeSpecContext.getCalculatorFactory();

            final Calculator responseCalculator = calculatorFactory.buildResponseTimeCalculator(calculatorName,
                    this.probeSpecContext.obtainProbeSetId(startProbeId),
                    this.probeSpecContext.obtainProbeSetId(stopProbeId));

            

            if (logger.isDebugEnabled()) {
                logger.debug("Created Response Time Calculator. StartProbeId: " + startProbeId
                    + ", StopProbeId: " + stopProbeId);
            }
            
            responseTimeCalculator = (ResponseTimeCalculator) calculatorRegistry.registerResponseTimeCalculator(measurementId, responseCalculator);
            // get created calculator
           // responseTimeCalculator = (ResponseTimeCalculator) calculatorRegistry.getCalculatorForId(measurementId);
            //responseTimeCalculator = (ResponseTimeCalculator) calculatorRegistry.checkresponseTimeCalculator(measurementId,"ResponseTime");

            return responseTimeCalculator;
        } 
        return null;
    }
    
    public Calculator createSLOViolationCalculator(final String startProbeId, final String stopProbeId,
            final String measurementId, final String calculatorName,
            final MeasurementSpecification measurementSpecification, final EObject pcmElement,
            final SimuComModel simuComModel) {

    	SLOViolationsCalculator sloViolationCalculator = null;
        final CalculatorRegistry calculatorRegistry = this.probeSpecContext.getCalculatorRegistry();
        // only register each calculator once
       
       // if ( calculatorRegistry.checkresponseTimeCalculator(measurementId,"SLOViolations") == null) {
        //if (calculatorRegistry.getCalculatorForId(measurementId) == null) {
        if (!calculatorRegistry.getsloViolationsCalculators().containsKey(measurementId)) {
            final ICalculatorFactory calculatorFactory = this.probeSpecContext.getCalculatorFactory();

            final Calculator sloCalculator = calculatorFactory.buildSLOViolationsCalculator(calculatorName,
                    this.probeSpecContext.obtainProbeSetId(startProbeId),
                    this.probeSpecContext.obtainProbeSetId(stopProbeId));

           

            if (logger.isDebugEnabled()) {
                logger.debug("Created SLO violation calculator. StartProbeId: " + startProbeId
                    + ", StopProbeId: " + stopProbeId);
            }
            
            // get created calculator
            sloViolationCalculator = (SLOViolationsCalculator)  calculatorRegistry.registerSloviolationsCalculator(measurementId, sloCalculator);
           // sloViolationCalculator = (SLOViolationsCalculator) calculatorRegistry.getCalculatorForId(measurementId);
           // sloViolationCalculator = (SLOViolationsCalculator) calculatorRegistry.checkSLOViolationsCalculator(measurementId,"SLOViolations");

            return sloViolationCalculator;
        }
        return null;
    }
    /**
     * @return returns the blackboard.
     */
    private ISampleBlackboard getBlackboard() {
        return this.blackboard;
    }

    /**
     * Takes current time sample.
     * 
     * @param probeID
     *            the start or stop probe id.
     * @param measurementId
     *            id of the measurement.
     * @param simProcess
     *            the sim process.
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void takeCurrentTimeSample(final String probeID, final String measurementId,
            final SimuComSimProcess simProcess) {
        final IProbeStrategy timeStrategy = this.probeSpecContext.getProbeStrategyRegistry().getProbeStrategy(
                ProbeType.CURRENT_TIME, null);

        final ProbeSample probeSample = timeStrategy.takeSample(probeID, this.simuComModel.getSimulationControl());

        final ProbeSetSample probeSampleSet = ProbeSpecUtils.buildProbeSetSample(probeSample,
                simProcess.getRequestContext(), measurementId, this.probeSpecContext.obtainProbeSetId(probeID));

        if (logger.isDebugEnabled()) {
            logger.debug("Took probe " + probeID + " of " + measurementId);
        }

        this.getBlackboard().addSample(probeSampleSet);
    }

    public ProbeSpecContext getProbeSpecContext() {
        return this.probeSpecContext;
    }

}
