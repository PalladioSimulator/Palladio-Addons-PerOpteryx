/**
 */
package dmlsupport.designdecision.impl;

import dmlsupport.designdecision.DSEProblem;
import dmlsupport.designdecision.DesigndecisionPackage;
import dmlsupport.designdecision.MetamodelDescription;
import dmlsupport.helper.DMLPhenotype;
import dmlsupport.helper.impl.ResultsWriter;
import dmlsupport.impl.DMLWorkflowConfigurationImpl;
import edu.kit.ipd.descartes.adaptation.model.dmm.DmlModelLoader;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.impl.ADSEProblemImpl;
import genericdesigndecision.universalDoF.SpecificDoF;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import de.uka.ipd.sdq.dsexplore.helper.AResultsWriter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSE Problem</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DSEProblemImpl extends ADSEProblemImpl<DMLPhenotype> implements DSEProblem {
	
	private DmlModelLoader modelLoader = null;
	private EObject dmlModel;
	
	public DSEProblemImpl(DMLWorkflowConfigurationImpl dseConfig, ResourceSetPartition modelPartition) {
		super(dseConfig, modelPartition);
		
		modelLoader = DmlModelLoader.getInstance();
		modelLoader.initializeResourceSet(getResourceSet());
		
		this.setAssociatedMetamodel(dmlsupport.designdecision.MetamodelDescription.eINSTANCE);
		
		if(this.newProblem){
			this.initialiseProblem();
		} else {
			this.loadProblem();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesigndecisionPackage.Literals.DSE_PROBLEM;
	}

	@Override
	public AResultsWriter getWriter(String filename) {
		return new ResultsWriter(filename);
	}

	@Override
	public DMLPhenotype decode(DesignDecisionGenotype genotype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EPackage getEPackage() {
		return dmlsupport.designdecision.DesigndecisionPackage.eINSTANCE;
	}

	@Override
	protected ResourceSet getResourceSet() {
		return this.emfPartition.getResourceSet();
	}

	@Override
	protected void instantiateDegrees() {
		List<ADegreeOfFreedom> dds = this.problem.getDofInstances();

		for (SpecificDoF d : dseConfig.getSelectedSpecificDoFs()) {
			switch (d.getName()) {
			case MetamodelDescription.DML_ALLOCATION_DOF:
				determineAllocationDecisions(dds);
				break;
			default:
				throw new IllegalArgumentException("DML-specific degree of freedom could not be found");
			}
		}
	}

	private void determineAllocationDecisions(List<ADegreeOfFreedom> dds) {
		// TODO Auto-generated method stub
		// retrieve the adaption points (== DoFIs) that correspond to container deployment from the adaption points model of the input model
		// create DoFI for each of them with key == assembly context and design option = container, reference deployment context
		// retrieve concrete design option from deployment model 
	}

} //DSEProblemImpl
