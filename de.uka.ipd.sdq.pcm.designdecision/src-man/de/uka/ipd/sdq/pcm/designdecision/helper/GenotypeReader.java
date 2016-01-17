package de.uka.ipd.sdq.pcm.designdecision.helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.opt4j.core.Criterion;
import org.opt4j.core.DoubleValue;
import org.opt4j.core.Phenotype;
import org.opt4j.core.Value;
import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;
import org.palladiosimulator.analyzer.resultdecorator.ResultdecoratorFactory;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ActiveResourceUtilisationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.LinkingResourceResults;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ProcessingResourceSpecificationResult;
import org.palladiosimulator.analyzer.resultdecorator.resourceenvironmentdecorator.ResourceenvironmentdecoratorFactory;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ResourceType;
import org.palladiosimulator.solver.context.aggregatedUsageContext.ComputedAggregatedUsage;
import org.palladiosimulator.solver.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.AbstractPerformanceAnalysisResult;
import de.uka.ipd.sdq.dsexplore.analysis.IAnalysis;
import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.helper.AGenotypeReader;
import de.uka.ipd.sdq.dsexplore.helper.CriterionAndEvaluator;
import de.uka.ipd.sdq.dsexplore.launch.DSEConstantsContainer;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualFactory;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import de.uka.ipd.sdq.dsexplore.qml.handling.QMLConstantsContainer;
import de.uka.ipd.sdq.dsexplore.qml.reader.QMLDimensionReader;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.DSEProblem;
import de.uka.ipd.sdq.statistics.estimation.ConfidenceInterval;
import de.uka.ipd.sdq.workflow.jobs.UserCanceledException;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Candidate;
import genericdesigndecision.Candidates;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

public class GenotypeReader extends AGenotypeReader {
	
	@Override
	public List<DesignDecisionGenotype> loadGenotypesFromEMF(final String filename, final ADSEProblem dseProblem) {
		
		final PCMInstance pcm = ((DSEProblem) dseProblem).getPcmInstance();
        final ResourceSet pcmResourceSet = pcm.getAllocation().eResource().getResourceSet();

        final EObject eCandidates = EMFHelper.loadFromXMIFile(filename, pcmResourceSet, designdecisionPackage.eINSTANCE);
        //EcoreUtil.resolveAll(eCandidates);
        //FixDesignDecisionReferenceSwitch refSwitch = new FixDesignDecisionReferenceSwitch(Opt4JStarter.getProblem().getInitialInstance());
        //refSwitch.doSwitch(eCandidates);

        if (!(eCandidates instanceof Candidates)){
            throw new RuntimeException("Cannot read candidate model file "+filename+". Please create a new one.", null);
        }
        final Candidates candidates = (Candidates)eCandidates ;
        EcoreUtil.resolveAll(candidates);

        final List<DesignDecisionGenotype> genotypeList = new ArrayList<DesignDecisionGenotype>(candidates.getCandidate().size());
        for (final Candidate candidate : candidates.getCandidate()) {
            final DesignDecisionGenotype genotype = new DesignDecisionGenotype(candidate, candidates.getProblem(), dseProblem.getGenotypeOfInitialInstance());
            genotypeList.add(genotype);
        }

        return genotypeList;
    }

