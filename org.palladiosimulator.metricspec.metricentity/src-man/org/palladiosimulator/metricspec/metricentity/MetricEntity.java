package org.palladiosimulator.metricspec.metricentity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.palladiosimulator.metricspec.MetricDescription;

public class MetricEntity implements IMetricEntity {

    /**
     * The subclasses' metric
     */
    private MetricDescription metricDesciption;
    private boolean isInitialised = false;

    protected MetricEntity() {
        super();
    }

    /**
     * @param metricDesciption
     */
    public MetricEntity(final MetricDescription metricDesciption) {
        super();
        setMetricDescription(metricDesciption);
    }

    /**
     * @param metricDesciption
     */
    protected void setMetricDescription(final MetricDescription metricDesciption) {
        if (isInitialised) {
            throw new IllegalStateException("Metric description of metric entity cannot be changed after initalisation");
        }
        if (metricDesciption == null) {
            throw new IllegalArgumentException("Metric description has to be a valid instance.");
        }

        checkValidString(metricDesciption.getName());
        checkValidString(metricDesciption.getTextualDescription());
        checkValidString(metricDesciption.getId());

        this.metricDesciption = metricDesciption;
        this.metricDesciption.eAdapters().add(new AdapterImpl() {
            @Override
            public void notifyChanged(final Notification notification) {
                if (notification.getEventType() != Notification.REMOVING_ADAPTER
                        && notification.getEventType() != Notification.RESOLVE) {
                    // if (notification.getFeature() !=
                    // MetricSpecFactory.eINSTANCE.getDescription_Repository()) {
                    throw new RuntimeException("Metric description altered after initializing. This is not allowed.");
                    // }
                }
            }
        });
        isInitialised = true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.palladiosimulator.edp2.metricentity.IMetricEntity#getMetricDesciption()
     */
    @Override
    public final MetricDescription getMetricDesciption() {
        checkInitialised();
        return metricDesciption;
    }

    /**
     * 
     */
    private void checkInitialised() {
        if (!isInitialised) {
            throw new IllegalStateException("Metric description is not initialised");
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.palladiosimulator.edp2.metricentity.IMetricEntity#isCompatibleWith(org.palladiosimulator
     * .edp2.models.ExperimentData.MetricDescription)
     */
    @Override
    public final boolean isCompatibleWith(final MetricDescription other) {
        checkInitialised();
        if (this.getMetricDesciption() == other || this.metricDesciption.equals(other)) {
            return true;
        }
        return false;
    }

    private void checkValidString(final String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("Parameter must not be null or empty");
        }
    }
}
