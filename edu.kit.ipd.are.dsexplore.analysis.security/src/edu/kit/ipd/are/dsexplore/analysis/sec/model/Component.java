package edu.kit.ipd.are.dsexplore.analysis.sec.model;

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

}
