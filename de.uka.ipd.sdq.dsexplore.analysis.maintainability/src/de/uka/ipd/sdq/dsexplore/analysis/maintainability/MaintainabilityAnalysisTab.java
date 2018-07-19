package de.uka.ipd.sdq.dsexplore.analysis.maintainability;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.runconfig.FileNamesInputTab;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class MaintainabilityAnalysisTab extends FileNamesInputTab implements ILaunchConfigurationTab {

	private Text textComponentInternalDependencyRepositoryModel;
	private Text textSystemModel;

	@Override
	public void createControl(final Composite parent) {
		// Create a listener for GUI modification events:
		final ModifyListener modifyListener = new ModifyListener() {

			@Override
			public void modifyText(final ModifyEvent e) {
				MaintainabilityAnalysisTab.this.setDirty(true);
				MaintainabilityAnalysisTab.this.updateLaunchConfigurationDialog();
			}
		};

		// Create a new Composite to hold the page's controls:
		final Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());
		/**
		 * Add ComponentInternalDependencyRepository model input section
		 */
		this.textComponentInternalDependencyRepositoryModel = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "ComponentInternalDependencyRepository File",
				DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_EXTENSION,
				textComponentInternalDependencyRepositoryModel, getShell(),
				DSEConstantsContainer.DEFAULT_COMPONENT_INTERNAL_DEPENDENCY_MODEL_FILE);
		/**
		 * Add base System input section
		 */
		this.textSystemModel = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "SystemModel File",
				DSEConstantsContainer.SYSTEM_MODEL_EXTENSION, textSystemModel, getShell(),
				DSEConstantsContainer.DEFAULT_SYSTEM_MODEL_FILE);
	}

	@Override
	public String getName() {
		return "Maintainability Analysis";
	}

	@Override
	public void initializeFrom(final ILaunchConfiguration configuration) {
		try {
			this.textComponentInternalDependencyRepositoryModel.setText(
					configuration.getAttribute(DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_FILE, ""));
		} catch (final CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_FILE,
					e.getMessage());
		}
		try {
			this.textSystemModel.setText(configuration.getAttribute(DSEConstantsContainer.SYSTEM_MODEL_FILE, ""));
		} catch (final CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.SYSTEM_MODEL_FILE, e.getMessage());
		}
	}

	@Override
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_FILE,
				this.textComponentInternalDependencyRepositoryModel.getText());
		configuration.setAttribute(DSEConstantsContainer.SYSTEM_MODEL_FILE, this.textSystemModel.getText());
	}

	@Override
	public void setDefaults(final ILaunchConfigurationWorkingCopy configuration) {

	}

	@Override
	public void activated(final ILaunchConfigurationWorkingCopy workingCopy) {
		// Leave this method empty to prevent unnecessary invocation of
		// initializeFrom() and multiple resulting invocations of
		// performApply().
	}

	@Override
	public void deactivated(final ILaunchConfigurationWorkingCopy workingCopy) {
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public boolean isValid(final ILaunchConfiguration launchConfig) {
		String extension = DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_EXTENSION[0].replace("*", "");
		if (this.textComponentInternalDependencyRepositoryModel.getText().equals("")
				|| !this.textComponentInternalDependencyRepositoryModel.getText().contains(extension)) {
			setErrorMessage("ComponentInternalDependencyRepositoryModel is missing!");
			return false;
		}
		extension = DSEConstantsContainer.SYSTEM_MODEL_EXTENSION[0].replace("*", "");
		if (this.textSystemModel.getText().equals("") || !this.textSystemModel.getText().contains(extension)) {
			setErrorMessage("SystemModel is missing!");
			return false;
		}
		return true;
	}

}