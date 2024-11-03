package DFS;

import java.util.*;
import BinaryTree.*;

public class DFSBasic {

    //Create a basic DFS function to traverse a BinaryTree and print all values
    public static void main(String[] args) {

        //Create a new BinaryTree
        BinaryTree myTree = new BinaryTree();
        
        //Create 20 random ints and add to the Tree
        for (int i = 0; i < 20; i++) {

            Random randomNumber = new Random();
            int currentValue = randomNumber.nextInt(100);
            myTree.insert(currentValue);
            
        }

        traverseDFSPrint(myTree.root);  //Pass in the starting node of the binary tree to begin traversing
    }

    public static void traverseDFSPrint(TreeNode root) {    //Takes a Node as a parameter

        System.out.println("Current Node Value: " + root.value);    //Print out the current node value

        if(root.left != null) {                         //If the left child of the current node isnt empty
            System.out.println("Moving Left");        //Print moving left
            traverseDFSPrint(root.left);                //Recursive Call the function and create a recursive loop with the left child
        }
        if(root.right != null) {                        //If it gets to here that means there are no more left children of the current node
            System.out.println("Moving Right");       //Print moving right
            traverseDFSPrint(root.right);               //Recursive call loop function to the right child
        }

        //If it gets to here, that means the current node has no children so this function finishes for that node
        //The function stack will then unwind and it will automatically move up to the parent and usually go down the other side of the parent until its exhausted
        //The stack will keep clearing and unwinding until there are no nodes left anywhere

    }

}
