/**
 */
package concernStrategy;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link concernStrategy.Simple#getOptionalChildren <em>Optional Children</em>}</li>
 *   <li>{@link concernStrategy.Simple#getMandatoryChildren <em>Mandatory Children</em>}</li>
 * </ul>
 *
 * @see concernStrategy.StrategymodelPackage#getSimple()
 * @model
 * @generated
 */
public interface Simple extends ChildRelation {
	/**
	 * Returns the value of the '<em><b>Optional Children</b></em>' containment reference list.
	 * The list contents are of type {@link concernStrategy.Feature}.
	 * It is bidirectional and its opposite is '{@link concernStrategy.Feature#getSimpleOptional <em>Simple Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional Children</em>' containment reference list.
	 * @see concernStrategy.StrategymodelPackage#getSimple_OptionalChildren()
	 * @see concernStrategy.Feature#getSimpleOptional
	 * @model type="concernStrategy.Feature" opposite="simpleOptional" containment="true" ordered="false"
	 * @generated
	 */
	EList getOptionalChildren();

	/**
	 * Returns the value of the '<em><b>Mandatory Children</b></em>' containment reference list.
	 * The list contents are of type {@link concernStrategy.Feature}.
	 * It is bidirectional and its opposite is '{@link concernStrategy.Feature#getSimpleMandatory <em>Simple Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Children</em>' containment reference list.
	 * @see concernStrategy.StrategymodelPackage#getSimple_MandatoryChildren()
	 * @see concernStrategy.Feature#getSimpleMandatory
	 * @model type="concernStrategy.Feature" opposite="simpleMandatory" containment="true" ordered="false"
	 * @generated
	 */
	EList getMandatoryChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.optionalChildren->size()+self.mandatoryChildren->size()>=1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.optionalChildren-&gt;size()+self.mandatoryChildren-&gt;size()&gt;=1'"
	 * @generated
	 */
	boolean atLeastOneChild(DiagnosticChain diagnostics, Map context);

} // Simple
