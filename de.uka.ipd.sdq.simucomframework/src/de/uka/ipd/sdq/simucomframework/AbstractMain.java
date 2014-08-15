package de.uka.ipd.sdq.simucomframework;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory;
import org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint;
import org.palladiosimulator.probeframework.calculator.Calculator;
import org.palladiosimulator.probeframework.probes.EventProbeList;
import org.palladiosimulator.probeframework.probes.TriggeredProbe;

import de.uka.ipd.sdq.errorhandling.dialogs.issues.DisplayIssuesDialog;
import de.uka.ipd.sdq.simucomframework.model.SimuComModel;
import de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe;
import de.uka.ipd.sdq.simucomframework.resources.IResourceContainerFactory;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimuComStatus;
import de.uka.ipd.sdq.simucomframework.simucomstatus.SimucomstatusFactory;
import de.uka.ipd.sdq.simucomframework.usage.IUserFactory;
import de.uka.ipd.sdq.simucomframework.usage.IWorkloadDriver;
import de.uka.ipd.sdq.simulation.AbstractSimulationConfig;
import de.uka.ipd.sdq.simulation.ISimulationControl;
import de.uka.ipd.sdq.simulation.ISimulationListener;
import de.uka.ipd.sdq.simulation.IStatusObserver;
import de.uka.ipd.sdq.simulation.SimulationResult;
import de.uka.ipd.sdq.simulation.abstractsimengine.ISimEngineFactory;
import de.uka.ipd.sdq.simulation.preferences.SimulationPreferencesHelper;

/**
 * Base class for simulation instances. It contains a generic simulation start and stop logic as
 * well as basic error handling mechanisms.
 * 
 * The code generated for each SimuCom instance contains the class main.SimuComControl that inherits
 * from this one and provides the missing information.
 * 
 * Excerpt from main.SimuComControl: public class SimuComControl extends
 * de.uka.ipd.sdq.simucomframework.AbstractMain
 * 
 * TODO This class currently serves too many concerns, e.g., creation of execution result
 * calculators and mixing of usage response time calculator creation and handling of stop
 * conditions. Therefore, some refactorings are needed. [Lehrig]
 * 
 * @author Steffen Becker, Sebastian Lehrig
 */
public abstract class AbstractMain implements ISimulationControl, BundleActivator {

    /** This class' LOGGER */
    private static final Logger LOGGER = Logger.getLogger(AbstractMain.class.getName());

    /**
     * Service registry entry for registering this object in Eclipse's service registry where it can
     * be found by the simulation runner
     */
    private ServiceRegistration<ISimulationControl> serviceRegistryEntry;

    /** The simucom model to be simulated */
    private SimuComModel model;

    /** The simucom status EMF model instance which tracks simulation status for debugging */
    private SimuComStatus simuComStatus;

