/**
 */
package strategyConfig;

import concernStrategy.Feature;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Holds ConfigState of a Feature. For a Feature it holds the actual value. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link strategyConfig.ConfigNode#getOrigin <em>Origin</em>}</li>
 *   <li>{@link strategyConfig.ConfigNode#getConfigState <em>Config State</em>}</li>
 *   <li>{@link strategyConfig.ConfigNode#getAttributevalue <em>Attributevalue</em>}</li>
 * </ul>
 *
 * @see strategyConfig.ConcernconfigPackage#getConfigNode()
 * @model
 * @generated
 */
public interface ConfigNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Feature)
	 * @see strategyConfig.ConcernconfigPackage#getConfigNode_Origin()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Feature getOrigin();

	/**
	 * Sets the value of the '{@link strategyConfig.ConfigNode#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Feature value);

	/**
	 * Returns the value of the '<em><b>Config State</b></em>' attribute.
	 * The default value is <code>"DEFAULT"</code>.
	 * The literals are from the enumeration {@link strategyConfig.ConfigState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * actual state for annotated Features; for FeatureGroups it is a derived attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config State</em>' attribute.
	 * @see strategyConfig.ConfigState
	 * @see #setConfigState(ConfigState)
	 * @see strategyConfig.ConcernconfigPackage#getConfigNode_ConfigState()
	 * @model default="DEFAULT" required="true" ordered="false"
	 * @generated
	 */
	ConfigState getConfigState();

	/**
	 * Sets the value of the '{@link strategyConfig.ConfigNode#getConfigState <em>Config State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config State</em>' attribute.
	 * @see strategyConfig.ConfigState
	 * @see #getConfigState()
	 * @generated
	 */
	void setConfigState(ConfigState value);

	/**
	 * Returns the value of the '<em><b>Attributevalue</b></em>' containment reference list.
	 * The list contents are of type {@link strategyConfig.AttributeValue}.
	 * It is bidirectional and its opposite is '{@link strategyConfig.AttributeValue#getConfignode <em>Confignode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributevalue</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributevalue</em>' containment reference list.
	 * @see strategyConfig.ConcernconfigPackage#getConfigNode_Attributevalue()
	 * @see strategyConfig.AttributeValue#getConfignode
	 * @model type="strategyConfig.AttributeValue" opposite="confignode" containment="true" ordered="false"
	 * @generated
	 */
	EList getAttributevalue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true 
	 * --let childSelectedCount : Integer = self.children->select(c|c.configState = ConfigState::USER_SELECTED or c.configState = ConfigState::MASCHINE_SELECTED)->size() 
	 * --in 
	 * --	 if self.origin.oclIsTypeOf(featuremodel::FeatureGroup) then
	 * --	 	childSelectedCount >= self.origin.min and (childSelectedCount <= self.origin.max or self.origin.max = -1)
	 * --	 else
	 * --	 	self.origin.min  >= 1 implies (self.configState = ConfigState::USER_SELECTED or self.configState = ConfigState::MASCHINE_SELECTED)
	 * --	 endif
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true \r\n--let childSelectedCount : Integer = self.children-&gt;select(c|c.configState = ConfigState::USER_SELECTED or c.configState = ConfigState::MASCHINE_SELECTED)-&gt;size() \r\n--in \r\n--\t if self.origin.oclIsTypeOf(featuremodel::FeatureGroup) then\r\n--\t \tchildSelectedCount &gt;= self.origin.min and (childSelectedCount &lt;= self.origin.max or self.origin.max = -1)\r\n--\t else\r\n--\t \tself.origin.min  &gt;= 1 implies (self.configState = ConfigState::USER_SELECTED or self.configState = ConfigState::MASCHINE_SELECTED)\r\n--\t endif'"
	 * @generated
	 */
	boolean ConfigCardinalityInvalid(DiagnosticChain diagnostics, Map context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true
	 * --not self.origin.featuregroup->isEmpty() implies (self.origin.featuregroup.children->size() <=  self.origin.featuregroup.max and self.origin.featuregroup.children->size() >=  self.origin.featuregroup.min)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true\r\n--not self.origin.featuregroup-&gt;isEmpty() implies (self.origin.featuregroup.children-&gt;size() &lt;=  self.origin.featuregroup.max and self.origin.featuregroup.children-&gt;size() &gt;=  self.origin.featuregroup.min)'"
	 * @generated
	 */
	boolean CheckMultiplicityOfFeatureGroup(DiagnosticChain diagnostics, Map context);

} // ConfigNode
