/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

import org.palladiosimulator.pcm.resourcetype.ProcessingResourceType;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Processing Resource Degree</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree#getProcessingresourcetype <em>Processingresourcetype</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getProcessingResourceDegree()
 * @model abstract="true"
 * @generated
 */
public interface ProcessingResourceDegree extends DegreeOfFreedomInstance {
	/**
	 * Returns the value of the '<em><b>Processingresourcetype</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processingresourcetype</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Processingresourcetype</em>' reference.
	 * @see #setProcessingresourcetype(ProcessingResourceType)
	 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getProcessingResourceDegree_Processingresourcetype()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ProcessingResourceType getProcessingresourcetype();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.specific.ProcessingResourceDegree#getProcessingresourcetype <em>Processingresourcetype</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processingresourcetype</em>' reference.
	 * @see #getProcessingresourcetype()
	 * @generated
	 */
	void setProcessingresourcetype(ProcessingResourceType value);

} // ProcessingResourceDegree
