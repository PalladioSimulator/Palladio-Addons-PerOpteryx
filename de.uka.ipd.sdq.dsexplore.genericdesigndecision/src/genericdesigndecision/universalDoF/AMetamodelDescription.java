/**
 */
package genericdesigndecision.universalDoF;

import genericdesigndecision.genericDoF.DegreeOfFreedom;
import genericdesigndecision.genericDoF.DoFRepository;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EModelElement;
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
 *   <li>{@link genericdesigndecision.universalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.AMetamodelDescription#getGdof_to_dof <em>Gdof to dof</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.AMetamodelDescription#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getAMetamodelDescription()
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
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getAMetamodelDescription_Dofrepository()
	 * @model
	 * @generated
	 */
	DoFRepository getDofrepository();

	/**
	 * Sets the value of the '{@link genericdesigndecision.universalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dofrepository</em>' reference.
	 * @see #getDofrepository()
	 * @generated
	 */
	void setDofrepository(DoFRepository value);

	/**
	 * Returns the value of the '<em><b>Gdof to dof</b></em>' map.
	 * The key is of type {@link genericdesigndecision.universalDoF.GenericDoF},
	 * and the value is of type {@link genericdesigndecision.genericDoF.DegreeOfFreedom},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdof to dof</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdof to dof</em>' map.
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getAMetamodelDescription_Gdof_to_dof()
	 * @model mapType="genericdesigndecision.universalDoF.GenericDoFToDegreeOfFreedom<genericdesigndecision.universalDoF.GenericDoF, genericdesigndecision.genericDoF.DegreeOfFreedom>"
	 * @generated
	 */
	EMap<GenericDoF, DegreeOfFreedom> getGdof_to_dof();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The literals are from the enumeration {@link genericdesigndecision.universalDoF.Metamodel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see genericdesigndecision.universalDoF.Metamodel
	 * @see #setName(Metamodel)
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getAMetamodelDescription_Name()
	 * @model
	 * @generated
	 */
	Metamodel getName();

	/**
	 * Sets the value of the '{@link genericdesigndecision.universalDoF.AMetamodelDescription#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see genericdesigndecision.universalDoF.Metamodel
	 * @see #getName()
	 * @generated
	 */
	void setName(Metamodel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true"
	 * @generated
	 */
	Metamodel evaluateMetamodel(EModelElement model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	DegreeOfFreedom getCorrespondingDoF(GenericDoF gdof);

} // AMetamodelDescription
