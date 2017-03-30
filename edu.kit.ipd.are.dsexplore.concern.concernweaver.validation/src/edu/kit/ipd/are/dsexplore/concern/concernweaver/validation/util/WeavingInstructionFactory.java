package edu.kit.ipd.are.dsexplore.concern.concernweaver.validation.util;

import java.util.Arrays;
import java.util.List;

import org.palladiosimulator.pcm.core.composition.AssemblyConnector;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.ProvidedDelegationConnector;
import org.palladiosimulator.pcm.repository.ProvidedRole;
import org.palladiosimulator.pcm.repository.Repository;
import org.palladiosimulator.pcm.repository.Signature;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.solver.models.PCMInstance;

import ConcernModel.ConcernRepository;
import ConcernModel.ElementaryConcernComponent;
import TransformationModel.Transformation;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingInstruction;
import edu.kit.ipd.are.dsexplore.concern.concernweaver.WeavingLocation;
import edu.kit.ipd.are.dsexplore.concern.exception.ConcernWeavingException;
import edu.kit.ipd.are.dsexplore.concern.handler.ECCFeatureHandler;
import edu.kit.ipd.are.dsexplore.concern.util.Pair;
import edu.kit.ipd.are.dsexplore.concern.util.WeavingInstructionBuilder;

public class WeavingInstructionFactory {

	private final static String DETECTION_ECC_NAME = "Detection";
	private final static String ANALYSIS_ECC_NAME = "Analysis";
	private final static String MEDIA_MANAGEMENT_PACKAGING_ASSEMBLY_CONNECTOR_ID = "_hWBckHD5EeSA4fySuX9I2Q";
	private final static String MEDIA_ACCESS_FILE_STORAGE_ASSEMBLY_CONNECTOR_ID = "_3zCRMLg_EeSNPorBlo7x9g";
	private final static String WEB_GUI_DELEGATION_CONNECTOR_ID = "_wVTYoJelEeajsMFpiDxCKw";
	private final static String AFFECTED_SIGNATURE_ZIP_ID_IPACKAGING_INTERFACE = "_ydHhYHDuEeSqnN80MQ2uGw";
	private final static String AFFECTED_SIGNATURE_GETFILES_ID_IFILESTORAGE_INTERFACE = "_lLuUoLg7EeSNPorBlo7x9g";
	private final static String AFFECTED_SIGNATURE_STOREFILES_ID_IFILESTORAGE_INTERFACE = "_ZlS-sL0KEeSAHuL4ItXOLQ";
	private final static String AFFECTED_SIGNATURE_UPLOAD_ID_IMEDIAMANAGEMENT = "_Qa8AAHDvEeSqnN80MQ2uGw";
	private final static String AFFECTED_SIGNATURE_DOWNLOAD_ID_IMEDIAMANAGEMENT = "_Q_yZgHDvEeSqnN80MQ2uGw";
	private final static String AFFECTED_SIGNATURE_GETFILELIST_ID_IMEDIAMANAGEMENT = "_Rv19cHDvEeSqnN80MQ2uGw";
	private final static String RESOURCE_CONTAINER_SERVER_1_ID = "_t8rcYHlPEeSGtbTG2d9Ipg";
	private final static String ADAPTER_NAME = "Adapter";
	
	private PCMInstance pcm = null;
	private ConcernRepository concernRepository = null;
	private Repository concernSolution;
	private boolean isMultiple = false;
	
	private static WeavingInstructionFactory eInstance = null;
	
	private WeavingInstructionFactory() {
		
	}
	
	public static WeavingInstructionFactory getBy(PCMInstance pcm, ConcernRepository concernRepository, Repository concernSolution) {
		
		if (eInstance == null) {
			
			eInstance = new WeavingInstructionFactory();
			
		}
		
		eInstance.pcm = pcm;
		eInstance.concernRepository = concernRepository;
		eInstance.concernSolution = concernSolution;
		
		return eInstance;
		
	}
	
