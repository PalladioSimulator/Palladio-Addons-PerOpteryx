package de.uka.ipd.sdq.pcmsupport.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;

import org.opt4j.core.Criterion;
import org.opt4j.core.IntegerValue;
import org.opt4j.core.Objective;
import org.opt4j.core.Objectives;
import org.opt4j.core.Value;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.LinkingResourceResults;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.UtilisationResult;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.helper.EMFHelper;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.ITactic;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.TacticsResultCandidate;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EntryLevelSystemCallCriterion;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.EvaluationAspectWithContext;
import de.uka.ipd.sdq.dsexplore.qml.pcm.datastructures.UsageScenarioBasedCriterion;
import de.uka.ipd.sdq.dsexplore.qml.pcm.reader.PCMDeclarationsReader;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;

public class ResultsWriter extends de.uka.ipd.sdq.dsexplore.helper.AResultsWriter {
	
	private PCMInstance pcmInstance;

	public ResultsWriter(String filename, PCMInstance pcmInstance) {
		super(filename);
		this.pcmInstance = pcmInstance;
	}
	
	/**
	 * Write individuals to Logger using WARN level.
	 * @param individuals
	 * @param collectionName
	 */
	public void printOutIndividuals(Collection<DSEIndividual> individuals,
			String collectionName) {
		
		if (individuals.iterator().hasNext()) {
		
		DSEIndividual firstIndividual = individuals.iterator().next();
		List<Criterion> criteriaToSave = determineCriterionsToSave(firstIndividual);
		List<Criterion> criteriaWithConfidence = determineCriteriaWithConfidenceInterval(firstIndividual);
				
		logger.warn("------------ RESULTS " + collectionName
				+ " ----------------------");
		logger.warn("Printing results (number is " + individuals.size() + ").");
		
		List<Exception> exceptionList = new ArrayList<Exception>();
		
		int counter = 0;
	
		StringBuilder output = new StringBuilder(10000);
		
		logger.warn("------------ PRETTY CSV RESULTS " + collectionName
				+ " ----------------------");
		
		output.append("\n");
		output = prettyPrintHeadlineCSV(individuals, output,criteriaToSave);
	
		// content
		for (DSEIndividual ind2 : individuals) {
			try {
			output = prettyPrintResultLineCSV(output, ind2,criteriaToSave, criteriaWithConfidence);
			} catch (Exception e){
				exceptionList.add(new Exception("Encountered corrupted result number "+counter+", skipped it", e));
			}
			counter++;
		}
		logger.warn(output);
		
		if (exceptionList.size() > 0){
			logger.warn("Encountered exceptions while printing results");
			for (Exception exception : exceptionList) {
				exception.printStackTrace();
			}
		}
		}
	}

	@Override
	public String getDimensionName(Criterion criterion){
		EvaluationAspectWithContext qmlCriterion = PCMDeclarationsReader.retranslateCriterionToEvaluationAspect(criterion);
		String name = qmlCriterion.getDimension().getEntityName();
		if (criterion instanceof UsageScenarioBasedCriterion){
			name += ":"+((UsageScenarioBasedCriterion)criterion).getUsageScenario().getEntityName();
		} else if (criterion instanceof EntryLevelSystemCallCriterion){
			name += ":"+((EntryLevelSystemCallCriterion)criterion).getEntryLevelSystemCall().getEntityName();
		}
		return name;
	}
	
	@Override
	public void writeTacticManagerChoice(TacticsResultCandidate c){
		writeToLogFile(c.getHeuristic().getClass().getSimpleName() +";"+c.getNumericID()+";"+c.getParent().getNumericID()+ ";"+c.getID()+";"+c.getParent().getID()+";candidate returned\n");
	}
	
	@Override
	public void writeTacticCandidateInfo(ITactic heuristic, Collection<TacticsResultCandidate> candidatesFromCurrentHeuristic){
		 //writeToLogFile(heuristic.getClass() + ";" + candidatesFromCurrentHeuristic.size() + "; candidate(s)");
		for (TacticsResultCandidate tacticsResultCandidate : candidatesFromCurrentHeuristic) {
			StringBuilder builder = new StringBuilder(30);
			builder.append(heuristic.getClass().getSimpleName()+";"+tacticsResultCandidate.getNumericID()+";"+tacticsResultCandidate.getParent().getNumericID()+";"+tacticsResultCandidate.getID()+";"+tacticsResultCandidate.getParent().getID()+";");
			builder = printUtilResultLine(tacticsResultCandidate.getParent(), builder);
			writeToLogFile(builder.toString()+"\n");
		}
	}
	
