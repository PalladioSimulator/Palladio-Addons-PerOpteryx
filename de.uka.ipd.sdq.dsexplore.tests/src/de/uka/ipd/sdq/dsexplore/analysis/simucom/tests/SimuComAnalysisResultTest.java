package de.uka.ipd.sdq.dsexplore.analysis.simucom.tests;

import java.util.Properties;

import junit.framework.TestCase;

import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.simucom.SimuComAnalysisSensorFrameworkResult;
import de.uka.ipd.sdq.sensorframework.dao.file.entities.ExperimentImpl;
import de.uka.ipd.sdq.sensorframework.dao.file.entities.ExperimentRunImpl;
import de.uka.ipd.sdq.sensorframework.entities.Experiment;
import de.uka.ipd.sdq.sensorframework.entities.ExperimentRun;

public class SimuComAnalysisResultTest extends TestCase {

    private SimuComAnalysisResult scr;

    public SimuComAnalysisResultTest(final String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        final ExperimentRun run = new ExperimentRunImpl(null);
        final Properties config = new Properties();
        final PCMInstance pcmInstance = new PCMInstance(config);
        final Experiment exp = new ExperimentImpl(null);

        //FIXME: add proper params
        //scr = new SimuComAnalysisSensorFrameworkResult(run, exp, pcmInstance, null, null, null);

    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGetUtilisationOfResource() {
        //scr.getUtilisationOfResource(null, null);
        fail("Not yet implemented");
    }

}


