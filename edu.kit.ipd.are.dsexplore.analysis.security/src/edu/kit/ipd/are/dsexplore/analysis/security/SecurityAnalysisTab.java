package edu.kit.ipd.are.dsexplore.analysis.security;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
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

	private static final String ATTR_ATTACKER_MTOA = "attacker_mtoa";
	private static final String ATTR_ATTACKER_DELTA = "attacker_delta";
	private static final String ATTR_ATTACKER_LAMBDA = "attacker_lambda";
	private static final String ATTR_MOCK_SECURITY = "mockSecurity";
	// constants and class variables
	private static Logger logger = Logger.getLogger("edu.kit.ipd.are.dsexplore.analysis.security");
	private final int CUSTOM_INDEX = 2;

	/** UI Elements */
	private Text textSecurityModel;
	private Button[] buttons = new Button[3];
	private Text[][] atkSettingsTexts = new Text[3][3];
	private Button mockButton;

	/** Settings that can be set */
	private int numButtonSelected = 1;
	private boolean mockSecurity = false;
	private String attacker_lambda = "0.01";
	private String attacker_delta = "100";
	private String attacker_mtoa = "200";

	/** Attacker settings texts */
	private final String[][] atkSettingsTextContent = { { "Low", "0.007", "150", "200" }, { "High", "0.01", "100", "200" },
			{ "Custom", this.attacker_lambda, this.attacker_delta, this.attacker_mtoa } };

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
		this.mockButton = new Button(container, SWT.CHECK);
		this.mockButton.setEnabled(true);
		this.mockButton.setText("Mock calculation of security values");
		this.mockButton.addSelectionListener(selectionListener);
		this.mockButton.setSelection(this.mockSecurity);

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



		// Description texts
		Text nameText = new Text(radioContainer, SWT.READ_ONLY);
		nameText.setEnabled(true);
		nameText.setText("Type");
		nameText.setEditable(false);

		Text lambdaDesc = new Text(radioContainer, SWT.READ_ONLY);
		lambdaDesc.setEnabled(true);
		lambdaDesc.setText("Lambda");
		lambdaDesc.setToolTipText("Describes how much the attacker is improving over time");
		lambdaDesc.setEditable(false);

		Text deltaDesc = new Text(radioContainer, SWT.READ_ONLY);
		deltaDesc.setEnabled(true);
		deltaDesc.setText("Delta");
		deltaDesc.setToolTipText("Time the attacker is always unsuccessful and needs to get to know the system");
		deltaDesc.setEditable(false);

		Text mtoaDesc = new Text(radioContainer, SWT.READ_ONLY);
		mtoaDesc.setEnabled(true);
		mtoaDesc.setText("Mean Time of Attack");
		mtoaDesc.setToolTipText("Mean time the attacker tries to get into the system");
		mtoaDesc.setEditable(false);

		// actual buttons and values
		for (int i = 0; i < 3; i++) {
			Button button = new Button(radioContainer, SWT.CHECK);
			button.setEnabled(true);
			button.setText(this.atkSettingsTextContent[i][0]);
			button.setSelection(i == this.numButtonSelected);
			this.buttons[i] = button;

			Text lambda = new Text(radioContainer, SWT.READ_ONLY);
			lambda.setEnabled(true);
			lambda.setText(this.atkSettingsTextContent[i][1]);
			lambda.setEditable(i == this.CUSTOM_INDEX); // only custom is editable
			this.atkSettingsTexts[i][0] = lambda;

			Text delta = new Text(radioContainer, SWT.READ_ONLY);
			delta.setEnabled(true);
			delta.setText(this.atkSettingsTextContent[i][2]);
			delta.setEditable(i == this.CUSTOM_INDEX); // only custom is editable
			this.atkSettingsTexts[i][1] = delta;

			Text mtoa = new Text(radioContainer, SWT.READ_ONLY);
			mtoa.setEnabled(true);
			mtoa.setText(this.atkSettingsTextContent[i][3]);
			mtoa.setEditable(i == this.CUSTOM_INDEX); // only custom is editable
			this.atkSettingsTexts[i][2] = mtoa;
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
					for (int i = 0; i < SecurityAnalysisTab.this.buttons.length; i++) {
						Button otherButton = SecurityAnalysisTab.this.buttons[i];
						if (!otherButton.equals(button)) {
							otherButton.setSelection(false);
						} else {
							// update values
							SecurityAnalysisTab.this.attacker_lambda = SecurityAnalysisTab.this.atkSettingsTexts[i][0].getText();
							SecurityAnalysisTab.this.attacker_delta = SecurityAnalysisTab.this.atkSettingsTexts[i][1].getText();
							SecurityAnalysisTab.this.attacker_mtoa = SecurityAnalysisTab.this.atkSettingsTexts[i][2].getText();
						}
					}
				}
				SecurityAnalysisTab.this.setDirty(true);
				SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
			}
		};
		for (Button button : this.buttons) {
			button.addSelectionListener(selectionListener);
		}

		// text modify listener
		final ModifyListener textModifyListener = event -> {
			this.attacker_lambda = this.atkSettingsTexts[this.CUSTOM_INDEX][0].getText();
			this.attacker_delta = this.atkSettingsTexts[this.CUSTOM_INDEX][1].getText();
			this.attacker_mtoa = this.atkSettingsTexts[this.CUSTOM_INDEX][2].getText();
			this.setSelectedButton(this.CUSTOM_INDEX);
			SecurityAnalysisTab.this.setDirty(true);
			SecurityAnalysisTab.this.updateLaunchConfigurationDialog();
		};
		for (int i = 0; i < this.atkSettingsTexts[this.CUSTOM_INDEX].length; i++) {
			this.atkSettingsTexts[this.CUSTOM_INDEX][i].addModifyListener(textModifyListener);
		}

		return radioContainer;
	}

	@Override
	public String getName() {
		return "Security Analysis";
	}

	private void setSelectedButton(int buttonIndex) {
		for (int i = 0; i < this.buttons.length; i++) {
			this.buttons[i].setSelection(i == buttonIndex);
		}
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO
		try {
			this.mockSecurity = configuration.getAttribute(ATTR_MOCK_SECURITY, false);
			this.mockButton.setSelection(this.mockSecurity);
			this.attacker_lambda = configuration.getAttribute(ATTR_ATTACKER_LAMBDA, "0.01");
			this.attacker_delta = configuration.getAttribute(ATTR_ATTACKER_DELTA, "100");
			this.attacker_mtoa = configuration.getAttribute(ATTR_ATTACKER_MTOA, "200");
			if (this.attacker_lambda.equals(this.atkSettingsTextContent[0][1]) && this.attacker_delta.equals(this.atkSettingsTextContent[0][2])
					&& this.attacker_mtoa.equals(this.atkSettingsTextContent[0][3])) {
				// case 1
				this.numButtonSelected = 0;
			} else if (this.attacker_lambda.equals(this.atkSettingsTextContent[1][1]) && this.attacker_delta.equals(this.atkSettingsTextContent[1][2])
					&& this.attacker_mtoa.equals(this.atkSettingsTextContent[1][3])) {
				// case 2
				this.numButtonSelected = 1;
			} else {
				this.atkSettingsTexts[2][0].setText(this.attacker_lambda);
				this.atkSettingsTexts[2][1].setText(this.attacker_delta);
				this.atkSettingsTexts[2][2].setText(this.attacker_mtoa);
				this.numButtonSelected = 2;
			}
			this.setSelectedButton(this.numButtonSelected);
		} catch (CoreException e) {
			e.printStackTrace();
			return;
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO
		configuration.setAttribute(ATTR_MOCK_SECURITY, this.mockSecurity);
		configuration.setAttribute(ATTR_ATTACKER_LAMBDA, this.attacker_lambda);
		configuration.setAttribute(ATTR_ATTACKER_DELTA, this.attacker_delta);
		configuration.setAttribute(ATTR_ATTACKER_MTOA, this.attacker_mtoa);
		logger.debug("Changed Config: mockSecurity=" + this.mockSecurity + ", Attacker(" + this.attacker_lambda + ","
				+ this.attacker_delta + "," + this.attacker_mtoa + ")");

	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {		configuration.setAttribute(ATTR_MOCK_SECURITY, this.mockSecurity);
		configuration.setAttribute(ATTR_ATTACKER_LAMBDA, this.attacker_lambda);
		configuration.setAttribute(ATTR_ATTACKER_DELTA, this.attacker_delta);
		configuration.setAttribute(ATTR_ATTACKER_MTOA, this.attacker_mtoa);;
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
		// TODO
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
