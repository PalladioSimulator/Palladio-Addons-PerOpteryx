/**
 */
package genericdesigndecision.genericDoF;

import genericdesigndecision.Choice;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AClass Degree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents DegreeOfFreedoms that have an enumeration domain. The set of possile values of the degree of freedom are referenced with the domainOfEntities property. Any kind of PCM element can be annotated here. Subclasses restrict the type of annotated elements with OCL constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.AClassDegree#getClassDesignOptions <em>Class Design Options</em>}</li>
 * </ul>
 *
 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAClassDegree()
 * @model abstract="true"
 * @generated
 */
public interface AClassDegree extends ADegreeOfFreedom {
	/**
	 * Returns the value of the '<em><b>Class Design Options</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Design Options</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Design Options</em>' reference list.
	 * @see genericdesigndecision.genericDoF.GenericDoFPackage#getAClassDegree_ClassDesignOptions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<EObject> getClassDesignOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Choice createRandomChoice();

} // AClassDegree
