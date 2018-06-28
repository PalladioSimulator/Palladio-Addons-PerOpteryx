package brs_repository.impl;

public class CoreGraphicEngine 
{
	private static org.apache.log4j.Logger logger = 
		org.apache.log4j.Logger.getLogger(CoreGraphicEngine.class.getName());

	private org.palladiosimulator.pcm.core.composition.AssemblyContext assemblyContext = null;
	
public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext() {
	return this.assemblyContext;
}	
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel model;
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
		return model;
	}

public CoreGraphicEngine (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
	    this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
	

this.model = model;
		
logger.info("Creating composed structure CoreGraphicEngine with AssemblyContextID " + assemblyContext.getId());

	
	logger.info("Creating composed structure CoreGraphicEngine");
	myAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_ = new brs_repository.impl.InnerCoreReportingEngine
	      	("_83KboHqPEd6uqIqMUZizUw" + completeAssemblyContextID, "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.repositorycand.repository#_83KboHqPEd6uqIqMUZizUw", model);
	myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_ = new brs_repository.impl.CRESingleMessageAdapter
	      	("_-8fJYHqPEd6uqIqMUZizUw" + completeAssemblyContextID, "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.repositorycand.repository#_-8fJYHqPEd6uqIqMUZizUw", model);
      
	/* And finally, my ports */
	m_portProvided_IReporting_CoreReportingEngine2 = new brs_repository.impl.ports.IReporting_CoreGraphicEngine(
			myAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_.
			getPortProvided_IReporting_ReportingEngine()
			);
} 
	// Composed child components member variables
	protected 
	   brs_repository.impl.InnerCoreReportingEngine 
	      myAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_ = null;
	protected 
	   brs_repository.impl.CRESingleMessageAdapter 
	      myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_ = null;

	/**
	* Inner Structure initialisation
	*/
	private void initInnerComponents() {

		/* First, initialize composite child structures */
		/* Then initialize basic components */
		initAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_();
		initAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_();
	}

	private void initAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_() {
		brs_repository.impl.contexts.InnerCoreReportingEngineContext context = new brs_repository.impl.contexts.InnerCoreReportingEngineContext(
			/* From Connector _B6Os4HqQEd6uqIqMUZizUw */
			myAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_.getPortProvided_IDB_CRESingleMessageAdapter(),
			this.myContext.getRoleRequired_ICache_CoreReportingEngine2()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_.getAssemblyContext().getId(), componentStackFrame);
		
		myAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_.setComponentFrame(componentStackFrame);
		myAssembly_InnerCoreReportingEngine__InnerCoreReportingEngine_.setContext(context);
	}
	private void initAssembly_CRESingleMessageAdapter__CRESingleMessageAdapter_() {
		brs_repository.impl.contexts.CRESingleMessageAdapterContext context = new brs_repository.impl.contexts.CRESingleMessageAdapterContext(
			this.myContext.getRoleRequired_IDB_CoreReportingEngine2()
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
protected brs_repository.impl.ports.IReporting_CoreGraphicEngine m_portProvided_IReporting_CoreReportingEngine2 = null;
public brs_repository.IReporting getPortProvided_IReporting_CoreReportingEngine2() {
	return m_portProvided_IReporting_CoreReportingEngine2;
}
protected brs_repository.impl.contexts.ICoreGraphicEngineContext myContext = null;
public void setContext(brs_repository.impl.contexts.ICoreGraphicEngineContext myContext) {
	this.myContext = myContext;
	initInnerComponents();
}
}


