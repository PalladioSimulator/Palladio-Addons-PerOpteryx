/**
 */
package org.palladiosimulator.pcm.cost;

import org.palladiosimulator.pcm.resourceenvironment.LinkingResource;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Linking Resource Cost</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.palladiosimulator.pcm.cost.LinkingResourceCost#getLinkingresource <em>
 * Linkingresource</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.palladiosimulator.pcm.cost.costPackage#getLinkingResourceCost()
 * @model abstract="true"
 * @generated
 */
public interface LinkingResourceCost extends Cost
{
    /**
     * Returns the value of the '<em><b>Linkingresource</b></em>' reference. <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Linkingresource</em>' reference isn't clear, there really should
     * be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Linkingresource</em>' reference.
     * @see #setLinkingresource(LinkingResource)
     * @see org.palladiosimulator.pcm.cost.costPackage#getLinkingResourceCost_Linkingresource()
     * @model required="true" ordered="false"
     * @generated
     */
    LinkingResource getLinkingresource();

    /**
     * Sets the value of the '
     * {@link org.palladiosimulator.pcm.cost.LinkingResourceCost#getLinkingresource
     * <em>Linkingresource</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value
     *            the new value of the '<em>Linkingresource</em>' reference.
     * @see #getLinkingresource()
     * @generated
     */
    void setLinkingresource(LinkingResource value);

} // LinkingResourceCost
