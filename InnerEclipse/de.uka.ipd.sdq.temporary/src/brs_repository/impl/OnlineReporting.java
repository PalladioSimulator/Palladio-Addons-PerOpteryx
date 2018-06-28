package brs_repository.impl;

public class OnlineReporting
implements brs_repository.impl.IOnlineReporting
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
		
		public OnlineReporting (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
			this.completeAssemblyContextID = completeAssemblyContextID;
			this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
			this.model = model;
			
			// Setup calculators for service call onlineReport,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_hwDx4FelEd6zR8NNmb-sJg)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_hwDx4FelEd6zR8NNmb-sJg/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>")));
				}
			// Setup calculators for service call viewOnline,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_AOTB4F85Ed6-caU7WM0FRw)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_AOTB4F85Ed6-caU7WM0FRw/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>")));
				}
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_YUt40FelEd6zR8NNmb-sJg)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_YUt40FelEd6zR8NNmb-sJg/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>")));
				}
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_AoYV0F85Ed6-caU7WM0FRw)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_AoYV0F85Ed6-caU7WM0FRw/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>")));
				}
		}
	protected brs_repository.impl.ports.IOnlineReport_OnlineReporting m_portProvided_IReporting_OnlineReporting = new brs_repository.impl.ports.IOnlineReport_OnlineReporting(this);
	public brs_repository.IOnlineReport getPortProvided_IReporting_OnlineReporting() {
		return m_portProvided_IReporting_OnlineReporting;
	}
	protected brs_repository.impl.contexts.IOnlineReportingContext myContext = null;
	public void setContext(brs_repository.impl.contexts.IOnlineReportingContext myContext) {
		this.myContext = myContext;
	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iOnlineReport_onlineReport0(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_TnQrMlelEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   action_f0rqUFelEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_hwDx4FelEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_TnQrM1elEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_TnQrMlelEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_f0rqUFelEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = setUpReport, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("2.6E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_f0rqUFelEd6zR8NNmb-sJg"));
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
		    	private void action_hwDx4FelEd6zR8NNmb__sJg(
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
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__hwDx4FelEd6zR8NNmb__sJg=null;
		    	   					int stackSize__hwDx4FelEd6zR8NNmb__sJg=ctx.getStack().size();
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
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IReporting_OnlineReporting().getReport0
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__hwDx4FelEd6zR8NNmb__sJg = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__hwDx4FelEd6zR8NNmb__sJg = 0; frameCount__hwDx4FelEd6zR8NNmb__sJg < ctx.getStack().size() - stackSize__hwDx4FelEd6zR8NNmb__sJg; ++frameCount__hwDx4FelEd6zR8NNmb__sJg) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IReporting.getReport0 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hwDx4FelEd6zR8NNmb-sJg>",
		    	   			"_hwDx4FelEd6zR8NNmb-sJg",
		    	   			failureException__hwDx4FelEd6zR8NNmb__sJg,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__hwDx4FelEd6zR8NNmb__sJg != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__hwDx4FelEd6zR8NNmb__sJg;
		    	   			}
		    	   			if(retries == tries_getReport0-1) { // retry count exceeded?
		    	   				throw failureException__hwDx4FelEd6zR8NNmb__sJg;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__hwDx4FelEd6zR8NNmb__sJg.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_TnQrM1elEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iOnlineReport_viewOnline1(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_TnQrNVelEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   action_D__KCYGu8Ed650qyoIpbFeQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_JOYwEF8__Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_YUt40FelEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   	   action_KfvqQF8__Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   	   	   action_Cs__osHHuEd66BqgX2__RZOg(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   	   	   	   action_TnQrNlelEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_TnQrNVelEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_D__KCYGu8Ed650qyoIpbFeQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = prepareView, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("3.3E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_D-KCYGu8Ed650qyoIpbFeQ"));
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
		    	private void action_JOYwEF8__Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = call_prepare_view_loop_from_OR, Type = LoopAction
		    	   for (int iterationCount_JOYwEF8__Ed6__caU7WM0FRw = 0, maxIterationCount_JOYwEF8__Ed6__caU7WM0FRw = (Integer)ctx.evaluate("3",Integer.class);
		    	            iterationCount_JOYwEF8__Ed6__caU7WM0FRw < maxIterationCount_JOYwEF8__Ed6__caU7WM0FRw; iterationCount_JOYwEF8__Ed6__caU7WM0FRw++){
		    	       action_JOihEF8__Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   action_AOTB4F85Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   	   action_JOihEV8__Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		    	   }
		    	}
		    	private void action_JOihEF8__Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_AOTB4F85Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_prepareView2 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_prepareView2; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__AOTB4F85Ed6__caU7WM0FRw=null;
		    	   					int stackSize__AOTB4F85Ed6__caU7WM0FRw=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   			stackframe.addValue("info.BYTESIZE",
		    	   			   	ctx.evaluate("64+20  ",currentFrame));
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IReporting_OnlineReporting().prepareView2
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__AOTB4F85Ed6__caU7WM0FRw = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__AOTB4F85Ed6__caU7WM0FRw = 0; frameCount__AOTB4F85Ed6__caU7WM0FRw < ctx.getStack().size() - stackSize__AOTB4F85Ed6__caU7WM0FRw; ++frameCount__AOTB4F85Ed6__caU7WM0FRw) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IReporting.prepareView2 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AOTB4F85Ed6-caU7WM0FRw>",
		    	   			"_AOTB4F85Ed6-caU7WM0FRw",
		    	   			failureException__AOTB4F85Ed6__caU7WM0FRw,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__AOTB4F85Ed6__caU7WM0FRw != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__AOTB4F85Ed6__caU7WM0FRw;
		    	   			}
		    	   			if(retries == tries_prepareView2-1) { // retry count exceeded?
		    	   				throw failureException__AOTB4F85Ed6__caU7WM0FRw;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__AOTB4F85Ed6__caU7WM0FRw.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_JOihEV8__Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_YUt40FelEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_getView1 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_getView1; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__YUt40FelEd6zR8NNmb__sJg=null;
		    	   					int stackSize__YUt40FelEd6zR8NNmb__sJg=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IReporting_OnlineReporting().getView1
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__YUt40FelEd6zR8NNmb__sJg = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__YUt40FelEd6zR8NNmb__sJg = 0; frameCount__YUt40FelEd6zR8NNmb__sJg < ctx.getStack().size() - stackSize__YUt40FelEd6zR8NNmb__sJg; ++frameCount__YUt40FelEd6zR8NNmb__sJg) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IReporting.getView1 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _YUt40FelEd6zR8NNmb-sJg>",
		    	   			"_YUt40FelEd6zR8NNmb-sJg",
		    	   			failureException__YUt40FelEd6zR8NNmb__sJg,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__YUt40FelEd6zR8NNmb__sJg != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__YUt40FelEd6zR8NNmb__sJg;
		    	   			}
		    	   			if(retries == tries_getView1-1) { // retry count exceeded?
		    	   				throw failureException__YUt40FelEd6zR8NNmb__sJg;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__YUt40FelEd6zR8NNmb__sJg.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_KfvqQF8__Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = call_finish_view_loop_in_OR, Type = LoopAction
		    	   for (int iterationCount_KfvqQF8__Ed6__caU7WM0FRw = 0, maxIterationCount_KfvqQF8__Ed6__caU7WM0FRw = (Integer)ctx.evaluate("3",Integer.class);
		    	            iterationCount_KfvqQF8__Ed6__caU7WM0FRw < maxIterationCount_KfvqQF8__Ed6__caU7WM0FRw; iterationCount_KfvqQF8__Ed6__caU7WM0FRw++){
		    	       action_KfvqQV8__Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   action_AoYV0F85Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		    	       	   	   action_KfvqQl8__Ed6__caU7WM0FRw(ctx, resultStackFrame, methodBodyStackFrame);
		    	   }
		    	}
		    	private void action_KfvqQV8__Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_AoYV0F85Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_finishView3 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_finishView3; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__AoYV0F85Ed6__caU7WM0FRw=null;
		    	   					int stackSize__AoYV0F85Ed6__caU7WM0FRw=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   			stackframe.addValue("status.BYTESIZE",
		    	   			   	ctx.evaluate("16+20",currentFrame));
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IReporting_OnlineReporting().finishView3
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IReporting_OnlineReporting().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__AoYV0F85Ed6__caU7WM0FRw = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__AoYV0F85Ed6__caU7WM0FRw = 0; frameCount__AoYV0F85Ed6__caU7WM0FRw < ctx.getStack().size() - stackSize__AoYV0F85Ed6__caU7WM0FRw; ++frameCount__AoYV0F85Ed6__caU7WM0FRw) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IReporting.finishView3 <Component: OnlineReporting, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _AoYV0F85Ed6-caU7WM0FRw>",
		    	   			"_AoYV0F85Ed6-caU7WM0FRw",
		    	   			failureException__AoYV0F85Ed6__caU7WM0FRw,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__AoYV0F85Ed6__caU7WM0FRw != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__AoYV0F85Ed6__caU7WM0FRw;
		    	   			}
		    	   			if(retries == tries_finishView3-1) { // retry count exceeded?
		    	   				throw failureException__AoYV0F85Ed6__caU7WM0FRw;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__AoYV0F85Ed6__caU7WM0FRw.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_KfvqQl8__Ed6__caU7WM0FRw(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_Cs__osHHuEd66BqgX2__RZOg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = finishView, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("5.6E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_Cs-osHHuEd66BqgX2-RZOg"));
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
		    	private void action_TnQrNlelEd6zR8NNmb__sJg(
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
