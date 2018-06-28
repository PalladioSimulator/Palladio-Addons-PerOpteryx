package brs_repository.impl.ports;
// Port class for IAdmin_InnerCoreReportingEngine
public class IAdmin_InnerCoreReportingEngine implements brs_repository.IAdmin, java.io.Serializable
{
     protected brs_repository.impl.IInnerCoreReportingEngine myComponent = null;
     
     public IAdmin_InnerCoreReportingEngine(){}
     
     public IAdmin_InnerCoreReportingEngine(brs_repository.impl.IInnerCoreReportingEngine myComponent){
        this.myComponent = myComponent;
     }
     
     public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
     return this.myComponent.getAssemblyContext();
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     maintain0
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iAdmin_maintain0(
     	     ctx);
     }
}
