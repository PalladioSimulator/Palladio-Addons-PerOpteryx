package edu.kit.ipd.are.dsexplore.concern.util;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Role;

public class ConnectionInfo {

	public Role requiringRole;
	public Role providingRole;
	public AssemblyContext requiringAssemblyContext;
	public AssemblyContext providingAssemblyContext;
	
	public ConnectionInfo(Role requiringRole, Role providingRole, AssemblyContext requiringAssemblyContext, AssemblyContext providingAssemblyContext) {
		
		this.requiringRole = requiringRole;
		this.providingRole = providingRole;
		this.requiringAssemblyContext = requiringAssemblyContext;
		this.providingAssemblyContext = providingAssemblyContext;
		
	}
	
}
