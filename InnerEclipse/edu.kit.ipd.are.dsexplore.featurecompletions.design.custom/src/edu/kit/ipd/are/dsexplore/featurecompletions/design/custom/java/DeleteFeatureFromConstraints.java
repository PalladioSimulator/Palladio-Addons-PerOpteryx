package edu.kit.ipd.are.dsexplore.featurecompletions.design.custom.java;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import featureObjective.Constraint;
import featureObjective.Feature;
import featureObjective.FeatureObjective;

public class DeleteFeatureFromConstraints implements org.eclipse.sirius.tools.api.ui.IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		return true;
	}

	/*
	 * Because constraints are not modified if a feature gets deleted this
	 * method removes a feature from all constraints and deletes the constraint
	 * if it is not valid anymore.
	 */
	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Feature element = (Feature) arg1.get("element");
		FeatureObjective diagram = (FeatureObjective) arg1.get("root");

		Iterator constraints = diagram.getConstraints().iterator();

		List<Constraint> toDelete = new LinkedList<Constraint>();

		// Delete from target
		while (constraints.hasNext()) {
			Constraint constraint = (Constraint) constraints.next();

			constraint.getTarget().remove(element);
			if (constraint.getTarget().isEmpty()) {
				toDelete.add(constraint);
			}

			if (constraint.getSource() == element) {
				toDelete.add(constraint);
			}
		}

		// If there are empty source and target fields we can delete the whole
		// constraint
		Iterator<Constraint> i = toDelete.iterator();
		while (i.hasNext()) {
			Constraint c = i.next();
			diagram.getConstraints().remove(c);
		}

	}
}
