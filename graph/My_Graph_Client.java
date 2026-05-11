package graph;

import java.util.HashSet;

public class My_Graph_Client {
    public static void main(String[] args) {

        Dijkstra mg = new Dijkstra(7);
        mg.addEdge(1,4,2);
        mg.addEdge(1,2,4);
        mg.addEdge(2,3,5);
        mg.addEdge(3,4,1);
        mg.addEdge(4,5,6);
        mg.addEdge(5,6,11);
        mg.addEdge(7,5,1);
        mg.addEdge(6,7,3);
        // mg.display();
        // System.out.println(mg.hasPath(3, 70, new HashSet<>()));
        // mg.printAllPath(1, 6, new HashSet<>(), "");
        // mg.bft();
        // mg.dft();
        System.out.println("Src | Path | Cost");
        mg.dijkstraAlgo(1);
    }
}
