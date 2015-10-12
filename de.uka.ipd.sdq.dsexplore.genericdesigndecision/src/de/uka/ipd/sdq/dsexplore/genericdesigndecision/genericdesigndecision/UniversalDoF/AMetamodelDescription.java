/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DegreeOfFreedom;
import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DoFRepository;

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
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.AMetamodelDescription#getGdof_to_dof <em>Gdof to dof</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getAMetamodelDescription()
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
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getAMetamodelDescription_Dofrepository()
	 * @model
	 * @generated
	 */
	DoFRepository getDofrepository();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.AMetamodelDescription#getDofrepository <em>Dofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dofrepository</em>' reference.
	 * @see #getDofrepository()
	 * @generated
	 */
	void setDofrepository(DoFRepository value);

	/**
	 * Returns the value of the '<em><b>Gdof to dof</b></em>' map.
	 * The key is of type {@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.GenericDoF},
	 * and the value is of type {@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DegreeOfFreedom},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdof to dof</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdof to dof</em>' map.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getAMetamodelDescription_Gdof_to_dof()
	 * @model mapType="de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.GenericDoFToDegreeOfFreedomMap<de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.GenericDoF, de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DegreeOfFreedom>"
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
