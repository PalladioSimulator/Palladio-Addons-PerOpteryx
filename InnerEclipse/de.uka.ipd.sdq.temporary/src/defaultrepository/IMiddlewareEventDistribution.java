package defaultrepository;

public interface IMiddlewareEventDistribution

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	handleEventDistribution0
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
