package de.uka.ipd.sdq.dmlsupport.designdecision;

import genericdesigndecision.universalDoF.AMetamodelDescription;

public interface MetamodelDescription extends AMetamodelDescription {

	MetamodelDescription eINSTANCE = MetamodelDescriptionImpl.getMetamodelDescription();
	
	public static final String DML_ALLOCATION_DOF = "DML Allocation Degree";
}
