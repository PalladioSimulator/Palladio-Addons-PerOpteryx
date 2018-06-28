package brs_repository.impl.contexts;

// Component context interface for GraphicalReporting2
public interface IGraphicalReporting2Context
{
	brs_repository.IReporting getRoleRequired_IReporting_GraphicalReporting2();
	void setRoleRequired_IReporting_GraphicalReporting2(brs_repository.IReporting newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
