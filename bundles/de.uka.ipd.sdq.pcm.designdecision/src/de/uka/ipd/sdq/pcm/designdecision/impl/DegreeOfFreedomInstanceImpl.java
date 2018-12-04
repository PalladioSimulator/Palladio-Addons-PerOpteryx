/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.palladiosimulator.pcm.core.entity.impl.NamedElementImpl;

import de.uka.ipd.sdq.pcm.designdecision.DegreeOfFreedomInstance;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Degree Of Freedom Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getPrimaryChanged <em>Primary Changed</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getDof <em>Dof</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getChangeableElements <em>Changeable Elements</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl#getDecoratorModel <em>Decorator Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DegreeOfFreedomInstanceImpl extends NamedElementImpl implements DegreeOfFreedomInstance {
	/**
	 * The cached value of the '{@link #getPrimaryChanged() <em>Primary Changed</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPrimaryChanged()
	 * @generated
	 * @ordered
	 */
	protected EObject primaryChanged;

	/**
	 * The cached value of the '{@link #getDof() <em>Dof</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDof()
	 * @generated
	 * @ordered
	 */
	protected DegreeOfFreedom dof;

	/**
	 * The cached value of the '{@link #getChangeableElements() <em>Changeable Elements</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChangeableElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> changeableElements;

	/**
	 * The cached value of the '{@link #getDecoratorModel() <em>Decorator Model</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDecoratorModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> decoratorModel;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DegreeOfFreedomInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.DEGREE_OF_FREEDOM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getPrimaryChanged() {
		if (primaryChanged != null && primaryChanged.eIsProxy()) {
			InternalEObject oldPrimaryChanged = (InternalEObject) primaryChanged;
			primaryChanged = eResolveProxy(oldPrimaryChanged);
			if (primaryChanged != oldPrimaryChanged) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED, oldPrimaryChanged, primaryChanged));
			}
		}
		return primaryChanged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetPrimaryChanged() {
		return primaryChanged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimaryChanged(EObject newPrimaryChanged) {
		EObject oldPrimaryChanged = primaryChanged;
		primaryChanged = newPrimaryChanged;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED, oldPrimaryChanged, primaryChanged));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreeOfFreedom getDof() {
		if (dof != null && dof.eIsProxy()) {
			InternalEObject oldDof = (InternalEObject) dof;
			dof = (DegreeOfFreedom) eResolveProxy(oldDof);
			if (dof != oldDof) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF, oldDof, dof));
			}
		}
		return dof;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public DegreeOfFreedom basicGetDof() {
		return dof;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDof(DegreeOfFreedom newDof) {
		DegreeOfFreedom oldDof = dof;
		dof = newDof;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF, oldDof, dof));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getChangeableElements() {
		if (changeableElements == null) {
			changeableElements = new EObjectResolvingEList<EObject>(EObject.class, this, designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS);
		}
		return changeableElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getDecoratorModel() {
		if (decoratorModel == null) {
			decoratorModel = new EObjectResolvingEList<EObject>(EObject.class, this, designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL);
		}
		return decoratorModel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean decoratorModelTypeMustMatchRequiredDecorator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
			if (resolve)
				return getPrimaryChanged();
			return basicGetPrimaryChanged();
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
			if (resolve)
				return getDof();
			return basicGetDof();
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
			return getChangeableElements();
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL:
			return getDecoratorModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
			setPrimaryChanged((EObject) newValue);
			return;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
			setDof((DegreeOfFreedom) newValue);
			return;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
			getChangeableElements().clear();
			getChangeableElements().addAll((Collection<? extends EObject>) newValue);
			return;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL:
			getDecoratorModel().clear();
			getDecoratorModel().addAll((Collection<? extends EObject>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
			setPrimaryChanged((EObject) null);
			return;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
			setDof((DegreeOfFreedom) null);
			return;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
			getChangeableElements().clear();
			return;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL:
			getDecoratorModel().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__PRIMARY_CHANGED:
			return primaryChanged != null;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DOF:
			return dof != null;
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__CHANGEABLE_ELEMENTS:
			return changeableElements != null && !changeableElements.isEmpty();
		case designdecisionPackage.DEGREE_OF_FREEDOM_INSTANCE__DECORATOR_MODEL:
			return decoratorModel != null && !decoratorModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // DegreeOfFreedomInstanceImpl
