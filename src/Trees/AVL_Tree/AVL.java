package Trees.AVL_Tree;

import Trees.BinaryTree.BinaryTree;

public class AVL {

    public AVL(){

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

        return balancing(node);

    }

    private Node balancing(Node node){
        if(height(node.left) - height(node.right) > 1){
            // left tree is heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // left-left case
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) < 0){
                //left-right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            // right tree is heavy
            if(height(node.right.left) - height(node.right.right) < 0){
                // right-right case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node; // if node is already balanced, there is no need to rotate it. Therefore, just return node

    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;

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


    // element traversal -->

    // (1) - Preorder :

    public void preOrder(){
        preOrder(this.root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.value + ", ");
        preOrder(node.left);
        preOrder(node.right);
    }


    // (2) - Inorder :

    public void inOrder(){
        inOrder(this.root);
    }
    private void inOrder(Node node){
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value + ", ");
        inOrder(node.right);

    }

    // (3) - Postorder :

    public void postOrder(){
        postOrder(this.root);
    }
    private void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + ", ");
    }

}

class Main{

    public static void main(String[] args) {

        AVL avlTree = new AVL();
        avlTree.insert(20);
        avlTree.insert(15);
        avlTree.insert(10);
        avlTree.insert(18);
        avlTree.insert(25);
        avlTree.insert(9);
        avlTree.insert(12);

        System.out.println(avlTree.isBalanced());
        System.out.println(avlTree.isEmpty());

        avlTree.display();

    }

}