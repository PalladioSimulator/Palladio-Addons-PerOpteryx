package brs_repository.impl;

public class CRESingleMessageAdapter
implements brs_repository.impl.ICRESingleMessageAdapter
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
		
		public CRESingleMessageAdapter (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
			this.completeAssemblyContextID = completeAssemblyContextID;
			this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
			this.model = model;
			
			// Setup calculators for service call getSmallReportInner,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_gypPoGo2Ed631pecjlFspw)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_gypPoGo2Ed631pecjlFspw/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>")));
				}
			// Setup calculators for service call getBigReportInner,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_yjTN0Go2Ed631pecjlFspw)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_yjTN0Go2Ed631pecjlFspw/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>")));
				}
			// Setup calculators for service call getCachedDataInner,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_6YoLUGo2Ed631pecjlFspw)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_6YoLUGo2Ed631pecjlFspw/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>")));
				}
		}
	protected brs_repository.impl.ports.IInnerDB_CRESingleMessageAdapter m_portProvided_IDB_CRESingleMessageAdapter = new brs_repository.impl.ports.IInnerDB_CRESingleMessageAdapter(this);
	public brs_repository.IInnerDB getPortProvided_IDB_CRESingleMessageAdapter() {
		return m_portProvided_IDB_CRESingleMessageAdapter;
	}
	protected brs_repository.impl.contexts.ICRESingleMessageAdapterContext myContext = null;
	public void setContext(brs_repository.impl.contexts.ICRESingleMessageAdapterContext myContext) {
		this.myContext = myContext;
	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iInnerDB_getSmallReportInner0(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_Uu6_Emo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		   action_r8sGMGo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_Uu6_E2o2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_Uu6_Emo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_r8sGMGo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = call_db_for_small_report_from_single_message_adapter_loop, Type = LoopAction
		    	   for (int iterationCount_r8sGMGo2Ed631pecjlFspw = 0, maxIterationCount_r8sGMGo2Ed631pecjlFspw = (Integer)ctx.evaluate("noOfEntries.VALUE",Integer.class);
		    	            iterationCount_r8sGMGo2Ed631pecjlFspw < maxIterationCount_r8sGMGo2Ed631pecjlFspw; iterationCount_r8sGMGo2Ed631pecjlFspw++){
		    	       action_r8sGMWo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   action_gypPoGo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   	   action_r8sGMmo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		    	   }
		    	}
		    	private void action_r8sGMWo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_gypPoGo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_getSmallReport0 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_getSmallReport0; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__gypPoGo2Ed631pecjlFspw=null;
		    	   					int stackSize__gypPoGo2Ed631pecjlFspw=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   			stackframe.addValue("noOfEntries.VALUE",
		    	   			   	ctx.evaluate("1",currentFrame));
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getSmallReport0
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__gypPoGo2Ed631pecjlFspw = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__gypPoGo2Ed631pecjlFspw = 0; frameCount__gypPoGo2Ed631pecjlFspw < ctx.getStack().size() - stackSize__gypPoGo2Ed631pecjlFspw; ++frameCount__gypPoGo2Ed631pecjlFspw) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IDB.getSmallReport0 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _gypPoGo2Ed631pecjlFspw>",
		    	   			"_gypPoGo2Ed631pecjlFspw",
		    	   			failureException__gypPoGo2Ed631pecjlFspw,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__gypPoGo2Ed631pecjlFspw != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__gypPoGo2Ed631pecjlFspw;
		    	   			}
		    	   			if(retries == tries_getSmallReport0-1) { // retry count exceeded?
		    	   				throw failureException__gypPoGo2Ed631pecjlFspw;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__gypPoGo2Ed631pecjlFspw.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_r8sGMmo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_Uu6_E2o2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iInnerDB_getBigReportInner1(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_Uu6_FWo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		   action_xOJYwGo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_Uu6_Fmo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_Uu6_FWo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_xOJYwGo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = call_db_for_big_report_from_single_message_adapter_loop, Type = LoopAction
		    	   for (int iterationCount_xOJYwGo2Ed631pecjlFspw = 0, maxIterationCount_xOJYwGo2Ed631pecjlFspw = (Integer)ctx.evaluate("noOfEntries.VALUE",Integer.class);
		    	            iterationCount_xOJYwGo2Ed631pecjlFspw < maxIterationCount_xOJYwGo2Ed631pecjlFspw; iterationCount_xOJYwGo2Ed631pecjlFspw++){
		    	       action_xOJYwWo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   action_yjTN0Go2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   	   action_xOJYwmo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		    	   }
		    	}
		    	private void action_xOJYwWo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_yjTN0Go2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_getBigReport1 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_getBigReport1; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__yjTN0Go2Ed631pecjlFspw=null;
		    	   					int stackSize__yjTN0Go2Ed631pecjlFspw=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   			stackframe.addValue("noOfEntries.VALUE",
		    	   			   	ctx.evaluate("1",currentFrame));
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getBigReport1
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__yjTN0Go2Ed631pecjlFspw = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__yjTN0Go2Ed631pecjlFspw = 0; frameCount__yjTN0Go2Ed631pecjlFspw < ctx.getStack().size() - stackSize__yjTN0Go2Ed631pecjlFspw; ++frameCount__yjTN0Go2Ed631pecjlFspw) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IDB.getBigReport1 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _yjTN0Go2Ed631pecjlFspw>",
		    	   			"_yjTN0Go2Ed631pecjlFspw",
		    	   			failureException__yjTN0Go2Ed631pecjlFspw,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__yjTN0Go2Ed631pecjlFspw != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__yjTN0Go2Ed631pecjlFspw;
		    	   			}
		    	   			if(retries == tries_getBigReport1-1) { // retry count exceeded?
		    	   				throw failureException__yjTN0Go2Ed631pecjlFspw;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__yjTN0Go2Ed631pecjlFspw.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_xOJYwmo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_Uu6_Fmo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iInnerDB_getCachedDataInner2(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_Uu6_GGo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		   action_6YoLUGo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_Uu6_GWo2Ed631pecjlFspw(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_Uu6_GGo2Ed631pecjlFspw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_6YoLUGo2Ed631pecjlFspw(
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
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__6YoLUGo2Ed631pecjlFspw=null;
		    	   					int stackSize__6YoLUGo2Ed631pecjlFspw=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getCachedData2
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IDB_CRESingleMessageAdapter().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__6YoLUGo2Ed631pecjlFspw = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__6YoLUGo2Ed631pecjlFspw = 0; frameCount__6YoLUGo2Ed631pecjlFspw < ctx.getStack().size() - stackSize__6YoLUGo2Ed631pecjlFspw; ++frameCount__6YoLUGo2Ed631pecjlFspw) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IDB.getCachedData2 <Component: CRESingleMessageAdapter, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _6YoLUGo2Ed631pecjlFspw>",
		    	   			"_6YoLUGo2Ed631pecjlFspw",
		    	   			failureException__6YoLUGo2Ed631pecjlFspw,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__6YoLUGo2Ed631pecjlFspw != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__6YoLUGo2Ed631pecjlFspw;
		    	   			}
		    	   			if(retries == tries_getCachedData2-1) { // retry count exceeded?
		    	   				throw failureException__6YoLUGo2Ed631pecjlFspw;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__6YoLUGo2Ed631pecjlFspw.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_Uu6_GWo2Ed631pecjlFspw(
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
