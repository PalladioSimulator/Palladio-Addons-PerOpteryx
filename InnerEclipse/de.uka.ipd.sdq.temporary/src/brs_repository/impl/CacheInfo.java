package brs_repository.impl;

public class CacheInfo
implements brs_repository.impl.ICacheInfo
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
		
		public CacheInfo (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
			this.completeAssemblyContextID = completeAssemblyContextID;
			this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
			this.model = model;
			
			// Setup calculators for service call doCacheAccess,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_d2S7MNo-EdyxgfK4Hy_RFA)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_d2S7MNo-EdyxgfK4Hy_RFA/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>")));
				}
		}
	protected brs_repository.impl.ports.ICache_CacheInfo m_portProvided_ICache_CacheInfo = new brs_repository.impl.ports.ICache_CacheInfo(this);
	public brs_repository.ICache getPortProvided_ICache_CacheInfo() {
		return m_portProvided_ICache_CacheInfo;
	}
	protected brs_repository.impl.contexts.ICacheInfoContext myContext = null;
	public void setContext(brs_repository.impl.contexts.ICacheInfoContext myContext) {
		this.myContext = myContext;
	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iCache_doCacheAccess0(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_gENZsNo9EdyxgfK4Hy_RFA(ctx, resultStackFrame, methodBodyStackFrame);
		   action_k0BHUFhDEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_eJP4cFhDEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_gENZsdo9EdyxgfK4Hy_RFA(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_gENZsNo9EdyxgfK4Hy_RFA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_k0BHUFhDEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = checkCache, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("1.1E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_k0BHUFhDEd6UHd_VhJH9SQ"));
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
		    	private void action_eJP4cFhDEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = cached, Type = BranchAction
		    	   {
		    	   	double u_eJP4cFhDEd6UHd_VhJH9SQ = (Double)ctx.evaluate("DoublePDF[(1.0;1.0)]",Double.class);
		    	   	double sum_eJP4cFhDEd6UHd_VhJH9SQ = 0;
		    	   	if (sum_eJP4cFhDEd6UHd_VhJH9SQ <= u_eJP4cFhDEd6UHd_VhJH9SQ && u_eJP4cFhDEd6UHd_VhJH9SQ < sum_eJP4cFhDEd6UHd_VhJH9SQ + 0.2 )
		    	   	{
		    	   		action_gh1gcVhDEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   action_gh1gclhDEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		    	   	}
		    	   	sum_eJP4cFhDEd6UHd_VhJH9SQ += 0.2;
		    	   	if (sum_eJP4cFhDEd6UHd_VhJH9SQ <= u_eJP4cFhDEd6UHd_VhJH9SQ && u_eJP4cFhDEd6UHd_VhJH9SQ < sum_eJP4cFhDEd6UHd_VhJH9SQ + 0.8 )
		    	   	{
		    	   		action_hBIrkVhDEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   action_cOFnQNo__EdyxgfK4Hy_RFA(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   	   action_d2S7MNo__EdyxgfK4Hy_RFA(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   	   	   action_hBIrklhDEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		    	   	}
		    	   	sum_eJP4cFhDEd6UHd_VhJH9SQ += 0.8;
		    	   }
		    	}
		    	private void action_gh1gcVhDEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_gh1gclhDEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	} 
		    	private void action_hBIrkVhDEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_cOFnQNo__EdyxgfK4Hy_RFA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = prepareDBAccess, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("2.5E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_cOFnQNo-EdyxgfK4Hy_RFA"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.04  ",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_d2S7MNo__EdyxgfK4Hy_RFA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_getCachedData2 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_getCachedData2; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__d2S7MNo__EdyxgfK4Hy_RFA=null;
		    	   					int stackSize__d2S7MNo__EdyxgfK4Hy_RFA=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CacheInfo().getComponentAssemblyContext().getId());
		    	   			} catch (de.uka.ipd.sdq.simucomframework.exceptions.ResourceContainerNotFound exception) {
		    	   				// If the call is system external, no target resource container will be found.
		    	   			}
		    	   			if ((fromContainer != null) && (toContainer != null) && (!fromContainer.getResourceContainerID().equals(toContainer.getResourceContainerID()))) {
		    	   				String linkingResourceID = main.ResourceEnvironment.getInstance().getLinkingResourceContainerID(fromContainer.getResourceContainerID(), toContainer.getResourceContainerID());
		    	   				if (linkingResourceID == null) {
		    	   					linkingResourceID = main.ResourceEnvironment.getInstance().getLinkingResourceContainerID(toContainer.getResourceContainerID(), fromContainer.getResourceContainerID());
		    	   				}
		    	   				// If the linkingResourceID is NULL, we have to assume that no linking resource has been specified.
		    	   				// In this case, we assume a perfect link that never fails and has no latency and unlimited throughput.
		    	   				if (linkingResourceID != null) {
		    	   					de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResourceContainer linkingContainer = ctx.findLinkingResource(linkingResourceID);
		    	   					// Load linking resource with a demand of 0 byte so that only the latency is considered.
		    	   					// The bytesize is only considered when the completions are activated (ctx.getModel().getConfig().getSimulateLinkingResources() == true).
		    	   					double demand = 0.0;
		    	   					try {
		    	   						// If completions are activated, they fill in the results of their BYTESIZE calculation into the variable stream.BYTESIZE
		    	   						// in the stackframe of this method (stored as currentStackframe above).
		    	   						if (currentFrame.getValue("stream.BYTESIZE") != null) {
		    	   							demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(de.uka.ipd.sdq.simucomframework.variables.StackContext.evaluateStatic("stream.BYTESIZE", Double.class, currentFrame));
		    	   						}
		    	   					} catch(de.uka.ipd.sdq.simucomframework.variables.exceptions.ValueNotInFrameException valueNotInFrameException) {
		    	   						try {
		    	   							if (ctx.getModel().getConfiguration().getSimulateThroughputOfLinkingResources()){
		    	   								// if no stream.BYTESIZE variable is available, the demand is calculated by summing up all the sent variables with BYTESIZE characterization  
		    	   								java.util.ArrayList<java.util.Map.Entry<String, Object>> stackFrameContent = stackframe.getContents();
		    	   								for (java.util.Map.Entry<String, Object> entry : stackFrameContent) {
		    	   									if (entry.getKey().endsWith("BYTESIZE")){
		    	   										if (entry.getKey().contains(".INNER.")){
		    	   											// TODO: include logic to determine proper BYTESIZE of the call, take from completions code. 
		    	   											logger.warn("Network demand cannot be properly determined for INNER BYTESIZE characterizations yet, the simulation will assume that there is just a single element in the collection. Please enable the ''simulate middleware marshalling / demarshalling of remote calls'' in the feature settings tab or directly define the BYTESIZE of the collection.");
		    	   										}
		    	   										demand += de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(entry.getValue());
		    	   									}
		    	   								}
		    	   							} // else the demand stays 0.0
		    	   						} catch (RuntimeException e){
		    	   							logger.error("Cannot cast BYTESIZE characterization of the following variable to double for calculating the network demand in "+this.getClass()+": "+e.getMessage());
		    	   						}
		    	   					}
		    	   					linkingContainer.loadActiveResource(ctx.getThread(), fromContainer.getResourceContainerID(), linkingContainer.getLinkingResourceTypeId(), demand);
		    	   				} else {
		    	   					throw new RuntimeException("A component on the resource container with id "+fromContainer.getResourceContainerID()+" calls a component on resource container with id "+toContainer.getResourceContainerID()+", but there is no linking resource between the containers! Add a LinkingResource or change the component allocation.");
		    	   				}
		    	   			}
		    	   		}
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
		    	   		myContext.getRoleRequired_IDB_CacheInfo().getCachedData2
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CacheInfo().getComponentAssemblyContext().getId());
		    	   				} catch (de.uka.ipd.sdq.simucomframework.exceptions.ResourceContainerNotFound exception) {
		    	   					// If the call is system external, no target resource container will be found.
		    	   				}
		    	   				if ((fromContainer != null) && (toContainer != null) && (!fromContainer.getResourceContainerID().equals(toContainer.getResourceContainerID()))) {
		    	   					String linkingResourceID = main.ResourceEnvironment.getInstance().getLinkingResourceContainerID(fromContainer.getResourceContainerID(), toContainer.getResourceContainerID());
		    	   					if (linkingResourceID == null) {
		    	   						linkingResourceID = main.ResourceEnvironment.getInstance().getLinkingResourceContainerID(toContainer.getResourceContainerID(), fromContainer.getResourceContainerID());
		    	   					}
		    	   					// If the linkingResourceID is NULL, we have to assume that no linking resource has been specified.
		    	   					// In this case, we assume a perfect link that never fails and has no latency and unlimited throughput.
		    	   					if (linkingResourceID != null) {
		    	   						de.uka.ipd.sdq.simucomframework.resources.SimulatedLinkingResourceContainer linkingContainer = ctx.findLinkingResource(linkingResourceID);
		    	   						// Load linking resource with a demand of 0 byte so that only the latency is considered.
		    	   						// The bytesize is only considered when the completions are activated (ctx.getModel().getConfig().getSimulateLinkingResources() == true).
		    	   						double demand = 0.0;
		    	   						try {
		    	   							// If completions are activated, they fill in the results of their BYTESIZE calculation into the variable stream.BYTESIZE
		    	   							// in the stackframe of this method (stored as currentStackframe above).
		    	   							if (currentFrame.getValue("stream.BYTESIZE") != null) {
		    	   								demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(de.uka.ipd.sdq.simucomframework.variables.StackContext.evaluateStatic("stream.BYTESIZE", Double.class, currentFrame));
		    	   							}
		    	   						} catch(de.uka.ipd.sdq.simucomframework.variables.exceptions.ValueNotInFrameException valueNotInFrameException) {
		    	   							try {
		    	   								if (ctx.getModel().getConfiguration().getSimulateThroughputOfLinkingResources()){
		    	   									// if no stream.BYTESIZE variable is available, the demand is calculated by summing up all the sent variables with BYTESIZE characterization  
		    	   									java.util.ArrayList<java.util.Map.Entry<String, Object>> stackFrameContent = callResult.getContents();
		    	   									for (java.util.Map.Entry<String, Object> entry : stackFrameContent) {
		    	   										if (entry.getKey().endsWith("BYTESIZE")){
		    	   											if (entry.getKey().contains(".INNER.")){
		    	   												// TODO: include logic to determine proper BYTESIZE of the call, take from completions code. 
		    	   												logger.warn("Network demand cannot be properly determined for INNER BYTESIZE characterizations yet, the simulation will assume that there is just a single element in the collection. Please enable the ''simulate middleware marshalling / demarshalling of remote calls'' in the feature settings tab or directly define the BYTESIZE of the collection.");
		    	   											}
		    	   											demand += de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(entry.getValue());
		    	   										}
		    	   									}
		    	   								} // else the demand stays 0.0
		    	   							} catch (RuntimeException e){
		    	   								logger.error("Cannot cast BYTESIZE characterization of the following variable to double for calculating the network demand in "+this.getClass()+": "+e.getMessage());
		    	   							}
		    	   						}
		    	   						linkingContainer.loadActiveResource(ctx.getThread(), fromContainer.getResourceContainerID(), linkingContainer.getLinkingResourceTypeId(), demand);
		    	   					} else {
		    	   						throw new RuntimeException("A component on the resource container with id "+fromContainer.getResourceContainerID()+" calls a component on resource container with id "+toContainer.getResourceContainerID()+", but there is no linking resource between the containers! Add a LinkingResource or change the component allocation.");
		    	   					}
		    	   				}
		    	   			}
		    	   			// Stop the time measurement
		    	   			// Take current time
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__d2S7MNo__EdyxgfK4Hy_RFA = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__d2S7MNo__EdyxgfK4Hy_RFA = 0; frameCount__d2S7MNo__EdyxgfK4Hy_RFA < ctx.getStack().size() - stackSize__d2S7MNo__EdyxgfK4Hy_RFA; ++frameCount__d2S7MNo__EdyxgfK4Hy_RFA) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IDB.getCachedData2 <Component: CacheInfo, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _d2S7MNo-EdyxgfK4Hy_RFA>",
		    	   			"_d2S7MNo-EdyxgfK4Hy_RFA",
		    	   			failureException__d2S7MNo__EdyxgfK4Hy_RFA,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__d2S7MNo__EdyxgfK4Hy_RFA != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__d2S7MNo__EdyxgfK4Hy_RFA;
		    	   			}
		    	   			if(retries == tries_getCachedData2-1) { // retry count exceeded?
		    	   				throw failureException__d2S7MNo__EdyxgfK4Hy_RFA;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__d2S7MNo__EdyxgfK4Hy_RFA.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_hBIrklhDEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_gENZsdo9EdyxgfK4Hy_RFA(
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
