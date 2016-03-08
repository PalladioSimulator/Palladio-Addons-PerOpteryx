package de.uka.ipd.sdq.dmlsupport;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowBasedRunConfiguration;
import de.uka.ipd.sdq.workflow.launchconfig.AbstractWorkflowConfigurationBuilder;

public class DMLWorkflowConfigurationBuilder extends AbstractWorkflowConfigurationBuilder {
	
	public DMLWorkflowConfigurationBuilder(ILaunchConfiguration configuration, String mode) throws CoreException {
		super(configuration, mode);
	}

	@Override
	public void fillConfiguration(AbstractWorkflowBasedRunConfiguration configuration) throws CoreException {
		DMLWorkflowConfiguration config = (DMLWorkflowConfiguration) configuration;
		// TODO Auto-generated method stub
		
	}

}
