package BinaryTree;

public class TreeNode {

    int value;  //Value to be assigned to the node
    TreeNode left, right;   //recursive nodes for left and right

    public TreeNode(int value) {    //On new node being created assign the value to the node and create null left and right nodes(empty nodes)

        this.value = value;
        this.left = null;
        this.right = null;

    }

}