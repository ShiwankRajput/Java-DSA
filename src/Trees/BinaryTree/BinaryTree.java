package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    // insert elements ->
    public void populate(Scanner input){
        System.out.println("Enter the root node value : ");
        root = new Node(input.nextInt());
        populate(input, root);
    }

    private void populate(Scanner input, Node node){
        System.out.println("Do you want ot enter to left of : " + node.value);
        boolean left = input.nextBoolean();
        if(left){
            System.out.println("Enter the value of left node : ");
            int value = input.nextInt();
            node.left = new Node(value);
            populate(input,node.left);
        }

        System.out.println("Do you want to enter to right of :" + node.value);
        boolean right = input.nextBoolean();
        if(right){
            System.out.println("Enter the value of right node : ");
            int value = input.nextInt();
            node.right = new Node(value);
            populate(input,node.right);
        }
    }


    // display elements -->
    public void display(){
        display(this.root, "");
    }

    private void display(Node node, String indent){
        if(node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent+"\t");
        display(node.right, indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(this.root, 0);
    }

    private void prettyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        prettyDisplay(node.right, level+1);
        for (int i=0; i<level; i++){
            System.out.print("\t");
        }
        System.out.println("| " + node.value);

        prettyDisplay(node.left, level+1);
    }

}

class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BinaryTree BT = new BinaryTree();
        BT.populate(input);
        BT.display();
        System.out.print("\n\n\n");
        BT.prettyDisplay();



    }

}