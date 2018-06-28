package brs_repository.impl.contexts;

// Component context interface for CoreOnlineEngine
public interface ICoreOnlineEngineContext
{
	brs_repository.ICache getRoleRequired_ICache_CoreReportingEngine();
	brs_repository.IDB getRoleRequired_IDB_CoreReportingEngine();
	void setRoleRequired_ICache_CoreReportingEngine(brs_repository.ICache newValue);
	void setRoleRequired_IDB_CoreReportingEngine(brs_repository.IDB newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
