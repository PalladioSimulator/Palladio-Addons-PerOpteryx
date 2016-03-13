package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoF;

public class DSEMetamodelTab extends InputTab {
	
	public static final Metamodel DEFAULT_METAMODEL = Metamodel.PCM;

	private Combo combo = null;
	private Metamodel metamodel = null;
	private DSETabGroupWrapper dseTabGroupWrapper = null;
	
	public DSEMetamodelTab(Metamodel metamodel, DSETabGroupWrapper wrapper) {
		this.metamodel = metamodel;
		this.dseTabGroupWrapper = wrapper;
	}
	
	@Override
	public void createControl(Composite parent) {
		
		this.container = new Composite(parent, SWT.NONE);
		setControl(container);
		container.setLayout(new GridLayout());
		
		final Group mmGroup = new Group(container, SWT.None);
		mmGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		mmGroup.setLayout(new GridLayout(3, false));
		mmGroup.setText("Metamodel Selection");

		final Label lblMetamodel = new Label(mmGroup, SWT.HORIZONTAL | SWT.CENTER);
		lblMetamodel.setText(DSEConstantsContainer.INPUT_METAMODEL + ":");
		
		combo = new Combo(mmGroup, SWT.READ_ONLY | SWT.DROP_DOWN);
		
		for(AMetamodelDescription am : UniversalDoF.eINSTANCE.getSupportedMetamodels()) {
        	combo.add(am.getName().toString(), am.getName().getValue());
        };
		combo.select(combo.indexOf(metamodel.toString()));
		
		Button mmButton = this.createPushButton(mmGroup, "Select", null);
		mmButton.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event e) {
				Metamodel newMetamodel = Metamodel.get(combo.getItem(combo.getSelectionIndex()));
				//metamodel has changed
				if(!metamodel.equals(newMetamodel)) {
					metamodel = newMetamodel;
					DSEMetamodelTab.this.dseTabGroupWrapper.metamodelHasChanged(metamodel);
				}
			}
		});
	}
	
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		int mmID = -1;
		try {
			mmID = configuration.getAttribute(DSEConstantsContainer.INPUT_METAMODEL, -1);
		} catch (CoreException e) {
			mmID = metamodel.getValue();
			e.printStackTrace();
		}
		if(!this.metamodel.equals(Metamodel.get(mmID))) {
			this.metamodel = Metamodel.get(mmID);
			combo.select(combo.indexOf(Metamodel.get(mmID).toString()));
			this.dseTabGroupWrapper.metamodelHasChanged(metamodel);
		}
	}
	
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DSEConstantsContainer.INPUT_METAMODEL, metamodel.getValue());
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(DSEConstantsContainer.INPUT_METAMODEL, metamodel.getValue());
	}

	public Metamodel getMetamodel() {
		return metamodel;
	}

	@Override
	public String getName() {
		return "Metamodel";
	}

}
