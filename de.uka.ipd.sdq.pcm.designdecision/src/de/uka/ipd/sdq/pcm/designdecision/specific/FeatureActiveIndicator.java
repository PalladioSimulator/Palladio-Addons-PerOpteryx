/**
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Active Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This indicates whether a Feature is active in the current instance.
 * The Feature will set as "PrimaryChanged"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureActiveIndicator#getFeatureDiagram <em>Feature Diagram</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getFeatureActiveIndicator()
 * @model
 * @generated
 */
public interface FeatureActiveIndicator extends IndicatorDegree {

	/**
	 * Returns the value of the '<em><b>Feature Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FeatureDiagram of the Feature (PrimaryChanged)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Diagram</em>' reference.
	 * @see #setFeatureDiagram(EObject)
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getFeatureActiveIndicator_FeatureDiagram()
	 * @model
	 * @generated
	 */
	EObject getFeatureDiagram();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureActiveIndicator#getFeatureDiagram <em>Feature Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Diagram</em>' reference.
	 * @see #getFeatureDiagram()
	 * @generated
	 */
	void setFeatureDiagram(EObject value);
} // FeatureActiveIndicator
