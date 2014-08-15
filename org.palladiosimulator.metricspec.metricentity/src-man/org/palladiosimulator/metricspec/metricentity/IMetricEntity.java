package org.palladiosimulator.metricspec.metricentity;

import org.palladiosimulator.metricspec.MetricDescription;

public interface IMetricEntity {

    /**
     * @return the metricDesciption
     */
    public MetricDescription getMetricDesciption();

    /**
     * @param other
     * @return
     */
    public boolean isCompatibleWith(MetricDescription other);

}