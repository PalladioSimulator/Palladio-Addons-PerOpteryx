/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.EnumRelationSemantics;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Semantics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.RelationSemanticsImpl#getRelSem <em>Rel Sem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationSemanticsImpl extends IdentifierImpl implements RelationSemantics {
	/**
	 * The default value of the '{@link #getRelSem() <em>Rel Sem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelSem()
	 * @generated
	 * @ordered
	 */
	protected static final EnumRelationSemantics REL_SEM_EDEFAULT = EnumRelationSemantics.DECREASING;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationSemanticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.RELATION_SEMANTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumRelationSemantics getRelSem() {
		return (EnumRelationSemantics)eDynamicGet(DimensiontypesPackage.RELATION_SEMANTICS__REL_SEM, DimensiontypesPackage.Literals.RELATION_SEMANTICS__REL_SEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelSem(EnumRelationSemantics newRelSem) {
		eDynamicSet(DimensiontypesPackage.RELATION_SEMANTICS__REL_SEM, DimensiontypesPackage.Literals.RELATION_SEMANTICS__REL_SEM, newRelSem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DimensiontypesPackage.RELATION_SEMANTICS__REL_SEM:
				return getRelSem();
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
			case DimensiontypesPackage.RELATION_SEMANTICS__REL_SEM:
				setRelSem((EnumRelationSemantics)newValue);
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
			case DimensiontypesPackage.RELATION_SEMANTICS__REL_SEM:
				setRelSem(REL_SEM_EDEFAULT);
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
			case DimensiontypesPackage.RELATION_SEMANTICS__REL_SEM:
				return getRelSem() != REL_SEM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //RelationSemanticsImpl
