/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.DescriptionImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.DescriptionImpl#getTextualDescription <em>
 * Textual Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class DescriptionImpl extends IdentifierImpl implements Description {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getTextualDescription() <em>Textual Description</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTextualDescription()
     * @generated
     * @ordered
     */
    protected static final String TEXTUAL_DESCRIPTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTextualDescription() <em>Textual Description</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTextualDescription()
     * @generated
     * @ordered
     */
    protected String textualDescription = TEXTUAL_DESCRIPTION_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetricSpecPackage.DESCRIPTION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getTextualDescription() {
        return textualDescription;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setTextualDescription(String newTextualDescription) {
        String oldTextualDescription = textualDescription;
        textualDescription = newTextualDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION,
                    oldTextualDescription, textualDescription));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.DESCRIPTION__NAME:
            return getName();
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            return getTextualDescription();
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
        case MetricSpecPackage.DESCRIPTION__NAME:
            setName((String) newValue);
            return;
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            setTextualDescription((String) newValue);
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
        case MetricSpecPackage.DESCRIPTION__NAME:
            setName(NAME_EDEFAULT);
            return;
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            setTextualDescription(TEXTUAL_DESCRIPTION_EDEFAULT);
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
        case MetricSpecPackage.DESCRIPTION__NAME:
            return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            return TEXTUAL_DESCRIPTION_EDEFAULT == null ? textualDescription != null : !TEXTUAL_DESCRIPTION_EDEFAULT
                    .equals(textualDescription);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", textualDescription: ");
        result.append(textualDescription);
        result.append(')');
        return result.toString();
    }

} // DescriptionImpl
