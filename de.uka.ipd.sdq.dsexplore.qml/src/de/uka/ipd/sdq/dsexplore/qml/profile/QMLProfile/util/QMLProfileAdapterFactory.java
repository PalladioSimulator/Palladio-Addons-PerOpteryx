/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.GenericQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile;
import de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.QMLProfilePackage
 * @generated
 */
public class QMLProfileAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static QMLProfilePackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLProfileAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = QMLProfilePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object. <!-- begin-user-doc
     * --> This implementation returns <code>true</code> if the object is either the model's package
     * or is an instance object of the model. <!-- end-user-doc -->
     *
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(final Object object) {
        if (object == modelPackage)
        {
            return true;
        }
        if (object instanceof EObject)
        {
            return ((EObject) object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected QMLProfileSwitch<Adapter> modelSwitch =
            new QMLProfileSwitch<Adapter>()
            {
        @Override
        public Adapter caseSimpleQMLProfile(final SimpleQMLProfile object)
        {
            return QMLProfileAdapterFactory.this.createSimpleQMLProfileAdapter();
        }

        @Override
        public Adapter caseGenericQMLProfile(final GenericQMLProfile object)
        {
            return QMLProfileAdapterFactory.this.createGenericQMLProfileAdapter();
        }

        @Override
        public Adapter caseRequirement(final Requirement object)
        {
            return QMLProfileAdapterFactory.this.createRequirementAdapter();
        }

        @Override
        public Adapter caseRefinedQMLProfile(final RefinedQMLProfile object)
        {
            return QMLProfileAdapterFactory.this.createRefinedQMLProfileAdapter();
        }

        @Override
        public Adapter caseUsageScenarioRequirement(final UsageScenarioRequirement object)
        {
            return QMLProfileAdapterFactory.this.createUsageScenarioRequirementAdapter();
        }

        @Override
        public Adapter caseEntryLevelSystemCallRequirement(final EntryLevelSystemCallRequirement object)
        {
            return QMLProfileAdapterFactory.this.createEntryLevelSystemCallRequirementAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return QMLProfileAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return QMLProfileAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object)
        {
            return QMLProfileAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter caseQMLDeclaration(final QMLDeclaration object)
        {
            return QMLProfileAdapterFactory.this.createQMLDeclarationAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return QMLProfileAdapterFactory.this.createEObjectAdapter();
        }
            };

            /**
             * Creates an adapter for the <code>target</code>. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @param target
     *            the object to adapt.
     * @return the adapter for the <code>target</code>.
             * @generated
             */
             @Override
             public Adapter createAdapter(final Notifier target) {
                 return this.modelSwitch.doSwitch((EObject) target);
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile
     * <em>Simple QML Profile</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.SimpleQMLProfile
              * @generated
              */
             public Adapter createSimpleQMLProfileAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.GenericQMLProfile
     * <em>Generic QML Profile</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.GenericQMLProfile
              * @generated
              */
             public Adapter createGenericQMLProfileAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement <em>Requirement</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.Requirement
              * @generated
              */
             public Adapter createRequirementAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile
     * <em>Refined QML Profile</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.RefinedQMLProfile
              * @generated
              */
             public Adapter createRefinedQMLProfileAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement
     * <em>Usage Scenario Requirement</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.UsageScenarioRequirement
              * @generated
              */
             public Adapter createUsageScenarioRequirementAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement
     * <em>Entry Level System Call Requirement</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.profile.QMLProfile.EntryLevelSystemCallRequirement
              * @generated
              */
             public Adapter createEntryLevelSystemCallRequirementAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '{@link de.uka.ipd.sdq.identifier.Identifier
     * <em>Identifier</em>}'. <!-- begin-user-doc --> This default implementation returns null so
     * that we can easily ignore cases; it's useful to ignore a case when inheritance will catch all
     * the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.identifier.Identifier
              * @generated
              */
             public Adapter createIdentifierAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.NamedElement <em>Named Element</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see org.palladiosimulator.pcm.core.entity.NamedElement
              * @generated
              */
             public Adapter createNamedElementAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link org.palladiosimulator.pcm.core.entity.Entity <em>Entity</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see org.palladiosimulator.pcm.core.entity.Entity
              * @generated
              */
             public Adapter createEntityAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration
     * <em>QML Declaration</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration
              * @generated
              */
             public Adapter createQMLDeclarationAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @generated
              */
             public Adapter createEObjectAdapter() {
                 return null;
             }

} // QMLProfileAdapterFactory
