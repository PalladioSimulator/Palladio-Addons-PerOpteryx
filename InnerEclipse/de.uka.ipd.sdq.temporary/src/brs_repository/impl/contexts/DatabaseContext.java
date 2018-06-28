package brs_repository.impl.contexts;

// Component context class for Database
public class DatabaseContext implements brs_repository.impl.contexts.IDatabaseContext, java.io.Serializable
{


	public DatabaseContext () {
	}

	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
