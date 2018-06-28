package brs_repository.impl.ports;
// Port class for IReporting_InnerCoreReportingEngine
public class IReporting_InnerCoreReportingEngine implements brs_repository.IReporting, java.io.Serializable
{
     protected brs_repository.impl.IInnerCoreReportingEngine myComponent = null;
     
     public IReporting_InnerCoreReportingEngine(){}
     
     public IReporting_InnerCoreReportingEngine(brs_repository.impl.IInnerCoreReportingEngine myComponent){
        this.myComponent = myComponent;
     }
     
     public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
     return this.myComponent.getAssemblyContext();
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     getReport0
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iReporting_getReport0(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     getView1
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iReporting_getView1(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     prepareView2
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iReporting_prepareView2(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     finishView3
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iReporting_finishView3(
     	     ctx);
     }
}
