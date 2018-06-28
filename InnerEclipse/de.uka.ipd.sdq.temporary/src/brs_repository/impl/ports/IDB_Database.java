package brs_repository.impl.ports;
// Port class for IDB_Database
public class IDB_Database implements brs_repository.IDB, java.io.Serializable
{
     protected brs_repository.impl.IDatabase myComponent = null;
     
     public IDB_Database(){}
     
     public IDB_Database(brs_repository.impl.IDatabase myComponent){
        this.myComponent = myComponent;
     }
     
     public org.palladiosimulator.pcm.core.composition.AssemblyContext getComponentAssemblyContext() {
     return this.myComponent.getAssemblyContext();
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     getSmallReport0
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iDB_getSmallReport0(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     getBigReport1
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iDB_getBigReport1(
     	     ctx);
     }
     public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>
     getCachedData2
     ( de.uka.ipd.sdq.simucomframework.Context ctx )
      {
     	return myComponent.iDB_getCachedData2(
     	     ctx);
     }
}
