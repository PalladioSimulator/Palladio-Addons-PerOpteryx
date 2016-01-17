/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.GenericdesigndecisionPackage;
import genericdesigndecision.genericDoF.AClassAsReferenceDegree;
import genericdesigndecision.genericDoF.AClassDegree;
import genericdesigndecision.genericDoF.AClassWithCopyDegree;
import genericdesigndecision.genericDoF.AContinuousRangeDegree;
import genericdesigndecision.genericDoF.ADataTypeDegree;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.genericDoF.ADiscreteDegree;
import genericdesigndecision.genericDoF.ADiscreteRangeDegree;
import genericdesigndecision.genericDoF.AEnumDegree;
import genericdesigndecision.genericDoF.AOrderedDataTypeDegree;
import genericdesigndecision.genericDoF.AOrderedIntegerDegree;
import genericdesigndecision.genericDoF.ARangeDegree;
import genericdesigndecision.genericDoF.AStringSetDegree;
import genericdesigndecision.genericDoF.AUnorderedDegree;
import genericdesigndecision.genericDoF.ChangeableElementDescription;
import genericdesigndecision.genericDoF.DoFRepository;
import genericdesigndecision.genericDoF.GenericDoFFactory;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import genericdesigndecision.genericDoF.HelperOCLDefinition;
import genericdesigndecision.genericDoF.InstanceSelectionRule;
import genericdesigndecision.genericDoF.OCLRule;
import genericdesigndecision.genericDoF.SelectionRule;
import genericdesigndecision.genericDoF.StaticContextRule;
import genericdesigndecision.genericDoF.StaticSelectionRule;
import genericdesigndecision.genericDoF.ValueRule;

import genericdesigndecision.impl.GenericdesigndecisionPackageImpl;
import genericdesigndecision.qualityproperties.QualitypropertiesPackage;

import genericdesigndecision.qualityproperties.impl.QualitypropertiesPackageImpl;

import genericdesigndecision.universalDoF.UniversalDoFPackage;

