package brs_repository.impl;

public interface IDatabase
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iDB_getSmallReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iDB_getBigReport1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iDB_getCachedData2(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IDB getPortProvided_IDB_DB();
	public void setContext(brs_repository.impl.contexts.IDatabaseContext myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
