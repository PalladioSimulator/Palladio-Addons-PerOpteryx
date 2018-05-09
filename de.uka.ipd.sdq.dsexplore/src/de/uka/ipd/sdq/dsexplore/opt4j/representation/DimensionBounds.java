/**
 *
 */
package de.uka.ipd.sdq.dsexplore.opt4j.representation;

import org.opt4j.genotype.Bounds;

import de.uka.ipd.sdq.pcm.designdecision.DecisionSpace;
import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousRangeDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteRangeDegree;

@Deprecated
class DimensionBounds implements Bounds<Double> {

	protected DecisionSpace problem;

	public DimensionBounds(DecisionSpace problem) {
		this.problem = problem;

	}

	@Override
	public Double getLowerBound(int index) {
		if (this.problem.getDegreesOfFreedom().get(index) instanceof DiscreteRangeDegree) {
			return this.getLowerIntBound(index);
		} else if (this.problem.getDegreesOfFreedom().get(index) instanceof ContinuousRangeDegree) {
			return this.getLowerDoubleBound(index);
		} else if (this.problem.getDegreesOfFreedom().get(index) instanceof ClassDegree) {
			return this.getLowerEnumerationBound(index);
		} else {
			throw new RuntimeException("Design decision not supported: " + this.problem.getDegreesOfFreedom().get(index).getClass().getName());
		}
	}

	@Override
	public Double getUpperBound(int index) {
		if (this.problem.getDegreesOfFreedom().get(index) instanceof DiscreteRangeDegree) {
			return this.getUpperIntBound(index);
		} else if (this.problem.getDegreesOfFreedom().get(index) instanceof ContinuousRangeDegree) {
			return this.getUpperDoubleBound(index);
		} else if (this.problem.getDegreesOfFreedom().get(index) instanceof ClassDegree) {
			return this.getUpperEnumerationBound(index);
		} else {
			throw new RuntimeException("Design decision not supported: " + this.problem.getDegreesOfFreedom().get(index).getClass().getName());
		}
	}

	private Double getLowerEnumerationBound(int index) {
		// Lower bound for enumeration types is always 0.
		return 0.0;
	}

	private Double getUpperEnumerationBound(int index) {
		int upperEnumerationBound = 0;
		DegreeOfFreedomInstance degree = this.problem.getDegreesOfFreedom().get(index);
		if (degree instanceof ClassDegree) {
			upperEnumerationBound = ((ClassDegree) degree).getClassDesignOptions().size() - 1;
		} else {
			throw new RuntimeException("Domain of design decision not supported: " + this.problem.getDegreesOfFreedom().get(index).getClass().getName());
		}

		return new Double(upperEnumerationBound);
	}

	private Double getLowerDoubleBound(int index) {
		ContinuousRangeDegree range = (ContinuousRangeDegree) this.problem.getDegreesOfFreedom().get(index);
		return range.isLowerBoundIncluded() ? range.getFrom() : range.getFrom() + Double.MIN_VALUE;
	}

	private Double getUpperDoubleBound(int index) {
		ContinuousRangeDegree range = (ContinuousRangeDegree) this.problem.getDegreesOfFreedom().get(index);
		return range.isUpperBoundIncluded() ? range.getTo() : range.getTo() - Double.MIN_VALUE;
	}

	private Double getLowerIntBound(int index) {
		DiscreteRangeDegree range = (DiscreteRangeDegree) this.problem.getDegreesOfFreedom().get(index);
		return Double.valueOf(range.isLowerBoundIncluded() ? range.getFrom() : range.getFrom() + 1);
	}

	private Double getUpperIntBound(int index) {
		DiscreteRangeDegree range = (DiscreteRangeDegree) this.problem.getDegreesOfFreedom().get(index);
		return Double.valueOf(range.isUpperBoundIncluded() ? range.getTo() : range.getTo() - 1);
	}

	public int numberOfDimensions() {
		// here, the sizes of the arrays have to be the same!
		return this.problem.getDegreesOfFreedom().size();
	}

	public boolean isInteger(int index) {
		return this.problem.getDegreesOfFreedom().get(index) instanceof ClassDegree || this.problem.getDegreesOfFreedom().get(index) instanceof DiscreteRangeDegree;
	}

	public boolean isEnum(int index) {
		return this.problem.getDegreesOfFreedom().get(index) instanceof ClassDegree;
	}

	/**
	 * Checks whether a single gene is within the bounds specified for the given
	 * index
	 *
	 * @param doubleGene
	 * @param index
	 * @return
	 */
	public boolean isValidGene(Double doubleGene, int index) {
		if (doubleGene.isNaN() || doubleGene.isInfinite() || doubleGene < this.getLowerBound(index) || doubleGene > this.getUpperBound(index)) {
			return false;
		}
		return true;
	}

}