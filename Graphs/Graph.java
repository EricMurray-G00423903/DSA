package Graphs;

import java.util.*;

public class Graph {

    Map<Integer, List<Integer>> adjacencyList;  //Create a new Map with an Integer as the Key(the number inside the node) and a List of Integers as the value(list of other nodes the key points to)
    boolean isDirected; //isDirected if its directed then Nodes only point one way, if its undirected nodes can point to anywhere and point to any number of each other

    public Graph(boolean isDirected) {  //Constructor with the isDirected boolean
        adjacencyList = new HashMap<>();    //Initialise the map to an empty hashmap
        this.isDirected = isDirected;       //Initialise the isDirected
    }

    public void addNode(int node) {

        adjacencyList.putIfAbsent(node, new ArrayList<>()); //Add a node to the hashmap if its not in the hashmap already, add the int to the key and an empty arraylist to the value

    }

    public void addEdge(int node1, int node2) {

        addNode(node1);
        addNode(node2);     //Run addNode on both passed ints to make sure theyre in the hashmap

        if (isDirected) adjacencyList.get(node1).add(node2);    //if it is directed meaning one way, add node 2 to the list of node1's 'neighbors'

        if (!isDirected) { adjacencyList.get(node1).add(node2); adjacencyList.get(node2).add(node1); }; //If its undirected then add edge both ways

    }

    public void printGraph() {

        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {      //foreach loop, for each map entry of type integer list<integer> in adjacencyList.entrySet()

            Integer node = entry.getKey();  //Get the current node value (Stored as an Integer reference type for efficiency type safety and Map takes reference types not primitives)
            List<Integer> neighbors = entry.getValue(); //Get the list of neighbors of the current entry

            System.out.println(node + " -> " + neighbors);  //Print both to screen
            
        }

    }

}
