package brs_repository.impl.ports;
// Port class for IGraphicalReport_GraphicalReporting
public class IGraphicalReport_GraphicalReporting implements brs_repository.IGraphicalReport, java.io.Serializable
{
     protected brs_repository.impl.IGraphicalReporting myComponent = null;
     
     public IGraphicalReport_GraphicalReporting(){}
     
     public IGraphicalReport_GraphicalReporting(brs_repository.impl.IGraphicalReporting myComponent){
        this.myComponent = myComponent;
     }
     
     public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
     return this.myComponent.getAssemblyContext();
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     graphicalReport0
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iGraphicalReport_graphicalReport0(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     viewGraphically1
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iGraphicalReport_viewGraphically1(
     	     ctx);
     }
}
