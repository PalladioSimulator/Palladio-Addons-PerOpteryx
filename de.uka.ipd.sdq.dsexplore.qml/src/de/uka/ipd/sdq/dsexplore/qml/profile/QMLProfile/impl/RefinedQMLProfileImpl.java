/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.GenericQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.util.QMLProfileValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Refined QML Profile</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.RefinedQMLProfileImpl#getBaseProfile
 * <em>Base Profile</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.impl.RefinedQMLProfileImpl#getRefinedBy
 * <em>Refined By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefinedQMLProfileImpl extends GenericQMLProfileImpl implements RefinedQMLProfile {
    /**
     * The cached value of the '{@link #getBaseProfile() <em>Base Profile</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getBaseProfile()
     * @generated
     * @ordered
     */
    protected GenericQMLProfile baseProfile;

    /**
     * The cached value of the '{@link #getRefinedBy() <em>Refined By</em>}' containment reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getRefinedBy()
     * @generated
     * @ordered
     */
    protected EList<Requirement> refinedBy;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected RefinedQMLProfileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLProfilePackage.Literals.REFINED_QML_PROFILE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public GenericQMLProfile getBaseProfile() {
        if (this.baseProfile != null && this.baseProfile.eIsProxy())
        {
            final InternalEObject oldBaseProfile = (InternalEObject) this.baseProfile;
            this.baseProfile = (GenericQMLProfile) this.eResolveProxy(oldBaseProfile);
            if (this.baseProfile != oldBaseProfile)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            QMLProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE, oldBaseProfile, this.baseProfile));
                }
            }
        }
        return this.baseProfile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public GenericQMLProfile basicGetBaseProfile() {
        return this.baseProfile;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setBaseProfile(final GenericQMLProfile newBaseProfile) {
        final GenericQMLProfile oldBaseProfile = this.baseProfile;
        this.baseProfile = newBaseProfile;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    QMLProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE,
                    oldBaseProfile, this.baseProfile));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Requirement> getRefinedBy() {
        if (this.refinedBy == null)
        {
            this.refinedBy = new EObjectContainmentEList<Requirement>(Requirement.class, this,
                    QMLProfilePackage.REFINED_QML_PROFILE__REFINED_BY);
        }
        return this.refinedBy;
    }

    /**
     * The cached OCL expression body for the '
     * {@link #profile_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Profile cannot refine itself</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #profile_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static final String PROFILE_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.baseProfile <> self";

    /**
     * The cached OCL invariant for the '
     * {@link #profile_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
     * <em>Profile cannot refine itself</em>}' invariant operation. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @see #profile_cannot_refine_itself(org.eclipse.emf.common.util.DiagnosticChain,
     *      java.util.Map)
     * @generated
     * @ordered
     */
    protected static Constraint PROFILE_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean profile_cannot_refine_itself(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
        if (PROFILE_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
        {
            final OCL.Helper helper = EOCL_ENV.createOCLHelper();
            helper.setContext(QMLProfilePackage.Literals.REFINED_QML_PROFILE);
            try
            {
                PROFILE_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper
                        .createInvariant(PROFILE_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
            } catch (final ParserException pe)
            {
                throw new UnsupportedOperationException(pe.getLocalizedMessage());
            }
        }
        if (!EOCL_ENV.createQuery(PROFILE_CANNOT_REFINE_ITSELF__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this))
        {
            if (diagnostics != null)
            {
                diagnostics.add
                (new BasicDiagnostic
                        (Diagnostic.ERROR,
                                QMLProfileValidator.DIAGNOSTIC_SOURCE,
                                QMLProfileValidator.REFINED_QML_PROFILE__PROFILE_CANNOT_REFINE_ITSELF,
                                EcorePlugin.INSTANCE.getString(
                                        "_UI_GenericInvariant_diagnostic",
                                        new Object[] { "profile_cannot_refine_itself",
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
        case QMLProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
            return ((InternalEList<?>) this.getRefinedBy()).basicRemove(otherEnd, msgs);
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
        case QMLProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
            if (resolve) {
                return this.getBaseProfile();
            }
            return this.basicGetBaseProfile();
        case QMLProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
            return this.getRefinedBy();
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
        case QMLProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
            this.setBaseProfile((GenericQMLProfile) newValue);
            return;
        case QMLProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
            this.getRefinedBy().clear();
            this.getRefinedBy().addAll((Collection<? extends Requirement>) newValue);
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
        case QMLProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
            this.setBaseProfile((GenericQMLProfile) null);
            return;
        case QMLProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
            this.getRefinedBy().clear();
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
        case QMLProfilePackage.REFINED_QML_PROFILE__BASE_PROFILE:
            return this.baseProfile != null;
        case QMLProfilePackage.REFINED_QML_PROFILE__REFINED_BY:
            return this.refinedBy != null && !this.refinedBy.isEmpty();
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

} // RefinedQMLProfileImpl
