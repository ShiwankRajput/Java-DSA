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



}