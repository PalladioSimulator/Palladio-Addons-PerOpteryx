/**
 */
package ConcernModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ConcernModel.DeploymentConstraint#getAssociation <em>Association</em>}</li>
 *   <li>{@link ConcernModel.DeploymentConstraint#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see ConcernModel.ConcernModelPackage#getDeploymentConstraint()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='isolation togetherSeparated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot isolation='\n\t\tself.association = \'ISOLATED\' implies\n\t\t\tself.annotations->size() = 1' togetherSeparated='\n\t\tself.association = \'TOGETHER\' or self.association = \'SEPARATED\' implies\n\t\t\tself.annotations->size() > 1'"
 * @generated
 */
public interface DeploymentConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Association</b></em>' attribute.
	 * The default value is <code>"INDIFFERENT"</code>.
	 * The literals are from the enumeration {@link ConcernModel.Association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' attribute.
	 * @see ConcernModel.Association
	 * @see #setAssociation(Association)
	 * @see ConcernModel.ConcernModelPackage#getDeploymentConstraint_Association()
	 * @model default="INDIFFERENT"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link ConcernModel.DeploymentConstraint#getAssociation <em>Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' attribute.
	 * @see ConcernModel.Association
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' reference list.
	 * The list contents are of type {@link ConcernModel.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' reference list.
	 * @see ConcernModel.ConcernModelPackage#getDeploymentConstraint_Annotations()
	 * @model required="true"
	 * @generated
	 */
	EList<Annotation> getAnnotations();

} // DeploymentConstraint
