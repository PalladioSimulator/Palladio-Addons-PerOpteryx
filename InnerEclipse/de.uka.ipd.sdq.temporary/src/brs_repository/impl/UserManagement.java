package brs_repository.impl;

public class UserManagement
implements brs_repository.impl.IUserManagement
{
		private static final org.apache.log4j.Logger logger = 
				org.apache.log4j.Logger.getLogger(de.uka.ipd.sdq.simucomframework.model.SimuComModel.class.getName());
				
		/** Default EMF factory for measuring points. */
		private static final org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory measuringpointFactory = org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE;
	
		
		private org.palladiosimulator.pcm.core.composition.AssemblyContext assemblyContext = null;
		private final String completeAssemblyContextID;
		private final java.util.Map<String,java.util.List<org.palladiosimulator.probeframework.probes.Probe>> startStopProbes = new java.util.HashMap<String,java.util.List<org.palladiosimulator.probeframework.probes.Probe>>();
		
		public org.palladiosimulator.pcm.core.composition.AssemblyContext getAssemblyContext() {
			return this.assemblyContext;
		}
		
		private de.uka.ipd.sdq.simucomframework.model.SimuComModel model;
	
		private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
			return model;
		} 
		
		// Initialize this component's passive resources
		
		public UserManagement (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
			this.completeAssemblyContextID = completeAssemblyContextID;
			this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
			this.model = model;
			
			// Setup calculators for service call userLogin,
			// Setup calculators for service call userLogout,
			// Setup calculators for service call logUserActivity,
		}
	protected brs_repository.impl.ports.IUserMgmt_UserManagement m_portProvided_IUserMgmt_UserManagement = new brs_repository.impl.ports.IUserMgmt_UserManagement(this);
	public brs_repository.IUserMgmt getPortProvided_IUserMgmt_UserManagement() {
		return m_portProvided_IUserMgmt_UserManagement;
	}
	protected brs_repository.impl.contexts.IUserManagementContext myContext = null;
	public void setContext(brs_repository.impl.contexts.IUserManagementContext myContext) {
		this.myContext = myContext;
	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iUserMgmt_userLogin0(de.uka.ipd.sdq.simucomframework.Context ctx)
	{
		if (this.getModel().getConfiguration().getSimulateFailures()) {
			// Simulate a failure if one or multiple of the processing resources
			// required by the executing resource container are currently unavailable:
			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer container = ctx.findResource(this.completeAssemblyContextID);
			java.util.List<de.uka.ipd.sdq.simucomframework.resources.AbstractScheduledResource> failedResources = container.getFailedResources();
			if(failedResources.size() > 0){
				double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
				int index = (int)Math.floor(randValue * failedResources.size());
				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
					this.getModel(),this.getModel().getFailureStatistics().getInternalHardwareFailureType(
								container.getResourceContainerID(),
								failedResources.get(index).getResourceTypeId()));
			}
		}
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame =
		new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame =
		ctx.getStack().currentStackFrame();
	if (this.myDefaultComponentStackFrame.getContents().size() > 0) {
		methodBodyStackFrame.addVariables(this.myDefaultComponentStackFrame);
	}
	if (this.myComponentStackFrame.getContents().size() > 0) {
		methodBodyStackFrame.addVariables(this.myComponentStackFrame);
	}
	action_O72Z0FhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_aElBwFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_O72Z0VhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_O72Z0FhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_aElBwFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = login, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("4.8E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_aElBwFhGEd6UHd_VhJH9SQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.1",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_O72Z0VhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iUserMgmt_userLogout1(de.uka.ipd.sdq.simucomframework.Context ctx)
	{
		if (this.getModel().getConfiguration().getSimulateFailures()) {
			// Simulate a failure if one or multiple of the processing resources
			// required by the executing resource container are currently unavailable:
			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer container = ctx.findResource(this.completeAssemblyContextID);
			java.util.List<de.uka.ipd.sdq.simucomframework.resources.AbstractScheduledResource> failedResources = container.getFailedResources();
			if(failedResources.size() > 0){
				double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
				int index = (int)Math.floor(randValue * failedResources.size());
				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
					this.getModel(),this.getModel().getFailureStatistics().getInternalHardwareFailureType(
								container.getResourceContainerID(),
								failedResources.get(index).getResourceTypeId()));
			}
		}
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame =
		new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame =
		ctx.getStack().currentStackFrame();
	if (this.myDefaultComponentStackFrame.getContents().size() > 0) {
		methodBodyStackFrame.addVariables(this.myDefaultComponentStackFrame);
	}
	if (this.myComponentStackFrame.getContents().size() > 0) {
		methodBodyStackFrame.addVariables(this.myComponentStackFrame);
	}
	action_O72Z01hGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_dzI__MFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_O72Z1FhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_O72Z01hGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_dzI__MFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = logoff, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("1.0E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_dzI-MFhGEd6UHd_VhJH9SQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.2  ",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_O72Z1FhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iUserMgmt_logUserActivity2(de.uka.ipd.sdq.simucomframework.Context ctx)
	{
		if (this.getModel().getConfiguration().getSimulateFailures()) {
			// Simulate a failure if one or multiple of the processing resources
			// required by the executing resource container are currently unavailable:
			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer container = ctx.findResource(this.completeAssemblyContextID);
			java.util.List<de.uka.ipd.sdq.simucomframework.resources.AbstractScheduledResource> failedResources = container.getFailedResources();
			if(failedResources.size() > 0){
				double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
				int index = (int)Math.floor(randValue * failedResources.size());
				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
					this.getModel(),this.getModel().getFailureStatistics().getInternalHardwareFailureType(
								container.getResourceContainerID(),
								failedResources.get(index).getResourceTypeId()));
			}
		}
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame =
		new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
	de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame =
		ctx.getStack().currentStackFrame();
	if (this.myDefaultComponentStackFrame.getContents().size() > 0) {
		methodBodyStackFrame.addVariables(this.myDefaultComponentStackFrame);
	}
	if (this.myComponentStackFrame.getContents().size() > 0) {
		methodBodyStackFrame.addVariables(this.myComponentStackFrame);
	}
	action_abMUQFjxEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_a2UKAFjxEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_abMUQVjxEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_abMUQFjxEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_a2UKAFjxEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = log, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("3.6E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_a2UKAFjxEd6UHd_VhJH9SQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.01",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_abMUQVjxEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		// Component Parameter Defaults
		// TODO: The stackframes are not yet initialised by calling setComponentFrame in Protocom, thus initialize them here, too
		protected de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myDefaultComponentStackFrame = new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
	
		// Component Parameter setter
		// TODO: The stackframes are not yet initialised by calling setComponentFrame in Protocom, thus initialize them here, too
		protected de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame = new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		
		public void setComponentFrame(de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> myComponentStackFrame) {
			this.myComponentStackFrame = myComponentStackFrame;	
			this.myDefaultComponentStackFrame = new de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>();
		}
	
}
