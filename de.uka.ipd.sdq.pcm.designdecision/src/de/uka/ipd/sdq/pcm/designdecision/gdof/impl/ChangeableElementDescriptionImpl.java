/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Changeable Element Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getChangeable
 * <em>Changeable</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getValueRule
 * <em>Value Rule</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.ChangeableElementDescriptionImpl#getSelectionRule
 * <em>Selection Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChangeableElementDescriptionImpl extends NamedElementImpl implements ChangeableElementDescription {
    /**
     * The cached value of the '{@link #getChangeable() <em>Changeable</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getChangeable()
     * @generated
     * @ordered
     */
    protected EStructuralFeature changeable;

    /**
     * The cached value of the '{@link #getValueRule() <em>Value Rule</em>}' containment reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getValueRule()
     * @generated
     * @ordered
     */
    protected ValueRule valueRule;

    /**
     * The cached value of the '{@link #getSelectionRule() <em>Selection Rule</em>}' containment
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getSelectionRule()
     * @generated
     * @ordered
     */
    protected SelectionRule selectionRule;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ChangeableElementDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return gdofPackage.Literals.CHANGEABLE_ELEMENT_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EStructuralFeature getChangeable() {
        if (this.changeable != null && this.changeable.eIsProxy())
        {
            final InternalEObject oldChangeable = (InternalEObject) this.changeable;
            this.changeable = (EStructuralFeature) this.eResolveProxy(oldChangeable);
            if (this.changeable != oldChangeable)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE, oldChangeable, this.changeable));
                }
            }
        }
        return this.changeable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EStructuralFeature basicGetChangeable() {
        return this.changeable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setChangeable(final EStructuralFeature newChangeable) {
        final EStructuralFeature oldChangeable = this.changeable;
        this.changeable = newChangeable;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE, oldChangeable, this.changeable));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ValueRule getValueRule() {
        return this.valueRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetValueRule(final ValueRule newValueRule, NotificationChain msgs) {
        final ValueRule oldValueRule = this.valueRule;
        this.valueRule = newValueRule;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, oldValueRule, newValueRule);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setValueRule(final ValueRule newValueRule) {
        if (newValueRule != this.valueRule)
        {
            NotificationChain msgs = null;
            if (this.valueRule != null) {
                msgs = ((InternalEObject) this.valueRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, null, msgs);
            }
            if (newValueRule != null) {
                msgs = ((InternalEObject) newValueRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, null, msgs);
            }
            msgs = this.basicSetValueRule(newValueRule, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE, newValueRule, newValueRule));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public SelectionRule getSelectionRule() {
        return this.selectionRule;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetSelectionRule(final SelectionRule newSelectionRule, NotificationChain msgs) {
        final SelectionRule oldSelectionRule = this.selectionRule;
        this.selectionRule = newSelectionRule;
        if (this.eNotificationRequired())
        {
            final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
                    gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, oldSelectionRule, newSelectionRule);
            if (msgs == null) {
                msgs = notification;
            } else {
                msgs.add(notification);
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setSelectionRule(final SelectionRule newSelectionRule) {
        if (newSelectionRule != this.selectionRule)
        {
            NotificationChain msgs = null;
            if (this.selectionRule != null) {
                msgs = ((InternalEObject) this.selectionRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
                        - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, null, msgs);
            }
            if (newSelectionRule != null) {
                msgs = ((InternalEObject) newSelectionRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
                        - gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, null, msgs);
            }
            msgs = this.basicSetSelectionRule(newSelectionRule, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        }
        else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE, newSelectionRule, newSelectionRule));
        }
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
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
            return this.basicSetValueRule(null, msgs);
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
            return this.basicSetSelectionRule(null, msgs);
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
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
            if (resolve) {
                return this.getChangeable();
            }
            return this.basicGetChangeable();
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
            return this.getValueRule();
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
            return this.getSelectionRule();
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
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
            this.setChangeable((EStructuralFeature) newValue);
            return;
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
            this.setValueRule((ValueRule) newValue);
            return;
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
            this.setSelectionRule((SelectionRule) newValue);
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
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
            this.setChangeable((EStructuralFeature) null);
            return;
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
            this.setValueRule((ValueRule) null);
            return;
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
            this.setSelectionRule((SelectionRule) null);
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
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__CHANGEABLE:
            return this.changeable != null;
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__VALUE_RULE:
            return this.valueRule != null;
        case gdofPackage.CHANGEABLE_ELEMENT_DESCRIPTION__SELECTION_RULE:
            return this.selectionRule != null;
        }
        return super.eIsSet(featureID);
    }

} // ChangeableElementDescriptionImpl
