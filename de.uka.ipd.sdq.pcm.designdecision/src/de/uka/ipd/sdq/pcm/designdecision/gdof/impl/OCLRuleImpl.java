/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>OCL Rule</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.OCLRuleImpl#getMainOclQuery
 * <em>Main Ocl Query</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.OCLRuleImpl#getHelperDefinition
 * <em>Helper Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OCLRuleImpl extends EObjectImpl implements OCLRule {
    /**
     * The default value of the '{@link #getMainOclQuery() <em>Main Ocl Query</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMainOclQuery()
     * @generated
     * @ordered
     */
    protected static final String MAIN_OCL_QUERY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMainOclQuery() <em>Main Ocl Query</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getMainOclQuery()
     * @generated
     * @ordered
     */
    protected String mainOclQuery = MAIN_OCL_QUERY_EDEFAULT;

    /**
     * The cached value of the '{@link #getHelperDefinition() <em>Helper Definition</em>}'
     * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getHelperDefinition()
     * @generated
     * @ordered
     */
    protected EList<HelperOCLDefinition> helperDefinition;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected OCLRuleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return gdofPackage.Literals.OCL_RULE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getMainOclQuery() {
        return this.mainOclQuery;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setMainOclQuery(final String newMainOclQuery) {
        final String oldMainOclQuery = this.mainOclQuery;
        this.mainOclQuery = newMainOclQuery;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.OCL_RULE__MAIN_OCL_QUERY,
                    oldMainOclQuery, this.mainOclQuery));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<HelperOCLDefinition> getHelperDefinition() {
        if (this.helperDefinition == null) {
            this.helperDefinition = new EObjectContainmentEList<HelperOCLDefinition>(HelperOCLDefinition.class, this,
                    gdofPackage.OCL_RULE__HELPER_DEFINITION);
        }
        return this.helperDefinition;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case gdofPackage.OCL_RULE__HELPER_DEFINITION:
            return ((InternalEList<?>) this.getHelperDefinition()).basicRemove(otherEnd, msgs);
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
        switch (featureID) {
        case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
            return this.getMainOclQuery();
        case gdofPackage.OCL_RULE__HELPER_DEFINITION:
            return this.getHelperDefinition();
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
        switch (featureID) {
        case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
            this.setMainOclQuery((String) newValue);
            return;
        case gdofPackage.OCL_RULE__HELPER_DEFINITION:
            this.getHelperDefinition().clear();
            this.getHelperDefinition().addAll((Collection<? extends HelperOCLDefinition>) newValue);
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
        switch (featureID) {
        case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
            this.setMainOclQuery(MAIN_OCL_QUERY_EDEFAULT);
            return;
        case gdofPackage.OCL_RULE__HELPER_DEFINITION:
            this.getHelperDefinition().clear();
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
        switch (featureID) {
        case gdofPackage.OCL_RULE__MAIN_OCL_QUERY:
            return MAIN_OCL_QUERY_EDEFAULT == null ? this.mainOclQuery != null
                    : !MAIN_OCL_QUERY_EDEFAULT.equals(this.mainOclQuery);
        case gdofPackage.OCL_RULE__HELPER_DEFINITION:
            return this.helperDefinition != null && !this.helperDefinition.isEmpty();
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
        result.append(" (mainOclQuery: ");
        result.append(this.mainOclQuery);
        result.append(')');
        return result.toString();
    }

} // OCLRuleImpl
