/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;
import de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription;
import de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage;
import de.uka.ipd.sdq.pcm.resourcerepository.util.resourcerepositoryValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Resource Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionImpl#getFixedProcessingResourceCost_ResourceDescription <em>Fixed Processing Resource Cost Resource Description</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionImpl#getProcessingResourceSpecification_ResourceDescription <em>Processing Resource Specification Resource Description</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourcerepository.impl.ResourceDescriptionImpl#getResourcesCanBeUsedIndividually <em>Resources Can Be Used Individually</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceDescriptionImpl extends EObjectImpl implements ResourceDescription {
	/**
	 * The cached value of the '{@link #getFixedProcessingResourceCost_ResourceDescription()
	 * <em>Fixed Processing Resource Cost Resource Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFixedProcessingResourceCost_ResourceDescription()
	 * @generated
	 * @ordered
	 */
	protected FixedProcessingResourceCost fixedProcessingResourceCost_ResourceDescription;

	/**
	 * The cached value of the '{@link #getProcessingResourceSpecification_ResourceDescription()
	 * <em>Processing Resource Specification Resource Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getProcessingResourceSpecification_ResourceDescription()
	 * @generated
	 * @ordered
	 */
	protected ResourceContainer processingResourceSpecification_ResourceDescription;

	/**
	 * The default value of the '{@link #getResourcesCanBeUsedIndividually() <em>Resources Can Be Used Individually</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getResourcesCanBeUsedIndividually()
	 * @generated
	 * @ordered
	 */
	protected static final int RESOURCES_CAN_BE_USED_INDIVIDUALLY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResourcesCanBeUsedIndividually() <em>Resources Can Be Used Individually</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getResourcesCanBeUsedIndividually()
	 * @generated
	 * @ordered
	 */
	protected int resourcesCanBeUsedIndividually = RESOURCES_CAN_BE_USED_INDIVIDUALLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return resourcerepositoryPackage.Literals.RESOURCE_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FixedProcessingResourceCost getFixedProcessingResourceCost_ResourceDescription() {
		return fixedProcessingResourceCost_ResourceDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedProcessingResourceCost_ResourceDescription(FixedProcessingResourceCost newFixedProcessingResourceCost_ResourceDescription, NotificationChain msgs) {
		FixedProcessingResourceCost oldFixedProcessingResourceCost_ResourceDescription = fixedProcessingResourceCost_ResourceDescription;
		fixedProcessingResourceCost_ResourceDescription = newFixedProcessingResourceCost_ResourceDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION,
					oldFixedProcessingResourceCost_ResourceDescription, newFixedProcessingResourceCost_ResourceDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixedProcessingResourceCost_ResourceDescription(FixedProcessingResourceCost newFixedProcessingResourceCost_ResourceDescription) {
		if (newFixedProcessingResourceCost_ResourceDescription != fixedProcessingResourceCost_ResourceDescription) {
			NotificationChain msgs = null;
			if (fixedProcessingResourceCost_ResourceDescription != null)
				msgs = ((InternalEObject) fixedProcessingResourceCost_ResourceDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION, null, msgs);
			if (newFixedProcessingResourceCost_ResourceDescription != null)
				msgs = ((InternalEObject) newFixedProcessingResourceCost_ResourceDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION, null, msgs);
			msgs = basicSetFixedProcessingResourceCost_ResourceDescription(newFixedProcessingResourceCost_ResourceDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION,
					newFixedProcessingResourceCost_ResourceDescription, newFixedProcessingResourceCost_ResourceDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceContainer getProcessingResourceSpecification_ResourceDescription() {
		return processingResourceSpecification_ResourceDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessingResourceSpecification_ResourceDescription(ResourceContainer newProcessingResourceSpecification_ResourceDescription, NotificationChain msgs) {
		ResourceContainer oldProcessingResourceSpecification_ResourceDescription = processingResourceSpecification_ResourceDescription;
		processingResourceSpecification_ResourceDescription = newProcessingResourceSpecification_ResourceDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION,
					oldProcessingResourceSpecification_ResourceDescription, newProcessingResourceSpecification_ResourceDescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessingResourceSpecification_ResourceDescription(ResourceContainer newProcessingResourceSpecification_ResourceDescription) {
		if (newProcessingResourceSpecification_ResourceDescription != processingResourceSpecification_ResourceDescription) {
			NotificationChain msgs = null;
			if (processingResourceSpecification_ResourceDescription != null)
				msgs = ((InternalEObject) processingResourceSpecification_ResourceDescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION, null, msgs);
			if (newProcessingResourceSpecification_ResourceDescription != null)
				msgs = ((InternalEObject) newProcessingResourceSpecification_ResourceDescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION, null, msgs);
			msgs = basicSetProcessingResourceSpecification_ResourceDescription(newProcessingResourceSpecification_ResourceDescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION,
					newProcessingResourceSpecification_ResourceDescription, newProcessingResourceSpecification_ResourceDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getResourcesCanBeUsedIndividually() {
		return resourcesCanBeUsedIndividually;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResourcesCanBeUsedIndividually(int newResourcesCanBeUsedIndividually) {
		int oldResourcesCanBeUsedIndividually = resourcesCanBeUsedIndividually;
		resourcesCanBeUsedIndividually = newResourcesCanBeUsedIndividually;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, resourcerepositoryPackage.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY, oldResourcesCanBeUsedIndividually,
					resourcesCanBeUsedIndividually));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean CostAndResourceMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, resourcerepositoryValidator.DIAGNOSTIC_SOURCE, resourcerepositoryValidator.RESOURCE_DESCRIPTION__COST_AND_RESOURCE_MUST_MATCH,
						EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CostAndResourceMustMatch", EObjectValidator.getObjectLabel(this, context) }),
						new Object[] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION:
			return basicSetFixedProcessingResourceCost_ResourceDescription(null, msgs);
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION:
			return basicSetProcessingResourceSpecification_ResourceDescription(null, msgs);
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
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION:
			return getFixedProcessingResourceCost_ResourceDescription();
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION:
			return getProcessingResourceSpecification_ResourceDescription();
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY:
			return getResourcesCanBeUsedIndividually();
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
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION:
			setFixedProcessingResourceCost_ResourceDescription((FixedProcessingResourceCost) newValue);
			return;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION:
			setProcessingResourceSpecification_ResourceDescription((ResourceContainer) newValue);
			return;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY:
			setResourcesCanBeUsedIndividually((Integer) newValue);
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
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION:
			setFixedProcessingResourceCost_ResourceDescription((FixedProcessingResourceCost) null);
			return;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION:
			setProcessingResourceSpecification_ResourceDescription((ResourceContainer) null);
			return;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY:
			setResourcesCanBeUsedIndividually(RESOURCES_CAN_BE_USED_INDIVIDUALLY_EDEFAULT);
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
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__FIXED_PROCESSING_RESOURCE_COST_RESOURCE_DESCRIPTION:
			return fixedProcessingResourceCost_ResourceDescription != null;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__PROCESSING_RESOURCE_SPECIFICATION_RESOURCE_DESCRIPTION:
			return processingResourceSpecification_ResourceDescription != null;
		case resourcerepositoryPackage.RESOURCE_DESCRIPTION__RESOURCES_CAN_BE_USED_INDIVIDUALLY:
			return resourcesCanBeUsedIndividually != RESOURCES_CAN_BE_USED_INDIVIDUALLY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (ResourcesCanBeUsedIndividually: ");
		result.append(resourcesCanBeUsedIndividually);
		result.append(')');
		return result.toString();
	}

} // ResourceDescriptionImpl
