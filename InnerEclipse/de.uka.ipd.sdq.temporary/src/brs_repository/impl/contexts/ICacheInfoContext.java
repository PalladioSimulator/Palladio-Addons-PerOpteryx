package brs_repository.impl.contexts;

// Component context interface for CacheInfo
public interface ICacheInfoContext
{
	brs_repository.IDB getRoleRequired_IDB_CacheInfo();
	void setRoleRequired_IDB_CacheInfo(brs_repository.IDB newValue);
	
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData();
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data);
	
}
