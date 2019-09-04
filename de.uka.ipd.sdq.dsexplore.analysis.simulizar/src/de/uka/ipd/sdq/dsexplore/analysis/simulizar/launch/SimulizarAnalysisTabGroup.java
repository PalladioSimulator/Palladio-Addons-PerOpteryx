package de.uka.ipd.sdq.dsexplore.analysis.simulizar.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

//import de.uka.ipd.sdq.codegen.simucontroller.runconfig.FeatureOptionsTab;
//import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComConfigurationTab;
//import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuConfigurationTab;
//import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.WorkflowHooks;
import de.uka.ipd.sdq.workflow.launchconfig.extension.ExtendableTabGroup;

public class SimulizarAnalysisTabGroup extends ExtendableTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		List<ILaunchConfigurationTab> tabs = new ArrayList<>();
//		tabs.add(new SimuComConfigurationTab());
//		tabs.add(new SimuConfigurationTab());
//		tabs.add(new FeatureOptionsTab());
//		for (String workflowExtensionPointId : WorkflowHooks.getAllWorkflowHookIDs()) {
//			tabs.addAll(this.createExtensionTabs(dialog, mode, workflowExtensionPointId));
//		}
		this.setTabs(tabs.toArray(new ILaunchConfigurationTab[] {}));
	}
}
