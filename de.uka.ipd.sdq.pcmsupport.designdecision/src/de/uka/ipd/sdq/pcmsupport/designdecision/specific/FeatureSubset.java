/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.specific;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.featuremodel.Feature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Subset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcmsupport.designdecision.specific.FeatureSubset#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage#getFeatureSubset()
 * @model
 * @generated
 */
public interface FeatureSubset extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.featuremodel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage#getFeatureSubset_Feature()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

} // FeatureSubset
