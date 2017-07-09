package edu.kit.ipd.are.dsexplore.analysis.sec;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.runconfig.FileNamesInputTab;

import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

public class SecurityAnalysisTab extends FileNamesInputTab implements
ILaunchConfigurationTab {

	private static Logger logger = Logger.getLogger(SecurityAnalysisTab.class);
	private static final String SECURITY_FILE = "securityFile";
	private static final String[] SECURITY_MODEL_EXTENSION = new String[] { "*.security" };

	private Text textSecurityModel;
	// private Button combineCostTypesInObjective;
	// private Button considerInitialCost;
	// private Button considerOperatingCost;

	public SecurityAnalysisTab() {
		// TODO Auto-generated constructor stub
		super();
		logger.debug("Hello from constructor");
	}

	@Override
	public void createControl(Composite parent) {

		logger.debug("Hello from createControl");

		logger.debug("Parent = " + parent.toString());

		// Create a listener for GUI modification events:
		final ModifyListener modifyListener = e -> {
			SecurityAnalysisTab.this.setDirty(true);
			SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
		};

		// final SelectionListener selectionListener = new SelectionListener() {
		//
		// public void widgetDefaultSelected(SelectionEvent e) {
		// CostAnalysisTab.this.setDirty(true);
		// CostAnalysisTab.this.updateLaunchConfigurationDialog();
		// }
		//
		// public void widgetSelected(SelectionEvent e) {
		// CostAnalysisTab.this.setDirty(true);
		// CostAnalysisTab.this.updateLaunchConfigurationDialog();
		// }
		// };

		// Create a new Composite to hold the page's controls:
		final Composite container = new Composite(parent, SWT.NONE);
		this.setControl(container);
		container.setLayout(new GridLayout());

		// /**
		// * Add cost model input section
		// */
		this.textSecurityModel = new Text(container, SWT.SINGLE |
				SWT.BORDER);
		TabHelper.createFileInputSection(container, modifyListener, "No input needed",
				SECURITY_MODEL_EXTENSION, this.textSecurityModel,
				this.getShell(),
				SECURITY_FILE);

		// this.combineCostTypesInObjective = new Button(container, SWT.CHECK);
		// this.combineCostTypesInObjective.setEnabled(true);
		// this.combineCostTypesInObjective.setText("Combine all cost types in
		// one objective");
		// this.combineCostTypesInObjective.addSelectionListener(selectionListener);
		// this.combineCostTypesInObjective.setSelection(true);
		//
		// this.considerInitialCost = new Button(container, SWT.CHECK);
		// this.considerInitialCost.setEnabled(true);
		// this.considerInitialCost.setText("Consider inital costs
		// annotations");
		// this.considerInitialCost.addSelectionListener(selectionListener);
		// this.considerInitialCost.setSelection(true);
		//
		// this.considerOperatingCost = new Button(container, SWT.CHECK);
		// this.considerOperatingCost.setEnabled(true);
		// this.considerOperatingCost.setText("Consider operating costs
		// annotations");
		// this.considerOperatingCost.addSelectionListener(selectionListener);
		// this.considerOperatingCost.setSelection(true);
		this.setErrorMessage("HELLO!");

	}

	@Override
	public String getName() {
		return "Security Analysis";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			this.textSecurityModel.setText(configuration.getAttribute(
					SECURITY_FILE, ""));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(this.getName(), SECURITY_FILE, e.getMessage());
		}

	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(
				SECURITY_FILE,
				this.textSecurityModel.getText());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		logger.debug("Hello from setDefaults");
	}

	@Override
	public void activated(ILaunchConfigurationWorkingCopy workingCopy) {
		logger.debug("Hello from activated");
	}

	@Override
	public void deactivated(ILaunchConfigurationWorkingCopy workingCopy) {
	}

	@Override
	public void dispose() {
		logger.debug("Hello from dispose");
		super.dispose();
	}

	@Override
	public Image getImage() {
		return null;
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
//		String extension = SECURITY_MODEL_EXTENSION[0].replace("*", "");
//		if (this.textSecurityModel.getText().equals("") || !this.textSecurityModel.getText().contains(extension)){
//			this.setErrorMessage("Cost model is missing!");
//			return false;
//		} else {
//			return true;
//		}
		return true;
	}



}
