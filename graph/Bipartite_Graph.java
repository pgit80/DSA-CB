package graph;

import java.util.*;

// same concept is used to solve the graph coloring question also
// we put different color vertices is different sets and check if there is no edge within the same  set.
public class Bipartite_Graph {
    /*
     * LC-785
     * There is an undirected graph with n nodes, where each node is numbered
     * between 0 and n - 1. You are given a 2D array graph, where graph[u] is an
     * array of nodes that node u is adjacent to. More formally, for each v in
     * graph[u], there is an undirected edge between node u and node v. The graph
     * has the following properties:
     * 
     * There are no self-edges (graph[u] does not contain u).
     * There are no parallel edges (graph[u] does not contain duplicate values).
     * If v is in graph[u], then u is in graph[v] (the graph is undirected).
     * The graph may not be connected, meaning there may be two nodes u and v such
     * that there is no path between them.
     * A graph is bipartite if the nodes can be partitioned into two independent
     * sets A and B such that every edge in the graph connects a node in set A and a
     * node in set B.
     * 
     * Return true if and only if it is bipartite.
     * 
     * How to check if a graph is bipartite (Approach)?
     * We've to check for cyclic graph for bipartite and acyclic graph for bipartite
     * differently
     * Every acyclic graph is by default bipartite.
     * 
     * So our question truns down to below checks
     * Acyclic graph- True (always bipartite) check with BFT/DFT
     * Cyclic Graph- check for cycle length
     * - if odd length- false(not bipartite)
     * - if even length- true (always bipartite)
     * ? How to check cycle length ?
     */

    public boolean isBipartite(int[][] graph) {
        HashMap<Integer, Integer> visited = new HashMap<>();
        Queue<BipartitePair> q = new LinkedList<>();
        // bft code below
        for (int src = 0; src < graph.length; src++) {
            if (visited.containsKey(src))
                continue;
            q.add(new BipartitePair(src, 0));
            while (!q.isEmpty()) {
                BipartitePair v = q.poll();
                if (visited.containsKey(v.vertex)) {
                    // check cycle here
                    if (visited.get(v.vertex) != v.distance) {
                        // if there is 2 different distances of a vertex from a particular node
                        // following 2 paths then it means that the cycle is odd length and graph can't
                        // be bipartite
                        return false;
                    } else {
                        continue;
                    }
                }
                visited.put(v.vertex, v.distance);
                for (int nbrs : graph[v.vertex]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new BipartitePair(nbrs, v.distance + 1));
                    }
                }
            }
        }
        return true;
    }

    // we are using this pair class to trace vertices and their distance
    class BipartitePair {
        int vertex;
        int distance;

        public BipartitePair(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}
