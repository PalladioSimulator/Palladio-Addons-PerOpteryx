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
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.FeatureChoiceImpl#isSelected
 * <em>Selected</em>}</li>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.impl.FeatureChoiceImpl#isPresent
 * <em>Present</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureChoiceImpl extends ChoiceImpl implements FeatureChoice {
	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = FeatureChoiceImpl.SELECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isPresent() <em>Present</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPresent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPresent() <em>Present</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPresent()
	 * @generated
	 * @ordered
	 */
	protected boolean present = FeatureChoiceImpl.PRESENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeatureChoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return designdecisionPackage.Literals.FEATURE_CHOICE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isSelected() {
		return this.selected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setSelected(boolean newSelected) {
		boolean oldSelected = this.selected;
		this.selected = newSelected;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.FEATURE_CHOICE__SELECTED, oldSelected, this.selected));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isPresent() {
		return this.present;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setPresent(boolean newPresent) {
		boolean oldPresent = this.present;
		this.present = newPresent;
		if (this.eNotificationRequired()) {
			this.eNotify(new ENotificationImpl(this, Notification.SET, designdecisionPackage.FEATURE_CHOICE__PRESENT, oldPresent, this.present));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			return this.isSelected();
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			return this.isPresent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			this.setSelected((Boolean) newValue);
			return;
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			this.setPresent((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			this.setSelected(FeatureChoiceImpl.SELECTED_EDEFAULT);
			return;
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			this.setPresent(FeatureChoiceImpl.PRESENT_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case designdecisionPackage.FEATURE_CHOICE__SELECTED:
			return this.selected != FeatureChoiceImpl.SELECTED_EDEFAULT;
		case designdecisionPackage.FEATURE_CHOICE__PRESENT:
			return this.present != FeatureChoiceImpl.PRESENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (this.eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (selected: ");
		result.append(this.selected);
		result.append(", present: ");
		result.append(this.present);
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
