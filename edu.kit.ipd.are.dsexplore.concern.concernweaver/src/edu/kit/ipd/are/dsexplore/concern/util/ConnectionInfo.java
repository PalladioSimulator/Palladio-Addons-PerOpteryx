package edu.kit.ipd.are.dsexplore.concern.util;

import java.util.Optional;

import org.palladiosimulator.pcm.core.composition.AssemblyContext;
import org.palladiosimulator.pcm.repository.Role;

public class ConnectionInfo {

	public Role role;
	public AssemblyContext assemblyContext;
	//The opponent assembly-context needs to be specified if there exist more than one assembly-context which encapsulates the same component.
	public Optional<AssemblyContext> opponentAssemblyContext;
	
	public ConnectionInfo(Role role, AssemblyContext assemblyContext) {
		
		this(role, assemblyContext, Optional.empty());
		
	}
	
	public ConnectionInfo(Role role, AssemblyContext assemblyContext, Optional<AssemblyContext> opponentAssemblyContext) {
		
		this.role = role;
		this.assemblyContext = assemblyContext;
		this.opponentAssemblyContext = opponentAssemblyContext;
		
	}
	
}
