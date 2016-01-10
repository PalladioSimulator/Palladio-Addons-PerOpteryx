package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.universalDoF.SpecificDoF;

public class SpecificDoFImpl implements SpecificDoF {
	
	protected String name;

	public SpecificDoFImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	@Override
	public boolean equals(SpecificDoF dof) {
		return this.name.equalsIgnoreCase(dof.getName());
	}

}
