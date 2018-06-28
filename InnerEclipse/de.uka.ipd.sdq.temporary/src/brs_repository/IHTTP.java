package brs_repository;

public interface IHTTP

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	processLoginLogout0
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	processGraphicalReport1
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	processOnlineReport2
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	processGraphicalView3
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	processOnlineView4
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
