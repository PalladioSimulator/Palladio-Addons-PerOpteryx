/**
 */
package genericdesigndecision.GenericDoF.impl;

import genericdesigndecision.GenericDoF.*;

import org.eclipse.emf.ecore.EClass;
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
public class GenericDoFFactoryImpl extends EFactoryImpl implements GenericDoFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericDoFFactory init() {
		try {
			GenericDoFFactory theGenericDoFFactory = (GenericDoFFactory)EPackage.Registry.INSTANCE.getEFactory(GenericDoFPackage.eNS_URI);
			if (theGenericDoFFactory != null) {
				return theGenericDoFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GenericDoFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFFactoryImpl() {
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
			case GenericDoFPackage.CHANGEABLE_ELEMENT_DESCRIPTION: return createChangeableElementDescription();
			case GenericDoFPackage.VALUE_RULE: return createValueRule();
			case GenericDoFPackage.OCL_RULE: return createOCLRule();
			case GenericDoFPackage.HELPER_OCL_DEFINITION: return createHelperOCLDefinition();
			case GenericDoFPackage.DO_FREPOSITORY: return createDoFRepository();
			case GenericDoFPackage.INSTANCE_SELECTION_RULE: return createInstanceSelectionRule();
			case GenericDoFPackage.STATIC_SELECTION_RULE: return createStaticSelectionRule();
			case GenericDoFPackage.DEGREE_OF_FREEDOM: return createDegreeOfFreedom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeableElementDescription createChangeableElementDescription() {
		ChangeableElementDescriptionImpl changeableElementDescription = new ChangeableElementDescriptionImpl();
		return changeableElementDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRule createValueRule() {
		ValueRuleImpl valueRule = new ValueRuleImpl();
		return valueRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCLRule createOCLRule() {
		OCLRuleImpl oclRule = new OCLRuleImpl();
		return oclRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperOCLDefinition createHelperOCLDefinition() {
		HelperOCLDefinitionImpl helperOCLDefinition = new HelperOCLDefinitionImpl();
		return helperOCLDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoFRepository createDoFRepository() {
		DoFRepositoryImpl doFRepository = new DoFRepositoryImpl();
		return doFRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSelectionRule createInstanceSelectionRule() {
		InstanceSelectionRuleImpl instanceSelectionRule = new InstanceSelectionRuleImpl();
		return instanceSelectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticSelectionRule createStaticSelectionRule() {
		StaticSelectionRuleImpl staticSelectionRule = new StaticSelectionRuleImpl();
		return staticSelectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedom createDegreeOfFreedom() {
		DegreeOfFreedomImpl degreeOfFreedom = new DegreeOfFreedomImpl();
		return degreeOfFreedom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericDoFPackage getGenericDoFPackage() {
		return (GenericDoFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GenericDoFPackage getPackage() {
		return GenericDoFPackage.eINSTANCE;
	}

} //GenericDoFFactoryImpl
