package de.uka.ipd.sdq.dsexplore.analysis.privacy.config;

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

public class PrivacyAnalysisTab extends FileNamesInputTab implements ILaunchConfigurationTab {
	
	private Text privacyCountryFile;
	
//	private Button combineCostTypesInObjective;
//	private Button considerInitialCost;
//	private Button considerOperatingCost;

	@Override
	public void createControl(Composite parent) {
		
		// Create a listener for GUI modification events:
		final ModifyListener modifyListener = new ModifyListener() {

			public void modifyText(ModifyEvent e) {
				PrivacyAnalysisTab.this.setDirty(true);
				PrivacyAnalysisTab.this.updateLaunchConfigurationDialog();
			}
		};
		
		// Create a new Composite to hold the page's controls:
		final Composite container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());

		/**
		 * Add nqr model input section
		 */
		this.privacyCountryFile = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "Allowed Country File", DSEConstantsContainer.PRIVACY_COUNTRY_LIST_EXTENSION, privacyCountryFile, getShell(), "");
		
	}

	@Override
	public String getName() {
		return "Privacy Analysis";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			this.privacyCountryFile.setText(configuration.getAttribute(
					DSEConstantsContainer.PRIVACY_FILE, ""));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(),DSEConstantsContainer.PRIVACY_FILE, e.getMessage());
		}
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				DSEConstantsContainer.PRIVACY_FILE, 
				this.privacyCountryFile.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
				
	}

	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		// Leave this method empty to prevent unnecessary invocation of
		// initializeFrom() and multiple resulting invocations of
		// performApply().
		
	}

	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
				
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
	public boolean isValid(ILaunchConfiguration launchConfig) {
		String extension = DSEConstantsContainer.PRIVACY_COUNTRY_LIST_EXTENSION[0].replace("*", "");
		//if (this.nqrModel.getText().equals("") || !this.nqrModel.getText().contains(extension)){
		//	setErrorMessage("NQR model is missing!");
		//	return false;
		//}
		return true;
	}

}
