package de.uka.ipd.sdq.dsexplore.launch;

/**
 * This class serves as a mechanism to externalize possible commonalities of the filename input tabs of different metamodels. 
 * @author ferdinand
 *
 */
public abstract class DSEFileNamesInputTab extends InputTab {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	public String getName() {
		return "Architecture Model(s)";
	}
}
