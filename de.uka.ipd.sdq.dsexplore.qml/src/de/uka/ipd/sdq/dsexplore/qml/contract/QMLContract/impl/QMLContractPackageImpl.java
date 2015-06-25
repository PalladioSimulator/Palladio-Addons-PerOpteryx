/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.impl;

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

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.AspectRequirement;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Constraint;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Criterion;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.DeterministicEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumOperator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EnumRangeValueType;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.EvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Frequency;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.GenericQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Goal;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Mean;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.NumericLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Objective;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Percentile;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.PointEstimator;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractFactory;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RangeValue;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.RefinedQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Restriction;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SetLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.SimpleQMLContract;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.StochasticEvaluationAspect;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Value;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.Variance;
import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.util.QMLContractValidator;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.QMLContractTypePackageImpl;
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
public class QMLContractPackageImpl extends EPackageImpl implements QMLContractPackage {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass simpleQMLContractEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass criterionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass evaluationAspectEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass aspectRequirementEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass valueLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass percentileEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass pointEstimatorEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass stochasticEvaluationAspectEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass frequencyEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass rangeValueEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass meanEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass varianceEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass numericLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass enumLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass setLiteralEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass refinedQMLContractEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass valueEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass deterministicEvaluationAspectEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass objectiveEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass constraintEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass restrictionEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass goalEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EClass genericQMLContractEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum enumOperatorEEnum = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    private EEnum enumRangeValueTypeEEnum = null;

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
     * @see de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.QMLContractPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private QMLContractPackageImpl() {
        super(eNS_URI, QMLContractFactory.eINSTANCE);
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
     * This method is used to initialize {@link QMLContractPackage#eINSTANCE} when that field is
     * accessed. Clients should not invoke it directly. Instead, they should simply access that
     * field to obtain the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static QMLContractPackage init() {
        if (isInited) {
            return (QMLContractPackage) EPackage.Registry.INSTANCE.getEPackage(QMLContractPackage.eNS_URI);
        }

        // Obtain or create and register package
        final QMLContractPackageImpl theQMLContractPackage = (QMLContractPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof QMLContractPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
                        : new QMLContractPackageImpl());

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
        final QMLContractTypePackageImpl theQMLContractTypePackage = (QMLContractTypePackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(QMLContractTypePackage.eNS_URI) instanceof QMLContractTypePackageImpl ? EPackage.Registry.INSTANCE
                        .getEPackage(QMLContractTypePackage.eNS_URI)
                : QMLContractTypePackage.eINSTANCE);

        // Create package meta-data objects
        theQMLContractPackage.createPackageContents();
        theQMLProfilePackage.createPackageContents();
        theQMLDeclarationsPackage.createPackageContents();
        theQMLContractTypePackage.createPackageContents();

        // Initialize created meta-data
        theQMLContractPackage.initializePackageContents();
        theQMLProfilePackage.initializePackageContents();
        theQMLDeclarationsPackage.initializePackageContents();
        theQMLContractTypePackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
        (theQMLContractPackage,
                new EValidator.Descriptor()
        {
            @Override
            public EValidator getEValidator()
            {
                return QMLContractValidator.INSTANCE;
            }
        });

        // Mark meta-data to indicate it can't be changed
        theQMLContractPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(QMLContractPackage.eNS_URI, theQMLContractPackage);
        return theQMLContractPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSimpleQMLContract() {
        return this.simpleQMLContractEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSimpleQMLContract_Criteria() {
        return (EReference) this.simpleQMLContractEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSimpleQMLContract_ContractType() {
        return (EReference) this.simpleQMLContractEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getCriterion() {
        return this.criterionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCriterion_Dimension() {
        return (EReference) this.criterionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getCriterion_Aspects() {
        return (EReference) this.criterionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEvaluationAspect() {
        return this.evaluationAspectEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEvaluationAspect_AspectRequirement() {
        return (EReference) this.evaluationAspectEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getAspectRequirement() {
        return this.aspectRequirementEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getAspectRequirement_AspectRequirementLiteral() {
        return (EReference) this.aspectRequirementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getValueLiteral() {
        return this.valueLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPercentile() {
        return this.percentileEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getPercentile_Percentile() {
        return (EAttribute) this.percentileEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getPointEstimator() {
        return this.pointEstimatorEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getStochasticEvaluationAspect() {
        return this.stochasticEvaluationAspectEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getFrequency() {
        return this.frequencyEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFrequency_UpperLimit() {
        return (EReference) this.frequencyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getFrequency_LowerLimit() {
        return (EReference) this.frequencyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRangeValue() {
        return this.rangeValueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRangeValue_RangeLimitLiteral() {
        return (EReference) this.rangeValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRangeValue_Type() {
        return (EAttribute) this.rangeValueEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getMean() {
        return this.meanEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getVariance() {
        return this.varianceEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getNumericLiteral() {
        return this.numericLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getNumericLiteral_Value() {
        return (EAttribute) this.numericLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getEnumLiteral() {
        return this.enumLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getEnumLiteral_Value() {
        return (EReference) this.enumLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getSetLiteral() {
        return this.setLiteralEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getSetLiteral_Values() {
        return (EReference) this.setLiteralEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRefinedQMLContract() {
        return this.refinedQMLContractEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRefinedQMLContract_RefinedBy() {
        return (EReference) this.refinedQMLContractEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EReference getRefinedQMLContract_BaseContract() {
        return (EReference) this.refinedQMLContractEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getValue() {
        return this.valueEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getDeterministicEvaluationAspect() {
        return this.deterministicEvaluationAspectEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getObjective() {
        return this.objectiveEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getConstraint() {
        return this.constraintEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getRestriction() {
        return this.restrictionEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EAttribute getRestriction_Operator() {
        return (EAttribute) this.restrictionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getGoal() {
        return this.goalEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EClass getGenericQMLContract() {
        return this.genericQMLContractEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getEnumOperator() {
        return this.enumOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EEnum getEnumRangeValueType() {
        return this.enumRangeValueTypeEEnum;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public QMLContractFactory getQMLContractFactory() {
        return (QMLContractFactory) this.getEFactoryInstance();
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
        this.simpleQMLContractEClass = this.createEClass(SIMPLE_QML_CONTRACT);
        this.createEReference(this.simpleQMLContractEClass, SIMPLE_QML_CONTRACT__CRITERIA);
        this.createEReference(this.simpleQMLContractEClass, SIMPLE_QML_CONTRACT__CONTRACT_TYPE);

        this.criterionEClass = this.createEClass(CRITERION);
        this.createEReference(this.criterionEClass, CRITERION__DIMENSION);
        this.createEReference(this.criterionEClass, CRITERION__ASPECTS);

        this.evaluationAspectEClass = this.createEClass(EVALUATION_ASPECT);
        this.createEReference(this.evaluationAspectEClass, EVALUATION_ASPECT__ASPECT_REQUIREMENT);

        this.aspectRequirementEClass = this.createEClass(ASPECT_REQUIREMENT);
        this.createEReference(this.aspectRequirementEClass, ASPECT_REQUIREMENT__ASPECT_REQUIREMENT_LITERAL);

        this.valueLiteralEClass = this.createEClass(VALUE_LITERAL);

        this.percentileEClass = this.createEClass(PERCENTILE);
        this.createEAttribute(this.percentileEClass, PERCENTILE__PERCENTILE);

        this.pointEstimatorEClass = this.createEClass(POINT_ESTIMATOR);

        this.stochasticEvaluationAspectEClass = this.createEClass(STOCHASTIC_EVALUATION_ASPECT);

        this.frequencyEClass = this.createEClass(FREQUENCY);
        this.createEReference(this.frequencyEClass, FREQUENCY__UPPER_LIMIT);
        this.createEReference(this.frequencyEClass, FREQUENCY__LOWER_LIMIT);

        this.rangeValueEClass = this.createEClass(RANGE_VALUE);
        this.createEReference(this.rangeValueEClass, RANGE_VALUE__RANGE_LIMIT_LITERAL);
        this.createEAttribute(this.rangeValueEClass, RANGE_VALUE__TYPE);

        this.meanEClass = this.createEClass(MEAN);

        this.varianceEClass = this.createEClass(VARIANCE);

        this.numericLiteralEClass = this.createEClass(NUMERIC_LITERAL);
        this.createEAttribute(this.numericLiteralEClass, NUMERIC_LITERAL__VALUE);

        this.enumLiteralEClass = this.createEClass(ENUM_LITERAL);
        this.createEReference(this.enumLiteralEClass, ENUM_LITERAL__VALUE);

        this.setLiteralEClass = this.createEClass(SET_LITERAL);
        this.createEReference(this.setLiteralEClass, SET_LITERAL__VALUES);

        this.refinedQMLContractEClass = this.createEClass(REFINED_QML_CONTRACT);
        this.createEReference(this.refinedQMLContractEClass, REFINED_QML_CONTRACT__REFINED_BY);
        this.createEReference(this.refinedQMLContractEClass, REFINED_QML_CONTRACT__BASE_CONTRACT);

        this.valueEClass = this.createEClass(VALUE);

        this.deterministicEvaluationAspectEClass = this.createEClass(DETERMINISTIC_EVALUATION_ASPECT);

        this.objectiveEClass = this.createEClass(OBJECTIVE);

        this.constraintEClass = this.createEClass(CONSTRAINT);

        this.restrictionEClass = this.createEClass(RESTRICTION);
        this.createEAttribute(this.restrictionEClass, RESTRICTION__OPERATOR);

        this.goalEClass = this.createEClass(GOAL);

        this.genericQMLContractEClass = this.createEClass(GENERIC_QML_CONTRACT);

        // Create enums
        this.enumOperatorEEnum = this.createEEnum(ENUM_OPERATOR);
        this.enumRangeValueTypeEEnum = this.createEEnum(ENUM_RANGE_VALUE_TYPE);
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
        final QMLContractTypePackage theQMLContractTypePackage = (QMLContractTypePackage) EPackage.Registry.INSTANCE
                .getEPackage(QMLContractTypePackage.eNS_URI);
        final IdentifierPackage theIdentifierPackage = (IdentifierPackage) EPackage.Registry.INSTANCE
                .getEPackage(IdentifierPackage.eNS_URI);
        final QMLDeclarationsPackage theQMLDeclarationsPackage = (QMLDeclarationsPackage) EPackage.Registry.INSTANCE
                .getEPackage(QMLDeclarationsPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        this.simpleQMLContractEClass.getESuperTypes().add(this.getGenericQMLContract());
        this.criterionEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.evaluationAspectEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.aspectRequirementEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.valueLiteralEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.percentileEClass.getESuperTypes().add(this.getPointEstimator());
        this.pointEstimatorEClass.getESuperTypes().add(this.getStochasticEvaluationAspect());
        this.stochasticEvaluationAspectEClass.getESuperTypes().add(this.getEvaluationAspect());
        this.frequencyEClass.getESuperTypes().add(this.getStochasticEvaluationAspect());
        this.rangeValueEClass.getESuperTypes().add(theIdentifierPackage.getIdentifier());
        this.meanEClass.getESuperTypes().add(this.getPointEstimator());
        this.varianceEClass.getESuperTypes().add(this.getPointEstimator());
        this.numericLiteralEClass.getESuperTypes().add(this.getValueLiteral());
        this.enumLiteralEClass.getESuperTypes().add(this.getValueLiteral());
        this.setLiteralEClass.getESuperTypes().add(this.getValueLiteral());
        this.refinedQMLContractEClass.getESuperTypes().add(this.getGenericQMLContract());
        this.valueEClass.getESuperTypes().add(this.getDeterministicEvaluationAspect());
        this.deterministicEvaluationAspectEClass.getESuperTypes().add(this.getEvaluationAspect());
        this.objectiveEClass.getESuperTypes().add(this.getCriterion());
        this.constraintEClass.getESuperTypes().add(this.getCriterion());
        this.restrictionEClass.getESuperTypes().add(this.getAspectRequirement());
        this.goalEClass.getESuperTypes().add(this.getAspectRequirement());
        this.genericQMLContractEClass.getESuperTypes().add(theQMLDeclarationsPackage.getQMLDeclaration());

        // Initialize classes and features; add operations and parameters
        this.initEClass(this.simpleQMLContractEClass, SimpleQMLContract.class, "SimpleQMLContract", !IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSimpleQMLContract_Criteria(), this.getCriterion(), null, "criteria", null, 0, -1,
                SimpleQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getSimpleQMLContract_ContractType(), theQMLContractTypePackage.getQMLContractType(),
                null,
                "contractType", null, 1, 1, SimpleQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        EOperation op = this.addEOperation(this.simpleQMLContractEClass, this.ecorePackage.getEBoolean(),
                "all_DIMENSIONs_must_be_from_same_CONTRACTTYPE", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        EGenericType g1 = this.createEGenericType(this.ecorePackage.getEMap());
        EGenericType g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.criterionEClass, Criterion.class, "Criterion", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getCriterion_Dimension(), theQMLContractTypePackage.getDimension(), null, "dimension",
                null, 1,
                1, Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getCriterion_Aspects(), this.getEvaluationAspect(), null, "aspects", null, 1, -1,
                Criterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.criterionEClass, this.ecorePackage.getEBoolean(),
                "Only_CONSTRAINTS_have_RESTRICTIONS", 0, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.criterionEClass, this.ecorePackage.getEBoolean(),
                "FREQUENCY_only_possible_if_DIMENSION_is_ordered", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.criterionEClass, this.ecorePackage.getEBoolean(),
                "POINTESTIMATOR_only_for_numeric_dimensions",
                0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.criterionEClass, this.ecorePackage.getEBoolean(), "Only_OBJECTIVES_have_GOALS", 0,
                1, IS_UNIQUE,
                IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.evaluationAspectEClass, EvaluationAspect.class, "EvaluationAspect", IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEvaluationAspect_AspectRequirement(), this.getAspectRequirement(), null,
                "aspectRequirement",
                null, 0, 1, EvaluationAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.evaluationAspectEClass, this.ecorePackage.getEBoolean(),
                "FREQUENCY_LIMIT_must_be_NUMERIC", 0, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        op = this.addEOperation(this.evaluationAspectEClass, this.ecorePackage.getEBoolean(),
                "FREQUENCY_LIMIT_must_be_between_0_and_100", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.aspectRequirementEClass, AspectRequirement.class, "AspectRequirement", IS_ABSTRACT,
                !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getAspectRequirement_AspectRequirementLiteral(), this.getValueLiteral(), null,
                "aspectRequirementLiteral", null, 1, 1, AspectRequirement.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.valueLiteralEClass, ValueLiteral.class, "ValueLiteral", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.percentileEClass, Percentile.class, "Percentile", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getPercentile_Percentile(), this.ecorePackage.getEDouble(), "percentile", null, 1, 1,
                Percentile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.percentileEClass, this.ecorePackage.getEBoolean(), "PERCENTILE_between_0_and_100",
                0, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.pointEstimatorEClass, PointEstimator.class, "PointEstimator", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.stochasticEvaluationAspectEClass, StochasticEvaluationAspect.class,
                "StochasticEvaluationAspect",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.frequencyEClass, Frequency.class, "Frequency", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getFrequency_UpperLimit(), this.getRangeValue(), null, "upperLimit", null, 0, 1,
                Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getFrequency_LowerLimit(), this.getRangeValue(), null, "lowerLimit", null, 0, 1,
                Frequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.frequencyEClass, this.ecorePackage.getEBoolean(),
                "range_of_FREQUENCY_must_have_UPPERLIMIT_or_LOWERLIMIT", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.rangeValueEClass, RangeValue.class, "RangeValue", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRangeValue_RangeLimitLiteral(), this.getValueLiteral(), null, "rangeLimitLiteral",
                null, 1,
                1, RangeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEAttribute(this.getRangeValue_Type(), this.getEnumRangeValueType(), "type", null, 1, 1,
                RangeValue.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.meanEClass, Mean.class, "Mean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.varianceEClass, Variance.class, "Variance", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.numericLiteralEClass, NumericLiteral.class, "NumericLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getNumericLiteral_Value(), this.ecorePackage.getEDouble(), "value", null, 1, 1,
                NumericLiteral.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getEnumLiteral_Value(), theQMLContractTypePackage.getElement(), null, "value", null,
                1, 1,
                EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getSetLiteral_Values(), theQMLContractTypePackage.getElement(), null, "values", null,
                1, -1,
                SetLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.refinedQMLContractEClass, RefinedQMLContract.class, "RefinedQMLContract", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        this.initEReference(this.getRefinedQMLContract_RefinedBy(), this.getCriterion(), null, "refinedBy", null, 0,
                -1,
                RefinedQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        this.initEReference(this.getRefinedQMLContract_BaseContract(), this.getGenericQMLContract(), null,
                "baseContract", null,
                1, 1, RefinedQMLContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
                IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        op = this.addEOperation(this.refinedQMLContractEClass, this.ecorePackage.getEBoolean(),
                "contract_cannot_refine_itself", 0, 1,
                IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.deterministicEvaluationAspectEClass, DeterministicEvaluationAspect.class,
                "DeterministicEvaluationAspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.objectiveEClass, Objective.class, "Objective", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        op = this.addEOperation(this.constraintEClass, this.ecorePackage.getEBoolean(),
                "All_ASPECTS_of_CONSTRAINTS_have_RESTRICTIONS", 0, 1, IS_UNIQUE, IS_ORDERED);
        this.addEParameter(op, this.ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
        g1 = this.createEGenericType(this.ecorePackage.getEMap());
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        g2 = this.createEGenericType(this.ecorePackage.getEJavaObject());
        g1.getETypeArguments().add(g2);
        this.addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

        this.initEClass(this.restrictionEClass, Restriction.class, "Restriction", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        this.initEAttribute(this.getRestriction_Operator(), this.getEnumOperator(), "operator", null, 1, 1,
                Restriction.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        this.initEClass(this.goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        this.initEClass(this.genericQMLContractEClass, GenericQMLContract.class, "GenericQMLContract", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        this.initEEnum(this.enumOperatorEEnum, EnumOperator.class, "EnumOperator");
        this.addEEnumLiteral(this.enumOperatorEEnum, EnumOperator.LESS);
        this.addEEnumLiteral(this.enumOperatorEEnum, EnumOperator.GREATER);
        this.addEEnumLiteral(this.enumOperatorEEnum, EnumOperator.EQUAL);
        this.addEEnumLiteral(this.enumOperatorEEnum, EnumOperator.LESS_OR_EQUAL);
        this.addEEnumLiteral(this.enumOperatorEEnum, EnumOperator.GREATER_OR_EQUAL);

        this.initEEnum(this.enumRangeValueTypeEEnum, EnumRangeValueType.class, "EnumRangeValueType");
        this.addEEnumLiteral(this.enumRangeValueTypeEEnum, EnumRangeValueType.INCLUSIVE);
        this.addEEnumLiteral(this.enumRangeValueTypeEEnum, EnumRangeValueType.EXCLUSIVE);

        // Create resource
        this.createResource(eNS_URI);
    }

} // QMLContractPackageImpl
