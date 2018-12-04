package de.uka.ipd.sdq.dsexplore.analysis.simucom.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.FeatureOptionsTab;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComConfigurationTab;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuConfigurationTab;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.WorkflowHooks;
import de.uka.ipd.sdq.workflow.launchconfig.extension.ExtendableTabGroup;
//import de.uka.ipd.sdq.cip.launchconfig.CompletionTab;

 /**
  * Provides a configuration tab group for the SimuCom analysis method.
  * 
  * @author pmerkle
  * 
  */
public class SimuComAnalysisTabGroup extends ExtendableTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		List<ILaunchConfigurationTab> tabs = new ArrayList<ILaunchConfigurationTab>();
		tabs.add(new SimuComConfigurationTab());
		tabs.add(new SimuConfigurationTab());
		tabs.add(new FeatureOptionsTab());
		for (String workflowExtensionPointId : WorkflowHooks.getAllWorkflowHookIDs()) {
            tabs.addAll(createExtensionTabs(dialog, mode, workflowExtensionPointId));
        }
		setTabs(tabs.toArray(new ILaunchConfigurationTab[] {}));
	}
}
