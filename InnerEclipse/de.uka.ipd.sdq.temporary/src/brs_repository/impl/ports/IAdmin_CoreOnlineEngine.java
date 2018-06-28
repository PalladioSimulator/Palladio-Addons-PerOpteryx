package brs_repository.impl.ports;
// Port class for IAdmin_CoreOnlineEngine
public class IAdmin_CoreOnlineEngine implements brs_repository.IAdmin, java.io.Serializable
{
	private static org.apache.log4j.Logger logger = 
		org.apache.log4j.Logger.getLogger(IAdmin_CoreOnlineEngine.class.getName());

	protected brs_repository.IAdmin myInnerPort = null;

	public IAdmin_CoreOnlineEngine(brs_repository.IAdmin myInnerPort){
		this.myInnerPort = myInnerPort;
	}

	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
	return this.myInnerPort.getComponentAssemblyContext();
	}
	     	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	     	maintain0
	     	( de.uka.ipd.sdq.simucomframework.Context ctx )
	     	 {
	     		//logger.debug("Entering port of composed structure CoreOnlineEngine");
	     		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> result = myInnerPort.maintain0(
	     		     ctx);
	     		return result;
	     	}
}
