package brs_repository.impl;

public interface IGraphicalReporting2
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iGraphicalReport_graphicalReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iGraphicalReport_viewGraphically1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IGraphicalReport getPortProvided_IGraphicalReport_GraphicalReporting2();
	public void setContext(brs_repository.impl.contexts.IGraphicalReporting2Context myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
