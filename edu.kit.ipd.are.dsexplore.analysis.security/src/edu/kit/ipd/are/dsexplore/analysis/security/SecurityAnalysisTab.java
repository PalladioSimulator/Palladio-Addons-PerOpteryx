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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.palladiosimulator.analyzer.workflow.runconfig.FileNamesInputTab;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.workflow.launchconfig.tabs.TabHelper;

/**
 * @author Jan Keim
 *
 */
public class SecurityAnalysisTab extends FileNamesInputTab implements
ILaunchConfigurationTab {

	private static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");

	/** Settings that can be set */
	private Text textSecurityModel;
	private boolean mockSecurity = false;
	private String attacker_lambda = "0.01";
	private String attacker_delta = "100";
	private String attacker_mtoa = "200";

	@Override
	public void createControl(Composite parent) {

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
				// only if only one button that can activate this
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
		TabHelper.createFileInputSection(container, modifyListener, "No input needed. DELETE ME?",
				DSEConstantsContainer.COST_MODEL_EXTENSION, this.textSecurityModel, this.getShell(),
				DSEConstantsContainer.DEFAULT_COST_MODEL_FILE);

		/**
		 * add settings for Attacker
		 */
		this.createAttackerSettings(container);

		/**
		 * Add a button to mock security values
		 */
		Button button = new Button(container, SWT.CHECK);
		button.setEnabled(true);
		button.setText("Mock calculation of security values");
		button.addSelectionListener(selectionListener);
		button.setSelection(this.mockSecurity);

	}

	/**
	 * Create the tab to be able to set the attacker
	 *
	 * @param parent
	 *            Parent Composite, the attacker settings should be put into
	 * @return Composite for the attacker settings
	 */
	private Composite createAttackerSettings(Composite parent) {

		// create label
		Label label = new org.eclipse.swt.widgets.Label(parent, SWT.NONE);
		label.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
		label.setText("Set Attacker Skill Level");

		// create the composite everything will be put into
		Composite radioContainer = new Composite(parent, SWT.NONE);
		radioContainer.setLayout(new GridLayout(4, false)); // or RowLayout


		// 3 Selections, each with a button and its Text, then 3 fields:
		// lambda (improvement), delta and Mean Time of Attack (x)
		// examples low: 0.007, 150, 200
		// examples high: 0.01, 100, 200
		String[][] text = { { "Low", "0.007", "150", "200" }, { "High", "0.01", "100", "200" },
				{ "Custom", "0.01", "100", "200" } };
		Button[] buttons = new Button[3];
		Text[][] texts = new Text[3][3];
		final int CUSTOM_INDEX = 2;
		final int DEFAULT_SELECTED_INDEX = 1;

		for (int i = 0; i < 3; i++) {
			Button button = new Button(radioContainer, SWT.CHECK);
			button.setEnabled(true);
			button.setText(text[i][0]);
			button.setSelection(i == DEFAULT_SELECTED_INDEX);
			buttons[i] = button;

			Text lambda = new Text(radioContainer, SWT.READ_ONLY);
			lambda.setEnabled(true);
			lambda.setText(text[i][1]);
			lambda.setEditable(i == CUSTOM_INDEX); // only custom is editable
			texts[i][0] = lambda;

			Text delta = new Text(radioContainer, SWT.READ_ONLY);
			delta.setEnabled(true);
			delta.setText(text[i][2]);
			delta.setEditable(i == CUSTOM_INDEX); // only custom is editable
			texts[i][1] = delta;

			Text mtoa = new Text(radioContainer, SWT.READ_ONLY);
			mtoa.setEnabled(true);
			mtoa.setText(text[i][3]);
			mtoa.setEditable(i == CUSTOM_INDEX); // only custom is editable
			texts[i][2] = mtoa;
		}

		// Listener for the buttons
		final SelectionListener selectionListener = new SelectionListener() {
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				SecurityAnalysisTab.this.setDirty(true);
				SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
			}

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (e.getSource() instanceof Button) {
					// go through buttons, unset other buttons and update the
					// values for correct button
					Button button = (Button) e.getSource();
					for (int i = 0; i < buttons.length; i++) {
						Button otherButton = buttons[i];
						if (!otherButton.equals(button)) {
							otherButton.setSelection(false);
						} else {
							// update values
							SecurityAnalysisTab.this.attacker_lambda = texts[i][0].getText();
							SecurityAnalysisTab.this.attacker_delta = texts[i][1].getText();
							SecurityAnalysisTab.this.attacker_mtoa = texts[i][2].getText();
						}
					}
				}
				SecurityAnalysisTab.this.setDirty(true);
				SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
			}
		};
		for (Button button : buttons) {
			button.addSelectionListener(selectionListener);
		}

		// text modify listener
		final ModifyListener textModifyListener = event -> {
			this.attacker_lambda = texts[CUSTOM_INDEX][0].getText();
			this.attacker_delta = texts[CUSTOM_INDEX][1].getText();
			this.attacker_mtoa = texts[CUSTOM_INDEX][2].getText();
			for (int i = 0; i < buttons.length; i++) {
				buttons[i].setSelection(i == CUSTOM_INDEX);
			}
			SecurityAnalysisTab.this.setDirty(true);
			SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
		};
		for (int i = 0; i < texts[CUSTOM_INDEX].length; i++) {
			texts[CUSTOM_INDEX][i].addModifyListener(textModifyListener);
		}

		return radioContainer;
	}

	@Override
	public String getName() {
		return "Security Analysis";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// empty
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO
		configuration.setAttribute("mockSecurity", this.mockSecurity);
		configuration.setAttribute("attacker_lambda", this.attacker_lambda);
		configuration.setAttribute("attacker_delta", this.attacker_delta);
		configuration.setAttribute("attacker_mtoa", this.attacker_mtoa);
		logger.debug("Changed Config: mockSecurity=" + this.mockSecurity + ", Attacker(" + this.attacker_lambda + ","
				+ this.attacker_delta + "," + this.attacker_mtoa + ")");

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {		configuration.setAttribute("mockSecurity", this.mockSecurity);
		configuration.setAttribute("attacker_lambda", this.attacker_lambda);
		configuration.setAttribute("attacker_delta", this.attacker_delta);
		configuration.setAttribute("attacker_mtoa", this.attacker_mtoa);;
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
		try {
			@SuppressWarnings("unused")
			double lambda = Double.parseDouble(this.attacker_lambda);
			double delta = Double.parseDouble(this.attacker_delta);
			double mtoa = Double.parseDouble(this.attacker_mtoa);
			if (delta > mtoa) {
				this.setErrorMessage("Custom values for Attacker are invalid!");
				return false;
			}
			return true;
		} catch (NumberFormatException e) {
			this.setErrorMessage("Custom values for Attacker are invalid!");
			return false;
		}
	}



}
