/**
 *
 */
package de.uka.ipd.sdq.dsexplore.qml.handling;

/**
 * Due to cyclic dependencies, QML needs its own constants container
 * @author noorshams
 *
 */
public class QMLConstantsContainer {


	//	public static final String STANDARD_CONTRACT_TYPE_PATH =
	//		"pathmap://PCM_MODELS/PCMStandardQMLContractType.qmldeclarations";


	public static final String QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_cost.qmlcontracttype";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_INITIAL_COST_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_initialcost.qmlcontracttype";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_OPERATING_COST_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_operatingcost.qmlcontracttype";


	public static final String QUALITY_ATTRIBUTE_DIMENSION_POFOD_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_pofod.qmlcontracttype";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_responsetime.qmlcontracttype";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_throughput.qmlcontracttype";
	public static final String QUALITY_ATTRIBUTE_DIMENSION_MAX_UTIL_DEFINITION_PATH = "pathmap://PCM_MODELS/Dimension_maxCPUUtilization.qmlcontracttype";

	// added:
	public static final String QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH = "platform:/plugin/edu.kit.ipd.are.dsexplore.analysis.security/Security.qmlcontracttype";

	public static final String[] QUALITY_ATTRIBUTE_DIMENSION_DEFINITION_PATHS = new String[] {
			QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH,
			QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH,
			QUALITY_ATTRIBUTE_DIMENSION_POFOD_DEFINITION_PATH,
			QUALITY_ATTRIBUTE_DIMENSION_TOTAL_COST_DEFINITION_PATH, QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH
	};

	// quick version, delete later
	// public static final String QUALITY_ATTRIBUTE_DIMENSION_SECURITY_PATH =
	// "pathmap://PCM_MODELS/Dimension_security.qmlcontracttype";
}
