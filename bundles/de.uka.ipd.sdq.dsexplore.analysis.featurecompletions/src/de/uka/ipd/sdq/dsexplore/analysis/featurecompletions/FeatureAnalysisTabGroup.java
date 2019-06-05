package de.uka.ipd.sdq.dsexplore.analysis.featurecompletions;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class FeatureAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

	public FeatureAnalysisTabGroup() {
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { new FeatureAnalysisTab() };
		this.setTabs(tabs);
	}

}
