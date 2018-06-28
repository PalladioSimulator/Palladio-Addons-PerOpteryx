package defaultrepository;

public interface IMiddlewareSinkPort

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	handleSinkPort0
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
