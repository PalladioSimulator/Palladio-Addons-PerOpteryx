package org.palladiosimulator.metricspec.util.builder;

/**
 * <!-- begin-user-doc --> A builder for the model object '
 * <em><b>org.palladiosimulator.metricspec.AggregationFunctionDescription</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class AggregationFunctionDescriptionBuilder
        implements
        org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<org.palladiosimulator.metricspec.AggregationFunctionDescription> {
    // features and builders
    private java.lang.String m_id;
    private java.lang.String m_name;
    private java.lang.String m_textualDescription;
    // helper attributes
    private boolean m_featureIdSet = false;
    private boolean m_featureNameSet = false;
    private boolean m_featureTextualDescriptionSet = false;

    /**
     * Builder is not instantiated with a constructor.
     * 
     * @see #newAggregationFunctionDescriptionBuilder()
     */
    private AggregationFunctionDescriptionBuilder() {
    }

    /**
     * This method creates a new instance of the AggregationFunctionDescriptionBuilder.
     * 
     * @return new instance of the AggregationFunctionDescriptionBuilder
     */
    public static AggregationFunctionDescriptionBuilder newAggregationFunctionDescriptionBuilder() {
        return new AggregationFunctionDescriptionBuilder();
    }

    /**
     * This method creates a new instance of the AggregationFunctionDescriptionBuilder. The builder
     * is initialized using an existing '
     * <em><b>org.palladiosimulator.metricspec.AggregationFunctionDescription</b></em>' model
     * object. In order to avoid changes to the provided '
     * <em><b>org.palladiosimulator.metricspec.AggregationFunctionDescription</b></em>' model
     * object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
     * 
     * @param aggregationFunctionDescription
     *            The existing '
     *            <em><b>org.palladiosimulator.metricspec.AggregationFunctionDescription</b></em>'
     *            model object to be used for the initialization of the builder
     * @return new initialized instance of the AggregationFunctionDescriptionBuilder
     */
    public static AggregationFunctionDescriptionBuilder newAggregationFunctionDescriptionBuilder(
            org.palladiosimulator.metricspec.AggregationFunctionDescription p_aggregationFunctionDescription) {
        org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
        org.palladiosimulator.metricspec.AggregationFunctionDescription _aggregationFunctionDescription = (org.palladiosimulator.metricspec.AggregationFunctionDescription) c
                .copy(((org.palladiosimulator.metricspec.AggregationFunctionDescription) p_aggregationFunctionDescription));
        c.copyReferences();
        AggregationFunctionDescriptionBuilder _builder = newAggregationFunctionDescriptionBuilder();
        _builder.id(_aggregationFunctionDescription.getId());
        _builder.name(_aggregationFunctionDescription.getName());
        _builder.textualDescription(_aggregationFunctionDescription.getTextualDescription());
        return _builder;
    }

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder
     * and copies the current values to it.
     */
    public AggregationFunctionDescriptionBuilder but() {
        AggregationFunctionDescriptionBuilder _builder = newAggregationFunctionDescriptionBuilder();
        _builder.m_featureIdSet = m_featureIdSet;
        _builder.m_id = m_id;
        _builder.m_featureNameSet = m_featureNameSet;
        _builder.m_name = m_name;
        _builder.m_featureTextualDescriptionSet = m_featureTextualDescriptionSet;
        _builder.m_textualDescription = m_textualDescription;
        return _builder;
    }

    /**
     * This method constructs the final
     * org.palladiosimulator.metricspec.AggregationFunctionDescription type.
     * 
     * @return new instance of the org.palladiosimulator.metricspec.AggregationFunctionDescription
     *         type
     */
    public org.palladiosimulator.metricspec.AggregationFunctionDescription build() {
        final org.palladiosimulator.metricspec.AggregationFunctionDescription _newInstance = (org.palladiosimulator.metricspec.AggregationFunctionDescription) org.palladiosimulator.metricspec.MetricSpecFactory.eINSTANCE
                .create(org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE
                        .getAggregationFunctionDescription());
        if (m_featureIdSet) {
            _newInstance.setId(m_id);
        }
        if (m_featureNameSet) {
            _newInstance.setName(m_name);
        }
        if (m_featureTextualDescriptionSet) {
            _newInstance.setTextualDescription(m_textualDescription);
        }
        return _newInstance;
    }

    public AggregationFunctionDescriptionBuilder id(java.lang.String p_id) {
        m_id = p_id;
        m_featureIdSet = true;
        return this;
    }

    public AggregationFunctionDescriptionBuilder name(java.lang.String p_name) {
        m_name = p_name;
        m_featureNameSet = true;
        return this;
    }

    public AggregationFunctionDescriptionBuilder textualDescription(java.lang.String p_textualDescription) {
        m_textualDescription = p_textualDescription;
        m_featureTextualDescriptionSet = true;
        return this;
    }
}
