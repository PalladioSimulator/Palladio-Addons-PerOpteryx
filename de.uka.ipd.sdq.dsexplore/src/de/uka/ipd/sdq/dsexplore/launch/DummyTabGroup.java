package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class DummyTabGroup extends AbstractLaunchConfigurationTabGroup {

	DSETabGroupWrapper dseTabsWrapper = null;
	
	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		dseTabsWrapper = new DSETabGroupWrapper(dialog, mode);
		ILaunchConfigurationTab[] iTabs = new ILaunchConfigurationTab[1];
		iTabs[0] = dseTabsWrapper;
		setTabs(iTabs);
	}
	
	@Override
	public void dispose() {
		dseTabsWrapper.dispose();
		super.dispose();
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		dseTabsWrapper.setDefaults(configuration);
		super.setDefaults(configuration);
	}
	
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		dseTabsWrapper.performApply(configuration);
		super.performApply(configuration);
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		dseTabsWrapper.initializeFrom(configuration);
		super.initializeFrom(configuration);
	}

}
