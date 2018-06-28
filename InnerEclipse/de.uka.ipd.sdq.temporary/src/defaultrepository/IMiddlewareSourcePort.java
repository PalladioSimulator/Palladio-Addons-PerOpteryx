package defaultrepository;

public interface IMiddlewareSourcePort

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	handleSourcePort0
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
