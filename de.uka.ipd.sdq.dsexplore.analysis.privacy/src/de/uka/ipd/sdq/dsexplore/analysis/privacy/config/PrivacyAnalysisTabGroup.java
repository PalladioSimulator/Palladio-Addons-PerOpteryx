package de.uka.ipd.sdq.dsexplore.analysis.privacy.config;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class PrivacyAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

	public PrivacyAnalysisTabGroup() {
	}
	
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new PrivacyAnalysisTab()
			};
			setTabs(tabs);
		
	}

}
