/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.EnumRelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.RelationSemantics;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Relation Semantics</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.RelationSemanticsImpl#getRelSem
 * <em>Rel Sem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationSemanticsImpl extends IdentifierImpl implements RelationSemantics {
    /**
     * The default value of the '{@link #getRelSem() <em>Rel Sem</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRelSem()
     * @generated
     * @ordered
     */
    protected static final EnumRelationSemantics REL_SEM_EDEFAULT = EnumRelationSemantics.DECREASING;

    /**
     * The cached value of the '{@link #getRelSem() <em>Rel Sem</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRelSem()
     * @generated
     * @ordered
     */
    protected EnumRelationSemantics relSem = REL_SEM_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RelationSemanticsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.RELATION_SEMANTICS;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EnumRelationSemantics getRelSem() {
        return this.relSem;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRelSem(final EnumRelationSemantics newRelSem) {
        final EnumRelationSemantics oldRelSem = this.relSem;
        this.relSem = newRelSem == null ? REL_SEM_EDEFAULT : newRelSem;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLContractTypePackage.RELATION_SEMANTICS__REL_SEM,
                    oldRelSem, this.relSem));
        }
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
        case QMLContractTypePackage.RELATION_SEMANTICS__REL_SEM:
            return this.getRelSem();
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
        case QMLContractTypePackage.RELATION_SEMANTICS__REL_SEM:
            this.setRelSem((EnumRelationSemantics) newValue);
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
        case QMLContractTypePackage.RELATION_SEMANTICS__REL_SEM:
            this.setRelSem(REL_SEM_EDEFAULT);
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
        case QMLContractTypePackage.RELATION_SEMANTICS__REL_SEM:
            return this.relSem != REL_SEM_EDEFAULT;
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
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (relSem: ");
        result.append(this.relSem);
        result.append(')');
        return result.toString();
    }

} // RelationSemanticsImpl
