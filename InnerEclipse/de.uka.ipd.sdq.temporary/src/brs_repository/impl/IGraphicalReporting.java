package brs_repository.impl;

public interface IGraphicalReporting
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iGraphicalReport_graphicalReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iGraphicalReport_viewGraphically1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IGraphicalReport getPortProvided_IReporting_GraphicalReporting();
	public void setContext(brs_repository.impl.contexts.IGraphicalReportingContext myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
