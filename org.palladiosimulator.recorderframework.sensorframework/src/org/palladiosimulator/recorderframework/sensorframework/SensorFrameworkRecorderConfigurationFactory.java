package org.palladiosimulator.recorderframework.sensorframework;

import java.util.HashMap;
import java.util.Map;

import org.palladiosimulator.recorderframework.AbstractRecorderConfigurationFactory;
import org.palladiosimulator.recorderframework.IRecorderConfigurationFactory;

import de.uka.ipd.sdq.sensorframework.SensorFrameworkDataset;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;
import de.uka.ipd.sdq.sensorframework.entities.dao.IDAOFactory;

public class SensorFrameworkRecorderConfigurationFactory extends AbstractRecorderConfigurationFactory implements
IRecorderConfigurationFactory {

    public static final String DATASOURCE_ID = "datasourceID";
    private long datasourceID;

    private IDAOFactory daoFactory;
    private Experiment experiment;
    private ExperimentRun run;

    @Override
    public void initialize(final Map<String, Object> configuration) {
        super.initialize(configuration);
        this.datasourceID = getValue(configuration, DATASOURCE_ID, Integer.class);

        initialiseNewSensorframework();
    }

    @Override
    public SensorFrameworkRecorderConfiguration createRecorderConfiguration(final Map<String, Object> configuration) {
        final SensorFrameworkRecorderConfiguration result = new SensorFrameworkRecorderConfiguration();
        final Map<String,Object> newConfiguration = new HashMap<String, Object>();
        newConfiguration.putAll(configuration);
        newConfiguration.put(SensorFrameworkRecorderConfiguration.DAO_FACTORY, daoFactory);
        newConfiguration.put(SensorFrameworkRecorderConfiguration.EXPERIMENT, experiment);
        newConfiguration.put(SensorFrameworkRecorderConfiguration.RUN, run);
        result.setConfiguration(newConfiguration);

        return result;
    }

    public long getDatasourceID() {
        return this.datasourceID;
    }

    private void initialiseNewSensorframework() {
        // Obtain DAOFactory
        daoFactory = SensorFrameworkDataset.singleton().getDataSourceByID(this.getDatasourceID());
        if (daoFactory == null) {
            throw new DatasourceConfigurationInvalidException();
        }

        // Find an existing or create a new Experiment
        if (daoFactory.createExperimentDAO().findByExperimentName(getExperimentName()).size() == 1) {
            experiment = daoFactory.createExperimentDAO().findByExperimentName(getExperimentName()).iterator().next();
        } else {
            experiment = daoFactory.createExperimentDAO().addExperiment(getExperimentName());
        }

        // Find an existing or create a new ExperimentRun
        for (final ExperimentRun r : experiment.getExperimentRuns()) {
            if (r.getExperimentDateTime().equals(getExperimentRunName())) {
                run = r;
            }
        }
        if (run == null) {
            run = experiment.addExperimentRun(getExperimentRunName());
        }
    }

    @Override
    public void finalizeRecorderConfigurationFactory() {
        daoFactory.finalizeAndClose();
    }
}
