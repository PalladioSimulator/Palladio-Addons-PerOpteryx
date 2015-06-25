/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.DimensionTypeRepository;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Dimension Type Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.DimensionTypeRepositoryImpl#getDimensionTypes
 * <em>Dimension Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DimensionTypeRepositoryImpl extends IdentifierImpl implements DimensionTypeRepository {
    /**
     * The cached value of the '{@link #getDimensionTypes() <em>Dimension Types</em>}' reference
     * list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDimensionTypes()
     * @generated
     * @ordered
     */
    protected EList<DimensionType> dimensionTypes;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected DimensionTypeRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.DIMENSION_TYPE_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<DimensionType> getDimensionTypes() {
        if (this.dimensionTypes == null)
        {
            this.dimensionTypes = new EObjectResolvingEList<DimensionType>(DimensionType.class, this,
                    QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES);
        }
        return this.dimensionTypes;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
            return this.getDimensionTypes();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
            this.getDimensionTypes().clear();
            this.getDimensionTypes().addAll((Collection<? extends DimensionType>) newValue);
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
    public void eUnset(final int featureID) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
            this.getDimensionTypes().clear();
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
    public boolean eIsSet(final int featureID) {
        switch (featureID)
        {
        case QMLContractTypePackage.DIMENSION_TYPE_REPOSITORY__DIMENSION_TYPES:
            return this.dimensionTypes != null && !this.dimensionTypes.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // DimensionTypeRepositoryImpl
