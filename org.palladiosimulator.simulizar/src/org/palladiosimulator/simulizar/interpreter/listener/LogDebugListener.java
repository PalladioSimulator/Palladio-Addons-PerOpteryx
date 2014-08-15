/**
 * 
 */
package org.palladiosimulator.simulizar.interpreter.listener;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.pcm.seff.ExternalCallAction;
import de.uka.ipd.sdq.pcm.usagemodel.EntryLevelSystemCall;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;

/**
 * @author snowball
 * 
 */
public class LogDebugListener extends AbstractInterpreterListener {
    private static final Logger LOGGER = Logger.getLogger(LogDebugListener.class);

    /**
	 * 
	 */
    public LogDebugListener() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.upb.pcm.interpreter.interpreter.listener.IInterpreterListener#beginUsageScenarioInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void beginUsageScenarioInterpretation(final ModelElementPassedEvent<UsageScenario> event) {
        this.logEvent(event);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.upb.pcm.interpreter.interpreter.listener.IInterpreterListener#endUsageScenarioInterpretation
     * (de.upb.pcm.interpreter.interpreter.listener.ModelElementPassedEvent)
     */
    @Override
    public void endUsageScenarioInterpretation(final ModelElementPassedEvent<UsageScenario> event) {
        this.logEvent(event);
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
        this.logEvent(event);
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
        this.logEvent(event);
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
        this.logEvent(event);
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
        this.logEvent(event);
    }

    @Override
    public <T extends EObject> void beginUnknownElementInterpretation(ModelElementPassedEvent<T> event) {
        this.logEvent(event);
    }

    @Override
    public <T extends EObject> void endUnknownElementInterpretation(ModelElementPassedEvent<T> event) {
        this.logEvent(event);
    }

    private <T extends EObject> void logEvent(final ModelElementPassedEvent<T> event) {
        if (LOGGER.isDebugEnabled()) {
            final StringBuilder msgBuilder = new StringBuilder();
            switch (event.getEventType()) {
            case BEGIN:
                msgBuilder.append("Starting to interpret ");
                break;
            case END:
                msgBuilder.append("Finished interpreting ");
            default:
                msgBuilder.append("Unknown event ");
                break;
            }
            msgBuilder.append(event.getModelElement().eClass().getName());
            msgBuilder.append(" in Simuation Thread \"");
            msgBuilder.append(event.getThread().getId());
            msgBuilder.append("\" at simulation time ");
            msgBuilder.append(event.getPassageTime());
            LOGGER.debug(msgBuilder.toString());
        }
    }

    @Override
    public void reconfigurationInterpretation(ReconfigurationEvent event) {
        final StringBuilder msgBuilder = new StringBuilder();
        msgBuilder.append("Reconfiguration ");
        msgBuilder.append(" at simulation time ");
        msgBuilder.append(event.getPassageTime());
        LOGGER.debug(msgBuilder.toString());
    }

}
