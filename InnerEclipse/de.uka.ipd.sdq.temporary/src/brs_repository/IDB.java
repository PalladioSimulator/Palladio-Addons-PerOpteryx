package brs_repository;

public interface IDB

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	getSmallReport0
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	getBigReport1
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	getCachedData2
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
