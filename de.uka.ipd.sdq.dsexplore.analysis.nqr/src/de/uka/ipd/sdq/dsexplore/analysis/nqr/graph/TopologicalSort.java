package de.uka.ipd.sdq.dsexplore.analysis.nqr.graph;

/**
 * A linear-time algorithm for computing a topological sort of a directed acyclic graph. A
 * topological sort is an ordering of the nodes in a graph such that for each node v, all of the
 * ancestors of v appear in the ordering before v itself. Topological sorting is useful, for
 * example, when computing some function on a DAG where each node's value depends on its ancestors.
 * Running a topological sort and then visiting the nodes in the order specified by this sorted
 * order ensures that the necessary values for each node are available before the node is visited.
 * There are several algorithms for computing topological sorts. The one used here was first
 * described in "Edge-Disjoint Spanning Trees and Depth-First Search" by Robert Tarjan. The
 * algorithm is reminiscent of Kosaraju's SCC algorithm. We begin by constructing the reverse graph
 * G^{rev} from the source graph, then running a depth-first search from each node in the graph.
 * Whenever we finish expanding a node, we add it to a list of visited nodes. The intution behind
 * this algorithm is that a DFS in the reverse graph will visit every node that is an ancestor of
 * the given node before it finishes expanding out any node. Since those nodes will be added to the
 * sorted order before the expanded node, we have the desired property of the topological sort. This
 * process can be augmented to detect a cycle in the original graph. As we do the search, we'll
 * maintain a set of nodes that we have visited and a set of nodes that we have expanded. If when
 * doing the DFS we find a node that has been visited but not expanded, it means that we have
 * encountered a cycle in the graph. Moreover, if a cycle exists, we know that this will occur,
 * since the first time any node in the cycle is visited the DFS will expand out the cycle.
 *
 * @author Keith Schwarz (htiek@cs.stanford.edu)
 * @author Yves Schneider (yves.schneider@student.kit.edu)
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The Class TopologicalSort.
 */
final class TopologicalSort {

    /**
     * Explore.
     *
     * @param <T> the generic type
     * @param node the node
     * @param graph the graph
     * @param ordering the ordering
     * @param visited the visited
     * @param expanded the expanded
     */

    private static <T> void explore(final T node, final DirectedGraph<T> graph,
            final List<T> ordering, final Set<T> visited, final Set<T> expanded)
                    throws CyclicGraphException {
        /*
         * Check whether we've been here before. If so, we should stop the search.
         */
        if (visited.contains(node)) {
            /*
             * There are two cases to consider. First, if this node has already been expanded, then
             * it's already been assigned a position in the final topological sort and we don't need
             * to explore it again. However, if it hasn't been expanded, it means that we've just
             * found a node that is currently being explored, and therefore is part of a cycle. In
             * that case, we should report an error.
             */
            if (expanded.contains(node)) {
                return;
            }
            throw new CyclicGraphException(node);
        }

        /* Mark that we've been here */
        visited.add(node);

        /* Recursively explore all of the node's predecessors. */
        for (final T predecessors : graph.edgesFrom(node)) {
            explore(predecessors, graph, ordering, visited, expanded);
        }

        /*
         * Having explored all of the node's predecessors, we can now add this node to the sorted
         * ordering.
         */
        ordering.add(node);

        /* Similarly, mark that this node is done being expanded. */
        expanded.add(node);
    }

    /**
     * Sort.
     *
     * @param <T> the generic type
     * @param graph the graph
     * @return the list
     */
    static <T> List<T> sort(final DirectedGraph<T> graph) throws CyclicGraphException {
        /*
         * Maintain two structures - a set of visited nodes (so that once we've added a node to the
         * list, we don't label it again), and a list of nodes that actually holds the topological
         * ordering.
         */
        final List<T> result = new ArrayList<T>();
        final Set<T> visited = new HashSet<T>();

        /*
         * We'll also maintain a third set consisting of all nodes that have been fully expanded. If
         * the graph contains a cycle, then we can detect this by noting that a node has been
         * explored but not fully expanded.
         */
        final Set<T> expanded = new HashSet<T>();

        /* Fire off a DFS from each node in the graph. */
        for (final T node : graph) {
            explore(node, graph, result, visited, expanded);
        }

        /* Hand back the resulting ordering. */
        return result;
    }

    /**
     * Instantiates a new topological sort.
     */
    @Deprecated
    private TopologicalSort() {
        assert false;
    }
}