	@Override
    //FIXME: copied from readInPrettyPrintedGenotypes. Refactor to use a proper serialisation!!
    protected List<DSEObjectives> readInPrettyPrintedObjectives(final BufferedReader in, final ADSEProblem problem, final DSEEvaluator<? extends Phenotype> evaluator) throws CoreException, IOException {
        final List<DSEObjectives> results = new ArrayList<DSEObjectives>();

        //order design decisions
        final String headline = in.readLine();
        if (headline == null){
            throw ExceptionHelper.createNewCoreException("Predefined instances file could not be read because it is empty. Specify a valid file or \"random\" or leave the field blank for an evolutionary search.");
        }
        final String[] headlineArray = headline.split(SEPARATOR);

        final List<CriterionAndEvaluator> objectiveList = ((de.uka.ipd.sdq.pcm.designdecision.helper.DSEEvaluator) evaluator).getCriterionAndEvaluatorList();

        //Empty list if no objectives are specified.
        final List<List<CriterionAndEvaluator>> orderedObjectives = getOrderedObjectiveCollection(headlineArray, objectiveList, problem);

        //count confidence intervals to determine boundaries of areas in file (objectives, confidences, genotype)
        final int numberOfConfidenceIntervals = countConfidenceIntervals(headlineArray);

        final int startIndexOfConfidence = orderedObjectives.size();
        if( orderedObjectives.size() == 0){
            ExceptionHelper.createNewCoreException("Tried to read in Pareto front that has no objectives in it. Fix your file.");
        }

        final int expectedLineArrayLength = headlineArray.length;

        String line;
        while ( null != (line = in.readLine()) ) {
            final String[] lineArray = line.split(SEPARATOR);
            //Check minimum length, a last semicolon is ok that makes the line array one longer than the list.
            if (lineArray.length < expectedLineArrayLength){
                throw ExceptionHelper.createNewCoreException("A line in the predefined instances file has not the right length");
            }
            final DSEObjectives objectives = readInObjectivesAndConfidence(
                    orderedObjectives, startIndexOfConfidence,
                    numberOfConfidenceIntervals, lineArray);
            results.add(objectives);
        }
        in.close();

        return results;
    }

    /**
     * Reads the genotypes from the specified files.
     * If objectives are given, reads them and updates the DSEEvaluator cache
     * by calling DSEEvaluator.addToPhenotypeCache(..). Requires confidence intervals
     * to be available for all objectives with statistical evaluators.
     * @param in Is used and modify and closed
     * @param blackboard
     * @return
     * @throws CoreException
     * @throws IOException
     */
    @Override
    protected List<DSEIndividual> readInPrettyPrintedIndividuals(final BufferedReader in, final ADSEProblem problem, final DSEEvaluator<? extends Phenotype> evaluator) throws CoreException, IOException {
        final List<DSEIndividual> results = new LinkedList<DSEIndividual>();

        final List<ADegreeOfFreedom> decisionList = problem.getDesignDecisions();

        //order design decisions
        final String headline = in.readLine();
        if (headline == null){
            throw ExceptionHelper.createNewCoreException("Predefined instances file could not be read because it is empty. Specify a valid file or \"random\" or leave the field blank for an evolutionary search.");
        }
        final String[] headlineArray = headline.split(GenotypeReader.SEPARATOR);

        // the configured list of objectives
        final List<CriterionAndEvaluator> objectiveList = ((de.uka.ipd.sdq.pcm.designdecision.helper.DSEEvaluator) evaluator).getCriterionAndEvaluatorList();
        // Empty list if no objectives are specified.
        // The inner lists must not be empty.
        // The inner lists contain all evaluators that are interested in one column of the result file. For example,
        // if there is a response time objective and a response time constraint, these two are in one list.
        final List<List<CriterionAndEvaluator>> orderedObjectives = getOrderedObjectiveCollection(headlineArray, objectiveList, problem);

        final boolean hasObjectives = orderedObjectives.size() != 0;

        //determine missing objectives
        final List<CriterionAndEvaluator> missingObjectives = determineMissingObjectives(objectiveList, orderedObjectives);

        // special case: find one performance criterion to determine whether confidence intervals are required.
        Criterion performance = null;
        if (hasObjectives){
            for (final List<CriterionAndEvaluator> objectiveAndEvaluatorList : orderedObjectives) {

                if (objectiveAndEvaluatorList.size()>0){
                    final CriterionAndEvaluator first = objectiveAndEvaluatorList.get(0);
                    //XXX: Read the dimension name from definition rather than the constants container
                    if (((ResultsWriter)problem.getWriter("temp")).getDimensionName(first.getCriterion()).contains(new QMLDimensionReader().getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_RESPONSETIME_DEFINITION_PATH).getEntityName())
                            || ((ResultsWriter)problem.getWriter("temp")).getDimensionName(first.getCriterion()).contains(new QMLDimensionReader().getDimension(QMLConstantsContainer.QUALITY_ATTRIBUTE_DIMENSION_THROUGHPUT_DEFINITION_PATH).getEntityName())){
                        performance = first.getCriterion();
                        break;
                    }
                }
            }

        }

