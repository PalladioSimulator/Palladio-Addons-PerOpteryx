/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties;

import org.palladiosimulator.analyzer.resultdecorator.ResultDecoratorRepository;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Quality Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.NumericQualityProperty#getResultDecoratorRepository <em>Result Decorator Repository</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.qualitypropertiesPackage#getNumericQualityProperty()
 * @model abstract="true"
 * @generated
 */
public interface NumericQualityProperty extends genericdesigndecision.qualityproperties.NumericQualityProperty {
	/**
	 * Returns the value of the '<em><b>Result Decorator Repository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result Decorator for Performance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result Decorator Repository</em>' reference.
	 * @see #setResultDecoratorRepository(ResultDecoratorRepository)
	 * @see de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.qualitypropertiesPackage#getNumericQualityProperty_ResultDecoratorRepository()
	 * @model ordered="false"
	 * @generated
	 */
	ResultDecoratorRepository getResultDecoratorRepository();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcmsupport.designdecision.qualityproperties.NumericQualityProperty#getResultDecoratorRepository <em>Result Decorator Repository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Decorator Repository</em>' reference.
	 * @see #getResultDecoratorRepository()
	 * @generated
	 */
	void setResultDecoratorRepository(ResultDecoratorRepository value);

} // NumericQualityProperty
