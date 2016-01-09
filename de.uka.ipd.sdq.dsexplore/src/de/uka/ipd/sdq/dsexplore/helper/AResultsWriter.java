package de.uka.ipd.sdq.dsexplore.helper;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;
import org.opt4j.core.Constraint;
import org.opt4j.core.Criterion;
import org.opt4j.core.Individual;
import org.opt4j.core.Objective;

import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.ITactic;
import de.uka.ipd.sdq.dsexplore.opt4j.optimizer.heuristic.operators.TacticsResultCandidate;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEIndividual;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEObjectives;
import genericdesigndecision.Candidates;

/**
 * XXX: Maybe make this a proper label provider for the results? Metamodel results?
 * 
 * After calling close(), the AResultsWriter should not be used anymore, because it will have closed its internal writer and set the reference to null. Any further logs are written to Log4J.
 *  
 * @author Anne
 *
 */
public abstract class AResultsWriter {
	
	/** Logger for log4j. */
	protected static Logger logger = Logger.getLogger("de.uka.ipd.sdq.dsexplore.ResultsWriter");
	
	//
	// Part for heuristics
	//
	
	/**
	 * Formating string used for logging purposes
	 */
	protected static final String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
	protected String myfilename;
	protected FileWriter fileWriter;
	protected List<Criterion> criteriaToSave;
	protected List<Criterion> criteriaWithConfidence;
	
	public AResultsWriter(String filename) {
		this.myfilename = filename+"_"+getTimeDateString()+".csv";
		try {
			this.fileWriter = new FileWriter(myfilename);
		} catch (IOException e) {
			logger.error("Cannot write to file "+myfilename+" to store individuals. I will print them to the logger instead. Cause: "+e.getMessage());
			e.printStackTrace();
		} 
	}
	
	public abstract void writeTacticManagerChoice(TacticsResultCandidate c);
	
	public abstract void writeTacticCandidateInfo(ITactic heuristic, Collection<TacticsResultCandidate> candidatesFromCurrentHeuristic);
	
	public void writeIndividual(DSEIndividual i) {
		List<DSEIndividual> individualList = new ArrayList<DSEIndividual>(1);
		individualList.add(i);
		
		StringBuilder result = new StringBuilder(100);
		
		if (this.criteriaToSave == null){
			//This is the first individual, so write headline, too. 
			//this method also determines the objectives
			this.criteriaToSave = determineCriterionsToSave(i);
			result = prettyPrintHeadlineCSV(individualList, result, this.criteriaToSave);
		} 
		
		if (this.criteriaWithConfidence == null){
			this.criteriaWithConfidence = determineCriteriaWithConfidenceInterval(i);
		}
		//Write the result line 
		result = prettyPrintResultLineCSV(result, i, this.criteriaToSave, this.criteriaWithConfidence);
		
		this.write(result);
	}
	
	protected List<Criterion> determineCriteriaWithConfidenceInterval(
			DSEIndividual firstIndividual) {
		DSEObjectives objs = firstIndividual.getObjectives();
		List<Criterion> criteriaWithConfidence = new ArrayList<Criterion>();
		
		if (objs != null && objs.size() > 0){
			List<String> coveredDimensions = new ArrayList<String>();

			for (Objective objective : objs.getKeys()) {
				if (objs.getConfidenceIntervalForObjective(objective) != null){
					criteriaWithConfidence.add(objective);
					coveredDimensions.add(getDimensionName(objective));
				}
			}

			for (Constraint constraint : objs.getConstraints().getKeys()) {
				if (!coveredDimensions.contains(getDimensionName(constraint))){
					if (objs.getConfidenceIntervalForObjective(constraint) != null){
						criteriaWithConfidence.add(constraint);
					}
				}
			}
		}
		
		return criteriaWithConfidence;
	}
	
	protected List<Criterion> determineCriterionsToSave(DSEIndividual i) {
		DSEObjectives objs = i.getObjectives();
		
		
		List<Criterion> criterionsToSave = new ArrayList<Criterion>();
		if (objs != null && objs.size() != 0){
			criterionsToSave.addAll(objs.getKeys());

			// check for each constraint whether an objective already covers its quality dimension. If not, it needs to be added to the list
			Collection<Constraint> constraints = objs.getConstraints().getKeys();
			for (Constraint constraint : constraints) {
				boolean hasToBeAdded = true;
				for (Criterion coveredCriterion : criterionsToSave) {
					if (getDimensionName(constraint).equals(getDimensionName(coveredCriterion))){
						// criterion is already covered
						hasToBeAdded = false;
						break;
					}
				}
				if (hasToBeAdded){
					criterionsToSave.add(constraint);
				}
			}
		}
		return criterionsToSave;
	}
	
	protected abstract String getDimensionName(Criterion criterion);
	
	/**
	 * If order of all Objectives first, then confidences is changed, also change GenotypeReader accordingly.
	 * Expects a list of objectives to create a headline entry for.  
	 * @param individuals
	 * @param output
	 * @param criterionsToSave
	 * @return
	 */
	protected abstract StringBuilder prettyPrintHeadlineCSV(Collection<DSEIndividual> individuals, StringBuilder output, List<Criterion> criterionsToSave);
	
	protected abstract StringBuilder prettyPrintResultLineCSV(StringBuilder output, DSEIndividual ind, List<Criterion> criterionsToSave, List<Criterion> criteriaWithConfidence);
	
