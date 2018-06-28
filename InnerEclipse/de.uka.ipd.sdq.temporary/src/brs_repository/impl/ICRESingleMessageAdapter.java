package brs_repository.impl;

public interface ICRESingleMessageAdapter
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iInnerDB_getSmallReportInner0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iInnerDB_getBigReportInner1(de.uka.ipd.sdq.simucomframework.Context ctx)
	;de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iInnerDB_getCachedDataInner2(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.IInnerDB getPortProvided_IDB_CRESingleMessageAdapter();
	public void setContext(brs_repository.impl.contexts.ICRESingleMessageAdapterContext myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
