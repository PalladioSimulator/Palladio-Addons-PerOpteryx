/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.cost.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import de.uka.ipd.sdq.pcm.cost.Cost;
import de.uka.ipd.sdq.pcm.cost.costPackage;
import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Cost</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.CostImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.CostImpl#getTotalCost <em>Total Cost</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.CostImpl#getOperatingCost <em>Operating Cost</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.cost.impl.CostImpl#getInitialCost <em>Initial Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CostImpl extends EObjectImpl implements Cost {
    /**
     * The default value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getTotalCost()
     * @generated
     * @ordered
     */
    protected static final double TOTAL_COST_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getOperatingCost() <em>Operating Cost</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOperatingCost()
     * @generated
     * @ordered
     */
    protected static final double OPERATING_COST_EDEFAULT = 0.0;

    /**
     * The default value of the '{@link #getInitialCost() <em>Initial Cost</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getInitialCost()
     * @generated
     * @ordered
     */
    protected static final double INITIAL_COST_EDEFAULT = 0.0;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected CostImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return costPackage.Literals.COST;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject getAnnotatedElement() {
        final EObject annotatedElement = this.basicGetAnnotatedElement();
        return annotatedElement != null && annotatedElement.eIsProxy() ? this
                .eResolveProxy((InternalEObject) annotatedElement)
                : annotatedElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public abstract EObject basicGetAnnotatedElement();

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    public boolean isSetAnnotatedElement() {
        return this.getAnnotatedElement() != null;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public double getTotalCost() {
        return CostUtil.getTotalCost(this);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public abstract double getOperatingCost();/*
     * { // TODO: implement this method to return the
     * 'Operating Cost' attribute // Ensure that you
     * remove @generated or mark it @generated NOT throw
     * new UnsupportedOperationException(); }
     */

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated not
     */
    @Override
    public abstract double getInitialCost(); /*
                                              * { // TODO: implement this method to return the
                                              * 'Initial Cost' attribute // Ensure that you remove
                                              * 
                                              * @generated or mark it @generated NOT throw new
                                              * UnsupportedOperationException(); }
                                              */

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case costPackage.COST__ANNOTATED_ELEMENT:
            if (resolve) {
                return this.getAnnotatedElement();
            }
            return this.basicGetAnnotatedElement();
        case costPackage.COST__TOTAL_COST:
            return this.getTotalCost();
        case costPackage.COST__OPERATING_COST:
            return this.getOperatingCost();
        case costPackage.COST__INITIAL_COST:
            return this.getInitialCost();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case costPackage.COST__ANNOTATED_ELEMENT:
            return this.isSetAnnotatedElement();
        case costPackage.COST__TOTAL_COST:
            return this.getTotalCost() != TOTAL_COST_EDEFAULT;
        case costPackage.COST__OPERATING_COST:
            return this.getOperatingCost() != OPERATING_COST_EDEFAULT;
        case costPackage.COST__INITIAL_COST:
            return this.getInitialCost() != INITIAL_COST_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // CostImpl
