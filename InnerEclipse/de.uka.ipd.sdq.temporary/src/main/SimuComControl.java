package main;

/**
* Main class of this SimuCom instance. Used as entry by the SimuCom Framework. The 
* simulation starts executing in the abstract base class and calls the methods of this 
* class as template methods from the template method design pattern. This class is instanciated
* by the SimuCom framework simulation loader via the simulation dock and Eclipse's service
* instanciation mechanismn.
**/
public class SimuComControl extends de.uka.ipd.sdq.simucomframework.AbstractMain 
{
	// Override abstract framework method and return the workloads of this usage model
	protected de.uka.ipd.sdq.simucomframework.usage.IWorkloadDriver[] getWorkloads(
		de.uka.ipd.sdq.simucomframework.SimuComConfig config) {
			// Create 1 System(s)
			business_reporting_system.impl.Business_Reporting_System myBusiness_Reporting_System = new business_reporting_system.impl.Business_Reporting_System(getModel());
			business_reporting_system.impl.contexts.Business_Reporting_SystemContext contextBusiness_Reporting_System = 
				new business_reporting_system.impl.contexts.Business_Reporting_SystemContext
					(
					);
			// read UserData
			de.uka.ipd.sdq.simucomframework.variables.userdata.UserData userData
				= new de.uka.ipd.sdq.simucomframework.variables.userdata.UserData();
			
			contextBusiness_Reporting_System.setUserData(userData);
			
			myBusiness_Reporting_System.setContext(contextBusiness_Reporting_System);
		return new de.uka.ipd.sdq.simucomframework.usage.IWorkloadDriver[] {
			new de.uka.ipd.sdq.simucomframework.usage.OpenWorkload(getModel(),
				new brs_usage_scenario.impl.BRS_usage_scenarioFactory(getModel(), "BRS_usage_scenario",myBusiness_Reporting_System
				),
				"3")
		};
	}

	// Return the generated resource container class
	protected de.uka.ipd.sdq.simucomframework.resources.IResourceContainerFactory getResourceContainerFactory(){
		return new ResourceEnvironment();
	}
	
}
