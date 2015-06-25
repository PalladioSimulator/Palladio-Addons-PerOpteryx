/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Degree Of Freedom Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getPrimaryChanged
 * <em>Primary Changed</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getDof <em>Dof
 * </em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getChangeableElements
 * <em>Changeable Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DegreeOfFreedomInstanceImpl extends NamedElementImpl implements
DegreeOfFreedomInstance {
    /**
     * The cached value of the '{@link #getPrimaryChanged() <em>Primary Changed</em>}' reference.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPrimaryChanged()
     * @generated
     * @ordered
     */
    protected EObject primaryChanged;

    /**
     * The cached value of the '{@link #getDof() <em>Dof</em>}' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @see #getDof()
     * @generated
     * @ordered
     */
    protected DegreeOfFreedom dof;

    /**
     * The cached value of the '{@link #getChangeableElements() <em>Changeable Elements</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getChangeableElements()
     * @generated
     * @ordered
     */
    protected EList<EObject> changeableElements;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DegreeOfFreedomInstanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return designdecisionPackage.Literals.DEGREE_OF_FREEDOM_INSTANCE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EObject getPrimaryChanged() {
        if (this.primaryChanged != null && this.primaryChanged.eIsProxy())
        {
            final InternalEObject oldPrimaryChanged = (InternalEObject) this.primaryChanged;
            this.primaryChanged = this.eResolveProxy(oldPrimaryChanged);
            if (this.primaryChanged != oldPrimaryChanged)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED, oldPrimaryChanged,
                            this.primaryChanged));
                }
            }
        }
        return this.primaryChanged;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public EObject basicGetPrimaryChanged() {
        return this.primaryChanged;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPrimaryChanged(final EObject newPrimaryChanged) {
        final EObject oldPrimaryChanged = this.primaryChanged;
        this.primaryChanged = newPrimaryChanged;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED, oldPrimaryChanged,
                    this.primaryChanged));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DegreeOfFreedom getDof() {
        if (this.dof != null && this.dof.eIsProxy())
        {
            final InternalEObject oldDof = (InternalEObject) this.dof;
            this.dof = (DegreeOfFreedom) this.eResolveProxy(oldDof);
            if (this.dof != oldDof)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF, oldDof, this.dof));
                }
            }
        }
        return this.dof;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public DegreeOfFreedom basicGetDof() {
        return this.dof;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDof(final DegreeOfFreedom newDof) {
        final DegreeOfFreedom oldDof = this.dof;
        this.dof = newDof;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF, oldDof, this.dof));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EObject> getChangeableElements() {
        if (this.changeableElements == null)
        {
            this.changeableElements = new EObjectResolvingEList<EObject>(EObject.class, this,
                    designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS);
        }
        return this.changeableElements;
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
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
            if (resolve) {
                return this.getPrimaryChanged();
            }
            return this.basicGetPrimaryChanged();
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
            if (resolve) {
                return this.getDof();
            }
            return this.basicGetDof();
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
            return this.getChangeableElements();
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
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
            this.setPrimaryChanged((EObject) newValue);
            return;
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
            this.setDof((DegreeOfFreedom) newValue);
            return;
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
            this.getChangeableElements().clear();
            this.getChangeableElements().addAll((Collection<? extends EObject>) newValue);
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
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
            this.setPrimaryChanged((EObject) null);
            return;
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
            this.setDof((DegreeOfFreedom) null);
            return;
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
            this.getChangeableElements().clear();
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
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
            return this.primaryChanged != null;
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
            return this.dof != null;
        case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
            return this.changeableElements != null && !this.changeableElements.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DegreeOfFreedomInstanceImpl
