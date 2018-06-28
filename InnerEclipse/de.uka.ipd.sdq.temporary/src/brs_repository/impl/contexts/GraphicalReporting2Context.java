package brs_repository.impl.contexts;

// Component context class for GraphicalReporting2
public class GraphicalReporting2Context implements brs_repository.impl.contexts.IGraphicalReporting2Context, java.io.Serializable
{
	protected brs_repository.IReporting required_IReporting_GraphicalReporting2 = null;
	public brs_repository.IReporting getRoleRequired_IReporting_GraphicalReporting2() {
		if (required_IReporting_GraphicalReporting2 == null) {
			throw new RuntimeException("Attempt to retrieve unbounded port. Check your architecture! "+
				"Role Required_IReporting_GraphicalReporting2 <__S12wGOKEeWmJ6LLpeOQRQ> RequiringEntity GraphicalReporting2");
		}
		return required_IReporting_GraphicalReporting2;
	}
	public void setRoleRequired_IReporting_GraphicalReporting2(brs_repository.IReporting newValue) {
		this.required_IReporting_GraphicalReporting2 = newValue;
	}


	public GraphicalReporting2Context () {
	}

	public GraphicalReporting2Context (
		brs_repository.IReporting required_IReporting_GraphicalReporting2
		) {
		this.required_IReporting_GraphicalReporting2 = required_IReporting_GraphicalReporting2;
	}
	
	
	de.uka.ipd.sdq.simucomframework.variables.userdata.UserData myUserData;
	
	public de.uka.ipd.sdq.simucomframework.variables.userdata.UserData getUserData(){
	  return this.myUserData;
	}
	  	  
	public void setUserData(de.uka.ipd.sdq.simucomframework.variables.userdata.UserData data){
	  this.myUserData = data;
	}
	
}
