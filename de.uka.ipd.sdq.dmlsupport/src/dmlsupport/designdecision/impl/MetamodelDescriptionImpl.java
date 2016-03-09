/**
 */
package dmlsupport.designdecision.impl;

import dmlsupport.designdecision.DesigndecisionPackage;
import dmlsupport.designdecision.MetamodelDescription;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Choice;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;

import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metamodel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MetamodelDescriptionImpl extends AMetamodelDescriptionImpl implements MetamodelDescription {

	private static MetamodelDescription metamodelDescrSingleton = null;
	
	public static MetamodelDescription getMetamodelDescription() {
		if(metamodelDescrSingleton == null) {
			metamodelDescrSingleton = new MetamodelDescriptionImpl();
		}
		return metamodelDescrSingleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DesigndecisionPackage.Literals.METAMODEL_DESCRIPTION;
	}

	@Override
	public Collection<Object> getPossibleValues(ADegreeOfFreedom dof, ADSEProblem dseProblem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDecisionString(Choice choice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends DSEEvaluator> getDSEEvaluator() {
		// TODO Auto-generated method stub
		return null;
	}

} //MetamodelDescriptionImpl