	public void isMultiple(boolean value) {
		
		this.isMultiple = value;
		
	}
	
	public List<WeavingInstruction> getExperimentWeavingInstructions() throws ConcernWeavingException {
		
		return Arrays.asList(getWeavingInstructionFromMediaAccessToFileStorageComponents());
		
	}
	
	public List<WeavingInstruction> getSimpleWeavingInstructions() throws ConcernWeavingException {
		
		isMultiple(true);
		return Arrays.asList(/*getWeavingInstructionFromMediaManagementToPackagingComponents(),*/
							 getWeavingInstructionFromMediaAccessToFileStorageComponents(),
							 getWeavingInstructionFromWebGUI());
		
	}
	
	public List<WeavingInstruction> getWeavingInstructionWithRequiredECCs() throws ConcernWeavingException {
		
		return Arrays.asList(getWeavingInstructionFromMediaManagementToPackagingComponentsWithECC(ANALYSIS_ECC_NAME),
				 			 getWeavingInstructionFromMediaAccessToFileStorageComponentsWithECC(ANALYSIS_ECC_NAME),
				 			 getWeavingInstructionFromWebGUI());
		
	}
	
	private WeavingInstruction getWeavingInstructionFromMediaManagementToPackagingComponents() throws ConcernWeavingException {
		
		Pair<Connector, List<Signature>> locationWithAffectedSignature = getAssemblyConnectorLocationSignaturePairWith(MEDIA_MANAGEMENT_PACKAGING_ASSEMBLY_CONNECTOR_ID, 
																													   AFFECTED_SIGNATURE_ZIP_ID_IPACKAGING_INTERFACE);
																						
		return getDefaultWeavingInstruction(locationWithAffectedSignature);
		
	}
	
	private WeavingInstruction getWeavingInstructionFromMediaManagementToPackagingComponentsWithECC(String name) throws ConcernWeavingException {
		
		Pair<Connector, List<Signature>> locationWithAffectedSignature = getAssemblyConnectorLocationSignaturePairWith(MEDIA_MANAGEMENT_PACKAGING_ASSEMBLY_CONNECTOR_ID, 
																													   AFFECTED_SIGNATURE_ZIP_ID_IPACKAGING_INTERFACE);
																						
		return getWeavingInstructionOf(locationWithAffectedSignature, getECCWith(name));
		
	}
	
	private WeavingInstruction getWeavingInstructionFromMediaAccessToFileStorageComponents() throws ConcernWeavingException {
		
		Pair<Connector, List<Signature>> locationWithAffectedSignature = getAssemblyConnectorLocationSignaturePairWith(MEDIA_ACCESS_FILE_STORAGE_ASSEMBLY_CONNECTOR_ID, 
																													   AFFECTED_SIGNATURE_GETFILES_ID_IFILESTORAGE_INTERFACE,
																													   AFFECTED_SIGNATURE_STOREFILES_ID_IFILESTORAGE_INTERFACE);
																						
		return getDefaultWeavingInstruction(locationWithAffectedSignature);
		
	}
	
	private WeavingInstruction getWeavingInstructionFromMediaAccessToFileStorageComponentsWithECC(String name) throws ConcernWeavingException {
		
		Pair<Connector, List<Signature>> locationWithAffectedSignature = getAssemblyConnectorLocationSignaturePairWith(MEDIA_ACCESS_FILE_STORAGE_ASSEMBLY_CONNECTOR_ID, 
																													   AFFECTED_SIGNATURE_GETFILES_ID_IFILESTORAGE_INTERFACE);
																						
		return getWeavingInstructionOf(locationWithAffectedSignature, getECCWith(name));
		
	}

