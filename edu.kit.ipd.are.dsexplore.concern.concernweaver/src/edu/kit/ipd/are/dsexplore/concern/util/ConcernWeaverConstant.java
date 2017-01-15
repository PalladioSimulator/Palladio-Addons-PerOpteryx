package edu.kit.ipd.are.dsexplore.concern.util;

public class ConcernWeaverConstant {

	public final static String CONCERN_REPOSITORY_NAME = "TemporaryConcernRepository";
	public final static String CONCERN_REPSITORY_DESCRIPTION = "Include components of all reused concerns.";
	
	public static String getUnifiedNameOf(String adapterName, String eccName) {
	
		return String.format("%1s_%2s", adapterName, eccName);
		
	}
	
}
