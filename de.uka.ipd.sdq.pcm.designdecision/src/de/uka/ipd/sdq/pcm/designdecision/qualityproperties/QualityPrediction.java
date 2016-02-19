/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.qualityproperties;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Prediction</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.qualityproperties.qualitypropertiesPackage#getQualityPrediction()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface QualityPrediction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" modelRequired="true" modelMany="true" modelOrdered="false"
	 * @generated
	 */
	QualityProperty evaluate(EList<EObject> model);

} // QualityPrediction
