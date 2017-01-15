package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation;

import org.junit.Before;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.ConcernRepository;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.test.util.ConcernWeavingTestUtil;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util.ExperimentUtil;

public abstract class ExperimentConfiguration {

	protected final static String DETECTION_ECC_NAME = "Detection";
	protected final static String ANALYSIS_ECC_NAME = "Analysis";
	protected final static String RESPONSE_ECC_NAME = "Response";
	protected final static String MEDIA_MANAGEMENT_PACKAGING_ASSEMBLY_CONNECTOR_ID = "_hWBckHD5EeSA4fySuX9I2Q";
	protected final static String MEDIA_ACCESS_FILE_STORAGE_ASSEMBLY_CONNECTOR_ID = "_3zCRMLg_EeSNPorBlo7x9g";
	protected final static String WEB_GUI_DELEGATION_CONNECTOR_ID = "_wVTYoJelEeajsMFpiDxCKw";
	protected final static String AFFECTED_SIGNATURE_ZIP_ID_IPACKAGING_INTERFACE = "_ydHhYHDuEeSqnN80MQ2uGw";
	protected final static String AFFECTED_SIGNATURE_GETFILES_ID_IFILESTORAGE_INTERFACE = "_lLuUoLg7EeSNPorBlo7x9g";
	protected final static String AFFECTED_SIGNATURE_UPLOAD_ID_IMEDIAMANAGEMENT = "_Qa8AAHDvEeSqnN80MQ2uGw";
	protected final static String AFFECTED_SIGNATURE_DOWNLOAD_ID_IMEDIAMANAGEMENT = "_Q_yZgHDvEeSqnN80MQ2uGw";
	protected final static String AFFECTED_SIGNATURE_GETFILELIST_ID_IMEDIAMANAGEMENT = "_Rv19cHDvEeSqnN80MQ2uGw";
	protected final static String RESOURCE_CONTAINER_SERVER_1_ID = "_t8rcYHlPEeSGtbTG2d9Ipg";
	protected final static String ADAPTER_NAME = "Adapter";
	
	protected Repository concernRepository; 
	protected PCMInstance pcmToAdapt;
	protected Transformation adapterTransformation;
	protected ConcernRepository concern;
	
	@Before
	public void setUp() {
		
		ConcernWeavingTestUtil.registerFactories();
		
		pcmToAdapt = ExperimentUtil.loadPCM();
		concernRepository = ConcernWeavingTestUtil.loadConcernRealization();
        concern = ConcernWeavingTestUtil.loadConcernRepository();
		adapterTransformation = ExperimentUtil.createAdapterTransformationStrategy(ADAPTER_NAME);
        
	}

}
