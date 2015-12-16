package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.config.annotations.Name;
import org.opt4j.core.problem.ProblemModule;


public abstract class ADSEModule extends ProblemModule {

	@Name("Use the GUI?")
	boolean useGui = false;

	public boolean isUseGui() {
		return useGui;
	}

	public void setUseGui(boolean useGui) {
		this.useGui = useGui;
	}

	@Override
	protected abstract void config();

}
