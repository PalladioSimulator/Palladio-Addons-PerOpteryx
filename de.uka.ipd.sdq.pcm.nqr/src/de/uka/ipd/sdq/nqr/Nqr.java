/**
 */
package de.uka.ipd.sdq.nqr;

import de.uka.ipd.sdq.dsexplore.qml.contract.QMLContract.ValueLiteral;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nqr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.nqr.Nqr#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.nqr.Nqr#getValue <em>Value</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.nqr.Nqr#getDimension <em>Dimension</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr()
 * @model
 * @generated
 */
public interface Nqr extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotated Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference.
	 * @see #setAnnotatedElement(RepositoryComponent)
	 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr_AnnotatedElement()
	 * @model required="true"
	 * @generated
	 */
	RepositoryComponent getAnnotatedElement();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.nqr.Nqr#getAnnotatedElement <em>Annotated Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotated Element</em>' reference.
	 * @see #getAnnotatedElement()
	 * @generated
	 */
	void setAnnotatedElement(RepositoryComponent value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ValueLiteral)
	 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ValueLiteral getValue();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.nqr.Nqr#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ValueLiteral value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimension</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' reference.
	 * @see #setDimension(Dimension)
	 * @see de.uka.ipd.sdq.nqr.NqrPackage#getNqr_Dimension()
	 * @model required="true"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.nqr.Nqr#getDimension <em>Dimension</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

} // Nqr
