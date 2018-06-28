package brs_repository.impl.contexts;

// Component context interface for OnlineReporting
public interface IOnlineReportingContext
{
	brs_repository.IReporting getRoleRequired_IReporting_OnlineReporting();
	void setRoleRequired_IReporting_OnlineReporting(brs_repository.IReporting newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
