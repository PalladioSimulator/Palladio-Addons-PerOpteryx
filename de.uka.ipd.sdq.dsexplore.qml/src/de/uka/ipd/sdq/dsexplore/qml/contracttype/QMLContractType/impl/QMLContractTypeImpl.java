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

import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.Dimension;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractType;
import de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.QMLContractTypePackage;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.impl.QMLDeclarationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>QML Contract Type</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link de.uka.ipd.sdq.dsexplore.qml.contracttype.QMLContractType.impl.QMLContractTypeImpl#getDimensions
 * <em>Dimensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QMLContractTypeImpl extends QMLDeclarationImpl implements QMLContractType {
    /**
     * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDimensions()
     * @generated
     * @ordered
     */
    protected EList<Dimension> dimensions;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected QMLContractTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return QMLContractTypePackage.Literals.QML_CONTRACT_TYPE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Dimension> getDimensions() {
        if (this.dimensions == null)
        {
            this.dimensions = new EObjectResolvingEList<Dimension>(Dimension.class, this,
                    QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS);
        }
        return this.dimensions;
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
        case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
            return this.getDimensions();
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
        case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
            this.getDimensions().clear();
            this.getDimensions().addAll((Collection<? extends Dimension>) newValue);
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
        case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
            this.getDimensions().clear();
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
        case QMLContractTypePackage.QML_CONTRACT_TYPE__DIMENSIONS:
            return this.dimensions != null && !this.dimensions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // QMLContractTypeImpl
