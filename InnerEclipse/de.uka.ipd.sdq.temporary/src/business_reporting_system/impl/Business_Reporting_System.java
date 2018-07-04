package business_reporting_system.impl;

public class Business_Reporting_System 
{
	private static org.apache.log4j.Logger logger = 
		org.apache.log4j.Logger.getLogger(Business_Reporting_System.class.getName());

	private org.palladiosimulator.pcm.core.composition.AssemblyContext assemblyContext = null;
	
public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext() {
	return this.assemblyContext;
}	
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel model;
	
	private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
		return model;
	}

public Business_Reporting_System(de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
this.model = model; 

	
	logger.info("Creating composed structure Business_Reporting_System");
	myAC_Webserver = new brs_repository.impl.WebServer3
	      	("_N8Qq8No_EdyxgfK4Hy_RFA", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_N8Qq8No_EdyxgfK4Hy_RFA", model);
	myAC_Scheduler = new brs_repository.impl.Scheduler
	      	("_T00ZwNo_EdyxgfK4Hy_RFA", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_T00ZwNo_EdyxgfK4Hy_RFA", model);
	myAC_CoreOnlineEngine = new brs_repository.impl.CoreOnlineEngine
	      	("_VmpjwNo_EdyxgfK4Hy_RFA", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_VmpjwNo_EdyxgfK4Hy_RFA", model);
	myAC_Database = new brs_repository.impl.Database
	      	("_cWmNkNo_EdyxgfK4Hy_RFA", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_cWmNkNo_EdyxgfK4Hy_RFA", model);
	myAC_Cache = new brs_repository.impl.CacheInfo
	      	("_e5UB8No_EdyxgfK4Hy_RFA", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_e5UB8No_EdyxgfK4Hy_RFA", model);
	myAC_GraphicalReporting__GraphicalReporting_ = new brs_repository.impl.GraphicalReporting2
	      	("_YH_kEFeoEd6zR8NNmb-sJg", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_YH_kEFeoEd6zR8NNmb-sJg", model);
	myAC_OnlineReporting__OnlineReporting_ = new brs_repository.impl.OnlineReporting
	      	("_iR-r0FeoEd6zR8NNmb-sJg", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_iR-r0FeoEd6zR8NNmb-sJg", model);
	myAC_UserManagement__UserManagement_ = new brs_repository.impl.UserManagement
	      	("_cmDYoFhJEd6UHd_VhJH9SQ", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_cmDYoFhJEd6UHd_VhJH9SQ", model);
	myAssembly_CoreGraphicEngine__CoreReportingEngine2_ = new brs_repository.impl.CoreGraphicEngine
	      	("_Gnz2UHqQEd6uqIqMUZizUw", "file:/Users/Schneider/Universität/Masterarbeit/Palladio/PerOpteryxPlus/InnerEclipse/de.uka.ipd.sdq.temporary/model/platform/resource/IDS/BRS/brs.systemcand.system#_Gnz2UHqQEd6uqIqMUZizUw", model);
      
	/* And finally, my ports */
	m_portProvided_IHTTP = new business_reporting_system.impl.ports.IHTTP_Business_Reporting_System(
			myAC_Webserver.
			getPortProvided_IHTTP_WebServer()
			);
	m_portProvided_IAdmin = new business_reporting_system.impl.ports.IAdmin_Business_Reporting_System(
			myAC_CoreOnlineEngine.
			getPortProvided_IAdmin_CoreReportingEngine()
			);
} 
	// Composed child components member variables
	protected 
	   brs_repository.impl.WebServer3 
	      myAC_Webserver = null;
	protected 
	   brs_repository.impl.Scheduler 
	      myAC_Scheduler = null;
	protected 
	   brs_repository.impl.CoreOnlineEngine 
	      myAC_CoreOnlineEngine = null;
	protected 
	   brs_repository.impl.Database 
	      myAC_Database = null;
	protected 
	   brs_repository.impl.CacheInfo 
	      myAC_Cache = null;
	protected 
	   brs_repository.impl.GraphicalReporting2 
	      myAC_GraphicalReporting__GraphicalReporting_ = null;
	protected 
	   brs_repository.impl.OnlineReporting 
	      myAC_OnlineReporting__OnlineReporting_ = null;
	protected 
	   brs_repository.impl.UserManagement 
	      myAC_UserManagement__UserManagement_ = null;
	protected 
	   brs_repository.impl.CoreGraphicEngine 
	      myAssembly_CoreGraphicEngine__CoreReportingEngine2_ = null;

	/**
	* Inner Structure initialisation
	*/
	private void initInnerComponents() {

		/* First, initialize composite child structures */
		initAC_CoreOnlineEngine();
		initAssembly_CoreGraphicEngine__CoreReportingEngine2_();
		/* Then initialize basic components */
		initAC_Webserver();
		initAC_Scheduler();
		initAC_Database();
		initAC_Cache();
		initAC_GraphicalReporting__GraphicalReporting_();
		initAC_OnlineReporting__OnlineReporting_();
		initAC_UserManagement__UserManagement_();
	}

	private void initAC_Webserver() {
		brs_repository.impl.contexts.WebServer3Context context = new brs_repository.impl.contexts.WebServer3Context(
			/* From Connector _Q6ZZYMSGEd2CxsWT-lM9kQ */
			myAC_Scheduler.getPortProvided_IBRSSystem_Scheduler()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_Webserver.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_Webserver.setComponentFrame(componentStackFrame);
		myAC_Webserver.setContext(context);
	}
	private void initAC_Scheduler() {
		brs_repository.impl.contexts.SchedulerContext context = new brs_repository.impl.contexts.SchedulerContext(
			/* From Connector _kBloQFeoEd6zR8NNmb-sJg */
			myAC_OnlineReporting__OnlineReporting_.getPortProvided_IReporting_OnlineReporting(),
			/* From Connector _ecj5cFeoEd6zR8NNmb-sJg */
			myAC_GraphicalReporting__GraphicalReporting_.getPortProvided_IGraphicalReport_GraphicalReporting2(),
			/* From Connector _ec0F8FhJEd6UHd_VhJH9SQ */
			myAC_UserManagement__UserManagement_.getPortProvided_IUserMgmt_UserManagement()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_Scheduler.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_Scheduler.setComponentFrame(componentStackFrame);
		myAC_Scheduler.setContext(context);
	}
	private void initAC_CoreOnlineEngine() {
		brs_repository.impl.contexts.CoreOnlineEngineContext context = new brs_repository.impl.contexts.CoreOnlineEngineContext(
			/* From Connector _iIwZcNo_EdyxgfK4Hy_RFA */
			myAC_Cache.getPortProvided_ICache_CacheInfo(),
			/* From Connector _eiDYgNo_EdyxgfK4Hy_RFA */
			myAC_Database.getPortProvided_IDB_DB()
		);
		context.setUserData(this.myContext.getUserData());
		  
		myAC_CoreOnlineEngine.setContext(context);
	}
	private void initAC_Database() {
		brs_repository.impl.contexts.DatabaseContext context = new brs_repository.impl.contexts.DatabaseContext(
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		componentStackFrame.addValue("Entries.NUMBER_OF_ELEMENTS",
		   	new de.uka.ipd.sdq.simucomframework.variables.EvaluationProxy("100000.0",
		   	new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>()));
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_Database.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_Database.setComponentFrame(componentStackFrame);
		myAC_Database.setContext(context);
	}
	private void initAC_Cache() {
		brs_repository.impl.contexts.CacheInfoContext context = new brs_repository.impl.contexts.CacheInfoContext(
			/* From Connector _itFOgNo_EdyxgfK4Hy_RFA */
			myAC_Database.getPortProvided_IDB_DB()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_Cache.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_Cache.setComponentFrame(componentStackFrame);
		myAC_Cache.setContext(context);
	}
	private void initAC_GraphicalReporting__GraphicalReporting_() {
		brs_repository.impl.contexts.GraphicalReporting2Context context = new brs_repository.impl.contexts.GraphicalReporting2Context(
			/* From Connector _JmTnwHqQEd6uqIqMUZizUw */
			myAssembly_CoreGraphicEngine__CoreReportingEngine2_.getPortProvided_IReporting_CoreReportingEngine2()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_GraphicalReporting__GraphicalReporting_.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_GraphicalReporting__GraphicalReporting_.setComponentFrame(componentStackFrame);
		myAC_GraphicalReporting__GraphicalReporting_.setContext(context);
	}
	private void initAC_OnlineReporting__OnlineReporting_() {
		brs_repository.impl.contexts.OnlineReportingContext context = new brs_repository.impl.contexts.OnlineReportingContext(
			/* From Connector _l10mAFeoEd6zR8NNmb-sJg */
			myAC_CoreOnlineEngine.getPortProvided_IReporting_CoreReportingEngine()
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_OnlineReporting__OnlineReporting_.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_OnlineReporting__OnlineReporting_.setComponentFrame(componentStackFrame);
		myAC_OnlineReporting__OnlineReporting_.setContext(context);
	}
	private void initAC_UserManagement__UserManagement_() {
		brs_repository.impl.contexts.UserManagementContext context = new brs_repository.impl.contexts.UserManagementContext(
		);
		context.setUserData(this.myContext.getUserData());
		  
		//Initialize Component Parameters
		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> componentStackFrame = 
			new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		// possibly overwrite some with user data if this AssemblyContext is meant
		this.myContext.getUserData().overwriteParametersForAssemblyContext(myAC_UserManagement__UserManagement_.getAssemblyContext().getId(), componentStackFrame);
		
		myAC_UserManagement__UserManagement_.setComponentFrame(componentStackFrame);
		myAC_UserManagement__UserManagement_.setContext(context);
	}
	private void initAssembly_CoreGraphicEngine__CoreReportingEngine2_() {
		brs_repository.impl.contexts.CoreGraphicEngineContext context = new brs_repository.impl.contexts.CoreGraphicEngineContext(
			/* From Connector _K-F6EHqQEd6uqIqMUZizUw */
			myAC_Database.getPortProvided_IDB_DB(),
			/* From Connector _KgFIYHqQEd6uqIqMUZizUw */
			myAC_Cache.getPortProvided_ICache_CacheInfo()
		);
		context.setUserData(this.myContext.getUserData());
		  
		myAssembly_CoreGraphicEngine__CoreReportingEngine2_.setContext(context);
	}
	/**
	* Inner Structure initialisation end
	*/
protected business_reporting_system.impl.ports.IHTTP_Business_Reporting_System m_portProvided_IHTTP = null;
protected business_reporting_system.impl.ports.IAdmin_Business_Reporting_System m_portProvided_IAdmin = null;
public brs_repository.IHTTP getPortProvided_IHTTP() {
	return m_portProvided_IHTTP;
}
public brs_repository.IAdmin getPortProvided_IAdmin() {
	return m_portProvided_IAdmin;
}
protected business_reporting_system.impl.contexts.IBusiness_Reporting_SystemContext myContext = null;
public void setContext(business_reporting_system.impl.contexts.IBusiness_Reporting_SystemContext myContext) {
	this.myContext = myContext;
	initInnerComponents();
}
}