        //count confidence intervals to determine boundaries of areas in file (objectives, confidences, genotype)
        final int numberOfConfidenceIntervals = countConfidenceIntervals(headlineArray);

        // determine number of objective columns.

        final int startIndexOfConfidence = orderedObjectives.size();

        //Its always three columns per objective that has confidence
        final int startIndexOfGenotype =  orderedObjectives.size() + numberOfConfidenceIntervals*3;

        //order the design decision in the problem based on the found order.
        final List<ADegreeOfFreedom> orderedDesignDecisions = getOrderedDesignDecisions(
                decisionList, headlineArray, startIndexOfGenotype, problem);

        final int minExpectedLineArrayLength = startIndexOfGenotype + orderedDesignDecisions.size();

        final List<ResourcesWithUtilisationDescriptor> resourceDescriptorsWithUtilResults = getDescriptorsForResourcesWithUtilisation(headlineArray, minExpectedLineArrayLength, (DSEProblem) problem);

        String line;
        while ( null != (line = in.readLine()) ) {
            final String[] lineArray = line.split(SEPARATOR);
            //Check minimum length, a last semicolon is ok that makes the line array one longer than the list.
            if (lineArray.length < minExpectedLineArrayLength){
                throw ExceptionHelper.createNewCoreException("A line in the predefined instances file has not the right length");
            }
            final DesignDecisionGenotype genotype = extractGenotypeAndAddToList(startIndexOfGenotype,
                    orderedDesignDecisions, lineArray);


            final DSEIndividualFactory builder = Opt4JStarter.getIndividualFactory();
            final DSEIndividual individual = builder.create(genotype);
            results.add(individual);

            if (hasObjectives){
                final DSEObjectives objectives = readInObjectivesAndConfidence(
                        orderedObjectives, startIndexOfConfidence,
                        numberOfConfidenceIntervals, lineArray);

                //has utilisations?
                if (resourceDescriptorsWithUtilResults.size() > 0 && performance != null){
                    objectives.addResultDecoratorFor(performance, getResultDecorator(lineArray, minExpectedLineArrayLength, resourceDescriptorsWithUtilResults));

                    //if the processor list is non-empty, but no utilisations were found, warn because the read in values might be old versions
                    if (objectives.getResultDecoratorFor(performance).getUtilisationResults_ResultDecoratorRepository().size() == 0 && !objectives.getValueForCriterion(performance).equals(new DoubleValue(Double.POSITIVE_INFINITY))){
                        logger.warn("Empty utilisation values for non-infinity objectives encountered when reading in individuals, check that this is ok.");
                    }
                }

                //if (Opt4JStarter.getDSEWorkflowConfig().getUseAntipatternKnowledge()){
                if (Opt4JStarter.getDSEWorkflowConfig().isUseHeuristics()){

                    final PCMInstance model = ((DSEProblem) problem).getPcmInstance();

                    //solve dependencies for performance
                    problem.decode(genotype);
                    AbstractPerformanceAnalysisResult.solveDependencies(model);

                    final ComputedAggregatedUsage computedAggregatedUsage = model.getComputedAggregatedUsage();
                    if (computedAggregatedUsage != null){
                        objectives.addComputedAggregatedUsage(performance, computedAggregatedUsage);
                    }
                }

                //add objective to phenotype cache with genotype string
                ((de.uka.ipd.sdq.pcm.designdecision.helper.DSEEvaluator) evaluator).addToPhenotypeCache(genotype.toString(), objectives);

                //add objectives to individual
                individual.setObjectives(objectives);
            }

        }
        in.close();

