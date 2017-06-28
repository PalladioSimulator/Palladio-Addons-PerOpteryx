/**
 */
package org.palladiosimulator.qualitymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.palladiosimulator.qualitymodel.QualityModelPackage
 * @generated
 */
public interface QualityModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QualityModelFactory eINSTANCE = org.palladiosimulator.qualitymodel.impl.QualityModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Nqr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nqr</em>'.
	 * @generated
	 */
	Nqr createNqr();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reasoning</em>'.
	 * @generated
	 */
	Reasoning createReasoning();

	/**
	 * Returns a new object of class '<em>Quantity Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantity Reduction</em>'.
	 * @generated
	 */
	QuantityReduction createQuantityReduction();

	/**
	 * Returns a new object of class '<em>Statistic Reduction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistic Reduction</em>'.
	 * @generated
	 */
	StatisticReduction createStatisticReduction();

	/**
	 * Returns a new object of class '<em>Mapping Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Repository</em>'.
	 * @generated
	 */
	MappingRepository createMappingRepository();

	/**
	 * Returns a new object of class '<em>Mapping Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Entry</em>'.
	 * @generated
	 */
	MappingEntry createMappingEntry();

	/**
	 * Returns a new object of class '<em>Transformation Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Repository</em>'.
	 * @generated
	 */
	TransformationRepository createTransformationRepository();

	/**
	 * Returns a new object of class '<em>Reasoning Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reasoning Repository</em>'.
	 * @generated
	 */
	ReasoningRepository createReasoningRepository();

	/**
	 * Returns a new object of class '<em>Nqr Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nqr Repository</em>'.
	 * @generated
	 */
	NqrRepository createNqrRepository();

	/**
	 * Returns a new object of class '<em>Reasoning Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reasoning Component</em>'.
	 * @generated
	 */
	ReasoningComponent createReasoningComponent();

	/**
	 * Returns a new object of class '<em>Reasoning System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reasoning System</em>'.
	 * @generated
	 */
	ReasoningSystem createReasoningSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QualityModelPackage getQualityModelPackage();

} //QualityModelFactory
