/**
 * 
 */
package org.palladiosimulator.simulizar.interpreter.listener;

import javax.activation.UnsupportedDataTypeException;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.simulizar.access.IModelAccessFactory;
import org.palladiosimulator.simulizar.access.PMSAccess;
import org.palladiosimulator.simulizar.access.PRMAccess;
import org.palladiosimulator.simulizar.metrics.aggregators.ResponseTimeAggregator;
import org.palladiosimulator.simulizar.metrics.aggregators.SLOViolationsCollector;
import org.palladiosimulator.simulizar.pms.MeasurementSpecification;
import org.palladiosimulator.simulizar.pms.PerformanceMetricEnum;
import org.palladiosimulator.simulizar.prm.PrmFactory;
import org.palladiosimulator.simulizar.utils.PCMInterpreterProbeSpecUtil;

import de.uka.ipd.sdq.pcm.core.entity.Entity;
import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;
import de.uka.ipd.sdq.probespec.framework.calculator.Calculator;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;

/**
 * @author snowball
 * 
 */
public class ProbeSpecListener extends AbstractInterpreterListener {

    private static final String END_PROBE_MARKER = "_resp2";
    private static final String START_PROBE_MARKER = "_resp1";
    private final PMSAccess pmsModelAccess;
    private final PRMAccess prmAccess;
    private final PCMInterpreterProbeSpecUtil pcmInterpreterProbeSpecUtil;
    private final static Logger logger = Logger.getLogger(ProbeSpecListener.class);

    /**
	 * 
	 */
    public ProbeSpecListener(final IModelAccessFactory modelAccessFactory, final SimuComModel simuComModel) {
        super();
        this.pmsModelAccess = modelAccessFactory.getPMSModelAccess();
        this.prmAccess = modelAccessFactory.getPRMModelAccess();
        this.pcmInterpreterProbeSpecUtil = new PCMInterpreterProbeSpecUtil(simuComModel);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.upb.pcm.interpreter.interpreter.listener.AbstractInterpreterListener#
     * beginUsageScenarioInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginUsageScenarioInterpretation(final ModelElementPassedEvent<UsageScenario> event) {
        this.startMeasurement(event);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.upb.pcm.interpreter.interpreter.listener.AbstractInterpreterListener#
     * endUsageScenarioInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endUsageScenarioInterpretation(final ModelElementPassedEvent<UsageScenario> event) {
        this.endMeasurement(event);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.upb.pcm.interpreter.interpreter.listener.AbstractInterpreterListener#
     * beginEntryLevelSystemCallInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginEntryLevelSystemCallInterpretation(final ModelElementPassedEvent<EntryLevelSystemCall> event) {
        this.startMeasurement(event);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.upb.pcm.interpreter.interpreter.listener.AbstractInterpreterListener#
     * endEntryLevelSystemCallInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endEntryLevelSystemCallInterpretation(final ModelElementPassedEvent<EntryLevelSystemCall> event) {
        this.endMeasurement(event);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.upb.pcm.simulizar.interpreter.listener.AbstractInterpreterListener#
     * beginExternalCallInterpretation
     * (de.upb.pcm.simulizar.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginExternalCallInterpretation(final RDSEFFElementPassedEvent<ExternalCallAction> event) {
        this.startMeasurement(event);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.upb.pcm.simulizar.interpreter.listener.AbstractInterpreterListener#
     * endExternalCallInterpretation
     * (de.upb.pcm.simulizar.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endExternalCallInterpretation(final RDSEFFElementPassedEvent<ExternalCallAction> event) {
        this.endMeasurement(event);
    }

    /**
     * Initializes response time measurement.
     * 
     * @param modelElement
     *            the model element to be measured.
     * @param calculatorName
     *            the name of the response time calculator.
     * @param startProbeId
     *            start probe id.
     * @param stopProbeId
     *            stop probe id.
     */
    private void initReponseTimeMeasurement(final EObject modelElement, final String calculatorName,
            final String startProbeId, final String stopProbeId, final SimuComModel simuComModel) {
        final MeasurementSpecification measurementSpecification = this.pmsModelAccess.isMonitored(modelElement,
                PerformanceMetricEnum.RESPONSE_TIME);
        if (measurementSpecification != null) {

            final Calculator calculator = this.pcmInterpreterProbeSpecUtil.createResponseTimeCalculator(startProbeId,
                    stopProbeId, calculatorName, calculatorName, measurementSpecification, modelElement, simuComModel);
            final Calculator sloViolationscalculator = this.pcmInterpreterProbeSpecUtil.createSLOViolationCalculator(startProbeId,
                    stopProbeId, calculatorName, calculatorName, measurementSpecification, modelElement, simuComModel);

            if (calculatorWasCreated(calculator) ) {
                try {
                    new ResponseTimeAggregator(this.prmAccess, measurementSpecification, calculator, calculatorName,
                            modelElement, PrmFactory.eINSTANCE.createPCMModelElementMeasurement(), simuComModel
                                    .getSimulationControl().getCurrentSimulationTime());
                    new SLOViolationsCollector(sloViolationscalculator);
                    
                } catch (final UnsupportedDataTypeException e) {
                    logger.error(e);
                    throw new RuntimeException(e);
                }
            }
        }
    }
    
    
  
    


    /**
     * @param calculator
     * @return
     */
    private boolean calculatorWasCreated(final Calculator calculator) {
        return calculator != null;
    }

    /**
     * @param <T>
     * @param event
     */
    private <T extends Entity> void startMeasurement(final ModelElementPassedEvent<T> event) {
        final String calculatorName = this.getCalculatorName(event);
        final String startProbeID = calculatorName + START_PROBE_MARKER;
        final String stopProbeID = calculatorName + END_PROBE_MARKER;

        this.initReponseTimeMeasurement(event.getModelElement(), calculatorName, startProbeID, stopProbeID, event
                .getThread().getModel());

        this.pcmInterpreterProbeSpecUtil.takeCurrentTimeSample(startProbeID, calculatorName, event.getThread());
    }

    /**
     * @param event
     */
    private <T extends Entity> void endMeasurement(final ModelElementPassedEvent<T> event) {
        final String calculatorName = this.getCalculatorName(event);
        final String stopProbeID = calculatorName + END_PROBE_MARKER;

        this.pcmInterpreterProbeSpecUtil.takeCurrentTimeSample(stopProbeID, calculatorName, event.getThread());
    }

    /**
     * @param event
     * @return
     */
    private <T extends Entity> String getCalculatorName(final ModelElementPassedEvent<T> event) {
        final Entity entity = event.getModelElement();
        final StringBuilder sb = new StringBuilder();

        sb.append(entity.eClass().getName());
        sb.append(" >");
        sb.append(entity.getEntityName());
        sb.append(" (ID: ");
        sb.append(entity.getId());
        if (event instanceof RDSEFFElementPassedEvent) {
            final RDSEFFElementPassedEvent<T> rdseffEvent = (RDSEFFElementPassedEvent<T>) event;
            sb.append(", AssCtx: ");
            sb.append(rdseffEvent.getAssemblyContext().getId());
        }
        sb.append(" )<");

        return sb.toString();
    }
}
