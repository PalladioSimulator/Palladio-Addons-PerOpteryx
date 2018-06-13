package de.uka.ipd.sdq.dsexplore.tools.primitives;

/**
 * This class represents a simple pointer to an object.
 *
 * @author Dominik Fuchss
 *
 * @param <P>
 *            the object type
 */
public final class Pointer<P> {
	private P ptr;

	public Pointer() {
		this(null);
	}

	public Pointer(P p) {
		this.ptr = p;
	}

	public void set(P p) {
		this.ptr = p;
	}

	public P get() {
		return this.ptr;
	}

	@Override
	public String toString() {
		return "&[" + this.ptr + "]";
	}

	@Override
	public int hashCode() {
		return this.ptr == null ? 0 : this.ptr.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || this.getClass() != o.getClass()) {
			return false;
		}
		return this.ptr == ((Pointer<?>) o).get();
	}
}
