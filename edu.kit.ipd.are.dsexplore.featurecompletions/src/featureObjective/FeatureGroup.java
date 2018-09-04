/**
 */
package featureObjective;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link featureObjective.FeatureGroup#getFeatures <em>Features</em>}</li>
 *   <li>{@link featureObjective.FeatureGroup#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see featureObjective.FeatureObjectivePackage#getFeatureGroup()
 * @model
 * @generated
 */
public interface FeatureGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link featureObjective.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see featureObjective.FeatureObjectivePackage#getFeatureGroup_Features()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The default value is <code>"OR"</code>.
	 * The literals are from the enumeration {@link featureObjective.LogicalOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see featureObjective.LogicalOperation
	 * @see #setOperation(LogicalOperation)
	 * @see featureObjective.FeatureObjectivePackage#getFeatureGroup_Operation()
	 * @model default="OR" required="true"
	 * @generated
	 */
	LogicalOperation getOperation();

	/**
	 * Sets the value of the '{@link featureObjective.FeatureGroup#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see featureObjective.LogicalOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(LogicalOperation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true 
	 * --(self.groupType = GroupTypes::OR or self.groupType = GroupTypes::XOR) implies self.children->forAll(c|c.isMandatory)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true \r\n--(self.groupType = GroupTypes::OR or self.groupType = GroupTypes::XOR) implies self.children->forAll(c|c.isMandatory)\r\n'"
	 * @generated
	 */
	boolean XORorORImpliesChildrenAreMandatory(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true 
	 *  --self.groupType = GroupTypes::ALL implies (self.min = -1 and self.max = -1)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true \r\n --self.groupType = GroupTypes::ALL implies (self.min = -1 and self.max = -1)\r\n'"
	 * @generated
	 */
	boolean ALLImpliesCardinalitiesToBeMinusOne(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true 
	 * --self.groupType = GroupTypes::OR implies (self.min = 1  and self.max = -1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true \r\n--self.groupType = GroupTypes::OR implies (self.min = 1  and self.max = -1)'"
	 * @generated
	 */
	boolean ORImpliesCardinalitiesMinToBeOneAndMaxToBeMinusOne(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * true 
	 *  --self.groupType = GroupTypes::XOR implies (self.min = 1 and self.max = 1)
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true \r\n --self.groupType = GroupTypes::XOR implies (self.min = 1 and self.max = 1)\r\n'"
	 * @generated
	 */
	boolean XORImpliesCardinalitiesToBeOne(DiagnosticChain diagnostics, Map<Object, Object> context);

} // FeatureGroup
