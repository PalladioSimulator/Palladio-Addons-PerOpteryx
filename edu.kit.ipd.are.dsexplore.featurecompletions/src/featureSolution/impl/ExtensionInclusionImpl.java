/**
 */
package featureSolution.impl;

import featureSolution.Advice;
import featureSolution.ExtensionInclusion;
import featureSolution.FeatureSolutionPackage;
import featureSolution.Import;
import featureSolution.PointCut;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Inclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link featureSolution.impl.ExtensionInclusionImpl#getPointCut <em>Point Cut</em>}</li>
 *   <li>{@link featureSolution.impl.ExtensionInclusionImpl#getAdvice <em>Advice</em>}</li>
 *   <li>{@link featureSolution.impl.ExtensionInclusionImpl#getImports <em>Imports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionInclusionImpl extends InclusionMechanismImpl implements ExtensionInclusion {
	/**
	 * The cached value of the '{@link #getPointCut() <em>Point Cut</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointCut()
	 * @generated
	 * @ordered
	 */
	protected EList<PointCut> pointCut;

	/**
	 * The cached value of the '{@link #getAdvice() <em>Advice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvice()
	 * @generated
	 * @ordered
	 */
	protected EList<Advice> advice;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionInclusionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureSolutionPackage.Literals.EXTENSION_INCLUSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PointCut> getPointCut() {
		if (pointCut == null) {
			pointCut = new EObjectContainmentEList<PointCut>(PointCut.class, this, FeatureSolutionPackage.EXTENSION_INCLUSION__POINT_CUT);
		}
		return pointCut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advice> getAdvice() {
		if (advice == null) {
			advice = new EObjectContainmentEList<Advice>(Advice.class, this, FeatureSolutionPackage.EXTENSION_INCLUSION__ADVICE);
		}
		return advice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this, FeatureSolutionPackage.EXTENSION_INCLUSION__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureSolutionPackage.EXTENSION_INCLUSION__POINT_CUT:
				return ((InternalEList<?>)getPointCut()).basicRemove(otherEnd, msgs);
			case FeatureSolutionPackage.EXTENSION_INCLUSION__ADVICE:
				return ((InternalEList<?>)getAdvice()).basicRemove(otherEnd, msgs);
			case FeatureSolutionPackage.EXTENSION_INCLUSION__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__POINT_CUT:
				return getPointCut();
			case FeatureSolutionPackage.EXTENSION_INCLUSION__ADVICE:
				return getAdvice();
			case FeatureSolutionPackage.EXTENSION_INCLUSION__IMPORTS:
				return getImports();
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__POINT_CUT:
				getPointCut().clear();
				getPointCut().addAll((Collection<? extends PointCut>)newValue);
				return;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__ADVICE:
				getAdvice().clear();
				getAdvice().addAll((Collection<? extends Advice>)newValue);
				return;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends Import>)newValue);
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__POINT_CUT:
				getPointCut().clear();
				return;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__ADVICE:
				getAdvice().clear();
				return;
			case FeatureSolutionPackage.EXTENSION_INCLUSION__IMPORTS:
				getImports().clear();
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
			case FeatureSolutionPackage.EXTENSION_INCLUSION__POINT_CUT:
				return pointCut != null && !pointCut.isEmpty();
			case FeatureSolutionPackage.EXTENSION_INCLUSION__ADVICE:
				return advice != null && !advice.isEmpty();
			case FeatureSolutionPackage.EXTENSION_INCLUSION__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExtensionInclusionImpl
