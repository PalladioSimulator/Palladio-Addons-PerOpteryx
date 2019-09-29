package de.uka.ipd.sdq.dsexplore.analysis.simulizar.launch;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.palladiosimulator.simulizar.ui.configuration.InterpreterFileNamesInputTab;

import de.uka.ipd.sdq.codegen.simucontroller.runconfig.FeatureOptionsTab;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComConfigurationTab;
import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuConfigurationTab;
import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.WorkflowHooks;
//import de.uka.ipd.sdq.codegen.simucontroller.runconfig.FeatureOptionsTab;
//import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuComConfigurationTab;
//import de.uka.ipd.sdq.codegen.simucontroller.runconfig.SimuConfigurationTab;
//import de.uka.ipd.sdq.codegen.simucontroller.workflow.jobs.WorkflowHooks;
import de.uka.ipd.sdq.workflow.launchconfig.extension.ExtendableTabGroup;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.DebugEnabledCommonTab;

public class SimulizarAnalysisTabGroup extends ExtendableTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		// From InterpreterConfigurationTab
		List<ILaunchConfigurationTab> tabs = new ArrayList<>();
		ILaunchConfigurationTab commonTab = new DebugEnabledCommonTab();
		tabs.add(new InterpreterFileNamesInputTab());
		tabs.add(new SimuComConfigurationTab());
		tabs.add(new SimuConfigurationTab());
		for (String workflowExtensionPointId : WorkflowHooks.getAllWorkflowHookIDs()) {
			tabs.addAll(this.createExtensionTabs(dialog, mode, workflowExtensionPointId));
		}
		tabs.add(new FeatureOptionsTab());
		tabs.add(commonTab);

		this.setTabs(tabs.toArray(new ILaunchConfigurationTab[] {}));
	}
}
