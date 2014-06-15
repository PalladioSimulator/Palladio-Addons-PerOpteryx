package de.uka.ipd.sdq.pipesandfilters.framework.recorder.sensorframework;

import java.util.Map;
import java.util.Vector;

import de.uka.ipd.sdq.pipesandfilters.framework.MeasurementMetric;
import de.uka.ipd.sdq.pipesandfilters.framework.MetaDataInit;
import de.uka.ipd.sdq.pipesandfilters.framework.recorder.launch.IRecorderConfiguration;

public class SensorFrameworkMetaDataInit extends MetaDataInit {

	private boolean isRemoteRun;	
    
	public SensorFrameworkMetaDataInit(
			Vector<MeasurementMetric> measuredMetrics,
			IRecorderConfiguration recorderConfiguration) {
		super(measuredMetrics, recorderConfiguration);
	}	

	public SensorFrameworkMetaDataInit(Vector<MeasurementMetric> measuredMetrics,
            IRecorderConfiguration recorderConfiguration, Map<Integer, String> executionResultTypes) {
	    super(measuredMetrics, recorderConfiguration, executionResultTypes);
    }

    public boolean isRemoteRun() {
		return isRemoteRun;
	}

	// TODO This should be called from somewhere. Or move it to
	// SensorFrameworkRecorderConfig?
	public void setRemoteRun(boolean isRemoteRun) {
		this.isRemoteRun = isRemoteRun;
	}

}
