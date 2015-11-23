package de.uka.ipd.sdq.dsexplore.genericdesigndecision.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DSEProblemFactory;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.pcmsupport.PcmsupportFactory;
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
	public ADSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, EModelElement model, Metamodel metamodel) {
		ADSEProblem problem = null;
		switch (metamodel) {
			//added for PCM support
			case PCM: try {
							problem = PcmsupportFactory.eINSTANCE.createPCMDSEProblem(dseConfig, model);
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
