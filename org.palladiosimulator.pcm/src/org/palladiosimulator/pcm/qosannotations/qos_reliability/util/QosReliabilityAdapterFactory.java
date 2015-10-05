/**
 * Copyright 2005-2009 by SDQ, IPD, University of Karlsruhe, Germany
 */
package org.palladiosimulator.pcm.qosannotations.qos_reliability.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.qosannotations.SpecifiedQoSAnnotation;
import org.palladiosimulator.pcm.qosannotations.qos_reliability.QosReliabilityPackage;
import org.palladiosimulator.pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see org.palladiosimulator.pcm.qosannotations.qos_reliability.QosReliabilityPackage
 * @generated
 */
public class QosReliabilityAdapterFactory extends AdapterFactoryImpl {

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
    protected static QosReliabilityPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QosReliabilityAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = QosReliabilityPackage.eINSTANCE;
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
    protected QosReliabilitySwitch<Adapter> modelSwitch = new QosReliabilitySwitch<Adapter>()
    {
        @Override
        public Adapter caseSpecifiedReliabilityAnnotation(final SpecifiedReliabilityAnnotation object)
        {
            return QosReliabilityAdapterFactory.this.createSpecifiedReliabilityAnnotationAdapter();
        }

        @Override
        public Adapter caseSpecifiedQoSAnnotation(final SpecifiedQoSAnnotation object)
        {
            return QosReliabilityAdapterFactory.this.createSpecifiedQoSAnnotationAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return QosReliabilityAdapterFactory.this.createEObjectAdapter();
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
             * {@link org.palladiosimulator.pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation
             * <em>Specified Reliability Annotation</em>}'. <!-- begin-user-doc --> This default
             * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
             * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.qosannotations.qos_reliability.SpecifiedReliabilityAnnotation
     * @generated
     */
    public Adapter createSpecifiedReliabilityAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '
             * {@link org.palladiosimulator.pcm.qosannotations.SpecifiedQoSAnnotation
             * <em>Specified Qo SAnnotation</em>}'. <!-- begin-user-doc --> This default implementation
             * returns null so that we can easily ignore cases; it's useful to ignore a case when
             * inheritance will catch all the cases anyway. <!-- end-user-doc -->
             *
             * @return the new adapter.
     * @see org.palladiosimulator.pcm.qosannotations.SpecifiedQoSAnnotation
     * @generated
     */
    public Adapter createSpecifiedQoSAnnotationAdapter() {
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

} // QosReliabilityAdapterFactory
