package de.uka.ipd.sdq.dsexplore.launch;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Platform;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import de.uka.ipd.sdq.dsexplore.helper.ResultsHandlerController;

public class ResultHandlersTab extends AbstractLaunchConfigurationTab {
	final static String TAB_NAME = "Result Handlers";
	final private StackLayout stackLayout = new StackLayout();
	private GridLayout oneBlocksGrid = new GridLayout();
	private Composite container;
	private Composite headerContainer;
	private Composite bodyContainer;
	private Combo itemsToConfig;
	private Map<String, IResultsHandlerLaunchConfigSettings> contentMap = new HashMap<String, IResultsHandlerLaunchConfigSettings>();

	final ModifyListener modifyListener = new ModifyListener() {
		public void modifyText(ModifyEvent e) {
			ResultHandlersTab.this.setDirty(true);
			ResultHandlersTab.this.updateLaunchConfigurationDialog();
		}
	};

	final SelectionListener selectionListener = new SelectionListener() {
		public void widgetDefaultSelected(SelectionEvent e) {
			ResultHandlersTab.this.setDirty(true);
			ResultHandlersTab.this.updateLaunchConfigurationDialog();
		}

		public void widgetSelected(SelectionEvent e) {
			ResultHandlersTab.this.setDirty(true);
			ResultHandlersTab.this.updateLaunchConfigurationDialog();
		}
	};

	@Override
	public void createControl(Composite parent) {
		this.oneBlocksGrid.numColumns = 1;

		container = new Composite(parent, SWT.NONE);
		this.setControl(container);
		container.setLayout(oneBlocksGrid);
		container.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true));

		this.headerContainer = new Composite(container, SWT.NONE);
		this.headerContainer.setLayout(oneBlocksGrid);
		this.headerContainer.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

		this.bodyContainer = new Composite(container, SWT.NONE);
		this.bodyContainer.setLayout(this.stackLayout);
		this.bodyContainer.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true));

		this.contentMap = ResultsHandlerController.getResultHandlersLaunchConfigSettings(Platform.getExtensionRegistry(), bodyContainer, selectionListener, modifyListener, getShell());

		this.menuSelector();
	}

	private void menuSelector() {
		if (contentMap.isEmpty()) {
			return;
		}
		itemsToConfig = new Combo(this.headerContainer, SWT.READ_ONLY);
		itemsToConfig.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		itemsToConfig.setEnabled(true);

		String[] items = this.contentMap.keySet().toArray(new String[1]);

		itemsToConfig.setItems(items);
		itemsToConfig.addModifyListener(modifyListener);
		itemsToConfig.addSelectionListener(selectionListener);

		itemsToConfig.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Composite toDisplay = contentMap.get(itemsToConfig.getItem(itemsToConfig.getSelectionIndex())).getSettingsComposite();
				stackLayout.topControl = toDisplay;
				toDisplay.layout();
				ResultHandlersTab.this.updateLaunchConfigurationDialog();
			}
		});

		itemsToConfig.select(0);
		stackLayout.topControl = contentMap.get(itemsToConfig.getItem(0)).getSettingsComposite();
	}

	@Override
	public String getName() {
		return TAB_NAME;
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		for (String key: contentMap.keySet()) {
			contentMap.get(key).initializeFrom(configuration);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		for (String key: contentMap.keySet()) {
			contentMap.get(key).performApply(configuration);
		}
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		for (String key: contentMap.keySet()) {
			contentMap.get(key).setDefaults(configuration);
		}
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		for (String key: contentMap.keySet()) {
			if (!contentMap.get(key).isValid(launchConfig)) {
				setErrorMessage("Configuration error in Results Handler " + key);
				return false;
			}
		}
		return true;
	}
}
