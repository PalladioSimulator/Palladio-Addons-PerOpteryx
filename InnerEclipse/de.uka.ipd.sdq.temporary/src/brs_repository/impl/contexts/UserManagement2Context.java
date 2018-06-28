package brs_repository.impl.contexts;

// Component context class for UserManagement2
public class UserManagement2Context implements brs_repository.impl.contexts.IUserManagement2Context, java.io.Serializable
{


	public UserManagement2Context () {
	}

	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
