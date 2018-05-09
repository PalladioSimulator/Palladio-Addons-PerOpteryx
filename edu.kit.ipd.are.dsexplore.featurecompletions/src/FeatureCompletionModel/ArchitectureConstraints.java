/**
 */
package FeatureCompletionModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.ArchitectureConstraints#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link FeatureCompletionModel.ArchitectureConstraints#getArchitectureElements <em>Architecture Elements</em>}</li>
 * </ul>
 *
 * @see FeatureCompletionModel.FeatureCompletionPackage#getArchitectureConstraints()
 * @model
 * @generated
 */
public interface ArchitectureConstraints extends DescribedElement {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' attribute.
	 * The default value is <code>"ANY"</code>.
	 * The literals are from the enumeration {@link FeatureCompletionModel.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' attribute.
	 * @see FeatureCompletionModel.Constraint
	 * @see #setConstraint(Constraint)
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getArchitectureConstraints_Constraint()
	 * @model default="ANY" required="true"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link FeatureCompletionModel.ArchitectureConstraints#getConstraint <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' attribute.
	 * @see FeatureCompletionModel.Constraint
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Architecture Elements</b></em>' reference list.
	 * The list contents are of type {@link FeatureCompletionModel.ConstrainableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Elements</em>' reference list.
	 * @see FeatureCompletionModel.FeatureCompletionPackage#getArchitectureConstraints_ArchitectureElements()
	 * @model type="FeatureCompletionModel.ConstrainableElement" required="true"
	 * @generated
	 */
	EList getArchitectureElements();

} // ArchitectureConstraints
