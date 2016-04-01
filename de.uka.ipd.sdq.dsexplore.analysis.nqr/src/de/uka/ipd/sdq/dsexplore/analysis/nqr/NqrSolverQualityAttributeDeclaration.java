/**
 * 
 */
package de.uka.ipd.sdq.dsexplore.analysis.nqr;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.Value;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.handling.QMLConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.profile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;

/**
 * This class declares, which {@code Dimension} and {@code EvaluationAspect} can 
 * be evaluated by this extension.
 * 
 * @author 
 *
 */
public class NqrSolverQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	private List<Dimension> nqrDims = new ArrayList<Dimension>();
	private Map<Dimension, Requirement> requirements = new HashMap<Dimension, Requirement>();
	
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IQualityAttribute#getDimension()
	 */
	@Override
	public List<Dimension> getDimensions() {
		// TODO: load nqr from nqr model instance here
		return nqrDims;
	}
	
	public void addDimension(Dimension dim)
	{
		nqrDims.add(dim);
	}
	
	public void addRequirement(Dimension dimension, Requirement requirement)
	{
		requirements.put(dimension, requirement);
	}
	
	public Requirement getRequirement(Dimension dimension)
	{
		requirements.get(dimension);
		return requirements.get(dimension);
	}
	/* (non-Javadoc)
	 * @see de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttribute#getDimension()
	 */
	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect, Dimension dimension) {
		if(aspect instanceof Value) {
			return true;
		}
		return false;
	}

	@Override
	public QualityAttribute getQualityAttribute() {
		return QualityAttribute.NQR_QUALITY;
	}

}
