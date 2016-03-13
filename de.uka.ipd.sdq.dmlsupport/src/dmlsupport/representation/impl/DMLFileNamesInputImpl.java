/**
 */
package dmlsupport.representation.impl;

import dmlsupport.representation.DMLFileNamesInput;
import genericdesigndecision.universalDoF.Metamodel;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEFileNamesInputTab;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DML File Names Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DMLFileNamesInputImpl extends DSEFileNamesInputTab implements DMLFileNamesInput {

	// input fields
	/** Text field for path to application architecture model file. */
	protected Text applicationArch;
	/** Text field for path to resource landscape model file. */
	protected Text resourceLandscape;
	/** Text field for path to deployment model file. */
	protected Text deployment;
	/** Text field for path to usage profile model file. */
	protected Text usageProfile;
	/** Text field for path to adaption points model file. */
	protected Text adaptionPoints;
	/** Text field for path to adaption process model file. */
	protected Text adaptionProcess;
		
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		this.applicationArch = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Application Architecture File", ConstantsContainer.APP_ARCH_EXTENSION, applicationArch, "Select Application Architecture File", getShell(), ConstantsContainer.DEFAULT_APP_ARCH_FILE);

		this.resourceLandscape = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Resource Landscape File", ConstantsContainer.RESOURCE_LANDSCAPE_EXTENSION, this.resourceLandscape, "Select Resource Landscape File", getShell(), ConstantsContainer.DEFAULT_RESOURCE_LANDSCAPE_FILE);

		this.deployment = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Deployment File", ConstantsContainer.DEPLOYMENT_EXTENSION, this.deployment, "Select Deployment File", getShell(), ConstantsContainer.DEFAULT_DEPLOYMENT_FILE);
		
		this.usageProfile = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Usage Profile File", ConstantsContainer.USAGE_PROFILE_EXTENSION, this.usageProfile, "Select Usage Profile File", getShell(), ConstantsContainer.DEFAULT_USAGE_PROFILE_FILE);

		this.adaptionPoints = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Adaption Points File", ConstantsContainer.ADAPTION_POINTS_EXTENSION, this.adaptionPoints, "Select Adaption Points File", getShell(), ConstantsContainer.DEFAULT_ADAPTION_POINTS_FILE);

		this.adaptionProcess = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Adaption Process File", ConstantsContainer.ADAPTION_PROCESS_EXTENSION, this.adaptionProcess, "Select Adaption Process File", getShell(), ConstantsContainer.DEFAULT_ADAPTION_PROCESS_FILE);
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			applicationArch.setText(configuration.getAttribute(
					ConstantsContainer.APP_ARCH_FILE, ConstantsContainer.DEFAULT_APP_ARCH_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), ConstantsContainer.APP_ARCH_FILE, e.getMessage());
		}
		try {
			applicationArch.setText(configuration.getAttribute(
					ConstantsContainer.RESOURCE_LANDSCAPE_FILE, ConstantsContainer.DEFAULT_RESOURCE_LANDSCAPE_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), ConstantsContainer.RESOURCE_LANDSCAPE_FILE, e.getMessage());
		}
		try {
			applicationArch.setText(configuration.getAttribute(
					ConstantsContainer.DEPLOYMENT_FILE, ConstantsContainer.DEFAULT_DEPLOYMENT_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), ConstantsContainer.DEPLOYMENT_FILE, e.getMessage());
		}
		try {
			applicationArch.setText(configuration.getAttribute(
					ConstantsContainer.USAGE_PROFILE_FILE, ConstantsContainer.DEFAULT_USAGE_PROFILE_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), ConstantsContainer.USAGE_PROFILE_FILE, e.getMessage());
		}
		try {
			applicationArch.setText(configuration.getAttribute(
					ConstantsContainer.ADAPTION_POINTS_FILE, ConstantsContainer.DEFAULT_ADAPTION_POINTS_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), ConstantsContainer.ADAPTION_POINTS_FILE, e.getMessage());
		}
		try {
			applicationArch.setText(configuration.getAttribute(
					ConstantsContainer.ADAPTION_PROCESS_FILE, ConstantsContainer.DEFAULT_ADAPTION_PROCESS_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), ConstantsContainer.ADAPTION_PROCESS_FILE, e.getMessage());
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(ConstantsContainer.APP_ARCH_FILE, this.applicationArch.getText());
		configuration.setAttribute(ConstantsContainer.RESOURCE_LANDSCAPE_FILE, this.resourceLandscape.getText());
		configuration.setAttribute(ConstantsContainer.DEPLOYMENT_FILE, this.deployment.getText());
		configuration.setAttribute(ConstantsContainer.USAGE_PROFILE_FILE, this.usageProfile.getText());
		configuration.setAttribute(ConstantsContainer.ADAPTION_POINTS_FILE, this.adaptionPoints.getText());
		configuration.setAttribute(ConstantsContainer.ADAPTION_PROCESS_FILE, this.adaptionProcess.getText());
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		super.setDefaults(configuration);
		configuration.setAttribute(DSEConstantsContainer.INPUT_METAMODEL, Metamodel.DML_VALUE);
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		boolean temp = super.isValid(launchConfig);
		
		if (!TabHelper.validateFilenameExtension(this.applicationArch.getText(),
				ConstantsContainer.APP_ARCH_EXTENSION)) {
			setErrorMessage("Application Architecture File is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(this.resourceLandscape.getText(),
				ConstantsContainer.RESOURCE_LANDSCAPE_EXTENSION)) {
			setErrorMessage("Resource Landscape File is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(this.deployment.getText(),
				ConstantsContainer.DEPLOYMENT_EXTENSION)) {
			setErrorMessage("Deployment File is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(this.usageProfile.getText(),
				ConstantsContainer.USAGE_PROFILE_EXTENSION)) {
			setErrorMessage("Usage Profile File is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(this.adaptionPoints.getText(),
				ConstantsContainer.ADAPTION_POINTS_EXTENSION)) {
			setErrorMessage("Adaption Points File is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(this.adaptionProcess.getText(),
				ConstantsContainer.ADAPTION_PROCESS_EXTENSION)) {
			setErrorMessage("Adaption Process File is missing.");
			return false;
		}
		return temp;
	}
	
	@Override
	public String getId() {
		return "de.uka.ipd.sdq.dmlsupport.representation.DMLFileNamesInputTab";
	}

} //DMLFileNamesInputImpl
