/**
 */
package featureObjective.impl;

import featureObjective.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureObjectiveFactoryImpl extends EFactoryImpl implements FeatureObjectiveFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureObjectiveFactory init() {
		try {
			FeatureObjectiveFactory theFeatureObjectiveFactory = (FeatureObjectiveFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureObjectivePackage.eNS_URI);
			if (theFeatureObjectiveFactory != null) {
				return theFeatureObjectiveFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureObjectiveFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjectiveFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FeatureObjectivePackage.FEATURE_OBJECTIVE: return createFeatureObjective();
			case FeatureObjectivePackage.FEATURE: return createFeature();
			case FeatureObjectivePackage.FEATURE_GROUP: return createFeatureGroup();
			case FeatureObjectivePackage.REQUIRED_CONSTRAINT: return createRequiredConstraint();
			case FeatureObjectivePackage.PROHIBITS_CONSTRAINT: return createProhibitsConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureObjectivePackage.ATTRIBUTE_TYPES:
				return createAttributeTypesFromString(eDataType, initialValue);
			case FeatureObjectivePackage.LOGICAL_OPERATION:
				return createLogicalOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureObjectivePackage.ATTRIBUTE_TYPES:
				return convertAttributeTypesToString(eDataType, instanceValue);
			case FeatureObjectivePackage.LOGICAL_OPERATION:
				return convertLogicalOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjective createFeatureObjective() {
		FeatureObjectiveImpl featureObjective = new FeatureObjectiveImpl();
		return featureObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureGroup createFeatureGroup() {
		FeatureGroupImpl featureGroup = new FeatureGroupImpl();
		return featureGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredConstraint createRequiredConstraint() {
		RequiredConstraintImpl requiredConstraint = new RequiredConstraintImpl();
		return requiredConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProhibitsConstraint createProhibitsConstraint() {
		ProhibitsConstraintImpl prohibitsConstraint = new ProhibitsConstraintImpl();
		return prohibitsConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypes createAttributeTypesFromString(EDataType eDataType, String initialValue) {
		AttributeTypes result = AttributeTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperation createLogicalOperationFromString(EDataType eDataType, String initialValue) {
		LogicalOperation result = LogicalOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureObjectivePackage getFeatureObjectivePackage() {
		return (FeatureObjectivePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FeatureObjectivePackage getPackage() {
		return FeatureObjectivePackage.eINSTANCE;
	}

} //FeatureObjectiveFactoryImpl
