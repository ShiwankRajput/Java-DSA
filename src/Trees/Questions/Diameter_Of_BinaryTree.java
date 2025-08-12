package Trees.Questions;

// https://leetcode.com/problems/diameter-of-binary-tree/description/
// 543 -> Diameter of Binary Tree :

import javax.swing.tree.TreeNode;

public class Diameter_Of_BinaryTree {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root){

        height(root);

        return diameter;

    }

    public int height(TreeNode node){

        if (node == null){
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter,dia);

        return Math.max(leftHeight,rightHeight) + 1;

    }

}
