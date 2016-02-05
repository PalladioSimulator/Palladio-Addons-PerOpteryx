package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.UniversalDoF;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;

public class MetamodelDialog extends Dialog {

	Combo combo;
	Composite container;
	
	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public MetamodelDialog(Shell parentShell) {
		super(parentShell);
		setShellStyle(SWT.CLOSE | SWT.MAX | SWT.TITLE);
		
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));
		
		Composite midComposite = new Composite(container, SWT.NONE);
		midComposite.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		midComposite.setLayout(new GridLayout(2, false));
		
		Label lblMetamodel = new Label(midComposite, SWT.HORIZONTAL | SWT.CENTER);
		lblMetamodel.setText(DSEConstantsContainer.INPUT_METAMODEL + ":");
		
		combo = new Combo(midComposite, SWT.READ_ONLY | SWT.DROP_DOWN);
		for(AMetamodelDescription am : UniversalDoF.eINSTANCE.getSupportedMetamodels()) {
        	combo.add(am.getName().getLiteral(), am.getName().getValue());
        }
		combo.select(0);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, true);
	}
	
	@Override
	protected void okPressed() {
		setReturnCode(combo.getSelectionIndex());
		close();
	}
	
	@Override
	protected void cancelPressed() {
		MessageBox msg = new MessageBox(this.getShell(), SWT.ICON_INFORMATION | SWT.RETRY);
		msg.setText("Information");
		msg.setMessage("You have to specifiy the metamodel of the input model.");

		// open dialog and, on leaving, send him back to metamodel dialog
		msg.open();
	}
	
	@Override
	protected void handleShellCloseEvent() {
		cancelPressed();
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
	}
}
