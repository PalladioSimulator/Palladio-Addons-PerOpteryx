/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Resource Container Replication Degree With Component Change</b></em>'. <!-- end-user-doc
 * -->
 *
 * <!-- begin-model-doc --> Resource Replication, but for each replication level the i-th referenced
 * RepositoryComponent is put into the referenced allocation context, if fitting. <!-- end-model-doc
 * -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ResourceContainerReplicationDegreeWithComponentChange#getExchangeComponentRule
 * <em>Exchange Component Rule</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getResourceContainerReplicationDegreeWithComponentChange()
 * @model
 * @generated
 */
public interface ResourceContainerReplicationDegreeWithComponentChange extends ResourceContainerReplicationDegree {
    /**
     * Returns the value of the '<em><b>Exchange Component Rule</b></em>' containment reference
     * list. The list contents are of type
     * {@link de.uka.ipd.sdq.pcm.designdecision.specific.ExchangeComponentRule}. <!-- begin-user-doc
     * -->
     * <p>
     * If the meaning of the '<em>Exchange Component Rule</em>' containment reference list isn't
     * clear, there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Exchange Component Rule</em>' containment reference list.
     * @see de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage#getResourceContainerReplicationDegreeWithComponentChange_ExchangeComponentRule()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<ExchangeComponentRule> getExchangeComponentRule();

} // ResourceContainerReplicationDegreeWithComponentChange
