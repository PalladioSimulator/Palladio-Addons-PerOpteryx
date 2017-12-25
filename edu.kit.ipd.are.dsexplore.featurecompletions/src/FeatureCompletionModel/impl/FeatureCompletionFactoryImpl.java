/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.*;

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
public class FeatureCompletionFactoryImpl extends EFactoryImpl implements FeatureCompletionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FeatureCompletionFactory init() {
		try {
			FeatureCompletionFactory theFeatureCompletionFactory = (FeatureCompletionFactory)EPackage.Registry.INSTANCE.getEFactory(FeatureCompletionPackage.eNS_URI);
			if (theFeatureCompletionFactory != null) {
				return theFeatureCompletionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FeatureCompletionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FeatureCompletionPackage.FEATURE_COMPLETION_REPOSITORY: return createFeatureCompletionRepository();
			case FeatureCompletionPackage.FEATURE_COMPLETION: return createFeatureCompletion();
			case FeatureCompletionPackage.COMPLETION_COMPONENT: return createCompletionComponent();
			case FeatureCompletionPackage.DESCRIBED_ELEMENT: return createDescribedElement();
			case FeatureCompletionPackage.NAMED_ELEMENT: return createNamedElement();
			case FeatureCompletionPackage.PERIMETER_PROVIDING: return createPerimeterProviding();
			case FeatureCompletionPackage.COMPLEMENTUM_VISNETIS: return createComplementumVisnetis();
			case FeatureCompletionPackage.COMPLEMENTUM: return createComplementum();
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS: return createArchitectureConstraints();
			case FeatureCompletionPackage.CONSTRAINABLE_ELEMENT: return createConstrainableElement();
			case FeatureCompletionPackage.PERIMETER_REQUIRING: return createPerimeterRequiring();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureCompletionPackage.VISNETUM:
				return createVisnetumFromString(eDataType, initialValue);
			case FeatureCompletionPackage.REPLICATION:
				return createReplicationFromString(eDataType, initialValue);
			case FeatureCompletionPackage.CONSTRAINT:
				return createConstraintFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FeatureCompletionPackage.VISNETUM:
				return convertVisnetumToString(eDataType, instanceValue);
			case FeatureCompletionPackage.REPLICATION:
				return convertReplicationToString(eDataType, instanceValue);
			case FeatureCompletionPackage.CONSTRAINT:
				return convertConstraintToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletionRepository createFeatureCompletionRepository() {
		FeatureCompletionRepositoryImpl featureCompletionRepository = new FeatureCompletionRepositoryImpl();
		return featureCompletionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletion createFeatureCompletion() {
		FeatureCompletionImpl featureCompletion = new FeatureCompletionImpl();
		return featureCompletion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompletionComponent createCompletionComponent() {
		CompletionComponentImpl completionComponent = new CompletionComponentImpl();
		return completionComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescribedElement createDescribedElement() {
		DescribedElementImpl describedElement = new DescribedElementImpl();
		return describedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerimeterProviding createPerimeterProviding() {
		PerimeterProvidingImpl perimeterProviding = new PerimeterProvidingImpl();
		return perimeterProviding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementumVisnetis createComplementumVisnetis() {
		ComplementumVisnetisImpl complementumVisnetis = new ComplementumVisnetisImpl();
		return complementumVisnetis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complementum createComplementum() {
		ComplementumImpl complementum = new ComplementumImpl();
		return complementum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureConstraints createArchitectureConstraints() {
		ArchitectureConstraintsImpl architectureConstraints = new ArchitectureConstraintsImpl();
		return architectureConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainableElement createConstrainableElement() {
		ConstrainableElementImpl constrainableElement = new ConstrainableElementImpl();
		return constrainableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerimeterRequiring createPerimeterRequiring() {
		PerimeterRequiringImpl perimeterRequiring = new PerimeterRequiringImpl();
		return perimeterRequiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visnetum createVisnetumFromString(EDataType eDataType, String initialValue) {
		Visnetum result = Visnetum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisnetumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replication createReplicationFromString(EDataType eDataType, String initialValue) {
		Replication result = Replication.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReplicationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint createConstraintFromString(EDataType eDataType, String initialValue) {
		Constraint result = Constraint.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureCompletionPackage getFeatureCompletionPackage() {
		return (FeatureCompletionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static FeatureCompletionPackage getPackage() {
		return FeatureCompletionPackage.eINSTANCE;
	}

} //FeatureCompletionFactoryImpl
