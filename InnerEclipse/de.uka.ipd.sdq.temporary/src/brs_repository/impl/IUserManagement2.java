package brs_repository.impl;

public interface IUserManagement2
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iUserMgmt_userLogin0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iUserMgmt_userLogout1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iUserMgmt_logUserActivity2(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IUserMgmt getPortProvided_IUserMgmt_UserManagement2();
	public void setContext(brs_repository.impl.contexts.IUserManagement2Context myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
