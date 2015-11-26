/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import de.uka.ipd.sdq.pcm.designdecision.PCMMetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;
import genericdesigndecision.genericDoF.DegreeOfFreedom;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM Metamodel Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PCMMetamodelDescriptionImpl extends AMetamodelDescriptionImpl implements PCMMetamodelDescription {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected PCMMetamodelDescriptionImpl() {
		super();
		this.dofrepository = gdofFactory.eINSTANCE.createDoFRepository();
		this.name = Metamodel.PCM;
		this.gdof_to_dof = new EMap<GenericDoF, DegreeOfFreedom>();
		//TODO add entries for mapping
	}
	
	@Override
	public Metamodel evaluateMetamodel(EModelElement model) {
		//TODO
		throw new UnsupportedOperationException();
	}

	public static AMetamodelDescription createMetamodelDescription() {
		if(metamodelDescriptionSingleton == null) {
			metamodelDescriptionSingleton = new PCMMetamodelDescriptionImpl();
		}
			return metamodelDescriptionSingleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.PCM_METAMODEL_DESCRIPTION;
	}

} //PCMMetamodelDescriptionImpl
