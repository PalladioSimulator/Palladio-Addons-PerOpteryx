/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Type Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum#getElements <em>Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionTypeEnum#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeEnum()
 * @model
 * @generated
 */
public interface DimensionTypeEnum extends DimensionType {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeEnum_Elements()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.Order}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order</em>' containment reference list.
	 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage#getDimensionTypeEnum_Order()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Order> getOrder();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.relationSemantics=null implies self.order->size()=0) and 
	 * (self.order->size()=0 implies self.relationSemantics=null)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.relationSemantics=null implies self.order->size()=0) and \r\n(self.order->size()=0 implies self.relationSemantics=null)'"
	 * @generated
	 */
	boolean ORDER_can_only_exist_with_RELATIONSEMANTICS_and_vice_versa(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DimensionTypeEnum
