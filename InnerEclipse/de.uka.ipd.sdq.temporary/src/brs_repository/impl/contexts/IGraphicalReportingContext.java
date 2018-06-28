package brs_repository.impl.contexts;

// Component context interface for GraphicalReporting
public interface IGraphicalReportingContext
{
	brs_repository.IReporting getRoleRequired_IReporting_GraphicalReporting();
	void setRoleRequired_IReporting_GraphicalReporting(brs_repository.IReporting newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
