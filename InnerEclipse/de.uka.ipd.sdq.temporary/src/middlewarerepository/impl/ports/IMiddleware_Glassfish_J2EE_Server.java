package middlewarerepository.impl.ports;
// Port class for IMiddleware_Glassfish_J2EE_Server
public class IMiddleware_Glassfish_J2EE_Server implements middlewarerepository.IMiddleware, java.io.Serializable
{
     protected middlewarerepository.impl.IGlassfish_J2EE_Server myComponent = null;
     
     public IMiddleware_Glassfish_J2EE_Server(){}
     
     public IMiddleware_Glassfish_J2EE_Server(middlewarerepository.impl.IGlassfish_J2EE_Server myComponent){
        this.myComponent = myComponent;
     }
     
     public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
     return this.myComponent.getAssemblyContext();
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     encrypt0
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iMiddleware_encrypt0(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     decrypt1
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iMiddleware_decrypt1(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     marshall2
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iMiddleware_marshall2(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     demarshall3
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iMiddleware_demarshall3(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     createCredentials4
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iMiddleware_createCredentials4(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     checkCredentials5
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iMiddleware_checkCredentials5(
     	     ctx);
     }
}
