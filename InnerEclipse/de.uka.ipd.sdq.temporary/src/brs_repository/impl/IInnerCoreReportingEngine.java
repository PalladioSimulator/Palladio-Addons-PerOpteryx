package brs_repository.impl;

public interface IInnerCoreReportingEngine
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iReporting_getReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iReporting_getView1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iReporting_prepareView2(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iReporting_finishView3(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iAdmin_maintain0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IReporting getPortProvided_IReporting_ReportingEngine();
	
		public brs_repository.IAdmin getPortProvided_IAdmin_ReportingEngine();
	public void setContext(brs_repository.impl.contexts.IInnerCoreReportingEngineContext myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
