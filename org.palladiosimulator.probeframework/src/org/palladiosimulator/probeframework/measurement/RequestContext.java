package org.palladiosimulator.probeframework.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents the execution context of a request. Normally the execution context of a
 * request is the thread which processes this request. Then the thread's id is a unique identifier
 * for this execution context.
 * <p>
 * A RequestContext simply wraps an identifier that represents the execution context clearly. The
 * thread id is such an identifier.
 * <p>
 * In order to represent a sequence of requests so that request1 spawned request2, which in turn
 * spawned request3 and so forth, a parent context can be specified by using constructor
 * {@link #RequestContext(String, RequestContext)}. In this way the execution of forks can be
 * represented.
 * 
 * @author Faber, Philipp Merkle, Sebastian Lehrig
 */
public class RequestContext {

    /** Empty request context. */
    public static final RequestContext EMPTY_REQUEST_CONTEXT = new RequestContext("");

    /** Unique identifier of the request context. */
    private String requestContextId;

    /** The parent context. */
    private final RequestContext parentContext;

    /** List of child contexts. */
    private List<RequestContext> childContexts;

    /**
     * Default constructor. Used when there is a parent context.
     * 
     * @param requestContextId
     *            The unique identifier of the request context.
     * @param parentContext
     *            The parent context of the context which is to be constructed.
     */
    public RequestContext(String requestContextId, RequestContext parentContext) {
        this.requestContextId = requestContextId;
        this.parentContext = parentContext;

        if (parentContext != null) {
            parentContext.addChildContext(this);
        }

        if (this.requestContextId == null) {
            this.requestContextId = "";
        }
    }

    /**
     * Convenience Constructor. Used when there is no parent context.
     * 
     * @param requestContextId
     *            the unique identifier of the request context
     */
    public RequestContext(String requestContextId) {
        this(requestContextId, null);
    }

    /**
     * Returns the unique identifier of the request context represented by this object.
     * 
     * @return the request context identifier
     */
    public String getRequestContextId() {
        return requestContextId;
    }

    /**
     * Getter for the parent context.
     * 
     * @return The parent context.
     */
    public RequestContext getParentContext() {
        return parentContext;
    }

    /**
     * Adds a child context to the list of contexts.
     * 
     * @param childContext
     *            The child context.
     */
    private void addChildContext(RequestContext childContext) {
        if (childContexts == null) {
            childContexts = new ArrayList<RequestContext>();
        }
        childContexts.add(childContext);
    }

    /**
     * Getter for the list of child contexts.
     * 
     * @return The list of child contexts.
     */
    public List<RequestContext> getChildContexts() {
        if (childContexts == null) {
            return null;
        }
        return Collections.unmodifiableList(childContexts);
    }

    /**
     * Appends the specified addition to the request context id and returns a new
     * {@link RequestContext} containing the extended request context id. The parent context will be
     * retained.
     * 
     * @param addition
     *            The String to append.
     * @return The modified request context.
     */
    public RequestContext append(String addition) {
        return new RequestContext(getRequestContextId() + addition, getParentContext());
    }

    /**
     * Returns the root of the request context hierarchy (i.e., the top-most parent).
     * 
     * @return The root request context.
     */
    public RequestContext rootContext() {
        RequestContext context = this;
        while (context.getParentContext() != null) {
            context = context.getParentContext();
        }
        return context;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((parentContext == null) ? 0 : parentContext.hashCode());
        result = prime * result + ((requestContextId == null) ? 0 : requestContextId.hashCode());
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof RequestContext)) {
            return false;
        }
        RequestContext other = (RequestContext) obj;
        if (parentContext == null) {
            if (other.parentContext != null) {
                return false;
            }
        } else if (!parentContext.equals(other.parentContext)) {
            return false;
        }
        if (requestContextId == null) {
            if (other.requestContextId != null) {
                return false;
            }
        } else if (!requestContextId.equals(other.requestContextId)) {
            return false;
        }
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return parentContext != null ? parentContext.toString() + " called " + "<" + requestContextId + ">" : "<"
                + requestContextId + ">";
    }

}