	/**
	 * Print one column per objective with results and per active processing resource in the resourceenvironment.  
	 * @param ind
	 * @param output
	 * @return
	 */
	private StringBuilder printUtilResultLine(DSEIndividual ind, StringBuilder output) {
		
		Objectives obs = ind.getObjectives();
		if (obs instanceof DSEObjectives){
			DSEObjectives dseObj = ((DSEObjectives)obs);
			for (Entry<Objective, Value<?>> o : dseObj) {
				if (dseObj.hasResultDecoratorFor(o.getKey())){
					ResultDecoratorRepository results = dseObj.getResultDecoratorFor(o.getKey());
					List<UtilisationResult> utilisations = results.getUtilisationResults_ResultDecoratorRepository();
					List<ResourceContainer> containers = pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
					List<LinkingResource> links = pcmInstance.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
					if (utilisations != null){
						for (ResourceContainer resourceContainer : containers) {
							for (ProcessingResourceSpecification processingResourceSpecification : resourceContainer.getActiveResourceSpecifications_ResourceContainer()) {
								for (UtilisationResult utilisationResult : utilisations) {
									if (utilisationResult instanceof ProcessingResourceSpecificationResult){
										ProcessingResourceSpecificationResult procResResult = ((ProcessingResourceSpecificationResult)utilisationResult);
										// compare container and resource type, because the proc resource may have changed (the printed candidate is not necessarily the current one on the blackboard). 
										if (EMFHelper.checkIdentity((ResourceContainer)procResResult.getProcessingResourceSpecification_ProcessingResourceSpecificationResult().eContainer(),resourceContainer)
												&& EMFHelper.checkIdentity(procResResult.getProcessingResourceSpecification_ProcessingResourceSpecificationResult().getActiveResourceType_ActiveResourceSpecification(), processingResourceSpecification.getActiveResourceType_ActiveResourceSpecification())){
											output.append(procResResult.getResourceUtilisation());
											break;
										}
									}
								}
								output.append(";");
							}
						}
						for (LinkingResource linkingResource : links) {
							for (UtilisationResult utilisationResult : utilisations) {
								if (utilisationResult instanceof LinkingResourceResults){
									LinkingResourceResults linkResult = ((LinkingResourceResults)utilisationResult);
									if (EMFHelper.checkIdentity(linkResult.getLinkingResource_LinkingResourceResults(),linkingResource)){
										output.append(linkResult.getResourceUtilisation());
										break;
									}
								}
							}
							output.append(";");
						}
					} else {
					  for (int i = 0; i < containers.size()+links.size(); i++){
						  output.append(";");
					  }
					}
				
				}
			}
		}
		
		return output;
	}
	
	/**
	 * Print one column per objective with results and per active processing resource in the resourceenvironment.  
	 * @param i
	 * @param output
	 * @return
	 */
	private StringBuilder printUtilisationHeadline(DSEIndividual i, StringBuilder output) {
		Objectives obs = i.getObjectives();
		if (obs instanceof DSEObjectives){
			DSEObjectives dseObj = ((DSEObjectives)obs);
			for (Entry<Objective, Value<?>> o : dseObj) {
				if (dseObj.hasResultDecoratorFor(o.getKey())){
		
					List<ResourceContainer> containers = pcmInstance.getResourceEnvironment().getResourceContainer_ResourceEnvironment();
					for (ResourceContainer resourceContainer : containers) {
						List<ProcessingResourceSpecification> procResource = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
						for (ProcessingResourceSpecification processingResourceSpecification : procResource) {
							ProcessingResourceType procType = processingResourceSpecification.getActiveResourceType_ActiveResourceSpecification();
							output.append("Util of "+resourceContainer.getEntityName()+" "+procType.getEntityName()+";");
						}
						
					}
					
					List<LinkingResource> links = pcmInstance.getResourceEnvironment().getLinkingResources__ResourceEnvironment();
					for (LinkingResource linkingResource : links) {
						output.append("Util of "+linkingResource.getEntityName()+" "
								+linkingResource.getCommunicationLinkResourceSpecifications_LinkingResource().getCommunicationLinkResourceType_CommunicationLinkResourceSpecification().getEntityName()+";");
					}
				}
				
			}
		}
		return output;
	}
	
