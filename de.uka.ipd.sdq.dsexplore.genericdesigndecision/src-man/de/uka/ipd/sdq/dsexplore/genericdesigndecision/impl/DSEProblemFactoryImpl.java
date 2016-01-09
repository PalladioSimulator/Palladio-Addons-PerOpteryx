package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.palladiosimulator.analyzer.workflow.blackboard.PCMResourceSetPartition;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DSEProblemFactory;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.helper.PCMWorkflowConfiguration;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.universalDoF.Metamodel;

public class DSEProblemFactoryImpl extends EFactoryImpl implements DSEProblemFactory{

	private static DSEProblemFactory dseProblemFactorySingleton;
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public static DSEProblemFactory init() {
		if(dseProblemFactorySingleton == null) {
			dseProblemFactorySingleton = new DSEProblemFactoryImpl();
		}
		return dseProblemFactorySingleton;
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	private DSEProblemFactoryImpl() {
		
	}

	@Override
	public ADSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, ResourceSetPartition modelPartition, Metamodel metamodel) {
		ADSEProblem problem = null;
		switch (metamodel) {
			//added for PCM support
			case PCM: 
				try {
							problem = designdecisionFactory.eINSTANCE.createDSEProblem((PCMWorkflowConfiguration) dseConfig, (PCMResourceSetPartition) modelPartition);
				} catch (CoreException e) {
							e.printStackTrace();
				}
				break;
			default:
				throw new IllegalArgumentException("This metamodel '" + metamodel.toString() + "' is not supported.");
		}
		return problem;
	}

}
