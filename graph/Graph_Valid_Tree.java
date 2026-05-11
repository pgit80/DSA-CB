package graph;

import java.util.*;

public class Graph_Valid_Tree {
    /*
     * This is a premium question on leetcode. (https://leetcode.ca/all/261.html)
     * 
     * Given n nodes labeled from 0 to n-1 and a list of undirected edges (each edge
     * is a pair of nodes), write a function to check whether these edges make up a
     * valid tree.
     * 
     * Input: n = 5, and edges = [[0,1], [0,2], [0,3], [1,4]]
     * Output: true
     * 
     * Input: n = 5, and edges = [[0,1], [1,2], [2,3], [1,3], [1,4]]
     * Output: false
     * 
     * Approach:
     * - Every tree is a graph but every graph is not a tree.
     * - A tree can't have cycle but Graph has
     * - A tree can't have disconnected components but graph has.
     * 
     */

    public boolean validTree(int n, int[][] edges) {
        // we'll store neighours into this hashmap
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        // in below lines we are making an unweighted graph from the 2D edges array.
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            map.get(a).add(b);
            map.get(b).add(a);
        }
        return BFT(map);
    }

    public boolean BFT(HashMap<Integer, List<Integer>> map) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        int compCount = 0; // component count
        for (int src : map.keySet()) {
            if (visited.contains(src))
                continue;
            compCount++; // to detect more than one component
            q.add(src);
            while (!q.isEmpty()) {
                int v = q.poll();
                if (visited.contains(v)) {
                    return false; // cycle detected
                }
                visited.add(v);
                for (int nbrs : map.get(v)) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }
            }
        }
        return compCount == 1; // this tracks count of connected components
    }

}
