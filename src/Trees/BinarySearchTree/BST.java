package Trees.BinarySearchTree;

public class BST {

    public BST() {

    }

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    // inserting an element in BST :>
    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }
        else{
            insert(value, this.root);
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

        // after adding element height increase by 1
        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;  // returning root only at last
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

    }
}
