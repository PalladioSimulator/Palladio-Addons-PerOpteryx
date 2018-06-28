		package brs_usage_scenario.impl;
		public class BRS_usage_scenario
		implements de.uka.ipd.sdq.simucomframework.usage.IScenarioRunner
		{
	/** Default EMF factory for measuring points. */
	private final org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory measuringpointFactory = org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE;

			private static java.util.Map<String,java.util.List<org.palladiosimulator.probeframework.probes.Probe>> startStopProbes = null;
			
			protected brs_repository.IAdmin m_portProvided_IAdmin = null;
			protected brs_repository.IHTTP m_portProvided_IHTTP = null;
			
			// Workaround to specify and retrieve the priority for a system call
			public int getPriorityForEntryLevelSystemCallID(String id){
				int defaultPriority = 0;
			// priority for EntrySystemLevelCall Provided_IAdmin: 0
			if(id.equalsIgnoreCase("_QgwCsFekEd6zR8NNmb-sJg")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			// priority for EntrySystemLevelCall Provided_IHTTP: 0
			if(id.equalsIgnoreCase("_zyc0ANo_EdyxgfK4Hy_RFA")){
				return 0;
			} 
			return defaultPriority;
			}
			
			

			private de.uka.ipd.sdq.simucomframework.Context ctx = null;
			private final de.uka.ipd.sdq.simucomframework.model.SimuComModel simuComModel;
			private de.uka.ipd.sdq.simucomframework.model.SimuComModel getModel() {
				return this.simuComModel;
			}
			public BRS_usage_scenario(de.uka.ipd.sdq.simucomframework.model.SimuComModel model,business_reporting_system.impl.Business_Reporting_System myBusiness_Reporting_System
			) {
				this.simuComModel = model;
				ctx = new business_reporting_system.impl.allocation.BRS_allocationRuntimeContext(model);
				ctx.getStack().createAndPushNewStackFrame();
				// Initialise local interface pointer pointing to system roles
				m_portProvided_IAdmin = myBusiness_Reporting_System.getPortProvided_IAdmin();
				m_portProvided_IHTTP = myBusiness_Reporting_System.getPortProvided_IHTTP();
				if (startStopProbes == null) {
				    startStopProbes = new java.util.HashMap<String,java.util.List<org.palladiosimulator.probeframework.probes.Probe>>();
					setupCalculators();
				}
			}
			
			public void scenarioRunner(de.uka.ipd.sdq.simucomframework.SimuComSimProcess thread) {
			
				// Store our thread in the context. The thread is used later to suspend execution in case
				// of waiting at a resource
				ctx.setSimProcess(thread);
			
				// Here comes the usage scenario code...
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"login\"",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: __aMyMGu_Ed650qyoIpbFeQ >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processLoginLogout0
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: __aMyMGu_Ed650qyoIpbFeQ >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				for (int iterationCount__fkev4GuVEd629YsFMvxaFg = 0, maxIterationCount__fkev4GuVEd629YsFMvxaFg = (Integer)ctx.evaluate("5",Integer.class); 
					iterationCount__fkev4GuVEd629YsFMvxaFg < maxIterationCount__fkev4GuVEd629YsFMvxaFg; iterationCount__fkev4GuVEd629YsFMvxaFg++){
				for (int iterationCount__votskNpBEdyxgfK4Hy_RFA = 0, maxIterationCount__votskNpBEdyxgfK4Hy_RFA = (Integer)ctx.evaluate("5",Integer.class); 
					iterationCount__votskNpBEdyxgfK4Hy_RFA < maxIterationCount__votskNpBEdyxgfK4Hy_RFA; iterationCount__votskNpBEdyxgfK4Hy_RFA++){
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"view\"",currentFrame));
					stackframe.addValue("type.TYPE",
					   	ctx.evaluate("\"online\"",currentFrame));
					stackframe.addValue("requestedEntries.VALUE",
					   	ctx.evaluate("7",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processOnlineView4 <EntryLevelSystemCall id: _ZZ3D8F6gEd6D97fyAyMq6A >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processOnlineView4
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processOnlineView4 <EntryLevelSystemCall id: _ZZ3D8F6gEd6D97fyAyMq6A >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				} 
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"logout\"",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: _Ooe6QGvAEd650qyoIpbFeQ >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processLoginLogout0
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: _Ooe6QGvAEd650qyoIpbFeQ >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"login\"",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: _LwvREGvAEd650qyoIpbFeQ >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processLoginLogout0
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: _LwvREGvAEd650qyoIpbFeQ >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"view\"",currentFrame));
					stackframe.addValue("type.TYPE",
					   	ctx.evaluate("\"graphical\"",currentFrame));
					stackframe.addValue("requestedEntries.VALUE",
					   	ctx.evaluate("7",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processGraphicalView3 <EntryLevelSystemCall id: _tyKaoNpBEdyxgfK4Hy_RFA >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processGraphicalView3
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processGraphicalView3 <EntryLevelSystemCall id: _tyKaoNpBEdyxgfK4Hy_RFA >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"report\"",currentFrame));
					stackframe.addValue("type.TYPE",
					   	ctx.evaluate("\"online\"",currentFrame));
					stackframe.addValue("isDetailed.VALUE",
					   	ctx.evaluate("EnumPMF[ (\"t\";0.1) (\"f\";0.9) ]",currentFrame));
					stackframe.addValue("requestedEntries.VALUE",
					   	ctx.evaluate("7",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processOnlineReport2 <EntryLevelSystemCall id: _VMS-oGuWEd629YsFMvxaFg >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processOnlineReport2
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processOnlineReport2 <EntryLevelSystemCall id: _VMS-oGuWEd629YsFMvxaFg >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				} 
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"report\"",currentFrame));
					stackframe.addValue("type.TYPE",
					   	ctx.evaluate("\"graphical\"",currentFrame));
					stackframe.addValue("requestedEntries.VALUE",
					   	ctx.evaluate("7",currentFrame));
					stackframe.addValue("isDetailed.VALUE",
					   	ctx.evaluate("EnumPMF[ (\"t\";0.1) (\"f\";0.9) ]",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processGraphicalReport1 <EntryLevelSystemCall id: _2VnlYGuVEd629YsFMvxaFg >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processGraphicalReport1
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processGraphicalReport1 <EntryLevelSystemCall id: _2VnlYGuVEd629YsFMvxaFg >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
					stackframe.addValue("type.VALUE",
					   	ctx.evaluate("\"logout\"",currentFrame));
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: _D0sAgGvAEd650qyoIpbFeQ >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IHTTP.processLoginLogout0
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_processLoginLogout0 <EntryLevelSystemCall id: _D0sAgGvAEd650qyoIpbFeQ >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
				// Set the priority for aName
				thread.setPriority(0);
				try {
				// Start Simulate an external call
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> currentFrame = ctx.getStack().currentStackFrame();
				// prepare stackframe
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> stackframe = ctx.getStack().createAndPushNewStackFrame();
				// Take current time
				((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_maintain0 <EntryLevelSystemCall id: _DM4jcFelEd6zR8NNmb-sJg >").get(0)).takeMeasurement(ctx.getThread().getRequestContext());
				de.uka.ipd.sdq.simucomframework.variables.stackframe.SimulatedStackframe<Object> callResult =
				m_portProvided_IAdmin.maintain0
					(ctx);
						    // Stop the time measurement
					// Take current time
					((org.palladiosimulator.probeframework.probes.TriggeredProbe)this.startStopProbes.get("Call_maintain0 <EntryLevelSystemCall id: _DM4jcFelEd6zR8NNmb-sJg >").get(1)).takeMeasurement(ctx.getThread().getRequestContext());
				
					}
					finally
					{
						ctx.getStack().removeStackFrame();
					}
					// END Simulate an external call
			
				// A run through this usage model is complete
				// The counter for main measurements is incremented by the SimuComSimProcess.internalLifeCycle that called this  
				// ctx.getModel().increaseMainMeasurementsCount();
			}
			
			private void setupCalculators() {
					if(getModel().getConfiguration().getSimulateFailures()){
						//Newer Version has bugs so this old version is just commented out
						//getModel().getProbeSpecContext().getCalculatorRegistry().registerCalculator(
						//	"BRS_usage_scenario/_qhsIYNpBEdyxgfK4Hy_RFA/ExecutionResult",
						//	getModel().getProbeSpecContext().getCalculatorFactory().buildExecutionResultCalculator(
						//		"UsageScenario BRS_usage_scenario <_qhsIYNpBEdyxgfK4Hy_RFA>", 
						//		getModel().getProbeSpecContext().obtainProbeSetId(
						//			de.uka.ipd.sdq.simucomframework.ReliabilitySensorHelper.getScenarioProbeSetId(
						//				"_qhsIYNpBEdyxgfK4Hy_RFA"))));
					}
				
						// Setup calculator for system call aName (_DM4jcFelEd6zR8NNmb-sJg)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_maintain0 <EntryLevelSystemCall id: _DM4jcFelEd6zR8NNmb-sJg >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_maintain0 <EntryLevelSystemCall id: _DM4jcFelEd6zR8NNmb-sJg >",probes);
						}
						// Setup calculator for system call aName (_2VnlYGuVEd629YsFMvxaFg)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processGraphicalReport1 <EntryLevelSystemCall id: _2VnlYGuVEd629YsFMvxaFg >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processGraphicalReport1 <EntryLevelSystemCall id: _2VnlYGuVEd629YsFMvxaFg >",probes);
						}
						// Setup calculator for system call aName (__aMyMGu_Ed650qyoIpbFeQ)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processLoginLogout0 <EntryLevelSystemCall id: __aMyMGu_Ed650qyoIpbFeQ >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processLoginLogout0 <EntryLevelSystemCall id: __aMyMGu_Ed650qyoIpbFeQ >",probes);
						}
						// Setup calculator for system call aName (_D0sAgGvAEd650qyoIpbFeQ)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processLoginLogout0 <EntryLevelSystemCall id: _D0sAgGvAEd650qyoIpbFeQ >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processLoginLogout0 <EntryLevelSystemCall id: _D0sAgGvAEd650qyoIpbFeQ >",probes);
						}
						// Setup calculator for system call aName (_tyKaoNpBEdyxgfK4Hy_RFA)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processGraphicalView3 <EntryLevelSystemCall id: _tyKaoNpBEdyxgfK4Hy_RFA >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processGraphicalView3 <EntryLevelSystemCall id: _tyKaoNpBEdyxgfK4Hy_RFA >",probes);
						}
						// Setup calculator for system call aName (_VMS-oGuWEd629YsFMvxaFg)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processOnlineReport2 <EntryLevelSystemCall id: _VMS-oGuWEd629YsFMvxaFg >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processOnlineReport2 <EntryLevelSystemCall id: _VMS-oGuWEd629YsFMvxaFg >",probes);
						}
						// Setup calculator for system call aName (_LwvREGvAEd650qyoIpbFeQ)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processLoginLogout0 <EntryLevelSystemCall id: _LwvREGvAEd650qyoIpbFeQ >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processLoginLogout0 <EntryLevelSystemCall id: _LwvREGvAEd650qyoIpbFeQ >",probes);
						}
						// Setup calculator for system call aName (_Ooe6QGvAEd650qyoIpbFeQ)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processLoginLogout0 <EntryLevelSystemCall id: _Ooe6QGvAEd650qyoIpbFeQ >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processLoginLogout0 <EntryLevelSystemCall id: _Ooe6QGvAEd650qyoIpbFeQ >",probes);
						}
						// Setup calculator for system call aName (_ZZ3D8F6gEd6D97fyAyMq6A)
						{
							java.util.List<org.palladiosimulator.probeframework.probes.Probe> probes = 
								java.util.Arrays.asList(
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()),
									(org.palladiosimulator.probeframework.probes.Probe)new de.uka.ipd.sdq.simucomframework.probes.TakeCurrentSimulationTimeProbe(getModel().getSimulationControl()));
							
							// TODO get rid of StringMeasuringPoint and use a more concrete one.
							org.palladiosimulator.edp2.models.measuringpoint.StringMeasuringPoint mp = measuringpointFactory.createStringMeasuringPoint();
							mp.setMeasuringPoint("Call_processOnlineView4 <EntryLevelSystemCall id: _ZZ3D8F6gEd6D97fyAyMq6A >");
							
							org.palladiosimulator.edp2.models.measuringpoint.MeasuringPointRepository myMeasurementPointRepository = 
									org.palladiosimulator.edp2.models.measuringpoint.MeasuringpointFactory.eINSTANCE.createMeasuringPointRepository();
							myMeasurementPointRepository.getMeasuringPoints().add(mp);
							mp.setMeasuringPointRepository(myMeasurementPointRepository);
						
							getModel().getProbeFrameworkContext().getCalculatorFactory().buildResponseTimeCalculator(mp,probes);
							this.startStopProbes.put("Call_processOnlineView4 <EntryLevelSystemCall id: _ZZ3D8F6gEd6D97fyAyMq6A >",probes);
						}
			}
		}