    /** Default EMF factory for measuring points. */
    private final MeasuringpointFactory measuringpointFactory = MeasuringpointFactory.eINSTANCE;

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext )
     */
    @Override
    public void start(final BundleContext context) throws Exception {
        // register the service
        serviceRegistryEntry = context.registerService(ISimulationControl.class, this,
                new Hashtable<String, ISimulationControl>());
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(final org.osgi.framework.BundleContext context) throws Exception {
        serviceRegistryEntry.unregister();
    }

    /**
     * Run a simulation using the given configuration and report to the given observer
     * 
     * @param statusObserver
     *            Observer to notify about the simulation's progress
     * @param config
     *            Configuration options for the simulation
     * @param isRemoteRun
     *            True if this simulation runs remotely and has no access to the local
     *            sensorframework
     * @return A status code indicating success or failure of the simulation
     */
    protected SimulationResult run(final IStatusObserver statusObserver, final SimuComConfig config,
            final boolean isRemoteRun) {

        if (LOGGER.isEnabledFor(Level.INFO)) {
            LOGGER.info("Starting Simulation");
            LOGGER.info("Simulation engine used: " + model.getSimulationControl().getClass().getSimpleName());
        }

        model.getConfiguration().addListener(new ISimulationListener() {

            @Override
            public void simulationStop() {
                model.getProbeFrameworkContext().finish();
                model.getConfiguration().getRecorderConfigurationFactory().finalizeRecorderConfigurationFactory();
            }

            @Override
            public void simulationStart() {
            }
        });

        model.getSimulationControl().addTimeObserver(new Observer() {

            @Override
            public void update(final Observable clock, final Object data) {
                final int timePercent = config.getSimuTime() < 0 ? 0 : (int) (model.getSimulationControl()
                        .getCurrentSimulationTime() * 100 / config.getSimuTime());
                final int measurementsPercent = (int) (model.getMainMeasurementsCount() * 100 / model
                        .getConfiguration().getMaxMeasurementsCount());
                statusObserver.updateStatus(timePercent < measurementsPercent ? measurementsPercent : timePercent,
                        model.getSimulationControl().getCurrentSimulationTime(), model.getMainMeasurementsCount());
            }

        });
        getStatus().setCurrentSimulationTime(0);
        final double simRealTime = ExperimentRunner.run(model);
        if (model.getIssues().size() > 0) {
            if (LOGGER.isEnabledFor(Level.INFO)) {
                LOGGER.info(model.getIssues().size() + " issues experience during the simulation run.");
            }
            final DisplayIssuesDialog runner = new DisplayIssuesDialog(model.getIssues());
            DisplayIssuesDialog.showDialogSync(runner);
        }

        if (LOGGER.isEnabledFor(Level.INFO)) {
            LOGGER.info("Simulation stopped. It took " + (simRealTime / Math.pow(10, 9))
                    + " seconds real time to terminate");
        }
        model.getConfiguration().disposeRandomGenerator();
        return model.getErrorStatus();
    }

    /**
     * Request a simulation stop
     */
    protected void stop() {
        model.getSimulationControl().stop();
    }

    /**
     * @return The simucom model used in this simulation run
     */
    public SimuComModel getModel() {
        return model;
    }

    /**
     * @return An error object in case an exception occurred during simulation execution
     */
    @Override
    public Throwable getErrorThrowable() {
        return model.getErrorThrowable();
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.simucomframework.ISimuComControl#startSimulation(de.uka
     * .ipd.sdq.simucomframework.SimuComConfig, de.uka.ipd.sdq.simucomframework.IStatusObserver,
     * boolean)
     */
    @Override
    public void prepareSimulation(final AbstractSimulationConfig config, final IStatusObserver observer,
            final boolean isRemoteRun) {
        // load factory for the preferred simulation engine
        final ISimEngineFactory factory = SimulationPreferencesHelper.getPreferredSimulationEngine();
        if (factory == null) {
            throw new RuntimeException("There is no simulation engine available. Install at least one engine.");
        }

        // create simulation model
        model = new SimuComModel((SimuComConfig) config, getStatus(), factory, isRemoteRun);

        // initialse simulation model
        model.initialiseResourceContainer(getResourceContainerFactory());

        // configure workload drivers (usage scenarios)
        final IWorkloadDriver[] workloadDrivers = getWorkloads((SimuComConfig) config);
        attachUsageResponseTimeCalculators(workloadDrivers);
        model.setUsageScenarios(workloadDrivers);

        // Add execution results calculator
        if (model.getConfiguration().getSimulateFailures()) {
            final StringMeasuringPoint mp = this.measuringpointFactory.createStringMeasuringPoint();
            mp.setMeasuringPoint("System execution results");

            model.getProbeFrameworkContext()
            .getCalculatorFactory()
            .buildExecutionResultCalculator(
                    mp,
                    new EventProbeList(model.getFailureStatistics().getExecutionResultProbe(), Arrays
                            .asList((TriggeredProbe) new TakeCurrentSimulationTimeProbe(this.model
                                    .getSimulationControl()))));
        }
    }

    private void attachUsageResponseTimeCalculators(final IWorkloadDriver[] workloadDrivers) {
        for (final IWorkloadDriver driver : workloadDrivers) {
            final IUserFactory userFactory = driver.getUserFactory();
            final Calculator calculator = userFactory.attachResponseTimeCalculator();
            if (ExperimentRunner.confidenceStopCondition != null) {
                calculator.addObserver(ExperimentRunner.confidenceStopCondition); // FIXME find
                // right place for
                // this
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.simucomframework.ISimuComControl#startSimulation(de.uka
     * .ipd.sdq.simucomframework.SimuComConfig, de.uka.ipd.sdq.simucomframework.IStatusObserver,
     * boolean)
     */
    @Override
    public de.uka.ipd.sdq.simulation.SimulationResult startSimulation(final AbstractSimulationConfig config,
            final IStatusObserver observer, final boolean isRemoteRun) {
        return run(observer, (SimuComConfig) config, isRemoteRun);
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.simucomframework.ISimuComControl#stopSimulation()
     */
    @Override
    public void stopSimulation() {
        stop();
    }

    /**
     * Template method pattern. Child classes have to implement this to return workload drivers to
     * use in the simulation. The workload drivers are used to generate the simulated users.
     * 
     * @param config
     *            the simulation configuration data
     * @return Workload drivers to use in the simulation run
     */
    protected abstract IWorkloadDriver[] getWorkloads(SimuComConfig config);

    /**
     * Template method to return a factory which can be used to instanciate the simulated resource
     * environment.
     * 
     * @return A factory which is used to create the simulated resource environment
     */
    protected abstract IResourceContainerFactory getResourceContainerFactory();

    /*
     * (non-Javadoc)
     * 
     * @see de.uka.ipd.sdq.simucomframework.ISimuComControl#getStatus()
     */
    @Override
    public SimuComStatus getStatus() {
        if (this.simuComStatus == null) {
            this.simuComStatus = SimucomstatusFactory.eINSTANCE.createSimuComStatus();
            this.simuComStatus.setProcessStatus(SimucomstatusFactory.eINSTANCE.createSimulatedProcesses());
            this.simuComStatus.setResourceStatus(SimucomstatusFactory.eINSTANCE.createSimulatedResources());
        }
        return this.simuComStatus;
    }
}
