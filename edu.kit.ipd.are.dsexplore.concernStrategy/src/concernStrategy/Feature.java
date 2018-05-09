/**
 */
package concernStrategy;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link concernStrategy.Feature#getChildrelation <em>Childrelation</em>}</li>
 *   <li>{@link concernStrategy.Feature#getSimpleMandatory <em>Simple Mandatory</em>}</li>
 *   <li>{@link concernStrategy.Feature#getSimpleOptional <em>Simple Optional</em>}</li>
 *   <li>{@link concernStrategy.Feature#getFeaturegroup <em>Featuregroup</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link concernStrategy.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see concernStrategy.StrategymodelPackage#getFeature_Attributes()
	 * @model type="concernStrategy.Attribute" containment="true" ordered="false"
	 * @generated
	 */
	EList getAttributes();

	/**
	 * Returns the value of the '<em><b>Childrelation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Childrelation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childrelation</em>' containment reference.
	 * @see #setChildrelation(ChildRelation)
	 * @see concernStrategy.StrategymodelPackage#getFeature_Childrelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ChildRelation getChildrelation();

	/**
	 * Sets the value of the '{@link concernStrategy.Feature#getChildrelation <em>Childrelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Childrelation</em>' containment reference.
	 * @see #getChildrelation()
	 * @generated
	 */
	void setChildrelation(ChildRelation value);

	/**
	 * Returns the value of the '<em><b>Simple Mandatory</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link concernStrategy.Simple#getMandatoryChildren <em>Mandatory Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Mandatory</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Mandatory</em>' container reference.
	 * @see #setSimpleMandatory(Simple)
	 * @see concernStrategy.StrategymodelPackage#getFeature_SimpleMandatory()
	 * @see concernStrategy.Simple#getMandatoryChildren
	 * @model opposite="mandatoryChildren" transient="false" ordered="false"
	 * @generated
	 */
	Simple getSimpleMandatory();

	/**
	 * Sets the value of the '{@link concernStrategy.Feature#getSimpleMandatory <em>Simple Mandatory</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Mandatory</em>' container reference.
	 * @see #getSimpleMandatory()
	 * @generated
	 */
	void setSimpleMandatory(Simple value);

	/**
	 * Returns the value of the '<em><b>Simple Optional</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link concernStrategy.Simple#getOptionalChildren <em>Optional Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Optional</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Optional</em>' container reference.
	 * @see #setSimpleOptional(Simple)
	 * @see concernStrategy.StrategymodelPackage#getFeature_SimpleOptional()
	 * @see concernStrategy.Simple#getOptionalChildren
	 * @model opposite="optionalChildren" transient="false" ordered="false"
	 * @generated
	 */
	Simple getSimpleOptional();

	/**
	 * Sets the value of the '{@link concernStrategy.Feature#getSimpleOptional <em>Simple Optional</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Optional</em>' container reference.
	 * @see #getSimpleOptional()
	 * @generated
	 */
	void setSimpleOptional(Simple value);

	/**
	 * Returns the value of the '<em><b>Featuregroup</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link concernStrategy.FeatureGroup#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuregroup</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuregroup</em>' container reference.
	 * @see #setFeaturegroup(FeatureGroup)
	 * @see concernStrategy.StrategymodelPackage#getFeature_Featuregroup()
	 * @see concernStrategy.FeatureGroup#getChildren
	 * @model opposite="children" transient="false" ordered="false"
	 * @generated
	 */
	FeatureGroup getFeaturegroup();

	/**
	 * Sets the value of the '{@link concernStrategy.Feature#getFeaturegroup <em>Featuregroup</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuregroup</em>' container reference.
	 * @see #getFeaturegroup()
	 * @generated
	 */
	void setFeaturegroup(FeatureGroup value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true 
	 * --each attribute name is unique for this feature
	 * --self.attributes->isUnique(attr | attr.name)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true \r\n--each attribute name is unique for this feature\r\n--self.attributes->isUnique(attr | attr.name)\r\n'"
	 * @generated
	 */
	boolean EachAttributeNameDefinedJustOnce(DiagnosticChain diagnostics, Map context);

} // Feature
