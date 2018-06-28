package brs_repository.impl;

public class CoreOnlineEngine 
{
	private static org.apache.log4j.Logger logger = 
		org.apache.log4j.Logger.getLogger(CoreOnlineEngine.class.getName());

	private org.palladiosimulator.pcm.core.composition.AssemblyContext assemblyContext = null;
	
public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext() {
	return this.assemblyContext;
}	
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel model;
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
		return model;
	}

public CoreOnlineEngine (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
	    this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
	

this.model = model;
		
logger.info("Creating composed structure CoreOnlineEngine with AssemblyContextID " + assemblyContext.getId());

	
	logger.info("Creating composed structure CoreOnlineEngine");
	myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_ = new brs_repository.impl.InnerCoreReportingEngine
	      	("_Fjb24Go3Ed631pecjlFspw" + completeAssemblyContextID, "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.repositorycand.repository#_Fjb24Go3Ed631pecjlFspw", model);
	myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_ = new brs_repository.impl.CRESingleMessageAdapter
	      	("_GldUkGo3Ed631pecjlFspw" + completeAssemblyContextID, "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.repositorycand.repository#_GldUkGo3Ed631pecjlFspw", model);
      
	/* And finally, my ports */
	m_portProvided_IAdmin_CoreReportingEngine = new brs_repository.impl.ports.IAdmin_CoreOnlineEngine(
			myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_.
			getPortProvided_IAdmin_ReportingEngine()
			);
	m_portProvided_IReporting_CoreReportingEngine = new brs_repository.impl.ports.IReporting_CoreOnlineEngine(
			myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_.
			getPortProvided_IReporting_ReportingEngine()
			);
} 
	// Composed child components member variables
	protected 
	   brs_repository.impl.InnerCoreReportingEngine 
	      myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_ = null;
	protected 
	   brs_repository.impl.CRESingleMessageAdapter 
	      myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_ = null;

	/**
	* Inner Structure initialisation
	*/
	private void initInnerComponents() {

		/* First, initialize composite child structures */
		/* Then initialize basic components */
		initAssembly_FastCoreReportingEngine__FastCoreReportingEngine_();
		initAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_();
	}

	private void initAssembly_FastCoreReportingEngine__FastCoreReportingEngine_() {
		brs_repository.impl.contexts.InnerCoreReportingEngineContext context = new brs_repository.impl.contexts.InnerCoreReportingEngineContext(
			/* From Connector _MR89UGo3Ed631pecjlFspw */
			myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_.getPortProvided_IDB_CRESingleMessageAdapter(),
			this.myContext.getRoleRequired_ICache_CoreReportingEngine()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_.getAssemblyContext().getId(), componentStackFrame);
		
		myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_.setComponentFrame(componentStackFrame);
		myAssembly_FastCoreReportingEngine__FastCoreReportingEngine_.setContext(context);
	}
	private void initAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_() {
		brs_repository.impl.contexts.CRESingleMessageAdapterContext context = new brs_repository.impl.contexts.CRESingleMessageAdapterContext(
			this.myContext.getRoleRequired_IDB_CoreReportingEngine()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_.getAssemblyContext().getId(), componentStackFrame);
		
		myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_.setComponentFrame(componentStackFrame);
		myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_.setContext(context);
	}
	/**
	* Inner Structure initialisation end
	*/
protected brs_repository.impl.ports.IAdmin_CoreOnlineEngine m_portProvided_IAdmin_CoreReportingEngine = null;
protected brs_repository.impl.ports.IReporting_CoreOnlineEngine m_portProvided_IReporting_CoreReportingEngine = null;
public brs_repository.IAdmin getPortProvided_IAdmin_CoreReportingEngine() {
	return m_portProvided_IAdmin_CoreReportingEngine;
}
public brs_repository.IReporting getPortProvided_IReporting_CoreReportingEngine() {
	return m_portProvided_IReporting_CoreReportingEngine;
}
protected brs_repository.impl.contexts.ICoreOnlineEngineContext myContext = null;
public void setContext(brs_repository.impl.contexts.ICoreOnlineEngineContext myContext) {
	this.myContext = myContext;
	initInnerComponents();
}
}


