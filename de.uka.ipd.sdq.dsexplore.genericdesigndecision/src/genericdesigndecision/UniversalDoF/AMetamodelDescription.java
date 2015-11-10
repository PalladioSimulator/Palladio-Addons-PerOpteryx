/**
 */
package genericdesigndecision.UniversalDoF;

import genericdesigndecision.GenericDoF.DegreeOfFreedom;
import genericdesigndecision.GenericDoF.DoFRepository;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AMetamodel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}</li>
 *   <li>{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#getGdof_to_dof <em>Gdof to dof</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.UniversalDoF.UniversalDoFPackage#getAMetamodelDescription()
 * @model abstract="true"
 * @generated
 */
public interface AMetamodelDescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Dofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dofrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dofrepository</em>' reference.
	 * @see #setDofrepository(DoFRepository)
	 * @see genericdesigndecision.UniversalDoF.UniversalDoFPackage#getAMetamodelDescription_Dofrepository()
	 * @model
	 * @generated
	 */
	DoFRepository getDofrepository();

	/**
	 * Sets the value of the '{@link genericdesigndecision.UniversalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dofrepository</em>' reference.
	 * @see #getDofrepository()
	 * @generated
	 */
	void setDofrepository(DoFRepository value);

	/**
	 * Returns the value of the '<em><b>Gdof to dof</b></em>' map.
	 * The key is of type {@link genericdesigndecision.UniversalDoF.GenericDoF},
	 * and the value is of type {@link genericdesigndecision.GenericDoF.DegreeOfFreedom},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdof to dof</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdof to dof</em>' map.
	 * @see genericdesigndecision.UniversalDoF.UniversalDoFPackage#getAMetamodelDescription_Gdof_to_dof()
	 * @model mapType="genericdesigndecision.UniversalDoF.GenericDoFToDegreeOfFreedomMap<genericdesigndecision.UniversalDoF.GenericDoF, genericdesigndecision.GenericDoF.DegreeOfFreedom>"
	 * @generated
	 */
	EMap<GenericDoF, DegreeOfFreedom> getGdof_to_dof();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 * @generated
	 */
	MetamodelDescription evaluateMetamodel(EObject model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	DegreeOfFreedom returnCorrespondingDoF(GenericDoF gdof);

} // AMetamodelDescription
