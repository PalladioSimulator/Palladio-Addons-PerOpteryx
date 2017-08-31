package de.uka.ipd.sdq.dsexplore.opt4j.genotype;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * One can view a {@link BinaryGenotype} object as the binary analogue of a {@link Choice} object.
 * The {@link BinaryGenotype} object holds the corresponding binary representation 
 * of the value stored in a {@link Choice} object.
 * @author Hp
 *
 * @param <E>
 */
public class BinaryGenotype<E extends Number> implements BinaryGenotypeRepresentation<E> {
	
	
	// Internal Fields	
	private List<E> BinaryChoice; // It should be a list of only integer 1 and 0, instead of E 
	private TypeOfDegree DegreeType;
	
	// Constructors here
	
	// Default values here ...
	public BinaryGenotype(){
		this.BinaryChoice = new ArrayList<E>();
		this.DegreeType = BinaryGenotypeRepresentation.TypeOfDegree.AllocationDegree;
	}
	
	// A better constructor ...
	public BinaryGenotype(List<E> BinaryChoice, TypeOfDegree DegreeType){
		this.BinaryChoice = BinaryChoice;
		this.DegreeType = DegreeType;
	}
	
	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		boolean Result = BinaryChoice.add(e);
		return Result;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		BinaryChoice.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return BinaryChoice.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
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
	public E get(int index) {
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
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return BinaryChoice.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return BinaryChoice.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return BinaryChoice.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return BinaryChoice.listIterator(index);
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return BinaryChoice.remove(o);
	}

	@Override
	public E remove(int index) {
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
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return BinaryChoice.set(index, element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return BinaryChoice.size();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
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
	public void setDegreeType(
			de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree D) {
		// TODO Auto-generated method stub
		DegreeType = D;
	}

	@Override
	public de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotypeRepresentation.TypeOfDegree getDegreeType() {
		// TODO Auto-generated method stub
		return DegreeType;
	}
	
	public void setInternalList(List<E> list) {
		// TODO Auto-generated method stub
		this.BinaryChoice = list;
	}
	
	public List<E> getInternalList() {
		// TODO Auto-generated method stub
		return this.BinaryChoice;
	}

}
