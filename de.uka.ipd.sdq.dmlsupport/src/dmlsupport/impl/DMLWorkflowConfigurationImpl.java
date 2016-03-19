/**
 */
package dmlsupport.impl;

import dmlsupport.DMLWorkflowConfiguration;
import dmlsupport.DmlsupportPackage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DML Workflow Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DMLWorkflowConfigurationImpl extends DSEWorkflowConfiguration implements DMLWorkflowConfiguration {

	private String applicationArchFile;
	private String resourceLandscapeFile;
	private String deploymentFile;
	private String usageProfileFile;
	private String adaptionPointsFile;
	private String adaptionProcessFile;
	
	@Override
	public String getCheckFilename() {
		return DMLWorkflowConfiguration.DML_CHECK_FILENAME;
	}

	@Override
	public List<String> getModelLoadFiles() {
		ArrayList<String> files = new ArrayList<String>();
		files.add(this.getAdaptionPointsFile());
		files.add(this.getAdaptionProcessFile());
		files.add(this.getApplicationArchFile());
		files.add(this.getDeploymentFile());
		files.add(this.getResourceLandscapeFile());
		files.add(this.getUsageProfileFile());
		return files;
	}

	@Override
	public ResourceSetPartition preparePartition() {
		ResourceSetPartition partition = new ResourceSetPartition();
		partition.initialiseResourceSetEPackages(this.getEpackages());
		return partition;
	}

	public String getUsageProfileFile() {
		return usageProfileFile;
	}

	public void setUsageProfileFile(String usageProfileFile) {
		this.usageProfileFile = usageProfileFile;
	}

	public String getDeploymentFile() {
		return deploymentFile;
	}

	public void setDeploymentFile(String deploymentFile) {
		this.deploymentFile = deploymentFile;
	}

	public String getResourceLandscapeFile() {
		return resourceLandscapeFile;
	}

	public void setResourceLandscapeFile(String resourceLandscape) {
		this.resourceLandscapeFile = resourceLandscape;
	}

	public String getApplicationArchFile() {
		return applicationArchFile;
	}

	public void setApplicationArchFile(String applicationArch) {
		this.applicationArchFile = applicationArch;
	}

	public String getAdaptionPointsFile() {
		return adaptionPointsFile;
	}

	public void setAdaptionPointsFile(String adaptionPoints) {
		this.adaptionPointsFile = adaptionPoints;
	}

	public String getAdaptionProcessFile() {
		return adaptionProcessFile;
	}

	public void setAdaptionProcessFile(String adaptionProcess) {
		this.adaptionProcessFile = adaptionProcess;
	}

} //DMLWorkflowConfigurationImpl
