package graph;

import java.util.*;

public class Prims_Algo {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_Algo(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }
    // Traversal using BFS
    // use priority queue

    public void prims(int src) {
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost - o2.cost;
            }
        });
        Set<Integer> visited = new HashSet<>();
        int totalCost=0;
        pq.add(new PrimsPair(src, src, 0));

        while (!pq.isEmpty()) {
            // remove
            PrimsPair rem = pq.remove();
            // ignore
            if (visited.contains(rem.vertex)) {
                continue;
            }
            // visited
            visited.add(rem.vertex);
            // self-work
            System.out.println(rem.toString());
            totalCost+=rem.cost;
            // neighbours
            for (int nbrs : map.get(rem.vertex).keySet()) {
                if (!visited.contains(nbrs)) {
                    pq.add(new PrimsPair(nbrs, rem.vertex, map.get(rem.vertex).get(nbrs)));
                }
            }
        }
        System.out.println(totalCost);
    }

    class PrimsPair {
        int vertex;
        int preVertex;
        int cost;

        private PrimsPair(int vertex, int preVertex, int cost) {
            this.vertex = vertex;
            this.preVertex = preVertex;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.vertex + " " + this.preVertex + " @ " + this.cost;
        }
    }
}
