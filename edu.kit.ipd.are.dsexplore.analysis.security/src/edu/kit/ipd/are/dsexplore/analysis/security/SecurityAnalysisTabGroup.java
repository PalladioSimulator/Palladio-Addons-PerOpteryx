package edu.kit.ipd.are.dsexplore.analysis.security;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class SecurityAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

	public SecurityAnalysisTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new SecurityAnalysisTab()
			};
			setTabs(tabs);
		
	}

	

}
