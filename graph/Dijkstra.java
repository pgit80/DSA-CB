package graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Dijkstra {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public void dijkstraAlgo(int src) {
        // we'll use custom comparator logic to compare the cost in the dijkstra pair
        PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
            @Override
            public int compare(DijkstraPair o1, DijkstraPair o2){
                // we're writing this line to compare the cost of two dijkstra pairs.
                return o1.cost-o2.cost;
            }
        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new DijkstraPair(src, ""+src, 0));
        while(!pq.isEmpty()){
            //1. remove from pq
            DijkstraPair rdp = pq.remove();// rdp-> remove dijkstra pair
            //2. ignore
            if(visited.contains(rdp.vertex)){
                continue;
            }
            //3. add to visited
            visited.add(rdp.vertex);
            //4. self work
            System.out.println(rdp.toString());
            //5. find neighbours and add to pq
            for(int nbrs: map.get(rdp.vertex).keySet()){
                if(!visited.contains(nbrs)){
                    pq.add(new DijkstraPair(nbrs, rdp.path+nbrs, rdp.cost+map.get(rdp.vertex).get(nbrs)));
                }
            }
        }
    }

    class DijkstraPair {
        int vertex;
        String path;
        int cost;

        public DijkstraPair(int vertex, String path, int cost) {
            this.vertex = vertex;
            this.path = path;
            this.cost = cost;
        }
        // we're here overriding default toString method to print our dijkstra pair to print the ans.
        @Override
        public String toString(){
            return this.vertex+" "+this.path+" @ "+this.cost;
        }
    }
}
