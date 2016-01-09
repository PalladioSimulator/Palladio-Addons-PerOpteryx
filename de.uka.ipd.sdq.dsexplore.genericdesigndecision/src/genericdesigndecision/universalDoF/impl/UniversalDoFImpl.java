/**
 */
package genericdesigndecision.universalDoF.impl;

import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.GDoFRepository;
import genericdesigndecision.universalDoF.GenericDoF;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoF;
import genericdesigndecision.universalDoF.UniversalDoFPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uka.ipd.sdq.dsexplore.genericdesigndecision.DSEProblemFactory;
import de.uka.ipd.sdq.dsexplore.launch.DSEWorkflowConfiguration;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import genericdesigndecision.ADSEProblem;
import genericdesigndecision.genericDoF.ADegreeOfFreedom;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Universal Do F</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.universalDoF.impl.UniversalDoFImpl#getGdofrepository <em>Gdofrepository</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.UniversalDoFImpl#getSupportedMetamodels <em>Supported Metamodels</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.UniversalDoFImpl#getPreparedDoFs <em>Prepared Do Fs</em>}</li>
 *   <li>{@link genericdesigndecision.universalDoF.impl.UniversalDoFImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversalDoFImpl extends MinimalEObjectImpl.Container implements UniversalDoF {
	/**
	 * The cached value of the '{@link #getGdofrepository() <em>Gdofrepository</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdofrepository()
	 * @generated
	 * @ordered
	 */
	protected GDoFRepository gdofrepository;

	/**
	 * The cached value of the '{@link #getSupportedMetamodels() <em>Supported Metamodels</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedMetamodels()
	 * @generated
	 * @ordered
	 */
	protected EList<AMetamodelDescription> supportedMetamodels;

	/**
	 * The cached value of the '{@link #getPreparedDoFs() <em>Prepared Do Fs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparedDoFs()
	 * @generated
	 * @ordered
	 */
	protected ADegreeOfFreedom preparedDoFs;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ADSEProblem target;

	private static UniversalDoF universalDoFSingleton = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private UniversalDoFImpl() {
		super();
		//added for PCM support
		supportedMetamodels.add(designdecisionFactory.eINSTANCE.createMetamodelDescription());
		
		//TODO fill gdof to dof mapping
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversalDoFPackage.Literals.UNIVERSAL_DO_F;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDoFRepository getGdofrepository() {
		if (gdofrepository != null && gdofrepository.eIsProxy()) {
			InternalEObject oldGdofrepository = (InternalEObject)gdofrepository;
			gdofrepository = (GDoFRepository)eResolveProxy(oldGdofrepository);
			if (gdofrepository != oldGdofrepository) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversalDoFPackage.UNIVERSAL_DO_F__GDOFREPOSITORY, oldGdofrepository, gdofrepository));
			}
		}
		return gdofrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDoFRepository basicGetGdofrepository() {
		return gdofrepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdofrepository(GDoFRepository newGdofrepository) {
		GDoFRepository oldGdofrepository = gdofrepository;
		gdofrepository = newGdofrepository;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.UNIVERSAL_DO_F__GDOFREPOSITORY, oldGdofrepository, gdofrepository));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AMetamodelDescription> getSupportedMetamodels() {
		if (supportedMetamodels == null) {
			supportedMetamodels = new EObjectResolvingEList<AMetamodelDescription>(AMetamodelDescription.class, this, UniversalDoFPackage.UNIVERSAL_DO_F__SUPPORTED_METAMODELS);
		}
		return supportedMetamodels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADegreeOfFreedom getPreparedDoFs() {
		if (preparedDoFs != null && preparedDoFs.eIsProxy()) {
			InternalEObject oldPreparedDoFs = (InternalEObject)preparedDoFs;
			preparedDoFs = (ADegreeOfFreedom)eResolveProxy(oldPreparedDoFs);
			if (preparedDoFs != oldPreparedDoFs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversalDoFPackage.UNIVERSAL_DO_F__PREPARED_DO_FS, oldPreparedDoFs, preparedDoFs));
			}
		}
		return preparedDoFs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADegreeOfFreedom basicGetPreparedDoFs() {
		return preparedDoFs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreparedDoFs(ADegreeOfFreedom newPreparedDoFs) {
		ADegreeOfFreedom oldPreparedDoFs = preparedDoFs;
		preparedDoFs = newPreparedDoFs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.UNIVERSAL_DO_F__PREPARED_DO_FS, oldPreparedDoFs, preparedDoFs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADSEProblem getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ADSEProblem)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversalDoFPackage.UNIVERSAL_DO_F__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADSEProblem basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ADSEProblem newTarget) {
		ADSEProblem oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversalDoFPackage.UNIVERSAL_DO_F__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel evaluateMetamodel(EObject model) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Metamodel evaluateMetamodel(EModelElement model) {
		Metamodel mm = null;
		
		for (AMetamodelDescription ammd : supportedMetamodels) {
			mm = ammd.evaluateMetamodel(model);
			if(mm != null){
				return mm;
			}
		}
		throw new IllegalArgumentException("The metamodel of the model is not supported.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean prepareGDoF(int gdofID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenericDoF> listGDoFs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ADegreeOfFreedom> listPreparedDoFs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removePreparedDoF(int dofID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean prepareDoF(int dofID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean newGDoF(int gdofID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deleteGDoF(int gdofID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean constrainDoF(int dofID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	public static UniversalDoF getUniversalDoF() {
		if(universalDoFSingleton == null) {
			universalDoFSingleton = new UniversalDoFImpl();
		}
			return universalDoFSingleton;
	}

	@Override
	public ADSEProblem createDSEProblem(DSEWorkflowConfiguration dseConfig, ResourceSetPartition modelPartition) {
		Metamodel metamodel = dseConfig.getMetamodel();
		
		this.target = DSEProblemFactory.eINSTANCE.createDSEProblem(dseConfig, modelPartition, metamodel);
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversalDoFPackage.UNIVERSAL_DO_F__GDOFREPOSITORY:
				if (resolve) return getGdofrepository();
				return basicGetGdofrepository();
			case UniversalDoFPackage.UNIVERSAL_DO_F__SUPPORTED_METAMODELS:
				return getSupportedMetamodels();
			case UniversalDoFPackage.UNIVERSAL_DO_F__PREPARED_DO_FS:
				if (resolve) return getPreparedDoFs();
				return basicGetPreparedDoFs();
			case UniversalDoFPackage.UNIVERSAL_DO_F__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversalDoFPackage.UNIVERSAL_DO_F__GDOFREPOSITORY:
				setGdofrepository((GDoFRepository)newValue);
				return;
			case UniversalDoFPackage.UNIVERSAL_DO_F__SUPPORTED_METAMODELS:
				getSupportedMetamodels().clear();
				getSupportedMetamodels().addAll((Collection<? extends AMetamodelDescription>)newValue);
				return;
			case UniversalDoFPackage.UNIVERSAL_DO_F__PREPARED_DO_FS:
				setPreparedDoFs((ADegreeOfFreedom)newValue);
				return;
			case UniversalDoFPackage.UNIVERSAL_DO_F__TARGET:
				setTarget((ADSEProblem)newValue);
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
			case UniversalDoFPackage.UNIVERSAL_DO_F__GDOFREPOSITORY:
				setGdofrepository((GDoFRepository)null);
				return;
			case UniversalDoFPackage.UNIVERSAL_DO_F__SUPPORTED_METAMODELS:
				getSupportedMetamodels().clear();
				return;
			case UniversalDoFPackage.UNIVERSAL_DO_F__PREPARED_DO_FS:
				setPreparedDoFs((ADegreeOfFreedom)null);
				return;
			case UniversalDoFPackage.UNIVERSAL_DO_F__TARGET:
				setTarget((ADSEProblem)null);
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
			case UniversalDoFPackage.UNIVERSAL_DO_F__GDOFREPOSITORY:
				return gdofrepository != null;
			case UniversalDoFPackage.UNIVERSAL_DO_F__SUPPORTED_METAMODELS:
				return supportedMetamodels != null && !supportedMetamodels.isEmpty();
			case UniversalDoFPackage.UNIVERSAL_DO_F__PREPARED_DO_FS:
				return preparedDoFs != null;
			case UniversalDoFPackage.UNIVERSAL_DO_F__TARGET:
				return target != null;
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
			case UniversalDoFPackage.UNIVERSAL_DO_F___EVALUATE_METAMODEL__EOBJECT:
				return evaluateMetamodel((EObject)arguments.get(0));
			case UniversalDoFPackage.UNIVERSAL_DO_F___PREPARE_GDO_F__INT:
				return prepareGDoF((Integer)arguments.get(0));
			case UniversalDoFPackage.UNIVERSAL_DO_F___LIST_GDO_FS:
				return listGDoFs();
			case UniversalDoFPackage.UNIVERSAL_DO_F___LIST_PREPARED_DO_FS:
				return listPreparedDoFs();
			case UniversalDoFPackage.UNIVERSAL_DO_F___REMOVE_PREPARED_DO_F__INT:
				return removePreparedDoF((Integer)arguments.get(0));
			case UniversalDoFPackage.UNIVERSAL_DO_F___PREPARE_DO_F__INT:
				return prepareDoF((Integer)arguments.get(0));
			case UniversalDoFPackage.UNIVERSAL_DO_F___NEW_GDO_F__INT:
				return newGDoF((Integer)arguments.get(0));
			case UniversalDoFPackage.UNIVERSAL_DO_F___DELETE_GDO_F__INT:
				return deleteGDoF((Integer)arguments.get(0));
			case UniversalDoFPackage.UNIVERSAL_DO_F___CONSTRAIN_DO_F__INT:
				return constrainDoF((Integer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UniversalDoFImpl