	/**
	 * Write all individuals to new file (file current time in filename).
	 * @param individuals
	 * @param filename
	 * @param iteration
	 * @param exceptionList
	 * @param asEMF 
	 */
	public void writeIndividualsToFile(Collection<Individual> individuals, String filename, int iteration,
			List<Exception> exceptionList, boolean asEMF, boolean asCSV){
		List<DSEIndividual> dseIndList = new ArrayList<DSEIndividual>(individuals.size());
		for (Individual ind : individuals) {
			if (ind instanceof DSEIndividual) {
				dseIndList.add((DSEIndividual)ind);
			}
		}	
		writeDSEIndividualsToFile(dseIndList, filename, iteration, asEMF, asCSV, exceptionList);
	}
	
	/**
	 * Write all individuals to new file (file current time in filename).
	 * @param individuals
	 * @param filename
	 * @param iteration
	 * @param exceptionList
	 */
	public void writeDSEIndividualsToFile(Collection<DSEIndividual> individuals, String filename, int iteration, boolean asEMF,
			boolean asCVS, List<Exception> exceptionList) {
		if (individuals.size() > 0){
			if (asCVS){
				StringBuilder results = addResultsToCSVString(individuals, exceptionList);
				writeToNewFile(filename, results, iteration, exceptionList, ".csv");
			} 
			if (asEMF){
				// save as EMF files
				Candidates candidates = EMFHelper.createEMFCandidates(individuals);
				EMFHelper.saveToXMIFile(candidates, getFilenameForIteration(filename, iteration, ".designdecision"));
			}
		}
	}
	
	/**
	 * Writes the individuals to a StringBuffer in csv format.
	 * @param individuals
	 * @param exceptionList
	 * @return
	 */
	protected StringBuilder addResultsToCSVString(Collection<DSEIndividual> individuals, List<Exception> exceptionList) {
		StringBuilder output = new StringBuilder(10000);
		
		DSEIndividual firstIndividual = individuals.iterator().next();
		
		List<Criterion> criteriaToSave = determineCriterionsToSave(firstIndividual);
		List<Criterion> criteriaWithConfidence = determineCriteriaWithConfidenceInterval(firstIndividual);

		output = prettyPrintHeadlineCSV(individuals, output, criteriaToSave);
		int counter = 0;

		// content
		for (DSEIndividual ind2 : individuals) {
			try {
			output = prettyPrintResultLineCSV(output, ind2,criteriaToSave, criteriaWithConfidence);
			} catch (Exception e){
				exceptionList.add(new Exception("Encountered corrupted result number "+counter+", skipped it", e));
			}
			counter++;
		}
		return output;
	}
	
	public String formatDouble(Double gene) {
		return Double.toString(gene);
	}

	public String getFilename() {
		return this.myfilename;
	}
	
	/**
	 * Write any string to the given file. 
	 * @param filename
	 * @param content
	 * @param iteration Is used for the filename
	 * @param exceptionList
	 */
	public void writeStringToFile(String filename, String content, int iteration, List<Exception> exceptionList, String fileEnding){
		writeToNewFile(filename, new StringBuilder(content), iteration, exceptionList, fileEnding);
	}
	
	/**
	 * Writes String entry to log file in results directory. 
	 * @param entry
	 */
	public void writeToLogFile(String entry) {
		try{
			StringBuilder out = new StringBuilder(50);
			Calendar cal = Calendar.getInstance();
		    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
		    out.append(sdf.format(cal.getTime()) + ";" + entry);
		    
		    this.write(out);
		}catch (Exception e){//Catch exception if any
		      System.err.println("Error: " + e.getMessage());
		}
	}

	public void flush() {
		try {
			this.fileWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * Closes the internal file writer (as defined in FileWriter.close()). 
	 * After closing, the AResultsWriter should not be used anymore. 
	 * Further calls of the AResultsWriter will be logged to Log4J with error messages, as if 
	 * no file writer could be initialised. 
	 * Multiple calls of close() have no effect.   
	 */
	public void close(){
		if (this.fileWriter != null){
			try {
				this.fileWriter.flush();
				this.fileWriter.close();
				this.fileWriter = null;
			} catch (IOException e) {
				logger.error("Cannot close the file handle " + this.myfilename + ". Your results might be lost. Cause: " + e.getMessage());
				e.printStackTrace();
			}
	
		}
	}

	protected void writeToNewFile(String filename, StringBuilder results, int iteration, List<Exception> exceptionList, String fileEnding) {
		filename = getFilenameForIteration(filename, iteration, fileEnding);
		try {
			BufferedWriter w = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(filename)));
			
			w.write(results.toString());
			
			w.flush();
			
			w.close();
		} catch (FileNotFoundException e) {
			exceptionList.add(e);
			e.printStackTrace();
		} catch (IOException e) {
			exceptionList.add(e);
			e.printStackTrace();
		}
		
	}
	
	protected String getFilenameForIteration(String basicFilename, int iteration, String fileEnding) {
		return basicFilename +iteration+"_" + getTimeDateString() + fileEnding;
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.close();
		super.finalize();
	}


	protected static String getTimeDateString(){
		Date date = new Date();
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
		String stringDate = simpleFormat.format(date);
		stringDate = stringDate.replaceAll(":", "-").replaceAll(" ", "_");
		return  stringDate;
	}
	
	/**
	 * Write the string to this.fileWriter. 
	 * @param result
	 */
	protected void write(StringBuilder result) {
		if (this.fileWriter != null){
			try {
				fileWriter.write(result.toString());
				fileWriter.flush();
			} catch (IOException e) {
				logger.error("Cannot write to file " + this.myfilename + " Logging the result at level INFO now. Cause: " + e.getMessage());
				logger.info(result.toString());
			}
		} else {
			logger.info(result.toString());
		}
	}
	
}