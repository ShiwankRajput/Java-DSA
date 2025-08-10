package Trees.Questions;

// https://leetcode.com/problems/cousins-in-binary-tree/
// 993 - Cousins in Binary Tree

import javax.swing.tree.TreeNode;

public class Cousins_in_BinaryTree {

    public static void main(String[] args) {

    }

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root == null){
            return false;
        }
        if (root.val == x && root.val == y){
            return false;
        }

        int[] x_parent = {-1};
        int x_height = heightOfNode(root, x_parent, x, 0);

        int[] y_parent = {-1};
        int y_height = heightOfNode(root, y_parent, y, 0);

        return (x_parent[0] != y_parent[0]) && (x_height == y_height);

    }

    public int heightOfNode(TreeNode node, int[] parent, int value, int height) {

        if (node == null){
            return -1;
        }

        if (node.val == value){
            return height;
        }

        parent[0] = node.val;
        int left = heightOfNode(node.left, parent, value, height + 1);

        if (left > -1){
            return left;
        }

        parent[0] = node.val;
        return heightOfNode(node.right, parent, value, height + 1);

    }

}
