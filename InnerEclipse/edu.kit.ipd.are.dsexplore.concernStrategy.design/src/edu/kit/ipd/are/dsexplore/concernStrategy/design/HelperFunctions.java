package edu.kit.ipd.are.dsexplore.concernStrategy.design;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;

import concernStrategy.Attribute;
import concernStrategy.ChildRelation;
import concernStrategy.Constraint;
import concernStrategy.ContinousIntervalRange;
import concernStrategy.DoubleAttribute;
import concernStrategy.Feature;
import concernStrategy.FeatureDiagram;
import concernStrategy.FeatureGroup;
import concernStrategy.IntegerAttribute;
import concernStrategy.IntegerIntervalRange;
import concernStrategy.ProhibitsConstraint;
import concernStrategy.RequiredConstraint;
import concernStrategy.Simple;
import strategyConfig.ConfigNode;
import strategyConfig.ConfigState;
import strategyConfig.Configuration;

/*
 * These functions are accessible in AQL expressions for the viewpoint specification.
 * */
public class HelperFunctions {

	public boolean test(EObject o) {

		System.out.println(o.toString());

		return true;
	}

	public HelperFunctions() {
		super();
	}

	/*
	 * This function gets the children of the feature skipping the child
	 * relation object.
	 */
	public EList<Feature> getChildren(EObject o) {
		Feature f = (Feature) o;

		ChildRelation cr = f.getChildrelation();

		if (cr == null) {
			return null;
		}
		if (cr instanceof Simple) {
			EList<Feature> list = ((Simple) cr).getMandatoryChildren();
			EList<Feature> list2 = ((Simple) cr).getOptionalChildren();

			EList<Feature> combined = new BasicEList<Feature>(list);
			combined.addAll(list2);

			return combined;
		}
		if (cr instanceof FeatureGroup) {
			return ((FeatureGroup) cr).getChildren();
		}
		return null;
	}

	/*
	 * Gets the config node corresponding to the feature.
	 */
	public ConfigNode getConfigNode(EObject feature, Configuration configuration) {
		EList<ConfigNode> nodes = configuration.getDefaultConfig().getConfignode();
		
		for (ConfigNode node : nodes) {
			if (node.getOrigin() == feature) {
				return node;
			}
		}

		return null;
	}

	/*
	 * Get the name of the edge removing the first part which is like
	 * "org.eclipse.sirius...").
	 */
	public String getEdgeTypeName(DEdge edge) {
		String[] parts = edge.getActualMapping().toString().split(" ");
		return parts[1];
	}

	/*
	 * This functions returns a string representation of the interval range of
	 * the attribute that is supplied by the argument.
	 */
	public String getInterval(EObject o) {
		Attribute a = (Attribute) o;

		String returnValue = "";

		// This is looking ugly, but the model doesn't support getFrom/getTo
		// methods for IntervalRange-class.
		if (a instanceof IntegerAttribute) {
			IntegerAttribute attribute = (IntegerAttribute) a;
			IntegerIntervalRange range = (IntegerIntervalRange) attribute.getRange();

			if (range.isLowerBoundIncluded()) {
				returnValue += "[";
			} else {
				returnValue += "(";
			}

			returnValue += range.getFrom();
			returnValue += ",";
			returnValue += range.getTo();

			if (range.isUpperBoundIncluded()) {
				returnValue += "]";
			} else {
				returnValue += ")";
			}

		}
		if (a instanceof DoubleAttribute) {
			DoubleAttribute attribute = (DoubleAttribute) a;

			ContinousIntervalRange range = (ContinousIntervalRange) attribute.getRange();

			if (range.isLowerBoundIncluded()) {
				returnValue += "[";
			} else {
				returnValue += "(";
			}

			returnValue += range.getFrom();
			returnValue += ",";
			returnValue += range.getTo();

			if (range.isUpperBoundIncluded()) {
				returnValue += "]";
			} else {
				returnValue += ")";
			}

		}

		return returnValue;
	}

	/*
	 * This method returns the root element of the model.
	 */
	public EObject getRoot(EObject o) {
		EObject s = null;

		EObject r = o.eContainer();
		while (r != null) {
			s = r;
			r = r.eContainer();
		}

		return s;
	}

