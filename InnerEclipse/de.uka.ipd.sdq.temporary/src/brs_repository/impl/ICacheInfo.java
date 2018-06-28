package brs_repository.impl;

public interface ICacheInfo
{
	public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iCache_doCacheAccess0(de.uka.ipd.sdq.simucomframework.Context ctx)
	;
	;
	
		public brs_repository.ICache getPortProvided_ICache_CacheInfo();
	public void setContext(brs_repository.impl.contexts.ICacheInfoContext myContext);
	public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame);
}
