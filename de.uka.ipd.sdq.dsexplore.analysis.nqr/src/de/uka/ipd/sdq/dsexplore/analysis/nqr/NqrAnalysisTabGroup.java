package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class NqrAnalysisTabGroup extends AbstractLaunchConfigurationTabGroup {

	public NqrAnalysisTabGroup() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
				new NqrAnalysisTab()
			};
			setTabs(tabs);
	}
}
