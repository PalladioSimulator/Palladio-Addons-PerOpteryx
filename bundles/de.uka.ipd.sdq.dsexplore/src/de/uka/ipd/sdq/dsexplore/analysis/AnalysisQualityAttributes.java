/**
 *
 */
package de.uka.ipd.sdq.dsexplore.analysis;

import java.util.Arrays;
import java.util.List;

import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;

/**
 * This class is supposed to know all possible {@code Dimension}s,i.e. quality
 * attributes, that can be considered in PerOpteryx.
 *
 * @author noorshams
 *
 */
public class AnalysisQualityAttributes {

	/**
	 *
	 * @return a list of all considered {@code Dimension}s in PerOpteryx.
	 */
	public List<QualityAttribute> getAllQualityAttributes() {
		// List<Dimension> dimensions = new ArrayList<Dimension>();
		// QMLDimensionReader reader = new QMLDimensionReader();
		// //The definitions are in .contracttype files
		// for(String dimensionDefinition :
		// QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_DEFINITION_PATHS) {
		// dimensions.add(reader.getDimension(dimensionDefinition));
		// }
		// return dimensions;
        return Arrays.asList(QualityAttribute.values());

	}
}
