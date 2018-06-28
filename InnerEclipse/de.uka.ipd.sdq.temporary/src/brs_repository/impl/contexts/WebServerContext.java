package brs_repository.impl.contexts;

// Component context class for WebServer
public class WebServerContext implements brs_repository.impl.contexts.IWebServerContext, java.io.Serializable
{
	protected brs_repository.IBRSSystem required_IBRSSystem_WebServer = null;
	public brs_repository.IBRSSystem getRoleRequired_IBRSSystem_WebServer() {
		if (required_IBRSSystem_WebServer == null) {
			throw new RuntimeException("Attempt to retrieve unbounded port. Check your architecture! "+
				"Role Required_IBRSSystem_WebServer <_76rHENo5EdyCSNQKlT1LxA> RequiringEntity WebServer");
		}
		return required_IBRSSystem_WebServer;
	}
	public void setRoleRequired_IBRSSystem_WebServer(brs_repository.IBRSSystem newValue) {
		this.required_IBRSSystem_WebServer = newValue;
	}


	public WebServerContext () {
	}

	public WebServerContext (
		brs_repository.IBRSSystem required_IBRSSystem_WebServer
		) {
		this.required_IBRSSystem_WebServer = required_IBRSSystem_WebServer;
	}
	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
