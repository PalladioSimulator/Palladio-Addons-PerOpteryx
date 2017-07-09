package edu.kit.ipd.are.dsexplore.analysis.sec.model;

public class Scenario {
	private int[][] theta;
	private Component[] components;

	/**
	 * Create a new Scenario with a given Theta and the given components.
	 *
	 * @param theta
	 *            Theta
	 * @param components
	 *            Components
	 */
	public Scenario(int[][] theta, Component[] components) {
		this.theta = theta;
		this.components = components;
	}

	/**
	 * Calculates Xi-Values
	 *
	 * @return Xi-Values
	 */
	private int[] calculateXi() {
		int[] res = new int[this.theta.length];
		for (int i = 0; i < this.theta.length; i++) {
			for (int j = 0; j < this.theta[i].length; j++) {
				if (this.theta[i][j] > 0) {
					res[i]++;
				}
			}
		}
		return res;
	}

	/**
	 * Calculates the Mean Time To Break Component for a specified Attacker
	 *
	 * @param a
	 *            Attacker
	 * @return MTTBC
	 */
	private double[] calcMTTBC(Attacker a) {
		double[] res = new double[this.components.length];
		for (int i = 0; i < this.components.length; i++) {
			res[i] = this.components[i].calcMTTBC(a);
		}
		return res;
	}

	/**
	 * Calculates the Meantime To Security Failure for the specified Attacker
	 * and the number of entry points.
	 *
	 * @param length_Entry
	 *            Attacker Entry Points
	 * @param a
	 *            Attacker
	 * @return MTTSF
	 */
	public double calcMTTSF(int length_Entry, Attacker a) {
		double mttsf_w = 0.0;
		int[] xi = this.calculateXi();
		double[] mttbc = this.calcMTTBC(a);
		for (int i = 0; i < mttbc.length; i++) {
			double mid = 0.0;
			for (int j = 0; j < (mttbc.length + 1); j++) {
				mid += mttbc[i] * this.theta[i][j];
			}
			mttsf_w += mid / xi[i];
		}
		return (mttsf_w / length_Entry);
	}

}
