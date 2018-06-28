package defaultrepository;

public interface IMiddlewareFilter

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	handleFilter0
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