	private WeavingInstruction getWeavingInstructionFromWebGUI() throws ConcernWeavingException {
	
	Pair<Connector, List<Signature>> locationWithAffectedSignature = getDelegationConnectorLocationSignaturePairWith(WEB_GUI_DELEGATION_CONNECTOR_ID, 
																													 AFFECTED_SIGNATURE_UPLOAD_ID_IMEDIAMANAGEMENT, 
																													 AFFECTED_SIGNATURE_DOWNLOAD_ID_IMEDIAMANAGEMENT, 
																													 AFFECTED_SIGNATURE_GETFILELIST_ID_IMEDIAMANAGEMENT);
																					
	return getDefaultWeavingInstruction(locationWithAffectedSignature);
	
	}
	
	private WeavingInstruction getDefaultWeavingInstruction(Pair<Connector, List<Signature>> locationWithAffectedSignature) throws ConcernWeavingException {
		
		return getWeavingInstructionOf(locationWithAffectedSignature, getECCWith(DETECTION_ECC_NAME));
		
	}
	
	private WeavingInstruction getWeavingInstructionOf(Pair<Connector, List<Signature>> locationWithAffectedSignature, ElementaryConcernComponent ecc) throws ConcernWeavingException {
		
		ECCFeatureHandler featureHandler = new ECCFeatureHandler(this.concernSolution);
		Pair<ElementaryConcernComponent, List<ProvidedRole>> eccWithConsumedFeatures = Pair.of(ecc, featureHandler.getProvidedFeaturesOf(ecc));
		ResourceContainer resourceContainer = ExperimentUtil.getResourceContainerWith(RESOURCE_CONTAINER_SERVER_1_ID, pcm.getResourceEnvironment());
		Transformation adapterStrategy = getAdapterWeavingInstruction();
		
		return new WeavingInstructionBuilder().setECCWithConsumedFeatures(eccWithConsumedFeatures)
											  .setWeavingLocation(getWeavingLocationFrom(locationWithAffectedSignature))
											  .setTransformationStrategy(adapterStrategy)
											  .setResourceContainer(resourceContainer)
											  .build();
		
	}
	
	private Transformation getAdapterWeavingInstruction() {
		
		Transformation trans = ExperimentUtil.createAdapterTransformationStrategy(ADAPTER_NAME);
		trans.setMultiple(this.isMultiple);
		
		return trans;
		
	}

	private WeavingLocation getWeavingLocationFrom(Pair<Connector, List<Signature>> locationWithAffectedSignatures) {
		
		if (locationWithAffectedSignatures.getFirst() instanceof AssemblyConnector) {
			
			return new WeavingLocation(locationWithAffectedSignatures.getSecond(), (AssemblyConnector) locationWithAffectedSignatures.getFirst());
			
		}
		
		return new WeavingLocation(locationWithAffectedSignatures.getSecond(), (ProvidedDelegationConnector) locationWithAffectedSignatures.getFirst());
		
	}
	
	private Pair<Connector, List<Signature>> getAssemblyConnectorLocationSignaturePairWith(String connectorId, String... signatureIds) {
		
		AssemblyConnector location = (AssemblyConnector) ExperimentUtil.getConnectorWith(connectorId, this.pcm.getSystem());
		List<Signature> affectedSignatures = ExperimentUtil.getSignatures(this.pcm.getRepositories(), signatureIds);
		
		return Pair.of(location, affectedSignatures);
	}
	
	private Pair<Connector, List<Signature>> getDelegationConnectorLocationSignaturePairWith(String connectorId, String... signatureIds) {
		
		ProvidedDelegationConnector location = (ProvidedDelegationConnector) ExperimentUtil.getConnectorWith(connectorId, this.pcm.getSystem());
		List<Signature> affectedSignatures = ExperimentUtil.getSignatures(this.pcm.getRepositories(), signatureIds);
		
		return Pair.of(location, affectedSignatures);
	}
	
	private ElementaryConcernComponent getECCWith(String name) {
		
		return  this.concernRepository.getConcerns().stream().flatMap(eachConcern -> eachConcern.getComponents().stream())
															.filter(eachECC -> eachECC.getName().equals(name))
															.findFirst().get();
															
		
	}
	
}
