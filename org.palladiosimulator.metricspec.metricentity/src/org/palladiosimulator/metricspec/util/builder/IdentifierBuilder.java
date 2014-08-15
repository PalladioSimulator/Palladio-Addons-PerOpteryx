package org.palladiosimulator.metricspec.util.builder;

/**
 * <!-- begin-user-doc --> A builder for the model object '
 * <em><b>org.palladiosimulator.metricspec.Identifier</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class IdentifierBuilder implements
        org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<org.palladiosimulator.metricspec.Identifier> {
    // features and builders
    private java.lang.String m_id;
    private java.lang.String m_literal;
    private org.palladiosimulator.metricspec.TextualBaseMetricDescription m_textualBaseMetricDescription;
    private org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.TextualBaseMetricDescription> m_featureTextualBaseMetricDescriptionBuilder;
    // helper attributes
    private boolean m_featureIdSet = false;
    private boolean m_featureLiteralSet = false;
    private boolean m_featureTextualBaseMetricDescriptionSet = false;

    /**
     * Builder is not instantiated with a constructor.
     * 
     * @see #newIdentifierBuilder()
     */
    private IdentifierBuilder() {
    }

    /**
     * This method creates a new instance of the IdentifierBuilder.
     * 
     * @return new instance of the IdentifierBuilder
     */
    public static IdentifierBuilder newIdentifierBuilder() {
        return new IdentifierBuilder();
    }

    /**
     * This method creates a new instance of the IdentifierBuilder. The builder is initialized using
     * an existing '<em><b>org.palladiosimulator.metricspec.Identifier</b></em>' model object. In
     * order to avoid changes to the provided '
     * <em><b>org.palladiosimulator.metricspec.Identifier</b></em>' model object, a copy is created
     * using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
     * 
     * @param identifier
     *            The existing '<em><b>org.palladiosimulator.metricspec.Identifier</b></em>' model
     *            object to be used for the initialization of the builder
     * @return new initialized instance of the IdentifierBuilder
     */
    public static IdentifierBuilder newIdentifierBuilder(org.palladiosimulator.metricspec.Identifier p_identifier) {
        org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
        org.palladiosimulator.metricspec.Identifier _identifier = (org.palladiosimulator.metricspec.Identifier) c
                .copy(((org.palladiosimulator.metricspec.Identifier) p_identifier));
        c.copyReferences();
        IdentifierBuilder _builder = newIdentifierBuilder();
        _builder.id(_identifier.getId());
        _builder.literal(_identifier.getLiteral());
        _builder.textualBaseMetricDescription(_identifier.getTextualBaseMetricDescription());
        return _builder;
    }

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder
     * and copies the current values to it.
     */
    public IdentifierBuilder but() {
        IdentifierBuilder _builder = newIdentifierBuilder();
        _builder.m_featureIdSet = m_featureIdSet;
        _builder.m_id = m_id;
        _builder.m_featureLiteralSet = m_featureLiteralSet;
        _builder.m_literal = m_literal;
        _builder.m_featureTextualBaseMetricDescriptionSet = m_featureTextualBaseMetricDescriptionSet;
        _builder.m_textualBaseMetricDescription = m_textualBaseMetricDescription;
        _builder.m_featureTextualBaseMetricDescriptionBuilder = m_featureTextualBaseMetricDescriptionBuilder;
        return _builder;
    }

    /**
     * This method constructs the final org.palladiosimulator.metricspec.Identifier type.
     * 
     * @return new instance of the org.palladiosimulator.metricspec.Identifier type
     */
    public org.palladiosimulator.metricspec.Identifier build() {
        final org.palladiosimulator.metricspec.Identifier _newInstance = (org.palladiosimulator.metricspec.Identifier) org.palladiosimulator.metricspec.MetricSpecFactory.eINSTANCE
                .create(org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE.getIdentifier());
        if (m_featureIdSet) {
            _newInstance.setId(m_id);
        }
        if (m_featureLiteralSet) {
            _newInstance.setLiteral(m_literal);
        }
        if (m_featureTextualBaseMetricDescriptionSet) {
            _newInstance.setTextualBaseMetricDescription(m_textualBaseMetricDescription);
        } else {
            if (m_featureTextualBaseMetricDescriptionBuilder != null) {
                _newInstance.setTextualBaseMetricDescription(m_featureTextualBaseMetricDescriptionBuilder.build());
            }
        }
        return _newInstance;
    }

    public IdentifierBuilder id(java.lang.String p_id) {
        m_id = p_id;
        m_featureIdSet = true;
        return this;
    }

    public IdentifierBuilder literal(java.lang.String p_literal) {
        m_literal = p_literal;
        m_featureLiteralSet = true;
        return this;
    }

    public IdentifierBuilder textualBaseMetricDescription(
            org.palladiosimulator.metricspec.TextualBaseMetricDescription p_textualBaseMetricDescription) {
        m_textualBaseMetricDescription = p_textualBaseMetricDescription;
        m_featureTextualBaseMetricDescriptionSet = true;
        return this;
    }

    public IdentifierBuilder textualBaseMetricDescription(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.TextualBaseMetricDescription> p_textualBaseMetricDescriptionBuilder) {
        m_featureTextualBaseMetricDescriptionBuilder = p_textualBaseMetricDescriptionBuilder;
        return this;
    }
}
