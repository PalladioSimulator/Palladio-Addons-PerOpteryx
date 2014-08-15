package org.palladiosimulator.metricspec.util.builder;

/**
 * <!-- begin-user-doc --> A builder for the model object '
 * <em><b>org.palladiosimulator.metricspec.NumericalBaseMetricDescription</b></em>'. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class NumericalBaseMetricDescriptionBuilder
        implements
        org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<org.palladiosimulator.metricspec.NumericalBaseMetricDescription> {
    // features and builders
    private org.palladiosimulator.metricspec.CaptureType m_captureType;
    private org.palladiosimulator.metricspec.DataType m_dataType;
    private javax.measure.unit.Unit m_defaultUnit;
    private java.lang.String m_id;
    private java.lang.String m_name;
    private org.palladiosimulator.metricspec.PersistenceKindOptions m_persistenceKind;
    private org.palladiosimulator.metricspec.MetricDescriptionRepository m_repository;
    private org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescriptionRepository> m_featureRepositoryBuilder;
    private org.palladiosimulator.metricspec.Scale m_scale;
    private java.lang.String m_textualDescription;
    // helper attributes
    private boolean m_featureCaptureTypeSet = false;
    private boolean m_featureDataTypeSet = false;
    private boolean m_featureDefaultUnitSet = false;
    private boolean m_featureIdSet = false;
    private boolean m_featureNameSet = false;
    private boolean m_featurePersistenceKindSet = false;
    private boolean m_featureRepositorySet = false;
    private boolean m_featureScaleSet = false;
    private boolean m_featureTextualDescriptionSet = false;

    /**
     * Builder is not instantiated with a constructor.
     * 
     * @see #newNumericalBaseMetricDescriptionBuilder()
     */
    private NumericalBaseMetricDescriptionBuilder() {
    }

    /**
     * This method creates a new instance of the NumericalBaseMetricDescriptionBuilder.
     * 
     * @return new instance of the NumericalBaseMetricDescriptionBuilder
     */
    public static NumericalBaseMetricDescriptionBuilder newNumericalBaseMetricDescriptionBuilder() {
        return new NumericalBaseMetricDescriptionBuilder();
    }

    /**
     * This method creates a new instance of the NumericalBaseMetricDescriptionBuilder. The builder
     * is initialized using an existing '
     * <em><b>org.palladiosimulator.metricspec.NumericalBaseMetricDescription</b></em>' model
     * object. In order to avoid changes to the provided '
     * <em><b>org.palladiosimulator.metricspec.NumericalBaseMetricDescription</b></em>' model
     * object, a copy is created using <em><b>org.eclipse.emf.ecore.util.EcoreUtil.Copier</b></em>.
     * 
     * @param numericalBaseMetricDescription
     *            The existing '
     *            <em><b>org.palladiosimulator.metricspec.NumericalBaseMetricDescription</b></em>'
     *            model object to be used for the initialization of the builder
     * @return new initialized instance of the NumericalBaseMetricDescriptionBuilder
     */
    public static NumericalBaseMetricDescriptionBuilder newNumericalBaseMetricDescriptionBuilder(
            org.palladiosimulator.metricspec.NumericalBaseMetricDescription p_numericalBaseMetricDescription) {
        org.eclipse.emf.ecore.util.EcoreUtil.Copier c = new org.eclipse.emf.ecore.util.EcoreUtil.Copier();
        org.palladiosimulator.metricspec.NumericalBaseMetricDescription _numericalBaseMetricDescription = (org.palladiosimulator.metricspec.NumericalBaseMetricDescription) c
                .copy(((org.palladiosimulator.metricspec.NumericalBaseMetricDescription) p_numericalBaseMetricDescription));
        c.copyReferences();
        NumericalBaseMetricDescriptionBuilder _builder = newNumericalBaseMetricDescriptionBuilder();
        _builder.captureType(_numericalBaseMetricDescription.getCaptureType());
        _builder.dataType(_numericalBaseMetricDescription.getDataType());
        _builder.defaultUnit(_numericalBaseMetricDescription.getDefaultUnit());
        _builder.id(_numericalBaseMetricDescription.getId());
        _builder.name(_numericalBaseMetricDescription.getName());
        _builder.persistenceKind(_numericalBaseMetricDescription.getPersistenceKind());
        _builder.repository(_numericalBaseMetricDescription.getRepository());
        _builder.scale(_numericalBaseMetricDescription.getScale());
        _builder.textualDescription(_numericalBaseMetricDescription.getTextualDescription());
        return _builder;
    }

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder
     * and copies the current values to it.
     */
    public NumericalBaseMetricDescriptionBuilder but() {
        NumericalBaseMetricDescriptionBuilder _builder = newNumericalBaseMetricDescriptionBuilder();
        _builder.m_featureCaptureTypeSet = m_featureCaptureTypeSet;
        _builder.m_captureType = m_captureType;
        _builder.m_featureDataTypeSet = m_featureDataTypeSet;
        _builder.m_dataType = m_dataType;
        _builder.m_featureDefaultUnitSet = m_featureDefaultUnitSet;
        _builder.m_defaultUnit = m_defaultUnit;
        _builder.m_featureIdSet = m_featureIdSet;
        _builder.m_id = m_id;
        _builder.m_featureNameSet = m_featureNameSet;
        _builder.m_name = m_name;
        _builder.m_featurePersistenceKindSet = m_featurePersistenceKindSet;
        _builder.m_persistenceKind = m_persistenceKind;
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
     * org.palladiosimulator.metricspec.NumericalBaseMetricDescription type.
     * 
     * @return new instance of the org.palladiosimulator.metricspec.NumericalBaseMetricDescription
     *         type
     */
    public org.palladiosimulator.metricspec.NumericalBaseMetricDescription build() {
        final org.palladiosimulator.metricspec.NumericalBaseMetricDescription _newInstance = (org.palladiosimulator.metricspec.NumericalBaseMetricDescription) org.palladiosimulator.metricspec.MetricSpecFactory.eINSTANCE
                .create(org.palladiosimulator.metricspec.MetricSpecPackage.eINSTANCE
                        .getNumericalBaseMetricDescription());
        if (m_featureCaptureTypeSet) {
            _newInstance.setCaptureType(m_captureType);
        }
        if (m_featureDataTypeSet) {
            _newInstance.setDataType(m_dataType);
        }
        if (m_featureDefaultUnitSet) {
            _newInstance.setDefaultUnit(m_defaultUnit);
        }
        if (m_featureIdSet) {
            _newInstance.setId(m_id);
        }
        if (m_featureNameSet) {
            _newInstance.setName(m_name);
        }
        if (m_featurePersistenceKindSet) {
            _newInstance.setPersistenceKind(m_persistenceKind);
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
        return _newInstance;
    }

    public NumericalBaseMetricDescriptionBuilder captureType(org.palladiosimulator.metricspec.CaptureType p_captureType) {
        m_captureType = p_captureType;
        m_featureCaptureTypeSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder dataType(org.palladiosimulator.metricspec.DataType p_dataType) {
        m_dataType = p_dataType;
        m_featureDataTypeSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder defaultUnit(javax.measure.unit.Unit p_defaultUnit) {
        m_defaultUnit = p_defaultUnit;
        m_featureDefaultUnitSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder id(java.lang.String p_id) {
        m_id = p_id;
        m_featureIdSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder name(java.lang.String p_name) {
        m_name = p_name;
        m_featureNameSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder persistenceKind(
            org.palladiosimulator.metricspec.PersistenceKindOptions p_persistenceKind) {
        m_persistenceKind = p_persistenceKind;
        m_featurePersistenceKindSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder repository(
            org.palladiosimulator.metricspec.MetricDescriptionRepository p_repository) {
        m_repository = p_repository;
        m_featureRepositorySet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder repository(
            org.palladiosimulator.metricspec.util.builder.IMetricspecBuilder<? extends org.palladiosimulator.metricspec.MetricDescriptionRepository> p_metricDescriptionRepositoryBuilder) {
        m_featureRepositoryBuilder = p_metricDescriptionRepositoryBuilder;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder scale(org.palladiosimulator.metricspec.Scale p_scale) {
        m_scale = p_scale;
        m_featureScaleSet = true;
        return this;
    }

    public NumericalBaseMetricDescriptionBuilder textualDescription(java.lang.String p_textualDescription) {
        m_textualDescription = p_textualDescription;
        m_featureTextualDescriptionSet = true;
        return this;
    }
}
