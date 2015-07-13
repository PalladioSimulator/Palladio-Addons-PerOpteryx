/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Element;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Order;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.util.QMLContractTypeValidator;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Order</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.OrderImpl#getBiggerElement
 * <em>Bigger Element</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.OrderImpl#getSmallerElement
 * <em>Smaller Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrderImpl extends IdentifierImpl implements Order {
    /**
     * The cached value of the '{@link #getBiggerElement() <em>Bigger Element</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBiggerElement()
     * @generated
     * @ordered
     */
    protected Element biggerElement;

    /**
     * The cached value of the '{@link #getSmallerElement() <em>Smaller Element</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSmallerElement()
     * @generated
     * @ordered
     */
    protected Element smallerElement;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OrderImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.ORDER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Element getBiggerElement() {
        if (this.biggerElement != null && this.biggerElement.eIsProxy())
        {
            final InternalEObject oldBiggerElement = (InternalEObject) this.biggerElement;
            this.biggerElement = (Element) this.eResolveProxy(oldBiggerElement);
            if (this.biggerElement != oldBiggerElement)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLContractTypePackage.ORDER__BIGGER_ELEMENT, oldBiggerElement, this.biggerElement));
                }
            }
        }
        return this.biggerElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Element basicGetBiggerElement() {
        return this.biggerElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBiggerElement(final Element newBiggerElement) {
        final Element oldBiggerElement = this.biggerElement;
        this.biggerElement = newBiggerElement;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.ORDER__BIGGER_ELEMENT,
                    oldBiggerElement, this.biggerElement));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Element getSmallerElement() {
        if (this.smallerElement != null && this.smallerElement.eIsProxy())
        {
            final InternalEObject oldSmallerElement = (InternalEObject) this.smallerElement;
            this.smallerElement = (Element) this.eResolveProxy(oldSmallerElement);
            if (this.smallerElement != oldSmallerElement)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLContractTypePackage.ORDER__SMALLER_ELEMENT, oldSmallerElement, this.smallerElement));
                }
            }
        }
        return this.smallerElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Element basicGetSmallerElement() {
        return this.smallerElement;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSmallerElement(final Element newSmallerElement) {
        final Element oldSmallerElement = this.smallerElement;
        this.smallerElement = newSmallerElement;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, QMLContractTypePackage.ORDER__SMALLER_ELEMENT,
                    oldSmallerElement, this.smallerElement));
        }
    }

    /**
     * The cached OCL expression body for the '
     * {@link #BIGGERELEMENT_must_not_be_SMALLELEMENT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>BIGGERELEMENT must not be SMALLELEMENT</em>}' operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #BIGGERELEMENT_must_not_be_SMALLELEMENT(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.biggerElement<>self.smallerElement";

    /**
     * The cached OCL invariant for the '
     * {@link #BIGGERELEMENT_must_not_be_SMALLELEMENT(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>BIGGERELEMENT must not be SMALLELEMENT</em>}' invariant operation. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #BIGGERELEMENT_must_not_be_SMALLELEMENT(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean BIGGERELEMENT_must_not_be_SMALLELEMENT(final DiagnosticChain diagnostics,
            final Map<Object, Object> context) {
        if (BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLContractTypePackage.Literals.ORDER);
            try
            {
                BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLContractTypeValidator.DIAGNOSTIC_SOURCE,
                                QMLContractTypeValidator.ORDER__BIGGERELEMENT_MUST_NOT_BE_SMALLELEMENT,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "BIGGERELEMENT_must_not_be_SMALLELEMENT",
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
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case QMLContractTypePackage.ORDER__BIGGER_ELEMENT:
            if (resolve) {
                return this.getBiggerElement();
            }
            return this.basicGetBiggerElement();
        case QMLContractTypePackage.ORDER__SMALLER_ELEMENT:
            if (resolve) {
                return this.getSmallerElement();
            }
            return this.basicGetSmallerElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case QMLContractTypePackage.ORDER__BIGGER_ELEMENT:
            this.setBiggerElement((Element) newValue);
            return;
        case QMLContractTypePackage.ORDER__SMALLER_ELEMENT:
            this.setSmallerElement((Element) newValue);
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
        case QMLContractTypePackage.ORDER__BIGGER_ELEMENT:
            this.setBiggerElement((Element) null);
            return;
        case QMLContractTypePackage.ORDER__SMALLER_ELEMENT:
            this.setSmallerElement((Element) null);
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
        case QMLContractTypePackage.ORDER__BIGGER_ELEMENT:
            return this.biggerElement != null;
        case QMLContractTypePackage.ORDER__SMALLER_ELEMENT:
            return this.smallerElement != null;
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

} // OrderImpl
