/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import de.uka.ipd.sdq.pcm.designdecision.gdof.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class gdofFactoryImpl extends EFactoryImpl implements gdofFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static gdofFactory init() {
		try {
			gdofFactory thegdofFactory = (gdofFactory) EPackage.Registry.INSTANCE.getEFactory(gdofPackage.eNS_URI);
			if (thegdofFactory != null) {
				return thegdofFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new gdofFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public gdofFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION:
			return createChangeableElementDescription();
		case gdofPackage.VALUE_RULE:
			return createValueRule();
		case gdofPackage.OCL_RULE:
			return createOCLRule();
		case gdofPackage.HELPER_OCL_DEFINITION:
			return createHelperOCLDefinition();
		case gdofPackage.DO_FREPOSITORY:
			return createDoFRepository();
		case gdofPackage.INSTANCE_SELECTION_RULE:
			return createInstanceSelectionRule();
		case gdofPackage.STATIC_SELECTION_RULE:
			return createStaticSelectionRule();
		case gdofPackage.DEGREE_OF_FREEDOM:
			return createDegreeOfFreedom();
		case gdofPackage.DECORATOR_MODEL_DESCRIPTION:
			return createDecoratorModelDescription();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeableElementDescription createChangeableElementDescription() {
		ChangeableElementDescriptionImpl changeableElementDescription = new ChangeableElementDescriptionImpl();
		return changeableElementDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueRule createValueRule() {
		ValueRuleImpl valueRule = new ValueRuleImpl();
		return valueRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OCLRule createOCLRule() {
		OCLRuleImpl oclRule = new OCLRuleImpl();
		return oclRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HelperOCLDefinition createHelperOCLDefinition() {
		HelperOCLDefinitionImpl helperOCLDefinition = new HelperOCLDefinitionImpl();
		return helperOCLDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoFRepository createDoFRepository() {
		DoFRepositoryImpl doFRepository = new DoFRepositoryImpl();
		return doFRepository;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InstanceSelectionRule createInstanceSelectionRule() {
		InstanceSelectionRuleImpl instanceSelectionRule = new InstanceSelectionRuleImpl();
		return instanceSelectionRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticSelectionRule createStaticSelectionRule() {
		StaticSelectionRuleImpl staticSelectionRule = new StaticSelectionRuleImpl();
		return staticSelectionRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeOfFreedom createDegreeOfFreedom() {
		DegreeOfFreedomImpl degreeOfFreedom = new DegreeOfFreedomImpl();
		return degreeOfFreedom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecoratorModelDescription createDecoratorModelDescription() {
		DecoratorModelDescriptionImpl decoratorModelDescription = new DecoratorModelDescriptionImpl();
		return decoratorModelDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public gdofPackage getgdofPackage() {
		return (gdofPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static gdofPackage getPackage() {
		return gdofPackage.eINSTANCE;
	}

} // gdofFactoryImpl
