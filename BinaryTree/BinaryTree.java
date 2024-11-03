package BinaryTree;

public class BinaryTree {
    
    public TreeNode root;  //Create a new node called root

    public BinaryTree() {
        root = null;    //No value constructor it and set the root node to null
    }

    public void insert(int value) {

        TreeNode current = root;    //Use a temporary pointer node set to the root

        if(root == null) {
            root = new TreeNode(value);     //If the root is null, create a new node with the value
            return;
        }
            

        while(true) {   //Loop until we find a spot

            if(value < current.value) { //If our value is less than the current nodes value

                if(current.left == null) {  //Check to see if the left of the current node is empty

                    current.left = new TreeNode(value); //if it is create a new node at the left spot and break the loop
                    break;

                } else {
                    
                    current = current.left; //If its not null(empty) then the current pointer moves down to the left
                
                }
            }

            if(value >= current.value) {    //Same logic for the right side if the value is greater than the current node

                if(current.right == null) {

                    current.right = new TreeNode(value);    //Create new node is space found
                    break;

                } else {

                    current = current.right;    //Move pointer to right child

                }
            }
        }
    }
}
