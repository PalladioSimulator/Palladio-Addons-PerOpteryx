package business_reporting_system.impl.contexts;

// Component context class for Business_Reporting_System
public class Business_Reporting_SystemContext implements business_reporting_system.impl.contexts.IBusiness_Reporting_SystemContext, java.io.Serializable
{


	public Business_Reporting_SystemContext () {
	}

	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
