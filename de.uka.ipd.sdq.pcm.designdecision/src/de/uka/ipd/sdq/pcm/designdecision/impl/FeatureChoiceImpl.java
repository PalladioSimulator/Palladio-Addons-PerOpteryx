/**
 */
package de.uka.ipd.sdq.pcm.designdecision.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uka.ipd.sdq.pcm.designdecision.FeatureChoice;
import de.uka.ipd.sdq.pcm.designdecision.designdecisionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Choice</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.FeatureChoiceImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.FeatureChoiceImpl#isPresent <em>Present</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureChoiceImpl extends ChoiceImpl implements FeatureChoice {
	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPresent() <em>Present</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPresent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPresent() <em>Present</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPresent()
	 * @generated
	 * @ordered
	 */
	protected boolean present = PRESENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.FEATURE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.FEATURE_CHOICE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPresent() {
		return present;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresent(boolean newPresent) {
		boolean oldPresent = present;
		present = newPresent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.FEATURE_CHOICE__PRESENT, oldPresent, present));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			return isSelected();
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			return isPresent();
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
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			setSelected((Boolean) newValue);
			return;
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			setPresent((Boolean) newValue);
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
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			setSelected(SELECTED_EDEFAULT);
			return;
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			setPresent(PRESENT_EDEFAULT);
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
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			return selected != SELECTED_EDEFAULT;
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			return present != PRESENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(selected);
		result.append(", present: ");
		result.append(present);
		result.append(')');
		return result.toString();
	}

	@Override
	public Object getValue() {
		return this.isSelected();
	}

	@Override
	public void setValue(Object newValue) {
		if (newValue instanceof Boolean) {
			this.setSelected(((Boolean) newValue).booleanValue());
		} else {
			throw new IllegalArgumentException("Cannot cast " + newValue.getClass().getName() + " to Boolean to get the bool value.");
		}

	}

} // FeatureChoiceImpl
