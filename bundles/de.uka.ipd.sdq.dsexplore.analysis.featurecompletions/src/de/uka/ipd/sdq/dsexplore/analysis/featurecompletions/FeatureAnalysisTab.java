package de.uka.ipd.sdq.dsexplore.analysis.featurecompletions;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.palladiosimulator.analyzer.workflow.runconfig.FileNamesInputTab;

public class FeatureAnalysisTab extends FileNamesInputTab implements ILaunchConfigurationTab {

	@Override
	public void createControl(final Composite parent) {

	}

	@Override
	public String getName() {
		return "FeatureCompletion Analysis";
	}

	@Override
	public void initializeFrom(final ILaunchConfiguration configuration) {

	}

	@Override
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {

	}

	@Override
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {

	}

	@Override
	public void activated(final ILaunchConfigurationWorkingCopy workingCopy) {

	}

	@Override
	public void deactivated(final ILaunchConfigurationWorkingCopy workingCopy) {

	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		return true;
	}

}
