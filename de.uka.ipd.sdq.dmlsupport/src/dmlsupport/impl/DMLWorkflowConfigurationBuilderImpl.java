/**
 */
package dmlsupport.impl;

import dmlsupport.DMLWorkflowConfigurationBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
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
		// TODO Auto-generated method stub
		
	}

} //DMLWorkflowConfigurationBuilderImpl
