package middlewarerepository.impl.contexts;

// Component context class for Glassfish_J2EE_Server
public class Glassfish_J2EE_ServerContext implements middlewarerepository.impl.contexts.IGlassfish_J2EE_ServerContext, java.io.Serializable
{


	public Glassfish_J2EE_ServerContext () {
	}

	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
