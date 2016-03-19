/**
 */
package dmlsupport.impl;

import dmlsupport.DMLWorkflowConfigurationBuilder;
import dmlsupport.representation.impl.ConstantsContainer;

import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DML Workflow Configuration Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DMLWorkflowConfigurationBuilderImpl extends AbstractWorkflowConfigurationBuilder implements DMLWorkflowConfigurationBuilder {

	public DMLWorkflowConfigurationBuilderImpl(ILaunchConfiguration configuration, String mode) throws CoreException {
		super(configuration, mode);
	}

	@Override
	public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
		DMLWorkflowConfigurationImpl config = (DMLWorkflowConfigurationImpl) configuration;
		
		setDMLFilenames(config);
		
		config.setUseGenericDoF(this.configuration.getAttribute(DSEConstantsContainer.USE_GENERICDOFS, true));
		if(!config.isUseGenericDoF()) {
			for(String sdof : this.configuration.getAttribute(DSEConstantsContainer.SPECIFICDOFS, new ArrayList<String>())) {
				config.addSpecificDoF(dmlsupport.designdecision.MetamodelDescription.eINSTANCE.getSDoF(sdof));
			}
		}
	}

	private void setDMLFilenames(DMLWorkflowConfigurationImpl config) throws CoreException {
		config.setAdaptionPointsFile(getStringAttribute(ConstantsContainer.ADAPTION_POINTS_FILE));
		config.setAdaptionProcessFile(getStringAttribute(ConstantsContainer.ADAPTION_PROCESS_FILE));
		config.setUsageProfileFile(getStringAttribute(ConstantsContainer.USAGE_PROFILE_FILE));
		config.setApplicationArchFile(getStringAttribute(ConstantsContainer.APP_ARCH_FILE));
		config.setDeploymentFile(getStringAttribute(ConstantsContainer.DEPLOYMENT_FILE));
		config.setResourceLandscapeFile(getStringAttribute(ConstantsContainer.RESOURCE_LANDSCAPE_FILE));
	}

} //DMLWorkflowConfigurationBuilderImpl
