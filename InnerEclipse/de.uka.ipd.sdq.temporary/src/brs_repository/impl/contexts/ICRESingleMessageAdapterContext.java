package brs_repository.impl.contexts;

// Component context interface for CRESingleMessageAdapter
public interface ICRESingleMessageAdapterContext
{
	brs_repository.IDB getRoleRequired_IDB_CRESingleMessageAdapter();
	void setRoleRequired_IDB_CRESingleMessageAdapter(brs_repository.IDB newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
