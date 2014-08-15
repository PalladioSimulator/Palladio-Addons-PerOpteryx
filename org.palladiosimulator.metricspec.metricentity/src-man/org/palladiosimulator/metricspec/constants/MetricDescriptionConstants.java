package org.palladiosimulator.metricspec.constants;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.MetricSetDescription;
import org.palladiosimulator.metricspec.MetricSpecFactory;
import org.palladiosimulator.metricspec.MetricSpecPackage;

/**
 * Constant metric descriptions, commonly used by ProbeFramework.
 * 
 * TODO Let this file be generated from model. [Lehrig]
 * 
 * @author Sebastian Lehrig, Steffen Becker
 */
public final class MetricDescriptionConstants {
    private static final String PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC = "pathmap://METRIC_SPEC_MODELS/commonMetrics.metricspec";

    static {
        final MetricSpecPackage msPackage = MetricSpecPackage.eINSTANCE;
        final MetricSpecFactory msFactory = MetricSpecFactory.eINSTANCE;

        final ResourceSet resourceSet = new ResourceSetImpl();
        final Resource resource = resourceSet.createResource(URI.createURI(
                PATHMAP_METRIC_SPEC_MODELS_COMMON_METRICS_METRICSPEC, true));
        try {
            resource.load(Collections.EMPTY_MAP);
        } catch (final IOException e) {
            // TODO Auto-generated catch block. Use eclipse error log instead?
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        POINT_IN_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_NCRBos7pEeOX_4BzImuHbA");

        RESPONSE_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_6rYmYs7nEeOX_4BzImuHbA");
        RESPONSE_TIME_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_mZb3MdoLEeO-WvSDaR6unQ");

        HOLDING_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_zETOUs7pEeOX_4BzImuHbA");
        HOLDING_TIME_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_UyxagdpjEeO-WvSDaR6unQ");

        WAITING_TIME_METRIC = (BaseMetricDescription) resource.getEObject("_QWjAYs7qEeOX_4BzImuHbA");
        WAITING_TIME_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_CEIUodpkEeO-WvSDaR6unQ");

        RESOURCE_DEMAND_METRIC = (BaseMetricDescription) resource.getEObject("_eg_F0s7qEeOX_4BzImuHbA");
        RESOURCE_DEMAND_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_sefjUeJCEeO6l86uYUhhyw");

        STATE_OF_ACTIVE_RESOURCE_METRIC = (BaseMetricDescription) resource.getEObject("_paDhIs7qEeOX_4BzImuHbA");
        STATE_OF_ACTIVE_RESOURCE_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_-buIceJDEeO6l86uYUhhyw");
        OVERALL_STATE_OF_ACTIVE_RESOURCE_METRIC = (MetricSetDescription) resource.getEObject("_1dsBAeJEEeO6l86uYUhhyw");
        STATE_OF_ACTIVE_RESOURCE_OVER_TIME_METRIC = (MetricSetDescription) resource
                .getEObject("_MSlw0c7sEeOX_4BzImuHbA");

        STATE_OF_PASSIVE_RESOURCE_METRIC = (BaseMetricDescription) resource.getEObject("_x0-pks7rEeOX_4BzImuHbA");
        STATE_OF_PASSIVE_RESOURCE_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_E-GEoespEeOpcPDUs0BVCg");
        OVERALL_STATE_OF_PASSIVE_RESOURCE_METRIC = (MetricSetDescription) resource
                .getEObject("_INq_AespEeOpcPDUs0BVCg");
        STATE_OF_PASSIVE_RESOURCE_OVER_TIME_METRIC = (MetricSetDescription) resource
                .getEObject("_M_jZoespEeOpcPDUs0BVCg");

        EXECUTION_RESULT_METRIC = (BaseMetricDescription) resource.getEObject("_7Is3ss7rEeOX_4BzImuHbA");
        EXECUTION_RESULT_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_3aoZYeJFEeO6l86uYUhhyw");

        SCALABILITY_RANGE = (BaseMetricDescription) resource.getEObject("_gNxNEtBxEeONzY86HEL4JQ");
        SLOPE = (BaseMetricDescription) resource.getEObject("_Nz_HctBzEeONzY86HEL4JQ");
        SCALABILITY_SPEED = (MetricSetDescription) resource.getEObject("_kx_7UdBzEeONzY86HEL4JQ");
        USER_CAPACITY = (BaseMetricDescription) resource.getEObject("_HlBOUtB0EeONzY86HEL4JQ");
        
        NUMBER_OF_SLO_VIOLATIONS = (BaseMetricDescription) resource.getEObject("_LJJm8tB1EeONzY86HEL4JQ");
        SLO_VIOLATIONS_METRIC_TUPLE = (MetricSetDescription) resource.getEObject("_vBr7MRDZEeSp9ov4gXWqpQ");
        
        
        MEAN_TIME_TO_QUALITY_REPAIR = (BaseMetricDescription) resource.getEObject("_8m5pAtB1EeONzY86HEL4JQ");
        RESOURCE_PROVISIONING_EFFICIENCY = (BaseMetricDescription) resource.getEObject("_RjNq4tB2EeONzY86HEL4JQ");
        MARGINAL_COST = (BaseMetricDescription) resource.getEObject("_eQICYtB2EeONzY86HEL4JQ");
    }

    /** Specifies a point in time metric, e.g., to store an event time stamp. */
    public final static BaseMetricDescription POINT_IN_TIME_METRIC;

    /** Specifies a response time metric, e.g., to store the response time of operation calls. */
    public final static BaseMetricDescription RESPONSE_TIME_METRIC;

    /**
     * Specifies a (point in time, response time)-tuple, i.e., start of the operation call plus the
     * response time.
     */
    public final static MetricSetDescription RESPONSE_TIME_METRIC_TUPLE;

    /** Specifies a holding time metric, e.g., to store the time spend in a passive resource. */
    public final static BaseMetricDescription HOLDING_TIME_METRIC;

    /**
     * Specifies a (point in time, holding time)-tuple, i.e., start of the holding plus the holding
     * time.
     */
    public final static MetricSetDescription HOLDING_TIME_METRIC_TUPLE;

    /** Specifies a waiting time metric, e.g., to store the waiting time at passive resource pools. */
    public final static BaseMetricDescription WAITING_TIME_METRIC;

    /**
     * Specifies a (point in time, waiting time)-tuple, i.e., start of the waiting plus the waiting
     * time.
     */
    public final static MetricSetDescription WAITING_TIME_METRIC_TUPLE;

    /** Specifies a resource demand metric, e.g., to store CPU demand measurements. */
    public final static BaseMetricDescription RESOURCE_DEMAND_METRIC;

    /**
     * Specifies a (point in time, demand)-tuple, i.e., start of the demand plus the demand.
     */
    public final static MetricSetDescription RESOURCE_DEMAND_METRIC_TUPLE;

    /**
     * This measure represents the state of an active resource, e.g., to store CPU utilization at a
     * certain time/state.
     */
    public final static BaseMetricDescription STATE_OF_ACTIVE_RESOURCE_METRIC;

    /**
     * Specifies a (point in time, state of active resource)-tuple, i.e., the state of an active
     * resource plus the time when the state was taken.
     */
    public final static MetricSetDescription STATE_OF_ACTIVE_RESOURCE_METRIC_TUPLE;

    /**
     * Overall state of an active resource, starting from a given point in time. For example, this
     * metric allows to store the utilization of a CPU over the complete simulation time.
     */
    public final static MetricSetDescription OVERALL_STATE_OF_ACTIVE_RESOURCE_METRIC;

    /**
     * State of an active resource over time, e.g., to store the number of elements in the CPU queue
     * over time.
     */
    public final static MetricSetDescription STATE_OF_ACTIVE_RESOURCE_OVER_TIME_METRIC;

    /** Specifies a passive resource state metric. */
    public final static BaseMetricDescription STATE_OF_PASSIVE_RESOURCE_METRIC;

    /**
     * Specifies a (point in time, state of passive resource)-tuple, i.e., the state of a passive
     * resource plus the time when the state was taken.
     */
    public final static MetricSetDescription STATE_OF_PASSIVE_RESOURCE_METRIC_TUPLE;

    /**
     * Overall state of a passive resource, starting from a given point in time. For example, this
     * metric allows to store the number of connections of a connection pool over the complete
     * simulation time.
     */
    public final static MetricSetDescription OVERALL_STATE_OF_PASSIVE_RESOURCE_METRIC;

    /**
     * State of a passive resource over time, e.g., to store the number of connections in a
     * connection pool over time.
     */
    public final static MetricSetDescription STATE_OF_PASSIVE_RESOURCE_OVER_TIME_METRIC;

    /** Specifies an execution results metric, e.g., to store simulated failure occurrences. */
    public final static BaseMetricDescription EXECUTION_RESULT_METRIC;

    /**
     * Specifies a (point in time, execution result)-tuple, i.e., time of getting the execution
     * result plus the execution result itself.
     */
    public final static MetricSetDescription EXECUTION_RESULT_METRIC_TUPLE;

    /** Scalability range without violating SLOs, e.g., the system scales up to 1,000 users. */
    public final static BaseMetricDescription SCALABILITY_RANGE;

    /** The slope for increase rates, e.g., an increase rate of 10 users/hour. */
    public final static BaseMetricDescription SLOPE;

    /**
     * Scalability speed without violating SLOs, e.g., the system scales up to 1,000 users with
     * increase rate 10 users/hour.
     */
    public final static MetricSetDescription SCALABILITY_SPEED;

    /**
     * Maximal number of users for fixed resource without violating SLOs, e.g., a system scales up
     * to 1,000 users for a fixed set of resources.
     */
    public final static BaseMetricDescription USER_CAPACITY;

    /**
     * The number of SLO violations in a certain time frame, e.g., 42 SLO (response time) violations
     * in 1 hour.
     */
    public final static BaseMetricDescription NUMBER_OF_SLO_VIOLATIONS;
    
    public final static MetricSetDescription SLO_VIOLATIONS_METRIC_TUPLE;

    /** The mean time to stop violating SLOs, e.g., 30 seconds fir an additional 10 requests/hour. */
    public final static BaseMetricDescription MEAN_TIME_TO_QUALITY_REPAIR;

    /** Efficiency of provisioning resources, e.g., 10% more resources than actual resource demand. */
    public final static BaseMetricDescription RESOURCE_PROVISIONING_EFFICIENCY;

    /** Marginal cost for serving additional load, e.g., $1.00 for an additional 100 requests/hour. */
    public final static BaseMetricDescription MARGINAL_COST;

    /**
     * Private constructor to forbid instantiation.
     */
    private MetricDescriptionConstants() {
    }
}
