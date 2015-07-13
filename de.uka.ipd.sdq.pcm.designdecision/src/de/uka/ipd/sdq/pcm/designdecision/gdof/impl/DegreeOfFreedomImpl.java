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
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.uka.ipd.sdq.featuremodel.impl.NamedElementImpl;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Degree Of Freedom</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getAddedElements <em>
 * Added Elements</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getChangeableElementDescriptions
 * <em>Changeable Element Descriptions</em>}</li>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getInteractionConstraints
 * <em>Interaction Constraints</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getPrimaryChangeable
 * <em>Primary Changeable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DegreeOfFreedomImpl extends NamedElementImpl implements DegreeOfFreedom {
    /**
     * The cached value of the '{@link #getAddedElements() <em>Added Elements</em>}' reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getAddedElements()
     * @generated
     * @ordered
     */
    protected EList<EClass> addedElements;

    /**
     * The cached value of the '{@link #getChangeableElementDescriptions()
     * <em>Changeable Element Descriptions</em>}' containment reference list. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getChangeableElementDescriptions()
     * @generated
     * @ordered
     */
    protected EList<ChangeableElementDescription> changeableElementDescriptions;

    /**
     * The cached value of the '{@link #getInteractionConstraints()
     * <em>Interaction Constraints</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @see #getInteractionConstraints()
     * @generated
     * @ordered
     */
    protected EList<EOperation> interactionConstraints;

    /**
     * The cached value of the '{@link #getPrimaryChangeable() <em>Primary Changeable</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPrimaryChangeable()
     * @generated
     * @ordered
     */
    protected ChangeableElementDescription primaryChangeable;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DegreeOfFreedomImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return gdofPackage.Literals.DEGREE_OF_FREEDOM;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EClass> getAddedElements() {
        if (this.addedElements == null)
        {
            this.addedElements = new EObjectResolvingEList<EClass>(EClass.class, this,
                    gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS);
        }
        return this.addedElements;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<ChangeableElementDescription> getChangeableElementDescriptions() {
        if (this.changeableElementDescriptions == null)
        {
            this.changeableElementDescriptions = new EObjectContainmentEList<ChangeableElementDescription>(
                    ChangeableElementDescription.class, this,
                    gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS);
        }
        return this.changeableElementDescriptions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EOperation> getInteractionConstraints() {
        if (this.interactionConstraints == null)
        {
            this.interactionConstraints = new EObjectResolvingEList<EOperation>(EOperation.class, this,
                    gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS);
        }
        return this.interactionConstraints;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ChangeableElementDescription getPrimaryChangeable() {
        if (this.primaryChangeable != null && this.primaryChangeable.eIsProxy())
        {
            final InternalEObject oldPrimaryChangeable = (InternalEObject) this.primaryChangeable;
            this.primaryChangeable = (ChangeableElementDescription) this.eResolveProxy(oldPrimaryChangeable);
            if (this.primaryChangeable != oldPrimaryChangeable)
            {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE, oldPrimaryChangeable,
                            this.primaryChangeable));
                }
            }
        }
        return this.primaryChangeable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public ChangeableElementDescription basicGetPrimaryChangeable() {
        return this.primaryChangeable;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPrimaryChangeable(final ChangeableElementDescription newPrimaryChangeable) {
        final ChangeableElementDescription oldPrimaryChangeable = this.primaryChangeable;
        this.primaryChangeable = newPrimaryChangeable;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE,
                    oldPrimaryChangeable, this.primaryChangeable));
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
        case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
            return ((InternalEList<?>) this.getChangeableElementDescriptions()).basicRemove(otherEnd, msgs);
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
        case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
            return this.getAddedElements();
        case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
            return this.getChangeableElementDescriptions();
        case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
            return this.getInteractionConstraints();
        case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
            if (resolve) {
                return this.getPrimaryChangeable();
            }
            return this.basicGetPrimaryChangeable();
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
        case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
            this.getAddedElements().clear();
            this.getAddedElements().addAll((Collection<? extends EClass>) newValue);
            return;
        case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
            this.getChangeableElementDescriptions().clear();
            this.getChangeableElementDescriptions().addAll(
                    (Collection<? extends ChangeableElementDescription>) newValue);
            return;
        case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
            this.getInteractionConstraints().clear();
            this.getInteractionConstraints().addAll((Collection<? extends EOperation>) newValue);
            return;
        case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
            this.setPrimaryChangeable((ChangeableElementDescription) newValue);
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
        case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
            this.getAddedElements().clear();
            return;
        case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
            this.getChangeableElementDescriptions().clear();
            return;
        case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
            this.getInteractionConstraints().clear();
            return;
        case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
            this.setPrimaryChangeable((ChangeableElementDescription) null);
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
        case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
            return this.addedElements != null && !this.addedElements.isEmpty();
        case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
            return this.changeableElementDescriptions != null && !this.changeableElementDescriptions.isEmpty();
        case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
            return this.interactionConstraints != null && !this.interactionConstraints.isEmpty();
        case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
            return this.primaryChangeable != null;
        }
        return super.eIsSet(featureID);
    }

} // DegreeOfFreedomImpl
