package de.uka.ipd.sdq.dsexplore.helper;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.jface.operation.IRunnableWithProgress;

import de.uka.ipd.sdq.dsexplore.launch.DSETabGroupWrapper;

/**
 * this proxy lets calls to updateMessage() and updateButtons() fail silently when UI is still in the creation process;
 * DSETabs call these functions indirectly via updateLaunchConfiguration()
 * @author ferdinand
 *
 */
public class LaunchConfigurationDialogProxy implements ILaunchConfigurationDialog {

	private ILaunchConfigurationDialog dialog;
	private DSETabGroupWrapper dseTabGroupWrapper;
	
	public LaunchConfigurationDialogProxy(ILaunchConfigurationDialog dialog, DSETabGroupWrapper dseTabGroupWrapper) {
		this.dialog = dialog;
		this.dseTabGroupWrapper = dseTabGroupWrapper;
	}
	
	/**
	 * checks whether the sub tabs of the UI have been created
	 * @return
	 */
	private boolean validAccess() {
		return this.dseTabGroupWrapper.canSave();
	}

	@Override
	public void run(boolean fork, boolean cancelable, IRunnableWithProgress runnable)
			throws InvocationTargetException, InterruptedException {
		dialog.run(fork, cancelable, runnable);
	}

	@Override
	public void updateButtons() {
		if(validAccess()) {
			dialog.updateButtons();
		}
	}

	@Override
	public void updateMessage() {
		if(validAccess()) {
			dialog.updateMessage();
		}
	}

	@Override
	public void setName(String name) {
		dialog.setName(name);
	}

	@Override
	public String generateName(String name) {
		return dialog.generateName(name);
	}

	@Override
	public ILaunchConfigurationTab[] getTabs() {
		return dialog.getTabs();
	}

	@Override
	public String getMode() {
		return dialog.getMode();
	}

	@Override
	public void setActiveTab(ILaunchConfigurationTab tab) {
		dialog.setActiveTab(tab);
	}

	@Override
	public void setActiveTab(int index) {
		dialog.setActiveTab(index);
	}

	@Override
	public ILaunchConfigurationTab getActiveTab() {
		return dialog.getActiveTab();
	}

}
