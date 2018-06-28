package brs_repository.impl.contexts;

// Component context class for UserManagement
public class UserManagementContext implements brs_repository.impl.contexts.IUserManagementContext, java.io.Serializable
{


	public UserManagementContext () {
	}

	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
