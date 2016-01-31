/**
 */
package genericdesigndecision.universalDoF.impl;

import de.uka.ipd.sdq.dsexplore.gdof.GenomeToCandidateModelTransformation;
import de.uka.ipd.sdq.dsexplore.helper.AGenotypeReader;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.AAdapter;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.BinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.DesignDecisionGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.genotype.FinalBinaryGenotype;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.ADSEModule;
import de.uka.ipd.sdq.dsexplore.opt4j.representation.DSEEvaluator;
import genericdesigndecision.Choice;
import genericdesigndecision.DecisionSpace;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.Candidate;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;
import genericdesigndecision.genericDoF.ChangeableElementDescription;
import genericdesigndecision.genericDoF.DoFRepository;
import genericdesigndecision.genericDoF.GenericDoFFactory;
import genericdesigndecision.impl.AGenomeToCandidateModelTransformationImpl;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.SpecificDoF;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMetamodel Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getDofrepository <em>Dofrepository</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.AMetamodelDescriptionImpl#getGenomeToCandidateTransformation <em>Genome To Candidate Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AMetamodelDescriptionImpl extends AGenomeToCandidateModelTransformationImpl implements AMetamodelDescription {
	/**
	 * The cached value of the '{@link #getDofrepository() <em>Dofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDofrepository()
	 * @generated
	 * @ordered
	 */
	protected DoFRepository dofrepository;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final Metamodel NAME_EDEFAULT = Metamodel.PCM;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Metamodel name = NAME_EDEFAULT;
	
	/**
	 * The cached value of the '{@link #getGenomeToCandidateTransformation() <em>Genome To Candidate Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenomeToCandidateTransformation()
	 * @generated
	 * @ordered
	 */
	protected GenomeToCandidateModelTransformation genomeToCandidateTransformation;
	
	protected ADSEModule dseModule;
	
	protected AAdapter adapter;
	
	protected AGenotypeReader genotypeReader;
	
	protected HashMap<GenericDoF, SpecificDoF> gdof_to_dof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected AMetamodelDescriptionImpl() {
		super();
		this.gdof_to_dof = new HashMap<GenericDoF, SpecificDoF>();
		this.dofrepository = GenericDoFFactory.eINSTANCE.createDoFRepository();
	}
	
	public abstract Class<? extends DSEEvaluator> getDSEEvaluator();
	
	/**
	 * Translates the given {@link DesignDecisionGenotype} named DDGenotype 
	 * to a {@link List} of {@link BinaryGenotype} objects. 
	 * Each {@link BinaryGenotype} object holds 
	 * the binary representation of a particular {@link Choice} object in the DDGenotype. 
	 * The DDGenotype contains the private field "choices", which
	 *  is actually a {@link List} of {@link Choice} objects. 
	 *  Each {@link Choice} object is referenced to a particular DOF
	 * @param DDGenotype
	 * @return
	 */
	@Override
	public List<BinaryGenotype> translateDesignDecisionGenotype(DesignDecisionGenotype DDGenotype, DecisionSpace decisionSpace) {
		return this.adapter.translateDesignDecisionGenotype(DDGenotype, decisionSpace);
	}
	
	/** Translates the given {@link FinalBinaryGenotype} named FBGenotype to a 
	 * {@link DesignDecisionGenotype}.
	 * @param FBGenotype
	 * @return
	 */
	@Override
	public DesignDecisionGenotype translateFinalBinaryGenotype(FinalBinaryGenotype FBGenotype, DecisionSpace decisionSpace) {
		return this.adapter.translateFinalBinaryGenotype(FBGenotype, decisionSpace);
	}
	
	@Override
	public List<DesignDecisionGenotype> loadGenotypesFromEMF(String filename, ADSEProblem problem) {
		return this.genotypeReader.loadGenotypesFromEMF(filename, problem);
	}
	
	@Override
	public AGenotypeReader getGenotypeReader() {
		return this.genotypeReader;
	}
	
	@Override
	public AAdapter getAdapter() {
		return this.adapter;
	}
	
	@Override
	public ADSEModule getDSEModule() {
		return this.dseModule;
	}
	
	@Override
	public List<Choice> transform(List<EObject> rootElements, Candidate candidate) {
		return this.genomeToCandidateTransformation.transform(rootElements, candidate);
	}
	
	@Override
	public boolean transformChoice(List<EObject> rootElements, Choice choice) {
		return this.genomeToCandidateTransformation.transformChoice(rootElements, choice);
	}
	
	@Override
	public void setProperty(EObject changeableElement, EStructuralFeature property, Object value) {
		this.genomeToCandidateTransformation.setProperty(changeableElement, property, value);
	}
	
	@Override
	public Object getProperty(EObject changeableElement, EStructuralFeature property) {
		return this.genomeToCandidateTransformation.getProperty(changeableElement, property);
	}

	@Override
	public Object valueRule(ChangeableElementDescription ced, EObject changeableElement, List<EObject> rootElements) {
		return this.genomeToCandidateTransformation.valueRule(ced, changeableElement, rootElements);
	}
	
	@Override
	public Collection<Object> valueRuleForCollection (ChangeableElementDescription ced, EObject changeableElement, List<EObject> rootElements) {
		return this.genomeToCandidateTransformation.valueRuleForCollection(ced, changeableElement, rootElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversalDoFPackage.Literals.AMETAMODEL_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoFRepository getDofrepository() {
		if (dofrepository != null && dofrepository.eIsProxy()) {
			InternalEObject oldDofrepository = (InternalEObject)dofrepository;
			dofrepository = (DoFRepository)eResolveProxy(oldDofrepository);
			if (dofrepository != oldDofrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY, oldDofrepository, dofrepository));
			}
		}
		return dofrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoFRepository basicGetDofrepository() {
		return dofrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDofrepository(DoFRepository newDofrepository) {
		DoFRepository oldDofrepository = dofrepository;
		dofrepository = newDofrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY, oldDofrepository, dofrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Metamodel newName) {
		Metamodel oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenomeToCandidateModelTransformation getGenomeToCandidateTransformation() {
		return genomeToCandidateTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenomeToCandidateTransformation(GenomeToCandidateModelTransformation newGenomeToCandidateTransformation, NotificationChain msgs) {
		GenomeToCandidateModelTransformation oldGenomeToCandidateTransformation = genomeToCandidateTransformation;
		genomeToCandidateTransformation = newGenomeToCandidateTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION, oldGenomeToCandidateTransformation, newGenomeToCandidateTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenomeToCandidateTransformation(GenomeToCandidateModelTransformation newGenomeToCandidateTransformation) {
		if (newGenomeToCandidateTransformation != genomeToCandidateTransformation) {
			NotificationChain msgs = null;
			if (genomeToCandidateTransformation != null)
				msgs = ((InternalEObject)genomeToCandidateTransformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION, null, msgs);
			if (newGenomeToCandidateTransformation != null)
				msgs = ((InternalEObject)newGenomeToCandidateTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION, null, msgs);
			msgs = basicSetGenomeToCandidateTransformation(newGenomeToCandidateTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION, newGenomeToCandidateTransformation, newGenomeToCandidateTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Metamodel evaluateMetamodel(EObject model) {
		// currently not needed since metamodel of input model is already specified in the configuration by the GUI
		throw new UnsupportedOperationException();
	}

	public boolean newSDoF(String name, Class<? extends ADegreeOfFreedom> degree) {
		return this.dofrepository.newSDoF(name, degree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean deleteSDoF(SpecificDoF sdof) {
		return this.dofrepository.deleteSDoF(sdof);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<SpecificDoF> listSDoFs() {
		return this.dofrepository.getSdofs();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SpecificDoF getSDoF(String name) {
		return this.dofrepository.getSDoF(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SpecificDoF getCorrespondingDoF(GenericDoF gdof) {
		return this.gdof_to_dof.get(gdof);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION:
				return basicSetGenomeToCandidateTransformation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				if (resolve) return getDofrepository();
				return basicGetDofrepository();
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				return getName();
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION:
				return getGenomeToCandidateTransformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				setDofrepository((DoFRepository)newValue);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				setName((Metamodel)newValue);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION:
				setGenomeToCandidateTransformation((GenomeToCandidateModelTransformation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				setDofrepository((DoFRepository)null);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION:
				setGenomeToCandidateTransformation((GenomeToCandidateModelTransformation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__DOFREPOSITORY:
				return dofrepository != null;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__NAME:
				return name != NAME_EDEFAULT;
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION__GENOME_TO_CANDIDATE_TRANSFORMATION:
				return genomeToCandidateTransformation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___EVALUATE_METAMODEL__EOBJECT:
				return evaluateMetamodel((EObject)arguments.get(0));
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___DELETE_SDO_F__SPECIFICDOF:
				return deleteSDoF((SpecificDoF)arguments.get(0));
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___LIST_SDO_FS:
				return listSDoFs();
			case UniversalDoFPackage.AMETAMODEL_DESCRIPTION___GET_SDO_F__STRING:
				return getSDoF((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AMetamodelDescriptionImpl
