/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.resourcerepository;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.resourceenvironment.ResourceContainer;

import de.uka.ipd.sdq.pcm.cost.FixedProcessingResourceCost;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Description</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription#getFixedProcessingResourceCost_ResourceDescription <em>Fixed Processing Resource Cost Resource Description</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription#getProcessingResourceSpecification_ResourceDescription <em>Processing Resource Specification Resource Description</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription#getResourcesCanBeUsedIndividually <em>Resources Can Be Used Individually</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage#getResourceDescription()
 * @model
 * @generated
 */
public interface ResourceDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Fixed Processing Resource Cost Resource Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fixed Processing Resource Cost Resource Description</em>'
	 * containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Processing Resource Cost Resource Description</em>' containment reference.
	 * @see #setFixedProcessingResourceCost_ResourceDescription(FixedProcessingResourceCost)
	 * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage#getResourceDescription_FixedProcessingResourceCost_ResourceDescription()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	FixedProcessingResourceCost getFixedProcessingResourceCost_ResourceDescription();

	/**
	 * Sets the value of the '
	 * {@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription#getFixedProcessingResourceCost_ResourceDescription
	 * <em>Fixed Processing Resource Cost Resource Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Fixed Processing Resource Cost Resource Description</em>
	 *            ' containment reference.
	 * @see #getFixedProcessingResourceCost_ResourceDescription()
	 * @generated
	 */
	void setFixedProcessingResourceCost_ResourceDescription(FixedProcessingResourceCost value);

	/**
	 * Returns the value of the '<em><b>Processing Resource Specification Resource Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Resource Specification Resource Description</em>'
	 * containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Resource Specification Resource Description</em>' containment reference.
	 * @see #setProcessingResourceSpecification_ResourceDescription(ResourceContainer)
	 * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage#getResourceDescription_ProcessingResourceSpecification_ResourceDescription()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ResourceContainer getProcessingResourceSpecification_ResourceDescription();

	/**
	 * Sets the value of the '
	 * {@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription#getProcessingResourceSpecification_ResourceDescription
	 * <em>Processing Resource Specification Resource Description</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '
	 *            <em>Processing Resource Specification Resource Description</em>' containment
	 *            reference.
	 * @see #getProcessingResourceSpecification_ResourceDescription()
	 * @generated
	 */
	void setProcessingResourceSpecification_ResourceDescription(ResourceContainer value);

	/**
	 * Returns the value of the '<em><b>Resources Can Be Used Individually</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources Can Be Used Individually</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Resources Can Be Used Individually</em>' attribute.
	 * @see #setResourcesCanBeUsedIndividually(int)
	 * @see de.uka.ipd.sdq.pcm.resourcerepository.resourcerepositoryPackage#getResourceDescription_ResourcesCanBeUsedIndividually()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getResourcesCanBeUsedIndividually();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.resourcerepository.ResourceDescription#getResourcesCanBeUsedIndividually <em>Resources Can Be Used Individually</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Resources Can Be Used Individually</em>' attribute.
	 * @see #getResourcesCanBeUsedIndividually()
	 * @generated
	 */
	void setResourcesCanBeUsedIndividually(int value);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.fixedProcessingResourceCost_ResourceDescription.processingresourcespecification =
	 * self.processingresourcespecification
	 *
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean CostAndResourceMustMatch(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ResourceDescription
