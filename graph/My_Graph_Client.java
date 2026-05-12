package graph;

import java.util.HashSet;

public class My_Graph_Client {
    public static void main(String[] args) {

        // Dijkstra mg = new Dijkstra(7);
        Prims_Algo mg = new Prims_Algo(7);
        mg.addEdge(1, 2, 2);
        mg.addEdge(1, 4, 5);
        mg.addEdge(2, 3, 3);
        mg.addEdge(4, 3, 4);
        mg.addEdge(4, 5, 7);
        mg.addEdge(5, 6, 1);
        mg.addEdge(5, 7, 6);
        mg.addEdge(6, 7, 8);
        // mg.display();
        // System.out.println(mg.hasPath(3, 70, new HashSet<>()));
        // mg.printAllPath(1, 6, new HashSet<>(), "");
        // mg.bft();
        // mg.dft();
        System.out.println("Src | Path | Cost");
        // mg.dijkstraAlgo(1);\
        mg.prims(3);
    }
}
