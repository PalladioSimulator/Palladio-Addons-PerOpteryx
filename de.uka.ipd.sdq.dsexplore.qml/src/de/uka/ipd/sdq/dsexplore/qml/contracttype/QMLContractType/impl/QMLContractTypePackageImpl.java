/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.palladiosimulator.pcm.PcmPackage;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl.QMLContractPackageImpl;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeEnum;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeNumeric;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumNumericDomain;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumRelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.NumericRange;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypeFactory;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.RelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Unit;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.UnitRepository;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util.QMLContractTypeValidator;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarationsPackage;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.impl.QMLDeclarationsPackageImpl;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.QMLProfilePackageImpl;
import de.uka.ipd.sdq.identifier.IdentifierPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 *
 * @generated
 */
public class QMLContractTypePackageImpl extends EPackageImpl implements QMLContractTypePackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dimensionTypeSetEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dimensionTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass relationSemanticsEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass elementEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass orderEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dimensionTypeEnumEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass unitEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dimensionTypeNumericEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numericRangeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass qmlContractTypeEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass unitRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dimensionTypeRepositoryEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass dimensionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum enumRelationSemanticsEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum enumNumericDomainEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package package URI
     * value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init
     * init()}, which also performs initialization of the package, or returns the registered
     * package, if one already exists. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private QMLContractTypePackageImpl() {
        super(eNS_URI, QMLContractTypeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others
     * upon which it depends.
     *
     * <p>
     * This method is used to initialize {@link QMLContractTypePackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static QMLContractTypePackage init() {
        if (isInited) {
            return (QMLContractTypePackage) EPackage.Registry.INSTANCE.getEPackage(QMLContractTypePackage.eNS_URI);
        }

        // Obtain or create and register package
        final QMLContractTypePackageImpl theQMLContractTypePackage = (QMLContractTypePackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof QMLContractTypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new QMLContractTypePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        PcmPackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        final QMLProfilePackageImpl theQMLProfilePackage = (QMLProfilePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(QMLProfilePackage.eNS_URI) instanceof QMLProfilePackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(QMLProfilePackage.eNS_URI) : QMLProfilePackage.eINSTANCE);
        final QMLDeclarationsPackageImpl theQMLDeclarationsPackage = (QMLDeclarationsPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(QMLDeclarationsPackage.eNS_URI) instanceof QMLDeclarationsPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(QMLDeclarationsPackage.eNS_URI)
                : QMLDeclarationsPackage.eINSTANCE);
        final QMLContractPackageImpl theQMLContractPackage = (QMLContractPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(QMLContractPackage.eNS_URI) instanceof QMLContractPackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(QMLContractPackage.eNS_URI) : QMLContractPackage.eINSTANCE);

        // Create package meta-data objects
        theQMLContractTypePackage.createPackageContents();
        theQMLProfilePackage.createPackageContents();
        theQMLDeclarationsPackage.createPackageContents();
        theQMLContractPackage.createPackageContents();

        // Initialize created meta-data
        theQMLContractTypePackage.initializePackageContents();
        theQMLProfilePackage.initializePackageContents();
        theQMLDeclarationsPackage.initializePackageContents();
        theQMLContractPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
        (theQMLContractTypePackage,
                new EValidator.Descriptor()
        {
            @Override
            public EValidator getEValidator()
            {
                return QMLContractTypeValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theQMLContractTypePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(QMLContractTypePackage.eNS_URI, theQMLContractTypePackage);
        return theQMLContractTypePackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDimensionTypeSet() {
        return this.dimensionTypeSetEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionTypeSet_Elements() {
        return (EReference) this.dimensionTypeSetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionTypeSet_Order() {
        return (EReference) this.dimensionTypeSetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDimensionType() {
        return this.dimensionTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionType_RelationSemantics() {
        return (EReference) this.dimensionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRelationSemantics() {
        return this.relationSemanticsEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRelationSemantics_RelSem() {
        return (EAttribute) this.relationSemanticsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getElement() {
        return this.elementEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getOrder() {
        return this.orderEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOrder_BiggerElement() {
        return (EReference) this.orderEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getOrder_SmallerElement() {
        return (EReference) this.orderEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDimensionTypeEnum() {
        return this.dimensionTypeEnumEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionTypeEnum_Elements() {
        return (EReference) this.dimensionTypeEnumEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionTypeEnum_Order() {
        return (EReference) this.dimensionTypeEnumEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getUnit() {
        return this.unitEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDimensionTypeNumeric() {
        return this.dimensionTypeNumericEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionTypeNumeric_Range() {
        return (EReference) this.dimensionTypeNumericEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getDimensionTypeNumeric_Domain() {
        return (EAttribute) this.dimensionTypeNumericEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumericRange() {
        return this.numericRangeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNumericRange_LowerLimit() {
        return (EAttribute) this.numericRangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNumericRange_UpperLimit() {
        return (EAttribute) this.numericRangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getQMLContractType() {
        return this.qmlContractTypeEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getQMLContractType_Dimensions() {
        return (EReference) this.qmlContractTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getUnitRepository() {
        return this.unitRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getUnitRepository_Units() {
        return (EReference) this.unitRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDimensionTypeRepository() {
        return this.dimensionTypeRepositoryEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimensionTypeRepository_DimensionTypes() {
        return (EReference) this.dimensionTypeRepositoryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDimension() {
        return this.dimensionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimension_Type() {
        return (EReference) this.dimensionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getDimension_Unit() {
        return (EReference) this.dimensionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getEnumRelationSemantics() {
        return this.enumRelationSemanticsEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getEnumNumericDomain() {
        return this.enumNumericDomainEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QMLContractTypeFactory getQMLContractTypeFactory() {
        return (QMLContractTypeFactory) this.getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on
     * any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void createPackageContents() {
        if (this.isCreated) {
            return;
        }
        this.isCreated = true;

        // Create classes and their features
        this.dimensionTypeSetEClass = this.createEClass(DIMENSION_TYPE_SET);
        this.createEReference(this.dimensionTypeSetEClass, DIMENSION_TYPE_SET__ELEMENTS);
        this.createEReference(this.dimensionTypeSetEClass, DIMENSION_TYPE_SET__ORDER);

        this.dimensionTypeEClass = this.createEClass(DIMENSION_TYPE);
        this.createEReference(this.dimensionTypeEClass, DIMENSION_TYPE__RELATION_SEMANTICS);

        this.relationSemanticsEClass = this.createEClass(RELATION_SEMANTICS);
        this.createEAttribute(this.relationSemanticsEClass, RELATION_SEMANTICS__REL_SEM);

        this.elementEClass = this.createEClass(ELEMENT);

        this.orderEClass = this.createEClass(ORDER);
        this.createEReference(this.orderEClass, ORDER__BIGGER_ELEMENT);
        this.createEReference(this.orderEClass, ORDER__SMALLER_ELEMENT);

        this.dimensionTypeEnumEClass = this.createEClass(DIMENSION_TYPE_ENUM);
        this.createEReference(this.dimensionTypeEnumEClass, DIMENSION_TYPE_ENUM__ELEMENTS);
        this.createEReference(this.dimensionTypeEnumEClass, DIMENSION_TYPE_ENUM__ORDER);

        this.unitEClass = this.createEClass(UNIT);

        this.dimensionTypeNumericEClass = this.createEClass(DIMENSION_TYPE_NUMERIC);
        this.createEReference(this.dimensionTypeNumericEClass, DIMENSION_TYPE_NUMERIC__RANGE);
        this.createEAttribute(this.dimensionTypeNumericEClass, DIMENSION_TYPE_NUMERIC__DOMAIN);

        this.numericRangeEClass = this.createEClass(NUMERIC_RANGE);
        this.createEAttribute(this.numericRangeEClass, NUMERIC_RANGE__LOWER_LIMIT);
        this.createEAttribute(this.numericRangeEClass, NUMERIC_RANGE__UPPER_LIMIT);

        this.qmlContractTypeEClass = this.createEClass(QML_CONTRACT_TYPE);
        this.createEReference(this.qmlContractTypeEClass, QML_CONTRACT_TYPE__DIMENSIONS);

        this.unitRepositoryEClass = this.createEClass(UNIT_REPOSITORY);
        this.createEReference(this.unitRepositoryEClass, UNIT_REPOSITORY__UNITS);

        this.dimensionTypeRepositoryEClass = this.createEClass(DIMENSION_TYPE_REPOSITORY);
        this.createEReference(this.dimensionTypeRepositoryEClass, DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES);

        this.dimensionEClass = this.createEClass(DIMENSION);
        this.createEReference(this.dimensionEClass, DIMENSION__TYPE);
        this.createEReference(this.dimensionEClass, DIMENSION__UNIT);

        // Create enums
        this.enumRelationSemanticsEEnum = this.createEEnum(ENUM_RELATION_SEMANTICS);
        this.enumNumericDomainEEnum = this.createEEnum(ENUM_NUMERIC_DOMAIN);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have
     * no affect on any invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public void initializePackageContents() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;

        // Initialize package
        this.setName(eNAME);
        this.setNsPrefix(eNS_PREFIX);
        this.setNsURI(eNS_URI);

        // Obtain other dependent packages
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);
        final EntityPackage theEntityPackage = (EntityPackage) EPackage.Registry.INSTANCE
                .getEPackage(EntityPackage.eNS_URI);
        final QMLDeclarationsPackage theQMLDeclarationsPackage = (QMLDeclarationsPackage) EPackage.Registry.INSTANCE
                .getEPackage(QMLDeclarationsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.dimensionTypeSetEClass.getESuperTypes().add(this.getDimensionType());
        this.dimensionTypeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.relationSemanticsEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.elementEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.orderEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.dimensionTypeEnumEClass.getESuperTypes().add(this.getDimensionType());
        this.unitEClass.getESuperTypes().add(theEntityPackage.getEntity());
        this.dimensionTypeNumericEClass.getESuperTypes().add(this.getDimensionType());
        this.numericRangeEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.qmlContractTypeEClass.getESuperTypes().add(theQMLDeclarationsPackage.getQMLDeclaration());
        this.unitRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.dimensionTypeRepositoryEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.dimensionEClass.getESuperTypes().add(theEntityPackage.getEntity());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.dimensionTypeSetEClass, DimensionTypeSet.class, "DimensionTypeSet", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDimensionTypeSet_Elements(), this.getElement(), null, "elements", null, 1, -1,
                DimensionTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDimensionTypeSet_Order(), this.getOrder(), null, "order", null, 0, -1,
                DimensionTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = this.addEOperation(this.dimensionTypeSetEClass, this.ecorePackage.getEBoolean(),
                "ORDER_can_only_exist_with_RELATIONSEMANTICS", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = this.createEGenericType(this.ecorePackage.getEMap());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.dimensionTypeEClass, DimensionType.class, "DimensionType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDimensionType_RelationSemantics(), this.getRelationSemantics(), null,
                "relationSemantics",
                null, 0, 1, DimensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.relationSemanticsEClass, RelationSemantics.class, "RelationSemantics", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRelationSemantics_RelSem(), this.getEnumRelationSemantics(), "relSem", null, 1, 1,
                RelationSemantics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.orderEClass, Order.class, "Order", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getOrder_BiggerElement(), this.getElement(), null, "biggerElement", null, 1, 1,
                Order.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getOrder_SmallerElement(), this.getElement(), null, "smallerElement", null, 1, 1,
                Order.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.orderEClass, this.ecorePackage.getEBoolean(),
                "BIGGERELEMENT_must_not_be_SMALLELEMENT", 0, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.dimensionTypeEnumEClass, DimensionTypeEnum.class, "DimensionTypeEnum", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDimensionTypeEnum_Elements(), this.getElement(), null, "elements", null, 1, -1,
                DimensionTypeEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDimensionTypeEnum_Order(), this.getOrder(), null, "order", null, 0, -1,
                DimensionTypeEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.dimensionTypeEnumEClass, this.ecorePackage.getEBoolean(),
                "ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.dimensionTypeNumericEClass, DimensionTypeNumeric.class, "DimensionTypeNumeric",
                !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDimensionTypeNumeric_Range(), this.getNumericRange(), null, "range", null, 0, 1,
                DimensionTypeNumeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getDimensionTypeNumeric_Domain(), this.getEnumNumericDomain(), "domain", null, 1, 1,
                DimensionTypeNumeric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.dimensionTypeNumericEClass, this.ecorePackage.getEBoolean(),
                "NUMERICDIMENSIONTYPE_must_have_RELATIONSEMANTICS", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.numericRangeEClass, NumericRange.class, "NumericRange", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericRange_LowerLimit(), this.ecorePackage.getEDouble(), "lowerLimit", null, 1,
                1,
                NumericRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getNumericRange_UpperLimit(), this.ecorePackage.getEDouble(), "upperLimit", null, 1,
                1,
                NumericRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.numericRangeEClass, this.ecorePackage.getEBoolean(),
                "UPPERLIMIT_must_be_greater_than_LOWERLIMIT", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.qmlContractTypeEClass, QMLContractType.class, "QMLContractType", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getQMLContractType_Dimensions(), this.getDimension(), null, "dimensions", null, 0, -1,
                QMLContractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.unitRepositoryEClass, UnitRepository.class, "UnitRepository", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getUnitRepository_Units(), this.getUnit(), null, "units", null, 0, -1,
                UnitRepository.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.dimensionTypeRepositoryEClass, DimensionTypeRepository.class, "DimensionTypeRepository",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDimensionTypeRepository_DimensionTypes(), this.getDimensionType(), null,
                "dimensionTypes",
                null, 0, -1, DimensionTypeRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getDimension_Type(), this.getDimensionType(), null, "type", null, 1, 1,
                Dimension.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getDimension_Unit(), this.getUnit(), null, "unit", null, 0, 1, Dimension.class,
                !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        // Initialize enums and add enum literals
        this.initEEnum(this.enumRelationSemanticsEEnum, EnumRelationSemantics.class, "EnumRelationSemantics");
        this.addEEnumLiteral(this.enumRelationSemanticsEEnum, EnumRelationSemantics.DECREASING);
        this.addEEnumLiteral(this.enumRelationSemanticsEEnum, EnumRelationSemantics.INCREASING);

        this.initEEnum(this.enumNumericDomainEEnum, EnumNumericDomain.class, "EnumNumericDomain");
        this.addEEnumLiteral(this.enumNumericDomainEEnum, EnumNumericDomain.REAL);
        this.addEEnumLiteral(this.enumNumericDomainEEnum, EnumNumericDomain.INTEGER);

        // Create resource
        this.createResource(eNS_URI);
    }

} // QMLContractTypePackageImpl
