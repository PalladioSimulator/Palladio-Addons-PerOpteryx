/**
 * 
 */
package de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures;

import org.palladiosimulator.pcm.usagemodel.UsageModel;

import de.uka.ipd.sdq.dsexplore.qml.contract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.profile.GenericQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.Requirement;

/**
 * This class is used to provide necessary information on a QML {@link EvaluationAspect},
 * e.g. which dimension it refers to, which contract type it belongs to a.s.o. 
 * It is used to have a flat structure and easy access to the information and to 
 * avoid handling possibly large chunks of QML model objects. 
 * 
 * The context is derived from the QML profile the {@code EvaluationAspect} belongs to. As one
 * {@code EvaluationAspect} can be used in different contexts, multiple 
 * {@code EvaluationAspectWithContext} objects can be possible for the same
 * <em>type</em> of {@code EvaluationAspects} (e.g. the {@code Mean} of different 
 * {@code Dimension}s).  
 * 
 * @author noorshams
 * @see EvaluationAspect
 * @see Dimension
 * @see Criterion
 * @see Requirement
 * @see UsageModel
 * @see QMLContractType
 * @see GenericQMLContract
 * @see GenericQMLProfile
 *
 */
public class EvaluationAspectWithContext {
	private final QMLContractType contractType;
	private final Dimension dimension;
	private final Criterion criterion;
	/**
	 * @return the criterion
	 */
	public Criterion getCriterion() {
		return criterion;
	}

	private final EvaluationAspect evaluationAspect;
	private final UsageModel usageModel;
	private final Requirement requirement;
	
	public EvaluationAspectWithContext(QMLContractType contractType, Dimension dimension, Criterion criterion, EvaluationAspect evaluationAspect, UsageModel usageModel, Requirement requirement){
		this.contractType = contractType;
		this.dimension = dimension;
		this.criterion = criterion;
		this.evaluationAspect = evaluationAspect;
		this.usageModel = usageModel;
		this.requirement = requirement;
	}

	/**
	 * @return the contractType
	 */
	public QMLContractType getContractType() {
		return contractType;
	}

	/**
	 * @return the dimension
	 */
	public Dimension getDimension() {
		return dimension;
	}

	/**
	 * @return the evaluationAspect
	 */
	public EvaluationAspect getEvaluationAspect() {
		return evaluationAspect;
	}

	/**
	 * @return the usageModel
	 */
	public UsageModel getUsageModel() {
		return usageModel;
	}

	/**
	 * @return the requirement
	 */
	public Requirement getRequirement() {
		return requirement;
	}
}
