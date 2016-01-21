package de.uka.ipd.sdq.pcmsupport.representation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.ConstantsContainer;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEFileNamesInputTab;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;
import genericdesigndecision.universalDoF.Metamodel;

public class PCMFileNamesInputTab extends DSEFileNamesInputTab {

	// input fields
	/** Text field for path to allocation model file. */
	protected Text textAllocation;
	/** Text field for path to usage model file. */
	protected Text textUsage;
	/** Text field for path to middleware model file. */
	protected Text rmiMiddlewareRepository;
	/** Text field for path to event middleware model file. */
	protected Text eventMiddlewareRepository;
		
	
	public void createControl(Composite parent){
		super.createControl(parent);
	
		/**
		 * Create allocation section
		 */
		textAllocation = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Allocation File", ConstantsContainer.ALLOCATION_EXTENSION, textAllocation, "Select Allocation File", getShell(), ConstantsContainer.DEFAULT_ALLOCATION_FILE);

		/**
		 * Create usage section
		 */
		//First set the text like this, will be changed to the right parent in createFileInputSection
		textUsage = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Usage File", ConstantsContainer.USAGEMODEL_EXTENSION, textUsage, "Select Usage File", getShell(), ConstantsContainer.DEFAULT_USAGE_FILE);

		/**
		 * Create MW repository section
		 */
		rmiMiddlewareRepository = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Middleware Repository File", ConstantsContainer.REPOSITORY_EXTENSION, rmiMiddlewareRepository, "Select Middleware Repository File", getShell(), ConstantsContainer.DEFAULT_RMI_MIDDLEWARE_REPOSITORY_FILE);

		/**
		 * Create event MW repository section
		 */
		eventMiddlewareRepository = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Event Middleware Repository File", ConstantsContainer.REPOSITORY_EXTENSION, eventMiddlewareRepository, "Select Event Middleware Repository File", getShell(), ConstantsContainer.DEFAULT_EVENT_MIDDLEWARE_FILE);
	}
	
	public void initializeFrom(ILaunchConfiguration configuration){
		try {
			textAllocation.setText(configuration.getAttribute(
					ConstantsContainer.ALLOCATION_FILE, ConstantsContainer.DEFAULT_ALLOCATION_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(),"Allocation File", e.getMessage());
		}
		try {
			textUsage.setText(configuration.getAttribute(
					ConstantsContainer.USAGE_FILE, ConstantsContainer.DEFAULT_USAGE_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(),"Usage File", e.getMessage());
		}
		
		try {
			rmiMiddlewareRepository.setText(configuration.getAttribute(
					ConstantsContainer.RMI_MIDDLEWARE_REPOSITORY_FILE, ConstantsContainer.DEFAULT_RMI_MIDDLEWARE_REPOSITORY_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(),"RMI Middleware Repository File", e.getMessage());
		}

		try {
			eventMiddlewareRepository.setText(configuration.getAttribute(
					ConstantsContainer.EVENT_MIDDLEWARE_REPOSITORY_FILE, ConstantsContainer.DEFAULT_EVENT_MIDDLEWARE_FILE));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(),"Event Middleware Repository File", e.getMessage());
		}
	}
	
	public void performApply(ILaunchConfigurationWorkingCopy configuration){
		
		configuration.setAttribute(ConstantsContainer.ALLOCATION_FILE,
				textAllocation.getText());
		configuration.setAttribute(ConstantsContainer.USAGE_FILE, textUsage
				.getText());
		configuration.setAttribute(ConstantsContainer.RMI_MIDDLEWARE_REPOSITORY_FILE,
				rmiMiddlewareRepository.getText());
		configuration.setAttribute(ConstantsContainer.EVENT_MIDDLEWARE_REPOSITORY_FILE,
				eventMiddlewareRepository.getText());
	}
	
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		super.setDefaults(configuration);
		configuration.setAttribute(DSEConstantsContainer.INPUT_METAMODEL, Metamodel.PCM_VALUE);
		configuration.setAttribute(ConstantsContainer.RMI_MIDDLEWARE_REPOSITORY_FILE,
				ConstantsContainer.DEFAULT_RMI_MIDDLEWARE_REPOSITORY_FILE);
		configuration.setAttribute(
				ConstantsContainer.EVENT_MIDDLEWARE_REPOSITORY_FILE,
				ConstantsContainer.DEFAULT_EVENT_MIDDLEWARE_FILE);
	}
	
	@Override
	public boolean isValid(ILaunchConfiguration launchConfig){
		boolean tmp = super.isValid(launchConfig);

		if (!TabHelper.validateFilenameExtension(textAllocation.getText(),
				ConstantsContainer.ALLOCATION_EXTENSION)) {
			setErrorMessage("Allocation is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(textUsage.getText(),
				ConstantsContainer.USAGEMODEL_EXTENSION)) {
			setErrorMessage("Usage is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(rmiMiddlewareRepository.getText(),
				ConstantsContainer.REPOSITORY_EXTENSION)) {
			setErrorMessage("RMI Middleware Repository is missing.");
			return false;
		}
		if (!TabHelper.validateFilenameExtension(eventMiddlewareRepository.getText(),
				ConstantsContainer.REPOSITORY_EXTENSION)) {
			setErrorMessage("Event Middleware Repository is missing.");
			return false;
		}
		return tmp;
	}
	
	@Override
	public String getId() {
		return "de.uka.ipd.sdq.pcmsupport.representation.PCMFileNamesInputTab";
	}

}
