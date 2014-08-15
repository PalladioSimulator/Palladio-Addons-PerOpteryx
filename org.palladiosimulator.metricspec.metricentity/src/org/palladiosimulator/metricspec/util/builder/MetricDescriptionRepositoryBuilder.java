package org.palladiosimulator.metricspec.util.builder;

/**
 * <!-- begin-user-doc --> A builder for the model object '
 * <em><b>org.palladiosimulator.metricspec.MetricDescriptionRepository</b></em>'. <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class MetricDescriptionRepositoryBuilder
        implements
        org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<org.palladiosimulator.metricspec.MetricDescriptionRepository> {
    // features and builders
    private java.lang.String m_id;
    private java.util.Collection<org.palladiosimulator.metricspec.MetricDescription> m_metricDescriptions = new java.util.LinkedList<org.palladiosimulator.metricspec.MetricDescription>();
    private java.util.Collection<org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription>> m_featureMetricDescriptionsBuilder = new java.util.LinkedList<org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription>>();
    // helper attributes
    private boolean m_featureIdSet = false;
    private boolean m_featureMetricDescriptionsSet = false;

    /**
     * Builder is not instantiated with a constructor.
     * 
     * @see #newMetricDescriptionRepositoryBuilder()
     */
    private MetricDescriptionRepositoryBuilder() {
    }

    /**
     * This method creates a new instance of the MetricDescriptionRepositoryBuilder.
     * 
     * @return new instance of the MetricDescriptionRepositoryBuilder
     */
    public static MetricDescriptionRepositoryBuilder newMetricDescriptionRepositoryBuilder() {
        return new MetricDescriptionRepositoryBuilder();
    }

    /**
     * This method creates a new instance of the MetricDescriptionRepositoryBuilder. The builder is
     * initialized using an existing '
     * <em><b>org.palladiosimulator.metricspec.MetricDescriptionRepository</b></em>' model object.
     * In order to avoid changes to the provided '
     * <em><b>org.palladiosimulator.metricspec.MetricDescriptionRepository</b></em>' model object, a
     * copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
     * 
     * @param metricDescriptionRepository
     *            The existing '
     *            <em><b>org.palladiosimulator.metricspec.MetricDescriptionRepository</b></em>'
     *            model object to be used for the initialization of the builder
     * @return new initialized instance of the MetricDescriptionRepositoryBuilder
     */
    public static MetricDescriptionRepositoryBuilder newMetricDescriptionRepositoryBuilder(
            org.palladiosimulator.metricspec.MetricDescriptionRepository p_metricDescriptionRepository) {
        org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
        org.palladiosimulator.metricspec.MetricDescriptionRepository _metricDescriptionRepository = (org.palladiosimulator.metricspec.MetricDescriptionRepository) c
                .copy(((org.palladiosimulator.metricspec.MetricDescriptionRepository) p_metricDescriptionRepository));
        c.copyReferences();
        MetricDescriptionRepositoryBuilder _builder = newMetricDescriptionRepositoryBuilder();
        _builder.id(_metricDescriptionRepository.getId());
        if (_metricDescriptionRepository.getMetricDescriptions() != null) {
            _builder.metricDescriptions(_metricDescriptionRepository.getMetricDescriptions());
        }
        return _builder;
    }

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder
     * and copies the current values to it.
     */
    public MetricDescriptionRepositoryBuilder but() {
        MetricDescriptionRepositoryBuilder _builder = newMetricDescriptionRepositoryBuilder();
        _builder.m_featureIdSet = m_featureIdSet;
        _builder.m_id = m_id;
        _builder.m_featureMetricDescriptionsSet = m_featureMetricDescriptionsSet;
        _builder.m_metricDescriptions = m_metricDescriptions;
        _builder.m_featureMetricDescriptionsBuilder = m_featureMetricDescriptionsBuilder;
        return _builder;
    }

    /**
     * This method constructs the final org.palladiosimulator.metricspec.MetricDescriptionRepository
     * type.
     * 
     * @return new instance of the org.palladiosimulator.metricspec.MetricDescriptionRepository type
     */
    public org.palladiosimulator.metricspec.MetricDescriptionRepository build() {
        final org.palladiosimulator.metricspec.MetricDescriptionRepository _newInstance = (org.palladiosimulator.metricspec.MetricDescriptionRepository) org.palladiosimulator.metricspec.MetricSpecFactory.eINSTANCE
                .create(org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE.getMetricDescriptionRepository());
        if (m_featureIdSet) {
            _newInstance.setId(m_id);
        }
        if (m_featureMetricDescriptionsSet) {
            _newInstance.getMetricDescriptions().addAll(m_metricDescriptions);
        } else {
            if (!m_featureMetricDescriptionsBuilder.isEmpty()) {
                for (org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription> builder : m_featureMetricDescriptionsBuilder) {
                    _newInstance.getMetricDescriptions().add(builder.build());
                }
            }
        }
        return _newInstance;
    }

    public MetricDescriptionRepositoryBuilder id(java.lang.String p_id) {
        m_id = p_id;
        m_featureIdSet = true;
        return this;
    }

    public MetricDescriptionRepositoryBuilder metricDescriptions(
            org.palladiosimulator.metricspec.MetricDescription p_metricDescriptions) {
        m_metricDescriptions.add(p_metricDescriptions);
        m_featureMetricDescriptionsSet = true;
        return this;
    }

    public MetricDescriptionRepositoryBuilder metricDescriptions(
            java.util.Collection<? extends org.palladiosimulator.metricspec.MetricDescription> p_metricDescriptions) {
        m_metricDescriptions.addAll(p_metricDescriptions);
        m_featureMetricDescriptionsSet = true;
        return this;
    }

    public MetricDescriptionRepositoryBuilder metricDescriptions(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescription> p_metricDescriptionBuilder) {
        m_featureMetricDescriptionsBuilder.add(p_metricDescriptionBuilder);
        return this;
    }
}
