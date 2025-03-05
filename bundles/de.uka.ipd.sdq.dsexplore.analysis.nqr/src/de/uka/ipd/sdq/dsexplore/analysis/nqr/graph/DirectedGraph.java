package de.uka.ipd.sdq.dsexplore.analysis.nqr.graph;

/**
 * A class representing a directed graph. Internally, the class is represented by an adjacency list.
 *
 * @author Keith Schwarz (htiek@cs.stanford.edu)
 * @author Yves Schneider (yves.schneider@student.kit.edu)
 */
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;
import org.palladiosimulator.pcm.core.composition.Connector;
import org.palladiosimulator.pcm.core.composition.impl.AssemblyConnectorImpl;
import org.palladiosimulator.pcm.core.entity.InterfaceProvidingEntity;
import org.palladiosimulator.pcm.repository.RepositoryComponent;
import org.palladiosimulator.solver.core.models.PCMInstance;

import de.uka.ipd.sdq.dsexplore.analysis.PCMPhenotype;

/**
 * The Class DirectedGraph.
 *
 * @param <T> the generic type
 */
public final class DirectedGraph<T> implements Iterable<T> {

    public static final DirectedGraph<String> createDirectedComponentGraph(final PCMPhenotype pheno) {
        final DirectedGraph<String> graph = new DirectedGraph<String>();
        for (final Connector c : pheno.getPCMInstance().getSystem().getConnectors__ComposedStructure()) {
            if ((c != null) && (c instanceof AssemblyConnectorImpl)) {
                final AssemblyConnectorImpl ac = (AssemblyConnectorImpl) c;
                graph.addEdge(
                        ac.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext()
                                .getId(),
                        ac.basicGetProvidingAssemblyContext_AssemblyConnector()
                                .getEncapsulatedComponent__AssemblyContext().getId());
            }
        }
        return graph;
    }

    /**
     * TODO
     *
     * @param pheno
     * @param interfaceProvidingEntity
     * @return
     */
    public static final DirectedGraph<String> createDirectedComponentGraph(final PCMPhenotype pheno,
            final InterfaceProvidingEntity interfaceProvidingEntity) {
        final DirectedGraph<String> graph = new DirectedGraph<String>();
        for (final Connector c : pheno.getPCMInstance().getSystem().getConnectors__ComposedStructure()) {
            if ((c != null) && (c instanceof AssemblyConnectorImpl)) {
                final AssemblyConnectorImpl ac = (AssemblyConnectorImpl) c;
                graph.addEdge(
                        ac.getRequiringAssemblyContext_AssemblyConnector().getEncapsulatedComponent__AssemblyContext()
                                .getId(),
                        ac.basicGetProvidingAssemblyContext_AssemblyConnector()
                                .getEncapsulatedComponent__AssemblyContext().getId());
            }
        }
        return graph;
    }

    /** The graph. */
    private final Map<T, Set<T>> graph = new HashMap<T, Set<T>>();

    /**
     * Adds the edge.
     *
     * @param start the start
     * @param end the dest
     */
    public boolean addEdge(final T start, final T end) {
        /* If both endpoints are null, don't do anything. */
        if ((start == null) || (end == null)) {
            return false;
        }

        /* Confirm both endpoints exist. */
        addNode(start);
        addNode(end);

        /* Add the edge. */
        graph.get(start).add(end);
        assert edgeExists(start, end);
        return true;
    }

    /**
     * Adds the node.
     *
     * @param node the node
     * @return true, if successful
     */
    public boolean addNode(final T node) {
        /* If the node is null, don't do anything. */
        if (node == null) {
            return false;
        }

        /* If the node already exists, don't do anything. */
        if (graph.containsKey(node)) {
            return false;
        }

        /* Otherwise, add the node with an empty set of outgoing edges. */
        graph.put(node, new HashSet<T>());
        assert nodeExists(node);
        return true;
    }

    public void clear() {
        graph.clear();
        assert isEmpty();
    }

    /**
     * Edge exists.
     *
     * @param start the start
     * @param end the end
     * @return true, if successful
     */
    public boolean edgeExists(final T start, final T end) {
        /* Confirm both endpoints exist. */
        return nodeExists(start) && nodeExists(end) && graph.get(start).contains(end);
    }

    /**
     * Edges from.
     *
     * @param node the node
     * @return the sets the
     */
    public Set<T> edgesFrom(final T node) {
        /* Check that the node exists. */
        final Set<T> edges = graph.get(node);
        if (edges != null) {
            return Collections.unmodifiableSet(edges);
        }
        return Collections.unmodifiableSet(new HashSet<T>());
    }

    @Override
    public boolean equals(final Object obj) {
        return (obj != null) && (getClass() == obj.getClass()) && (graph.equals(((DirectedGraph<?>) obj).graph));
    }

    public List<T> getTopologicalSort() throws CyclicGraphException {
        return TopologicalSort.sort(this);
    }

    @Override
    public int hashCode() {
        return graph.hashCode();
    }

    /**
     * Checks if is empty.
     *
     * @return true, if is empty
     */
    public boolean isEmpty() {
        return graph.isEmpty();
    }

    /**
     * Returns an iterator that can traverse the nodes in the graph.
     *
     * @return An iterator that traverses the nodes in the graph.
     */
    @Override
    public Iterator<T> iterator() {
        return graph.keySet().iterator();
    }

    /**
     * Node exists.
     *
     * @param node the node
     * @return true, if successful
     */
    public boolean nodeExists(final T node) {
        return graph.containsKey(node);
    }

    /**
     * Size.
     *
     * @return the int
     */
    public int size() {
        return graph.size();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (final T key : graph.keySet()) {
            builder.append(key.toString()).append("->");
            final StringJoiner joiner = new StringJoiner(",", "(", ")");
            for (final T node : graph.get(key)) {
                joiner.add(node.toString());
            }
            builder.append(joiner.toString()).append(System.lineSeparator());
        }
        return builder.toString();
    }

}
