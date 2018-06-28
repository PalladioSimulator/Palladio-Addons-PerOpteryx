package brs_repository.impl.ports;
// Port class for IUserMgmt_UserManagement2
public class IUserMgmt_UserManagement2 implements brs_repository.IUserMgmt, java.io.Serializable
{
     protected brs_repository.impl.IUserManagement2 myComponent = null;
     
     public IUserMgmt_UserManagement2(){}
     
     public IUserMgmt_UserManagement2(brs_repository.impl.IUserManagement2 myComponent){
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
