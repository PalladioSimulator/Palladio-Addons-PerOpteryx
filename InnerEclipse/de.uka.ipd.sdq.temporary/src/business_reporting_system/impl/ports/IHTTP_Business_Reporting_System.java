package business_reporting_system.impl.ports;
// Port class for IHTTP_Business_Reporting_System
public class IHTTP_Business_Reporting_System implements brs_repository.IHTTP, java.io.Serializable
{
	private static org.apache.log4j.Logger logger = 
		org.apache.log4j.Logger.getLogger(IHTTP_Business_Reporting_System.class.getName());

	protected brs_repository.IHTTP myInnerPort = null;

	public IHTTP_Business_Reporting_System(brs_repository.IHTTP myInnerPort){
		this.myInnerPort = myInnerPort;
	}

	public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
	return this.myInnerPort.getComponentAssemblyContext();
	}
	     	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	     	processLoginLogout0
	     	( de.uka.ipd.sdq.simucomframework.Context ctx )
	     	 {
	     		//logger.debug("Entering port of composed structure Business_Reporting_System");
	     		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> result = myInnerPort.processLoginLogout0(
	     		     ctx);
	     		return result;
	     	}
	     	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	     	processGraphicalReport1
	     	( de.uka.ipd.sdq.simucomframework.Context ctx )
	     	 {
	     		//logger.debug("Entering port of composed structure Business_Reporting_System");
	     		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> result = myInnerPort.processGraphicalReport1(
	     		     ctx);
	     		return result;
	     	}
	     	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	     	processOnlineReport2
	     	( de.uka.ipd.sdq.simucomframework.Context ctx )
	     	 {
	     		//logger.debug("Entering port of composed structure Business_Reporting_System");
	     		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> result = myInnerPort.processOnlineReport2(
	     		     ctx);
	     		return result;
	     	}
	     	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	     	processGraphicalView3
	     	( de.uka.ipd.sdq.simucomframework.Context ctx )
	     	 {
	     		//logger.debug("Entering port of composed structure Business_Reporting_System");
	     		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> result = myInnerPort.processGraphicalView3(
	     		     ctx);
	     		return result;
	     	}
	     	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
	     	processOnlineView4
	     	( de.uka.ipd.sdq.simucomframework.Context ctx )
	     	 {
	     		//logger.debug("Entering port of composed structure Business_Reporting_System");
	     		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> result = myInnerPort.processOnlineView4(
	     		     ctx);
	     		return result;
	     	}
}
