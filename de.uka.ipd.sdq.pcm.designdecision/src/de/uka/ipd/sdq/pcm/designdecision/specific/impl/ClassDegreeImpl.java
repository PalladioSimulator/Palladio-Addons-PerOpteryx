/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.pcm.designdecision.specific.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import de.uka.ipd.sdq.pcm.designdecision.impl.DegreeOfFreedomInstanceImpl;
import de.uka.ipd.sdq.pcm.designdecision.specific.ClassDegree;
import de.uka.ipd.sdq.pcm.designdecision.specific.specificPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Class Degree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.uka.ipd.sdq.pcm.designdecision.specific.impl.ClassDegreeImpl#getClassDesignOptions
 * <em>Class Design Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassDegreeImpl extends DegreeOfFreedomInstanceImpl implements ClassDegree {
    /**
     * The cached value of the '{@link #getClassDesignOptions() <em>Class Design Options</em>}'
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getClassDesignOptions()
     * @generated
     * @ordered
     */
    protected EList<EObject> classDesignOptions;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected ClassDegreeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return specificPackage.Literals.CLASS_DEGREE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<EObject> getClassDesignOptions() {
        if (this.classDesignOptions == null)
        {
            this.classDesignOptions = new EObjectResolvingEList<EObject>(EObject.class, this,
                    specificPackage.CLASS_DEGREE__CLASS_DESIGN_OPTIONS);
        }
        return this.classDesignOptions;
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
        case specificPackage.CLASS_DEGREE__CLASS_DESIGN_OPTIONS:
            return this.getClassDesignOptions();
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
        case specificPackage.CLASS_DEGREE__CLASS_DESIGN_OPTIONS:
            this.getClassDesignOptions().clear();
            this.getClassDesignOptions().addAll((Collection<? extends EObject>) newValue);
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
        case specificPackage.CLASS_DEGREE__CLASS_DESIGN_OPTIONS:
            this.getClassDesignOptions().clear();
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
        case specificPackage.CLASS_DEGREE__CLASS_DESIGN_OPTIONS:
            return this.classDesignOptions != null && !this.classDesignOptions.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // ClassDegreeImpl
