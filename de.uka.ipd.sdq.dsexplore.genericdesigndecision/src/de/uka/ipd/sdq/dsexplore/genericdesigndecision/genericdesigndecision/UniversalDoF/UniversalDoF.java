/**
 */
package de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.GenericDoF.DegreeOfFreedom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universal Do F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoF#getGdofrepository <em>Gdofrepository</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoF#getSupportedMetamodels <em>Supported Metamodels</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoF#getPreparedDoFs <em>Prepared Do Fs</em>}</li>
 * </ul>
 *
 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getUniversalDoF()
 * @model
 * @generated
 */
public interface UniversalDoF extends EObject {
	/**
	 * Returns the value of the '<em><b>Gdofrepository</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gdofrepository</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gdofrepository</em>' reference.
	 * @see #setGdofrepository(GDoFRepository)
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getUniversalDoF_Gdofrepository()
	 * @model required="true"
	 * @generated
	 */
	GDoFRepository getGdofrepository();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoF#getGdofrepository <em>Gdofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdofrepository</em>' reference.
	 * @see #getGdofrepository()
	 * @generated
	 */
	void setGdofrepository(GDoFRepository value);

	/**
	 * Returns the value of the '<em><b>Supported Metamodels</b></em>' reference list.
	 * The list contents are of type {@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.MetamodelDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Metamodels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Metamodels</em>' reference list.
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getUniversalDoF_SupportedMetamodels()
	 * @model
	 * @generated
	 */
	EList<MetamodelDescription> getSupportedMetamodels();

	/**
	 * Returns the value of the '<em><b>Prepared Do Fs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepared Do Fs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepared Do Fs</em>' reference.
	 * @see #setPreparedDoFs(DegreeOfFreedom)
	 * @see de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoFPackage#getUniversalDoF_PreparedDoFs()
	 * @model
	 * @generated
	 */
	DegreeOfFreedom getPreparedDoFs();

	/**
	 * Sets the value of the '{@link de.uka.ipd.sdq.dsexplore.genericdesigndecision.genericdesigndecision.UniversalDoF.UniversalDoF#getPreparedDoFs <em>Prepared Do Fs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepared Do Fs</em>' reference.
	 * @see #getPreparedDoFs()
	 * @generated
	 */
	void setPreparedDoFs(DegreeOfFreedom value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	MetamodelDescription evaluateMetamodel(EObject model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int prepareGDoF(int gdofID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<GenericDoF> listGDoFs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<DegreeOfFreedom> listPreparedDoFs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removePreparedDoF(int dofID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int prepareDoF(int dofID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int newGDoF(int gdofID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean deleteGDoF(int gdofID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean constrainDoF(int dofID);

} // UniversalDoF
