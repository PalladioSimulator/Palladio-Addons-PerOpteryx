/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof;

import de.uka.ipd.sdq.featuremodel.NamedElement;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decorator Model Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription#getReferedDecorator <em>Refered Decorator</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDecoratorModelDescription()
 * @model
 * @generated
 */
public interface DecoratorModelDescription extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Refered Decorator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered Decorator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered Decorator</em>' reference.
	 * @see #setReferedDecorator(EClass)
	 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage#getDecoratorModelDescription_ReferedDecorator()
	 * @model ordered="false"
	 * @generated
	 */
	EClass getReferedDecorator();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.pcm.designdecision.gdof.DecoratorModelDescription#getReferedDecorator <em>Refered Decorator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refered Decorator</em>' reference.
	 * @see #getReferedDecorator()
	 * @generated
	 */
	void setReferedDecorator(EClass value);
} // DecoratorModelDescription
