package de.uka.ipd.sdq.dsexplore.helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.opt4j.start.Opt4JTask;

import de.uka.ipd.sdq.dsexplore.exception.ExceptionHelper;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividualFactory;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;
import de.uka.ipd.sdq.dsexplore.opt4j.start.Opt4JStarter;
import genericdesigndecision.ADSEProblem;

public abstract class AGenotypeReader {

    /**QUICKHACK need to inject objectives!!!**/
    protected Opt4JTask task = null;
    
    public void setTask(final Opt4JTask t){
        task = t;
    }

    protected static final String SEPARATOR = ";";

    /** Logger for log4j. */
    protected static Logger logger =
            Logger.getLogger("de.uka.ipd.sdq.dsexplore.helper.GenotypeReader");

    /**
     * Reads the genotypes from the specified files.
     * If the file contains pretty printed genotypes and
     * objectives are given, reads them and updates the DSEEvaluator cache
     * by calling DSEEvaluator.addToPhenotypeCache(..). Requires confidence intervals
     * to be available for all objectives with statistical evaluators.
     * Reading in of objectives and confidence values is not supported for raw genotype files.
     * Note that this method changes the internal objectives and deletes all objectives that are not
     * found in the file.
     * @param blackboard
     */
    public List<DesignDecisionGenotype> getGenotypes(final String filename, final ADSEProblem dseProblem, final DSEEvaluator evaluator)
            throws CoreException {

        if ("".equals(filename)){
            return Collections.emptyList();
        }

        if (filename.contains("csv")) {
            try {

                final List<DSEIndividual> individuals = readInPrettyPrintedIndividuals(getReaderFor(filename), dseProblem, evaluator);
                final List<DesignDecisionGenotype> results = new ArrayList<DesignDecisionGenotype>(
                        individuals.size());
                for (final DSEIndividual individual : individuals) {
                    results.add(individual.getGenotype());
                }

                return results;

            } catch (final Exception ex) {
                throw ExceptionHelper.createNewCoreException(
                        "Could not evaluate predefined instances. See nested Exceptions for cause. "
                                + ex.getMessage(), ex);
            }
        } else if (filename.contains("designdecision")) {
            return loadGenotypesFromEMF(filename, dseProblem);

        } else {
            throw ExceptionHelper
            .createNewCoreException("Genotype file to read must must be of type csv or designdecision.");
        }
    }

    /**
     * Load complete Individuals from the file (with objectives and utilisation info, if present).
     * @param filename
     * @param blackboard
     * @return
     * @throws CoreException
     */
    public List<DSEIndividual> getIndividuals(final String filename, final ADSEProblem dseProblem, final DSEEvaluator evaluator) throws CoreException{

        if (filename.contains("csv")) {
            try {

                final List<DSEIndividual> individuals = readInPrettyPrintedIndividuals(getReaderFor(filename), dseProblem, evaluator);
                return individuals;

            } catch( final Exception ex ) {
                throw ExceptionHelper.createNewCoreException("Could not evaluate predefined instances. See nested Exceptions for cause. "+ex.getMessage(), ex);
            }
        } else if (filename.contains("designdecision")) {
            final List<DesignDecisionGenotype> genotypes = loadGenotypesFromEMF(filename, dseProblem);
            final List<DSEIndividual> individuals = new ArrayList<DSEIndividual>(genotypes.size());
            for (final DesignDecisionGenotype designDecisionGenotype : genotypes) {
                final DSEIndividualFactory builder = Opt4JStarter.getIndividualFactory();
                final DSEIndividual individual = builder.create(designDecisionGenotype);
                individuals.add(individual);
            }
            return individuals;

        } else {
            throw ExceptionHelper
            .createNewCoreException("Genotype file to read must must be of type csv or designdecision.");
        }
    }

    /**
     * Note that this method changes the internal objectives and deletes all objectives that are not
     * found in the file.
     * @param filename
     * @return
     * @throws CoreException
     */
    public List<DSEObjectives> getObjectives (final String filename, final ADSEProblem problem, final DSEEvaluator evaluator) throws CoreException{

        try {

            final List<DSEObjectives> results = readInPrettyPrintedObjectives(getReaderFor(filename), problem, evaluator);

            return results;

        } catch( final Exception ex ) {
            throw ExceptionHelper.createNewCoreException("Could not evaluate predefined instances. Leave field blank for evolutionary search or type \"random\" for a random search. "+ex.getMessage(), ex);
        }
    }
    
    protected BufferedReader getReaderFor(String path) throws FileNotFoundException {
        // if this is a platform URL, first resolve it to an absolute path
        if (path.startsWith("platform:")){
            try {
                final URL solvedURL = FileLocator.resolve(new URL(path));
                path =  solvedURL.getPath();
            } catch (final Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        final File file = new File(path);

        final InputStreamReader ir = new InputStreamReader(
                new FileInputStream( file ) );
        final BufferedReader in = new BufferedReader(ir);
        return in;
    }
    
	public abstract List<DesignDecisionGenotype> loadGenotypesFromEMF(final String filename, final ADSEProblem dseProblem);
    
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
    protected abstract List<DSEIndividual> readInPrettyPrintedIndividuals(final BufferedReader in, final ADSEProblem problem, final DSEEvaluator evaluator) throws CoreException, IOException;

    protected abstract List<DSEObjectives> readInPrettyPrintedObjectives(final BufferedReader in, final ADSEProblem problem, final DSEEvaluator evaluator) throws CoreException, IOException;
}