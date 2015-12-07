/**
 */
package genericdesigndecision.universalDoF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEProblem;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universal Do F</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.UniversalDoF#getGdofrepository <em>Gdofrepository</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.UniversalDoF#getSupportedMetamodels <em>Supported Metamodels</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.UniversalDoF#getPreparedDoFs <em>Prepared Do Fs</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.UniversalDoF#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getUniversalDoF()
 * @model
 * @generated
 */
public interface UniversalDoF extends EObject {
	
	UniversalDoF eINSTANCE = genericdesigndecision.universalDoF.impl.UniversalDoFImpl.getUniversalDoF();
	
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
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getUniversalDoF_Gdofrepository()
	 * @model required="true"
	 * @generated
	 */
	GDoFRepository getGdofrepository();

	/**
	 * Sets the value of the '{@link genericdesigndecision.universalDoF.UniversalDoF#getGdofrepository <em>Gdofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gdofrepository</em>' reference.
	 * @see #getGdofrepository()
	 * @generated
	 */
	void setGdofrepository(GDoFRepository value);

	/**
	 * Returns the value of the '<em><b>Supported Metamodels</b></em>' reference list.
	 * The list contents are of type {@link genericdesigndecision.universalDoF.AMetamodelDescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Metamodels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Metamodels</em>' reference list.
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getUniversalDoF_SupportedMetamodels()
	 * @model
	 * @generated
	 */
	EList<AMetamodelDescription> getSupportedMetamodels();

	/**
	 * Returns the value of the '<em><b>Prepared Do Fs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prepared Do Fs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prepared Do Fs</em>' reference.
	 * @see #setPreparedDoFs(ADegreeOfFreedom)
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getUniversalDoF_PreparedDoFs()
	 * @model
	 * @generated
	 */
	ADegreeOfFreedom getPreparedDoFs();

	/**
	 * Sets the value of the '{@link genericdesigndecision.universalDoF.UniversalDoF#getPreparedDoFs <em>Prepared Do Fs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prepared Do Fs</em>' reference.
	 * @see #getPreparedDoFs()
	 * @generated
	 */
	void setPreparedDoFs(ADegreeOfFreedom value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ADSEProblem)
	 * @see genericdesigndecision.universalDoF.UniversalDoFPackage#getUniversalDoF_Target()
	 * @model required="true"
	 * @generated
	 */
	ADSEProblem getTarget();

	/**
	 * Sets the value of the '{@link genericdesigndecision.universalDoF.UniversalDoF#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ADSEProblem value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Metamodel evaluateMetamodel(EObject model);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean prepareGDoF(int gdofID);

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
	EList<ADegreeOfFreedom> listPreparedDoFs();

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
	boolean prepareDoF(int dofID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean newGDoF(int gdofID);

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
	
	DSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, EModelElement model);

} // UniversalDoF