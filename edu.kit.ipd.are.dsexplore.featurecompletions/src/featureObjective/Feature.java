/**
 */
package featureObjective;

import FeatureCompletionModel.NamedElement;

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
 *   <li>{@link featureObjective.Feature#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link featureObjective.Feature#getChildrelation <em>Childrelation</em>}</li>
 *   <li>{@link featureObjective.Feature#getSimpleMandatory <em>Simple Mandatory</em>}</li>
 *   <li>{@link featureObjective.Feature#getSimpleOptional <em>Simple Optional</em>}</li>
 *   <li>{@link featureObjective.Feature#getFeaturegroup <em>Featuregroup</em>}</li>
 * </ul>
 *
 * @see featureObjective.FeatureObjectivePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link featureObjective.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see featureObjective.FeatureObjectivePackage#getFeature_Attributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttributes();

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
	 * @see featureObjective.FeatureObjectivePackage#getFeature_Childrelation()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ChildRelation getChildrelation();

	/**
	 * Sets the value of the '{@link featureObjective.Feature#getChildrelation <em>Childrelation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Childrelation</em>' containment reference.
	 * @see #getChildrelation()
	 * @generated
	 */
	void setChildrelation(ChildRelation value);

	/**
	 * Returns the value of the '<em><b>Simple Mandatory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Mandatory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Mandatory</em>' reference.
	 * @see #setSimpleMandatory(Simple)
	 * @see featureObjective.FeatureObjectivePackage#getFeature_SimpleMandatory()
	 * @model ordered="false"
	 * @generated
	 */
	Simple getSimpleMandatory();

	/**
	 * Sets the value of the '{@link featureObjective.Feature#getSimpleMandatory <em>Simple Mandatory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Mandatory</em>' reference.
	 * @see #getSimpleMandatory()
	 * @generated
	 */
	void setSimpleMandatory(Simple value);

	/**
	 * Returns the value of the '<em><b>Simple Optional</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Optional</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Optional</em>' reference.
	 * @see #setSimpleOptional(Simple)
	 * @see featureObjective.FeatureObjectivePackage#getFeature_SimpleOptional()
	 * @model ordered="false"
	 * @generated
	 */
	Simple getSimpleOptional();

	/**
	 * Sets the value of the '{@link featureObjective.Feature#getSimpleOptional <em>Simple Optional</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Optional</em>' reference.
	 * @see #getSimpleOptional()
	 * @generated
	 */
	void setSimpleOptional(Simple value);

	/**
	 * Returns the value of the '<em><b>Featuregroup</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Featuregroup</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuregroup</em>' reference.
	 * @see #setFeaturegroup(FeatureGroup)
	 * @see featureObjective.FeatureObjectivePackage#getFeature_Featuregroup()
	 * @model ordered="false"
	 * @generated
	 */
	FeatureGroup getFeaturegroup();

	/**
	 * Sets the value of the '{@link featureObjective.Feature#getFeaturegroup <em>Featuregroup</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuregroup</em>' reference.
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
	boolean EachAttributeNameDefinedJustOnce(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Feature
