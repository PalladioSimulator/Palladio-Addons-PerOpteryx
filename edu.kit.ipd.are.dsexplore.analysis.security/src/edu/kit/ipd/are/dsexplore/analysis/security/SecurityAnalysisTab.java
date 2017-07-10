package edu.kit.ipd.are.dsexplore.analysis.security;

import org.apache.log4j.Logger;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.runconfig.FileNamesInputTab;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class SecurityAnalysisTab extends FileNamesInputTab implements
ILaunchConfigurationTab {

	private static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	private Text textSecurityModel;

	private boolean mockSecurity = true;
	//	private Button combineCostTypesInObjective;
	//	private Button considerInitialCost;
	//	private Button considerOperatingCost;

	@Override
	public void createControl(Composite parent) {

		logger.debug("Hi, greetings from createControl()");

		// Create listener for GUI modification events:
		final ModifyListener modifyListener = e -> {
			SecurityAnalysisTab.this.setDirty(true);
			SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
		};

		final SelectionListener selectionListener = new SelectionListener() {

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				SecurityAnalysisTab.this.setDirty(true);
				SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				// only if only one button that can activate this:
				SecurityAnalysisTab.this.mockSecurity ^= true; // flip

				SecurityAnalysisTab.this.setDirty(true);
				SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
			}
		};

		// Create a new Composite to hold the page's controls:
		final Composite container = new Composite(parent, SWT.NONE);
		this.setControl(container);
		container.setLayout(new GridLayout());

		/**
		 * Add cost model input section
		 */
		this.textSecurityModel = new Text(container, SWT.SINGLE | SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "No input needed",
				DSEConstantsContainer.COST_MODEL_EXTENSION, this.textSecurityModel, this.getShell(),
				DSEConstantsContainer.DEFAULT_COST_MODEL_FILE);

		/**
		 * Add a button to mock security values
		 */
		Button button = new Button(container, SWT.CHECK);
		button.setEnabled(true);
		button.setText("Mock security values");
		button.addSelectionListener(selectionListener);
		button.setSelection(true);

	}

	@Override
	public String getName() {
		return "Security Analysis";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		logger.debug("Hi, greetings from initializeFrom()");
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		logger.debug("Hi, greetings from performApply(). Mock Security is: " + this.mockSecurity);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		logger.debug("Hi, greetings from setDefaults()");
	}

	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		// Leave this method empty to prevent unnecessary invocation of
		// initializeFrom() and multiple resulting invocations of
		// performApply().
	}

	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
		// empty
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
		// String extension =
		// DSEConstantsContainer.COST_MODEL_EXTENSION[0].replace("*", "");
		// if (this.textSecurityModel.getText().equals("") ||
		// !this.textSecurityModel.getText().contains(extension)) {
		// this.setErrorMessage("Cost model is missing!");
		// return false;
		// }
		return true;
	}



}
