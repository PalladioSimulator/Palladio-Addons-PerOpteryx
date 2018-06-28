package brs_usage_scenario.impl;
public class BRS_usage_scenarioFactory 
extends de.uka.ipd.sdq.simucomframework.usage.OpenWorkloadUserFactory
{
	private final de.uka.ipd.sdq.simucomframework.model.SimuComModel model;
	private business_reporting_system.impl.Business_Reporting_System myBusiness_Reporting_System = null;
	public BRS_usage_scenarioFactory(de.uka.ipd.sdq.simucomframework.model.SimuComModel model, String usageID, business_reporting_system.impl.Business_Reporting_System myBusiness_Reporting_System
	){
		super(model, "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.usagemodelcand.usagemodel#_qhsIYNpBEdyxgfK4Hy_RFA");
		this.model = model;
		this.myBusiness_Reporting_System = myBusiness_Reporting_System; 
	}
	
	public de.uka.ipd.sdq.simucomframework.usage.IScenarioRunner createScenarioRunner() {
		return new brs_usage_scenario.impl.BRS_usage_scenario(model,myBusiness_Reporting_System
		);
	}
}
