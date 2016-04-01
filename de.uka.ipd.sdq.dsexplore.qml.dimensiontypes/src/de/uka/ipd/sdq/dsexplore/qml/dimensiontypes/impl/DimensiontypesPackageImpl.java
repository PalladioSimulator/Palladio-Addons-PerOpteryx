/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeScale;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesFactory;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EScaleOfMeasure;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumNumericDomain;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.ScaleElement;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.util.DimensiontypesValidator;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import namedelement.NamedelementPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DimensiontypesPackageImpl extends EPackageImpl implements DimensiontypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationSemanticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeNumericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scaleElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRelationSemanticsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumNumericDomainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eScaleOfMeasureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eNumberEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DimensiontypesPackageImpl() {
		super(eNS_URI, DimensiontypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DimensiontypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DimensiontypesPackage init() {
		if (isInited) return (DimensiontypesPackage)EPackage.Registry.INSTANCE.getEPackage(DimensiontypesPackage.eNS_URI);

		// Obtain or create and register package
		DimensiontypesPackageImpl theDimensiontypesPackage = (DimensiontypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DimensiontypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DimensiontypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		IdentifierPackage.eINSTANCE.eClass();
		NamedelementPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDimensiontypesPackage.createPackageContents();

		// Initialize created meta-data
		theDimensiontypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDimensiontypesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DimensiontypesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDimensiontypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DimensiontypesPackage.eNS_URI, theDimensiontypesPackage);
		return theDimensiontypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionTypeSet() {
		return dimensionTypeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeSet_Elements() {
		return (EReference)dimensionTypeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeSet_Order() {
		return (EReference)dimensionTypeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionType() {
		return dimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_RelationSemantics() {
		return (EReference)dimensionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationSemantics() {
		return relationSemanticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationSemantics_RelSem() {
		return (EAttribute)relationSemanticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrder() {
		return orderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_BiggerElement() {
		return (EReference)orderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrder_SmallerElement() {
		return (EReference)orderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionTypeEnum() {
		return dimensionTypeEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeEnum_Elements() {
		return (EReference)dimensionTypeEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeEnum_Order() {
		return (EReference)dimensionTypeEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionTypeNumeric() {
		return dimensionTypeNumericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeNumeric_Range() {
		return (EReference)dimensionTypeNumericEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionTypeNumeric_Domain() {
		return (EAttribute)dimensionTypeNumericEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericRange() {
		return numericRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericRange_LowerLimit() {
		return (EAttribute)numericRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumericRange_UpperLimit() {
		return (EAttribute)numericRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionTypeRepository() {
		return dimensionTypeRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeRepository_DimensionTypes() {
		return (EReference)dimensionTypeRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionTypeScale() {
		return dimensionTypeScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionTypeScale_ScaleElements() {
		return (EReference)dimensionTypeScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionTypeScale_Scale() {
		return (EAttribute)dimensionTypeScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScaleElement() {
		return scaleElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleElement_Value() {
		return (EAttribute)scaleElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScaleElement_Scale() {
		return (EAttribute)scaleElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumRelationSemantics() {
		return enumRelationSemanticsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnumNumericDomain() {
		return enumNumericDomainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEScaleOfMeasure() {
		return eScaleOfMeasureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getENumber() {
		return eNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensiontypesFactory getDimensiontypesFactory() {
		return (DimensiontypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dimensionTypeSetEClass = createEClass(DIMENSION_TYPE_SET);
		createEReference(dimensionTypeSetEClass, DIMENSION_TYPE_SET__ELEMENTS);
		createEReference(dimensionTypeSetEClass, DIMENSION_TYPE_SET__ORDER);

		dimensionTypeEClass = createEClass(DIMENSION_TYPE);
		createEReference(dimensionTypeEClass, DIMENSION_TYPE__RELATION_SEMANTICS);

		relationSemanticsEClass = createEClass(RELATION_SEMANTICS);
		createEAttribute(relationSemanticsEClass, RELATION_SEMANTICS__REL_SEM);

		elementEClass = createEClass(ELEMENT);

		orderEClass = createEClass(ORDER);
		createEReference(orderEClass, ORDER__BIGGER_ELEMENT);
		createEReference(orderEClass, ORDER__SMALLER_ELEMENT);

		dimensionTypeEnumEClass = createEClass(DIMENSION_TYPE_ENUM);
		createEReference(dimensionTypeEnumEClass, DIMENSION_TYPE_ENUM__ELEMENTS);
		createEReference(dimensionTypeEnumEClass, DIMENSION_TYPE_ENUM__ORDER);

		dimensionTypeNumericEClass = createEClass(DIMENSION_TYPE_NUMERIC);
		createEReference(dimensionTypeNumericEClass, DIMENSION_TYPE_NUMERIC__RANGE);
		createEAttribute(dimensionTypeNumericEClass, DIMENSION_TYPE_NUMERIC__DOMAIN);

		numericRangeEClass = createEClass(NUMERIC_RANGE);
		createEAttribute(numericRangeEClass, NUMERIC_RANGE__LOWER_LIMIT);
		createEAttribute(numericRangeEClass, NUMERIC_RANGE__UPPER_LIMIT);

		dimensionTypeRepositoryEClass = createEClass(DIMENSION_TYPE_REPOSITORY);
		createEReference(dimensionTypeRepositoryEClass, DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES);

		dimensionTypeScaleEClass = createEClass(DIMENSION_TYPE_SCALE);
		createEReference(dimensionTypeScaleEClass, DIMENSION_TYPE_SCALE__SCALE_ELEMENTS);
		createEAttribute(dimensionTypeScaleEClass, DIMENSION_TYPE_SCALE__SCALE);

		scaleElementEClass = createEClass(SCALE_ELEMENT);
		createEAttribute(scaleElementEClass, SCALE_ELEMENT__VALUE);
		createEAttribute(scaleElementEClass, SCALE_ELEMENT__SCALE);

		// Create enums
		enumRelationSemanticsEEnum = createEEnum(ENUM_RELATION_SEMANTICS);
		enumNumericDomainEEnum = createEEnum(ENUM_NUMERIC_DOMAIN);
		eScaleOfMeasureEEnum = createEEnum(ESCALE_OF_MEASURE);

		// Create data types
		eNumberEDataType = createEDataType(ENUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		IdentifierPackage theIdentifierPackage = (IdentifierPackage)EPackage.Registry.INSTANCE.getEPackage(IdentifierPackage.eNS_URI);
		NamedelementPackage theNamedelementPackage = (NamedelementPackage)EPackage.Registry.INSTANCE.getEPackage(NamedelementPackage.eNS_URI);

		// Create type parameters
		ETypeParameter dimensionTypeScaleEClass_T = addETypeParameter(dimensionTypeScaleEClass, "T");
		ETypeParameter scaleElementEClass_T = addETypeParameter(scaleElementEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getENumber());
		dimensionTypeScaleEClass_T.getEBounds().add(g1);
		g1 = createEGenericType(this.getENumber());
		scaleElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		dimensionTypeSetEClass.getESuperTypes().add(this.getDimensionType());
		dimensionTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		relationSemanticsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		elementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		elementEClass.getESuperTypes().add(theNamedelementPackage.getNamedElement());
		orderEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dimensionTypeEnumEClass.getESuperTypes().add(this.getDimensionType());
		dimensionTypeNumericEClass.getESuperTypes().add(this.getDimensionType());
		numericRangeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dimensionTypeRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
		dimensionTypeScaleEClass.getESuperTypes().add(this.getDimensionType());
		scaleElementEClass.getESuperTypes().add(this.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(dimensionTypeSetEClass, DimensionTypeSet.class, "DimensionTypeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionTypeSet_Elements(), this.getElement(), null, "elements", null, 1, -1, DimensionTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionTypeSet_Order(), this.getOrder(), null, "order", null, 0, -1, DimensionTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(dimensionTypeSetEClass, ecorePackage.getEBoolean(), "ORDER_can_only_exist_with_RELATIONSEMANTICS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dimensionTypeEClass, DimensionType.class, "DimensionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionType_RelationSemantics(), this.getRelationSemantics(), null, "relationSemantics", null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(relationSemanticsEClass, RelationSemantics.class, "RelationSemantics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationSemantics_RelSem(), this.getEnumRelationSemantics(), "relSem", null, 1, 1, RelationSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrder_BiggerElement(), this.getElement(), null, "biggerElement", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrder_SmallerElement(), this.getElement(), null, "smallerElement", null, 1, 1, Order.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(orderEClass, ecorePackage.getEBoolean(), "BIGGERELEMENT_must_not_be_SMALLELEMENT", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dimensionTypeEnumEClass, DimensionTypeEnum.class, "DimensionTypeEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionTypeEnum_Elements(), this.getElement(), null, "elements", null, 1, -1, DimensionTypeEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDimensionTypeEnum_Order(), this.getOrder(), null, "order", null, 0, -1, DimensionTypeEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(dimensionTypeEnumEClass, ecorePackage.getEBoolean(), "ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dimensionTypeNumericEClass, DimensionTypeNumeric.class, "DimensionTypeNumeric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionTypeNumeric_Range(), this.getNumericRange(), null, "range", null, 0, 1, DimensionTypeNumeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDimensionTypeNumeric_Domain(), this.getEnumNumericDomain(), "domain", null, 1, 1, DimensionTypeNumeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(dimensionTypeNumericEClass, ecorePackage.getEBoolean(), "NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericRangeEClass, NumericRange.class, "NumericRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericRange_LowerLimit(), ecorePackage.getEDouble(), "lowerLimit", null, 1, 1, NumericRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNumericRange_UpperLimit(), ecorePackage.getEDouble(), "upperLimit", null, 1, 1, NumericRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(numericRangeEClass, ecorePackage.getEBoolean(), "UPPERLIMIT_must_be_greater_than_LOWERLIMIT", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dimensionTypeRepositoryEClass, DimensionTypeRepository.class, "DimensionTypeRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDimensionTypeRepository_DimensionTypes(), this.getDimensionType(), null, "dimensionTypes", null, 0, -1, DimensionTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dimensionTypeScaleEClass, DimensionTypeScale.class, "DimensionTypeScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(dimensionTypeScaleEClass_T);
		initEReference(getDimensionTypeScale_ScaleElements(), g1, null, "scaleElements", null, 1, -1, DimensionTypeScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDimensionTypeScale_Scale(), this.getEScaleOfMeasure(), "scale", null, 1, 1, DimensionTypeScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scaleElementEClass, ScaleElement.class, "ScaleElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(scaleElementEClass_T);
		initEAttribute(getScaleElement_Value(), g1, "value", null, 0, 1, ScaleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScaleElement_Scale(), this.getEScaleOfMeasure(), "scale", null, 1, 1, ScaleElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumRelationSemanticsEEnum, EnumRelationSemantics.class, "EnumRelationSemantics");
		addEEnumLiteral(enumRelationSemanticsEEnum, EnumRelationSemantics.DECREASING);
		addEEnumLiteral(enumRelationSemanticsEEnum, EnumRelationSemantics.INCREASING);

		initEEnum(enumNumericDomainEEnum, EnumNumericDomain.class, "EnumNumericDomain");
		addEEnumLiteral(enumNumericDomainEEnum, EnumNumericDomain.REAL);
		addEEnumLiteral(enumNumericDomainEEnum, EnumNumericDomain.INTEGER);

		initEEnum(eScaleOfMeasureEEnum, EScaleOfMeasure.class, "EScaleOfMeasure");
		addEEnumLiteral(eScaleOfMeasureEEnum, EScaleOfMeasure.ORDINAL);
		addEEnumLiteral(eScaleOfMeasureEEnum, EScaleOfMeasure.NOMINAL);
		addEEnumLiteral(eScaleOfMeasureEEnum, EScaleOfMeasure.RATIO);

		// Initialize data types
		initEDataType(eNumberEDataType, Number.class, "ENumber", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (dimensionTypeSetEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.relationSemantics=null implies self.order->size()=0"
		   });	
		addAnnotation
		  (orderEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.biggerElement<>self.smallerElement"
		   });	
		addAnnotation
		  (dimensionTypeEnumEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "(self.relationSemantics=null implies self.order->size()=0) and \r\n(self.order->size()=0 implies self.relationSemantics=null)"
		   });	
		addAnnotation
		  (dimensionTypeNumericEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.relationSemantics <> null"
		   });	
		addAnnotation
		  (numericRangeEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", "self.upperLimit.oclAsType(Real) > self.lowerLimit.oclAsType(Real)"
		   });
	}

} //DimensiontypesPackageImpl
