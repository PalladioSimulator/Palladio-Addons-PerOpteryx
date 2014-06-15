package de.uka.ipd.sdq.pipesandfilters.framework.recorder.sensorframework;

import java.util.Map;
import java.util.Vector;

import de.uka.ipd.sdq.pipesandfilters.framework.IMetaDataInitFactory;
import de.uka.ipd.sdq.pipesandfilters.framework.MeasurementMetric;
import de.uka.ipd.sdq.pipesandfilters.framework.MetaDataInit;
import de.uka.ipd.sdq.pipesandfilters.framework.recorder.launch.IRecorderConfiguration;

public class SensorFrameworkMetaDataInitFactory implements IMetaDataInitFactory {

    @Override
    public MetaDataInit createMetaDataInit(Vector<MeasurementMetric> measuredMetrics,
            IRecorderConfiguration recorderConfiguration) {
        return new SensorFrameworkMetaDataInit(measuredMetrics, recorderConfiguration);
    }

    @Override
    public MetaDataInit createMetaDataInit(Vector<MeasurementMetric> measuredMetrics,
            IRecorderConfiguration recorderConfiguration, Map<Integer, String> executionResultTypes) {
        return new SensorFrameworkMetaDataInit(measuredMetrics, recorderConfiguration, executionResultTypes);
    }

}
