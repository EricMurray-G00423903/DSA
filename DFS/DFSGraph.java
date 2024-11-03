package DFS;

import Graphs.Graph;

public class DFSGraph {

    public static void main(String[] args) {
        
        Graph diGraph = new Graph(true);
        Graph unDiGraph = new Graph(false);

        if (true) {     //add all nodes and edges to both graphs
            diGraph.addNode(1);
            diGraph.addNode(2);
            diGraph.addNode(3);
            diGraph.addNode(4);

            diGraph.addEdge(1, 2);
            diGraph.addEdge(1, 3);
            diGraph.addEdge(2, 4);
            diGraph.addEdge(3, 4);

            unDiGraph.addNode(5);
            unDiGraph.addNode(6);
            unDiGraph.addNode(7);
            unDiGraph.addNode(8);

            unDiGraph.addEdge(5, 6);
            unDiGraph.addEdge(5, 7);
            unDiGraph.addEdge(6, 7);
            unDiGraph.addEdge(6, 8);
            unDiGraph.addEdge(7, 8);
        }
    
        diGraph.printGraph();
        unDiGraph.printGraph();

    }

    public static boolean graphDFSR(int target) {


        return false;
    }

    public static boolean graphDFSRHelper() {
        
        return false;
    }
    
}
