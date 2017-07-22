package edu.kit.ipd.are.dsexplore.analysis.security.model;

/**
 * Attacker for our Security Model
 * 
 * @author Jan Keim
 *
 */
public class Attacker {
	private final double lambda;
	private final double delta;
	private final double x; // Mean Time of Attack

	/**
	 * Creates a new Attacker with the provided Lambda and Delta
	 *
	 * @param lambda
	 *            Lambda (improvement when out of learning phase)
	 * @param delta
	 *            Delta (until Attacker is out of learning phase)
	 * @param x
	 *            Mean Time of Attack
	 */
	public Attacker(double lambda, double delta, double x) {
		this.lambda = lambda;
		this.delta = delta;
		this.x = x;
	}

	/**
	 * Calculates the Attacker value for this attacker with the given x
	 *
	 * @param x
	 *            x value
	 * @return Attacker value
	 */
	public double calcAttacker() {
		if (0 <= (this.x - this.delta)) {
			return (1 - Math.exp(-this.lambda * (this.x - this.delta)));
		} else {
			return 0.0;
		}
	}

	/**
	 * @return x, the mean time of attack
	 */
	public double getX() {
		return this.x;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Attacker [lambda=%s, delta=%s, x=%s]", this.lambda, this.delta, this.x);
	}

}
