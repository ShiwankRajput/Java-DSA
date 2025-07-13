package Trees.BinarySearchTree;

public class BST {

    public BST(){

    }

    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;


    // finding height -->
    public int height(Node node){
        if(node == null){
            return -1;
        }

        return node.height;
    }


    // checking if tree is empty or not -->
    public boolean isEmpty(){
        return root == null;
    }


    // checking if tree is balanced or not -->
    public boolean isBalanced(){
        return balanced(this.root);
    }

    private boolean balanced(Node node){
        if(node == null){
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }


    // display -->
    public void display(){
        display(root, "Root Node : ");
    }

    private void display(Node node, String details){

        if(node == null){
            return;
        }

        System.out.println(details + node.value);

        display(node.left, "left child of " + node.value + " : ");
        display(node.right, "right child of " + node.value + " : ");

    }


    // inserting ->
    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }
        else{
            root = insert(value, this.root);
        }
    }

    private Node insert(int value, Node node){

        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value,node.left);
        }
        else if(value > node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;

    }

    public void populate(int[] nums){
        for (int i : nums){
            this.insert(i);
        }
    }

    // if array is in sorted order than it can result in skewed tree, therefore to save tree we use this method
    public void populateSorted(int[] nums){
        populateSorted(nums,0, nums.length-1);
    }
    private void populateSorted(int[] nums, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start+end) / 2;

        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);

    }

}

class MainClass{

    public static void main(String[] args) {

        BST obj = new BST();

        int[] nums = {1,2,3,4,5,6,7,8,9};

        obj.populateSorted(nums);
        obj.display();
        System.out.println("Is Tree balanced ? " + obj.isBalanced());

        System.out.println("Tree is empty ? " + obj.isEmpty());

        System.out.println("\n");

//        obj.populate(nums);
//        obj.display();
//        System.out.println("Is Tree balanced ? " + obj.isBalanced());



    }

}
