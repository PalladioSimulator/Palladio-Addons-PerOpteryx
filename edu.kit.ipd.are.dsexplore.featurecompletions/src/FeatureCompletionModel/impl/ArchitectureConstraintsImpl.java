/**
 */
package FeatureCompletionModel.impl;

import FeatureCompletionModel.ArchitectureConstraints;
import FeatureCompletionModel.ConstrainableElement;
import FeatureCompletionModel.Constraint;
import FeatureCompletionModel.FeatureCompletionPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link FeatureCompletionModel.impl.ArchitectureConstraintsImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link FeatureCompletionModel.impl.ArchitectureConstraintsImpl#getArchitectureElements <em>Architecture Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchitectureConstraintsImpl extends DescribedElementImpl implements ArchitectureConstraints {
	/**
	 * The default value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final Constraint CONSTRAINT_EDEFAULT = Constraint.ANY_LITERAL;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint constraint = CONSTRAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArchitectureElements() <em>Architecture Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureElements()
	 * @generated
	 * @ordered
	 */
	protected EList architectureElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FeatureCompletionPackage.Literals.ARCHITECTURE_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(Constraint newConstraint) {
		Constraint oldConstraint = constraint;
		constraint = newConstraint == null ? CONSTRAINT_EDEFAULT : newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArchitectureElements() {
		if (architectureElements == null) {
			architectureElements = new EObjectResolvingEList(ConstrainableElement.class, this, FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS);
		}
		return architectureElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__CONSTRAINT:
				return getConstraint();
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS:
				return getArchitectureElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__CONSTRAINT:
				setConstraint((Constraint)newValue);
				return;
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS:
				getArchitectureElements().clear();
				getArchitectureElements().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__CONSTRAINT:
				setConstraint(CONSTRAINT_EDEFAULT);
				return;
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS:
				getArchitectureElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__CONSTRAINT:
				return constraint != CONSTRAINT_EDEFAULT;
			case FeatureCompletionPackage.ARCHITECTURE_CONSTRAINTS__ARCHITECTURE_ELEMENTS:
				return architectureElements != null && !architectureElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (constraint: ");
		result.append(constraint);
		result.append(')');
		return result.toString();
	}

} //ArchitectureConstraintsImpl
