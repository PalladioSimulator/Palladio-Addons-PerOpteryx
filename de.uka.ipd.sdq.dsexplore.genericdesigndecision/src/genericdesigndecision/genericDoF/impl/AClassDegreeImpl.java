/**
 */
package genericdesigndecision.genericDoF.impl;

import genericdesigndecision.Choice;
import genericdesigndecision.ClassChoice;
import genericdesigndecision.GenericdesigndecisionFactory;
import genericdesigndecision.genericDoF.AClassDegree;
import genericdesigndecision.genericDoF.GenericDoFPackage;
import genericdesigndecision.impl.GenericdesigndecisionFactoryImpl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AClass Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link genericdesigndecision.genericDoF.impl.AClassDegreeImpl#getClassDesignOptions <em>Class Design Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AClassDegreeImpl extends ADegreeOfFreedomImpl implements AClassDegree {
	/**
	 * The cached value of the '{@link #getClassDesignOptions() <em>Class Design Options</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassDesignOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> classDesignOptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AClassDegreeImpl() {
		super();
	}
	
	@Override
	public Choice createRandomChoice() {
		GenericdesigndecisionFactory factory = GenericdesigndecisionFactoryImpl.init();
		ClassChoice choice = factory.createClassChoice();
		
		List<EObject> domain = this.getClassDesignOptions();
		int index = this.random.nextInt(domain.size()); 
		EObject randomEntitiy = domain.get(index);
		
		choice.setChosenValue(randomEntitiy);
		choice.setDofInstance(this);
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDoFPackage.Literals.ACLASS_DEGREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getClassDesignOptions() {
		if (classDesignOptions == null) {
			classDesignOptions = new EObjectResolvingEList<EObject>(EObject.class, this, GenericDoFPackage.ACLASS_DEGREE__CLASS_DESIGN_OPTIONS);
		}
		return classDesignOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GenericDoFPackage.ACLASS_DEGREE__CLASS_DESIGN_OPTIONS:
				return getClassDesignOptions();
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
			case GenericDoFPackage.ACLASS_DEGREE__CLASS_DESIGN_OPTIONS:
				getClassDesignOptions().clear();
				getClassDesignOptions().addAll((Collection<? extends EObject>)newValue);
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
			case GenericDoFPackage.ACLASS_DEGREE__CLASS_DESIGN_OPTIONS:
				getClassDesignOptions().clear();
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
			case GenericDoFPackage.ACLASS_DEGREE__CLASS_DESIGN_OPTIONS:
				return classDesignOptions != null && !classDesignOptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AClassDegreeImpl
