package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * One can view a {@link BinaryGenotype} object as the binary analogue of a {@link Choice} object.
 * The {@link BinaryGenotype} object holds the corresponding binary representation 
 * of the value stored in a {@link Choice} object.
 * @author Hp
 */
public class BinaryGenotype implements BinaryGenotypeRepresentation<Binary> {
	
	
	// Internal Fields	
	private List<Binary> BinaryChoice;
	private String degreeType;		//type of degree is specific to the metamodel of the input model
	
	// A better constructor ...
	public BinaryGenotype(List<Binary> BinaryChoice, String degreeType){
		this.BinaryChoice = BinaryChoice;
		this.degreeType = degreeType;
	}
	
	@Override
	public boolean add(Binary e) {
		// TODO Auto-generated method stub
		boolean Result = BinaryChoice.add(e);
		return Result;
	}

	@Override
	public void add(int index, Binary element) {
		// TODO Auto-generated method stub
		BinaryChoice.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends Binary> c) {
		// TODO Auto-generated method stub
		return BinaryChoice.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends Binary> c) {
		// TODO Auto-generated method stub
		return BinaryChoice.addAll(index, c);
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		BinaryChoice.clear();
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return BinaryChoice.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return BinaryChoice.containsAll(c);
	}

	@Override
	public Binary get(int index) {
		// TODO Auto-generated method stub
		return BinaryChoice.get(index);
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return BinaryChoice.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return BinaryChoice.isEmpty();
	}

	@Override
	public Iterator<Binary> iterator() {
		// TODO Auto-generated method stub
		return BinaryChoice.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return BinaryChoice.lastIndexOf(o);
	}

	@Override
	public ListIterator<Binary> listIterator() {
		// TODO Auto-generated method stub
		return BinaryChoice.listIterator();
	}

	@Override
	public ListIterator<Binary> listIterator(int index) {
		// TODO Auto-generated method stub
		return BinaryChoice.listIterator(index);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return BinaryChoice.remove(o);
	}

	@Override
	public Binary remove(int index) {
		// TODO Auto-generated method stub
		return BinaryChoice.remove(index);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return BinaryChoice.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return BinaryChoice.retainAll(c);
	}

	@Override
	public Binary set(int index, Binary element) {
		// TODO Auto-generated method stub
		return BinaryChoice.set(index, element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return BinaryChoice.size();
	}

	@Override
	public List<Binary> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return BinaryChoice.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return BinaryChoice.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return BinaryChoice.toArray(a);
	}

	@Override
	public void setDegreeType(String d) {
		// TODO Auto-generated method stub
		degreeType = d;
	}

	@Override
	public String getDegreeType() {
		// TODO Auto-generated method stub
		return degreeType;
	}
	
	public void setInternalList(List<Binary> list) {
		// TODO Auto-generated method stub
		this.BinaryChoice = list;
	}
	
	public List<Binary> getInternalList() {
		// TODO Auto-generated method stub
		return this.BinaryChoice;
	}

}
