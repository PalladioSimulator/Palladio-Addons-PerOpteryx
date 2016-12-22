/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription;
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
 *
 * @generated
 */
public class gdofFactoryImpl extends EFactoryImpl implements gdofFactory {
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static gdofFactory init() {
        try {
            final gdofFactory thegdofFactory = (gdofFactory) EPackage.Registry.INSTANCE
                    .getEFactory(gdofPackage.eNS_URI);
            if (thegdofFactory != null) {
                return thegdofFactory;
            }
        } catch (final Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new gdofFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public gdofFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject create(final EClass eClass) {
        switch (eClass.getClassifierID()) {
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION:
            return this.createChangeableElementDescription();
        case gdofPackage.VALUE_RULE:
            return this.createValueRule();
        case gdofPackage.OCL_RULE:
            return this.createOCLRule();
        case gdofPackage.HELPER_OCL_DEFINITION:
            return this.createHelperOCLDefinition();
        case gdofPackage.DO_FREPOSITORY:
            return this.createDoFRepository();
        case gdofPackage.INSTANCE_SELECTION_RULE:
            return this.createInstanceSelectionRule();
        case gdofPackage.STATIC_SELECTION_RULE:
            return this.createStaticSelectionRule();
        case gdofPackage.DEGREE_OF_FREEDOM:
            return this.createDegreeOfFreedom();
        case gdofPackage.DECORATOR_MODEL_DESCRIPTION:
            return this.createDecoratorModelDescription();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ChangeableElementDescription createChangeableElementDescription() {
        final ChangeableElementDescriptionImpl changeableElementDescription = new ChangeableElementDescriptionImpl();
        return changeableElementDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ValueRule createValueRule() {
        final ValueRuleImpl valueRule = new ValueRuleImpl();
        return valueRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public OCLRule createOCLRule() {
        final OCLRuleImpl oclRule = new OCLRuleImpl();
        return oclRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public HelperOCLDefinition createHelperOCLDefinition() {
        final HelperOCLDefinitionImpl helperOCLDefinition = new HelperOCLDefinitionImpl();
        return helperOCLDefinition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DoFRepository createDoFRepository() {
        final DoFRepositoryImpl doFRepository = new DoFRepositoryImpl();
        return doFRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public InstanceSelectionRule createInstanceSelectionRule() {
        final InstanceSelectionRuleImpl instanceSelectionRule = new InstanceSelectionRuleImpl();
        return instanceSelectionRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public StaticSelectionRule createStaticSelectionRule() {
        final StaticSelectionRuleImpl staticSelectionRule = new StaticSelectionRuleImpl();
        return staticSelectionRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DegreeOfFreedom createDegreeOfFreedom() {
        final DegreeOfFreedomImpl degreeOfFreedom = new DegreeOfFreedomImpl();
        return degreeOfFreedom;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DecoratorModelDescription createDecoratorModelDescription() {
        final DecoratorModelDescriptionImpl decoratorModelDescription = new DecoratorModelDescriptionImpl();
        return decoratorModelDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public gdofPackage getgdofPackage() {
        return (gdofPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @deprecated
     * @generated
     */
    @Deprecated
    public static gdofPackage getPackage() {
        return gdofPackage.eINSTANCE;
    }

} // gdofFactoryImpl
