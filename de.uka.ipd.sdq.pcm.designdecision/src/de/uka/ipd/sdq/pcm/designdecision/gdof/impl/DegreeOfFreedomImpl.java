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
import genericdesigndecision.genericDoF.GenericDoFPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Degree Of Freedom</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getAddedElements <em>Added Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getChangeableElementDescriptions <em>Changeable Element Descriptions</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getInteractionConstraints <em>Interaction Constraints</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getPrimaryChangeable <em>Primary Changeable</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getPcmChangeableElementDescriptions <em>Pcm Changeable Element Descriptions</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.impl.DegreeOfFreedomImpl#getPcmPrimaryChangeable <em>Pcm Primary Changeable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DegreeOfFreedomImpl extends NamedElementImpl implements DegreeOfFreedom {
	/**
	 * The cached value of the '{@link #getAddedElements() <em>Added Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAddedElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> addedElements;

	/**
	 * The cached value of the '{@link #getChangeableElementDescriptions() <em>Changeable Element Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getChangeableElementDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<genericdesigndecision.genericDoF.ChangeableElementDescription> changeableElementDescriptions;

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
	 * The cached value of the '{@link #getPrimaryChangeable() <em>Primary Changeable</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrimaryChangeable()
	 * @generated
	 * @ordered
	 */
	protected genericdesigndecision.genericDoF.ChangeableElementDescription primaryChangeable;

	/**
	 * The cached value of the '{@link #getPcmChangeableElementDescriptions() <em>Pcm Changeable Element Descriptions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmChangeableElementDescriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeableElementDescription> pcmChangeableElementDescriptions;

	/**
	 * The cached value of the '{@link #getPcmPrimaryChangeable() <em>Pcm Primary Changeable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcmPrimaryChangeable()
	 * @generated
	 * @ordered
	 */
	protected ChangeableElementDescription pcmPrimaryChangeable;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeOfFreedomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return gdofPackage.Literals.DEGREE_OF_FREEDOM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EClass> getAddedElements() {
		if (addedElements == null) {
			addedElements = new EObjectResolvingEList<EClass>(EClass.class, this,
					gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS);
		}
		return addedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<genericdesigndecision.genericDoF.ChangeableElementDescription> getChangeableElementDescriptions() {
		if (changeableElementDescriptions == null) {
			changeableElementDescriptions = new EObjectContainmentEList<genericdesigndecision.genericDoF.ChangeableElementDescription>(
					genericdesigndecision.genericDoF.ChangeableElementDescription.class, this,
					gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS);
		}
		return changeableElementDescriptions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EOperation> getInteractionConstraints() {
		if (interactionConstraints == null) {
			interactionConstraints = new EObjectResolvingEList<EOperation>(EOperation.class, this,
					gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS);
		}
		return interactionConstraints;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public genericdesigndecision.genericDoF.ChangeableElementDescription getPrimaryChangeable() {
		if (primaryChangeable != null && primaryChangeable.eIsProxy()) {
			InternalEObject oldPrimaryChangeable = (InternalEObject) primaryChangeable;
			primaryChangeable = (genericdesigndecision.genericDoF.ChangeableElementDescription) eResolveProxy(
					oldPrimaryChangeable);
			if (primaryChangeable != oldPrimaryChangeable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE, oldPrimaryChangeable,
							primaryChangeable));
			}
		}
		return primaryChangeable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public genericdesigndecision.genericDoF.ChangeableElementDescription basicGetPrimaryChangeable() {
		return primaryChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryChangeable(
			genericdesigndecision.genericDoF.ChangeableElementDescription newPrimaryChangeable) {
		genericdesigndecision.genericDoF.ChangeableElementDescription oldPrimaryChangeable = primaryChangeable;
		primaryChangeable = newPrimaryChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE,
					oldPrimaryChangeable, primaryChangeable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChangeableElementDescription> getPcmChangeableElementDescriptions() {
		if (pcmChangeableElementDescriptions == null) {
			pcmChangeableElementDescriptions = new EObjectContainmentEList<ChangeableElementDescription>(
					ChangeableElementDescription.class, this,
					gdofPackage.DEGREE_OF_FREEDOM__PCM_CHANGEABLE_ELEMENT_DESCRIPTIONS);
		}
		return pcmChangeableElementDescriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeableElementDescription getPcmPrimaryChangeable() {
		if (pcmPrimaryChangeable != null && pcmPrimaryChangeable.eIsProxy()) {
			InternalEObject oldPcmPrimaryChangeable = (InternalEObject) pcmPrimaryChangeable;
			pcmPrimaryChangeable = (ChangeableElementDescription) eResolveProxy(oldPcmPrimaryChangeable);
			if (pcmPrimaryChangeable != oldPcmPrimaryChangeable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							gdofPackage.DEGREE_OF_FREEDOM__PCM_PRIMARY_CHANGEABLE, oldPcmPrimaryChangeable,
							pcmPrimaryChangeable));
			}
		}
		return pcmPrimaryChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeableElementDescription basicGetPcmPrimaryChangeable() {
		return pcmPrimaryChangeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPcmPrimaryChangeable(ChangeableElementDescription newPcmPrimaryChangeable) {
		ChangeableElementDescription oldPcmPrimaryChangeable = pcmPrimaryChangeable;
		pcmPrimaryChangeable = newPcmPrimaryChangeable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, gdofPackage.DEGREE_OF_FREEDOM__PCM_PRIMARY_CHANGEABLE,
					oldPcmPrimaryChangeable, pcmPrimaryChangeable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
			return ((InternalEList<?>) getChangeableElementDescriptions()).basicRemove(otherEnd, msgs);
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_CHANGEABLE_ELEMENT_DESCRIPTIONS:
			return ((InternalEList<?>) getPcmChangeableElementDescriptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
			return getAddedElements();
		case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
			return getChangeableElementDescriptions();
		case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
			return getInteractionConstraints();
		case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
			if (resolve)
				return getPrimaryChangeable();
			return basicGetPrimaryChangeable();
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_CHANGEABLE_ELEMENT_DESCRIPTIONS:
			return getPcmChangeableElementDescriptions();
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_PRIMARY_CHANGEABLE:
			if (resolve)
				return getPcmPrimaryChangeable();
			return basicGetPcmPrimaryChangeable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
			getAddedElements().clear();
			getAddedElements().addAll((Collection<? extends EClass>) newValue);
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
			getChangeableElementDescriptions().clear();
			getChangeableElementDescriptions().addAll(
					(Collection<? extends genericdesigndecision.genericDoF.ChangeableElementDescription>) newValue);
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
			getInteractionConstraints().clear();
			getInteractionConstraints().addAll((Collection<? extends EOperation>) newValue);
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
			setPrimaryChangeable((genericdesigndecision.genericDoF.ChangeableElementDescription) newValue);
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_CHANGEABLE_ELEMENT_DESCRIPTIONS:
			getPcmChangeableElementDescriptions().clear();
			getPcmChangeableElementDescriptions().addAll((Collection<? extends ChangeableElementDescription>) newValue);
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_PRIMARY_CHANGEABLE:
			setPcmPrimaryChangeable((ChangeableElementDescription) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
			getAddedElements().clear();
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
			getChangeableElementDescriptions().clear();
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
			getInteractionConstraints().clear();
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
			setPrimaryChangeable((genericdesigndecision.genericDoF.ChangeableElementDescription) null);
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_CHANGEABLE_ELEMENT_DESCRIPTIONS:
			getPcmChangeableElementDescriptions().clear();
			return;
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_PRIMARY_CHANGEABLE:
			setPcmPrimaryChangeable((ChangeableElementDescription) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
			return addedElements != null && !addedElements.isEmpty();
		case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
			return changeableElementDescriptions != null && !changeableElementDescriptions.isEmpty();
		case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
			return interactionConstraints != null && !interactionConstraints.isEmpty();
		case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
			return primaryChangeable != null;
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_CHANGEABLE_ELEMENT_DESCRIPTIONS:
			return pcmChangeableElementDescriptions != null && !pcmChangeableElementDescriptions.isEmpty();
		case gdofPackage.DEGREE_OF_FREEDOM__PCM_PRIMARY_CHANGEABLE:
			return pcmPrimaryChangeable != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.genericDoF.DegreeOfFreedom.class) {
			switch (derivedFeatureID) {
			case gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
				return GenericDoFPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS;
			case gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
				return GenericDoFPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS;
			case gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
				return GenericDoFPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS;
			case gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
				return GenericDoFPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == genericdesigndecision.genericDoF.DegreeOfFreedom.class) {
			switch (baseFeatureID) {
			case GenericDoFPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS:
				return gdofPackage.DEGREE_OF_FREEDOM__ADDED_ELEMENTS;
			case GenericDoFPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS:
				return gdofPackage.DEGREE_OF_FREEDOM__CHANGEABLE_ELEMENT_DESCRIPTIONS;
			case GenericDoFPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS:
				return gdofPackage.DEGREE_OF_FREEDOM__INTERACTION_CONSTRAINTS;
			case GenericDoFPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE:
				return gdofPackage.DEGREE_OF_FREEDOM__PRIMARY_CHANGEABLE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // DegreeOfFreedomImpl
