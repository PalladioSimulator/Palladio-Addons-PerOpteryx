/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage;
import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.RelationSemantics;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensionTypeImpl#getRelationSemantics <em>Relation Semantics</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DimensionTypeImpl extends IdentifierImpl implements DimensionType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DimensiontypesPackage.Literals.DIMENSION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationSemantics getRelationSemantics() {
		return (RelationSemantics)eDynamicGet(DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS, DimensiontypesPackage.Literals.DIMENSION_TYPE__RELATION_SEMANTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationSemantics(RelationSemantics newRelationSemantics, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRelationSemantics, DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationSemantics(RelationSemantics newRelationSemantics) {
		eDynamicSet(DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS, DimensiontypesPackage.Literals.DIMENSION_TYPE__RELATION_SEMANTICS, newRelationSemantics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS:
				return basicSetRelationSemantics(null, msgs);
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
			case DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS:
				return getRelationSemantics();
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
			case DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS:
				setRelationSemantics((RelationSemantics)newValue);
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
			case DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS:
				setRelationSemantics((RelationSemantics)null);
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
			case DimensiontypesPackage.DIMENSION_TYPE__RELATION_SEMANTICS:
				return getRelationSemantics() != null;
		}
		return super.eIsSet(featureID);
	}

} //DimensionTypeImpl