	@Override
	protected StringBuilder prettyPrintResultLineCSV(StringBuilder output, DSEIndividual ind, List<Criterion> criterionsToSave, List<Criterion> criteriaWithConfidence) {
		
		// first objectives
		DSEObjectives objs = ind.getObjectives();
		//for (Entry<Objective, Value<?>> entry : objs) { 
		for (Criterion o : criterionsToSave) {
			if (objs != null){
				output.append(formatValue(objs.getValueForCriterion(o)) + ";");
			} else {
				output.append(formatDouble(Double.NaN) + ";");
			}
		}
		
		for (Criterion o : criteriaWithConfidence) {
			ConfidenceInterval c = objs.getConfidenceIntervalForObjective(o);
			if (c != null){
				output.append(c.getLowerBound() + ";" + c.getUpperBound() + ";" + c.getLevel() + ";"); 
			} else {
				output.append(Double.NaN + ";" + Double.NaN + ";" + Double.NaN + ";");
			}
		}
		
		//then genes
		DesignDecisionGenotype genes = (DesignDecisionGenotype) ind.getGenotype();
		if (genes.size() == 0){
			logger.error("Encountered empty genotype, filling it with blanks");
			int problemsize = Opt4JStarter.getProblem().getDesignDecisions().size();
			for (int i = 0; i < problemsize; i++) {
				output.append(";");
			}
			
		} else {
			output.append(genes.toString());
		}
		
		output = printUtilResultLine(ind,output);
		
		output.append("\n");
		return output;
	}

	

	/**
	 * If order of all Objectives first, then confidences is changed, also change GenotypeReader accordingly.
	 * Expects a list of objectives to create a headline entry for.  
	 * @param individuals
	 * @param output
	 * @param criterionsToSave
	 * @return
	 */
	@Override
	protected StringBuilder prettyPrintHeadlineCSV(Collection<DSEIndividual> individuals, StringBuilder output, List<Criterion> criterionsToSave) {
		if (individuals.size() > 0){
			DSEIndividual i = individuals.iterator().next();
			
			output = printObjectives(criterionsToSave,output);
		
			output = determineAndPrintConfidenceIntervalHeadline(output, i.getObjectives(), criterionsToSave);
		
			output.append(Opt4JStarter.getProblem().toString());
		
			output = printUtilisationHeadline(i,output);
			
			output.append("Candidate ID;");
		
			output.append("\n");
		}
		return output; 
	}
	
	private StringBuilder determineAndPrintConfidenceIntervalHeadline(StringBuilder output, DSEObjectives objs, List<Criterion> criterionsToSave) {
	
		for (Criterion criterion : criterionsToSave) {
			ConfidenceInterval c = objs.getConfidenceIntervalForObjective(criterion);
			if (c != null){
				output.append(DSEConstantsContainer.LOWER_BOUND_CONFIDENCE+"("+getDimensionName(criterion)+");"
						+ DSEConstantsContainer.UPPER_BOUND_CONFIDENCE+"("+getDimensionName(criterion)+");"
						+ DSEConstantsContainer.ALPHA+"("+getDimensionName(criterion)+");"); 
			}
		
		}
		return output;
	}

	private String formatValue(Value<?> value) {
		
		if (value instanceof IntegerValue){
			IntegerValue intValue = (IntegerValue)value;
			return String.valueOf(intValue);
			
		} else {
			double d = value.getDouble();
			return formatDouble(d);
		}
		
	}

	
	private StringBuilder printObjectives(List<Criterion> criterionsToSave, StringBuilder output) {
		for (Criterion entry : criterionsToSave) {
			output.append(getDimensionName(entry) +";");
		}

		return output;
	}

}