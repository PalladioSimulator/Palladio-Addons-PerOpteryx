package de.uka.ipd.sdq.pcmsupport.representation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEOptionsTab;
import de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.SpecificDoF;

public class PCM_DSEOptionsTab extends DSEOptionsTab {

	@Override 
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			if(configuration.getAttribute(DSEConstantsContainer.INPUT_METAMODEL, Metamodel.PCM_VALUE) != Metamodel.PCM_VALUE) {
				throw new IllegalStateException("This representation tab is not intended to be used with metamodel of the launch configuration.");
			}
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.INPUT_METAMODEL, e.getMessage());
		}
		super.initializeFrom(configuration);
	}
	
	public PCM_DSEOptionsTab() {
		this.metamodel = Metamodel.PCM;
	}

	@Override
	protected void setSpecificDofs() {
		for (SpecificDoF s : MetamodelDescription.eINSTANCE.listSDoFs()) {
			specificDofList.add(s.getName());
		}
	}

}
