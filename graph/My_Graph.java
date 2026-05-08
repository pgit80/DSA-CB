package graph;

import java.util.HashMap;
import java.util.HashSet;

public class My_Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> map;

    // this is a constructor to initialize an empty hashmap corresponding to all
    // vertices
    public My_Graph(int v) {
        map = new HashMap<>();
        // this loop will create our Hashmap representation
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    // this method checks if two vertices has an edge between them
    public boolean containsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    // this method checks if graph has this particular vertex or not
    public boolean containsVertex(int v1) {
        return map.containsKey(v1);
    }

    // this method counts total no. of entries in the neighbour map and then returns
    // the half of it because there are 2 entries corresponding to each edge in the
    // neighbour map.
    public int noOfEdge() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum += map.get(key).size();
        }
        return sum / 2;
    }

    // method to remove an edge
    public void removeEdge(int v1, int v2) {
        if (containsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    // method to remove vertex
    // to remove a vertex we first need to remove the connection from the
    // neighbouring vertex
    public void removeVertex(int v1) {
        // first find the neighbours of v1
        for (int v1nbrs : map.get(v1).keySet()) {
            map.get(v1nbrs).remove(v1);
        }
        // now when neighbours are deleted then delete the vertex from the map
        map.remove(v1);
    }

    // method to disply the graph
    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + "-->" + map.get(key));
        }
    }

    // method to check if at least one path exists beetween two vertices
    // we will use recursion to find at least one valid path between source and
    // destination vertex.
    // in another way we can think of making our source as destination node.
    // keep asking the neighbours to find the path recursively.
    public boolean hasPath(int src, int dst, HashSet<Integer> visited) {

        if (src == dst)
            return true;
        // we'll use set to keep track of visited nodes
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, dst, visited);
                if (ans)
                    return ans;
            }
        }
        // this below line is not needed but a good practice
        visited.remove(src);
        return false;
    }

    // method to print all path of a graph
    public void printAllPath(int src, int dst, HashSet<Integer> visited, String path){
        if (src == dst){
            System.out.println(path);
            return ;
        }
        // we'll use set to keep track of visited nodes
        visited.add(src);

        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printAllPath(nbrs , dst, visited, path+src);
            }
        }
        // this below line is not needed but a good practice
        visited.remove(src);
    }
}