/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.resourceenvironment.ProcessingResourceSpecification;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;
import org.palladiosimulator.pcm.resourcetype.SchedulingPolicy;

import de.uka.ipd.sdq.dsexplore.exception.ChoiceOutOfBoundsException;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.SchedulingPolicyDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.ClassChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.AClassAsReferenceDegreeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Scheduling Policy Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl.SchedulingPolicyDegreeImpl#getProcessingresourcetype <em>Processingresourcetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchedulingPolicyDegreeImpl extends AClassAsReferenceDegreeImpl implements SchedulingPolicyDegree {
	/**
	 * The cached value of the '{@link #getProcessingresourcetype() <em>Processingresourcetype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingresourcetype()
	 * @generated
	 * @ordered
	 */
	protected ProcessingResourceType processingresourcetype;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SchedulingPolicyDegreeImpl() {
		super();
	}

	@Override
	public String getDegreeDescription() {
		String primaryChangeableName = this.getPrimaryChanged().toString();
		if (this.getPrimaryChanged() instanceof Entity) {
			primaryChangeableName = ((Entity) this.getPrimaryChanged()).getEntityName();
		}

		return this.getClass().getSimpleName() + ":" + primaryChangeableName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.SCHEDULING_POLICY_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessingResourceType getProcessingresourcetype() {
		if (processingresourcetype != null && ((EObject) processingresourcetype).eIsProxy()) {
			InternalEObject oldProcessingresourcetype = (InternalEObject) processingresourcetype;
			processingresourcetype = (ProcessingResourceType) eResolveProxy(oldProcessingresourcetype);
			if (processingresourcetype != oldProcessingresourcetype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype,
							processingresourcetype));
			}
		}
		return processingresourcetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingResourceType basicGetProcessingresourcetype() {
		return processingresourcetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingresourcetype(ProcessingResourceType newProcessingresourcetype) {
		ProcessingResourceType oldProcessingresourcetype = processingresourcetype;
		processingresourcetype = newProcessingresourcetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype,
					processingresourcetype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			if (resolve)
				return getProcessingresourcetype();
			return basicGetProcessingresourcetype();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			setProcessingresourcetype((ProcessingResourceType) newValue);
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
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			setProcessingresourcetype((ProcessingResourceType) null);
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
		case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
			return processingresourcetype != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessingResourceDegree.class) {
			switch (derivedFeatureID) {
			case specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE:
				return specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ProcessingResourceDegree.class) {
			switch (baseFeatureID) {
			case specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE:
				return specificPackage.SCHEDULING_POLICY_DEGREE__PROCESSINGRESOURCETYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public Choice determineInitialChoice() {
		final ClassChoice choice = GenericdesigndecisionFactory.eINSTANCE.createClassChoice();
		choice.setDofInstance(this);
		final ProcessingResourceType procType = this.getProcessingresourcetype();
		final ResourceContainer rc = (ResourceContainer) this.getPrimaryChanged();

		SchedulingPolicy policy = null;

		for (final ProcessingResourceSpecification proc : rc.getActiveResourceSpecifications_ResourceContainer()) {
			if (de.uka.ipd.sdq.dsexplore.helper.EMFHelper
					.checkIdentity(proc.getActiveResourceType_ActiveResourceSpecification(), procType)) {
				policy = proc.getSchedulingPolicy();
				break;
			}
		}
		if (policy == null) {
			throw new RuntimeException("Invalid degree of freedom " + this.toString()
					+ ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
		}
		choice.setChosenValue(policy);

		//check if entity is in the domain
		if (!de.uka.ipd.sdq.dsexplore.helper.EMFHelper.contains(this.getClassDesignOptions(),
				choice.getChosenValue())) {
			throw new ChoiceOutOfBoundsException(choice, "Error when determining initial genotype");
		}

		return choice;
	}

} // SchedulingPolicyDegreeImpl
