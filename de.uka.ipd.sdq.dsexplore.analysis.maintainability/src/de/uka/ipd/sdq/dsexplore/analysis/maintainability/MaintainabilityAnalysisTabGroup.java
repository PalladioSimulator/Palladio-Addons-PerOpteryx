package de.uka.ipd.sdq.dsexplore.analysis.maintainability;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class MaintainabilityAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

	public MaintainabilityAnalysisTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new MaintainabilityAnalysisTab() };
		setTabs(tabs);

	}

}
