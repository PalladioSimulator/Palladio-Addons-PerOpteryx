package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree;

/**
 * {@link FinalBinaryGenotype} is a genotype representation which contains the binary representation
 * of a {@link DesignDecisionGenotype}. The {@link FinalBinaryGenotype} can be used for performing actual
 * operations on the genotypes.
 * @author Apoorv
 *
 */
public class FinalBinaryGenotype {
	/* This class holds the final representation of the binary genotype.
	 * It contains 2 variables, Genotype and OrderOfDegrees.
	 * Genotype: This is the final binary representation
	 * OrderOfDegrees: Corresponding order in which the Degrees are stored 
	 */
	private static Logger logger = 
			Logger.getLogger("de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype");
	private List<Integer> Genotype;
	private List<TypeOfDegree> OrderOfDegrees;
	private List<Integer> BitsPerDegree = new ArrayList<Integer>();
	
	// Constructors here...
	
	public FinalBinaryGenotype(){
		this.Genotype = new ArrayList<Integer>();
		this.OrderOfDegrees = new ArrayList<TypeOfDegree>();
		this.BitsPerDegree = new ArrayList<Integer>();
	}
	
	public FinalBinaryGenotype(List<BinaryGenotype> list){
		List<Integer> GenotypeList = new ArrayList<Integer>();
		for(int i=0; i < list.size() ; i++){
			this.BitsPerDegree.add(list.get(i).getInternalList().size());
			for(int j=0; j < list.get(i).getInternalList().size() ; j++){
				GenotypeList.add((Integer) list.get(i).getInternalList().get(j));
			}
		}
		this.Genotype = GenotypeList;
		
		List<TypeOfDegree> DegreeList = new ArrayList<TypeOfDegree>();
		for(int i=0; i < list.size() ; i++){
			DegreeList.add(list.get(i).getDegreeType());
		}
		this.OrderOfDegrees = DegreeList;
		logger.info("Ended the FinalBinaryGenotype constructor");
	}
	// Methods here ...
	
	public List<Integer> getBinaryGenotype(){
		return this.Genotype;
	}
	
	public List<TypeOfDegree> getOrderOfDegrees(){
		return this.OrderOfDegrees;
	}
	
	public List<Integer> getBitsPerDegree(){
		return this.BitsPerDegree;
	}
	
	public void setBinaryGenotype(List<Integer> Genotype){
		this.Genotype = Genotype;
	}
	
	public void setOrderOfDegrees(List<TypeOfDegree> OrderOfDegrees){
		this.OrderOfDegrees = OrderOfDegrees;
	}
	
	public void setBitsPerDegree(List<Integer> BitsPerDegree){
		this.BitsPerDegree = BitsPerDegree;
	}
	

}