	/*
	 * This method checks in the configuration diagram editor, whether the
	 * feature group cardinalities are met.
	 */
	public boolean hasValidFeatureGroup(EObject o, Configuration configuration) {
		Feature feature = (Feature) o;

		if (feature.getChildrelation() == null || !(feature.getChildrelation() instanceof FeatureGroup)) {
			return true;
		}

		if (this.isAnyParentEliminated(feature, configuration)) {
			return true;
		}

		FeatureGroup fg = (FeatureGroup) feature.getChildrelation();

		int selectedFeatures = 0;

		EList<Feature> list = fg.getChildren();

		for (Feature f : list) {
			ConfigNode cn = this.getConfigNode(f, configuration);

			if (cn == null) {
				continue;
			}
			if (this.getConfigNode(f, configuration).getConfigState().equals(ConfigState.SELECTED_LITERAL)) {
				selectedFeatures++;
			}
		}

		if (selectedFeatures <= fg.getMax() && selectedFeatures >= fg.getMin()) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * This method checks in the configuration diagram editor, whether the
	 * mandatory children of a feature group are selected.
	 */
	public boolean hasValidSimple(EObject o, Configuration configuration) {
		Feature feature = (Feature) o;

		if (feature.getChildrelation() == null || !(feature.getChildrelation() instanceof Simple)) {
			return true;
		}

		if (this.isAnyParentEliminated(feature, configuration)) {
			return true;
		}

		Simple simple = (Simple) feature.getChildrelation();
		EList<Feature> mandatoryChildren = simple.getMandatoryChildren();

		for (Feature f : mandatoryChildren) {
			if (!isSelected(f, configuration)) {
				return false;
			}
		}
		return true;

	}

	/*
	 * This method checks in the configuration diagram editor, whether the any
	 * parent feature is eliminated.
	 */
	private boolean isAnyParentEliminated(Feature f, Configuration configuration) {
		Feature rootFeature = ((FeatureDiagram) this.getRoot(f)).getRootFeature();
		Feature currentFeature = f;

		while (currentFeature != rootFeature) {
			if (this.isEliminated(currentFeature, configuration)) {
				return true;
			}

			currentFeature = (Feature) currentFeature.eContainer().eContainer();
		}

		return false;
	}

	/*
	 * This method checks in the configuration diagram editor, whether the
	 * feature is eliminated.
	 */
	private boolean isEliminated(Feature f, Configuration configuration) {
		if (this.getConfigNode(f, configuration) == null) {
			return false;
		}

		return this.getConfigNode(f, configuration).getConfigState().equals(ConfigState.ELIMINATED_LITERAL);
	}

	/*
	 * This method checks in the configuration diagram editor, whether the
	 * feature is selected.
	 */
	private boolean isSelected(Feature f, Configuration configuration) {
		if (this.getConfigNode(f, configuration) == null) {
			return false;
		}

		return this.getConfigNode(f, configuration).getConfigState().equals(ConfigState.SELECTED_LITERAL);
	}

	/*
	 * This method checks in the configuration diagram editor, whether the
	 * feature is selected and if thats true, that the targets associated with a
	 * prohibit constraint are also selected.
	 */
	public boolean isSelectedAndProhibitedTargetsAreSelected(EObject o, Configuration configuration) {
		Feature feature = (Feature) o;

		if (!isSelected(feature, configuration)) {
			return false;
		}

		if (this.isAnyParentEliminated(feature, configuration)) {
			return false;
		}

		FeatureDiagram fd = (FeatureDiagram) this.getRoot(feature);
		EList<Constraint> constraints = fd.getConstraints();

		for (Constraint c : constraints) {
			if (c instanceof ProhibitsConstraint) {
				ProhibitsConstraint pc = (ProhibitsConstraint) c;
				EList<Feature> targets = pc.getTarget();

				if (pc.getSource() == feature) {
					for (Feature f : targets) {
						if (isSelected(f, configuration) && !isAnyParentEliminated(f, configuration)) {
							return true;
						}
					}
				} else {
					if (isSelected(pc.getSource(), configuration)) {
						for (Feature f : targets) {
							if (f == feature && !isAnyParentEliminated(f, configuration)) {
								return true;
							}
						}
					}
				}
			}
		}

		return false;
	}

	/*
	 * This method checks in the configuration diagram editor, whether the
	 * feature is selected and if thats true, that the targets associated with a
	 * required constraint are also selected.
	 */
	public boolean isSelectedAndRequiredTargetsAreSelected(EObject o, Configuration configuration) {
		Feature feature = (Feature) o;

		if (!isSelected(feature, configuration)) {
			return true;
		}

		if (this.isAnyParentEliminated(feature, configuration)) {
			return true;
		}

		FeatureDiagram fd = (FeatureDiagram) this.getRoot(feature);
		EList<Constraint> constraints = fd.getConstraints();
		for (Constraint c : constraints) {
			if (c instanceof RequiredConstraint) {
				RequiredConstraint pc = (RequiredConstraint) c;
				EList<Feature> targets = pc.getTarget();

				if (pc.getSource() == feature) {
					for (Feature f : targets) {
						if (!isSelected(f, configuration)) {
							return false;
						} else {
							if (isAnyParentEliminated(f, configuration)) {
								return false;
							}

						}

					}
				}
			}

		}

		return true;
	}

}
