package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree;

public class FinalBinaryGenotype {
	/* This class holds the final representation of the binary genotype.
	 * It contains 2 variables, Genotype and OrderOfDegrees.
	 * Genotype: This is the final binary representation
	 * OrderOfDegrees: Corresponding order in which the Degrees are stored 
	 */
	private List<Integer> Genotype;
	private List<TypeOfDegree> OrderOfDegrees;
	private List<Integer> BitsPerDegree = new ArrayList<Integer>();
	
	// Constructors here...
	
	public FinalBinaryGenotype(){
		this.Genotype = Collections.emptyList();
		this.OrderOfDegrees = Collections.emptyList();
		this.BitsPerDegree = Collections.emptyList();
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
	

}
