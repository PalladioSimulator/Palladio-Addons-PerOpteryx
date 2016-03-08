package de.uka.ipd.sdq.dmlsupport.designdecision;

import java.util.Collection;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl;

public class MetamodelDescriptionImpl extends AMetamodelDescriptionImpl implements MetamodelDescription {

	private static MetamodelDescription metamodelDescrSingleton = null;
	
	public static MetamodelDescription getMetamodelDescription() {
		if(metamodelDescrSingleton == null) {
			metamodelDescrSingleton = new MetamodelDescriptionImpl();
		}
		return metamodelDescrSingleton;
	}

	@Override
	public Collection<Object> getPossibleValues(ADegreeOfFreedom dof, ADSEProblem dseProblem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDecisionString(Choice choice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends DSEEvaluator> getDSEEvaluator() {
		// TODO Auto-generated method stub
		return null;
	}
}
