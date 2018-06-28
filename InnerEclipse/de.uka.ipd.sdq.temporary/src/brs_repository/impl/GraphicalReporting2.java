package brs_repository.impl;

public class GraphicalReporting2
implements brs_repository.impl.IGraphicalReporting2
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
		
		public GraphicalReporting2 (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
			this.completeAssemblyContextID = completeAssemblyContextID;
			this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
			this.model = model;
			
			// Setup calculators for service call graphicalReport,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_cQJ6oGOLEeWmJ6LLpeOQRQ)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_cQJ6oGOLEeWmJ6LLpeOQRQ/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>")));
				}
			// Setup calculators for service call viewGraphically,
		}
	protected brs_repository.impl.ports.IGraphicalReport_GraphicalReporting2 m_portProvided_IGraphicalReport_GraphicalReporting2 = new brs_repository.impl.ports.IGraphicalReport_GraphicalReporting2(this);
	public brs_repository.IGraphicalReport getPortProvided_IGraphicalReport_GraphicalReporting2() {
		return m_portProvided_IGraphicalReport_GraphicalReporting2;
	}
	protected brs_repository.impl.contexts.IGraphicalReporting2Context myContext = null;
	public void setContext(brs_repository.impl.contexts.IGraphicalReporting2Context myContext) {
		this.myContext = myContext;
	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iGraphicalReport_graphicalReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_9WEBAGOKEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_U7wf8GOLEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_cQJ6oGOLEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_ZnDU8GOMEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   	   action_9WEBAWOKEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_9WEBAGOKEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = start, Type = StartAction
		    	}
		    	private void action_U7wf8GOLEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = setUp, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("2.0E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_U7wf8GOLEeWmJ6LLpeOQRQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("1.5",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_cQJ6oGOLEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_getReport0 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_getReport0; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__cQJ6oGOLEeWmJ6LLpeOQRQ=null;
		    	   					int stackSize__cQJ6oGOLEeWmJ6LLpeOQRQ=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   			stackframe.addValue("isDetailed.VALUE",
		    	   			   	ctx.evaluate("isDetailed.VALUE",currentFrame));
		    	   			stackframe.addValue("requestedEntries.VALUE",
		    	   			   	ctx.evaluate("requestedEntries.VALUE",currentFrame));
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_GraphicalReporting2().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IReporting_GraphicalReporting2().getReport0
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_GraphicalReporting2().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__cQJ6oGOLEeWmJ6LLpeOQRQ = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__cQJ6oGOLEeWmJ6LLpeOQRQ = 0; frameCount__cQJ6oGOLEeWmJ6LLpeOQRQ < ctx.getStack().size() - stackSize__cQJ6oGOLEeWmJ6LLpeOQRQ; ++frameCount__cQJ6oGOLEeWmJ6LLpeOQRQ) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IReporting.getReport0 <Component: GraphicalReporting2, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _cQJ6oGOLEeWmJ6LLpeOQRQ>",
		    	   			"_cQJ6oGOLEeWmJ6LLpeOQRQ",
		    	   			failureException__cQJ6oGOLEeWmJ6LLpeOQRQ,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__cQJ6oGOLEeWmJ6LLpeOQRQ != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__cQJ6oGOLEeWmJ6LLpeOQRQ;
		    	   			}
		    	   			if(retries == tries_getReport0-1) { // retry count exceeded?
		    	   				throw failureException__cQJ6oGOLEeWmJ6LLpeOQRQ;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__cQJ6oGOLEeWmJ6LLpeOQRQ.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_ZnDU8GOMEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = calculateReport, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("3.0E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_ZnDU8GOMEeWmJ6LLpeOQRQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("requestedEntries.VALUE * 0.7",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_9WEBAWOKEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = stop, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iGraphicalReport_viewGraphically1(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_9WEBA2OKEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_9WEBBGOKEeWmJ6LLpeOQRQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_9WEBA2OKEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = start, Type = StartAction
		    	}
		    	private void action_9WEBBGOKEeWmJ6LLpeOQRQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = stop, Type = StopAction
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
