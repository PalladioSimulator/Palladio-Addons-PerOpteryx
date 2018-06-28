package brs_repository.impl.contexts;

// Component context interface for WebServer2
public interface IWebServer2Context
{
	brs_repository.IBRSSystem getRoleRequired_IBRSSystem_WebServer();
	void setRoleRequired_IBRSSystem_WebServer(brs_repository.IBRSSystem newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
