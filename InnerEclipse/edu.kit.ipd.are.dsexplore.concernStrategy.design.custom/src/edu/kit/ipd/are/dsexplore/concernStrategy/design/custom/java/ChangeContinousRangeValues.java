package edu.kit.ipd.are.dsexplore.concernStrategy.design.custom.java;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import concernStrategy.ContinousIntervalRange;
import concernStrategy.DoubleAttribute;

public class ChangeContinousRangeValues implements org.eclipse.sirius.tools.api.ui.IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/*
	 * Parsing the input string to change the range values for double
	 * attributes. The pattern is like in these examples: [0.1,1.2] (0.1,1.2)
	 * [0.1,1.2) (0.1,1.2]
	 */
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

		String expression = (String) arg1.get("expression");

		String[] parts = expression.split(",");

		if (parts.length != 2) {
			return;
		}

		boolean lowerBoundIncluded = false;
		boolean upperBoundIncluded = false;

		char first = parts[0].charAt(0);
		if (first == '[') {
			lowerBoundIncluded = true;
		} else {
			if (first != '(') {
				return;
			}
		}

		double from = 0;

		try {
			from = Double.parseDouble(parts[0].substring(1));
		} catch (NumberFormatException e) {
			return;
		}

		char last = parts[1].charAt(parts[1].length() - 1);
		if (last == ']') {
			upperBoundIncluded = true;
		} else {
			if (last != ')') {
				return;
			}
		}

		double to = 0;

		try {
			to = Double.parseDouble(parts[1].substring(0, parts[1].length() - 1));
		} catch (NumberFormatException e) {
			return;
		}

		DoubleAttribute attribute = (DoubleAttribute) arg1.get("attribute");
		ContinousIntervalRange range = (ContinousIntervalRange) attribute.getRange();

		range.setFrom(from);
		range.setTo(to);
		range.setLowerBoundIncluded(lowerBoundIncluded);
		range.setUpperBoundIncluded(upperBoundIncluded);

	}
}
