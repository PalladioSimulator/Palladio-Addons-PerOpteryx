package defaultrepository;

public interface IMiddlewareSinkCommunication

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	handleSinkCommunication0
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
