package DFS;

import java.util.*;

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
    
        //diGraph.printGraph();
        //unDiGraph.printGraph();

        /* Test Conditions Start */
        if (graphDFSR(4, diGraph)) {
            System.out.println("Target Found in diGraph");
        }

        if (graphDFSR(5, diGraph)) {
            
        } else {
            System.out.println("Target not found in diGraph");
        }

        if (graphDFSR(8, unDiGraph)) {
            System.out.println("Target Found in unDiGraph");
        }

        if (graphDFSR(10, unDiGraph)) {

        } else {
            System.out.println("Target not found in unDiGraph");
        }
        /* Test Conditions End */

    }

    public static boolean graphDFSR(int target, Graph graph) {  // Main DFS Graph Search Method - Pass in the target to search for and the graph to traverse

        Set<Integer> visited = new HashSet<>(); //Create a new HashSet of Nodes that have been visited

        for (Integer currentNum : graph.adjacencyList.keySet()) {   //For-each Integer in the graph

            if(!visited.contains(currentNum)) { //If its not in the visited set

                if(graphDFSRHelper(currentNum, target, visited, graph)) return true;    //Pass the conditions into the helper function, return true if the helper returns true

            }
            
        }

        return false;   //Return false if not found

    }

    public static boolean graphDFSRHelper(Integer node, int target, Set<Integer> visited, Graph graph) {    //Pass in everything from the main search method

        List<Integer> neighbors = graph.adjacencyList.get(node);    //Create a list of the neighbors of the current node

        visited.add(node);  //Add the current node to the visited Set

        if(node == target) return true; //If the node is a match return true

        for (Integer currentNeighbor : neighbors) { //Iterate over all the neighbors

            if(!visited.contains(currentNeighbor)) {    //If the neighbor isnt in the visited Set

                if(graphDFSRHelper(currentNeighbor, target, visited, graph)) return true;   //Recursive call the helper function passing in the current neighbor as the node return true if it returns true

            }

        }
        
        return false;   //Return false if not found
    }
    
}
