package de.uka.ipd.sdq.dmlsupport.designdecision;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.uka.ipd.sdq.dmlsupport.DMLWorkflowConfiguration;
import de.uka.ipd.sdq.dmlsupport.helper.DMLPhenotype;
import de.uka.ipd.sdq.dsexplore.helper.AResultsWriter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import edu.kit.ipd.descartes.adaptation.model.dmm.DmlModelLoader;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.impl.ADSEProblemImpl;

public class DSEProblem extends ADSEProblemImpl<DMLPhenotype> {

	DmlModelLoader modelLoader = null;
	
	public DSEProblem(DMLWorkflowConfiguration dseConfig, ResourceSetPartition modelPartition) {
		super(dseConfig, modelPartition);
		modelLoader = DmlModelLoader.getInstance();
		this.setAssociatedMetamodel(MetamodelDescription.eINSTANCE);
		
		if(this.newProblem){
			this.initialiseProblem();
		} else {
			this.loadProblem();
		}
	}
	
	@Override
	public AResultsWriter getWriter(String filename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DMLPhenotype decode(DesignDecisionGenotype genotype) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected EPackage getEPackage() {
		return ;
	}

	@Override
	protected ResourceSet getResourceSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void instantiateDegrees() {
		// TODO Auto-generated method stub
		
	}

}