import genericdesigndecision.universalDoF.impl.UniversalDoFPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDoFPackageImpl extends EPackageImpl implements GenericDoFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeableElementDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperOCLDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticContextRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doFRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSelectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticSelectionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDegreeOfFreedomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aClassAsReferenceDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aClassDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aClassWithCopyDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aContinuousRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDataTypeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDiscreteDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDiscreteRangeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEnumDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aUnorderedDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aOrderedDataTypeDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aOrderedIntegerDegreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aStringSetDegreeEClass = null;

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
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericDoFPackageImpl() {
		super(eNS_URI, GenericDoFFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericDoFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericDoFPackage init() {
		if (isInited) return (GenericDoFPackage)EPackage.Registry.INSTANCE.getEPackage(GenericDoFPackage.eNS_URI);

		// Obtain or create and register package
		GenericDoFPackageImpl theGenericDoFPackage = (GenericDoFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GenericDoFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GenericDoFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		GenericdesigndecisionPackageImpl theGenericdesigndecisionPackage = (GenericdesigndecisionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI) instanceof GenericdesigndecisionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI) : GenericdesigndecisionPackage.eINSTANCE);
		UniversalDoFPackageImpl theUniversalDoFPackage = (UniversalDoFPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) instanceof UniversalDoFPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI) : UniversalDoFPackage.eINSTANCE);
		QualitypropertiesPackageImpl theQualitypropertiesPackage = (QualitypropertiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) instanceof QualitypropertiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(QualitypropertiesPackage.eNS_URI) : QualitypropertiesPackage.eINSTANCE);

		// Create package meta-data objects
		theGenericDoFPackage.createPackageContents();
		theGenericdesigndecisionPackage.createPackageContents();
		theUniversalDoFPackage.createPackageContents();
		theQualitypropertiesPackage.createPackageContents();

		// Initialize created meta-data
		theGenericDoFPackage.initializePackageContents();
		theGenericdesigndecisionPackage.initializePackageContents();
		theUniversalDoFPackage.initializePackageContents();
		theQualitypropertiesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericDoFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericDoFPackage.eNS_URI, theGenericDoFPackage);
		return theGenericDoFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeableElementDescription() {
		return changeableElementDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_Changeable() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_ValueRule() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeableElementDescription_SelectionRule() {
		return (EReference)changeableElementDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRule() {
		return valueRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOCLRule() {
		return oclRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOCLRule_MainOclQuery() {
		return (EAttribute)oclRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOCLRule_HelperDefinition() {
		return (EReference)oclRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperOCLDefinition() {
		return helperOCLDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticContextRule() {
		return staticContextRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticContextRule_ContextClass() {
		return (EReference)staticContextRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectionRule() {
		return selectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoFRepository() {
		return doFRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoFRepository_Sdofs() {
		return (EReference)doFRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoFRepository__DeleteSDoF__SpecificDoF() {
		return doFRepositoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDoFRepository__GetSDoF__String() {
		return doFRepositoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSelectionRule() {
		return instanceSelectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSelectionRule_ContextInstance() {
		return (EReference)instanceSelectionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticSelectionRule() {
		return staticSelectionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADegreeOfFreedom() {
		return aDegreeOfFreedomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADegreeOfFreedom_AddedElements() {
		return (EReference)aDegreeOfFreedomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADegreeOfFreedom_ChangeableElementDescriptions() {
		return (EReference)aDegreeOfFreedomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADegreeOfFreedom_InteractionConstraints() {
		return (EReference)aDegreeOfFreedomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADegreeOfFreedom_PrimaryChangeable() {
		return (EReference)aDegreeOfFreedomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADegreeOfFreedom_PrimaryChanged() {
		return (EReference)aDegreeOfFreedomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADegreeOfFreedom_ChangeableElements() {
		return (EReference)aDegreeOfFreedomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getADegreeOfFreedom__CreateRandomChoice() {
		return aDegreeOfFreedomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getADegreeOfFreedom__DetermineInitialChoice() {
		return aDegreeOfFreedomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getADegreeOfFreedom__CreateChoice() {
		return aDegreeOfFreedomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAClassAsReferenceDegree() {
		return aClassAsReferenceDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAClassDegree() {
		return aClassDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAClassDegree_ClassDesignOptions() {
		return (EReference)aClassDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAClassDegree__CreateRandomChoice() {
		return aClassDegreeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAClassWithCopyDegree() {
		return aClassWithCopyDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAContinuousRangeDegree() {
		return aContinuousRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAContinuousRangeDegree_To() {
		return (EAttribute)aContinuousRangeDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAContinuousRangeDegree_From() {
		return (EAttribute)aContinuousRangeDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAContinuousRangeDegree__CreateRandomChoice() {
		return aContinuousRangeDegreeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARangeDegree() {
		return aRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARangeDegree_UpperBoundIncluded() {
		return (EAttribute)aRangeDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARangeDegree_LowerBoundIncluded() {
		return (EAttribute)aRangeDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARangeDegree_NumberOfSteps() {
		return (EAttribute)aRangeDegreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADataTypeDegree() {
		return aDataTypeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getADataTypeDegree__CreateRandomChoice() {
		return aDataTypeDegreeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADiscreteDegree() {
		return aDiscreteDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getADiscreteDegree__CreateRandomChoice() {
		return aDiscreteDegreeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADiscreteRangeDegree() {
		return aDiscreteRangeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADiscreteRangeDegree_To() {
		return (EAttribute)aDiscreteRangeDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADiscreteRangeDegree_From() {
		return (EAttribute)aDiscreteRangeDegreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEnumDegree() {
		return aEnumDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAEnumDegree_Enumeration() {
		return (EReference)aEnumDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAUnorderedDegree() {
		return aUnorderedDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAOrderedDataTypeDegree() {
		return aOrderedDataTypeDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAOrderedIntegerDegree() {
		return aOrderedIntegerDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAOrderedIntegerDegree_ListOfIntegers() {
		return (EAttribute)aOrderedIntegerDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAStringSetDegree() {
		return aStringSetDegreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAStringSetDegree_StringValues() {
		return (EAttribute)aStringSetDegreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFFactory getGenericDoFFactory() {
		return (GenericDoFFactory)getEFactoryInstance();
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
		changeableElementDescriptionEClass = createEClass(CHANGEABLE_ELEMENT_DESCRIPTION);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE);
		createEReference(changeableElementDescriptionEClass, CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE);

		valueRuleEClass = createEClass(VALUE_RULE);

		oclRuleEClass = createEClass(OCL_RULE);
		createEAttribute(oclRuleEClass, OCL_RULE__MAIN_OCL_QUERY);
		createEReference(oclRuleEClass, OCL_RULE__HELPER_DEFINITION);

		helperOCLDefinitionEClass = createEClass(HELPER_OCL_DEFINITION);

		staticContextRuleEClass = createEClass(STATIC_CONTEXT_RULE);
		createEReference(staticContextRuleEClass, STATIC_CONTEXT_RULE__CONTEXT_CLASS);

		selectionRuleEClass = createEClass(SELECTION_RULE);

		doFRepositoryEClass = createEClass(DO_FREPOSITORY);
		createEReference(doFRepositoryEClass, DO_FREPOSITORY__SDOFS);
		createEOperation(doFRepositoryEClass, DO_FREPOSITORY___DELETE_SDO_F__SPECIFICDOF);
		createEOperation(doFRepositoryEClass, DO_FREPOSITORY___GET_SDO_F__STRING);

		instanceSelectionRuleEClass = createEClass(INSTANCE_SELECTION_RULE);
		createEReference(instanceSelectionRuleEClass, INSTANCE_SELECTION_RULE__CONTEXT_INSTANCE);

		staticSelectionRuleEClass = createEClass(STATIC_SELECTION_RULE);

		aDegreeOfFreedomEClass = createEClass(ADEGREE_OF_FREEDOM);
		createEReference(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM__ADDED_ELEMENTS);
		createEReference(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS);
		createEReference(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS);
		createEReference(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE);
		createEReference(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM__PRIMARY_CHANGED);
		createEReference(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM__CHANGEABLE_ELEMENTS);
		createEOperation(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM___CREATE_RANDOM_CHOICE);
		createEOperation(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM___DETERMINE_INITIAL_CHOICE);
		createEOperation(aDegreeOfFreedomEClass, ADEGREE_OF_FREEDOM___CREATE_CHOICE);

		aClassAsReferenceDegreeEClass = createEClass(ACLASS_AS_REFERENCE_DEGREE);

		aClassDegreeEClass = createEClass(ACLASS_DEGREE);
		createEReference(aClassDegreeEClass, ACLASS_DEGREE__CLASS_DESIGN_OPTIONS);
		createEOperation(aClassDegreeEClass, ACLASS_DEGREE___CREATE_RANDOM_CHOICE);

		aClassWithCopyDegreeEClass = createEClass(ACLASS_WITH_COPY_DEGREE);

		aContinuousRangeDegreeEClass = createEClass(ACONTINUOUS_RANGE_DEGREE);
		createEAttribute(aContinuousRangeDegreeEClass, ACONTINUOUS_RANGE_DEGREE__TO);
		createEAttribute(aContinuousRangeDegreeEClass, ACONTINUOUS_RANGE_DEGREE__FROM);
		createEOperation(aContinuousRangeDegreeEClass, ACONTINUOUS_RANGE_DEGREE___CREATE_RANDOM_CHOICE);

		aRangeDegreeEClass = createEClass(ARANGE_DEGREE);
		createEAttribute(aRangeDegreeEClass, ARANGE_DEGREE__UPPER_BOUND_INCLUDED);
		createEAttribute(aRangeDegreeEClass, ARANGE_DEGREE__LOWER_BOUND_INCLUDED);
		createEAttribute(aRangeDegreeEClass, ARANGE_DEGREE__NUMBER_OF_STEPS);

		aDataTypeDegreeEClass = createEClass(ADATA_TYPE_DEGREE);
		createEOperation(aDataTypeDegreeEClass, ADATA_TYPE_DEGREE___CREATE_RANDOM_CHOICE);

		aDiscreteDegreeEClass = createEClass(ADISCRETE_DEGREE);
		createEOperation(aDiscreteDegreeEClass, ADISCRETE_DEGREE___CREATE_RANDOM_CHOICE);

		aDiscreteRangeDegreeEClass = createEClass(ADISCRETE_RANGE_DEGREE);
		createEAttribute(aDiscreteRangeDegreeEClass, ADISCRETE_RANGE_DEGREE__TO);
		createEAttribute(aDiscreteRangeDegreeEClass, ADISCRETE_RANGE_DEGREE__FROM);

		aEnumDegreeEClass = createEClass(AENUM_DEGREE);
		createEReference(aEnumDegreeEClass, AENUM_DEGREE__ENUMERATION);

		aUnorderedDegreeEClass = createEClass(AUNORDERED_DEGREE);

		aOrderedDataTypeDegreeEClass = createEClass(AORDERED_DATA_TYPE_DEGREE);

		aOrderedIntegerDegreeEClass = createEClass(AORDERED_INTEGER_DEGREE);
		createEAttribute(aOrderedIntegerDegreeEClass, AORDERED_INTEGER_DEGREE__LIST_OF_INTEGERS);

		aStringSetDegreeEClass = createEClass(ASTRING_SET_DEGREE);
		createEAttribute(aStringSetDegreeEClass, ASTRING_SET_DEGREE__STRING_VALUES);
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
		UniversalDoFPackage theUniversalDoFPackage = (UniversalDoFPackage)EPackage.Registry.INSTANCE.getEPackage(UniversalDoFPackage.eNS_URI);
		GenericdesigndecisionPackage theGenericdesigndecisionPackage = (GenericdesigndecisionPackage)EPackage.Registry.INSTANCE.getEPackage(GenericdesigndecisionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		valueRuleEClass.getESuperTypes().add(this.getOCLRule());
		helperOCLDefinitionEClass.getESuperTypes().add(this.getOCLRule());
		helperOCLDefinitionEClass.getESuperTypes().add(this.getStaticContextRule());
		selectionRuleEClass.getESuperTypes().add(this.getOCLRule());
		instanceSelectionRuleEClass.getESuperTypes().add(this.getSelectionRule());
		staticSelectionRuleEClass.getESuperTypes().add(this.getSelectionRule());
		staticSelectionRuleEClass.getESuperTypes().add(this.getStaticContextRule());
		aClassAsReferenceDegreeEClass.getESuperTypes().add(this.getAClassDegree());
		aClassDegreeEClass.getESuperTypes().add(this.getADegreeOfFreedom());
		aClassWithCopyDegreeEClass.getESuperTypes().add(this.getAClassDegree());
		aContinuousRangeDegreeEClass.getESuperTypes().add(this.getARangeDegree());
		aRangeDegreeEClass.getESuperTypes().add(this.getAOrderedDataTypeDegree());
		aDataTypeDegreeEClass.getESuperTypes().add(this.getADegreeOfFreedom());
		aDiscreteDegreeEClass.getESuperTypes().add(this.getADataTypeDegree());
		aDiscreteRangeDegreeEClass.getESuperTypes().add(this.getARangeDegree());
		aDiscreteRangeDegreeEClass.getESuperTypes().add(this.getADiscreteDegree());
		aEnumDegreeEClass.getESuperTypes().add(this.getAUnorderedDegree());
		aUnorderedDegreeEClass.getESuperTypes().add(this.getADataTypeDegree());
		aOrderedDataTypeDegreeEClass.getESuperTypes().add(this.getADataTypeDegree());
		aOrderedIntegerDegreeEClass.getESuperTypes().add(this.getADiscreteDegree());
		aOrderedIntegerDegreeEClass.getESuperTypes().add(this.getAOrderedDataTypeDegree());
		aStringSetDegreeEClass.getESuperTypes().add(this.getAUnorderedDegree());

		// Initialize classes, features, and operations; add parameters
		initEClass(changeableElementDescriptionEClass, ChangeableElementDescription.class, "ChangeableElementDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeableElementDescription_Changeable(), ecorePackage.getEStructuralFeature(), null, "changeable", null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChangeableElementDescription_ValueRule(), this.getValueRule(), null, "valueRule", null, 1, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getChangeableElementDescription_SelectionRule(), this.getSelectionRule(), null, "selectionRule", null, 0, 1, ChangeableElementDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueRuleEClass, ValueRule.class, "ValueRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oclRuleEClass, OCLRule.class, "OCLRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOCLRule_MainOclQuery(), ecorePackage.getEString(), "mainOclQuery", null, 1, 1, OCLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOCLRule_HelperDefinition(), this.getHelperOCLDefinition(), null, "helperDefinition", null, 0, -1, OCLRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(helperOCLDefinitionEClass, HelperOCLDefinition.class, "HelperOCLDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(staticContextRuleEClass, StaticContextRule.class, "StaticContextRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticContextRule_ContextClass(), ecorePackage.getEClass(), null, "contextClass", null, 0, 1, StaticContextRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(selectionRuleEClass, SelectionRule.class, "SelectionRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(doFRepositoryEClass, DoFRepository.class, "DoFRepository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDoFRepository_Sdofs(), theUniversalDoFPackage.getSpecificDoF(), null, "sdofs", null, 0, -1, DoFRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getDoFRepository__DeleteSDoF__SpecificDoF(), ecorePackage.getEBoolean(), "deleteSDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theUniversalDoFPackage.getSpecificDoF(), "sdof", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDoFRepository__GetSDoF__String(), theUniversalDoFPackage.getSpecificDoF(), "getSDoF", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(instanceSelectionRuleEClass, InstanceSelectionRule.class, "InstanceSelectionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSelectionRule_ContextInstance(), this.getChangeableElementDescription(), null, "contextInstance", null, 0, 1, InstanceSelectionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staticSelectionRuleEClass, StaticSelectionRule.class, "StaticSelectionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aDegreeOfFreedomEClass, ADegreeOfFreedom.class, "ADegreeOfFreedom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getADegreeOfFreedom_AddedElements(), ecorePackage.getEClass(), null, "addedElements", null, 0, -1, ADegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getADegreeOfFreedom_ChangeableElementDescriptions(), this.getChangeableElementDescription(), null, "changeableElementDescriptions", null, 1, -1, ADegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getADegreeOfFreedom_InteractionConstraints(), ecorePackage.getEOperation(), null, "interactionConstraints", null, 0, -1, ADegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getADegreeOfFreedom_PrimaryChangeable(), this.getChangeableElementDescription(), null, "primaryChangeable", null, 1, 1, ADegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getADegreeOfFreedom_PrimaryChanged(), ecorePackage.getEObject(), null, "primaryChanged", null, 1, 1, ADegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getADegreeOfFreedom_ChangeableElements(), ecorePackage.getEObject(), null, "changeableElements", null, 1, 1, ADegreeOfFreedom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getADegreeOfFreedom__CreateRandomChoice(), theGenericdesigndecisionPackage.getChoice(), "createRandomChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getADegreeOfFreedom__DetermineInitialChoice(), theGenericdesigndecisionPackage.getChoice(), "determineInitialChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getADegreeOfFreedom__CreateChoice(), theGenericdesigndecisionPackage.getChoice(), "createChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aClassAsReferenceDegreeEClass, AClassAsReferenceDegree.class, "AClassAsReferenceDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aClassDegreeEClass, AClassDegree.class, "AClassDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAClassDegree_ClassDesignOptions(), theEcorePackage.getEObject(), null, "classDesignOptions", null, 1, -1, AClassDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAClassDegree__CreateRandomChoice(), theGenericdesigndecisionPackage.getChoice(), "createRandomChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aClassWithCopyDegreeEClass, AClassWithCopyDegree.class, "AClassWithCopyDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aContinuousRangeDegreeEClass, AContinuousRangeDegree.class, "AContinuousRangeDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAContinuousRangeDegree_To(), ecorePackage.getEDouble(), "to", null, 1, 1, AContinuousRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAContinuousRangeDegree_From(), ecorePackage.getEDouble(), "from", null, 1, 1, AContinuousRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAContinuousRangeDegree__CreateRandomChoice(), theGenericdesigndecisionPackage.getChoice(), "createRandomChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aRangeDegreeEClass, ARangeDegree.class, "ARangeDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getARangeDegree_UpperBoundIncluded(), ecorePackage.getEBoolean(), "upperBoundIncluded", "true", 1, 1, ARangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getARangeDegree_LowerBoundIncluded(), ecorePackage.getEBoolean(), "lowerBoundIncluded", "true", 1, 1, ARangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getARangeDegree_NumberOfSteps(), ecorePackage.getEInt(), "numberOfSteps", null, 0, 1, ARangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aDataTypeDegreeEClass, ADataTypeDegree.class, "ADataTypeDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getADataTypeDegree__CreateRandomChoice(), theGenericdesigndecisionPackage.getChoice(), "createRandomChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aDiscreteDegreeEClass, ADiscreteDegree.class, "ADiscreteDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getADiscreteDegree__CreateRandomChoice(), theGenericdesigndecisionPackage.getChoice(), "createRandomChoice", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(aDiscreteRangeDegreeEClass, ADiscreteRangeDegree.class, "ADiscreteRangeDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADiscreteRangeDegree_To(), ecorePackage.getEInt(), "to", null, 1, 1, ADiscreteRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getADiscreteRangeDegree_From(), ecorePackage.getEInt(), "from", null, 1, 1, ADiscreteRangeDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aEnumDegreeEClass, AEnumDegree.class, "AEnumDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAEnumDegree_Enumeration(), theEcorePackage.getEEnum(), null, "enumeration", null, 0, 1, AEnumDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aUnorderedDegreeEClass, AUnorderedDegree.class, "AUnorderedDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aOrderedDataTypeDegreeEClass, AOrderedDataTypeDegree.class, "AOrderedDataTypeDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aOrderedIntegerDegreeEClass, AOrderedIntegerDegree.class, "AOrderedIntegerDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAOrderedIntegerDegree_ListOfIntegers(), ecorePackage.getEInt(), "listOfIntegers", null, 1, -1, AOrderedIntegerDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(aStringSetDegreeEClass, AStringSetDegree.class, "AStringSetDegree", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAStringSetDegree_StringValues(), theTypesPackage.getString(), "stringValues", null, 1, -1, AStringSetDegree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //GenericDoFPackageImpl
