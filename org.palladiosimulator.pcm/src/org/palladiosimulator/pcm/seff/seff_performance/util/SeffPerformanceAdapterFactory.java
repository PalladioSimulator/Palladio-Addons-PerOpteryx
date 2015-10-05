/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.seff.seff_performance.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;
import org.palladiosimulator.pcm.seff.CallAction;
import org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall;
import org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand;
import org.palladiosimulator.pcm.seff.seff_performance.ResourceCall;
import org.palladiosimulator.pcm.seff.seff_performance.SeffPerformancePackage;

import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.pcm.seff.seff_performance.SeffPerformancePackage
 * @generated
 */
public class SeffPerformanceAdapterFactory extends AdapterFactoryImpl {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public static final String copyright = "Copyright 2005-2015 by palladiosimulator.org";

    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static SeffPerformancePackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public SeffPerformanceAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = SeffPerformancePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected SeffPerformanceSwitch<Adapter> modelSwitch = new SeffPerformanceSwitch<Adapter>()
    {
        @Override
        public Adapter caseInfrastructureCall(final InfrastructureCall object)
        {
            return SeffPerformanceAdapterFactory.this.createInfrastructureCallAdapter();
        }

        @Override
        public Adapter caseResourceCall(final ResourceCall object)
        {
            return SeffPerformanceAdapterFactory.this.createResourceCallAdapter();
        }

        @Override
        public Adapter caseParametricResourceDemand(final ParametricResourceDemand object)
        {
            return SeffPerformanceAdapterFactory.this.createParametricResourceDemandAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return SeffPerformanceAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return SeffPerformanceAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object)
        {
            return SeffPerformanceAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter caseCallAction(final CallAction object)
        {
            return SeffPerformanceAdapterFactory.this.createCallActionAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return SeffPerformanceAdapterFactory.this.createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
             *
             * @param target
             *            the object to adapt.
             * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(final Notifier target) {
        return this.modelSwitch.doSwitch((EObject) target);
    }

    /**
     * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall
             * <em>Infrastructure Call</em>}'. <!-- begin-user-doc --> This default implementation returns
             * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
             * catch all the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.seff_performance.InfrastructureCall
     * @generated
     */
    public Adapter createInfrastructureCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.seff.seff_performance.ResourceCall <em>Resource Call</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.seff_performance.ResourceCall
     * @generated
     */
    public Adapter createResourceCallAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand
             * <em>Parametric Resource Demand</em>}'. <!-- begin-user-doc --> This default implementation
             * returns null so that we can easily ignore cases; it's useful to ignore a case when
             * inheritance will catch all the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.seff_performance.ParametricResourceDemand
     * @generated
     */
    public Adapter createParametricResourceDemandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
             * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
             * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
             * the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see de.uka.ipd.sdq.identifier.Identifier
     * @generated
     */
    public Adapter createIdentifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
             * --> This default implementation returns null so that we can easily ignore cases; it's useful
             * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.core.entity.Entity
     * @generated
     */
    public Adapter createEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.seff.CallAction <em>Call Action</em>}'. <!-- begin-user-doc
             * --> This default implementation returns null so that we can easily ignore cases; it's useful
             * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.seff.CallAction
     * @generated
     */
    public Adapter createCallActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
             * implementation returns null. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} // SeffPerformanceAdapterFactory
