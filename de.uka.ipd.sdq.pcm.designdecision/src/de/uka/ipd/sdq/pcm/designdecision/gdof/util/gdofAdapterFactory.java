/**
 */
package de.uka.ipd.sdq.pcm.designdecision.gdof.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.uka.ipd.sdq.featuremodel.NamedElement;
import de.uka.ipd.sdq.identifier.Identifier;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom;
import de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository;
import de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition;
import de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule;
import de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides an adapter
 * <code>createXXX</code> method for each class of the model. <!-- end-user-doc -->
 *
 * @see de.uka.ipd.sdq.pcm.designdecision.gdof.gdofPackage
 * @generated
 */
public class gdofAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected static gdofPackage modelPackage;

    /**
     * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public gdofAdapterFactory() {
        if (modelPackage == null)
        {
            modelPackage = gdofPackage.eINSTANCE;
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
    protected gdofSwitch<Adapter> modelSwitch =
            new gdofSwitch<Adapter>()
            {
        @Override
        public Adapter caseChangeableElementDescription(final ChangeableElementDescription object)
        {
            return gdofAdapterFactory.this.createChangeableElementDescriptionAdapter();
        }

        @Override
        public Adapter caseValueRule(final ValueRule object)
        {
            return gdofAdapterFactory.this.createValueRuleAdapter();
        }

        @Override
        public Adapter caseOCLRule(final OCLRule object)
        {
            return gdofAdapterFactory.this.createOCLRuleAdapter();
        }

        @Override
        public Adapter caseHelperOCLDefinition(final HelperOCLDefinition object)
        {
            return gdofAdapterFactory.this.createHelperOCLDefinitionAdapter();
        }

        @Override
        public Adapter caseStaticContextRule(final StaticContextRule object)
        {
            return gdofAdapterFactory.this.createStaticContextRuleAdapter();
        }

        @Override
        public Adapter caseSelectionRule(final SelectionRule object)
        {
            return gdofAdapterFactory.this.createSelectionRuleAdapter();
        }

        @Override
        public Adapter caseDoFRepository(final DoFRepository object)
        {
            return gdofAdapterFactory.this.createDoFRepositoryAdapter();
        }

        @Override
        public Adapter caseInstanceSelectionRule(final InstanceSelectionRule object)
        {
            return gdofAdapterFactory.this.createInstanceSelectionRuleAdapter();
        }

        @Override
        public Adapter caseStaticSelectionRule(final StaticSelectionRule object)
        {
            return gdofAdapterFactory.this.createStaticSelectionRuleAdapter();
        }

        @Override
        public Adapter caseDegreeOfFreedom(final DegreeOfFreedom object)
        {
            return gdofAdapterFactory.this.createDegreeOfFreedomAdapter();
        }

        @Override
        public Adapter caseIdentifier(final Identifier object)
        {
            return gdofAdapterFactory.this.createIdentifierAdapter();
        }

        @Override
        public Adapter caseNamedElement(final NamedElement object)
        {
            return gdofAdapterFactory.this.createNamedElementAdapter();
        }

        @Override
        public Adapter defaultCase(final EObject object)
        {
            return gdofAdapterFactory.this.createEObjectAdapter();
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
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription
     * <em>Changeable Element Description</em>}'. <!-- begin-user-doc --> This default
     * implementation returns null so that we can easily ignore cases; it's useful to ignore a case
     * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.ChangeableElementDescription
              * @generated
              */
             public Adapter createChangeableElementDescriptionAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule <em>Value Rule</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.ValueRule
              * @generated
              */
             public Adapter createValueRuleAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule <em>OCL Rule</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.OCLRule
              * @generated
              */
             public Adapter createOCLRuleAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition
     * <em>Helper OCL Definition</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.HelperOCLDefinition
              * @generated
              */
             public Adapter createHelperOCLDefinitionAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule <em>Static Context Rule</em>}
     * '. <!-- begin-user-doc --> This default implementation returns null so that we can easily
     * ignore cases; it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.StaticContextRule
              * @generated
              */
             public Adapter createStaticContextRuleAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule <em>Selection Rule</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.SelectionRule
              * @generated
              */
             public Adapter createSelectionRuleAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository <em>Do FRepository</em>}'. <!--
     * begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.DoFRepository
              * @generated
              */
             public Adapter createDoFRepositoryAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule
     * <em>Instance Selection Rule</em>}'. <!-- begin-user-doc --> This default implementation
     * returns null so that we can easily ignore cases; it's useful to ignore a case when
     * inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.InstanceSelectionRule
              * @generated
              */
             public Adapter createInstanceSelectionRuleAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule
     * <em>Static Selection Rule</em>}'. <!-- begin-user-doc --> This default implementation returns
     * null so that we can easily ignore cases; it's useful to ignore a case when inheritance will
     * catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.StaticSelectionRule
              * @generated
              */
             public Adapter createStaticSelectionRuleAdapter() {
                 return null;
             }

             /**
              * Creates a new adapter for an object of class '
     * {@link de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom <em>Degree Of Freedom</em>}'.
     * <!-- begin-user-doc --> This default implementation returns null so that we can easily ignore
     * cases; it's useful to ignore a case when inheritance will catch all the cases anyway. <!--
     * end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.pcm.designdecision.gdof.DegreeOfFreedom
              * @generated
              */
             public Adapter createDegreeOfFreedomAdapter() {
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
     * {@link de.uka.ipd.sdq.featuremodel.NamedElement <em>Named Element</em>}'. <!-- begin-user-doc
     * --> This default implementation returns null so that we can easily ignore cases; it's useful
     * to ignore a case when inheritance will catch all the cases anyway. <!-- end-user-doc -->
     *
     * @return the new adapter.
              * @see de.uka.ipd.sdq.featuremodel.NamedElement
              * @generated
              */
             public Adapter createNamedElementAdapter() {
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

} // gdofAdapterFactory