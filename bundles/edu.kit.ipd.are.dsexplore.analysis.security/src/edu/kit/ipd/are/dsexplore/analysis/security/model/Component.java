package edu.kit.ipd.are.dsexplore.analysis.security.model;

/**
 * Component for our Security Model
 *
 * @author Jan Keim
 *
 */
public class Component {
	private final double TTDV; // Time to discover vulnerability
	private final double PoCoB; // Probability of Component Breakability
	private final String name;

	/**
	 * Creates a new Component with the provided Time to discover vulnerability
	 * and Probability of Component Breakability. Additionally a name for this
	 * component is provided
	 *
	 * @param TTDV
	 *            Time to discover vulnerability
	 * @param PoCoB
	 *            Probability of Component Breakability
	 * @param name
	 *            Name of the component
	 */
	public Component(double TTDV, double PoCoB, String name) {
		this.TTDV = TTDV;
		this.PoCoB = PoCoB;
		this.name = name;
	}

	/**
	 * Creates a new Component with the provided Time to discover vulnerability
	 * and Probability of Component Breakability. The component will have the
	 * name "UNNAMED".
	 *
	 * @param TTDV
	 *            Time to discover vulnerability
	 * @param PoCoB
	 *            Probability of Component Breakability
	 */
	public Component(double TTDV, double PoCoB) {
		this.TTDV = TTDV;
		this.PoCoB = PoCoB;
		this.name = "UNNAMED";
	}

	private Component(Builder builder) {
		this.TTDV = builder.TTDV;
		this.PoCoB = builder.PoCoB;
		this.name = builder.name;
	}

	/**
	 * Builder for a Component to make things more clear
	 *
	 * @author Jan
	 *
	 */
	public static class Builder {
		//required
		private double TTDV = Double.NaN;
		private double PoCoB = Double.NaN;

		//optional
		private String name = "UNNAMED";

		/**
		 * Constructs a new Builder for Components
		 */
		public Builder() {
			super();
		}

		/**
		 * Adds a value for Time To Detect Vulnerability
		 *
		 * @param val
		 *            (new) TTDV
		 * @return updated Builder
		 */
		public Builder TTDV(double val) {
			this.TTDV = val;
			return this;
		}

		/**
		 * Adds a value as Prob. of Component Break
		 *
		 * @param val
		 *            (new) PoCoB
		 * @return updated Builder
		 */
		public Builder PoCoB(double val) {
			this.PoCoB = val;
			return this;
		}

		/**
		 * Adds a name for the component
		 *
		 * @param name
		 *            Name of the component
		 * @return updated Builder
		 */
		public Builder name(String name) {
			this.name = name;
			return this;
		}

		/**
		 * Builds the component. Throws an {@link IllegalArgumentException} if
		 * PoCoB or TTDV are not set.
		 *
		 * @return the Component constructed with this builder
		 * @throws IllegalArgumentException
		 *             if PoCoB or TTDV are not set.
		 */
		public Component build() throws IllegalArgumentException {
			if ((this.TTDV == Double.NaN) || (this.PoCoB == Double.NaN)) {
				throw new IllegalArgumentException("TTDV or PoCoB not set!");
			}
			return new Component(this);
		}
	}

	private double calcPoCoBAttacker(Attacker a) {
		return a.calcAttacker() * this.PoCoB;
	}

	/**
	 * Calculate the mean time to break component for the specified attacker
	 *
	 * @param a
	 *            Attacker
	 * @return mean time to break component
	 */
	public double calcMTTBC(Attacker a) {
		return this.TTDV / this.calcPoCoBAttacker(a);
	}

	/**
	 * @return the ART
	 */
	public double getTTDV() {
		return this.TTDV;
	}

	/**
	 * @return the PoCoB
	 */
	public double getPoCoB() {
		return this.PoCoB;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Component{Name=\"" + this.name + "\"" + ", TTDV=" + this.TTDV + ", PoCoB=" + this.PoCoB + "}";
	}

}
