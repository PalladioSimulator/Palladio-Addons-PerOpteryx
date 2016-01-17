package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

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
	private List<Binary> Genotype;
	private List<String> OrderOfDegrees;
	private List<Integer> BitsPerDegree = new ArrayList<Integer>();
	
	// Constructors here...
	
	public FinalBinaryGenotype(){
		this.Genotype = new ArrayList<Binary>();
		this.OrderOfDegrees = new ArrayList<String>();
		this.BitsPerDegree = new ArrayList<Integer>();
	}
	
	public FinalBinaryGenotype(List<BinaryGenotype> list){
		List<Binary> GenotypeList = new ArrayList<Binary>();
		for(int i=0; i < list.size() ; i++){
			this.BitsPerDegree.add(list.get(i).getInternalList().size());
			for(int j=0; j < list.get(i).getInternalList().size() ; j++){
				GenotypeList.add(list.get(i).getInternalList().get(j));
			}
		}
		this.Genotype = GenotypeList;
		
		List<String> DegreeList = new ArrayList<String>();
		for(int i=0; i < list.size() ; i++){
			DegreeList.add(list.get(i).getDegreeType());
		}
		this.OrderOfDegrees = DegreeList;
		logger.info("Ended the FinalBinaryGenotype constructor");
	}
	// Methods here ...
	
	public List<Binary> getBinaryGenotype(){
		return this.Genotype;
	}
	
	public List<String> getOrderOfDegrees(){
		return this.OrderOfDegrees;
	}
	
	public List<Integer> getBitsPerDegree(){
		return this.BitsPerDegree;
	}
	
	public void setBinaryGenotype(List<Binary> Genotype){
		this.Genotype = Genotype;
	}
	
	public void setOrderOfDegrees(List<String> OrderOfDegrees){
		this.OrderOfDegrees = OrderOfDegrees;
	}
	
	public void setBitsPerDegree(List<Integer> BitsPerDegree){
		this.BitsPerDegree = BitsPerDegree;
	}
}
