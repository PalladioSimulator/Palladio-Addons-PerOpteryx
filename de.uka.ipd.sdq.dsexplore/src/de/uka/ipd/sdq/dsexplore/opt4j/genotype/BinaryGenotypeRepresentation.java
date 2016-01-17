package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.List;
/**
 * An interface visualising the implementation
 * of the {@link BinaryGenotype} class
 * @author Hp
 *
 * @param <E>
 */
public interface BinaryGenotypeRepresentation<E> extends List<E> {
	
	// Abstract methods
	public void setDegreeType(String D);
	public String getDegreeType();
}
