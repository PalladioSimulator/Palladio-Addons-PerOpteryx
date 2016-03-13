/**
 */
package dmlsupport.representation.impl;

import dmlsupport.designdecision.MetamodelDescription;
import dmlsupport.representation.DML_DSEOptionsTab;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.SpecificDoF;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.launch.DSEOptionsTab;
import de.uka.ipd.sdq.workflow.launchconfig.LaunchConfigPlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DML DSE Options Tab</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DML_DSEOptionsTabImpl extends DSEOptionsTab implements DML_DSEOptionsTab {

	public DML_DSEOptionsTabImpl() {
		this.metamodel = Metamodel.DML;
	}
	
	/**
	 * basically does the same as the super-method but enables early warning if launch configuration does not fit UI tab
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			if(configuration.getAttribute(DSEConstantsContainer.INPUT_METAMODEL, Metamodel.DML_VALUE) != Metamodel.DML_VALUE) {
				throw new IllegalStateException("This representation tab is not intended to be used with the metamodel of the launch configuration.");
			}
		} catch (CoreException e) {
			LaunchConfigPlugin.errorLogger(getName(), DSEConstantsContainer.INPUT_METAMODEL, e.getMessage());
		}
		super.initializeFrom(configuration);
	}
	
	@Override
	protected void setSpecificDofs() {
		for (SpecificDoF s : MetamodelDescription.eINSTANCE.listSDoFs()) {
			this.specificDofList.add(s.getName());
		}
	}

} //DML_DSEOptionsTabImpl
