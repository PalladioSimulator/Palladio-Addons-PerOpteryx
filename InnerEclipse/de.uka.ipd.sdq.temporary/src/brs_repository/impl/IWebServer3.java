package brs_repository.impl;

public interface IWebServer3
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iHTTP_processLoginLogout0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iHTTP_processGraphicalReport1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iHTTP_processOnlineReport2(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iHTTP_processGraphicalView3(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iHTTP_processOnlineView4(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IHTTP getPortProvided_IHTTP_WebServer();
	public void setContext(brs_repository.impl.contexts.IWebServer3Context myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
