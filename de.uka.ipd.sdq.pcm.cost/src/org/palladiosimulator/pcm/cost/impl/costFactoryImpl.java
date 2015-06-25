/**
 */
package org.palladiosimulator.pcm.cost.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.palladiosimulator.pcm.cost.ComponentCost;
import org.palladiosimulator.pcm.cost.ComponentCostPerInstance;
import org.palladiosimulator.pcm.cost.CostRepository;
import org.palladiosimulator.pcm.cost.FixedLinkingResourceCost;
import org.palladiosimulator.pcm.cost.FixedProcessingResourceCost;
import org.palladiosimulator.pcm.cost.ScalarFunction;
import org.palladiosimulator.pcm.cost.VariableLinkingResourceCost;
import org.palladiosimulator.pcm.cost.VariableProcessingResourceCost;
import org.palladiosimulator.pcm.cost.costFactory;
import org.palladiosimulator.pcm.cost.costPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class costFactoryImpl extends EFactoryImpl implements costFactory
{
    /**
     * Creates the default factory implementation. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static costFactory init()
    {
        try
        {
            final costFactory thecostFactory = (costFactory) EPackage.Registry.INSTANCE
                    .getEFactory(costPackage.eNS_URI);
            if (thecostFactory != null)
            {
                return thecostFactory;
            }
        } catch (final Exception exception)
        {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new costFactoryImpl();
    }

    /**
     * Creates an instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public costFactoryImpl()
    {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public EObject create(final EClass eClass)
    {
        switch (eClass.getClassifierID())
        {
        case costPackage.COMPONENT_COST:
            return this.createComponentCost();
        case costPackage.FIXED_LINKING_RESOURCE_COST:
            return this.createFixedLinkingResourceCost();
        case costPackage.FIXED_PROCESSING_RESOURCE_COST:
            return this.createFixedProcessingResourceCost();
        case costPackage.VARIABLE_LINKING_RESOURCE_COST:
            return this.createVariableLinkingResourceCost();
        case costPackage.VARIABLE_PROCESSING_RESOURCE_COST:
            return this.createVariableProcessingResourceCost();
        case costPackage.SCALAR_FUNCTION:
            return this.createScalarFunction();
        case costPackage.COST_REPOSITORY:
            return this.createCostRepository();
        case costPackage.COMPONENT_COST_PER_INSTANCE:
            return this.createComponentCostPerInstance();
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
    public ComponentCost createComponentCost()
    {
        final ComponentCostImpl componentCost = new ComponentCostImpl();
        return componentCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FixedLinkingResourceCost createFixedLinkingResourceCost()
    {
        final FixedLinkingResourceCostImpl fixedLinkingResourceCost = new FixedLinkingResourceCostImpl();
        return fixedLinkingResourceCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public FixedProcessingResourceCost createFixedProcessingResourceCost()
    {
        final FixedProcessingResourceCostImpl fixedProcessingResourceCost = new FixedProcessingResourceCostImpl();
        return fixedProcessingResourceCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableLinkingResourceCost createVariableLinkingResourceCost()
    {
        final VariableLinkingResourceCostImpl variableLinkingResourceCost = new VariableLinkingResourceCostImpl();
        return variableLinkingResourceCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public VariableProcessingResourceCost createVariableProcessingResourceCost()
    {
        final VariableProcessingResourceCostImpl variableProcessingResourceCost = new VariableProcessingResourceCostImpl();
        return variableProcessingResourceCost;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ScalarFunction createScalarFunction()
    {
        final ScalarFunctionImpl scalarFunction = new ScalarFunctionImpl();
        return scalarFunction;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public CostRepository createCostRepository()
    {
        final CostRepositoryImpl costRepository = new CostRepositoryImpl();
        return costRepository;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public ComponentCostPerInstance createComponentCostPerInstance()
    {
        final ComponentCostPerInstanceImpl componentCostPerInstance = new ComponentCostPerInstanceImpl();
        return componentCostPerInstance;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public costPackage getcostPackage()
    {
        return (costPackage) this.getEPackage();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @deprecated
     * @generated
     */
    @Deprecated
    public static costPackage getPackage()
    {
        return costPackage.eINSTANCE;
    }

} // costFactoryImpl
