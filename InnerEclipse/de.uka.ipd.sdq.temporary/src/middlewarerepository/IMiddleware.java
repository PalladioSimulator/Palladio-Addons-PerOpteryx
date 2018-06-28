package middlewarerepository;

public interface IMiddleware

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	encrypt0
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	decrypt1
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	marshall2
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	demarshall3
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	createCredentials4
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	checkCredentials5
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
