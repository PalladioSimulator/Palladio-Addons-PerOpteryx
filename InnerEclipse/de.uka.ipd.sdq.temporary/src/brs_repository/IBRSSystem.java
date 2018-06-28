package brs_repository;

public interface IBRSSystem

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	report0
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	view1
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	login2
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	logout3
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
