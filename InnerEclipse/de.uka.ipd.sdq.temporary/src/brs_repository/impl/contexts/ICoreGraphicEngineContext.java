package brs_repository.impl.contexts;

// Component context interface for CoreGraphicEngine
public interface ICoreGraphicEngineContext
{
	brs_repository.IDB getRoleRequired_IDB_CoreReportingEngine2();
	brs_repository.ICache getRoleRequired_ICache_CoreReportingEngine2();
	void setRoleRequired_IDB_CoreReportingEngine2(brs_repository.IDB newValue);
	void setRoleRequired_ICache_CoreReportingEngine2(brs_repository.ICache newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
