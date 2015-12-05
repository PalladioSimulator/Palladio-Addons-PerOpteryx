/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.featuremodel.Simple;
import de.uka.ipd.sdq.pcm.designdecision.DSEProblem;
import de.uka.ipd.sdq.pcm.designdecision.MetamodelDescription;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionFactory;
import de.uka.ipd.sdq.pcm.designdecision.impl.designdecisionFactoryImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.OptionalFeatureDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;
import genericdesigndecision.Choice;
import genericdesigndecision.universalDoF.AMetamodelDescription;
import genericdesigndecision.universalDoF.Metamodel;
import genericdesigndecision.universalDoF.UniversalDoF;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Optional Feature Degree</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.OptionalFeatureDegreeImpl#getSimple <em>Simple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalFeatureDegreeImpl extends FeatureConfigDegreeImpl implements OptionalFeatureDegree {
	/**
	 * The cached value of the '{@link #getSimple() <em>Simple</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getSimple()
	 * @generated
	 * @ordered
	 */
	protected Simple simple;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionalFeatureDegreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return specificPackage.Literals.OPTIONAL_FEATURE_DEGREE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Simple getSimple() {
		if (simple != null && simple.eIsProxy()) {
			InternalEObject oldSimple = (InternalEObject) simple;
			simple = (Simple) eResolveProxy(oldSimple);
			if (simple != oldSimple) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							specificPackage.OPTIONAL_FEATURE_DEGREE__SIMPLE, oldSimple, simple));
			}
		}
		return simple;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Simple basicGetSimple() {
		return simple;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSimple(Simple newSimple) {
		Simple oldSimple = simple;
		simple = newSimple;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, specificPackage.OPTIONAL_FEATURE_DEGREE__SIMPLE,
					oldSimple, simple));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case specificPackage.OPTIONAL_FEATURE_DEGREE__SIMPLE:
			if (resolve)
				return getSimple();
			return basicGetSimple();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case specificPackage.OPTIONAL_FEATURE_DEGREE__SIMPLE:
			setSimple((Simple) newValue);
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
		case specificPackage.OPTIONAL_FEATURE_DEGREE__SIMPLE:
			setSimple((Simple) null);
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
		case specificPackage.OPTIONAL_FEATURE_DEGREE__SIMPLE:
			return simple != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Choice createRandomChoice() {
		designdecisionFactory factory = designdecisionFactoryImpl.init();
		Choice choice = factory.createChoice();

		//target should be a PCM-related problem here
		DSEProblem target = (DSEProblem) UniversalDoF.eINSTANCE.getTarget();
		AMetamodelDescription descr = target.getAssociatedMetamodel();
		assert (descr.getName().equals(Metamodel.PCM_VALUE));

		Collection<Object> possibleValues = descr.valueRuleForCollection(this.getPrimaryChangeable(),
				this.getPrimaryChanged(), ((MetamodelDescription) descr).getPCMRootElements(target.getPcmInstance()));

		List<Object> list;
		if (possibleValues instanceof List)
			list = (List<Object>) possibleValues;
		else
			list = new ArrayList<Object>(possibleValues);

		int index = this.random.nextInt(list.size());
		Object value = list.get(index);

		choice.setValue(value);
		choice.setDofInstance(this);
		return choice;
	}

	@Override
	public Choice determineInitialChoice() {
		final EStructuralFeature property = this.getPrimaryChangeable().getChangeable();
		final Object value = UniversalDoF.eINSTANCE.getTarget().getAssociatedMetamodel()
				.getProperty(this.getPrimaryChanged(), property);

		final Choice choice = designdecisionFactory.eINSTANCE.createChoice();
		choice.setValue(value);
		choice.setDofInstance(this);

		return (choice);
	}

} // OptionalFeatureDegreeImpl
