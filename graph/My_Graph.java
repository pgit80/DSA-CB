package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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
    public void printAllPath(int src, int dst, HashSet<Integer> visited, String path) {
        if (src == dst) {
            System.out.println(path);
            return;
        }
        // we'll use set to keep track of visited nodes
        visited.add(src);

        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                printAllPath(nbrs, dst, visited, path + src);
            }
        }
        // this below line is not needed but a good practice
        visited.remove(src);
    }

    public boolean bfs(int src, int dst) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        // add 1 vertex to start operation
        q.add(src);
        while (!q.isEmpty()) {
            // 1. remove the current vertex from the queue
            int cv = q.remove();
            // 2. ignore if already in the set, also detects cycle
            if (visited.contains(cv)) {
                continue; // go to next iteration
            }
            // 3. mark visited
            visited.add(cv);
            // 4. self work
            if (cv == dst) {
                return true;
            }
            // 5. add the unvisited nbrs to the queue
            for (int nbrs : map.get(cv).keySet())
                if (!visited.contains(nbrs))
                    q.add(nbrs);

        }
        // after this loop there is no path
        return false;
    }

    public boolean dfs(int src, int dst) {
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        // add 1 vertex to start operation
        st.push(src);
        while (!st.isEmpty()) {
            // 1. remove the current vertex from the stack
            int cv = st.pop();
            // 2. ignore if already in the set, also detects cycle
            if (visited.contains(cv)) {
                continue; // go to next iteration
            }
            // 3. mark visited
            visited.add(cv);
            // 4. self work
            if (cv == dst) {
                return true;
            }
            // 5. add the unvisited nbrs to the stack
            for (int nbrs : map.get(cv).keySet())
                if (!visited.contains(nbrs))
                    st.push(nbrs);

        }
        // after this loop there is no path
        return false;
    }

    // breadth first traversal
    // 1. we need a list of all the vertices to start
    // because bft can encounter disconnected graphs also

    public void bft() {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        // add 1 vertex to start operation
        // we used this loop in case of disconnected graphs
        for (int cv : map.keySet()) {
            if (visited.contains(cv)) {
                continue;
            }
            q.add(cv);
            while (!q.isEmpty()) {
                // 1. remove the current vertex from the queue
                cv = q.remove();
                // 2. ignore if already in the set, also detects cycle
                if (visited.contains(cv)) {
                    continue; // go to next iteration
                }
                // 3. mark visited
                visited.add(cv);
                // 4. self work
                System.out.print(cv + "-");
                // 5. add the unvisited nbrs to the queue
                for (int nbrs : map.get(cv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        q.add(nbrs);
                    }
                }

            }
        }
        // after this loop there is no path
        System.out.println();
    }

    // depth first traersal
    public void dft(){
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        // add 1 vertex to start operation
        // we used this loop in case of disconnected graphs
        for (int cv : map.keySet()) {
            if (visited.contains(cv)) {
                continue;
            }
            st.push(cv);
            while (!st.isEmpty()) {
                // 1. remove the current vertex from the queue
                cv = st.pop();
                // 2. ignore if already in the set, also detects cycle
                if (visited.contains(cv)) {
                    continue; // go to next iteration
                }
                // 3. mark visited
                visited.add(cv);
                // 4. self work
                System.out.print(cv + "-");
                // 5. add the unvisited nbrs to the queue
                for (int nbrs : map.get(cv).keySet()) {
                    if (!visited.contains(nbrs)) {
                        st.add(nbrs);
                    }
                }

            }
        }
        // after this loop there is no path
        System.out.println();
    }
}