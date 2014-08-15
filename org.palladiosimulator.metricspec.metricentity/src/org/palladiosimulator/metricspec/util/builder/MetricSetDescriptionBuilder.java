package org.palladiosimulator.metricspec.util.builder;

/**
 * <!-- begin-user-doc --> A builder for the model object '
 * <em><b>org.palladiosimulator.metricspec.MetricSetDescription</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MetricSetDescriptionBuilder
        implements
        org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<org.palladiosimulator.metricspec.MetricSetDescription> {
    // features and builders
    private java.lang.String m_id;
    private java.lang.String m_name;
    private org.palladiosimulator.metricspec.MetricDescriptionRepository m_repository;
    private org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescriptionRepository> m_featureRepositoryBuilder;
    private java.lang.String m_textualDescription;
    private java.util.Collection<org.palladiosimulator.metricspec.MetricDescription> m_subsumedMetrics = new java.util.LinkedList<org.palladiosimulator.metricspec.MetricDescription>();
    private java.util.Collection<org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription>> m_featureSubsumedMetricsBuilder = new java.util.LinkedList<org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription>>();
    // helper attributes
    private boolean m_featureIdSet = false;
    private boolean m_featureNameSet = false;
    private boolean m_featureRepositorySet = false;
    private boolean m_featureSubsumedMetricsSet = false;
    private boolean m_featureTextualDescriptionSet = false;

    /**
     * Builder is not instantiated with a constructor.
     * 
     * @see #newMetricSetDescriptionBuilder()
     */
    private MetricSetDescriptionBuilder() {
    }

    /**
     * This method creates a new instance of the MetricSetDescriptionBuilder.
     * 
     * @return new instance of the MetricSetDescriptionBuilder
     */
    public static MetricSetDescriptionBuilder newMetricSetDescriptionBuilder() {
        return new MetricSetDescriptionBuilder();
    }

    /**
     * This method creates a new instance of the MetricSetDescriptionBuilder. The builder is
     * initialized using an existing '
     * <em><b>org.palladiosimulator.metricspec.MetricSetDescription</b></em>' model object. In order
     * to avoid changes to the provided '
     * <em><b>org.palladiosimulator.metricspec.MetricSetDescription</b></em>' model object, a copy
     * is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
     * 
     * @param metricSetDescription
     *            The existing '
     *            <em><b>org.palladiosimulator.metricspec.MetricSetDescription</b></em>' model
     *            object to be used for the initialization of the builder
     * @return new initialized instance of the MetricSetDescriptionBuilder
     */
    public static MetricSetDescriptionBuilder newMetricSetDescriptionBuilder(
            org.palladiosimulator.metricspec.MetricSetDescription p_metricSetDescription) {
        org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
        org.palladiosimulator.metricspec.MetricSetDescription _metricSetDescription = (org.palladiosimulator.metricspec.MetricSetDescription) c
                .copy(((org.palladiosimulator.metricspec.MetricSetDescription) p_metricSetDescription));
        c.copyReferences();
        MetricSetDescriptionBuilder _builder = newMetricSetDescriptionBuilder();
        _builder.id(_metricSetDescription.getId());
        _builder.name(_metricSetDescription.getName());
        _builder.repository(_metricSetDescription.getRepository());
        _builder.textualDescription(_metricSetDescription.getTextualDescription());
        if (_metricSetDescription.getSubsumedMetrics() != null) {
            _builder.subsumedMetrics(_metricSetDescription.getSubsumedMetrics());
        }
        return _builder;
    }

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder
     * and copies the current values to it.
     */
    public MetricSetDescriptionBuilder but() {
        MetricSetDescriptionBuilder _builder = newMetricSetDescriptionBuilder();
        _builder.m_featureIdSet = m_featureIdSet;
        _builder.m_id = m_id;
        _builder.m_featureNameSet = m_featureNameSet;
        _builder.m_name = m_name;
        _builder.m_featureRepositorySet = m_featureRepositorySet;
        _builder.m_repository = m_repository;
        _builder.m_featureRepositoryBuilder = m_featureRepositoryBuilder;
        _builder.m_featureSubsumedMetricsSet = m_featureSubsumedMetricsSet;
        _builder.m_subsumedMetrics = m_subsumedMetrics;
        _builder.m_featureSubsumedMetricsBuilder = m_featureSubsumedMetricsBuilder;
        _builder.m_featureTextualDescriptionSet = m_featureTextualDescriptionSet;
        _builder.m_textualDescription = m_textualDescription;
        return _builder;
    }

    /**
     * This method constructs the final org.palladiosimulator.metricspec.MetricSetDescription type.
     * 
     * @return new instance of the org.palladiosimulator.metricspec.MetricSetDescription type
     */
    public org.palladiosimulator.metricspec.MetricSetDescription build() {
        final org.palladiosimulator.metricspec.MetricSetDescription _newInstance = (org.palladiosimulator.metricspec.MetricSetDescription) org.palladiosimulator.metricspec.MetricSpecFactory.eINSTANCE
                .create(org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE.getMetricSetDescription());
        if (m_featureIdSet) {
            _newInstance.setId(m_id);
        }
        if (m_featureNameSet) {
            _newInstance.setName(m_name);
        }
        if (m_featureRepositorySet) {
            _newInstance.setRepository(m_repository);
        } else {
            if (m_featureRepositoryBuilder != null) {
                _newInstance.setRepository(m_featureRepositoryBuilder.build());
            }
        }
        if (m_featureTextualDescriptionSet) {
            _newInstance.setTextualDescription(m_textualDescription);
        }
        if (m_featureSubsumedMetricsSet) {
            _newInstance.getSubsumedMetrics().addAll(m_subsumedMetrics);
        } else {
            if (!m_featureSubsumedMetricsBuilder.isEmpty()) {
                for (org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription> builder : m_featureSubsumedMetricsBuilder) {
                    _newInstance.getSubsumedMetrics().add(builder.build());
                }
            }
        }
        return _newInstance;
    }

    public MetricSetDescriptionBuilder id(java.lang.String p_id) {
        m_id = p_id;
        m_featureIdSet = true;
        return this;
    }

    public MetricSetDescriptionBuilder name(java.lang.String p_name) {
        m_name = p_name;
        m_featureNameSet = true;
        return this;
    }

    public MetricSetDescriptionBuilder repository(
            org.palladiosimulator.metricspec.MetricDescriptionRepository p_repository) {
        m_repository = p_repository;
        m_featureRepositorySet = true;
        return this;
    }

    public MetricSetDescriptionBuilder repository(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescriptionRepository> p_metricDescriptionRepositoryBuilder) {
        m_featureRepositoryBuilder = p_metricDescriptionRepositoryBuilder;
        return this;
    }

    public MetricSetDescriptionBuilder textualDescription(java.lang.String p_textualDescription) {
        m_textualDescription = p_textualDescription;
        m_featureTextualDescriptionSet = true;
        return this;
    }

    public MetricSetDescriptionBuilder subsumedMetrics(
            org.palladiosimulator.metricspec.MetricDescription p_subsumedMetrics) {
        m_subsumedMetrics.add(p_subsumedMetrics);
        m_featureSubsumedMetricsSet = true;
        return this;
    }

    public MetricSetDescriptionBuilder subsumedMetrics(
            java.util.Collection<? extends org.palladiosimulator.metricspec.MetricDescription> p_subsumedMetrics) {
        m_subsumedMetrics.addAll(p_subsumedMetrics);
        m_featureSubsumedMetricsSet = true;
        return this;
    }

    public MetricSetDescriptionBuilder subsumedMetrics(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription> p_metricDescriptionBuilder) {
        m_featureSubsumedMetricsBuilder.add(p_metricDescriptionBuilder);
        return this;
    }
}
