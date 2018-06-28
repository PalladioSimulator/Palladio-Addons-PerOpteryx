package brs_repository.impl.ports;
// Port class for IUserMgmt_UserManagement
public class IUserMgmt_UserManagement implements brs_repository.IUserMgmt, java.io.Serializable
{
     protected brs_repository.impl.IUserManagement myComponent = null;
     
     public IUserMgmt_UserManagement(){}
     
     public IUserMgmt_UserManagement(brs_repository.impl.IUserManagement myComponent){
        this.myComponent = myComponent;
     }
     
     public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
     return this.myComponent.getAssemblyContext();
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     userLogin0
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iUserMgmt_userLogin0(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     userLogout1
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iUserMgmt_userLogout1(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     logUserActivity2
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iUserMgmt_logUserActivity2(
     	     ctx);
     }
}
