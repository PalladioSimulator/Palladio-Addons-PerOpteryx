package de.uka.ipd.sdq.dsexplore.analysis.simulizar;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.util.EcoreUtil;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysisQualityAttributeDeclaration;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer.QualityAttribute;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.handling.QMLConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;

/**
 * This class declares, which {@code Dimension} and {@code EvaluationAspect} can 
 * be evaluated by this extension.
 * 
 * 
 * @author Suman
 *
 */
public class SimuLizarQualityAttributeDeclaration implements IAnalysisQualityAttributeDeclaration {

	public static final String qualityAttributeResponseTime = QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH;
	public static final String qualityAttributeSloViolation = QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_SLO_VIOLATION_DEFINITION_PATH;
	public static final String qualityAttributethroughput = QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH;
	
	private Dimension responseTimeDimension;
	private Dimension sloViolationsDimension;
	private Dimension throughputDimension;
	
	public SimuLizarQualityAttributeDeclaration(){
		
		QMLDimensionReader reader = new QMLDimensionReader();
		this.responseTimeDimension = reader.getDimension(qualityAttributeResponseTime);
		this.sloViolationsDimension = reader.getDimension(qualityAttributeSloViolation);
		this.throughputDimension = reader.getDimension(qualityAttributethroughput);

	}


	@Override
	public QualityAttribute getQualityAttribute() {
		// TODO Auto-generated method stub
		return QualityAttribute.PERFORMANCE_QUALITY;
	}

	@Override
	public List<Dimension> getDimensions() {
		
		List<Dimension> dimensionList = new ArrayList<Dimension>(3);
		dimensionList.add(this.responseTimeDimension);
		dimensionList.add(this.sloViolationsDimension);
		dimensionList.add(this.throughputDimension);
		return dimensionList;
	}
	
	public Dimension getResponseTime() {
		return this.responseTimeDimension;
	}
	
	public Dimension getSloViolations() {
		return this.sloViolationsDimension;
	}
	public Dimension getThroughput() {
		return this.throughputDimension;
	}

	@Override
	public boolean canEvaluateAspectForDimension(EvaluationAspect aspect,
			Dimension dimension) {
		if(EcoreUtil.equals(dimension, this.responseTimeDimension) && aspect instanceof Mean) {
			return true;
		}
		if(EcoreUtil.equals(dimension, this.throughputDimension) && aspect instanceof Mean) {
			return true;
		}
		if(EcoreUtil.equals(dimension, this.sloViolationsDimension)) {
			return true;
		}
		return false;
	}
	
	
}
