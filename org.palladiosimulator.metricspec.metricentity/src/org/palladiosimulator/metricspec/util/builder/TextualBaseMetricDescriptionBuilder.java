package org.palladiosimulator.metricspec.util.builder;

/**
 * <!-- begin-user-doc --> A builder for the model object '
 * <em><b>org.palladiosimulator.metricspec.TextualBaseMetricDescription</b></em>'. <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class TextualBaseMetricDescriptionBuilder
        implements
        org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<org.palladiosimulator.metricspec.TextualBaseMetricDescription> {
    // features and builders
    private org.palladiosimulator.metricspec.CaptureType m_captureType;
    private org.palladiosimulator.metricspec.DataType m_dataType;
    private java.lang.String m_id;
    private java.lang.String m_name;
    private org.palladiosimulator.metricspec.MetricDescriptionRepository m_repository;
    private org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescriptionRepository> m_featureRepositoryBuilder;
    private org.palladiosimulator.metricspec.Scale m_scale;
    private java.lang.String m_textualDescription;
    private java.util.Collection<org.palladiosimulator.metricspec.Identifier> m_identifiers = new java.util.LinkedList<org.palladiosimulator.metricspec.Identifier>();
    private java.util.Collection<org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.Identifier>> m_featureIdentifiersBuilder = new java.util.LinkedList<org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.Identifier>>();
    // helper attributes
    private boolean m_featureCaptureTypeSet = false;
    private boolean m_featureDataTypeSet = false;
    private boolean m_featureIdSet = false;
    private boolean m_featureIdentifiersSet = false;
    private boolean m_featureNameSet = false;
    private boolean m_featureRepositorySet = false;
    private boolean m_featureScaleSet = false;
    private boolean m_featureTextualDescriptionSet = false;

    /**
     * Builder is not instantiated with a constructor.
     * 
     * @see #newTextualBaseMetricDescriptionBuilder()
     */
    private TextualBaseMetricDescriptionBuilder() {
    }

    /**
     * This method creates a new instance of the TextualBaseMetricDescriptionBuilder.
     * 
     * @return new instance of the TextualBaseMetricDescriptionBuilder
     */
    public static TextualBaseMetricDescriptionBuilder newTextualBaseMetricDescriptionBuilder() {
        return new TextualBaseMetricDescriptionBuilder();
    }

    /**
     * This method creates a new instance of the TextualBaseMetricDescriptionBuilder. The builder is
     * initialized using an existing '
     * <em><b>org.palladiosimulator.metricspec.TextualBaseMetricDescription</b></em>' model object.
     * In order to avoid changes to the provided '
     * <em><b>org.palladiosimulator.metricspec.TextualBaseMetricDescription</b></em>' model object,
     * a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
     * 
     * @param textualBaseMetricDescription
     *            The existing '
     *            <em><b>org.palladiosimulator.metricspec.TextualBaseMetricDescription</b></em>'
     *            model object to be used for the initialization of the builder
     * @return new initialized instance of the TextualBaseMetricDescriptionBuilder
     */
    public static TextualBaseMetricDescriptionBuilder newTextualBaseMetricDescriptionBuilder(
            org.palladiosimulator.metricspec.TextualBaseMetricDescription p_textualBaseMetricDescription) {
        org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
        org.palladiosimulator.metricspec.TextualBaseMetricDescription _textualBaseMetricDescription = (org.palladiosimulator.metricspec.TextualBaseMetricDescription) c
                .copy(((org.palladiosimulator.metricspec.TextualBaseMetricDescription) p_textualBaseMetricDescription));
        c.copyReferences();
        TextualBaseMetricDescriptionBuilder _builder = newTextualBaseMetricDescriptionBuilder();
        _builder.captureType(_textualBaseMetricDescription.getCaptureType());
        _builder.dataType(_textualBaseMetricDescription.getDataType());
        _builder.id(_textualBaseMetricDescription.getId());
        _builder.name(_textualBaseMetricDescription.getName());
        _builder.repository(_textualBaseMetricDescription.getRepository());
        _builder.scale(_textualBaseMetricDescription.getScale());
        _builder.textualDescription(_textualBaseMetricDescription.getTextualDescription());
        if (_textualBaseMetricDescription.getIdentifiers() != null) {
            _builder.identifiers(_textualBaseMetricDescription.getIdentifiers());
        }
        return _builder;
    }

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder
     * and copies the current values to it.
     */
    public TextualBaseMetricDescriptionBuilder but() {
        TextualBaseMetricDescriptionBuilder _builder = newTextualBaseMetricDescriptionBuilder();
        _builder.m_featureCaptureTypeSet = m_featureCaptureTypeSet;
        _builder.m_captureType = m_captureType;
        _builder.m_featureDataTypeSet = m_featureDataTypeSet;
        _builder.m_dataType = m_dataType;
        _builder.m_featureIdSet = m_featureIdSet;
        _builder.m_id = m_id;
        _builder.m_featureIdentifiersSet = m_featureIdentifiersSet;
        _builder.m_identifiers = m_identifiers;
        _builder.m_featureIdentifiersBuilder = m_featureIdentifiersBuilder;
        _builder.m_featureNameSet = m_featureNameSet;
        _builder.m_name = m_name;
        _builder.m_featureRepositorySet = m_featureRepositorySet;
        _builder.m_repository = m_repository;
        _builder.m_featureRepositoryBuilder = m_featureRepositoryBuilder;
        _builder.m_featureScaleSet = m_featureScaleSet;
        _builder.m_scale = m_scale;
        _builder.m_featureTextualDescriptionSet = m_featureTextualDescriptionSet;
        _builder.m_textualDescription = m_textualDescription;
        return _builder;
    }

    /**
     * This method constructs the final
     * org.palladiosimulator.metricspec.TextualBaseMetricDescription type.
     * 
     * @return new instance of the org.palladiosimulator.metricspec.TextualBaseMetricDescription
     *         type
     */
    public org.palladiosimulator.metricspec.TextualBaseMetricDescription build() {
        final org.palladiosimulator.metricspec.TextualBaseMetricDescription _newInstance = (org.palladiosimulator.metricspec.TextualBaseMetricDescription) org.palladiosimulator.metricspec.MetricSpecFactory.eINSTANCE
                .create(org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE.getTextualBaseMetricDescription());
        if (m_featureCaptureTypeSet) {
            _newInstance.setCaptureType(m_captureType);
        }
        if (m_featureDataTypeSet) {
            _newInstance.setDataType(m_dataType);
        }
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
        if (m_featureScaleSet) {
            _newInstance.setScale(m_scale);
        }
        if (m_featureTextualDescriptionSet) {
            _newInstance.setTextualDescription(m_textualDescription);
        }
        if (m_featureIdentifiersSet) {
            _newInstance.getIdentifiers().addAll(m_identifiers);
        } else {
            if (!m_featureIdentifiersBuilder.isEmpty()) {
                for (org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.Identifier> builder : m_featureIdentifiersBuilder) {
                    _newInstance.getIdentifiers().add(builder.build());
                }
            }
        }
        return _newInstance;
    }

    public TextualBaseMetricDescriptionBuilder captureType(org.palladiosimulator.metricspec.CaptureType p_captureType) {
        m_captureType = p_captureType;
        m_featureCaptureTypeSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder dataType(org.palladiosimulator.metricspec.DataType p_dataType) {
        m_dataType = p_dataType;
        m_featureDataTypeSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder id(java.lang.String p_id) {
        m_id = p_id;
        m_featureIdSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder name(java.lang.String p_name) {
        m_name = p_name;
        m_featureNameSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder repository(
            org.palladiosimulator.metricspec.MetricDescriptionRepository p_repository) {
        m_repository = p_repository;
        m_featureRepositorySet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder repository(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescriptionRepository> p_metricDescriptionRepositoryBuilder) {
        m_featureRepositoryBuilder = p_metricDescriptionRepositoryBuilder;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder scale(org.palladiosimulator.metricspec.Scale p_scale) {
        m_scale = p_scale;
        m_featureScaleSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder textualDescription(java.lang.String p_textualDescription) {
        m_textualDescription = p_textualDescription;
        m_featureTextualDescriptionSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder identifiers(org.palladiosimulator.metricspec.Identifier p_identifiers) {
        m_identifiers.add(p_identifiers);
        m_featureIdentifiersSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder identifiers(
            java.util.Collection<? extends org.palladiosimulator.metricspec.Identifier> p_identifiers) {
        m_identifiers.addAll(p_identifiers);
        m_featureIdentifiersSet = true;
        return this;
    }

    public TextualBaseMetricDescriptionBuilder identifiers(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.Identifier> p_identifierBuilder) {
        m_featureIdentifiersBuilder.add(p_identifierBuilder);
        return this;
    }
}
