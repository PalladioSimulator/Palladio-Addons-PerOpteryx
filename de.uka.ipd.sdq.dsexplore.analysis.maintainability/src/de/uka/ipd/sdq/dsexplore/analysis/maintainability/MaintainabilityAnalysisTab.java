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
	private Text textDataModel;
	private Text textOrganizationEnvironmentModel;

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
		 * Add DataModel input section
		 */
		this.textDataModel = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "DataModel File",
				DSEConstantsContainer.DATA_MODEL_EXTENSION, textDataModel, getShell(),
				DSEConstantsContainer.DEFAULT_DATA_MODEL_FILE);
		/**
		 * Add OrganizationEnvironmentModel input section
		 */
		this.textOrganizationEnvironmentModel = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "OrganizationEnvironmentModel File",
				DSEConstantsContainer.ORGANIZATION_ENVIRONMENT_MODEL_EXTENSION, textOrganizationEnvironmentModel,
				getShell(), DSEConstantsContainer.DEFAULT_ORGANIZATION_ENVIRONMENT_FILE);
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
			this.textOrganizationEnvironmentModel
					.setText(configuration.getAttribute(DSEConstantsContainer.ORGANIZATION_ENVIRONMENT_MODEL_FILE, ""));
		} catch (final CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.ORGANIZATION_ENVIRONMENT_MODEL_FILE,
					e.getMessage());
		}
		try {
			this.textDataModel.setText(configuration.getAttribute(DSEConstantsContainer.DATA_MODEL_FILE, ""));
		} catch (final CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.DATA_MODEL_FILE, e.getMessage());
		}
	}

	@Override
	public void performApply(final ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DSEConstantsContainer.COMPONENT_INTERNAL_DEPENDENCY_MODEL_FILE,
				this.textComponentInternalDependencyRepositoryModel.getText());
		configuration.setAttribute(DSEConstantsContainer.DATA_MODEL_FILE, this.textDataModel.getText());
		configuration.setAttribute(DSEConstantsContainer.ORGANIZATION_ENVIRONMENT_MODEL_FILE,
				this.textOrganizationEnvironmentModel.getText());
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
			setErrorMessage("ComponentInternalDependencyRepository is missing!");
			return false;
		}
		extension = DSEConstantsContainer.DATA_MODEL_EXTENSION[0].replace("*", "");
		if (this.textDataModel.getText().equals("") || !this.textDataModel.getText().contains(extension)) {
			setErrorMessage("DataModel is missing!");
			return false;
		}
		extension = DSEConstantsContainer.ORGANIZATION_ENVIRONMENT_MODEL_EXTENSION[0].replace("*", "");
		if (this.textOrganizationEnvironmentModel.getText().equals("")
				|| !this.textOrganizationEnvironmentModel.getText().contains(extension)) {
			setErrorMessage("OrganizationEnvironmentModel is missing!");
			return false;
		}
		return true;
	}

}