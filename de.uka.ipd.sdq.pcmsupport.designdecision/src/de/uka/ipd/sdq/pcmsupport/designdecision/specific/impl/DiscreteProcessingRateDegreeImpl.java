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
import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.pcm.cost.helper.CostUtil;
import de.uka.ipd.sdq.pcmsupport.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.DiscreteProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingRateDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.ProcessingResourceDegree;
import de.uka.ipd.sdq.pcmsupport.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.DiscreteRangeChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.impl.ADiscreteRangeDegreeImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Discrete Processing Rate Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcmsupport.designdecision.specific.impl.DiscreteProcessingRateDegreeImpl#getProcessingresourcetype <em>Processingresourcetype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteProcessingRateDegreeImpl extends ADiscreteRangeDegreeImpl implements DiscreteProcessingRateDegree {
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
	protected DiscreteProcessingRateDegreeImpl() {
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
		return specificPackage.Literals.DISCRETE_PROCESSING_RATE_DEGREE;
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
							specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE,
							oldProcessingresourcetype, processingresourcetype));
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
					specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE, oldProcessingresourcetype,
					processingresourcetype));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
		case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
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
			case specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE:
				return specificPackage.PROCESSING_RESOURCE_DEGREE__PROCESSINGRESOURCETYPE;
			default:
				return -1;
			}
		}
		if (baseClass == ProcessingRateDegree.class) {
			switch (derivedFeatureID) {
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
				return specificPackage.DISCRETE_PROCESSING_RATE_DEGREE__PROCESSINGRESOURCETYPE;
			default:
				return -1;
			}
		}
		if (baseClass == ProcessingRateDegree.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public Choice determineInitialChoice() {
		final DiscreteRangeChoice choice = GenericdesigndecisionFactory.eINSTANCE.createDiscreteRangeChoice();
		choice.setDofInstance(this);

		MetamodelDescription pcmdescr = MetamodelDescription.eINSTANCE;
		final ProcessingResourceSpecification rightPrs = pcmdescr.getProcessingResourceSpec(this);

		if (rightPrs != null) {
			if (!this.isLowerBoundIncluded() || !this.isUpperBoundIncluded()) {
				throw new RuntimeException(
						"Only DiscreteProcessingRateDegrees with upper and lower bound included are supported so far, sorry. ");
			}
			final double rate = CostUtil.getInstance().getDoubleFromSpecification(
					rightPrs.getProcessingRate_ProcessingResourceSpecification().getSpecification());
			final double startStep = this.getFrom();
			final double endStep = this.getTo();
			final double stepwidth = (endStep - startStep) / this.getNumberOfSteps();

			final double chosenStep = (rate - startStep) / stepwidth;
			choice.setChosenValue((int) chosenStep);
		} else {
			throw new RuntimeException("Invalid degree of freedom " + this.toString()
					+ ". The referenced ProcessingResourceType is not available in the given ResourceContainer.");
		}

		return choice;
	}

} // DiscreteProcessingRateDegreeImpl