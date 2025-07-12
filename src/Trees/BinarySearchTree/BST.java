package Trees.BinarySearchTree;

public class BST {

    public BST(){

    }

    public class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public boolean isEmpty(){
        return root == null;
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }

    // inserting an element in BST ->
    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }
        else{
            insert(value,this.root);
        }
    }

    public Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value,node.left);
        }

        if(value > node.value){
            node.right = insert(value,node.right);
        }

        // updating height of a tree
        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;  // returning root node at last recursion call
    }


    // displaying element in BST ->
    public void display(){
        display(this.root,"Root Node : ");
    }

    private void display(Node node, String details){
        if(node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "Left Child of " + node.value + " : ");
        display(node.right, "Right Child of " + node.value + " : ");

    }


    // checking if tree is balanced or not ->
    public boolean balanced(){
        return balanced(this.root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

}

class Main{

    public static void main(String[] args) {

        BST myTree = new BST();
        myTree.insert(15);
        myTree.insert(10);
        myTree.insert(18);
        myTree.insert(5);
        myTree.insert(11);
        myTree.insert(20);
        myTree.insert(8);
        myTree.insert(3);
        myTree.insert(2);
        myTree.insert(1);

        myTree.display();
        System.out.println(myTree.balanced());


    }

}
