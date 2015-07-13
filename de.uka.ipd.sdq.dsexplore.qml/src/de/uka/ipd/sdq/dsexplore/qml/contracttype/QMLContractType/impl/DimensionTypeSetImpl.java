/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeSet;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util.QMLContractTypeValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Dimension Type Set</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeSetImpl#getElements
 * <em>Elements</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeSetImpl#getOrder
 * <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionTypeSetImpl extends DimensionTypeImpl implements DimensionTypeSet {
    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<Element> elements;

    /**
     * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getOrder()
     * @generated
     * @ordered
     */
    protected EList<Order> order;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DimensionTypeSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.DIMENSION_TYPE_SET;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Element> getElements() {
        if (this.elements == null)
        {
            this.elements = new EObjectContainmentEList<Element>(Element.class, this,
                    QMLContractTypePackage.DIMENSION_TYPE_SET__ELEMENTS);
        }
        return this.elements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Order> getOrder() {
        if (this.order == null)
        {
            this.order = new EObjectContainmentEList<Order>(Order.class, this,
                    QMLContractTypePackage.DIMENSION_TYPE_SET__ORDER);
        }
        return this.order;
    }

    /**
     * The cached OCL expression body for the '
     * {@link #ORDER_can_only_exist_with_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>ORDER can only exist with RELATIONSEMANTICS</em>}' operation. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #ORDER_can_only_exist_with_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.relationSemantics=null implies self.order->size()=0";

    /**
     * The cached OCL invariant for the '
     * {@link #ORDER_can_only_exist_with_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>ORDER can only exist with RELATIONSEMANTICS</em>}' invariant operation. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #ORDER_can_only_exist_with_RELATIONSEMANTICS(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean ORDER_can_only_exist_with_RELATIONSEMANTICS(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractTypePackage.Literals.DIMENSION_TYPE_SET);
            try
            {
                ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
                this))
        {
            if (diagnostics != null)
            {
                diagnostics
                .add
                (new BasicDiagnostic
                        (
                                Diagnostic.ERROR,
                                QMLContractTypeValidator.DIAGNOSTIC_SOURCE,
                                QMLContractTypeValidator.DIMENSION_TYPE_SET__ORDER_CAN_ONLY_EXIST_WITH_RELATIONSEMANTICS,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "ORDER_can_only_exist_with_RELATIONSEMANTICS",
                                                EObjectValidator.getObjectLabel(this, context) }),
                                                new Object[] { this }));
            }
            return false;
        }
        return true;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ELEMENTS:
            return ((InternalEList<?>) this.getElements()).basicRemove(otherEnd, msgs);
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ORDER:
            return ((InternalEList<?>) this.getOrder()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ELEMENTS:
            return this.getElements();
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ORDER:
            return this.getOrder();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ELEMENTS:
            this.getElements().clear();
            this.getElements().addAll((Collection<? extends Element>) newValue);
            return;
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ORDER:
            this.getOrder().clear();
            this.getOrder().addAll((Collection<? extends Order>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ELEMENTS:
            this.getElements().clear();
            return;
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ORDER:
            this.getOrder().clear();
            return;
        }
        super.eUnset(featureID);
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
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ELEMENTS:
            return this.elements != null && !this.elements.isEmpty();
        case QMLContractTypePackage.DIMENSION_TYPE_SET__ORDER:
            return this.order != null && !this.order.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * The cached environment for evaluating OCL expressions. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    protected static final OCL EOCL_ENV = OCL.newInstance();

} // DimensionTypeSetImpl
