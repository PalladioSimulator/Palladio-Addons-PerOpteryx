package edu.kit.ipd.are.dsexplore.concernStrategy.design.custom.java;

import java.util.Collection;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;

import concernStrategy.IntegerAttribute;
import concernStrategy.IntegerIntervalRange;

public class ChangeIntegerRangeValues implements org.eclipse.sirius.tools.api.ui.IExternalJavaAction {
	
	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/*
	 * Parsing the input string to change the range values for int attributes.
	 * The pattern is like in this example: [0,1]
	 * 
	 */
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

		String expression = (String) arg1.get("expression");
		
		if (expression == null)
			throw new IllegalArgumentException("Expression is null");
		
		String[] parts = expression.split(",");

		if (parts.length != 2) {
			return;
		}

		char first = parts[0].charAt(0);
		if (first != '[') {
			throw new IllegalArgumentException("Expression is null");
//			return;
		}

		int from = 0;

		try {
			from = Integer.parseInt(parts[0].substring(1).replaceAll("\n", "").trim());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Cannot parse 'from' of the provided range");
		}

		char last = parts[1].charAt(parts[1].length() - 1);
		if (last != ']') {
			return;
		}

		int to = 0;

		try {
			to = Integer.parseInt(parts[1].substring(0, parts[1].length() - 1).replaceAll("\n", "").trim());
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Cannot parse 'to' of the provided range");
		}

		IntegerAttribute intAttribute = (IntegerAttribute) arg1.get("attribute");
		IntegerIntervalRange range = (IntegerIntervalRange) intAttribute.getRange();

		range.setFrom(from);
		range.setTo(to);

	}
}
