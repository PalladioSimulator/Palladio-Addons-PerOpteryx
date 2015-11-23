/**
 */
package genericdesigndecision.pcmsupport.impl;

import genericdesigndecision.pcmsupport.PCMMetamodelDescription;
import genericdesigndecision.pcmsupport.PcmsupportPackage;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;

import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofFactory;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcmsupportPackage.Literals.PCM_METAMODEL_DESCRIPTION;
	}

	@Override
	public Metamodel evaluateMetamodel(EModelElement model) {
		// TODO Auto-generated method stub
		return null;
	}

	public static AMetamodelDescription createMetamodelDescription() {
		if(metamodelDescriptionSingleton == null) {
			metamodelDescriptionSingleton = new PCMMetamodelDescriptionImpl();
		}
			return metamodelDescriptionSingleton;
	}

} //PCMMetamodelDescriptionImpl
