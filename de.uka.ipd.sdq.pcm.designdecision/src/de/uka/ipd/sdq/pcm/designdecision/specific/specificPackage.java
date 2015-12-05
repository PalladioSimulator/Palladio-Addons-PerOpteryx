/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import genericdesigndecision.genericDoF.GenericDoFPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificFactory
 * @model kind="package"
 * @generated
 */
public interface specificPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "specific";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/DesignDecision/Specific/3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "specific";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	specificPackage eINSTANCE = de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl <em>Exchange Component Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExchangeComponentRule()
	 * @generated
	 */
	int EXCHANGE_COMPONENT_RULE = 0;

	/**
	 * The feature id for the '<em><b>Repository Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Allocation Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Exchange Component Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_COMPONENT_RULE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl <em>Unordered Primitive Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getUnorderedPrimitiveDegree()
	 * @generated
	 */
	int UNORDERED_PRIMITIVE_DEGREE = 1;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.AUNORDERED_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.AUNORDERED_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.AUNORDERED_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.AUNORDERED_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.AUNORDERED_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.AUNORDERED_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Unordered Primitive Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_PRIMITIVE_DEGREE_FEATURE_COUNT = GenericDoFPackage.AUNORDERED_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl <em>Continuous Component Param Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousComponentParamDegree()
	 * @generated
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE = 2;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__TO = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE__FROM = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Continuous Component Param Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_COMPONENT_PARAM_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl <em>Continuous Processing Rate Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousProcessingRateDegree()
	 * @generated
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE = 3;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl <em>Processing Resource Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingResourceDegree()
	 * @generated
	 */
	int PROCESSING_RESOURCE_DEGREE = 5;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl <em>Processing Rate Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingRateDegree()
	 * @generated
	 */
	int PROCESSING_RATE_DEGREE = 4;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__TO = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__FROM = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Continuous Processing Rate Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_PROCESSING_RATE_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADEGREE_OF_FREEDOM__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADEGREE_OF_FREEDOM__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.ADEGREE_OF_FREEDOM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Processing Resource Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RESOURCE_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADEGREE_OF_FREEDOM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__ADDED_ELEMENTS = PROCESSING_RESOURCE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__INTERACTION_CONSTRAINTS = PROCESSING_RESOURCE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__PRIMARY_CHANGEABLE = PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__PRIMARY_CHANGED = PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENTS = PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE = PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;

	/**
	 * The number of structural features of the '<em>Processing Rate Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_RATE_DEGREE_FEATURE_COUNT = PROCESSING_RESOURCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl <em>Discrete Component Param Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteComponentParamDegree()
	 * @generated
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE = 6;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__TO = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE__FROM = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Discrete Component Param Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_COMPONENT_PARAM_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl <em>Discrete Processing Rate Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteProcessingRateDegree()
	 * @generated
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE = 7;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__TO = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__FROM = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Discrete Processing Rate Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCRETE_PROCESSING_RATE_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl <em>Feature Config Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureConfigDegree()
	 * @generated
	 */
	int FEATURE_CONFIG_DEGREE = 8;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADEGREE_OF_FREEDOM__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADEGREE_OF_FREEDOM__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Feature Config Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONFIG_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADEGREE_OF_FREEDOM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl <em>Feature Group Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureGroupDegree()
	 * @generated
	 */
	int FEATURE_GROUP_DEGREE = 9;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__ADDED_ELEMENTS = FEATURE_CONFIG_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__INTERACTION_CONSTRAINTS = FEATURE_CONFIG_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__PRIMARY_CHANGEABLE = FEATURE_CONFIG_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__PRIMARY_CHANGED = FEATURE_CONFIG_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__CHANGEABLE_ELEMENTS = FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Featuregroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__FEATUREGROUP = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Domain Of Feature Config Combinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Group Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_GROUP_DEGREE_FEATURE_COUNT = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl <em>Feature Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureSubset()
	 * @generated
	 */
	int FEATURE_SUBSET = 10;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUBSET__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Feature Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_SUBSET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl <em>Number Of Cores Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresDegree()
	 * @generated
	 */
	int NUMBER_OF_CORES_DEGREE = 12;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl <em>Number Of Cores As List Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsListDegree()
	 * @generated
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE = 11;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.AORDERED_INTEGER_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.AORDERED_INTEGER_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.AORDERED_INTEGER_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.AORDERED_INTEGER_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.AORDERED_INTEGER_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.AORDERED_INTEGER_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>List Of Integers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__LIST_OF_INTEGERS = GenericDoFPackage.AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.AORDERED_INTEGER_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Number Of Cores As List Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_LIST_DEGREE_FEATURE_COUNT = GenericDoFPackage.AORDERED_INTEGER_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__ADDED_ELEMENTS = PROCESSING_RESOURCE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__INTERACTION_CONSTRAINTS = PROCESSING_RESOURCE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__PRIMARY_CHANGEABLE = PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__PRIMARY_CHANGED = PROCESSING_RESOURCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__CHANGEABLE_ELEMENTS = PROCESSING_RESOURCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE__PROCESSINGRESOURCETYPE = PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;

	/**
	 * The number of structural features of the '<em>Number Of Cores Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_DEGREE_FEATURE_COUNT = PROCESSING_RESOURCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl <em>Number Of Cores As Range Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsRangeDegree()
	 * @generated
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE = 13;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__TO = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__FROM = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Number Of Cores As Range Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OF_CORES_AS_RANGE_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl <em>Optional Feature Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOptionalFeatureDegree()
	 * @generated
	 */
	int OPTIONAL_FEATURE_DEGREE = 14;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__ADDED_ELEMENTS = FEATURE_CONFIG_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__INTERACTION_CONSTRAINTS = FEATURE_CONFIG_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__PRIMARY_CHANGEABLE = FEATURE_CONFIG_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__PRIMARY_CHANGED = FEATURE_CONFIG_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__CHANGEABLE_ELEMENTS = FEATURE_CONFIG_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Simple</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE__SIMPLE = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Optional Feature Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FEATURE_DEGREE_FEATURE_COUNT = FEATURE_CONFIG_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl <em>Resource Container Replication Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegree()
	 * @generated
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE = 15;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__TO = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE__FROM = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Resource Container Replication Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl <em>Resource Container Replication Degree With Component Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegreeWithComponentChange()
	 * @generated
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE = 16;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__ADDED_ELEMENTS = RESOURCE_CONTAINER_REPLICATION_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__CHANGEABLE_ELEMENT_DESCRIPTIONS = RESOURCE_CONTAINER_REPLICATION_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__INTERACTION_CONSTRAINTS = RESOURCE_CONTAINER_REPLICATION_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__PRIMARY_CHANGEABLE = RESOURCE_CONTAINER_REPLICATION_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__PRIMARY_CHANGED = RESOURCE_CONTAINER_REPLICATION_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__CHANGEABLE_ELEMENTS = RESOURCE_CONTAINER_REPLICATION_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__UPPER_BOUND_INCLUDED = RESOURCE_CONTAINER_REPLICATION_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__LOWER_BOUND_INCLUDED = RESOURCE_CONTAINER_REPLICATION_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__NUMBER_OF_STEPS = RESOURCE_CONTAINER_REPLICATION_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__TO = RESOURCE_CONTAINER_REPLICATION_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__FROM = RESOURCE_CONTAINER_REPLICATION_DEGREE__FROM;

	/**
	 * The feature id for the '<em><b>Exchange Component Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE = RESOURCE_CONTAINER_REPLICATION_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Resource Container Replication Degree With Component Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE_FEATURE_COUNT = RESOURCE_CONTAINER_REPLICATION_DEGREE_FEATURE_COUNT
			+ 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl <em>Resource Selection Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceSelectionDegree()
	 * @generated
	 */
	int RESOURCE_SELECTION_DEGREE = 17;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__CLASS_DESIGN_OPTIONS = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resource Selection Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_SELECTION_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACLASS_WITH_COPY_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl <em>Scheduling Policy Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getSchedulingPolicyDegree()
	 * @generated
	 */
	int SCHEDULING_POLICY_DEGREE = 18;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__CLASS_DESIGN_OPTIONS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The feature id for the '<em><b>Processingresourcetype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT
			+ 0;

	/**
	 * The number of structural features of the '<em>Scheduling Policy Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_POLICY_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl <em>String Component Param Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStringComponentParamDegree()
	 * @generated
	 */
	int STRING_COMPONENT_PARAM_DEGREE = 19;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ASTRING_SET_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ASTRING_SET_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ASTRING_SET_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ASTRING_SET_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ASTRING_SET_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ASTRING_SET_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>String Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE__STRING_VALUES = GenericDoFPackage.ASTRING_SET_DEGREE__STRING_VALUES;

	/**
	 * The number of structural features of the '<em>String Component Param Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPONENT_PARAM_DEGREE_FEATURE_COUNT = GenericDoFPackage.ASTRING_SET_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl <em>Allocation Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAllocationDegree()
	 * @generated
	 */
	int ALLOCATION_DEGREE = 20;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE__CLASS_DESIGN_OPTIONS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Allocation Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATION_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl <em>Assembled Component Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAssembledComponentDegree()
	 * @generated
	 */
	int ASSEMBLED_COMPONENT_DEGREE = 21;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Class Design Options</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE__CLASS_DESIGN_OPTIONS = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE__CLASS_DESIGN_OPTIONS;

	/**
	 * The number of structural features of the '<em>Assembled Component Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSEMBLED_COMPONENT_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACLASS_AS_REFERENCE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl <em>Capacity Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCapacityDegree()
	 * @generated
	 */
	int CAPACITY_DEGREE = 22;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__TO = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE__FROM = GenericDoFPackage.ADISCRETE_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Capacity Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_DEGREE_FEATURE_COUNT = GenericDoFPackage.ADISCRETE_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl <em>Monitoring Degree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getMonitoringDegree()
	 * @generated
	 */
	int MONITORING_DEGREE = 23;

	/**
	 * The feature id for the '<em><b>Added Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__ADDED_ELEMENTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__ADDED_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Changeable Element Descriptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENT_DESCRIPTIONS;

	/**
	 * The feature id for the '<em><b>Interaction Constraints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__INTERACTION_CONSTRAINTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__INTERACTION_CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Primary Changeable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__PRIMARY_CHANGEABLE = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGEABLE;

	/**
	 * The feature id for the '<em><b>Primary Changed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__PRIMARY_CHANGED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__PRIMARY_CHANGED;

	/**
	 * The feature id for the '<em><b>Changeable Elements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__CHANGEABLE_ELEMENTS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__CHANGEABLE_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Upper Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__UPPER_BOUND_INCLUDED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__UPPER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Lower Bound Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__LOWER_BOUND_INCLUDED = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__LOWER_BOUND_INCLUDED;

	/**
	 * The feature id for the '<em><b>Number Of Steps</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__NUMBER_OF_STEPS = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__NUMBER_OF_STEPS;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__TO = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__TO;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE__FROM = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE__FROM;

	/**
	 * The number of structural features of the '<em>Monitoring Degree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITORING_DEGREE_FEATURE_COUNT = GenericDoFPackage.ACONTINUOUS_RANGE_DEGREE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule <em>Exchange Component Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange Component Rule</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule
	 * @generated
	 */
	EClass getExchangeComponentRule();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getRepositoryComponent <em>Repository Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Repository Component</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getRepositoryComponent()
	 * @see #getExchangeComponentRule()
	 * @generated
	 */
	EReference getExchangeComponentRule_RepositoryComponent();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getAllocationContext <em>Allocation Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allocation Context</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule#getAllocationContext()
	 * @see #getExchangeComponentRule()
	 * @generated
	 */
	EReference getExchangeComponentRule_AllocationContext();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree <em>Unordered Primitive Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered Primitive Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.UnorderedPrimitiveDegree
	 * @generated
	 */
	EClass getUnorderedPrimitiveDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree <em>Continuous Component Param Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Component Param Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousComponentParamDegree
	 * @generated
	 */
	EClass getContinuousComponentParamDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree <em>Continuous Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuous Processing Rate Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ContinuousProcessingRateDegree
	 * @generated
	 */
	EClass getContinuousProcessingRateDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree <em>Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Rate Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingRateDegree
	 * @generated
	 */
	EClass getProcessingRateDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree <em>Processing Resource Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Resource Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree
	 * @generated
	 */
	EClass getProcessingResourceDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree#getProcessingresourcetype <em>Processingresourcetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processingresourcetype</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree#getProcessingresourcetype()
	 * @see #getProcessingResourceDegree()
	 * @generated
	 */
	EReference getProcessingResourceDegree_Processingresourcetype();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree <em>Discrete Component Param Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Component Param Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteComponentParamDegree
	 * @generated
	 */
	EClass getDiscreteComponentParamDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree <em>Discrete Processing Rate Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discrete Processing Rate Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.DiscreteProcessingRateDegree
	 * @generated
	 */
	EClass getDiscreteProcessingRateDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree <em>Feature Config Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Config Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureConfigDegree
	 * @generated
	 */
	EClass getFeatureConfigDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree <em>Feature Group Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Group Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree
	 * @generated
	 */
	EClass getFeatureGroupDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getFeaturegroup <em>Featuregroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Featuregroup</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getFeaturegroup()
	 * @see #getFeatureGroupDegree()
	 * @generated
	 */
	EReference getFeatureGroupDegree_Featuregroup();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getDomainOfFeatureConfigCombinations <em>Domain Of Feature Config Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain Of Feature Config Combinations</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureGroupDegree#getDomainOfFeatureConfigCombinations()
	 * @see #getFeatureGroupDegree()
	 * @generated
	 */
	EReference getFeatureGroupDegree_DomainOfFeatureConfigCombinations();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset <em>Feature Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Subset</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset
	 * @generated
	 */
	EClass getFeatureSubset();

	/**
	 * Returns the meta object for the reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.FeatureSubset#getFeature()
	 * @see #getFeatureSubset()
	 * @generated
	 */
	EReference getFeatureSubset_Feature();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree <em>Number Of Cores As List Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Cores As List Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsListDegree
	 * @generated
	 */
	EClass getNumberOfCoresAsListDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree <em>Number Of Cores Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Cores Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresDegree
	 * @generated
	 */
	EClass getNumberOfCoresDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree <em>Number Of Cores As Range Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Of Cores As Range Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.NumberOfCoresAsRangeDegree
	 * @generated
	 */
	EClass getNumberOfCoresAsRangeDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree <em>Optional Feature Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional Feature Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree
	 * @generated
	 */
	EClass getOptionalFeatureDegree();

	/**
	 * Returns the meta object for the reference '{@link de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree#getSimple <em>Simple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simple</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree#getSimple()
	 * @see #getOptionalFeatureDegree()
	 * @generated
	 */
	EReference getOptionalFeatureDegree_Simple();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree <em>Resource Container Replication Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container Replication Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegree
	 * @generated
	 */
	EClass getResourceContainerReplicationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange <em>Resource Container Replication Degree With Component Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Container Replication Degree With Component Change</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange
	 * @generated
	 */
	EClass getResourceContainerReplicationDegreeWithComponentChange();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange#getExchangeComponentRule <em>Exchange Component Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exchange Component Rule</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange#getExchangeComponentRule()
	 * @see #getResourceContainerReplicationDegreeWithComponentChange()
	 * @generated
	 */
	EReference getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree <em>Resource Selection Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Selection Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.ResourceSelectionDegree
	 * @generated
	 */
	EClass getResourceSelectionDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree <em>Scheduling Policy Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Policy Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.SchedulingPolicyDegree
	 * @generated
	 */
	EClass getSchedulingPolicyDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree <em>String Component Param Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Component Param Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.StringComponentParamDegree
	 * @generated
	 */
	EClass getStringComponentParamDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree <em>Allocation Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocation Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AllocationDegree
	 * @generated
	 */
	EClass getAllocationDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree <em>Assembled Component Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assembled Component Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.AssembledComponentDegree
	 * @generated
	 */
	EClass getAssembledComponentDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree <em>Capacity Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.CapacityDegree
	 * @generated
	 */
	EClass getCapacityDegree();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree <em>Monitoring Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitoring Degree</em>'.
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.MonitoringDegree
	 * @generated
	 */
	EClass getMonitoringDegree();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	specificFactory getspecificFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl <em>Exchange Component Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ExchangeComponentRuleImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getExchangeComponentRule()
		 * @generated
		 */
		EClass EXCHANGE_COMPONENT_RULE = eINSTANCE.getExchangeComponentRule();

		/**
		 * The meta object literal for the '<em><b>Repository Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_COMPONENT_RULE__REPOSITORY_COMPONENT = eINSTANCE
				.getExchangeComponentRule_RepositoryComponent();

		/**
		 * The meta object literal for the '<em><b>Allocation Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCHANGE_COMPONENT_RULE__ALLOCATION_CONTEXT = eINSTANCE.getExchangeComponentRule_AllocationContext();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl <em>Unordered Primitive Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.UnorderedPrimitiveDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getUnorderedPrimitiveDegree()
		 * @generated
		 */
		EClass UNORDERED_PRIMITIVE_DEGREE = eINSTANCE.getUnorderedPrimitiveDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl <em>Continuous Component Param Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousComponentParamDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousComponentParamDegree()
		 * @generated
		 */
		EClass CONTINUOUS_COMPONENT_PARAM_DEGREE = eINSTANCE.getContinuousComponentParamDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl <em>Continuous Processing Rate Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ContinuousProcessingRateDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getContinuousProcessingRateDegree()
		 * @generated
		 */
		EClass CONTINUOUS_PROCESSING_RATE_DEGREE = eINSTANCE.getContinuousProcessingRateDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl <em>Processing Rate Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingRateDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingRateDegree()
		 * @generated
		 */
		EClass PROCESSING_RATE_DEGREE = eINSTANCE.getProcessingRateDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl <em>Processing Resource Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ProcessingResourceDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getProcessingResourceDegree()
		 * @generated
		 */
		EClass PROCESSING_RESOURCE_DEGREE = eINSTANCE.getProcessingResourceDegree();

		/**
		 * The meta object literal for the '<em><b>Processingresourcetype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE = eINSTANCE
				.getProcessingResourceDegree_Processingresourcetype();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl <em>Discrete Component Param Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteComponentParamDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteComponentParamDegree()
		 * @generated
		 */
		EClass DISCRETE_COMPONENT_PARAM_DEGREE = eINSTANCE.getDiscreteComponentParamDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl <em>Discrete Processing Rate Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getDiscreteProcessingRateDegree()
		 * @generated
		 */
		EClass DISCRETE_PROCESSING_RATE_DEGREE = eINSTANCE.getDiscreteProcessingRateDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl <em>Feature Config Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureConfigDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureConfigDegree()
		 * @generated
		 */
		EClass FEATURE_CONFIG_DEGREE = eINSTANCE.getFeatureConfigDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl <em>Feature Group Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureGroupDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureGroupDegree()
		 * @generated
		 */
		EClass FEATURE_GROUP_DEGREE = eINSTANCE.getFeatureGroupDegree();

		/**
		 * The meta object literal for the '<em><b>Featuregroup</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP_DEGREE__FEATUREGROUP = eINSTANCE.getFeatureGroupDegree_Featuregroup();

		/**
		 * The meta object literal for the '<em><b>Domain Of Feature Config Combinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_GROUP_DEGREE__DOMAIN_OF_FEATURE_CONFIG_COMBINATIONS = eINSTANCE
				.getFeatureGroupDegree_DomainOfFeatureConfigCombinations();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl <em>Feature Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.FeatureSubsetImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getFeatureSubset()
		 * @generated
		 */
		EClass FEATURE_SUBSET = eINSTANCE.getFeatureSubset();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_SUBSET__FEATURE = eINSTANCE.getFeatureSubset_Feature();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl <em>Number Of Cores As List Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsListDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsListDegree()
		 * @generated
		 */
		EClass NUMBER_OF_CORES_AS_LIST_DEGREE = eINSTANCE.getNumberOfCoresAsListDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl <em>Number Of Cores Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresDegree()
		 * @generated
		 */
		EClass NUMBER_OF_CORES_DEGREE = eINSTANCE.getNumberOfCoresDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl <em>Number Of Cores As Range Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.NumberOfCoresAsRangeDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getNumberOfCoresAsRangeDegree()
		 * @generated
		 */
		EClass NUMBER_OF_CORES_AS_RANGE_DEGREE = eINSTANCE.getNumberOfCoresAsRangeDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl <em>Optional Feature Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getOptionalFeatureDegree()
		 * @generated
		 */
		EClass OPTIONAL_FEATURE_DEGREE = eINSTANCE.getOptionalFeatureDegree();

		/**
		 * The meta object literal for the '<em><b>Simple</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONAL_FEATURE_DEGREE__SIMPLE = eINSTANCE.getOptionalFeatureDegree_Simple();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl <em>Resource Container Replication Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegree()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER_REPLICATION_DEGREE = eINSTANCE.getResourceContainerReplicationDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl <em>Resource Container Replication Degree With Component Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceContainerReplicationDegreeWithComponentChangeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceContainerReplicationDegreeWithComponentChange()
		 * @generated
		 */
		EClass RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE = eINSTANCE
				.getResourceContainerReplicationDegreeWithComponentChange();

		/**
		 * The meta object literal for the '<em><b>Exchange Component Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_CONTAINER_REPLICATION_DEGREE_WITH_COMPONENT_CHANGE__EXCHANGE_COMPONENT_RULE = eINSTANCE
				.getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl <em>Resource Selection Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.ResourceSelectionDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getResourceSelectionDegree()
		 * @generated
		 */
		EClass RESOURCE_SELECTION_DEGREE = eINSTANCE.getResourceSelectionDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl <em>Scheduling Policy Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.SchedulingPolicyDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getSchedulingPolicyDegree()
		 * @generated
		 */
		EClass SCHEDULING_POLICY_DEGREE = eINSTANCE.getSchedulingPolicyDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl <em>String Component Param Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.StringComponentParamDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getStringComponentParamDegree()
		 * @generated
		 */
		EClass STRING_COMPONENT_PARAM_DEGREE = eINSTANCE.getStringComponentParamDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl <em>Allocation Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AllocationDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAllocationDegree()
		 * @generated
		 */
		EClass ALLOCATION_DEGREE = eINSTANCE.getAllocationDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl <em>Assembled Component Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.AssembledComponentDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getAssembledComponentDegree()
		 * @generated
		 */
		EClass ASSEMBLED_COMPONENT_DEGREE = eINSTANCE.getAssembledComponentDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl <em>Capacity Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.CapacityDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getCapacityDegree()
		 * @generated
		 */
		EClass CAPACITY_DEGREE = eINSTANCE.getCapacityDegree();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl <em>Monitoring Degree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.MonitoringDegreeImpl
		 * @see de.uka.ipd.sdq.pcm.designdecision.specific.impl.specificPackageImpl#getMonitoringDegree()
		 * @generated
		 */
		EClass MONITORING_DEGREE = eINSTANCE.getMonitoringDegree();

	}

} //specificPackage
