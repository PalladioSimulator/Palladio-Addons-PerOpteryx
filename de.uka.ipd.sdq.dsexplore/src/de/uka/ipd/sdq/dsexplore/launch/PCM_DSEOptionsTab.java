package de.uka.ipd.sdq.dsexplore.launch;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.widgets.Composite;

import de.uka.ipd.sdq.pcmsupport.designdecision.impl.MetamodelDescriptionImpl;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.SpecificDoF;

public class PCM_DSEOptionsTab extends DSEOptionsTab {

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		for (SpecificDoF s : MetamodelDescriptionImpl.getMetamodelDescription().listSDoFs()) {
			specificDofList.add(s.getName());
		}
	}
	
	@Override 
	public void initializeFrom(ILaunchConfiguration configuration) {
		super.initializeFrom(configuration);
		try {
			this.metamodel = Metamodel.get(configuration.getAttribute(DSEConstantsContainer.INPUT_METAMODEL, 0));
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.INPUT_METAMODEL, e.getMessage());
		}
	}
	
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		super.performApply(configuration);
		configuration.setAttribute(DSEConstantsContainer.INPUT_METAMODEL, this.metamodel.getValue());
	}

}
