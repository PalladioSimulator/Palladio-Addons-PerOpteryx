/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Identifier</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.IdentifierImpl#getLiteral <em>Literal</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.IdentifierImpl#getTextualBaseMetricDescription
 * <em>Textual Base Metric Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IdentifierImpl extends de.uka.ipd.sdq.identifier.impl.IdentifierImpl implements Identifier {
    /**
     * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLiteral()
     * @generated
     * @ordered
     */
    protected static final String LITERAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getLiteral()
     * @generated
     * @ordered
     */
    protected String literal = LITERAL_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected IdentifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.IDENTIFIER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getLiteral() {
        return literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setLiteral(String newLiteral) {
        String oldLiteral = literal;
        literal = newLiteral;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetricSpecPackage.IDENTIFIER__LITERAL, oldLiteral,
                    literal));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public TextualBaseMetricDescription getTextualBaseMetricDescription() {
        if (eContainerFeatureID() != MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION)
            return null;
        return (TextualBaseMetricDescription) eInternalContainer();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public NotificationChain basicSetTextualBaseMetricDescription(
            TextualBaseMetricDescription newTextualBaseMetricDescription, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject) newTextualBaseMetricDescription,
                MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTextualBaseMetricDescription(TextualBaseMetricDescription newTextualBaseMetricDescription) {
        if (newTextualBaseMetricDescription != eInternalContainer()
                || (eContainerFeatureID() != MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION && newTextualBaseMetricDescription != null)) {
            if (EcoreUtil.isAncestor(this, newTextualBaseMetricDescription))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newTextualBaseMetricDescription != null)
                msgs = ((InternalEObject) newTextualBaseMetricDescription).eInverseAdd(this,
                        MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS,
                        TextualBaseMetricDescription.class, msgs);
            msgs = basicSetTextualBaseMetricDescription(newTextualBaseMetricDescription, msgs);
            if (msgs != null)
                msgs.dispatch();
        } else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION, newTextualBaseMetricDescription,
                    newTextualBaseMetricDescription));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            return basicSetTextualBaseMetricDescription((TextualBaseMetricDescription) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return basicSetTextualBaseMetricDescription(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return eInternalContainer().eInverseRemove(this,
                    MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS, TextualBaseMetricDescription.class,
                    msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            return getLiteral();
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return getTextualBaseMetricDescription();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            setLiteral((String) newValue);
            return;
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            setTextualBaseMetricDescription((TextualBaseMetricDescription) newValue);
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
    public void eUnset(int featureID) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            setLiteral(LITERAL_EDEFAULT);
            return;
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            setTextualBaseMetricDescription((TextualBaseMetricDescription) null);
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
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return getTextualBaseMetricDescription() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (literal: ");
        result.append(literal);
        result.append(')');
        return result.toString();
    }

} // IdentifierImpl