        if (hasObjectives && missingObjectives.size() > 0){
            // evaluate the objectives that are not read in
            evaluateMissingObjectives(results, missingObjectives, (DSEProblem) problem);
        }

        return results;
    }

    /**
     * Return those objectives in desiredObjectives that are not contained in orderedObjectives.
     * @param desiredObjectives
     * @param availableObjectives
     * @return
     */
     public List<CriterionAndEvaluator> determineMissingObjectives(final List<CriterionAndEvaluator> desiredObjectives, final List<List<CriterionAndEvaluator>> availableObjectives) {

        final List<CriterionAndEvaluator> flattenedAvailableObjectives = new ArrayList<CriterionAndEvaluator>(availableObjectives.size()*3);
        for (final List<CriterionAndEvaluator> list : availableObjectives) {
            flattenedAvailableObjectives.addAll(list);
        }
        final List<CriterionAndEvaluator> missingObjectives = new ArrayList<CriterionAndEvaluator>();
        // from the set of desired objectives...
        missingObjectives.addAll(desiredObjectives);
        // ... remove all objectives that are already included in the files
        missingObjectives.removeAll(flattenedAvailableObjectives);

        // the resulting list are all desired objectives that are not in orderObjectives.
        return missingObjectives;

    }

    /**
     * Check all objectives of the indivuals and evaluate the missing ones
     * @param results
     * @param missingObjectives
     * @throws
     * @throws JobFailedException
     * @throws UserCanceledException
     * @throws CoreException
     */
    private void evaluateMissingObjectives(final List<DSEIndividual> results, final List<CriterionAndEvaluator> missingObjectives, final DSEProblem problem) throws CoreException {

        for (final DSEIndividual individual : results) {

            final de.uka.ipd.sdq.pcm.designdecision.helper.DSEEvaluator dseEvaluator = (de.uka.ipd.sdq.pcm.designdecision.helper.DSEEvaluator) task.getInstance(de.uka.ipd.sdq.pcm.designdecision.helper.DSEEvaluator.class);

            final PCMPhenotype pheno = (PCMPhenotype) problem.decode(individual.getGenotype());
            individual.setPhenotype(pheno);

            final List<IAnalysis> alreadyEvaluatedMissingObjectives = new LinkedList<IAnalysis>();

            for (final CriterionAndEvaluator criterionAndEvaluator : missingObjectives) {
                final IAnalysis evaluator = criterionAndEvaluator.getEvaluator();

                try {
                    if (!alreadyEvaluatedMissingObjectives.contains(evaluator)){
                        evaluator.analyse(pheno, dseEvaluator.getMonitor());

                        alreadyEvaluatedMissingObjectives.add(evaluator);

                    }

                    dseEvaluator.retrieveCriterion(pheno, individual.getObjectives(), criterionAndEvaluator);

                } catch (final Exception e){
                    throw ExceptionHelper.createNewCoreException("Analysis of missing objectives when reading in genotypes failed. See nested cause.", e);
                }

            }

        }

    }

    private  List<ResourcesWithUtilisationDescriptor> getDescriptorsForResourcesWithUtilisation(
            final String[] headlineArray, final int minExpectedLineArrayLength, final DSEProblem problem) {

        final List<ResourcesWithUtilisationDescriptor> allPotentialResourcesWithUtil = getAllProcessors(problem);
        final List<ResourcesWithUtilisationDescriptor> orderedListOfUsedResourceDesccriptors = new ArrayList<ResourcesWithUtilisationDescriptor>(allPotentialResourcesWithUtil.size());
        for (int i = minExpectedLineArrayLength; i < headlineArray.length; i++) {
            final String entry = headlineArray[i];
            for (final Iterator<ResourcesWithUtilisationDescriptor> iterator = allPotentialResourcesWithUtil.iterator(); iterator
                    .hasNext();) {
                final ResourcesWithUtilisationDescriptor processor = iterator
                        .next();
                if ( entry.contains(processor.getEntity().getEntityName())
                        && entry.contains(processor.getResourceType().getEntityName())){
                    orderedListOfUsedResourceDesccriptors.add(processor);
                    iterator.remove();
                    break;
                }
            }
        }


        return orderedListOfUsedResourceDesccriptors;
    }

    private List<ResourcesWithUtilisationDescriptor> getAllProcessors(
            final DSEProblem problem) {
        final List<ResourceContainer> containers = problem.getPcmInstance().getResourceEnvironment().getResourceContainer_ResourceEnvironment();
        final List<ResourcesWithUtilisationDescriptor> descriptorList = new LinkedList<ResourcesWithUtilisationDescriptor>();
        for (final ResourceContainer resourceContainer : containers) {
            final List<ProcessingResourceSpecification> processorsOnContainer = resourceContainer.getActiveResourceSpecifications_ResourceContainer();
            for (final ProcessingResourceSpecification processingResourceSpecification : processorsOnContainer) {
                descriptorList.add(new ResourcesWithUtilisationDescriptor(resourceContainer, processingResourceSpecification.getActiveResourceType_ActiveResourceSpecification()));
            }

        }
        final List<LinkingResource> links = problem.getPcmInstance().getResourceEnvironment().getLinkingResources__ResourceEnvironment();
        for (final LinkingResource linkingResource : links) {
            descriptorList.add(new ResourcesWithUtilisationDescriptor(linkingResource, linkingResource.getCommunicationLinkResourceSpecifications_LinkingResource().getCommunicationLinkResourceType_CommunicationLinkResourceSpecification()));
        }
        return descriptorList;
    }

    private ResultDecoratorRepository getResultDecorator(final String[] lineArray,
            final int minExpectedLineArrayLength, final List<ResourcesWithUtilisationDescriptor> processorsWithUtilResults) throws CoreException {

        final ResultDecoratorRepository repo = ResultdecoratorFactory.eINSTANCE.createResultDecoratorRepository();

        for (int i = 0; i < lineArray.length - minExpectedLineArrayLength && i < processorsWithUtilResults.size(); i++) {
            final String entry = lineArray[i+minExpectedLineArrayLength];
            if (entry.length() > 0){
                final ResourcesWithUtilisationDescriptor processor = processorsWithUtilResults.get(i);
                final ActiveResourceUtilisationResult result = processor.createUtilisationResult();

                result.setResourceUtilisation(Double.parseDouble(entry));
                //TODO: implement these if possible.
                result.setDemandedTime(Double.NaN);
                result.setAverageWaitTime(Double.NaN);
                repo.getUtilisationResults_ResultDecoratorRepository().add(result);
            }

        }
        return repo;

    }

    private int countConfidenceIntervals(
            final String[] headlineArray) throws CoreException {
        //now count confidence intervals.
        int numberOfConfidenceIntervals = 0;
        for (int i = 0; i < headlineArray.length; i++) {
            if (headlineArray[i].contains(DSEConstantsContainer.LOWER_BOUND_CONFIDENCE+"(")){
                //|| headlineArray[i].contains(DSEConstantsContainer.UPPER_BOUND_CONFIDENCE+"(")
                //|| headlineArray[i].contains(DSEConstantsContainer.ALPHA) ){
                numberOfConfidenceIntervals++;
            }
        }
        return numberOfConfidenceIntervals;
    }

    private DesignDecisionGenotype extractGenotypeAndAddToList(
            final int startIndexOfGenotype,
            final List<ADegreeOfFreedom> orderedDesignDecisions, final String[] lineArray) throws CoreException {

        final DesignDecisionGenotype genotype = new DesignDecisionGenotype();
        //read in genotype
        int decisionIndex = 0;
        for (int i = startIndexOfGenotype; i < lineArray.length && decisionIndex < orderedDesignDecisions.size(); i++) {
            final Choice gene = DSEDecoder.getChoiceFor(lineArray[i], orderedDesignDecisions.get(decisionIndex));
            genotype.add(gene);
            decisionIndex++;
        }
        return genotype;
    }

    private DSEObjectives readInObjectivesAndConfidence(
            final List<List<CriterionAndEvaluator>> orderedObjectives,
            final int startIndexOfConfidence, final int numberOfConfidenceIntervals,
            final String[] lineArray) throws CoreException {
        //Read in objectives
        final DSEObjectives objectives = readInObjectives(lineArray, startIndexOfConfidence, orderedObjectives);

        //read in confidence
        readInConfidenceIntervals(lineArray, startIndexOfConfidence, numberOfConfidenceIntervals, orderedObjectives, objectives);
        return objectives;
    }

    /**
     * Orders the objectives based on the file and also adjusts the DSEProblem accordingly.
     * @param decisionList
     * @param headlineArray
     * @param startIndexOfGenotype
     * @param problem
     * @return
     */
    private List<ADegreeOfFreedom> getOrderedDesignDecisions(
            final List<ADegreeOfFreedom> decisionList, final String[] headlineArray,
            final int startIndexOfGenotype, final ADSEProblem problem)  throws CoreException{
        final List<ADegreeOfFreedom> orderedDesignDecisions = new ArrayList<ADegreeOfFreedom>();
        for (int i = startIndexOfGenotype; i < headlineArray.length; i++) {
            final String headlineEntry = headlineArray[i];
            for (final ADegreeOfFreedom decision : decisionList) {
                //We could use an iterator here and directly delete all design decision that have been matched from the list, to make the subsequent steps faster.
                if (decision.getDegreeDescription().contains(headlineEntry)){
                    orderedDesignDecisions.add(decision);
                    break;
                }
            }
        }

        //Check that the last colums are only utilisation values.
        int numberOfUtilColumns = 0;
        for (int i = startIndexOfGenotype + orderedDesignDecisions.size(); i < headlineArray.length; i++){
            final String headlineString = headlineArray[i];
            if (headlineString.contains("Util") || headlineString.contains("Candidate ID")){
                numberOfUtilColumns++;
            }
        }

        // If there were unrecognised headline entries (entries that are not before the genotype and that do
        // not contain the Substring Util, throw an exception
        if (headlineArray.length - startIndexOfGenotype - numberOfUtilColumns > orderedDesignDecisions.size()) {
            throw ExceptionHelper.createNewCoreException("Not all design decisions in the file were recognised. Check your file.\n"
                    + " Design decisions from index "+startIndexOfGenotype+" to index "+(headlineArray.length - numberOfUtilColumns -1)
                    + ", but expected "+orderedDesignDecisions.size()+ " decisions.\n These decisions are expected: "+orderedDesignDecisions.toString()
                    + "\n Make sure that you provided a designdecision file that matches the predefined candidates (i.e. there is a decision for each column in the predefined candidates files).");
        }

        //set the internal design decisions to the same order
        problem.getDesignDecisions().clear();
        problem.getDesignDecisions().addAll(orderedDesignDecisions);

        return orderedDesignDecisions;
    }

    /**
     * Fills the confidence intervals of the passed objective and returns it.
     * @param lineArray
     * @param startIndexOfConfidence
     * @param numberOfConfidenceIntervals
     * @param orderedObjectives
     * @param objectives
     * @return
     * @throws CoreException
     */
    private DSEObjectives readInConfidenceIntervals(final String[] lineArray,
            final int startIndexOfConfidence, final int numberOfConfidenceIntervals,
            final List<List<CriterionAndEvaluator>> orderedObjectives, final DSEObjectives objectives) throws CoreException {

        //read in confidence
        int index = startIndexOfConfidence;
        for (final List<CriterionAndEvaluator> objectiveAndEvaluatorList : orderedObjectives) {
            if (objectiveAndEvaluatorList.size() > 0){

                // only the first evaluator has to be handled because they all point to the same IAnalysis (e.g. SimuCom)
                final CriterionAndEvaluator objectiveAndEvaluator = objectiveAndEvaluatorList.get(0);

                if (objectiveAndEvaluator.getEvaluator().hasStatisticResults() && index < lineArray.length - 2){
                    final String lowerConfidenceString = lineArray[index];
                    final String upperConfidenceString = lineArray[index+1];
                    final String alphaConfidenceString = lineArray[index+2];

                    final Criterion criterion = objectiveAndEvaluator.getCriterion();
                    final Value<?> value = objectives.getValueForCriterion(criterion);

                    final ConfidenceInterval ci = readInConfidenceInterval(lowerConfidenceString, upperConfidenceString, alphaConfidenceString, value);
                    index = index +3;
                    objectives.addConfidence(objectiveAndEvaluator.getCriterion(), ci);
                } else {

                }
            }
        }
        return objectives;
    }

    /**
     * Objective definition must be in the first columns of the file.
     *
     * @param headline
     * @param objectiveList: A list of lists. The inner lists contains the {@link Criterion} for one headline entry.
     * The list is in the same order as the headline, so the values in the lines can be associated with a {@link Criterion} by index.
     * The inner lists are not empty.
     * @return never null, but may be an empty list.
     */
    private List<List<CriterionAndEvaluator>> getOrderedObjectiveCollection(final String[] headline, final List<CriterionAndEvaluator> objectiveList, ADSEProblem problem) throws CoreException{

        final List<List<CriterionAndEvaluator>> orderedObjectives = new ArrayList<List<CriterionAndEvaluator>>(objectiveList.size());

        for (int i = 0; i < headline.length; i++) {
            final String objectiveString = headline[i];
            final List<CriterionAndEvaluator> o = matchObjective(objectiveList, objectiveString, problem);
            if (o.size() == 0){
                //The current entry is not an objective, so the objective columns are done
                break;
            } else {
                orderedObjectives.add(o);
            }
        }

        if (objectiveList.size() < orderedObjectives.size()){
            // I cannot have more objectives than evaluators.
            // throw Exception and notify user that there must be only one column per objective
            throw ExceptionHelper.createNewCoreException("Error reading in objectives: There must be only one column for each objective.");
        }

        return orderedObjectives;
    }


    private  ConfidenceInterval readInConfidenceInterval(
            final String lowerConfidenceString, final String upperConfidenceString,
            final String alphaConfidenceString,
            final Value<?> value) throws CoreException {

        try {
            final double lowerBound = parseToDouble(lowerConfidenceString);
            final double upperBound = parseToDouble(upperConfidenceString);
            final double level = parseToDouble(alphaConfidenceString);
            return new ConfidenceInterval(value.getDouble(), lowerBound, upperBound, level);
        } catch (final NumberFormatException e){
            throw ExceptionHelper.createNewCoreException("Could not read in confidence interval. Expected this to be a confidence interval: "
                    +lowerConfidenceString+SEPARATOR+upperConfidenceString+SEPARATOR+alphaConfidenceString, e);
        }


    }

    private List<CriterionAndEvaluator> matchObjective(final List<CriterionAndEvaluator> objectiveList, final String objectiveString, ADSEProblem problem) {
        final List<CriterionAndEvaluator> results = new ArrayList<CriterionAndEvaluator>(objectiveList.size());
        for (final CriterionAndEvaluator objective : objectiveList) {
            if (objectiveString.equals(((ResultsWriter)problem.getWriter("temp")).getDimensionName(objective.getCriterion()))){
                results.add(objective);
            }
        }
        return results;
    }

    /**
     * Reads in
     * @param orderedObjectives
     * @param endIndex
     * @param
     * @return
     * @throws IOException
     * @throws CoreException
     */
    private DSEObjectives readInObjectives(final String[] objectiveLine, final int endIndex, final List<List<CriterionAndEvaluator>> orderedObjectives) throws CoreException {

        //objective line must have at least the length of the passed list
        if (objectiveLine.length < orderedObjectives.size()){
            throw ExceptionHelper.createNewCoreException("Error when reading in result line: the line is shorter ("+objectiveLine+" entries) than the number of objectives I look for ("+orderedObjectives.size()+"entries).");
        }

        DSEObjectives obj;
        if (task != null){
            obj = task.getInstance(DSEObjectives.class);//QUICKHACK
        } else {
            //TODO: LEGACY, but required in PredefinedInstanceEvaluator because that one does not initialise the Opt4J environment.
            obj = new DSEObjectives();
        }

        int lineIndex = 0;
        for (final List<CriterionAndEvaluator> criterionList : orderedObjectives) {
            try {
                final double d = parseToDouble(objectiveLine[lineIndex]);
                for (final CriterionAndEvaluator criterionAndEvaluator : criterionList) {
                    final Criterion criterion = criterionAndEvaluator.getCriterion();
                    obj.addValueForCriterion(criterion, d);
                }
            } catch (final NumberFormatException e){
                throw ExceptionHelper.createNewCoreException("Could not parse objective value "+objectiveLine[lineIndex]+". Fix your input genome file.");
            }
            lineIndex++;
        }

        return obj;
    }

    private double parseToDouble(final String number) {
        final double d =  Double.parseDouble(number);
        if (Double.isInfinite(d)){
            logger.warn("Read in an infinite objective or confidence interval from predefined file, please check that this is correct and not result of an incomplete previous analysis step.");
        } else if (Double.isNaN(d)){
            logger.warn("Read in an objective or confidence interval with NaN value from predefined file, please check that this is correct and not result of an incomplete previous analysis step.");
        }
        return d;
    }
}

