package brs_repository.impl;

public interface IOnlineReporting
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iOnlineReport_onlineReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iOnlineReport_viewOnline1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IOnlineReport getPortProvided_IReporting_OnlineReporting();
	public void setContext(brs_repository.impl.contexts.IOnlineReportingContext myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
