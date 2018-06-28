package brs_repository;

public interface IReporting

{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	getReport0
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	getView1
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	prepareView2
	( de.uka.ipd.sdq.simucomframework.Context ctx );
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	finishView3
	( de.uka.ipd.sdq.simucomframework.Context ctx )
	;
}
