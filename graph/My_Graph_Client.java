package graph;

import java.util.HashSet;

public class My_Graph_Client {
    public static void main(String[] args) {
        My_Graph mg = new My_Graph(7);
        mg.addEdge(1,4,6);
        mg.addEdge(1,2,10);
        mg.addEdge(2,3,7);
        mg.addEdge(3,4,5);
        mg.addEdge(4,5,1);
        mg.addEdge(5,6,4);
        mg.addEdge(7,5,2);
        mg.addEdge(6,7,3);
        mg.display();
        // System.out.println(mg.hasPath(3, 70, new HashSet<>()));
        mg.printAllPath(1, 6, new HashSet<>(), "");
    }
}
