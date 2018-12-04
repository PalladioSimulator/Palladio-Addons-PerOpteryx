package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.widgets.Composite;

public interface IResultsHandlerLaunchConfigSettings {
	/**
	 * Returns a title to be displayed in combo selection box.
	 * 
	 * @return
	 */
	String getLaunchConfigSettingsCaption();

	/**
	 * Gets a composite to be displayed in the Result Handlers launch config tab.
	 * 
	 * @return
	 */
	Composite getSettingsComposite();

	/**
	 * Initilaizes the internal Composite.
	 * 
	 * @param configuration
	 */
	void initializeFrom(ILaunchConfiguration configuration);

	/**
	 * Performs the apply action.
	 * 
	 * @param configuration
	 */
	void performApply(ILaunchConfigurationWorkingCopy configuration);

	/**
	 * Resets it to its defaults.
	 * 
	 * @param configuration
	 */
	void setDefaults(ILaunchConfigurationWorkingCopy configuration);

	/**
	 * Checks its validity.
	 * 
	 * @param launchConfig
	 * @return
	 */
	boolean isValid(ILaunchConfiguration launchConfig);
}