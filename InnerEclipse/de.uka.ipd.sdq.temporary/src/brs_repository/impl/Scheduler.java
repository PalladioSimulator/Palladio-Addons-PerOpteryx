package brs_repository.impl;

public class Scheduler
implements brs_repository.impl.IScheduler
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
		
		public Scheduler (String completeAssemblyContextID, String assemblyContextURI, de.uka.ipd.sdq.simucomframework.model.SimuComModel model) {
			this.completeAssemblyContextID = completeAssemblyContextID;
			this.assemblyContext = (org.palladiosimulator.pcm.core.composition.AssemblyContext) org.palladiosimulator.commons.emfutils.EMFLoadHelper.loadAndResolveEObject(assemblyContextURI);
			this.model = model;
			
			// Setup calculators for service call report,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_ebMmAFjxEd6UHd_VhJH9SQ)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_ebMmAFjxEd6UHd_VhJH9SQ/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>")));
				}
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_jP7-UFenEd6zR8NNmb-sJg)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_jP7-UFenEd6zR8NNmb-sJg/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>")));
				}
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_koTfcFenEd6zR8NNmb-sJg)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_koTfcFenEd6zR8NNmb-sJg/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>")));
				}
			// Setup calculators for service call view,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_hQZRgFjxEd6UHd_VhJH9SQ)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_hQZRgFjxEd6UHd_VhJH9SQ/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>")));
				}
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_350MYFenEd6zR8NNmb-sJg)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_350MYFenEd6zR8NNmb-sJg/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>")));
				}
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_4trSQFenEd6zR8NNmb-sJg)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_4trSQFenEd6zR8NNmb-sJg/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>")));
				}
			// Setup calculators for service call login,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_ScHbkFhGEd6UHd_VhJH9SQ)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_ScHbkFhGEd6UHd_VhJH9SQ/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>")));
				}
			// Setup calculators for service call logout,
			// Old: "Call "+this.calledService_ExternalService.interface__OperationSignature.entityName+"."+this.calledService_ExternalService.javaSignature()+" <AssemblyCtx: \"+this.assemblyContext.getId()+\", CallID: "+ this.id +">"
				// ExternalCallAction aName (_VI0SYFhGEd6UHd_VhJH9SQ)
				{
					java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
						java.util.Arrays.asList(
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
							(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
					
					// TODO get rid of StringMeasuringPoint and use a more concrete one.
					org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
					mp.setMeasuringPoint("Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>");
					
					org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
					myMeasurementPointRepository.getMeasuringPoints().add(mp);
					mp.setMeasuringPointRepository(myMeasurementPointRepository);
				
					getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
					this.startStopProbes.put("Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>",probes);
				}
				if(getModel().getConfiguration().getSimulateFailures()){
					//See method above
					//	getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
					//		"aName/_VI0SYFhGEd6UHd_VhJH9SQ/ExecutionResult",
					//		getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
					//			"Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>", 
					//			getModel().getProbeSpecContext().obtainProbeSetId("Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>")));
				}
		}
	protected brs_repository.impl.ports.IBRSSystem_Scheduler m_portProvided_IBRSSystem_Scheduler = new brs_repository.impl.ports.IBRSSystem_Scheduler(this);
	public brs_repository.IBRSSystem getPortProvided_IBRSSystem_Scheduler() {
		return m_portProvided_IBRSSystem_Scheduler;
	}
	protected brs_repository.impl.contexts.ISchedulerContext myContext = null;
	public void setContext(brs_repository.impl.contexts.ISchedulerContext myContext) {
		this.myContext = myContext;
	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iBRSSystem_report0(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_WnOesNo5EdyCSNQKlT1LxA(ctx, resultStackFrame, methodBodyStackFrame);
		   action_0QdhwLpDEd2fi_j9dEpB2g(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_ebMmAFjxEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_a8tj4FenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   	   action_WnPFwNo5EdyCSNQKlT1LxA(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_WnOesNo5EdyCSNQKlT1LxA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_0QdhwLpDEd2fi_j9dEpB2g(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = schedule, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("3.1E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_0QdhwLpDEd2fi_j9dEpB2g"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.05",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_ebMmAFjxEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_logUserActivity2 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_logUserActivity2; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__ebMmAFjxEd6UHd_VhJH9SQ=null;
		    	   					int stackSize__ebMmAFjxEd6UHd_VhJH9SQ=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IUserMgmt_Scheduler().logUserActivity2
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__ebMmAFjxEd6UHd_VhJH9SQ = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__ebMmAFjxEd6UHd_VhJH9SQ = 0; frameCount__ebMmAFjxEd6UHd_VhJH9SQ < ctx.getStack().size() - stackSize__ebMmAFjxEd6UHd_VhJH9SQ; ++frameCount__ebMmAFjxEd6UHd_VhJH9SQ) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ebMmAFjxEd6UHd_VhJH9SQ>",
		    	   			"_ebMmAFjxEd6UHd_VhJH9SQ",
		    	   			failureException__ebMmAFjxEd6UHd_VhJH9SQ,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__ebMmAFjxEd6UHd_VhJH9SQ != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__ebMmAFjxEd6UHd_VhJH9SQ;
		    	   			}
		    	   			if(retries == tries_logUserActivity2-1) { // retry count exceeded?
		    	   				throw failureException__ebMmAFjxEd6UHd_VhJH9SQ;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__ebMmAFjxEd6UHd_VhJH9SQ.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_a8tj4FenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = GraphicalOrOnline, Type = BranchAction
		    	   {
		    	   	if ((Boolean)ctx.evaluate("type.VALUE == \"graphical\"") == true)
		    	   	{
		    	   		action_cocs8VenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   action_jP7__UFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   	   action_cocs8lenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   	} else 
		    	   	if ((Boolean)ctx.evaluate("type.VALUE == \"online\"") == true)
		    	   	{
		    	   		action_f8CkoFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   action_koTfcFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   	   action_f8CkoVenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   	}
		    	   	else
		    	   	    logger.error("No branch condition evaluated to true in GraphicalOrOnline :-(");  
		    	   		
		    	   }
		    	}
		    	private void action_cocs8VenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_jP7__UFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_graphicalReport0 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_graphicalReport0; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__jP7__UFenEd6zR8NNmb__sJg=null;
		    	   					int stackSize__jP7__UFenEd6zR8NNmb__sJg=ctx.getStack().size();
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
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IGraphicalReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IGraphicalReport_Scheduler().graphicalReport0
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IGraphicalReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__jP7__UFenEd6zR8NNmb__sJg = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__jP7__UFenEd6zR8NNmb__sJg = 0; frameCount__jP7__UFenEd6zR8NNmb__sJg < ctx.getStack().size() - stackSize__jP7__UFenEd6zR8NNmb__sJg; ++frameCount__jP7__UFenEd6zR8NNmb__sJg) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IGraphicalReport.graphicalReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _jP7-UFenEd6zR8NNmb-sJg>",
		    	   			"_jP7-UFenEd6zR8NNmb-sJg",
		    	   			failureException__jP7__UFenEd6zR8NNmb__sJg,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__jP7__UFenEd6zR8NNmb__sJg != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__jP7__UFenEd6zR8NNmb__sJg;
		    	   			}
		    	   			if(retries == tries_graphicalReport0-1) { // retry count exceeded?
		    	   				throw failureException__jP7__UFenEd6zR8NNmb__sJg;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__jP7__UFenEd6zR8NNmb__sJg.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_cocs8lenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	} 
		    	private void action_f8CkoFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_koTfcFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_onlineReport0 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_onlineReport0; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__koTfcFenEd6zR8NNmb__sJg=null;
		    	   					int stackSize__koTfcFenEd6zR8NNmb__sJg=ctx.getStack().size();
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
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IOnlineReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IOnlineReport_Scheduler().onlineReport0
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IOnlineReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__koTfcFenEd6zR8NNmb__sJg = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__koTfcFenEd6zR8NNmb__sJg = 0; frameCount__koTfcFenEd6zR8NNmb__sJg < ctx.getStack().size() - stackSize__koTfcFenEd6zR8NNmb__sJg; ++frameCount__koTfcFenEd6zR8NNmb__sJg) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IOnlineReport.onlineReport0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _koTfcFenEd6zR8NNmb-sJg>",
		    	   			"_koTfcFenEd6zR8NNmb-sJg",
		    	   			failureException__koTfcFenEd6zR8NNmb__sJg,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__koTfcFenEd6zR8NNmb__sJg != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__koTfcFenEd6zR8NNmb__sJg;
		    	   			}
		    	   			if(retries == tries_onlineReport0-1) { // retry count exceeded?
		    	   				throw failureException__koTfcFenEd6zR8NNmb__sJg;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__koTfcFenEd6zR8NNmb__sJg.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_f8CkoVenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_WnPFwNo5EdyCSNQKlT1LxA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iBRSSystem_view1(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_WnPs0do5EdyCSNQKlT1LxA(ctx, resultStackFrame, methodBodyStackFrame);
		   action_3aWD0LpDEd2fi_j9dEpB2g(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_hQZRgFjxEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_xqKzQFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   	   action_WnPs0to5EdyCSNQKlT1LxA(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_WnPs0do5EdyCSNQKlT1LxA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_3aWD0LpDEd2fi_j9dEpB2g(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = schedule, Type = InternalAction
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
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_3aWD0LpDEd2fi_j9dEpB2g"));
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
		    	private void action_hQZRgFjxEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_logUserActivity2 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_logUserActivity2; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__hQZRgFjxEd6UHd_VhJH9SQ=null;
		    	   					int stackSize__hQZRgFjxEd6UHd_VhJH9SQ=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IUserMgmt_Scheduler().logUserActivity2
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__hQZRgFjxEd6UHd_VhJH9SQ = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__hQZRgFjxEd6UHd_VhJH9SQ = 0; frameCount__hQZRgFjxEd6UHd_VhJH9SQ < ctx.getStack().size() - stackSize__hQZRgFjxEd6UHd_VhJH9SQ; ++frameCount__hQZRgFjxEd6UHd_VhJH9SQ) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IUserMgmt.logUserActivity2 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _hQZRgFjxEd6UHd_VhJH9SQ>",
		    	   			"_hQZRgFjxEd6UHd_VhJH9SQ",
		    	   			failureException__hQZRgFjxEd6UHd_VhJH9SQ,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__hQZRgFjxEd6UHd_VhJH9SQ != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__hQZRgFjxEd6UHd_VhJH9SQ;
		    	   			}
		    	   			if(retries == tries_logUserActivity2-1) { // retry count exceeded?
		    	   				throw failureException__hQZRgFjxEd6UHd_VhJH9SQ;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__hQZRgFjxEd6UHd_VhJH9SQ.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_xqKzQFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = graphicalOrOnline, Type = BranchAction
		    	   {
		    	   	if ((Boolean)ctx.evaluate("type.VALUE == \"graphical\"") == true)
		    	   	{
		    	   		action_zwSLMVenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   action_350MYFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   	   action_zwSLMlenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   	} else 
		    	   	if ((Boolean)ctx.evaluate("type.VALUE == \"online\"") == true)
		    	   	{
		    	   		action_10KHcFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   action_4trSQFenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   			   	   action_10KHcVenEd6zR8NNmb__sJg(ctx, resultStackFrame, methodBodyStackFrame);
		    	   	}
		    	   	else
		    	   	    logger.error("No branch condition evaluated to true in graphicalOrOnline :-(");  
		    	   		
		    	   }
		    	}
		    	private void action_zwSLMVenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_350MYFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_viewGraphically1 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_viewGraphically1; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__350MYFenEd6zR8NNmb__sJg=null;
		    	   					int stackSize__350MYFenEd6zR8NNmb__sJg=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IGraphicalReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IGraphicalReport_Scheduler().viewGraphically1
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IGraphicalReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__350MYFenEd6zR8NNmb__sJg = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__350MYFenEd6zR8NNmb__sJg = 0; frameCount__350MYFenEd6zR8NNmb__sJg < ctx.getStack().size() - stackSize__350MYFenEd6zR8NNmb__sJg; ++frameCount__350MYFenEd6zR8NNmb__sJg) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IGraphicalReport.viewGraphically1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _350MYFenEd6zR8NNmb-sJg>",
		    	   			"_350MYFenEd6zR8NNmb-sJg",
		    	   			failureException__350MYFenEd6zR8NNmb__sJg,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__350MYFenEd6zR8NNmb__sJg != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__350MYFenEd6zR8NNmb__sJg;
		    	   			}
		    	   			if(retries == tries_viewGraphically1-1) { // retry count exceeded?
		    	   				throw failureException__350MYFenEd6zR8NNmb__sJg;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__350MYFenEd6zR8NNmb__sJg.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_zwSLMlenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	} 
		    	private void action_10KHcFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_4trSQFenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_viewOnline1 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_viewOnline1; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__4trSQFenEd6zR8NNmb__sJg=null;
		    	   					int stackSize__4trSQFenEd6zR8NNmb__sJg=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IOnlineReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IOnlineReport_Scheduler().viewOnline1
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IOnlineReport_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__4trSQFenEd6zR8NNmb__sJg = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__4trSQFenEd6zR8NNmb__sJg = 0; frameCount__4trSQFenEd6zR8NNmb__sJg < ctx.getStack().size() - stackSize__4trSQFenEd6zR8NNmb__sJg; ++frameCount__4trSQFenEd6zR8NNmb__sJg) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IOnlineReport.viewOnline1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _4trSQFenEd6zR8NNmb-sJg>",
		    	   			"_4trSQFenEd6zR8NNmb-sJg",
		    	   			failureException__4trSQFenEd6zR8NNmb__sJg,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__4trSQFenEd6zR8NNmb__sJg != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__4trSQFenEd6zR8NNmb__sJg;
		    	   			}
		    	   			if(retries == tries_viewOnline1-1) { // retry count exceeded?
		    	   				throw failureException__4trSQFenEd6zR8NNmb__sJg;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__4trSQFenEd6zR8NNmb__sJg.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_10KHcVenEd6zR8NNmb__sJg(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
		    	private void action_WnPs0to5EdyCSNQKlT1LxA(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iBRSSystem_login2(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_MSbggFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_QTLZIFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_ScHbkFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_MSbggVhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_MSbggFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_QTLZIFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = schedule, Type = InternalAction
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
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_QTLZIFhGEd6UHd_VhJH9SQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.1  ",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_ScHbkFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_userLogin0 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_userLogin0; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__ScHbkFhGEd6UHd_VhJH9SQ=null;
		    	   					int stackSize__ScHbkFhGEd6UHd_VhJH9SQ=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IUserMgmt_Scheduler().userLogin0
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__ScHbkFhGEd6UHd_VhJH9SQ = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__ScHbkFhGEd6UHd_VhJH9SQ = 0; frameCount__ScHbkFhGEd6UHd_VhJH9SQ < ctx.getStack().size() - stackSize__ScHbkFhGEd6UHd_VhJH9SQ; ++frameCount__ScHbkFhGEd6UHd_VhJH9SQ) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IUserMgmt.userLogin0 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _ScHbkFhGEd6UHd_VhJH9SQ>",
		    	   			"_ScHbkFhGEd6UHd_VhJH9SQ",
		    	   			failureException__ScHbkFhGEd6UHd_VhJH9SQ,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__ScHbkFhGEd6UHd_VhJH9SQ != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__ScHbkFhGEd6UHd_VhJH9SQ;
		    	   			}
		    	   			if(retries == tries_userLogin0-1) { // retry count exceeded?
		    	   				throw failureException__ScHbkFhGEd6UHd_VhJH9SQ;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__ScHbkFhGEd6UHd_VhJH9SQ.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_MSbggVhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StopAction
		    	}
	public de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object>	iBRSSystem_logout3(de.uka.ipd.sdq.simucomframework.Context ctx)
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
	action_Mv7U0FhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   action_V6ltkFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   action_VI0SYFhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
		   	   	   action_Mv7U0VhGEd6UHd_VhJH9SQ(ctx, resultStackFrame, methodBodyStackFrame);
	return resultStackFrame;
		   }   
		    	private void action_Mv7U0FhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = StartAction
		    	}
		    	private void action_V6ltkFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = schedule, Type = InternalAction
		    	   /* InternalAction - START */
		    	   	// software failures:
		    	   	// Simulate a failure that occurs with a predefined probability:
		    	   	if (ctx.getModel().getConfig().getSimulateFailures()) {
		    	   		double accProbability = 0;
		    	   		double randValue = ctx.getModel().getConfiguration().getRandomGenerator().random();
		    	   		double failureProbabilityStandardError;
		    	   		try {
		    	   			    failureProbabilityStandardError = Double.parseDouble("2.7E-6");
		    	   		} catch (NumberFormatException exception) {
		    	   			    failureProbabilityStandardError = 0.0;
		    	   		}
		    	   			accProbability += failureProbabilityStandardError;
		    	   			if ((failureProbabilityStandardError > 0.0) && (accProbability >= randValue)) {
		    	   				de.uka.ipd.sdq.simucomframework.exceptions.FailureException.raise(
		    	   					this.getModel(),this.getModel().getFailureStatistics().getInternalSoftwareFailureType(
		    	   						"_jU4hN81bEd-r24qTXVke6A", "_V6ltkFhGEd6UHd_VhJH9SQ"));
		    	   		}
		    	   	}
		    	   	// direct resource demands:
		    	   	{
		    	   	  double demand = de.uka.ipd.sdq.simucomframework.variables.converter.NumberConverter.toDouble(ctx.evaluate("0.1  ",Double.class));
		    	   	  ctx.findResource(this.completeAssemblyContextID).loadActiveResource(ctx.getThread(),"_oro4gG3fEdy4YaaT-RYrLQ",demand);
		    	   	}
		    	   	// infrastructure calls:
		    	   /* InternalAction - END */
		    	}
		    	private void action_VI0SYFhGEd6UHd_VhJH9SQ(
		    			final de.uka.ipd.sdq.simucomframework.Context ctx, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> resultStackFrame, 
		    			final de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> methodBodyStackFrame) {
		    		// EntityName = aName, Type = ExternalCallAction
		    	   /* ExternalCallAction - START */
		    	   	{ //this scope is needed if the same service is called multiple times in one SEFF. Otherwise there is a duplicate local variable definition.
		    	   		//start handling potential failures
		    	   		int tries_userLogout1 = 1 + 0; //The call plus the retries
		    	   		// Execute the external call until it succeeds or the maximal try count is exeeded.
		    	   		boolean callSucceeded = false;
		    	   		for(int retries=0; retries<tries_userLogout1; ++retries) {
		    	   			
		    	   			// Check if the call has already succeeded:
		    	   			if(callSucceeded == true) {
		    	   				break;
		    	   			}
		    	   			
		    	   					de.uka.ipd.sdq.simucomframework.exceptions.FailureException failureException__VI0SYFhGEd6UHd_VhJH9SQ=null;
		    	   					int stackSize__VI0SYFhGEd6UHd_VhJH9SQ=ctx.getStack().size();
		    	   			try { // needs to be closed after the call in PostCall
		    	   		// end of failure handling before the call
		    	   		
		    	   		try {
		    	   		// Start Simulate an external call
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
		    	   		// prepare stackframe
		    	   		de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
		    	   		// Take current time
		    	   		((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   		// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   		// completions handle the link behaviour.
		    	   		if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   			de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   			try {
		    	   				fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   				toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   		myContext.getRoleRequired_IUserMgmt_Scheduler().userLogout1
		    	   			(ctx);
		    	   			// If the call goes over network, simulate the link latency and the possibility of a communication link failure.
		    	   			// Do this only in case that the "simulate linking resources" option is deactivated, because otherwise,
		    	   			// completions handle the link behaviour.
		    	   			if (!ctx.getModel().getConfiguration().getSimulateLinkingResources()) {
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer fromContainer = null;
		    	   				de.uka.ipd.sdq.simucomframework.resources.AbstractSimulatedResourceContainer toContainer = null;
		    	   				try {
		    	   					fromContainer = ctx.findResource(this.assemblyContext.getId());
		    	   					toContainer = ctx.findResource(myContext.getRoleRequired_IUserMgmt_Scheduler().getComponentAssemblyContext().getId());
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
		    	   			((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
		    	   		
		    	   			}
		    	   			finally
		    	   			{
		    	   				ctx.getStack().removeStackFrame();
		    	   			}
		    	   			// END Simulate an external call
		    	   		} // end of try block from the pre call failure handling section
		    	   		
		    	   				catch(de.uka.ipd.sdq.simucomframework.exceptions.FailureException ex) {
		    	   					
		    	   					// Remember the type of the failure-on-demand occurrence:
		    	   					failureException__VI0SYFhGEd6UHd_VhJH9SQ = ex;
		    	   					
		    	   					// Remove all additional stack frames; they are invalid now:
		    	   					for(int frameCount__VI0SYFhGEd6UHd_VhJH9SQ = 0; frameCount__VI0SYFhGEd6UHd_VhJH9SQ < ctx.getStack().size() - stackSize__VI0SYFhGEd6UHd_VhJH9SQ; ++frameCount__VI0SYFhGEd6UHd_VhJH9SQ) {
		    	   						ctx.getStack().removeStackFrame();
		    	   					}
		    	   				}
		    	   		de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.recordExternalCallResult(
		    	   			"Call IUserMgmt.userLogout1 <Component: Scheduler, AssemblyCtx: "+this.assemblyContext.getId()+", CallID: _VI0SYFhGEd6UHd_VhJH9SQ>",
		    	   			"_VI0SYFhGEd6UHd_VhJH9SQ",
		    	   			failureException__VI0SYFhGEd6UHd_VhJH9SQ,
		    	   			ctx.getModel(),
		    	   			ctx.getThread().getRequestContext());
		    	   		if(failureException__VI0SYFhGEd6UHd_VhJH9SQ != null) { // failure occurred
		    	   		
		    	   			// Check if we handle this failure-on-demand occurrence:
		    	   			if(!(
		    	   			false
		    	   			)
		    	   			) { // is this failure type handled?
		    	   				throw failureException__VI0SYFhGEd6UHd_VhJH9SQ;
		    	   			}
		    	   			if(retries == tries_userLogout1-1) { // retry count exceeded?
		    	   				throw failureException__VI0SYFhGEd6UHd_VhJH9SQ;
		    	   			}
		    	   		
		    	   			// If the failure-on-demand occurrence is handled,
		    	   			// update the failure statistics accordingly:
		    	   			this.getModel().getFailureStatistics().increaseFailureCounter(
		    	   				org.palladiosimulator.reliability.FailureStatistics.FailureType.HANDLED, failureException__VI0SYFhGEd6UHd_VhJH9SQ.getFailureType()); //count handled failure
		    	   		
		    	   		} else {
		    	   		
		    	   			// Mark this call as successful:
		    	   			callSucceeded = true;
		    	   		}
		    	   				}
		    	   				// End failure handling section.
		    	   	}
		    	   /* ExternalCallAction - END */
		    	}
		    	private void action_Mv7U0VhGEd6UHd_VhJH9SQ(
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
