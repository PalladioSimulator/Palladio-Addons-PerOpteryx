/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.core.entity.NamedElement;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclaration;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarations;
import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarationsPackage;
import de.uka.ipd.sdq.identifier.Identifier;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarationsPackage
 * @generated
 */
public class QMLDeclarationsAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static QMLDeclarationsPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public QMLDeclarationsAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = QMLDeclarationsPackage.eINSTANCE;
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
    protected QMLDeclarationsSwitch<Adapter> modelSwitch =
            new QMLDeclarationsSwitch<Adapter>()
            {
        @Override
        public Adapter caseQMLDeclarations(final QMLDeclarations object)
        {
            return QMLDeclarationsAdapterFactory.this.createQMLDeclarationsAdapter();
        }

        @Override
        public Adapter caseQMLDeclaration(final QMLDeclaration object)
        {
            return QMLDeclarationsAdapterFactory.this.createQMLDeclarationAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return QMLDeclarationsAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return QMLDeclarationsAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter caseEntity(final Entity object)
        {
            return QMLDeclarationsAdapterFactory.this.createEntityAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return QMLDeclarationsAdapterFactory.this.createEObjectAdapter();
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
     * {@link de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarations
     * <em>QML Declarations</em>}'. <!-- begin-user-doc --> This default implementation returns null
     * so that we can easily ignore cases; it's useful to ignore a case when inheritance will catch
     * all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations.QMLDeclarations
             * @generated
             */
            public Adapter createQMLDeclarationsAdapter() {
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
             * Creates a new adapter for the default case. <!-- begin-user-doc --> This default
     * implementation returns null. <!-- end-user-doc -->
     *
     * @return the new adapter.
             * @generated
             */
            public Adapter createEObjectAdapter() {
                return null;
            }

} // QMLDeclarationsAdapterFactory