class ResourcesWithUtilisationDescriptor{

    Entity resource;

    ResourceType resourceType;

    public ResourcesWithUtilisationDescriptor(final Entity resource, final ResourceType resourceType) {
        super();
        this.resource = resource;
        this.resourceType = resourceType;
    }

    public ResourceType getResourceType() {
        return this.resourceType;
    }

    public Entity getEntity() {
        return this.resource;
    }

    public ActiveResourceUtilisationResult createUtilisationResult() throws CoreException{
        if (resource instanceof ResourceContainer){
            if (resourceType != null){
                final ResourceContainer rc = (ResourceContainer)resource;

                for (final ProcessingResourceSpecification procRes : rc.getActiveResourceSpecifications_ResourceContainer()) {
                    if (procRes.getActiveResourceType_ActiveResourceSpecification().getId().equals(resourceType.getId())){

                        final ProcessingResourceSpecificationResult result = ResourceenvironmentdecoratorFactory.eINSTANCE.createProcessingResourceSpecificationResult();
                        result.setProcessingResourceSpecification_ProcessingResourceSpecificationResult(procRes);
                        result.setEntityName("Util of "+resource.getEntityName()
                                +"_"+resourceType.getEntityName());
                        return result;
                    }
                }
                throw ExceptionHelper.createNewCoreException("No processing resource of type "+this.resourceType+" found for ResourceContainer "+this.resource.getEntityName());

            } else {
                // 	TODO: as soon as we support aggregated results for the whole resource container, this has to be handled here
                throw ExceptionHelper.createNewCoreException("Aggregated utilisation results for resource containers are not yet supported, define a resource type.");
            }
        } else if (resource instanceof LinkingResource){
            final LinkingResourceResults result = ResourceenvironmentdecoratorFactory.eINSTANCE.createLinkingResourceResults();
            result.setEntityName("Util of "+resource.getEntityName()+"_"+resourceType.getEntityName());
            result.setLinkingResource_LinkingResourceResults((LinkingResource) resource);
            return result;
        } else {
            throw ExceptionHelper.createNewCoreException("Unknown entity to create utilisation results for: "+this.resource.getClass().getName());
        }
    }

}
